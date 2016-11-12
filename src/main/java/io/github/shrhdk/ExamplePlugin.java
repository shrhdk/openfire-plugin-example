package io.github.shrhdk;

import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;
import org.xmpp.component.ComponentManager;
import org.xmpp.component.ComponentManagerFactory;

import java.io.File;

public class ExamplePlugin implements Plugin {
    private static final String SUB_DOMAIN = "example";

    private ComponentManager componentManager;

    @Override
    public void initializePlugin(PluginManager pluginManager, File file) {
        XMPPServer server = XMPPServer.getInstance();
        componentManager = ComponentManagerFactory.getComponentManager();
        try {
            componentManager.addComponent(SUB_DOMAIN, new ExampleComponent());
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    @Override
    public void destroyPlugin() {
        try {
            componentManager.removeComponent(SUB_DOMAIN);
        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            componentManager = null;
        }
    }
}
