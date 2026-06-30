package com.tencent.paymars;

/* loaded from: classes12.dex */
public class Mars {
    protected static final java.lang.String TAG = "PayMars";
    public static final java.lang.String libAndromeda = "andromeda";
    public static final java.lang.String libMarsBase = "wechatbase";
    public static final java.lang.String libMarsMM = "wechatmm";
    public static final java.lang.String libMarsNetwork = "wechatnetwork";
    public static final java.lang.String libMarsQuic = "marsquic";
    public static final java.lang.String libMarsXlog = "wechatxlog";
    private byte _hellAccFlag_;
    protected static java.util.ArrayList<java.lang.String[]> libModules = new java.util.ArrayList<>();
    protected static volatile boolean hasInitialized = false;

    public static synchronized void checkLoadedModules(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        synchronized (com.tencent.paymars.Mars.class) {
            if (arrayList == null) {
                return;
            }
            int i17 = 0;
            java.lang.String[] strArr = new java.lang.String[0];
            com.tencent.mars.xlog.Log.i(str, "loaded modules: " + java.util.Arrays.toString(arrayList.toArray(strArr)));
            java.util.Arrays.sort(strArr);
            libModules.add(strArr);
            boolean z17 = true;
            for (int i18 = 0; i18 < libModules.size(); i18++) {
                if (!java.util.Arrays.equals(libModules.get(i18), libModules.get(0))) {
                    z17 = false;
                }
            }
            if (!z17) {
                while (i17 < libModules.size()) {
                    int i19 = i17 + 1;
                    for (int i27 = i19; i27 < libModules.size() && (!hasInterSection(libModules.get(i17), libModules.get(i27))); i27++) {
                    }
                    if (!z17) {
                        break;
                    } else {
                        i17 = i19;
                    }
                }
            }
            if (!z17) {
                throw new java.lang.IllegalStateException("mars lib module custom made error, pls check your *.so.");
            }
        }
    }

    public static java.lang.String getCallStack() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static boolean hasInterSection(java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(str);
        }
        for (java.lang.String str2 : strArr2) {
            if (arrayList.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void init(android.content.Context context, android.os.Handler handler) {
        com.tencent.mars.comm.PlatformComm.init(context, handler);
        hasInitialized = true;
    }

    public static void loadCppSharedLibrary() {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/paymars/Mars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void loadDependentLibraries() {
        com.tencent.mars.xlog.Log.i(TAG, "load mars from %s", getCallStack());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbase");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("andromeda");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("wechatmm");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void loadDependentLibrariesAll() {
        com.tencent.mars.xlog.Log.i(TAG, "load mars from %s", getCallStack());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbase");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("andromeda");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("marsquic");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("wechatmm");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add("wechatnetwork");
        java.lang.Object obj5 = new java.lang.Object();
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(obj5, arrayList5.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList5.get(0));
        yj0.a.f(obj5, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void loadDependentLibrariesForNetwork() {
        com.tencent.mars.xlog.Log.i(TAG, "load mars from %s", getCallStack());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbase");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("marsquic");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("wechatmm");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("wechatnetwork");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void onCreate(boolean z17) {
        if (z17 && hasInitialized) {
            onCreate();
        } else {
            if (!z17) {
                onCreate();
                return;
            }
            throw new java.lang.IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
    }

    public static void onDestroy() {
        onDestroyImpl();
    }

    private static void onDestroyImpl() {
        com.tencent.paymars.BaseEvent.onDestroy();
    }

    public static void onExceptionCrash() {
        com.tencent.paymars.BaseEvent.onExceptionCrash();
    }

    public static void onForeground(boolean z17) {
        com.tencent.paymars.BaseEvent.onForeground(z17);
    }

    public static void onInit(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mars", "packerEncoderVersion %s", java.lang.Integer.valueOf(i17));
        com.tencent.paymars.BaseEvent.onInitConfigBeforeOnCreate(i17);
    }

    public static void onNetworkChange() {
        com.tencent.paymars.BaseEvent.onNetworkChange();
    }

    public static void onSingalCrash(int i17) {
        com.tencent.paymars.BaseEvent.onSingalCrash(i17);
    }

    public static void onCreate() {
        com.tencent.paymars.BaseEvent.onCreate();
    }
}
