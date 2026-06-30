package com.tenpay.ndk;

/* loaded from: classes.dex */
public class FitHkWxLibraryLoader {
    private static com.tenpay.ndk.FitHkWxLibraryLoader.ILoader sLoaderImpl = com.tenpay.ndk.FitHkWxLibraryLoader.ILoader.DEFAULT;

    /* loaded from: classes.dex */
    public interface ILoader {
        public static final com.tenpay.ndk.FitHkWxLibraryLoader.ILoader DEFAULT = new com.tenpay.ndk.FitHkWxLibraryLoader.ILoader() { // from class: com.tenpay.ndk.FitHkWxLibraryLoader.ILoader.1
            private byte _hellAccFlag_;

            @Override // com.tenpay.ndk.FitHkWxLibraryLoader.ILoader
            public void loadLibrary(java.lang.String str) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tenpay/ndk/FitHkWxLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tenpay/ndk/FitHkWxLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
        };

        void loadLibrary(java.lang.String str);
    }

    public static void load(java.lang.String str) {
        sLoaderImpl.loadLibrary(str);
    }

    public static void setLoader(com.tenpay.ndk.FitHkWxLibraryLoader.ILoader iLoader) {
        if (iLoader == null) {
            sLoaderImpl = com.tenpay.ndk.FitHkWxLibraryLoader.ILoader.DEFAULT;
        } else {
            sLoaderImpl = iLoader;
        }
    }
}
