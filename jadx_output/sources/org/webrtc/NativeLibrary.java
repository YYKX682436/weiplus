package org.webrtc;

/* loaded from: classes13.dex */
class NativeLibrary {
    private static java.lang.String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static java.lang.Object lock = new java.lang.Object();

    /* loaded from: classes13.dex */
    public static class DefaultLoader implements org.webrtc.NativeLibraryLoader {
        private byte _hellAccFlag_;

        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(java.lang.String str) {
            org.webrtc.Logging.d(org.webrtc.NativeLibrary.TAG, "Loading library: " + str);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "org/webrtc/NativeLibrary$DefaultLoader", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "org/webrtc/NativeLibrary$DefaultLoader", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                return true;
            } catch (java.lang.UnsatisfiedLinkError e17) {
                org.webrtc.Logging.e(org.webrtc.NativeLibrary.TAG, "Failed to load native library: " + str, e17);
                return false;
            }
        }
    }

    public static void initialize(org.webrtc.NativeLibraryLoader nativeLibraryLoader, java.lang.String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                org.webrtc.Logging.d(TAG, "Native library has already been loaded.");
                return;
            }
            org.webrtc.Logging.d(TAG, "Loading native library: " + str);
            libraryLoaded = nativeLibraryLoader.load(str);
        }
    }

    public static boolean isLoaded() {
        boolean z17;
        synchronized (lock) {
            z17 = libraryLoaded;
        }
        return z17;
    }
}
