package org.chromium.net.impl;

@org.chromium.base.annotations.JNINamespace("cronet")
/* loaded from: classes13.dex */
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String LOG_FLAG_NAME = "Cronet_log_me";
    private static org.chromium.net.httpflags.ResolvedFlags sHttpFlags;
    private static volatile boolean sInitThreadInitDone;
    private static volatile boolean sLibraryLoaded;
    private byte _hellAccFlag_;
    private static final java.lang.Object sLoadLock = new java.lang.Object();
    private static final java.lang.String LIBRARY_NAME = "cronet." + org.chromium.net.impl.ImplVersion.getCronetVersion();
    public static final java.lang.String TAG = "CronetLibraryLoader";
    private static final android.os.HandlerThread sInitThread = new android.os.HandlerThread("CronetInit");
    private static final android.os.ConditionVariable sWaitForLibLoad = new android.os.ConditionVariable();
    private static final android.os.ConditionVariable sHttpFlagsLoaded = new android.os.ConditionVariable();

    /* loaded from: classes13.dex */
    public interface Natives {
        void cronetInitOnInitThread();

        java.lang.String getCronetVersion();

        void setMinLogLevel(int i17);
    }

    public static void ensureInitialized(android.content.Context context, org.chromium.net.impl.CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (sLoadLock) {
            if (!sInitThreadInitDone) {
                org.chromium.base.ContextUtils.initApplicationContext(context);
                android.os.HandlerThread handlerThread = sInitThread;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                postToInitThread(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetLibraryLoader.2
                    @Override // java.lang.Runnable
                    public void run() {
                        org.chromium.net.impl.CronetLibraryLoader.ensureInitializedOnInitThread();
                    }
                });
            }
            if (!sLibraryLoaded) {
                if (cronetEngineBuilderImpl.libraryLoader() != null) {
                    cronetEngineBuilderImpl.libraryLoader().loadLibrary(LIBRARY_NAME);
                } else {
                    java.lang.String str = LIBRARY_NAME;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "org/chromium/net/impl/CronetLibraryLoader", "ensureInitialized", "(Landroid/content/Context;Lorg/chromium/net/impl/CronetEngineBuilderImpl;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "org/chromium/net/impl/CronetLibraryLoader", "ensureInitialized", "(Landroid/content/Context;Lorg/chromium/net/impl/CronetEngineBuilderImpl;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                }
                java.lang.String cronetVersion = org.chromium.net.impl.ImplVersion.getCronetVersion();
                if (!cronetVersion.equals(org.chromium.net.impl.CronetLibraryLoaderJni.get().getCronetVersion())) {
                    throw new java.lang.RuntimeException(java.lang.String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, org.chromium.net.impl.CronetLibraryLoaderJni.get().getCronetVersion()));
                }
                org.chromium.base.Log.i(TAG, "Cronet version: %s, arch: %s", cronetVersion, java.lang.System.getProperty("os.arch"));
                setNativeLoggingLevel();
                sLibraryLoaded = true;
                sWaitForLibLoad.open();
            }
        }
    }

    private static void ensureInitializedFromNative() {
        synchronized (sLoadLock) {
            sLibraryLoaded = true;
            sWaitForLibLoad.open();
        }
    }

    public static void ensureInitializedOnInitThread() {
        if (sInitThreadInitDone) {
            return;
        }
        android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
        org.chromium.net.httpflags.Flags load = org.chromium.net.httpflags.HttpFlagsLoader.load(applicationContext);
        if (load == null) {
            load = (org.chromium.net.httpflags.Flags) org.chromium.net.httpflags.Flags.newBuilder().build();
        }
        sHttpFlags = org.chromium.net.httpflags.ResolvedFlags.resolve(load, applicationContext.getPackageName(), org.chromium.net.impl.ImplVersion.getCronetVersion());
        sHttpFlagsLoaded.open();
        org.chromium.net.httpflags.ResolvedFlags.Value value = sHttpFlags.flags().get(LOG_FLAG_NAME);
        if (value != null) {
            org.chromium.base.Log.i(TAG, "HTTP flags log line: %s", value.getStringValue());
        }
        org.chromium.net.NetworkChangeNotifier.init();
        org.chromium.net.NetworkChangeNotifier.registerToReceiveNotificationsAlways();
        sWaitForLibLoad.block();
        org.chromium.net.impl.CronetLibraryLoaderJni.get().cronetInitOnInitThread();
        sInitThreadInitDone = true;
    }

    private static byte[] getBaseFeatureOverrides() {
        sHttpFlagsLoaded.block();
        return org.chromium.net.httpflags.BaseFeature.getOverrides(sHttpFlags).toByteArray();
    }

    private static java.lang.String getDefaultUserAgent() {
        return org.chromium.net.impl.UserAgent.from(org.chromium.base.ContextUtils.getApplicationContext());
    }

    public static void initCronetInJavaWithoutLoadSo(android.content.Context context) {
        synchronized (sLoadLock) {
            if (!sInitThreadInitDone) {
                org.chromium.base.ContextUtils.initApplicationContext(context);
                android.os.HandlerThread handlerThread = sInitThread;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                postToInitThread(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetLibraryLoader.1
                    @Override // java.lang.Runnable
                    public void run() {
                        org.chromium.net.impl.CronetLibraryLoader.ensureInitializedOnInitThread();
                    }
                });
            }
        }
    }

    public static java.lang.String libraryName() {
        return LIBRARY_NAME;
    }

    private static boolean onInitThread() {
        return sInitThread.getLooper() == android.os.Looper.myLooper();
    }

    public static void postToInitThread(java.lang.Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new android.os.Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    private static void setNativeLoggingLevel() {
        int i17;
        if (org.chromium.base.Log.isLoggable("chromium", 2)) {
            i17 = -2;
        } else if (!org.chromium.base.Log.isLoggable("chromium", 3)) {
            return;
        } else {
            i17 = -1;
        }
        org.chromium.net.impl.CronetLibraryLoaderJni.get().setMinLogLevel(i17);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i17) {
        android.os.Process.setThreadPriority(i17);
    }
}
