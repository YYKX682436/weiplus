package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class ActionLivenessState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final java.lang.String TAG = "ActionLivenessState";
    private com.tencent.youtu.ytposedetect.data.YTActRefData actReflectData;
    private int actionCurrentIndex;
    private java.lang.String[] actionDataParsed;
    private com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame actionFrameHandler;
    private int actionVideoShortenStrategy;
    private java.lang.String anchorWidths;
    private int currentRotateState;
    private com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatus;
    private boolean isReportEncodeVideoError;
    private com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam mOriginParam;
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName nextStateName;
    private com.tencent.youtu.sdkkitframework.liveness.YtVideoEncoderHelper videoEncoder;
    private java.lang.String legitimatePoseVersion = "3.5.4";
    private int continuousDetectCount = 0;
    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise poseState = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    private int actionLiveType = 1;
    private int actionContinuousFailedCount = 0;
    private boolean isActionFinished = false;
    private boolean isLoadResourceOnline = false;
    private java.lang.String innerMp4Path = android.os.Environment.getExternalStorageDirectory().getPath() + "/temp.mp4";
    private int securityLevel = 1;
    private boolean needLocalConfig = false;
    private int codecSettingBitRate = 2097152;
    private int codecSettingFrameRate = 30;
    private int codecSettingiFrameInterval = 1;
    private java.lang.String extraTips = "";
    private boolean needManualTrigger = false;
    private int poseReadyCount = 0;
    private int stableCountNum = 5;
    private java.lang.String controlConfig = "";
    int actReflectUXMode = 0;
    private boolean needCheckMultiFaces = false;
    private float secondaryYawThreshold = 16.0f;
    private float secondaryPitchThreshold = 18.0f;
    private float secondaryRollThreshold = 16.0f;
    private float secondaryCloseMouthThreshold = 0.38f;
    boolean needActionBestImageRigorous = false;

    public static /* synthetic */ int access$808(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState actionLivenessState) {
        int i17 = actionLivenessState.actionContinuousFailedCount;
        actionLivenessState.actionContinuousFailedCount = i17 + 1;
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean changeToNextAction(java.lang.String[] strArr, int i17) {
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "currentIndex: " + i17);
        if (strArr.length == 0) {
            return false;
        }
        this.actionCurrentIndex = i17;
        if (i17 >= strArr.length) {
            return false;
        }
        int parseInt = java.lang.Integer.parseInt(strArr[i17]);
        if (parseInt == 0 || parseInt == 1) {
            this.actionLiveType = 1;
        } else if (parseInt == 2) {
            this.actionLiveType = 2;
        } else if (parseInt == 3) {
            this.actionLiveType = 3;
        } else if (parseInt == 4) {
            this.actionLiveType = 4;
        } else if (parseInt == 5) {
            this.actionLiveType = 5;
        }
        this.stateData.put("current_action_type", java.lang.Integer.valueOf(parseInt));
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "action check rounds: " + this.actionCurrentIndex + "start check pose: " + this.actionLiveType);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", null);
        this.poseReadyCount = 0;
        return true;
    }

    private void clearData() {
        this.actionContinuousFailedCount = 0;
        this.isActionFinished = false;
        this.actionCurrentIndex = -1;
        this.poseReadyCount = 0;
        this.poseState = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
        changeToNextAction(this.actionDataParsed, (-1) + 1);
        this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            this.videoEncoder.reset();
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "video error:" + android.util.Log.getStackTraceString(e17));
        }
        startPose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getTipsByPoseType(int i17) {
        if (i17 == 1) {
            return com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_BLINK;
        }
        if (i17 == 2) {
            return com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_OPEN_MOUTH;
        }
        if (i17 == 4) {
            return com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SHAKE_HEAD;
        }
        if (i17 == 3) {
            return com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_NOD_HEAD;
        }
        if (i17 == 5) {
            return com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SILENCE;
        }
        return com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_ERROR + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String makeActionStr(java.lang.String[] strArr) {
        java.lang.String str = "";
        for (int i17 = 0; i17 < strArr.length; i17++) {
            int parseInt = java.lang.Integer.parseInt(strArr[i17]);
            if (parseInt == 0 || parseInt == 1) {
                str = str + "blink";
            } else if (parseInt == 2) {
                str = str + "mouth";
            } else if (parseInt == 3) {
                str = str + "node";
            } else if (parseInt == 4) {
                str = str + "shake";
            } else if (parseInt == 5) {
                str = str + "silence";
            }
            if (i17 != strArr.length - 1) {
                str = str + ",";
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void putBestImageAndMoveNextState(final byte[] bArr, int i17, int i18) {
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode workMode = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        if (workMode != ytSDKKitFrameworkWorkMode) {
            com.tencent.youtu.ytposedetect.YTPoseDetectInterface.getBestImage(new com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectGetBestImage() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.8
                @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectGetBestImage
                public void onGetBestImage(byte[] bArr2, int i19, int i27) {
                    if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE || com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE) {
                        ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("best_frame", new com.tencent.youtu.sdkkitframework.common.YTImageData(bArr2, i19, i27));
                    } else {
                        ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("best_frame", com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).getStateDataBy("best_image"));
                    }
                    byte[] bArr3 = bArr;
                    if (bArr3 != null && bArr3.length > 0) {
                        long time = new java.util.Date().getTime();
                        com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState actionLivenessState = com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this;
                        ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("config", com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getConfigData(bArr, actionLivenessState.makeActionStr(actionLivenessState.actionDataParsed), com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version().split("-")[0], java.lang.Long.toString(time)));
                    }
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
                }
            }, true);
        } else if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == ytSDKKitFrameworkWorkMode) {
            com.tencent.youtu.ytposedetect.YTPoseDetectInterface.getBestImage(new com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectGetBestImage() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.9
                @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectGetBestImage
                public void onGetBestImage(byte[] bArr2, int i19, int i27) {
                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("best_frame", new com.tencent.youtu.sdkkitframework.common.YTImageData(bArr2, i19, i27));
                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("act_reflect_data", com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actReflectData);
                    byte[] bArr3 = bArr;
                    if (bArr3 != null && bArr3.length > 0) {
                        long time = new java.util.Date().getTime();
                        com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState actionLivenessState = com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this;
                        ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("config", com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.getConfigData(bArr, actionLivenessState.makeActionStr(actionLivenessState.actionDataParsed), com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version().split("-")[0], java.lang.Long.toString(time)));
                    }
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECTION_CAMERA_RISK_STATE;
                }
            }, true);
        }
    }

    private void sendFSMEvent(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
    }

    private void startPose() {
        this.actionFrameHandler = new com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.6
            @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
            public void onCanReflect() {
                com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actReflectData = com.tencent.youtu.ytposedetect.YTPoseDetectInterface.getActReflectData();
            }

            @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
            public void onFailed(int i17, java.lang.String str, java.lang.String str2) {
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("pose state " + i17);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "YTPoseDetectInterface.poseDetect.onFailed: " + i17 + " s: " + str);
                com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.access$808(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this);
                int unused = com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actionContinuousFailedCount;
            }

            @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
            public void onRecordingDone(byte[][] bArr, int i17, int i18) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "收到视频上传通知，帧数：" + bArr.length + " 每帧width：" + i17 + " 每帧height: " + i18);
                com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.videoEncoder.makeActionVideoData(bArr, i17, i18);
                if (!com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.isActionFinished) {
                    com.tencent.youtu.ytposedetect.YTPoseDetectInterface.reset();
                    return;
                }
                try {
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.videoEncoder.stop();
                } catch (java.lang.Exception e17) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "encode stop error! " + android.util.Log.getStackTraceString(e17));
                }
                if (com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.videoEncoder.actionVideoFrames == null) {
                    byte[] videData = com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.videoEncoder.getVideData();
                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("frames", videData);
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.putBestImageAndMoveNextState(videData, i17, i18);
                } else {
                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this).stateData.put("frames", com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.videoEncoder.actionVideoFrames.toString().replace("\n", ""));
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState actionLivenessState = com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this;
                    actionLivenessState.controlConfig = actionLivenessState.videoEncoder.config;
                    com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE)).updateDataBy("control_config", com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.controlConfig);
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.putBestImageAndMoveNextState(null, i17, i18);
                }
            }

            @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
            public void onSuccess(int i17) {
                com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.extraTips = "";
                if (i17 == 1) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "Detect pose with sequence " + com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actionDataParsed.length);
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState actionLivenessState = com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this;
                    if (actionLivenessState.changeToNextAction(actionLivenessState.actionDataParsed, com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actionCurrentIndex + 1)) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "start check pose: " + com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actionLiveType);
                    } else {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "action seq all done");
                        com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.isActionFinished = true;
                    }
                } else if (i17 == -4) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.w(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "Act failed " + i17);
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.extraTips = com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_LIGHT_NOT_RIGHT;
                } else if (i17 == -5) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.w(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "Act failed " + i17);
                    com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.extraTips = com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SCREEN_SHAKING;
                } else if (i17 != -1 && i17 != 0) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.w(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "Act failed " + i17);
                }
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("pose state " + i17);
            }
        };
        com.tencent.youtu.ytposedetect.YTPoseDetectInterface.start(com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentAppContext, com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentCamera, com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentCameraId, new com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.7
            @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
            public void onFailed(int i17, java.lang.String str, java.lang.String str2) {
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(i17, "failed to init pose sdk");
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(i17) { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.7.1
                    final /* synthetic */ int val$initR;

                    {
                        this.val$initR = i17;
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED));
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR, "Init YtPose SDK failed with " + i17));
                    }
                });
                com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
            }

            @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
            public void onSuccess() {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.TAG, "start success");
            }
        });
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        try {
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.continuousDetectCount = ((java.lang.Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.faceStatus = (com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[]) stateByName.getStateDataBy("face_status");
            this.poseState = (com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null && !this.needLocalConfig) {
                java.lang.String str = (java.lang.String) stateByName2.getStateDataBy("action_data");
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "action data :" + str);
                java.lang.String[] split = str.split(",");
                this.actionDataParsed = split;
                int length = split.length;
                int i17 = this.actionCurrentIndex;
                if (length > i17) {
                    int parseInt = java.lang.Integer.parseInt(split[i17]);
                    if (parseInt == 0 || parseInt == 1) {
                        this.actionLiveType = 1;
                    } else if (parseInt == 2) {
                        this.actionLiveType = 2;
                    } else if (parseInt == 3) {
                        this.actionLiveType = 3;
                    } else if (parseInt == 4) {
                        this.actionLiveType = 4;
                    } else if (parseInt == 5) {
                        this.actionLiveType = 5;
                    }
                    this.stateData.put("current_action_type", java.lang.Integer.valueOf(parseInt));
                }
            }
            if (this.actReflectUXMode == 1) {
                this.actionLiveType = 5;
                this.actionDataParsed = new java.lang.String[]{"5"};
            }
            this.stateData.put("action_seq", this.actionDataParsed);
            if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                java.lang.String[] split2 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version().split("-");
                java.lang.String makeActionStr = com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.makeActionStr(this.actionDataParsed);
                if (stateByName2 != null) {
                    com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.setColorData((java.lang.String) stateByName2.getStateDataBy("color_data"), split2[0], makeActionStr);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "action enter failed " + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.common.CommonUtils.reportException("action enter failed ", e17);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", null);
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (stateByName != null) {
            try {
                java.lang.Object stateDataBy = stateByName.getStateDataBy("video_bitrate");
                if (stateDataBy != null) {
                    this.codecSettingBitRate = ((java.lang.Integer) stateDataBy).intValue();
                }
                java.lang.Object stateDataBy2 = stateByName.getStateDataBy("video_framerate");
                if (stateDataBy2 != null) {
                    this.codecSettingFrameRate = ((java.lang.Integer) stateDataBy2).intValue();
                }
                java.lang.Object stateDataBy3 = stateByName.getStateDataBy("video_iframeinterval");
                if (stateDataBy3 != null) {
                    this.codecSettingiFrameInterval = ((java.lang.Integer) stateDataBy3).intValue();
                }
                java.lang.String str = (java.lang.String) stateByName.getStateDataBy("control_config");
                if (str != null) {
                    this.controlConfig = str;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "action enter first failed:" + e17.getLocalizedMessage());
            }
        }
        this.videoEncoder = new com.tencent.youtu.sdkkitframework.liveness.YtVideoEncoderHelper(this.innerMp4Path, this.codecSettingBitRate, this.codecSettingFrameRate, this.codecSettingiFrameInterval, this.controlConfig);
        if (!android.text.TextUtils.isEmpty(this.controlConfig)) {
            java.lang.String[] split = this.controlConfig.split("&");
            if (split.length > 0) {
                for (java.lang.String str2 : split) {
                    java.lang.String[] split2 = str2.split("=");
                    if (split2.length > 1 && split2[0].equals("actref_ux_mode")) {
                        this.actReflectUXMode = java.lang.Integer.parseInt(split2[1]);
                    }
                    if (split2.length > 1 && split2[0].equals("action_video_shorten_strategy")) {
                        int parseInt = java.lang.Integer.parseInt(split2[1]);
                        this.actionVideoShortenStrategy = parseInt;
                        com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.updateParam("action_video_shorten_strategy", java.lang.String.valueOf(parseInt));
                    }
                }
            }
        }
        com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam yTFaceTrackParam = this.mOriginParam;
        yTFaceTrackParam.detect_interval = 30;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceTrackParam(yTFaceTrackParam);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.needManualTrigger && ytFrameworkFireEventType == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            clearData();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadStateWith(java.lang.String r23, org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.loadStateWith(java.lang.String, org.json.JSONObject):void");
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.nextStateName == com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
            return;
        }
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceTrackParam(this.mOriginParam);
        com.tencent.youtu.ytposedetect.YTPoseDetectInterface.stop();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        clearData();
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        if (com.tencent.youtu.ytposedetect.YTPoseDetectInterface.isDetecting()) {
            com.tencent.youtu.ytposedetect.YTPoseDetectInterface.stop();
        }
        com.tencent.youtu.ytposedetect.YTPoseDetectInterface.releaseModel();
        com.tencent.youtu.sdkkitframework.liveness.YtVideoEncoderHelper ytVideoEncoderHelper = this.videoEncoder;
        if (ytVideoEncoderHelper != null) {
            ytVideoEncoderHelper.unload();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        int i27;
        int i28;
        super.update(bArr, i17, i18, i19, j17);
        com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatusArr = this.faceStatus;
        if (faceStatusArr != null && faceStatusArr.length > 0 && (i27 = this.continuousDetectCount) > 0) {
            if (i27 <= 1 || (this.needCheckMultiFaces && faceStatusArr.length > 1)) {
                this.poseReadyCount = this.stableCountNum;
                com.tencent.youtu.ytposedetect.YTPoseDetectInterface.reset();
            }
            if (this.needActionBestImageRigorous && (((i28 = this.actionLiveType) == 1 || i28 == 2) && (java.lang.Math.abs(this.faceStatus[0].pitch) >= this.secondaryPitchThreshold || java.lang.Math.abs(this.faceStatus[0].yaw) >= this.secondaryYawThreshold || java.lang.Math.abs(this.faceStatus[0].roll) >= this.secondaryRollThreshold))) {
                sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.10
                    {
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_INCORRECT);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
                    }
                });
                moveToNextState();
                return;
            }
            if (this.needActionBestImageRigorous && this.actionLiveType == 1 && com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.ProcessHelper.calcMouthScore(this.faceStatus[0].xys) > this.secondaryCloseMouthThreshold) {
                sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.11
                    {
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_FACE_CLOSE_MOUTH);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_NOTPASS);
                    }
                });
                moveToNextState();
                return;
            }
            if (this.actionFrameHandler == null) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "FrameHandle is null, check init first");
                return;
            }
            if (this.poseReadyCount > this.stableCountNum + 10 && !this.isActionFinished) {
                sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.12
                    {
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_EXTRA_TIPS, com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.extraTips);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.getTipsByPoseType(com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.this.actionLiveType));
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS);
                    }
                });
            }
            this.poseReadyCount++;
            com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus = this.faceStatus[0];
            float[] fArr = faceStatus.xys;
            float[] fArr2 = faceStatus.pointsVis;
            int i29 = this.actionLiveType;
            android.hardware.Camera camera = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentCamera;
            com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus2 = this.faceStatus[0];
            com.tencent.youtu.ytposedetect.YTPoseDetectInterface.poseDetect(fArr, fArr2, i29, bArr, camera, faceStatus2.pitch, faceStatus2.yaw, faceStatus2.roll, this.actionFrameHandler, 1);
        }
        moveToNextState();
    }
}
