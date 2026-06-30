package com.tencent.shadow.dynamic.host;

/* loaded from: classes16.dex */
public final class DynamicPluginManager implements com.tencent.shadow.dynamic.host.PluginManager {
    private java.io.File mFile;
    private com.tencent.shadow.dynamic.host.PluginManagerImpl mManagerImpl;

    public DynamicPluginManager(java.io.File file) {
        this.mFile = file;
    }

    public void exit() {
        com.tencent.shadow.dynamic.host.PluginManagerImpl pluginManagerImpl = this.mManagerImpl;
        if (pluginManagerImpl != null) {
            pluginManagerImpl.onDestroy();
        }
    }

    public java.io.File getFile() {
        return this.mFile;
    }

    public boolean isValid() {
        com.tencent.shadow.dynamic.host.PluginManagerImpl pluginManagerImpl = this.mManagerImpl;
        if (pluginManagerImpl == null) {
            return false;
        }
        return pluginManagerImpl.isValid();
    }

    public void loadManagerIfNeeded(android.content.Context context) {
        com.tencent.shadow.dynamic.host.PluginManagerImpl pluginManagerImpl = this.mManagerImpl;
        if (pluginManagerImpl != null) {
            pluginManagerImpl.onCreate(null);
            return;
        }
        com.tencent.shadow.dynamic.host.PluginManagerImpl load = new com.tencent.shadow.dynamic.host.ManagerImplLoader(context, this.mFile).load();
        load.onCreate(null);
        this.mManagerImpl = load;
    }

    @Override // com.tencent.shadow.dynamic.host.PluginManager
    public void process(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, com.tencent.shadow.dynamic.host.EnterCallback enterCallback) {
        com.tencent.shadow.dynamic.host.PluginManagerImpl pluginManagerImpl = this.mManagerImpl;
        if (pluginManagerImpl == null) {
            enterCallback.onComplete(new com.tencent.shadow.dynamic.host.ErrorInfo(1008, "mManagerImpl is null"), null);
        } else {
            pluginManagerImpl.process(context, str, map, enterCallback);
        }
    }
}
