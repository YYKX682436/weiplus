package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class ReflectLivenessState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final java.lang.String TAG = "ReflectLivenessState";
    private com.tencent.youtu.ytposedetect.data.YTActRefData actRefData;
    private java.lang.String appId;
    private java.lang.String colorData;
    private com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatus;
    private com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam mOriginParam;
    private java.lang.String randomColorData;
    int reflectImagesShortenStrategy;
    private com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.SeleceData seleceData;
    private java.lang.String legitimateReflectVersion = "3.6.9.1";
    private com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise poseState = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
    private com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_TIPWAIT;
    private int continuousDetectCount = 0;
    private com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
    private boolean isLoadResourceOnline = false;
    private boolean needCheckFaces = true;
    private int simiThreshold = 70;
    private int securityLevel = 2;
    private boolean needLocalConfig = false;
    private int stableFrameCount = 5;
    private int backendProtoType = 0;
    private boolean needCheckPose = false;
    private java.lang.String extraConfig = "";
    private int changePointNum = 2;
    private boolean needRandom = false;
    private boolean needManualTrigger = false;
    private java.lang.String controlConfig = "";
    private int actReflectUXMode = 0;
    private com.tencent.youtu.sdkkitframework.common.TimeoutCounter tipsTimer = new com.tencent.youtu.sdkkitframework.common.TimeoutCounter("reflect tips timeout counter");
    private boolean needCheckMultiFaces = false;
    private int reflectBigFrameCount = 0;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState$11, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType;

        static {
            int[] iArr = new int[com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.values().length];
            $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType = iArr;
            try {
                iArr[com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_TIPWAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType[com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_INIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType[com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_REFLECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType[com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_FINISH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum ReflectProcessType {
        RPT_TIPWAIT,
        RPT_INIT,
        RPT_REFLECT,
        RPT_FINISH
    }

    private void clearData() {
        this.currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_TIPWAIT;
        this.continuousDetectCount = 0;
        this.poseState = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NAN;
        this.needCheckFaces = true;
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.cancel();
        this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.reflectBigFrameCount = 0;
    }

    private com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq getActionReflectLiveReq(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack fullPack, com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectData yTActReflectData, java.lang.String str) {
        com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq actionReflectReq = new com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq();
        actionReflectReq.app_id = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mAppId;
        actionReflectReq.color_data = str;
        actionReflectReq.platform = 2;
        actionReflectReq.select_data = yTActReflectData.select_data;
        if (fullPack != null) {
            actionReflectReq.reflect_data = translation(fullPack.AGin);
        }
        actionReflectReq.live_image = new com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo(yTActReflectData.best);
        actionReflectReq.eye_image = new com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo(yTActReflectData.eye);
        actionReflectReq.mouth_image = new com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo(yTActReflectData.mouth);
        actionReflectReq.compare_image = null;
        actionReflectReq.mode = 0;
        actionReflectReq.session_id = null;
        return actionReflectReq;
    }

    private com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq getReflectLiveReq(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack fullPack, java.lang.String str) {
        com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq reflectLiveReq = new com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq();
        reflectLiveReq.color_data = str;
        reflectLiveReq.platform = 2;
        if (fullPack != null) {
            reflectLiveReq.reflect_data = translation(fullPack.AGin);
            reflectLiveReq.live_image = null;
        }
        reflectLiveReq.compare_image = null;
        reflectLiveReq.session_id = null;
        reflectLiveReq.app_id = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.mAppId;
        return reflectLiveReq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFailure(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.e(str3, "failed :" + ("message:" + str + "\ntips:" + str2 + "\ncode:" + i17));
        java.lang.String convertAdvise = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.convertAdvise(this.poseState);
        java.lang.String makeMessageJson = com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(4194304, convertAdvise, str);
        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(i17, convertAdvise);
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 4194304);
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_REASON_CODE, java.lang.Integer.valueOf(i17));
        hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, makeMessageJson);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(hashMap);
        this.currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_FINISH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSuccess(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack fullPack) {
        if (this.currentProcessType == com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_TIPWAIT) {
            return;
        }
        if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            try {
                com.tencent.youtu.ytposedetect.data.YTActRefImage yTActRefImage = this.actRefData.best;
                com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage yTActReflectImage = new com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage(yTActRefImage.image, yTActRefImage.xys, yTActRefImage.checksum);
                com.tencent.youtu.ytposedetect.data.YTActRefImage yTActRefImage2 = this.actRefData.eye;
                com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage yTActReflectImage2 = new com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage(yTActRefImage2.image, yTActRefImage2.xys, yTActRefImage2.checksum);
                com.tencent.youtu.ytposedetect.data.YTActRefImage yTActRefImage3 = this.actRefData.mouth;
                com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq actionReflectLiveReq = getActionReflectLiveReq(fullPack, new com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectData(yTActReflectImage, yTActReflectImage2, new com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage(yTActRefImage3.image, yTActRefImage3.xys, yTActRefImage3.checksum), this.seleceData), this.colorData);
                actionReflectLiveReq.app_id = this.appId;
                android.graphics.Bitmap bitmap = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToCompare;
                if (bitmap != null) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i17 = width > height ? width : height;
                    if (i17 > 640) {
                        bitmap = imageScale(bitmap, (width * 640) / i17, (height * 640) / i17);
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "resize image. from w:" + width + " h:" + height + " to w:" + bitmap.getWidth() + " h:" + bitmap.getHeight());
                    }
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                    actionReflectLiveReq.compare_image = new com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo(new com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage(byteArrayOutputStream.toByteArray(), null, null));
                }
                actionReflectLiveReq.color_data = this.colorData;
                this.stateData.put("reflect_request_object", actionReflectLiveReq);
            } catch (java.lang.Exception e17) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "handle success failed: " + e17.getLocalizedMessage());
            }
        } else {
            com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq reflectLiveReq = getReflectLiveReq(fullPack, this.colorData);
            android.graphics.Bitmap bitmap2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().imageToCompare;
            if (bitmap2 != null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                int width2 = bitmap2.getWidth();
                int height2 = bitmap2.getHeight();
                int i18 = width2 > height2 ? width2 : height2;
                if (i18 > 640) {
                    bitmap2 = imageScale(bitmap2, (width2 * 640) / i18, (height2 * 640) / i18);
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "resize image. from w:" + width2 + " h:" + height2 + " to w:" + bitmap2.getWidth() + " h:" + bitmap2.getHeight());
                }
                bitmap2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream2);
                reflectLiveReq.compare_image = new java.lang.String(android.util.Base64.encode(byteArrayOutputStream2.toByteArray(), 2));
            }
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "on Request...");
            reflectLiveReq.color_data = this.colorData;
            reflectLiveReq.select_data = this.seleceData;
            this.stateData.put("reflect_request_object", reflectLiveReq);
        }
        this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECTION_END_CAMERA_RISK_STATE;
    }

    private static android.graphics.Bitmap imageScale(android.graphics.Bitmap bitmap, int i17, int i18) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i17 / width, i18 / height);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private void setupRequset() {
    }

    private void startReflect() {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.9
            {
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP);
            }
        });
        com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam yTFaceTrackParam = this.mOriginParam;
        java.lang.String str = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "param: " + yTFaceTrackParam);
        yTFaceTrackParam.detect_interval = -1;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceTrackParam(yTFaceTrackParam);
        this.currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_REFLECT;
        setupRequset();
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings aGSettings = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getAGSettings();
        aGSettings.safetylevel = this.securityLevel;
        aGSettings.isEncodeReflectData = false;
        aGSettings.isActionReflect = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode() == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.setAGSettings(aGSettings);
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "Settings: safetyLevel " + aGSettings.safetylevel);
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "Settings: isEncodeReflectData " + aGSettings.isEncodeReflectData);
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "Settings: isActionReflect " + aGSettings.isActionReflect);
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKPlatformContext context = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext();
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.start(context.currentAppContext, context.currentCamera, context.currentCameraId, this.colorData, new com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.10
            @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
            public void onFailed(int i17, java.lang.String str2, java.lang.String str3) {
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this.handleFailure(i17, str2, str3);
            }

            @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
            public void onSuccess(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack fullPack) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.TAG, "on start succeed!!!!!");
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this.handleSuccess(fullPack);
            }
        }, this.reflectBigFrameCount);
    }

    private com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData translation(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.DataPack dataPack) {
        com.tencent.youtu.sdkkitframework.common.YtLogger.d(TAG, "translation reflectImagesShortenStrategy：" + this.reflectImagesShortenStrategy);
        int i17 = 0;
        if (this.reflectImagesShortenStrategy == 1) {
            int i18 = 0;
            while (true) {
                com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData[] rawImgDataArr = dataPack.videoData;
                if (i18 >= rawImgDataArr.length) {
                    break;
                }
                if (i18 > 2 && i18 < rawImgDataArr.length - 2 && i18 % 2 != 0) {
                    rawImgDataArr[i18].frameBuffer = new byte[0];
                }
                i18++;
            }
        }
        com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData reflectColorData = new com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData();
        java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData> arrayList = new java.util.ArrayList<>();
        int i19 = 0;
        while (true) {
            com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData[] rawImgDataArr2 = dataPack.videoData;
            if (i19 >= rawImgDataArr2.length) {
                break;
            }
            arrayList.add(translation(rawImgDataArr2[i19]));
            i19++;
        }
        reflectColorData.setImages_data(arrayList);
        if (dataPack.refBigImgData != null) {
            java.util.ArrayList<com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData> arrayList2 = new java.util.ArrayList<>();
            int i27 = 0;
            while (true) {
                com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawRefBigImgData[] rawRefBigImgDataArr = dataPack.refBigImgData;
                if (i27 >= rawRefBigImgDataArr.length) {
                    break;
                }
                arrayList2.add(translation(rawRefBigImgDataArr[i27]));
                i27++;
            }
            reflectColorData.setBig_images_data(arrayList2);
        } else {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "dataPack.refBigImgData is null");
        }
        reflectColorData.setBegin_time(dataPack.beginTime);
        reflectColorData.setChangepoint_time(dataPack.changePointTime);
        reflectColorData.changepoint_time_list = new java.util.ArrayList<>();
        while (true) {
            long[] jArr = dataPack.changePointTimeList;
            if (i17 >= jArr.length) {
                break;
            }
            reflectColorData.changepoint_time_list.add(java.lang.Long.valueOf(jArr[i17]));
            i17++;
        }
        reflectColorData.setOffset_sys(dataPack.offsetSys);
        reflectColorData.setFrame_num(dataPack.frameNum);
        reflectColorData.setLandmark_num(dataPack.landMarkNum);
        reflectColorData.setWidth(dataPack.width);
        reflectColorData.setHeight(dataPack.height);
        reflectColorData.version = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION;
        try {
            reflectColorData.setLog(new java.lang.String(dataPack.log, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        reflectColorData.setConfig_begin(dataPack.config_begin);
        return reflectColorData;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.poseState = (com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise) stateByName.getStateDataBy("pose_state");
            this.continuousDetectCount = ((java.lang.Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.faceStatus = (com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[]) stateByName.getStateDataBy("face_status");
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null) {
                this.seleceData = (com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.SeleceData) stateByName2.getStateDataBy("select_data");
                if (!this.needLocalConfig) {
                    this.colorData = (java.lang.String) stateByName2.getStateDataBy("color_data");
                } else if (this.needRandom) {
                    this.colorData = this.randomColorData;
                }
                java.lang.String str = (java.lang.String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.controlConfig = str;
                }
            }
            if (!this.controlConfig.isEmpty()) {
                java.lang.String[] split = this.controlConfig.split("&");
                if (split.length > 0) {
                    for (java.lang.String str2 : split) {
                        java.lang.String[] split2 = str2.split("=");
                        if (split2.length > 1 && split2[0].equals("actref_ux_mode")) {
                            this.actReflectUXMode = java.lang.Integer.parseInt(split2[1]);
                        }
                        if (split2.length > 1 && split2[0].equals("reflect_images_shorten_strategy")) {
                            this.reflectImagesShortenStrategy = java.lang.Integer.parseInt(split2[1]);
                        }
                        if (split2.length > 1 && split2[0].equals("ref_big_frame_count")) {
                            this.reflectBigFrameCount = java.lang.Integer.parseInt(split2[1]);
                        }
                    }
                }
            }
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName3 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName3 != null) {
                this.actRefData = (com.tencent.youtu.ytposedetect.data.YTActRefData) stateByName3.getStateDataBy("act_reflect_data");
            }
            if (this.actReflectUXMode == 2) {
                this.currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_FINISH;
                handleSuccess(null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "reflection enter failed " + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.common.CommonUtils.reportException("reflection enter failed ", e17);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", null);
        this.tipsTimer.reset();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().cleanUpQueue();
        if (com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().getCurrentStateRiskData(com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData.StageName.stage_reflect) != null) {
            this.tipsTimer.cancel();
            this.currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_INIT;
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.needManualTrigger && ytFrameworkFireEventType == com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            clearData();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.simiThreshold = jSONObject.getInt("similarity_threshold");
            } else {
                this.simiThreshold = 70;
            }
            if (jSONObject.has("reflect_security_level")) {
                this.securityLevel = jSONObject.getInt("reflect_security_level");
            }
            if (jSONObject.has("local_config_flag")) {
                this.needLocalConfig = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("color_data")) {
                this.colorData = jSONObject.getString("color_data");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.stableFrameCount = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("backend_proto_type")) {
                this.backendProtoType = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("force_pose_check")) {
                this.needCheckPose = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("manual_trigger")) {
                this.needManualTrigger = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.tipsTimer.init(java.lang.Math.max(0, java.lang.Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
            if (jSONObject.has("control_config")) {
                this.controlConfig = jSONObject.getString("control_config");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
        java.lang.String str2 = TAG;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str2, "Reflection version:3.6.9.2");
        java.lang.String[] split = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.VERSION.split("\\.");
        java.lang.String str3 = this.legitimateReflectVersion;
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(str2, "Wanted Reflection Version: " + str3);
        java.lang.String[] split2 = str3.split("\\.");
        if (java.lang.Integer.parseInt(split[0]) != java.lang.Integer.parseInt(split2[0])) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.1
                {
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this.legitimateReflectVersion + " 当前版本：3.6.9.2");
                }
            });
        } else if (java.lang.Integer.parseInt(split[1]) != java.lang.Integer.parseInt(split2[1])) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.2
                {
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this.legitimateReflectVersion + " 当前版本：3.6.9.2");
                }
            });
        } else if (java.lang.Integer.parseInt(split[2]) < java.lang.Integer.parseInt(split2[2])) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.3
                {
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.WARNING_TIPS, "反光库版本过低！目标版本：" + com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this.legitimateReflectVersion + " 当前版本：3.6.9.2");
                }
            });
        }
        try {
            this.appId = jSONObject.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            if (jSONObject.has("extra_config")) {
                this.extraConfig = jSONObject.getString("extra_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.changePointNum = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("need_random_flag")) {
                this.needRandom = jSONObject.getBoolean("need_random_flag");
            }
            this.needCheckMultiFaces = jSONObject.optBoolean("need_check_multiface", false);
        } catch (org.json.JSONException e18) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e18.getLocalizedMessage());
        }
        int initModel = com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.initModel(this.appId, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().version().split("-")[0]);
        if (initModel != 0) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "failed to init reflect sdk " + initModel);
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(initModel, "failed to init reflect sdk");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(initModel) { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.4
                final /* synthetic */ int val$initR;

                {
                    this.val$initR = initModel;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_REFLECT_INIT_FAILED));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_REFLECT_INIT_FAILED, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR, "Init YTReflect SDK failed with " + initModel));
                }
            });
        }
        this.mOriginParam = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().GetFaceTrackParam();
        com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "mOriginParam: " + this.mOriginParam);
        if (this.needRandom) {
            this.randomColorData = com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.FRGenConfigData(this.changePointNum, this.extraConfig);
        }
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.setReflectNotice(new com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.5
            @Override // com.tencent.youtu.ytagreflectlivecheck.notice.YTReflectNotice
            public void onDelayCalc() {
                com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this.needCheckFaces = false;
            }
        });
        if (com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener != null) {
            com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.setReflectListener(new com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.6
                @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
                public float onGetAppBrightness() {
                    try {
                        return com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onGetAppBrightness();
                    } catch (java.lang.Exception e19) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.TAG, e19.getLocalizedMessage());
                        return -1.0f;
                    }
                }

                @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
                public void onReflectEvent(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17) {
                    try {
                        if (!((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this).stateData.containsKey("refcontrol_begin")) {
                            ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.this).stateData.put("refcontrol_begin", java.lang.String.valueOf(java.lang.System.currentTimeMillis() * 1000));
                        }
                        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onReflectEvent(colorMatrixColorFilter, f17);
                    } catch (java.lang.Exception e19) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.TAG, e19.getLocalizedMessage());
                    }
                }

                @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
                public void onReflectStart(long j17) {
                    try {
                        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().reflectListener.onReflectStart(j17);
                    } catch (java.lang.Exception e19) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.TAG, e19.getLocalizedMessage());
                    }
                }
            });
        } else {
            com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.setReflectListener(null);
        }
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.configNativeLog(true);
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.updateParam("log_level", "3");
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.setLoggerListener(new com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.7
            @Override // com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener
            public void log(java.lang.String str4, java.lang.String str5) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(str4, str5);
            }
        });
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.nextStateName == com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        } else {
            com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().SetFaceTrackParam(this.mOriginParam);
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNow(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(this.nextStateName));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        clearData();
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.cancel();
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.releaseModel();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise;
        com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] faceStatusArr;
        com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise2;
        super.update(bArr, i17, i18, i19, j17);
        int i27 = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.AnonymousClass11.$SwitchMap$com$tencent$youtu$sdkkitframework$liveness$ReflectLivenessState$ReflectProcessType[this.currentProcessType.ordinal()];
        if (i27 != 1) {
            if (i27 == 2) {
                if (this.continuousDetectCount > this.stableFrameCount && (((facePreviewingAdvise = this.poseState) == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS || facePreviewingAdvise == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) && (faceStatusArr = this.faceStatus) != null && faceStatusArr.length > 0)) {
                    startReflect();
                }
                this.nextStateName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            } else if (i27 == 3) {
                java.lang.String str = TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reflect continuous_detect_count ");
                sb6.append(this.continuousDetectCount);
                sb6.append("pass flag ");
                com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise3 = this.poseState;
                com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise facePreviewingAdvise4 = com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_PASS;
                sb6.append(facePreviewingAdvise3 != facePreviewingAdvise4);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, sb6.toString());
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "reflect pose state " + this.poseState);
                if (this.needCheckFaces && ((this.needCheckPose && (facePreviewingAdvise2 = this.poseState) != facePreviewingAdvise4 && facePreviewingAdvise2 != com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_INBUFFER_PASS) || ((this.needCheckMultiFaces && this.poseState == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE) || this.poseState == com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.FacePreviewingAdvise.ADVISE_NO_FACE))) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(str, "reflect cancel:" + this.continuousDetectCount);
                    com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.cancel();
                    handleFailure(-1, "检测异常", "请保持姿态");
                }
                if (this.faceStatus != null) {
                    int i28 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentRotateState;
                    com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus = this.faceStatus[0];
                    com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.pushImageData(bArr, i17, i18, j17, i28, faceStatus.xys, faceStatus.pitch, faceStatus.yaw, faceStatus.roll);
                }
            }
        } else if (!this.tipsTimer.isRunning() || this.tipsTimer.checkTimeout()) {
            this.tipsTimer.cancel();
            this.currentProcessType = com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.ReflectProcessType.RPT_INIT;
        } else if (this.continuousDetectCount <= 1) {
            this.tipsTimer.reset();
        } else {
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState.8
                {
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.FL_REFLECT_PREPARE);
                }
            });
        }
        moveToNextState();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(org.json.JSONObject jSONObject) {
        try {
            this.needCheckPose = jSONObject.optBoolean("force_pose_check", this.needCheckPose);
            this.needCheckMultiFaces = jSONObject.optBoolean("need_check_multiface", this.needCheckMultiFaces);
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, e17.getLocalizedMessage());
        }
    }

    private com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData translation(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData rawImgData) {
        com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData colorImgData = new com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData();
        colorImgData.setImage(new java.lang.String(android.util.Base64.encode(rawImgData.frameBuffer, 2)));
        colorImgData.checksum = rawImgData.checksum;
        colorImgData.setCapture_time(rawImgData.captureTime);
        colorImgData.setX(rawImgData.f220656x);
        colorImgData.setY(rawImgData.f220657y);
        return colorImgData;
    }

    private com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData translation(com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawRefBigImgData rawRefBigImgData) {
        com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData colorBigImgData = new com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorBigImgData();
        byte[] bArr = rawRefBigImgData.frameBuffer;
        if (bArr != null) {
            colorBigImgData.setImage(new java.lang.String(android.util.Base64.encode(bArr, 2)));
            colorBigImgData.checksum = rawRefBigImgData.checksum;
            colorBigImgData.setCaptureTime(rawRefBigImgData.captureTime);
            colorBigImgData.setFivePoints(rawRefBigImgData.xys);
        } else {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "rawRefBigImgData.frameBuffer is null");
        }
        return colorBigImgData;
    }
}
