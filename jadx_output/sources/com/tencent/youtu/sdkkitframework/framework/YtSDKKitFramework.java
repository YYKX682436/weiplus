package com.tencent.youtu.sdkkitframework.framework;

/* loaded from: classes14.dex */
public class YtSDKKitFramework {
    private static final java.lang.String TAG = "YtSDKKitFramework";
    private static com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework instance = null;
    private static final java.lang.String version = "1.0.8.118.1-wx";
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener eventListener;
    private android.graphics.Rect previewRect = new android.graphics.Rect(0, 0, 480, 640);
    private android.graphics.Rect detectRect = new android.graphics.Rect(10, 60, 470, 580);
    private int networkRequestTimeoutMS = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* loaded from: classes14.dex */
    public interface IYTBaseFunctionListener {
        java.lang.String base64Encode(byte[] bArr, int i17);

        byte[] getVoiceData();
    }

    /* loaded from: classes14.dex */
    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17);

        void onReflectStart(long j17);
    }

    /* loaded from: classes14.dex */
    public interface IYtSDKKitFrameworkEventListener {
        void onFrameworkEvent(java.util.HashMap<java.lang.String, java.lang.Object> hashMap);

        void onNetworkRequestEvent(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser);
    }

    /* loaded from: classes13.dex */
    public interface IYtSDKKitNetResponseParser {
        void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc);
    }

    /* loaded from: classes14.dex */
    public enum YtFrameworkFireEventType {
        YT_EVENT_TRIGGER_BEGIN_LIVENESS,
        YT_EVENT_TRIGGER_CANCEL_LIVENESS
    }

    /* loaded from: classes14.dex */
    public enum YtSDKKitFrameworkWorkMode {
        YT_FW_UNKNOWN(0),
        YT_FW_OCR_TYPE(1),
        YT_FW_SILENT_TYPE(2),
        YT_FW_ACTION_TYPE(3),
        YT_FW_REFLECT_TYPE(4),
        YT_FW_ACTREFLECT_TYPE(5),
        YT_FW_LIPREAD_TYPE(6),
        YT_FW_DETECTONLY_TYPE(7),
        YT_FW_OCR_VIID_TYPE(8);

        private static java.util.HashMap<java.lang.Integer, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode> map = new java.util.HashMap<>();
        private int value;

        static {
            for (com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode : values()) {
                map.put(java.lang.Integer.valueOf(ytSDKKitFrameworkWorkMode.value), ytSDKKitFrameworkWorkMode);
            }
        }

        YtSDKKitFrameworkWorkMode(int i17) {
            this.value = i17;
        }

        public int getValue() {
            return this.value;
        }

        public static com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode valueOf(int i17) {
            if (map.get(java.lang.Integer.valueOf(i17)) == null) {
                return YT_FW_UNKNOWN;
            }
            return map.get(java.lang.Integer.valueOf(i17));
        }
    }

    /* loaded from: classes14.dex */
    public static class YtSDKPlatformContext {
        public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener baseFunctionListener;
        public android.os.Handler cameraHandler;
        public android.content.Context currentAppContext;
        public android.hardware.Camera currentCamera;
        public int currentCameraId;
        public int currentRotateState;
        public int imageToComapreType = 0;
        public android.graphics.Bitmap imageToCompare;
        public android.widget.RelativeLayout reflectLayout;
        public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener reflectListener;
    }

    private YtSDKKitFramework() {
    }

    public static synchronized void clearInstance() {
        synchronized (com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.class) {
            instance = null;
        }
    }

    public static synchronized com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework getInstance() {
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework ytSDKKitFramework;
        synchronized (com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.class) {
            if (instance == null) {
                instance = new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework();
            }
            ytSDKKitFramework = instance;
        }
        return ytSDKKitFramework;
    }

    private com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState parseStateFrom(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState ytFSMBaseState = null;
        try {
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState ytFSMBaseState2 = (com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            try {
                ytFSMBaseState2.loadStateWith(str, jSONObject);
                return ytFSMBaseState2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                ytFSMBaseState = ytFSMBaseState2;
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Parse state " + str + "failed:" + th.getMessage());
                return ytFSMBaseState;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public int deInit() {
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "sdkkit framework 1.0.8.118.1-wx deinit");
        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.clearInstance();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().stop();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.clearInstance();
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().exitState();
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.clearInstance();
        return 0;
    }

    public void doPause() {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().handlePauseEvent();
    }

    public void doResume() {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().handleResumeEvent();
    }

    public void fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().handleEvent(ytFrameworkFireEventType, obj);
    }

    public android.graphics.Rect getDetectRect() {
        return this.detectRect;
    }

    public int getNetworkRequestTimeoutMS() {
        return this.networkRequestTimeoutMS;
    }

    public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext getPlatformContext() {
        return com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext();
    }

    public android.graphics.Rect getPreviewRect() {
        return this.previewRect;
    }

    public int init(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext, org.json.JSONObject jSONObject, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, java.util.ArrayList<java.lang.String> arrayList, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        int i17;
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "sdkkit framework 1.0.8.118.1-wx init");
        if (ytSDKPlatformContext == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(str, "Context cannot be null");
            return -1;
        }
        if (arrayList.isEmpty()) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(str, "Pipeline state name cannot be empty");
            return -1;
        }
        if (iYtSDKKitFrameworkEventListener == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(str, "Event listener cannot be null");
            return -1;
        }
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().stop();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().setEventListener(iYtSDKKitFrameworkEventListener);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().setContext(ytSDKPlatformContext);
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().registerState(parseStateFrom(it.next(), jSONObject));
        }
        if (jSONObject.has("thread_priority")) {
            try {
                i17 = jSONObject.getInt("thread_priority");
            } catch (org.json.JSONException e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "failed to get priority " + e17.getLocalizedMessage());
            }
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().start(arrayList.get(0), ytSDKKitFrameworkWorkMode, i17);
            return 0;
        }
        i17 = -20;
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().start(arrayList.get(0), ytSDKKitFrameworkWorkMode, i17);
        return 0;
    }

    public void reset() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reset();
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().reset();
            }
        });
    }

    public void setDetectRect(android.graphics.Rect rect) {
        this.detectRect = rect;
    }

    public void setNetworkRequestTimeoutMS(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        this.networkRequestTimeoutMS = i17;
    }

    public void setPreviewRect(android.graphics.Rect rect) {
        this.previewRect = rect;
    }

    public void updateSDKSetting(org.json.JSONObject jSONObject) {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().updateSDKSetting(jSONObject);
    }

    public int updateWithFrameData(byte[] bArr, int i17, int i18, int i19) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis <= 946684800000L) {
            return com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_TIMETICK_ERROR;
        }
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().update(bArr, i17, i18, i19, currentTimeMillis);
        return 0;
    }

    public java.lang.String version() {
        return "1.0.8.118.1-wx";
    }
}
