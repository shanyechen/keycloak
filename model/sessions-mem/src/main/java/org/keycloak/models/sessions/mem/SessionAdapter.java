package org.keycloak.models.sessions.mem;

import org.keycloak.models.sessions.Session;

import java.util.LinkedList;
import java.util.List;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class SessionAdapter implements Session {

    private String realm;
    private String id;
    private String user;
    private String ipAddress;
    private int started;
    private int lastSessionRefresh;
    private List<String> clients = new LinkedList<String>();

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getStarted() {
        return started;
    }

    public void setStarted(int started) {
        this.started = started;
    }

    public int getLastSessionRefresh() {
        return lastSessionRefresh;
    }

    public void setLastSessionRefresh(int lastSessionRefresh) {
        this.lastSessionRefresh = lastSessionRefresh;
    }

    @Override
    public void associateClient(String client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    @Override
    public List<String> getClientAssociations() {
        return clients;
    }

    @Override
    public void removeAssociatedClient(String client) {
        clients.remove(client);
    }

}