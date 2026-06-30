package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
final class ManagerImplLoader extends ut5.e {
    private static final java.lang.String MANAGER_FACTORY_CLASS_NAME = "com.tencent.shadow.dynamic.impl.ManagerFactoryImpl";
    private static final java.lang.String[] REMOTE_PLUGIN_MANAGER_INTERFACES = {"com.tencent.shadow.core.common", "com.tencent.shadow.dynamic.host"};
    private final android.content.Context applicationContext;
    private final com.tencent.shadow.core.common.InstalledApk installedApk;

    public ManagerImplLoader(android.content.Context context, java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        this.applicationContext = context.getApplicationContext();
        this.installedApk = new com.tencent.shadow.core.common.InstalledApk(absolutePath, (java.lang.String) null, absolutePath + "!/lib/arm64-v8a");
    }

    @Override // ut5.e
    public java.lang.String[] getCustomWhiteList() {
        return REMOTE_PLUGIN_MANAGER_INTERFACES;
    }

    public com.tencent.shadow.dynamic.host.PluginManagerImpl load() {
        try {
            com.tencent.shadow.core.common.InstalledApk installedApk = this.installedApk;
            ut5.b a17 = ut5.b.a(installedApk, loadWhiteList(installedApk), null);
            try {
                return ((com.tencent.shadow.dynamic.host.ManagerFactory) com.tencent.shadow.dynamic.host.ManagerFactory.class.cast(a17.loadClass(MANAGER_FACTORY_CLASS_NAME).newInstance())).buildManager(new ut5.c(this.applicationContext, this.installedApk.apkFilePath, a17), this.installedApk);
            } catch (java.lang.ClassCastException e17) {
                e = e17;
                throw new java.lang.Exception(e);
            } catch (java.lang.ClassNotFoundException e18) {
                e = e18;
                throw new java.lang.Exception(e);
            } catch (java.lang.IllegalAccessException e19) {
                e = e19;
                throw new java.lang.Exception(e);
            } catch (java.lang.InstantiationException e27) {
                e = e27;
                throw new java.lang.Exception(e);
            }
        } catch (java.lang.Exception e28) {
            throw new java.lang.RuntimeException(e28);
        }
    }
}
