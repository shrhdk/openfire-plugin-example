package io.github.shrhdk;

import org.xmpp.component.Component;
import org.xmpp.component.ComponentException;
import org.xmpp.component.ComponentManager;
import org.xmpp.packet.JID;
import org.xmpp.packet.Packet;

public class ExampleComponent implements Component {
    @Override
    public String getName() {
        return "ExampleComponent";
    }

    @Override
    public String getDescription() {
        return "ExampleComponent is just a example.";
    }

    @Override
    public void processPacket(Packet packet) {
        System.out.println(packet);
    }

    @Override
    public void initialize(JID jid, ComponentManager componentManager) throws ComponentException {
        System.out.print("ExampleComponent initialzie, JID: " + jid);
    }

    @Override
    public void start() {

    }

    @Override
    public void shutdown() {

    }
}
