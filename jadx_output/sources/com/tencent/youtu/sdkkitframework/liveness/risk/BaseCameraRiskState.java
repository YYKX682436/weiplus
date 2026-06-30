package com.tencent.youtu.sdkkitframework.liveness.risk;

/* loaded from: classes14.dex */
public class BaseCameraRiskState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    protected static final int MESSAGE_NO_REFLECTION_EVENT = 0;
    protected static final int MESSAGE_REFLECTION_EVENT = 1;
    protected static final int SEND_CAMERA_RISK_END_EVENT = 3000;
    protected static final int SEND_CAMERA_RISK_START_EVENT = 2500;
    private static final int SEND_COLOR_FILTER_DELAY_TIME = 500;
    protected static final int SEND_COLOR_FILTER_EVENT = 1500;
    protected static final int SEND_HANDLER_CHANGE_CAMERA_PARAMS = 1000;
    protected static final int SEND_REVERT_COLOR_FILTER_EVENT = 2000;
    private static final java.lang.String TAG = "BaseCameraRiskState";
    protected long actualDelaySendEndTime;
    protected int beforeSendEndCount;
    protected boolean currentStateHasRisk;
    protected com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData currentStateRiskData;
    protected android.os.Handler handler;
    private android.os.HandlerThread handlerThread;
    protected boolean isCameraRiskChanged;
    protected long lastMarkTime;
    protected boolean needRiskStateCheckFaces;
    protected com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName nextStateName;
    protected com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData riskData;
    protected int runCameraRiskIndex;
    protected com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise poseState = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    boolean isFirstJumpNextState = true;
    protected float riskImageResizeScale = 2.0f;
    protected int riskImageResizeQuality = 95;

    private void stopHandler() {
        if (this.needRiskStateCheckFaces) {
            android.os.Handler handler = this.handler;
            if (handler != null) {
                handler.removeMessages(1500);
            }
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onReflectEvent(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().whiteColor, 1.0f);
        }
        this.handler = null;
        android.os.HandlerThread handlerThread = this.handlerThread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.handlerThread.quitSafely();
    }

    public void changeCameraParams() {
        if (this.runCameraRiskIndex < this.currentStateRiskData.image_list.size()) {
            java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.RiskData> arrayList = this.currentStateRiskData.image_list;
            int i17 = this.runCameraRiskIndex;
            this.runCameraRiskIndex = i17 + 1;
            this.riskData = arrayList.get(i17);
        }
        if (this.riskData.image_name.equalsIgnoreCase(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.CLIENT_DEFAULT)) {
            resetCameraParams();
            this.currentStateRiskData.image_list.remove(this.riskData);
        } else {
            this.isCameraRiskChanged = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().changeCameraParameters(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPlatformContext().currentCamera, this.riskData);
        }
        this.lastMarkTime = java.lang.System.currentTimeMillis();
    }

    public void computeTimeOffsetNode() {
        int i17 = this.currentStateRiskData.ui_end_delay;
        if (i17 < 0) {
            int abs = java.lang.Math.abs(i17);
            long j17 = 0;
            for (int size = this.currentStateRiskData.image_list.size() - 1; size >= 0; size--) {
                j17 += this.currentStateRiskData.image_list.get(size).key4;
                this.beforeSendEndCount++;
                if (j17 >= abs) {
                    break;
                }
            }
            long j18 = abs;
            this.actualDelaySendEndTime = j17 >= j18 ? j17 - j18 : 0L;
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    public void handleFailure(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.e(str3, "failed :" + ("message:" + str + "\ntips:" + str2 + "\ncode:" + i17));
        java.lang.String convertAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.convertAdvise(this.poseState);
        java.lang.String makeMessageJson = com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_CAMERA_RISK_DETECT_FAIL, convertAdvise, str);
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(i17, convertAdvise);
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_CAMERA_RISK_DETECT_FAIL));
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_REASON_CODE, java.lang.Integer.valueOf(i17));
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, makeMessageJson);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
        stopReflectionEvent();
    }

    public boolean isShouldTakeImg() {
        return (java.lang.System.currentTimeMillis() - this.lastMarkTime <= this.riskData.key4 && this.isCameraRiskChanged && com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().supportType == com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.SUCCESS) ? false : true;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("risk_image_resize_scale")) {
                this.riskImageResizeScale = (float) jSONObject.getDouble("risk_image_resize_scale");
            }
            if (jSONObject.has("risk_image_resize_quality")) {
                this.riskImageResizeQuality = jSONObject.getInt("risk_image_resize_quality");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "action load failed1:" + android.util.Log.getStackTraceString(e17));
        }
    }

    public void makeRiskFrameData(byte[] bArr, int i17, int i18, long j17) {
        if (com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().supportType != com.tencent.youtu.sdkkitframework.liveness.risk.SupportType.SUCCESS) {
            return;
        }
        byte[] RotateYUV = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().RotateYUV(bArr, i17, i18, com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentRotateState);
        if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentRotateState > 4) {
            i18 = i17;
            i17 = i18;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, java.lang.String.format("choose frame, now%s-frame%s=delay%sms", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis - j17)));
        this.riskData.image = makeYUVFrameToJPGBase64(RotateYUV, i17, i18);
        java.lang.String str = this.riskData.image;
        if (str != null && !str.isEmpty()) {
            this.riskData.timestamp = j17;
            return;
        }
        handleFailure(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_CAMERA_RISK_IMG_FAIL, "检测异常", "");
        stopReflectionEvent();
        this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
        moveToNextState();
    }

    public java.lang.String makeYUVFrameToJPGBase64(byte[] bArr, int i17, int i18) {
        com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData = new com.tencent.youtu.sdkkitframework.common.YTImageData(bArr, i17, i18);
        try {
            yTImageData.imgData = yTImageData.yuv2JPEG(100);
            float f17 = yTImageData.width;
            float f18 = this.riskImageResizeScale;
            yTImageData.resize((int) (f17 / f18), (int) (yTImageData.height / f18), this.riskImageResizeQuality);
            return android.util.Base64.encodeToString(yTImageData.imgData, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, android.util.Log.getStackTraceString(e17));
            return null;
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        super.reset();
        this.runCameraRiskIndex = 0;
        this.beforeSendEndCount = 0;
        this.actualDelaySendEndTime = 0L;
        this.isCameraRiskChanged = false;
        if (this.currentStateHasRisk) {
            com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().resetCameraParams();
        }
        this.currentStateHasRisk = false;
        stopHandler();
    }

    public void resetCameraParams() {
        if (this.isFirstJumpNextState && this.currentStateHasRisk) {
            this.isFirstJumpNextState = false;
            com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().resetCameraParams();
        }
    }

    public void sendCameraEndEvent(int i17, int i18, long j17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 3000;
        obtain.arg1 = i17;
        obtain.arg2 = i18;
        android.os.Handler handler = this.handler;
        if (handler != null) {
            if (j17 != 0) {
                handler.sendMessageDelayed(obtain, j17);
            } else {
                handler.sendMessage(obtain);
            }
        }
    }

    public void sendCameraRiskEndEvent(int i17) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.CAMERA_RISK_END, java.lang.Integer.valueOf(i17));
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    public void sendCameraRiskStartEvent(int i17, int i18) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = SEND_CAMERA_RISK_START_EVENT;
        obtain.arg1 = i17;
        obtain.arg2 = i18;
        android.os.Handler handler = this.handler;
        if (handler == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "error,sendCameraRiskStartEvent handler is null");
            return;
        }
        int i19 = this.currentStateRiskData.ui_start_delay;
        if (i19 > 0) {
            handler.sendMessageDelayed(obtain, i19);
            return;
        }
        if (i19 == 0) {
            handler.sendMessage(obtain);
            return;
        }
        try {
            handler.sendMessage(obtain);
            java.lang.Thread.sleep(java.lang.Math.abs(this.currentStateRiskData.ui_start_delay));
        } catch (java.lang.InterruptedException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, android.util.Log.getStackTraceString(e17));
        }
    }

    public void startCameraRiskThread() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("cameraRisk");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new android.os.Handler(this.handlerThread.getLooper()) { // from class: com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                int i17 = message.what;
                if (i17 == 1500) {
                    com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onReflectEvent(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().getColorMatrixColorFilter(), 1.0f);
                    android.os.Handler handler = com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.this.handler;
                    if (handler != null) {
                        android.os.Message obtainMessage = handler.obtainMessage();
                        obtainMessage.what = 1500;
                        com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.this.handler.sendMessageDelayed(obtainMessage, 500L);
                        return;
                    }
                    return;
                }
                if (i17 == 2000) {
                    com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onReflectEvent(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().whiteColor, 1.0f);
                    return;
                }
                if (i17 == com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.SEND_CAMERA_RISK_START_EVENT) {
                    com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.this.sendCameraRiskStartEvent(message.arg2);
                    if (message.arg1 == 1) {
                        com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.this.startReflectionEvent();
                        return;
                    }
                    return;
                }
                if (i17 != 3000) {
                    return;
                }
                com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.this.sendCameraRiskEndEvent(message.arg2);
                if (message.arg1 == 1) {
                    com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState.this.stopReflectionEvent();
                }
            }
        };
    }

    public void startReflectionEvent() {
        if (this.handler != null) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1500;
            this.handler.sendMessage(obtain);
        }
    }

    public void stopReflectionEvent() {
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(1500);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 2000;
            this.handler.sendMessage(obtain);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        if (this.currentStateHasRisk) {
            com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().resetCameraParams();
        }
        stopHandler();
    }

    public void sendCameraRiskStartEvent(int i17) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.CAMERA_RISK_START, java.lang.Integer.valueOf(i17));
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
    }
}
