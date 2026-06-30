package com.tencent.nativecrash;

/* loaded from: classes12.dex */
public final class NativeCrash {
    public static final int DEFAULT_FULL_FLAGS = -1;
    public static final int DEFAULT_SHORT_FLAGS = 1867;
    public static final int DUMP_ABORT_MESSAGE = 1024;
    public static final int DUMP_FILE_DESCRIPTORS = 2048;
    public static final int DUMP_JAVA_STACK = 64;
    public static final int DUMP_MAPPINGS = 32;
    public static final int DUMP_OTHER_THREADS = 128;
    public static final int DUMP_PRESET_CUSTOM = 256;
    public static final int DUMP_PROCESS = 1;
    public static final int DUMP_REALTIME_CUSTOM = 512;
    public static final int DUMP_REGISTER = 4;
    public static final int DUMP_SIGNAL = 2;
    public static final int DUMP_STACK = 8;
    public static final int DUMP_STACK_MEMORY = 16;
    private static final java.lang.String TAG = "NativeCrash";
    private static final java.nio.charset.Charset UTF8 = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
    private static com.tencent.nativecrash.NativeCrash.ANRCallback mANRCallback;
    private static com.tencent.nativecrash.NativeCrash.CrashCallback mCrashCallback;
    private byte _hellAccFlag_;

    /* loaded from: classes12.dex */
    public interface ANRCallback {
        boolean onANRDumped(int i17, java.lang.String str);
    }

    /* loaded from: classes12.dex */
    public interface CrashCallback {
        boolean onCrashDumped(int i17, java.lang.String str, java.lang.String str2);
    }

    private NativeCrash() {
    }

    public static com.tencent.nativecrash.NativeCrash.ANRCallback anrCallback() {
        return mANRCallback;
    }

    public static com.tencent.nativecrash.NativeCrash.CrashCallback crashCallback() {
        return mCrashCallback;
    }

    public static void customInfo(java.lang.String str) {
        if (str == null) {
            return;
        }
        nativeCustomInfo((!str.endsWith("\n") ? str.concat("\n\u0000") : str.concat("\u0000")).getBytes(UTF8));
    }

    public static void init(java.lang.String str, int i17, int i18) {
        init(str, i17, i18, false);
    }

    private static native void nativeCustomInfo(byte[] bArr);

    private static native void nativeInit(java.lang.String str, int i17, int i18, boolean z17);

    private static native void nativeInitFd(int[] iArr, int i17, int i18);

    private static native void nativeReserveMemory();

    private static native void nativeResetCustomInfo();

    private static boolean onANRDumped(int i17, java.lang.String str) {
        com.tencent.nativecrash.NativeCrash.ANRCallback aNRCallback = mANRCallback;
        return aNRCallback != null && aNRCallback.onANRDumped(i17, str);
    }

    private static boolean onCrashDumped(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.nativecrash.NativeCrash.CrashCallback crashCallback = mCrashCallback;
        return crashCallback != null && crashCallback.onCrashDumped(i17, str, str2);
    }

    public static void reserveMemory() {
        nativeReserveMemory();
    }

    public static void resetCustomInfo() {
        nativeResetCustomInfo();
    }

    public static com.tencent.nativecrash.NativeCrash.ANRCallback anrCallback(com.tencent.nativecrash.NativeCrash.ANRCallback aNRCallback) {
        com.tencent.nativecrash.NativeCrash.ANRCallback aNRCallback2 = mANRCallback;
        mANRCallback = aNRCallback;
        return aNRCallback2;
    }

    public static com.tencent.nativecrash.NativeCrash.CrashCallback crashCallback(com.tencent.nativecrash.NativeCrash.CrashCallback crashCallback) {
        com.tencent.nativecrash.NativeCrash.CrashCallback crashCallback2 = mCrashCallback;
        mCrashCallback = crashCallback;
        return crashCallback2;
    }

    public static void init(java.lang.String str, int i17, int i18, boolean z17) {
        if (!com.tencent.nativecrash.InitializationProbe.libLoaded) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("wechatcrash");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/nativecrash/NativeCrash", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Ljava/lang/String;IIZ)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/nativecrash/NativeCrash", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Ljava/lang/String;IIZ)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        nativeInit(str, i17, i18, z17);
    }

    public static void init(android.os.ParcelFileDescriptor[] parcelFileDescriptorArr, int i17, int i18) {
        if (!com.tencent.nativecrash.InitializationProbe.libLoaded) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("wechatcrash");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/nativecrash/NativeCrash", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "([Landroid/os/ParcelFileDescriptor;II)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/nativecrash/NativeCrash", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "([Landroid/os/ParcelFileDescriptor;II)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        int[] iArr = new int[parcelFileDescriptorArr.length];
        for (int i19 = 0; i19 < parcelFileDescriptorArr.length; i19++) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArr[i19];
            iArr[i19] = parcelFileDescriptor == null ? -1 : parcelFileDescriptor.getFd();
        }
        nativeInitFd(iArr, i17, i18);
    }
}
