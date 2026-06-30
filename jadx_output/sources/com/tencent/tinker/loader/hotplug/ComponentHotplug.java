package com.tencent.tinker.loader.hotplug;

/* loaded from: classes13.dex */
public final class ComponentHotplug {
    private static final java.lang.String TAG = "Tinker.ComponentHotplug";
    private static com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor sAMSInterceptor;
    private static volatile boolean sInstalled;
    private static com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor sMHMessageInterceptor;
    private static com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor sPMSInterceptor;
    private static com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation sTinkerHackInstrumentation;

    private ComponentHotplug() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static synchronized void ensureComponentHotplugInstalled(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication) {
        synchronized (com.tencent.tinker.loader.hotplug.ComponentHotplug.class) {
            if (sInstalled) {
                try {
                    sAMSInterceptor.install();
                    sPMSInterceptor.install();
                    if (android.os.Build.VERSION.SDK_INT < 27) {
                        sMHMessageInterceptor.install();
                    } else {
                        sTinkerHackInstrumentation.install();
                    }
                } catch (java.lang.Throwable th6) {
                    uninstall();
                    throw new com.tencent.tinker.loader.hotplug.UnsupportedEnvironmentException(th6);
                }
            } else {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "method install() is not invoked, ignore ensuring operations.", new java.lang.Object[0]);
            }
        }
    }

    private static android.os.Handler fetchMHInstance(android.content.Context context) {
        java.lang.Object activityThread = com.tencent.tinker.loader.shareutil.ShareReflectUtil.getActivityThread(context, null);
        if (activityThread == null) {
            throw new java.lang.IllegalStateException("failed to fetch instance of ActivityThread.");
        }
        try {
            return (android.os.Handler) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(activityThread, "mH").get(activityThread);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.IllegalStateException(th6);
        }
    }

    public static synchronized void install(com.tencent.tinker.loader.app.TinkerApplication tinkerApplication, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck) {
        synchronized (com.tencent.tinker.loader.hotplug.ComponentHotplug.class) {
            if (!sInstalled) {
                try {
                    if (com.tencent.tinker.loader.hotplug.IncrementComponentManager.init(tinkerApplication, shareSecurityCheck)) {
                        sAMSInterceptor = new com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor(tinkerApplication, com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, new com.tencent.tinker.loader.hotplug.handler.AMSInterceptHandler(tinkerApplication));
                        sPMSInterceptor = new com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor(tinkerApplication, "package", new com.tencent.tinker.loader.hotplug.handler.PMSInterceptHandler());
                        sAMSInterceptor.install();
                        sPMSInterceptor.install();
                        if (android.os.Build.VERSION.SDK_INT < 27) {
                            com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor handlerMessageInterceptor = new com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor(fetchMHInstance(tinkerApplication), new com.tencent.tinker.loader.hotplug.handler.MHMessageHandler(tinkerApplication));
                            sMHMessageInterceptor = handlerMessageInterceptor;
                            handlerMessageInterceptor.install();
                        } else {
                            com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation create = com.tencent.tinker.loader.hotplug.interceptor.TinkerHackInstrumentation.create(tinkerApplication);
                            sTinkerHackInstrumentation = create;
                            create.install();
                        }
                        sInstalled = true;
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "installed successfully.", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th6) {
                    uninstall();
                    throw new com.tencent.tinker.loader.hotplug.UnsupportedEnvironmentException(th6);
                }
            }
        }
    }

    public static synchronized void uninstall() {
        synchronized (com.tencent.tinker.loader.hotplug.ComponentHotplug.class) {
            if (sInstalled) {
                try {
                    sAMSInterceptor.uninstall();
                    sPMSInterceptor.uninstall();
                    if (android.os.Build.VERSION.SDK_INT < 27) {
                        sMHMessageInterceptor.uninstall();
                    } else {
                        sTinkerHackInstrumentation.uninstall();
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "exception when uninstall.", th6);
                }
                sInstalled = false;
            }
        }
    }
}
