package com.tencent.skyline.jni;

/* loaded from: classes7.dex */
public class SkylineLibraryLoader {
    private static com.tencent.skyline.jni.ISkylineLibraryLoader DEFAULT;
    private static com.tencent.skyline.jni.ISkylineLibraryLoader sSkylineLibraryLoader;

    static {
        com.tencent.skyline.jni.ISkylineLibraryLoader iSkylineLibraryLoader = new com.tencent.skyline.jni.ISkylineLibraryLoader() { // from class: com.tencent.skyline.jni.SkylineLibraryLoader.1
            private byte _hellAccFlag_;

            @Override // com.tencent.skyline.jni.ISkylineLibraryLoader
            public boolean afterLoad() {
                return false;
            }

            @Override // com.tencent.skyline.jni.ISkylineLibraryLoader
            public boolean beforeLoad() {
                return false;
            }

            @Override // com.tencent.skyline.jni.ISkylineLibraryLoader
            public boolean load(java.lang.String str) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/skyline/jni/SkylineLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/skyline/jni/SkylineLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    return true;
                } catch (java.lang.Exception e17) {
                    java.lang.String.format("%s load fail %s", str, e17);
                    return true;
                }
            }
        };
        DEFAULT = iSkylineLibraryLoader;
        sSkylineLibraryLoader = iSkylineLibraryLoader;
    }

    public static void afterLoad() {
        sSkylineLibraryLoader.afterLoad();
    }

    public static void beforeLoad() {
        sSkylineLibraryLoader.beforeLoad();
    }

    public static void initLibraryLoader(com.tencent.skyline.jni.ISkylineLibraryLoader iSkylineLibraryLoader) {
        sSkylineLibraryLoader = iSkylineLibraryLoader;
    }

    public static void initXWebLibraryLoader(com.tencent.skyline.jni.ISkylineLibraryLoader iSkylineLibraryLoader) {
        sSkylineLibraryLoader = iSkylineLibraryLoader;
    }

    public static boolean load(java.lang.String str) {
        return sSkylineLibraryLoader.load(str);
    }
}
