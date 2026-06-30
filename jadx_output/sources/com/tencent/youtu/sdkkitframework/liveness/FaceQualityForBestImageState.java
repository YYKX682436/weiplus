package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class FaceQualityForBestImageState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final java.lang.String TAG = "FaceQualityForBestImageState";
    private int continuousCount;
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName nextStateName;
    private android.graphics.Rect previousFaceRect = null;
    private float secondaryYawThreshold = 16.0f;
    private float secondaryPitchThreshold = 16.0f;
    private float secondaryRollThreshold = 16.0f;
    private float secondaryCloseMouthThreshold = 0.38f;
    private int continuousQualityNumThreshold = 10;
    private boolean needFaceQuality = false;
    public float stableRoiThreshold = 0.98f;

    public static java.lang.String convertAdvise(com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise) {
        return (facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NOT_IN_RECT ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_NOT_IN_RECT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_FAR ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_CLOSER : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_CLOSE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_FARER : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INCORRECT_POSTURE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_INCORRECT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_FACE : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_EYE_CLOSE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_OPEN_EYE : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_LEFT ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_LEFT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_RIGHT ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_RIGHT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_UP ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_UP : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_DOWN ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_DOWN : com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SILENCE;
    }

    private boolean detectScreenShaking(android.graphics.Rect rect) {
        android.graphics.Rect intersectionRect = getIntersectionRect(rect, this.previousFaceRect);
        float abs = java.lang.Math.abs(((intersectionRect.width() * intersectionRect.height()) / rect.height()) / rect.width());
        this.previousFaceRect = rect;
        return abs > this.stableRoiThreshold;
    }

    public static android.graphics.Rect getFaceRect(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus, int i17, int i18) {
        float[] fArr = faceStatus.xys;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = f17;
        float f27 = f19;
        int i19 = 0;
        float f28 = f18;
        while (i19 < 180) {
            f19 = java.lang.Math.min(f19, faceStatus.xys[i19]);
            f27 = java.lang.Math.max(f27, faceStatus.xys[i19]);
            int i27 = i19 + 1;
            f18 = java.lang.Math.min(f18, faceStatus.xys[i27]);
            f28 = java.lang.Math.max(f28, faceStatus.xys[i27]);
            i19 = i27 + 1;
        }
        float f29 = i17 - 1;
        float f37 = (float) ((f29 - f27) - (((r13 - r2) * 0.1d) / 2.0d));
        float f38 = (float) ((f29 - f19) + (((r13 - f37) * 0.1d) / 2.0d));
        float f39 = (float) (f18 - (((f28 - f18) * 0.1d) / 2.0d));
        float f47 = (float) (f28 + (((f28 - f39) * 0.1d) / 2.0d));
        if (f37 < 0.0f) {
            f37 = 0.0f;
        }
        if (f38 < 0.0f) {
            f38 = 0.0f;
        }
        if (f37 > f29) {
            f37 = f29;
        }
        if (f38 <= f29) {
            f29 = f38;
        }
        if (f39 < 0.0f) {
            f39 = 0.0f;
        }
        if (f47 < 0.0f) {
            f47 = 0.0f;
        }
        float f48 = i18 - 1;
        if (f39 > f48) {
            f39 = f48;
        }
        if (f47 > f48) {
            f47 = f48;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) f37;
        rect.top = (int) f39;
        rect.right = (int) f29;
        rect.bottom = (int) f47;
        return rect;
    }

    public static android.graphics.Rect getIntersectionRect(android.graphics.Rect rect, android.graphics.Rect rect2) {
        return new android.graphics.Rect(java.lang.Math.max(rect.left, rect2.left), java.lang.Math.max(rect.top, rect2.top), java.lang.Math.min(rect.right, rect2.right), java.lang.Math.min(rect.bottom, rect2.bottom));
    }

    private void sendFSMEvent(java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, str);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, str2);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    public java.lang.String convertPrevJudge(int i17) {
        return i17 == 1 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_LEFT_FACE : i17 == 2 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_CHIN : i17 == 3 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_MOUTH : i17 == 4 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_RIGHT_FACE : i17 == 5 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_NOSE : i17 == 6 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_RIGHT_EYE : i17 == 7 ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_LEFT_EYE : com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SILENCE;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.secondaryYawThreshold = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.secondaryPitchThreshold = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.secondaryRollThreshold = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("secondary_close_mouth_threshold")) {
                this.secondaryCloseMouthThreshold = (float) jSONObject.getDouble("secondary_close_mouth_threshold");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                this.continuousQualityNumThreshold = jSONObject.getInt("continuous_quality_num_threshold");
            }
            if (jSONObject.has("need_face_quality")) {
                this.needFaceQuality = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.stableRoiThreshold = (float) jSONObject.getDouble("stable_roi_threshold");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "get json config error:" + android.util.Log.getStackTraceString(e17));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.nextStateName == com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        } else {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise;
        super.update(bArr, i17, i18, i19, j17);
        if (!this.needFaceQuality) {
            this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE;
        }
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = this.nextStateName;
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName2 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        if (stateClassName != stateClassName2) {
            moveToNextState();
            return;
        }
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName2));
        com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus = null;
        try {
            com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatusArr = (com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[]) stateByName.getStateDataBy("face_status");
            if (faceStatusArr != null && faceStatusArr.length != 0) {
                faceStatus = faceStatusArr[0];
                android.graphics.Rect faceRect = getFaceRect(faceStatus, i17, i18);
                if (this.previousFaceRect == null) {
                    this.previousFaceRect = faceRect;
                    this.continuousCount = 0;
                }
                if (!detectScreenShaking(faceRect)) {
                    sendFSMEvent(com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SCREEN_SHAKING, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
                    this.continuousCount = 0;
                    moveToNextState();
                    return;
                }
                if (java.lang.Math.abs(faceStatus.yaw) < this.secondaryYawThreshold && java.lang.Math.abs(faceStatus.pitch) < this.secondaryPitchThreshold && java.lang.Math.abs(faceStatus.roll) < this.secondaryRollThreshold) {
                    if (com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.ProcessHelper.calcMouthScore(faceStatus.xys) > this.secondaryCloseMouthThreshold) {
                        this.continuousCount = 0;
                        sendFSMEvent(com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_CLOSE_MOUTH, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
                        moveToNextState();
                        return;
                    }
                }
                this.continuousCount = 0;
                sendFSMEvent(com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_INCORRECT, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
                moveToNextState();
                return;
            }
            facePreviewingAdvise = (com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "quality for best image detect get data error:" + android.util.Log.getStackTraceString(e17));
        }
        if (facePreviewingAdvise != null && facePreviewingAdvise != com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS && facePreviewingAdvise != com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            this.continuousCount = 0;
            sendFSMEvent(convertAdvise(facePreviewingAdvise), com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
            moveToNextState();
            return;
        }
        int intValue = ((java.lang.Integer) stateByName.getStateDataBy("shelter_state")).intValue();
        if (intValue != 0) {
            this.continuousCount = 0;
            sendFSMEvent(convertPrevJudge(intValue), com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
            moveToNextState();
            return;
        }
        int i27 = this.continuousCount;
        if (i27 <= this.continuousQualityNumThreshold || faceStatus == null) {
            this.continuousCount = i27 + 1;
            sendFSMEvent(com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS);
            moveToNextState();
            return;
        }
        com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData = new com.tencent.youtu.sdkkitframework.common.YTImageData();
        yTImageData.imgData = bArr;
        yTImageData.width = i17;
        yTImageData.height = i18;
        try {
            yTImageData.imgData = yTImageData.yuv2JPEG(95);
            yTImageData.xys = faceStatus.xys;
            this.stateData.put("quality_best_image", yTImageData);
        } catch (java.lang.Exception e18) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "quality best img yuv to JPEG error:" + android.util.Log.getStackTraceString(e18));
        }
        this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE;
        moveToNextState();
    }
}
