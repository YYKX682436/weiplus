package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class ReflectionCameraRiskState extends com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState {
    private static final com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName RISK_STAGE = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName.stage_reflect;
    private static final java.lang.String TAG = "ReflectionCameraRiskState";
    private boolean prepareTipsDisplaying = true;
    private int continuousDetectCount = 0;
    private com.tencent.youtu.sdkkitframework.common.TimeoutCounter tipsTimer = new com.tencent.youtu.sdkkitframework.common.TimeoutCounter("reflect cp tips timeout counter");

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.continuousDetectCount = ((java.lang.Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.poseState = (com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "reflection cp enter failed " + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.common.CommonUtils.reportException("reflection cp enter failed ", e17);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState, com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.nextStateName = stateClassName;
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData currentStateRiskData = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().getCurrentStateRiskData(RISK_STAGE);
        this.currentStateRiskData = currentStateRiskData;
        if (currentStateRiskData == null) {
            this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
            this.currentStateHasRisk = false;
            return;
        }
        this.currentStateHasRisk = true;
        startCameraRiskThread();
        computeTimeOffsetNode();
        this.needRiskStateCheckFaces = true;
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)).handleStateAction("reset_timeout", null);
        this.tipsTimer.reset();
        try {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onReflectStart(0L);
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState, com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.tipsTimer.init(java.lang.Math.max(0, java.lang.Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        if (this.nextStateName == com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        } else {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState, com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        this.prepareTipsDisplaying = true;
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = this.nextStateName;
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName2 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        if (stateClassName != stateClassName2) {
            moveToNextState();
            return;
        }
        if (this.prepareTipsDisplaying) {
            if (!this.tipsTimer.isRunning() || this.tipsTimer.checkTimeout()) {
                this.tipsTimer.cancel();
                this.prepareTipsDisplaying = false;
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState.2
                    {
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP);
                    }
                });
                sendCameraRiskStartEvent(1, RISK_STAGE.value);
                changeCameraParams();
            } else if (this.continuousDetectCount <= 1) {
                this.tipsTimer.reset();
            } else {
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectionCameraRiskState.1
                    {
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_REFLECT_PREPARE);
                    }
                });
            }
            this.nextStateName = stateClassName2;
            moveToNextState();
            return;
        }
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise = this.poseState;
        if (facePreviewingAdvise != com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS && facePreviewingAdvise != com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
            handleFailure(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_CAMERA_RISK_DETECT_FAIL, "检测异常", "");
            moveToNextState();
            return;
        }
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData cameraRiskData = this.currentStateRiskData;
        if (cameraRiskData.ui_end_delay < 0 && (cameraRiskData.image_list.size() - this.runCameraRiskIndex) - this.beforeSendEndCount == 0) {
            sendCameraEndEvent(1, RISK_STAGE.value, this.actualDelaySendEndTime);
        }
        if (!isShouldTakeImg()) {
            moveToNextState();
            return;
        }
        if (this.runCameraRiskIndex >= this.currentStateRiskData.image_list.size()) {
            this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
            int i27 = this.currentStateRiskData.ui_end_delay;
            if (i27 >= 0) {
                if (i27 != 0) {
                    try {
                        java.lang.Thread.sleep(java.lang.Math.abs(i27));
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, android.util.Log.getStackTraceString(e17));
                    }
                }
                sendCameraEndEvent(1, RISK_STAGE.value, 0L);
            }
        }
        makeRiskFrameData(bArr, i17, i18, j17);
        changeCameraParams();
        moveToNextState();
    }
}
