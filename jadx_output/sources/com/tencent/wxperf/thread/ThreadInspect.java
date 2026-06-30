package com.tencent.wxperf.thread;

/* loaded from: classes12.dex */
public final class ThreadInspect {
    private static final int ALL_THREAD_FLAG = -2;
    private static final int CURR_PID_FLAG = -1;
    private static final int CURR_TID_FLAG = -1;
    private static final java.lang.String LIB_NAME = "wxperf-tkill";
    private static final java.lang.String TAG = "ThreadInspect";
    private static volatile boolean initialized;
    private static final java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<java.lang.Thread>> sTidThreads = new java.util.HashMap();
    private byte _hellAccFlag_;

    private static void dump(int i17, int i18, int i19, java.lang.String str) {
        if (initialized) {
            nativeDump(i17, i18, i19, str);
        }
    }

    public static void dumpLocalAllThread(int i17, java.lang.String str) {
        dump(-1, -2, i17, str);
    }

    public static void dumpLocalCurrentThread(int i17, java.lang.String str) {
        dump(-1, -1, i17, str);
    }

    public static void dumpLocalThread(int i17, int i18, java.lang.String str) {
        dump(-1, i17, i18, str);
    }

    public static void dumpRemoteAllThread(int i17, int i18, java.lang.String str) {
        dump(i17, -2, i18, str);
    }

    public static void dumpRemoteThread(int i17, int i18, int i19, java.lang.String str) {
        dump(i17, i18, i19, str);
    }

    private static java.lang.String get(int i17, int i18, java.lang.String str) {
        if (initialized) {
            return nativeGet(i17, i18, str);
        }
        return null;
    }

    public static java.lang.String getLocalAllThread(java.lang.String str) {
        return get(-1, -2, str);
    }

    public static java.lang.String getLocalCurrentThread(java.lang.String str) {
        return get(-1, -1, str);
    }

    public static java.lang.String getLocalThread(int i17, java.lang.String str) {
        return get(-1, i17, str);
    }

    public static java.lang.String getRemoteAllThread(int i17, java.lang.String str) {
        return get(i17, -2, str);
    }

    public static java.lang.String getRemoteThread(int i17, int i18, java.lang.String str) {
        return get(i17, i18, str);
    }

    public static boolean init() {
        return init(null);
    }

    private static void log(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        if (initialized) {
            nativeLog(i17, i18, str, i19, str2);
        }
    }

    public static void logLocalAllThread(java.lang.String str, int i17, java.lang.String str2) {
        log(-1, -2, str, i17, str2);
    }

    public static void logLocalCurrentThread(java.lang.String str, int i17, java.lang.String str2) {
        log(-1, -1, str, i17, str2);
    }

    public static void logLocalThread(int i17, java.lang.String str, int i18, java.lang.String str2) {
        log(-1, i17, str, i18, str2);
    }

    public static void logRemoteAllThread(int i17, java.lang.String str, int i18, java.lang.String str2) {
        log(i17, -2, str, i18, str2);
    }

    public static void logRemoteThread(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        log(i17, i18, str, i19, str2);
    }

    private static native void nativeDump(int i17, int i18, int i19, java.lang.String str);

    private static native java.lang.String nativeGet(int i17, int i18, java.lang.String str);

    public static native void nativeLog(int i17, int i18, java.lang.String str, int i19, java.lang.String str2);

    public static void dumpLocalAllThread(int i17) {
        dump(-1, -2, i17, null);
    }

    public static void dumpLocalCurrentThread(int i17) {
        dump(-1, -1, i17, null);
    }

    public static void dumpLocalThread(int i17, int i18) {
        dump(-1, i17, i18, null);
    }

    public static void dumpRemoteAllThread(int i17, int i18) {
        dump(i17, -2, i18, null);
    }

    public static void dumpRemoteThread(int i17, int i18, int i19) {
        dump(i17, i18, i19, null);
    }

    public static java.lang.String getLocalAllThread() {
        return get(-1, -2, null);
    }

    public static java.lang.String getLocalCurrentThread() {
        return get(-1, -1, null);
    }

    public static java.lang.String getLocalThread(int i17) {
        return get(-1, i17, null);
    }

    public static java.lang.String getRemoteAllThread(int i17) {
        return get(i17, -2, null);
    }

    public static java.lang.String getRemoteThread(int i17, int i18) {
        return get(i17, i18, null);
    }

    public static boolean init(m3.a aVar) {
        if (!initialized) {
            synchronized (com.tencent.wxperf.thread.ThreadInspect.class) {
                if (!initialized) {
                    try {
                        if (aVar == null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(LIB_NAME);
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxperf/thread/ThreadInspect", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroidx/core/util/Consumer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                            yj0.a.f(obj, "com/tencent/wxperf/thread/ThreadInspect", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroidx/core/util/Consumer;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        } else {
                            aVar.accept(LIB_NAME);
                        }
                        initialized = true;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.stubs.logger.Log.printStack(6, TAG, th6);
                        initialized = false;
                    }
                }
            }
        }
        return initialized;
    }

    public static void logLocalAllThread(java.lang.String str, int i17) {
        log(-1, -2, str, i17, null);
    }

    public static void logLocalCurrentThread(java.lang.String str, int i17) {
        log(-1, -1, str, i17, null);
    }

    public static void logLocalThread(int i17, java.lang.String str, int i18) {
        log(-1, i17, str, i18, null);
    }

    public static void logRemoteAllThread(int i17, java.lang.String str, int i18) {
        log(i17, -2, str, i18, null);
    }

    public static void logRemoteThread(int i17, int i18, java.lang.String str, int i19) {
        log(i17, i18, str, i19, null);
    }
}
