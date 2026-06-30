package com.tencent.shadow.dynamic.host;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class LoaderImplLoader extends ut5.e {
    private static final java.lang.String[] sInterfaces = {"com.tencent.shadow.core.runtime.container", "com.tencent.shadow.dynamic.host", "com.tencent.shadow.core.common"};
    private static final java.lang.String sLoaderFactoryImplClassName = "com.tencent.shadow.dynamic.loader.impl.LoaderFactoryImpl";

    @Override // ut5.e
    public java.lang.String[] getCustomWhiteList() {
        return sInterfaces;
    }

    public com.tencent.shadow.dynamic.host.PluginLoaderImpl load(com.tencent.shadow.core.common.InstalledApk installedApk, java.lang.String str, android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            return ((com.tencent.shadow.dynamic.host.LoaderFactory) com.tencent.shadow.dynamic.host.LoaderFactory.class.cast(ut5.b.a(installedApk, loadWhiteList(installedApk), parcelFileDescriptor).loadClass(sLoaderFactoryImplClassName).newInstance())).buildLoader(installedApk, str, context);
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            throw new java.lang.Exception(e17);
        }
    }
}
