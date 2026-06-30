package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class StartCameraRiskState extends com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState {
    private static final com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName RISK_STAGE = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName.stage_start;
    private static final java.lang.String TAG = "StartCameraRiskState";

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.liveness.risk.BaseCameraRiskState, com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.nextStateName = stateClassName;
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper cameraRiskHelper = com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance();
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName stageName = RISK_STAGE;
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData currentStateRiskData = cameraRiskHelper.getCurrentStateRiskData(stageName);
        this.currentStateRiskData = currentStateRiskData;
        if (currentStateRiskData == null) {
            this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE;
            this.currentStateHasRisk = false;
            return;
        }
        this.currentStateHasRisk = true;
        startCameraRiskThread();
        computeTimeOffsetNode();
        sendCameraRiskStartEvent(0, stageName.value);
        this.needRiskStateCheckFaces = false;
        changeCameraParams();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)).handleStateAction("reset_timeout", null);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        if (this.nextStateName == com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        } else {
            resetCameraParams();
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        if (this.nextStateName != com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            moveToNextState();
            return;
        }
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData cameraRiskData = this.currentStateRiskData;
        if (cameraRiskData.ui_end_delay < 0 && (cameraRiskData.image_list.size() - this.runCameraRiskIndex) - this.beforeSendEndCount == 0) {
            sendCameraEndEvent(0, RISK_STAGE.value, this.actualDelaySendEndTime);
        }
        if (!isShouldTakeImg()) {
            moveToNextState();
            return;
        }
        if (this.runCameraRiskIndex == this.currentStateRiskData.image_list.size()) {
            this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE;
            int i27 = this.currentStateRiskData.ui_end_delay;
            if (i27 >= 0) {
                if (i27 != 0) {
                    try {
                        java.lang.Thread.sleep(i27);
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, android.util.Log.getStackTraceString(e17));
                    }
                }
                sendCameraEndEvent(0, RISK_STAGE.value, 0L);
            }
        }
        makeRiskFrameData(bArr, i17, i18, j17);
        changeCameraParams();
        moveToNextState();
    }
}
