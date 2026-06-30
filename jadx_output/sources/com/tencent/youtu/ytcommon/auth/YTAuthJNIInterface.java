package com.tencent.youtu.ytcommon.auth;

/* loaded from: classes14.dex */
public class YTAuthJNIInterface {
    private static final java.lang.String DAT_SUFFIX = "SDK.dat";
    private static final java.lang.String LICENCE_SUFFIX = "SDK.licence";
    private static final java.lang.String SDK_NAME = "YoutuFaceTrack";
    private static final java.lang.String SDK_PREFIX = "YT";
    private static final java.lang.String TAG = "log_print_java";
    private static java.lang.String VERSION = "1.2";
    private static long handle = 0;
    private static boolean isReportStarted = false;
    private static java.lang.String licenceStr = "";
    private static com.tencent.youtu.ytcommon.auth.HttpUtil.HttpResponseListener mListener = new com.tencent.youtu.ytcommon.auth.HttpUtil.HttpResponseListener() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.3
        @Override // com.tencent.youtu.ytcommon.auth.HttpUtil.HttpResponseListener
        public void onFail(int i17) {
            try {
                com.tencent.youtu.ytcommon.tools.YTLogger.i(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.TAG, "http request error : " + i17);
                com.tencent.youtu.ytcommon.tools.YTLogger.i(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.TAG, "handle: " + com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.handle);
                com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.nativeUpdateFromServer(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.handle, null);
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // com.tencent.youtu.ytcommon.auth.HttpUtil.HttpResponseListener
        public void onSuccess(java.lang.String str) {
            try {
                com.tencent.youtu.ytcommon.tools.YTLogger.i(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.TAG, "response: " + str);
                com.tencent.youtu.ytcommon.tools.YTLogger.i(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.TAG, "handle: " + com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.handle);
                com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.nativeUpdateFromServer(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.handle, str);
            } catch (java.lang.Exception unused) {
            }
        }
    };
    private static java.util.Timer timerFlush;
    private static java.util.Timer timerReport;
    private long nativePtr;

    public static /* synthetic */ java.lang.String access$000() {
        return getReportContent();
    }

    public static /* synthetic */ long access$100() {
        return nativeFlush();
    }

    public static boolean check() {
        boolean nativeCheck = nativeCheck(handle);
        com.tencent.youtu.ytcommon.tools.YTLogger.i("sdk", "--------------check");
        return nativeCheck;
    }

    private static native int getCurrentAuthStatus(long j17);

    public static long getHandle() {
        return handle;
    }

    private static native int getIsNeedReport(long j17);

    private static native java.lang.String getReportContent();

    public static int init(android.content.Context context, java.lang.String str, int i17, boolean z17) {
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "start init");
        java.lang.String str2 = context.getFilesDir().getPath() + "/YTYoutuFaceTrackSDK.dat";
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "path: " + str2);
        handle = nativeInitN(context, i17, str, context.getAssets(), str2);
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "handleinit: " + handle);
        if (getIsNeedReport(handle) == 0) {
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "no need to report");
        } else {
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "need report");
            startTimer();
        }
        return getCurrentAuthStatus(handle);
    }

    private static boolean isInMainThread() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    private static native boolean nativeCheck(long j17);

    private static native long nativeFlush();

    private static native long nativeInitN(android.content.Context context, int i17, java.lang.String str, android.content.res.AssetManager assetManager, java.lang.String str2);

    private static native int nativePreInitAndCheck(byte[] bArr, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeUpdateFromServer(long j17, java.lang.String str);

    public static int preCheckAndInitWithLicenceStr(android.content.Context context, java.lang.String str) {
        licenceStr = str;
        try {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            if (length <= 0) {
                throw new java.io.IOException("licence error");
            }
            java.lang.String str2 = context.getFilesDir().getPath() + "/YTYoutuFaceTrackSDK.dat";
            java.lang.String packageName = context.getPackageName();
            java.lang.String deviceUid = com.tencent.youtu.ytcommon.auth.StatisticsUtils.getDeviceUid(context);
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "Package name: " + packageName);
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "Device id: " + deviceUid);
            return nativePreInitAndCheck(bytes, length, packageName, deviceUid, str2);
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    public static void report(final java.lang.String str) {
        if (isInMainThread()) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.tencent.youtu.ytcommon.auth.HttpUtil.post("https://api.youtu.qq.com/auth/report", str, com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.mListener);
                    } catch (java.io.IOException unused) {
                    }
                }
            }).start();
        } else {
            try {
                com.tencent.youtu.ytcommon.auth.HttpUtil.post("https://api.youtu.qq.com/auth/report", str, mListener);
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static void startTimer() {
        com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "start timer");
        if (isReportStarted) {
            return;
        }
        java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                java.lang.String access$000 = com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.access$000();
                if (access$000 != "") {
                    com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.report(access$000);
                }
            }
        };
        java.util.Timer timer = new java.util.Timer(true);
        timerReport = timer;
        timer.schedule(timerTask, 600000L, 600000L);
        java.util.TimerTask timerTask2 = new java.util.TimerTask() { // from class: com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.tencent.youtu.ytcommon.tools.YTLogger.i(com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.TAG, "flush in java ");
                com.tencent.youtu.ytcommon.auth.YTAuthJNIInterface.access$100();
            }
        };
        java.util.Timer timer2 = new java.util.Timer(true);
        timerFlush = timer2;
        timer2.schedule(timerTask2, 600000L, 600000L);
        isReportStarted = true;
    }
}
