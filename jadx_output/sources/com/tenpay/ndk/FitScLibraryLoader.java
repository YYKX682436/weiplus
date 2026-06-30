package com.tenpay.ndk;

/* loaded from: classes.dex */
public class FitScLibraryLoader {
    private static com.tenpay.ndk.FitScLibraryLoader.ILoader sLoaderImpl = com.tenpay.ndk.FitScLibraryLoader.ILoader.DEFAULT;

    /* loaded from: classes.dex */
    public interface ILoader {
        public static final com.tenpay.ndk.FitScLibraryLoader.ILoader DEFAULT = new com.tenpay.ndk.FitScLibraryLoader.ILoader() { // from class: com.tenpay.ndk.FitScLibraryLoader.ILoader.1
            private byte _hellAccFlag_;

            @Override // com.tenpay.ndk.FitScLibraryLoader.ILoader
            public void loadLibrary(java.lang.String str) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tenpay/ndk/FitScLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tenpay/ndk/FitScLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
        };

        void loadLibrary(java.lang.String str);
    }

    private FitScLibraryLoader() {
    }

    public static void load(java.lang.String str) {
        sLoaderImpl.loadLibrary(str);
    }

    public static void setLoader(com.tenpay.ndk.FitScLibraryLoader.ILoader iLoader) {
        if (iLoader == null) {
            sLoaderImpl = com.tenpay.ndk.FitScLibraryLoader.ILoader.DEFAULT;
        } else {
            sLoaderImpl = iLoader;
        }
    }
}
