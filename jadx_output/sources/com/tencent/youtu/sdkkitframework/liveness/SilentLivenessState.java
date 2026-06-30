package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class SilentLivenessState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final int CONTINUOUS_DETECT_COUNT = 3;
    private static int FIX_EYE_MOUTH = 5;
    private static int REFINE_CONFIG_OFF = 8197;
    private static final java.lang.String TAG = "SilentLivenessState";
    private int cameraRotateState;
    private int invalidPointCount;
    private float maskHeightRatio;
    private float maskWidthRatio;
    private int previewHeight;
    private int previewWidth;
    private int detectAvailableCount = 0;
    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise prevAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    private int prevJudge = -1;
    private boolean isLoadResourceOnline = false;
    private java.lang.String resourceDownloadPath = "";
    private boolean isFirstStablePass = false;
    private com.tencent.youtu.sdkkitframework.common.TimeoutCounter countdowner = new com.tencent.youtu.sdkkitframework.common.TimeoutCounter("Liveness timeout counter");
    private com.tencent.youtu.sdkkitframework.common.TimeoutCounter predetectCountdowner = new com.tencent.youtu.sdkkitframework.common.TimeoutCounter("Predetect timeout counter");
    private boolean needManualTrigger = false;
    private float eyeOpenThreshold = 0.22f;
    private boolean needCheckEyeOpen = false;
    private int pitchThreshold = 30;
    private int yawThreshold = 25;
    private int rollThreshold = 25;
    private float blurDetectThreshold = 0.3f;
    private float bigfaceThreshold = 0.8f;
    private float smallfaceThreshold = 0.5f;
    private boolean needTimeoutTimer = false;
    private int continueCloseEyeCount = 0;
    private int sameFaceTipCount = 0;
    private boolean triggerLiveBeginEventFlag = false;
    private boolean needBigFaceMode = true;
    private int detectIntervalCount = 5;
    private int stableCountNum = 5;
    private float maxEyeScore = -1.0E10f;
    private float minEyeScore = 1.0E10f;
    private float maxMouthScore = -1.0E10f;
    private float minMouthScore = 1.0E10f;
    private float maxInRectRatio = -1.0E10f;
    private boolean tipFilterFlag = true;
    private float inRectThreshold = 0.7f;
    private float maxShelterScore = -1.0E10f;
    private float bigFaceThresholdBuffer = 0.05f;
    private float smallFaceThresholdBuffer = 0.05f;
    private float poseThresholdBuffer = 0.05f;
    private float stableRoiThreshold = 0.9f;
    private int stableFaceCount = 0;
    private int unstableCount = 0;
    private android.graphics.Rect previousFaceRect = null;
    private boolean needCheckShelter = true;
    private boolean needCheckPose = false;
    private int continueNoValidFaceCount = 0;
    private int continueNovalidFaceCountThreshold = 5;
    float intersectRatio = -1.0E10f;
    private int currentShelterJudge = -1;
    private int continueShelterJudgeCount = 0;
    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise currentAdviseTip = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS;
    private java.lang.String extraTips = "";
    private int frameNum = 0;
    private boolean needCheckMultiFaces = false;
    private boolean needFaceDirectionDetect = false;
    private int previousShelterJudge = 0;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$3, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode;

        static {
            int[] iArr = new int[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values().length];
            $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode = iArr;
            try {
                iArr[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum FacePreviewingAdvise {
        ADVISE_PASS,
        ADVISE_NO_FACE,
        ADVISE_TOO_FAR,
        ADVISE_TOO_CLOSE,
        ADVISE_NOT_IN_RECT,
        ADVISE_INCORRECT_POSTURE,
        ADVISE_EYE_CLOSE,
        ADVISE_TOO_MANY_FACE,
        ADVISE_INCOMPLETE_FACE,
        ADVISE_INBUFFER_PASS,
        ADVISE_NAN,
        FACE_INSIDE,
        FACE_MOVE_LEFT,
        FACE_MOVE_RIGHT,
        FACE_MOVE_UP,
        FACE_MOVE_DOWN
    }

    private void checkBestImage(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus, android.graphics.YuvImage yuvImage, float f17) {
        float calcEyeScore = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.ProcessHelper.calcEyeScore(faceStatus.xys);
        float calcMouthScore = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.ProcessHelper.calcMouthScore(faceStatus.xys);
        float f18 = 0.0f;
        int i17 = 0;
        while (true) {
            float[] fArr = faceStatus.pointsVis;
            if (i17 >= fArr.length) {
                break;
            }
            f18 += fArr[i17];
            i17++;
        }
        if (this.stableFaceCount < this.stableCountNum) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "stable count " + this.stableFaceCount);
            return;
        }
        float f19 = this.intersectRatio;
        if (f19 < this.maxInRectRatio - 0.05d) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "test3 shelter score " + f18 + " inRectThreshold " + this.intersectRatio + " (" + this.maxInRectRatio + ") eye " + calcEyeScore + " mouth " + calcMouthScore);
            return;
        }
        this.maxInRectRatio = f19;
        if (this.needCheckShelter) {
            if (this.maxShelterScore > f18) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "test1 shelter score " + f18 + " inRectThreshold " + this.intersectRatio + " eye " + calcEyeScore + " mouth " + calcMouthScore);
                return;
            }
            this.maxShelterScore = f18;
        }
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "test2 shelter score " + f18 + " inRectThreshold " + this.intersectRatio + " eye " + calcEyeScore + " mouth " + calcMouthScore);
        if (calcEyeScore >= this.maxEyeScore - 0.05d && calcMouthScore <= java.lang.Math.max(this.minMouthScore, 15.0f)) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "best shelter score " + f18 + " inRectThreshold " + this.intersectRatio);
            this.maxEyeScore = calcEyeScore;
            this.minMouthScore = calcMouthScore;
            this.stateData.put("best_image", yuvImage);
            this.stateData.put("best_shape", faceStatus.xys);
            this.stateData.put("best_face_status", faceStatus);
        }
        if (calcEyeScore < this.minEyeScore) {
            this.minEyeScore = calcEyeScore;
            this.stateData.put("closeeye_image", yuvImage);
            this.stateData.put("closeeye_shape", faceStatus.xys);
            this.stateData.put("closeeye_face_status", faceStatus);
        }
        if (calcMouthScore > this.maxMouthScore) {
            this.maxMouthScore = calcMouthScore;
            this.stateData.put("openmouth_image", yuvImage);
            this.stateData.put("openmouth_shape", faceStatus.xys);
            this.stateData.put("openmouth_face_status", faceStatus);
        }
    }

    public static java.lang.String convertAdvise(com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise) {
        return (facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NOT_IN_RECT ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_NOT_IN_RECT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_FAR ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_CLOSER : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_CLOSE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_FARER : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INCORRECT_POSTURE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_INCORRECT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_FACE : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_EYE_CLOSE ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_OPEN_EYE : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_LEFT ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_LEFT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_RIGHT ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_RIGHT : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_UP ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_UP : facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_DOWN ? com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_MOVE_DOWN : com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SILENCE;
    }

    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise faceLocationDetect(android.graphics.Rect rect, android.graphics.Rect rect2) {
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_INSIDE;
        int i17 = rect.left;
        int i18 = rect2.left;
        if (i17 >= i18 && rect.right <= rect2.right && rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
            return facePreviewingAdvise;
        }
        int i19 = ((i17 + rect.right) / 2) - ((i18 + rect2.right) / 2);
        int i27 = ((rect.top + rect.bottom) / 2) - ((rect2.top + rect2.bottom) / 2);
        return (i19 >= 0 || i27 <= 0) ? (i19 <= 0 || i27 >= 0) ? (i19 <= 0 || i27 <= 0) ? (i19 >= 0 || i27 >= 0) ? facePreviewingAdvise : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_RIGHT : com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_UP : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_LEFT : com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_DOWN : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_LEFT : com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_UP : java.lang.Math.abs(i19) > java.lang.Math.abs(i27) ? com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_RIGHT : com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.FACE_MOVE_DOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01af, code lost:
    
        if (r11 <= (r9.bigfaceThreshold + r9.bigFaceThresholdBuffer)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b1, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f3, code lost:
    
        if (r11 >= (r9.smallfaceThreshold - r9.smallFaceThresholdBuffer)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0279, code lost:
    
        if (java.lang.Math.abs(r12.roll) <= (r9.rollThreshold + r9.poseThresholdBuffer)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise getFacePreviewAdvise(android.graphics.Rect r10, android.graphics.Rect r11, com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus r12) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.getFacePreviewAdvise(android.graphics.Rect, android.graphics.Rect, com.tencent.youtu.ytfacetrack.YTFaceTrack$FaceStatus):com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState$FacePreviewingAdvise");
    }

    private android.graphics.Rect getFaceRect(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus) {
        float[] fArr = faceStatus.xys;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = f17;
        float f27 = f19;
        int i17 = 0;
        float f28 = f18;
        while (i17 < 180) {
            f19 = java.lang.Math.min(f19, faceStatus.xys[i17]);
            f27 = java.lang.Math.max(f27, faceStatus.xys[i17]);
            int i18 = i17 + 1;
            f18 = java.lang.Math.min(f18, faceStatus.xys[i18]);
            f28 = java.lang.Math.max(f28, faceStatus.xys[i18]);
            i17 = i18 + 1;
        }
        int i19 = this.previewWidth;
        float f29 = (i19 - 1) - f19;
        float f37 = (float) (((i19 - 1) - f27) - (((f29 - r4) * 0.1d) / 2.0d));
        float f38 = (float) (f29 + (((f29 - f37) * 0.1d) / 2.0d));
        float f39 = (float) (f18 - (((f28 - f18) * 0.1d) / 2.0d));
        float f47 = (float) (f28 + (((f28 - f39) * 0.1d) / 2.0d));
        if (f37 < 0.0f) {
            f37 = 0.0f;
        }
        if (f38 < 0.0f) {
            f38 = 0.0f;
        }
        if (f37 > i19 - 1) {
            f37 = i19 - 1;
        }
        if (f38 > i19 - 1) {
            f38 = i19 - 1;
        }
        if (f39 < 0.0f) {
            f39 = 0.0f;
        }
        if (f47 < 0.0f) {
            f47 = 0.0f;
        }
        int i27 = this.previewHeight;
        if (f39 > i27 - 1) {
            f39 = i27 - 1;
        }
        if (f47 > i27 - 1) {
            f47 = i27 - 1;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) f37;
        rect.top = (int) f39;
        rect.right = (int) f38;
        rect.bottom = (int) f47;
        return rect;
    }

    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise getPoseJudge(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatusArr) {
        com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus = faceStatusArr[0];
        android.graphics.Rect faceRect = getFaceRect(faceStatus);
        android.graphics.Rect rect = this.previousFaceRect;
        if (rect == null) {
            this.previousFaceRect = faceRect;
            this.stableFaceCount = 0;
        } else {
            android.graphics.Rect intersectionRect = getIntersectionRect(faceRect, rect);
            if (faceRect.height() != 0 && faceRect.width() != 0) {
                float abs = java.lang.Math.abs(((intersectionRect.width() * intersectionRect.height()) / faceRect.height()) / faceRect.width());
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "pose ratio " + abs);
                if (abs < this.stableRoiThreshold) {
                    this.extraTips = com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SCREEN_SHAKING;
                    this.stableFaceCount = 0;
                } else {
                    this.extraTips = "";
                    this.stableFaceCount++;
                }
            }
            this.previousFaceRect = faceRect;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "rect is: " + faceRect.left + ", " + faceRect.top + ", " + faceRect.right + ", " + faceRect.bottom);
        return getFacePreviewAdvise(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getDetectRect(), faceRect, faceStatus);
    }

    private int getShelterJudge(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatusArr) {
        int shelterJudge = com.tencent.youtu.ytcommon.tools.YTFaceUtils.shelterJudge(faceStatusArr[0].pointsVis);
        if (this.currentShelterJudge != shelterJudge) {
            this.continueShelterJudgeCount = 0;
            this.currentShelterJudge = shelterJudge;
        } else {
            this.continueShelterJudgeCount++;
        }
        if (this.frameNum >= 7 && this.continueShelterJudgeCount < 7) {
            return this.previousShelterJudge;
        }
        this.previousShelterJudge = this.currentShelterJudge;
        return shelterJudge;
    }

    private void initYoutuInstance() {
        com.tencent.youtu.ytfacetrack.YTFaceTrack.setLoggerListener(new com.tencent.youtu.ytfacetrack.YTFaceTrack.IYtLoggerListener() { // from class: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.1
            @Override // com.tencent.youtu.ytfacetrack.YTFaceTrack.IYtLoggerListener
            public void log(java.lang.String str, java.lang.String str2) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, str2);
            }
        });
        android.content.Context context = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentAppContext;
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.isLoadResourceOnline) {
            absolutePath = this.resourceDownloadPath;
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Use online path:" + absolutePath);
        } else {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Use local path:" + absolutePath);
        }
        java.lang.String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        if (!this.isLoadResourceOnline) {
            for (int i17 = 0; i17 < 4; i17++) {
                java.lang.String str = strArr[i17];
                android.content.res.AssetManager assets = context.getAssets();
                com.tencent.youtu.sdkkitframework.common.FileUtils.copyAsset(assets, "FaceTrackModels/detector/" + str, absolutePath + "/" + str);
            }
        }
        java.lang.String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        if (!this.isLoadResourceOnline) {
            for (int i18 = 0; i18 < 5; i18++) {
                java.lang.String str2 = strArr2[i18];
                android.content.res.AssetManager assets2 = context.getAssets();
                com.tencent.youtu.sdkkitframework.common.FileUtils.copyAsset(assets2, "FaceTrackModels/ufa/" + str2, absolutePath + "/" + str2);
            }
        }
        java.lang.String[] strArr3 = {"rotBasis.bin"};
        if (!this.isLoadResourceOnline) {
            java.lang.String str3 = strArr3[0];
            android.content.res.AssetManager assets3 = context.getAssets();
            com.tencent.youtu.sdkkitframework.common.FileUtils.copyAsset(assets3, "FaceTrackModels/poseest/" + str3, absolutePath + "/" + str3);
        }
        int GlobalInit = com.tencent.youtu.ytfacetrack.YTFaceTrack.GlobalInit(absolutePath + "/");
        if (GlobalInit != 0) {
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(GlobalInit) { // from class: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.2
                final /* synthetic */ int val$r;

                {
                    this.val$r = GlobalInit;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with " + GlobalInit));
                }
            });
            return;
        }
        com.tencent.youtu.ytfacetrack.param.YTFaceAlignParam GetFaceAlignParam = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceAlignParam();
        GetFaceAlignParam.net_fix_config = FIX_EYE_MOUTH;
        GetFaceAlignParam.refine_config = REFINE_CONFIG_OFF;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceAlignParam(GetFaceAlignParam);
        com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam GetFaceDetectParam = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceDetectParam();
        java.lang.String str4 = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str4, "big face mode" + this.needBigFaceMode);
        GetFaceDetectParam.bigger_face_mode = this.needBigFaceMode;
        GetFaceDetectParam.min_face_size = java.lang.Math.max(java.lang.Math.min(this.previewWidth, this.previewHeight) / 5, 40);
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceDetectParam(GetFaceDetectParam);
        com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam GetFaceTrackParam = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceTrackParam();
        GetFaceTrackParam.need_pose_estimate = true;
        GetFaceTrackParam.detect_interval = this.detectIntervalCount;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceTrackParam(GetFaceTrackParam);
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str4, "Detect version:" + com.tencent.youtu.ytfacetrack.YTFaceTrack.Version);
    }

    private boolean isActionStage() {
        return com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
    }

    private void sendFSMEvent(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    private void sendFaceStatusUITips(com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise, int i17) {
        int i18;
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise2 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS;
        if ((facePreviewingAdvise == facePreviewingAdvise2 || facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && i17 == 0) {
            this.detectAvailableCount++;
        } else {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
            this.detectAvailableCount = 0;
        }
        if (facePreviewingAdvise == this.prevAdvise && i17 == this.prevJudge) {
            this.sameFaceTipCount++;
        } else {
            this.sameFaceTipCount = 0;
        }
        if (this.tipFilterFlag && this.sameFaceTipCount > 3 && this.currentAdviseTip == facePreviewingAdvise) {
            return;
        }
        this.prevAdvise = facePreviewingAdvise;
        this.prevJudge = i17;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, " tips:" + convertAdvise(this.currentAdviseTip));
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise3 = this.currentAdviseTip;
        if (facePreviewingAdvise3 != facePreviewingAdvise2 && facePreviewingAdvise3 != com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, convertAdvise(facePreviewingAdvise3));
        } else if (i17 == 1) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_LEFT_FACE);
        } else if (i17 == 2) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_CHIN);
        } else if (i17 == 3) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_MOUTH);
        } else if (i17 == 4) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_RIGHT_FACE);
        } else if (i17 == 5) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_NOSE);
        } else if (i17 == 6) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_RIGHT_EYE);
        } else if (i17 == 7) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_LEFT_EYE);
        } else if (i17 == 0 && (i18 = this.sameFaceTipCount) > 2 && i18 < 5) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP);
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS);
        }
        java.lang.String str = this.extraTips;
        if (str != "") {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_EXTRA_TIPS, str);
        }
        sendFSMEvent(hashMap);
    }

    private void sendUITipEvent(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatusArr) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        if (faceStatusArr == null) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_FACE);
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
            this.detectAvailableCount = 0;
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE;
            this.prevAdvise = facePreviewingAdvise;
            this.currentAdviseTip = facePreviewingAdvise;
        } else if (faceStatusArr.length > 1) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_TOO_MANY_FACES);
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
            hashMap.put("ui_error", "Failed");
            if (this.needCheckMultiFaces) {
                this.detectAvailableCount = 0;
                this.prevAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE;
            }
            this.currentAdviseTip = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE;
        } else {
            com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise poseJudge = getPoseJudge(faceStatusArr);
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "advise " + poseJudge);
            sendFaceStatusUITips(poseJudge, getShelterJudge(faceStatusArr));
        }
        if (hashMap.size() > 0) {
            sendFSMEvent(hashMap);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        if (this.needManualTrigger) {
            this.predetectCountdowner.start();
        } else {
            this.countdowner.start();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    public android.graphics.Rect getIntersectionRect(android.graphics.Rect rect, android.graphics.Rect rect2) {
        return new android.graphics.Rect(java.lang.Math.max(rect.left, rect2.left), java.lang.Math.max(rect.top, rect2.top), java.lang.Math.min(rect.right, rect2.right), java.lang.Math.min(rect.bottom, rect2.bottom));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.needManualTrigger) {
            if (ytFrameworkFireEventType == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS) {
                this.detectAvailableCount = 0;
                this.triggerLiveBeginEventFlag = true;
                resetTimeout();
            } else if (ytFrameworkFireEventType == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
                this.detectAvailableCount = 0;
                this.triggerLiveBeginEventFlag = false;
                this.countdowner.cancel();
                this.predetectCountdowner.reset();
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleStateAction(java.lang.String str, java.lang.Object obj) {
        super.handleStateAction(str, obj);
        if (!str.equals("reset_timeout")) {
            if (str.equals("reset_manual_trigger")) {
                this.triggerLiveBeginEventFlag = false;
                this.countdowner.cancel();
                return;
            }
            return;
        }
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "predetect status:" + this.predetectCountdowner.isRunning());
        if (this.predetectCountdowner.isRunning()) {
            return;
        }
        resetTimeout();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("need_face_direction_detect")) {
                this.needFaceDirectionDetect = jSONObject.getBoolean("need_face_direction_detect");
            }
            if (jSONObject.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.resourceDownloadPath = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("timeout_countdown_ms")) {
                this.countdowner.init(java.lang.Math.max(0, java.lang.Math.min(30000, jSONObject.getInt("timeout_countdown_ms"))), true);
            }
            if (jSONObject.has("predetect_countdown_ms")) {
                this.predetectCountdowner.init(jSONObject.getInt("predetect_countdown_ms"), true);
            } else {
                this.predetectCountdowner.init(25000L, true);
            }
            if (jSONObject.has("same_tips_filter")) {
                this.tipFilterFlag = jSONObject.getBoolean("same_tips_filter");
            }
            if (jSONObject.has("manual_trigger")) {
                this.needManualTrigger = jSONObject.getBoolean("manual_trigger");
            }
            this.needCheckMultiFaces = jSONObject.optBoolean("need_check_multiface", false);
            updateSDKSetting(jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            com.tencent.youtu.sdkkitframework.common.FileUtils.loadLibrary("YTAGReflectLiveCheck");
        }
        android.hardware.Camera.Size previewSize = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentCamera.getParameters().getPreviewSize();
        int i17 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentRotateState;
        this.cameraRotateState = i17;
        if (i17 >= 5) {
            this.previewWidth = previewSize.height;
            this.previewHeight = previewSize.width;
        } else {
            this.previewWidth = previewSize.width;
            this.previewHeight = previewSize.height;
        }
        this.maskWidthRatio = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPreviewRect().width() / this.previewWidth;
        this.maskHeightRatio = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getPreviewRect().height() / this.previewHeight;
        initYoutuInstance();
        reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise;
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise2;
        super.moveToNextState();
        boolean z17 = this.needManualTrigger;
        if (!z17 || ((!this.needCheckPose || (facePreviewingAdvise2 = this.prevAdvise) == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise2 == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && !((this.needCheckMultiFaces && this.prevAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_TOO_MANY_FACE) || (facePreviewingAdvise = this.prevAdvise) == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INCOMPLETE_FACE || facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE))) {
            this.continueNoValidFaceCount = 0;
        } else {
            int i17 = this.continueNoValidFaceCount + 1;
            this.continueNoValidFaceCount = i17;
            if (i17 > this.continueNovalidFaceCountThreshold) {
                java.lang.String convertAdvise = convertAdvise(this.prevAdvise);
                java.lang.String makeMessageJson = com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(4194304, convertAdvise, "action check failed");
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(4194304, convertAdvise);
                java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 4194304);
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_REASON_CODE, 4194304);
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, makeMessageJson);
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                return;
            }
        }
        if (z17 && this.predetectCountdowner.checkTimeout()) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "predectcountdowner.checkTimeout(): " + this.predetectCountdowner.checkTimeout());
            this.predetectCountdowner.cancel();
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.countdowner.checkTimeout()) {
            this.countdowner.cancel();
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "liveness timeout");
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.needManualTrigger || this.isFirstStablePass || this.detectAvailableCount > this.stableCountNum) {
            this.isFirstStablePass = true;
            this.predetectCountdowner.cancel();
            int i18 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.AnonymousClass3.$SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode().ordinal()];
            if (i18 == 1 || i18 == 2) {
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            } else if (i18 == 3) {
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.START_CAMERA_RISK_STATE));
            } else {
                if (i18 != 4) {
                    return;
                }
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        this.prevAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
        this.detectAvailableCount = 0;
        this.continueCloseEyeCount = 0;
        this.frameNum = 0;
        this.triggerLiveBeginEventFlag = false;
        this.sameFaceTipCount = 0;
        this.maxEyeScore = -1.0E10f;
        this.minMouthScore = 1.0E10f;
        this.minEyeScore = 1.0E10f;
        this.maxMouthScore = -1.0E10f;
        this.maxShelterScore = -1.0E10f;
        this.isFirstStablePass = false;
        this.continueNoValidFaceCount = 0;
        this.invalidPointCount = 0;
        this.unstableCount = 0;
        this.maxInRectRatio = -1.0E10f;
        this.countdowner.cancel();
        this.predetectCountdowner.cancel();
        this.stableFaceCount = 0;
        this.currentShelterJudge = -1;
        this.previousFaceRect = null;
        if (this.needManualTrigger) {
            this.predetectCountdowner.reset();
        } else {
            this.countdowner.reset();
        }
        super.reset();
    }

    public void resetTimeout() {
        this.countdowner.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        try {
            com.tencent.youtu.ytfacetrack.YTFaceTrack.GlobalRelease();
        } catch (java.lang.Exception unused) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "SDK inner bug");
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        super.update(bArr, i17, i18, i19, j17);
        if (this.countdowner.checkTimeout() || (this.needManualTrigger && this.predetectCountdowner.checkTimeout())) {
            moveToNextState();
            return;
        }
        com.tencent.youtu.ytfacetrack.YTFaceTrack yTFaceTrack = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance();
        if (yTFaceTrack == null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Tracker is null, please check facetrack init result");
            return;
        }
        this.frameNum++;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage yTImage = new com.tencent.youtu.ytfacetrack.YTFaceTrack.YTImage();
        yTImage.width = i17;
        yTImage.height = i18;
        float[] fArr = new float[1];
        com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkBegin("detect");
        com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessYUVWithBlur = yTFaceTrack.DoDetectionProcessYUVWithBlur(bArr, i17, i18, this.cameraRotateState, true, fArr, yTImage);
        com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkEnd("detect");
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, com.tencent.youtu.sdkkitframework.common.CommonUtils.getBenchMarkTime("detect"));
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "Blur score:" + java.util.Arrays.toString(fArr));
        if (DoDetectionProcessYUVWithBlur != null) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "face status count " + DoDetectionProcessYUVWithBlur.length);
            if (DoDetectionProcessYUVWithBlur.length > 1) {
                int i27 = Integer.MIN_VALUE;
                int i28 = 0;
                for (int i29 = 0; i29 < DoDetectionProcessYUVWithBlur.length; i29++) {
                    android.graphics.Rect faceRect = getFaceRect(DoDetectionProcessYUVWithBlur[i29]);
                    int width = faceRect.width() * faceRect.height();
                    if (width >= i27) {
                        i28 = i29;
                        i27 = width;
                    }
                }
                if (i28 != 0) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "Found max face id:" + i28);
                    DoDetectionProcessYUVWithBlur[0] = DoDetectionProcessYUVWithBlur[i28];
                }
            }
        } else {
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "face status is null");
        }
        sendUITipEvent(DoDetectionProcessYUVWithBlur);
        this.stateData.put("pose_state", this.prevAdvise);
        this.stateData.put("shelter_state", java.lang.Integer.valueOf(this.prevJudge));
        this.stateData.put("face_status", DoDetectionProcessYUVWithBlur);
        this.stateData.put("continuous_detect_count", java.lang.Integer.valueOf(this.detectAvailableCount));
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(yTImage.data, 17, i18, i17, null);
        this.stateData.put("last_face_status", DoDetectionProcessYUVWithBlur);
        this.stateData.put("last_frame", yuvImage);
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise = this.prevAdvise;
        if (facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) {
            checkBestImage(DoDetectionProcessYUVWithBlur[0], yuvImage, fArr[0]);
        }
        if (this.stateData.get("best_image") != null) {
            boolean z17 = this.needManualTrigger;
            if (!z17 || (z17 && this.triggerLiveBeginEventFlag)) {
                moveToNextState();
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(org.json.JSONObject jSONObject) {
        try {
            if (jSONObject.has("check_eye_open")) {
                this.needCheckEyeOpen = jSONObject.getBoolean("check_eye_open");
            }
            if (jSONObject.has("open_eye_threshold")) {
                this.eyeOpenThreshold = (float) jSONObject.getDouble("open_eye_threshold");
            }
            if (jSONObject.has("pitch_threshold")) {
                this.pitchThreshold = jSONObject.getInt("pitch_threshold");
            }
            if (jSONObject.has("yaw_threshold")) {
                this.yawThreshold = jSONObject.getInt("yaw_threshold");
            }
            if (jSONObject.has("roll_threshold")) {
                this.rollThreshold = jSONObject.getInt("roll_threshold");
            }
            if (jSONObject.has("smallface_ratio_threshold")) {
                this.smallfaceThreshold = (float) jSONObject.getDouble("smallface_ratio_threshold");
            }
            if (jSONObject.has("bigface_ratio_threshold")) {
                this.bigfaceThreshold = (float) jSONObject.getDouble("bigface_ratio_threshold");
            }
            if (jSONObject.has("blur_detect_threshold")) {
                this.blurDetectThreshold = (float) jSONObject.getDouble("blur_detect_threshold");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.needBigFaceMode = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("detect_interval")) {
                this.detectIntervalCount = jSONObject.getInt("detect_interval");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.stableCountNum = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            if (jSONObject.has("force_pose_check")) {
                this.needCheckPose = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("novalid_face_count")) {
                this.continueNovalidFaceCountThreshold = jSONObject.getInt("novalid_face_count");
            }
            if (jSONObject.has("in_rect_ratio_threshold")) {
                this.inRectThreshold = (float) jSONObject.getDouble("in_rect_ratio_threshold");
            }
            if (jSONObject.has("need_check_shelter")) {
                this.needCheckShelter = jSONObject.getBoolean("need_check_shelter");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.stableRoiThreshold = (float) jSONObject.getDouble("stable_roi_threshold");
            }
            this.bigFaceThresholdBuffer = (float) jSONObject.optDouble("bigface_ratio_buffer", this.bigFaceThresholdBuffer);
            this.smallFaceThresholdBuffer = (float) jSONObject.optDouble("smallface_ratio_buffer", this.smallFaceThresholdBuffer);
            this.poseThresholdBuffer = (float) jSONObject.optDouble("pose_ratio_buffer", this.poseThresholdBuffer);
            this.stableRoiThreshold = (float) jSONObject.optDouble("stable_roi_threshold", this.stableRoiThreshold);
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }
}
