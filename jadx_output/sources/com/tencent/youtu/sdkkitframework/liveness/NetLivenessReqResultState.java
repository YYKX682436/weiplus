package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class NetLivenessReqResultState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final java.lang.String TAG = "NetLivenessReqResultState";
    private java.lang.String appId;
    private java.lang.Object bestImage;
    private int finalConfidenceThreshold;
    private java.lang.String resultUrl;
    private java.lang.String secretId;
    private java.lang.String secretKey;
    private java.lang.String userId;
    private boolean needManualTrigger = false;
    private int simiThreshold = 70;
    private java.util.HashMap<java.lang.String, java.lang.String> requestOptions = new java.util.HashMap<>();
    private int actReflectType = 0;
    private int backendProtoType = 0;
    private java.lang.String extraConfig = "";
    private java.lang.String controlConfig = "";
    private int changePointNum = 2;
    private int actRefUXMode = 0;
    boolean needVideoData = true;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$10, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass10 {
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
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public class FivePoints {
        public java.util.ArrayList<com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.Pointf> points;

        public FivePoints() {
        }
    }

    /* loaded from: classes14.dex */
    public class Pointf {

        /* renamed from: x, reason: collision with root package name */
        public float f220654x;

        /* renamed from: y, reason: collision with root package name */
        public float f220655y;

        public Pointf() {
        }
    }

    /* loaded from: classes14.dex */
    public class Version {
        public java.lang.String sdk_version = "";
        public java.lang.String ftrack_sdk_version = "";
        public java.lang.String freflect_sdk_version = "";
        public java.lang.String faction_sdk_version = "";

        public Version() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:11|(4:12|13|14|15)|(3:20|21|(12:23|(3:45|46|(6:48|26|27|(3:38|(1:44)(1:42)|43)(3:32|(1:34)|35)|36|37))|25|26|27|(1:30)|38|(1:40)|44|43|36|37)(9:56|27|(0)|38|(0)|44|43|36|37))|57|(1:59)(2:69|(1:71)(2:72|(1:74)(1:75)))|(2:64|65)(1:61)|62|63|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[Catch: JSONException -> 0x00d6, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00d6, blocks: (B:21:0x00be, B:23:0x00c4, B:63:0x00a7), top: B:62:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> r19, java.lang.Exception r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.handleResponseEvent(java.util.HashMap, java.lang.Exception):void");
    }

    public static java.lang.String makeActionStr(java.lang.String[] strArr) {
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

    private void onActReflectRequest() {
        java.lang.String str;
        try {
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            com.tencent.youtu.sdkkitframework.common.YTImageData yTImageData = (com.tencent.youtu.sdkkitframework.common.YTImageData) stateByName2.getStateDataBy("best_frame");
            this.bestImage = yTImageData;
            this.stateData.put("best_frame", yTImageData);
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName3 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq actionReflectReq = (com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq) stateByName3.getStateDataBy("reflect_request_object");
            java.lang.String makeActionStr = makeActionStr((java.lang.String[]) stateByName2.getStateDataBy("action_seq"));
            if (stateByName2.getStateDataBy("frames") instanceof java.lang.String) {
                str = stateByName2.getStateDataBy("frames").toString();
            } else {
                byte[] bArr = (byte[]) stateByName2.getStateDataBy("frames");
                if (bArr == null) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.w(TAG, "action data is null");
                    str = null;
                } else {
                    str = new java.lang.String(android.util.Base64.encode(bArr, 2));
                }
            }
            java.lang.String str2 = (java.lang.String) stateByName.getStateDataBy("control_config");
            if (str2 != null) {
                this.controlConfig = str2;
            }
            java.lang.String str3 = (java.lang.String) stateByName.getStateDataBy("extra_config");
            if (str3 != null) {
                this.extraConfig = str3;
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "extraconfig:" + this.extraConfig);
            }
            java.lang.String str4 = (java.lang.String) stateByName3.getStateDataBy("refcontrol_begin");
            if (str4 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str5 = this.extraConfig;
                if (str5 == null) {
                    str5 = "";
                }
                sb6.append(str5);
                sb6.append(" refcontrol_begin ");
                sb6.append(str4);
                this.extraConfig = sb6.toString();
            }
            java.lang.String str6 = (java.lang.String) stateByName.getStateDataBy("cp_num");
            if (str6 != null) {
                this.changePointNum = java.lang.Integer.parseInt(str6);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "cpnum:" + this.changePointNum);
            }
            parseControlConfig();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionReflectLiveReqData actionReflectLiveReqData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionReflectLiveReqData();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData();
            actionReflectLiveReqData.baseInfo = netBaseInfoData;
            netBaseInfoData.sessionId = java.util.UUID.randomUUID().toString();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = actionReflectLiveReqData.baseInfo;
            netBaseInfoData2.appId = this.appId;
            netBaseInfoData2.businessId = "";
            actionReflectLiveReqData.colorData = actionReflectReq.color_data;
            if (this.needVideoData) {
                actionReflectLiveReqData.actionVideo = str != null ? str : "";
            } else {
                actionReflectLiveReqData.actionVideo = "";
            }
            actionReflectLiveReqData.actionStr = makeActionStr;
            com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo yTImageInfo = actionReflectReq.eye_image;
            actionReflectLiveReqData.eyeImage = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(yTImageInfo.image, yTImageInfo.five_points, yTImageInfo.checksum);
            com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo yTImageInfo2 = actionReflectReq.mouth_image;
            actionReflectLiveReqData.mouthImage = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(yTImageInfo2.image, yTImageInfo2.five_points, yTImageInfo2.checksum);
            com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo yTImageInfo3 = actionReflectReq.live_image;
            actionReflectLiveReqData.liveImage = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(yTImageInfo3.image, yTImageInfo3.five_points, yTImageInfo3.checksum);
            actionReflectLiveReqData.reflectData = actionReflectReq.reflect_data;
            actionReflectLiveReqData.baseInfo.lux = actionReflectReq.select_data.android_data.lux;
            actionReflectLiveReqData.reflectConfig = this.extraConfig;
            actionReflectLiveReqData.controlConfig = this.controlConfig;
            actionReflectLiveReqData.colorNum = this.changePointNum;
            java.lang.String makeActionReflectLiveReq = com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.makeActionReflectLiveReq(actionReflectLiveReqData, str != null);
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "uploadString: " + makeActionReflectLiveReq);
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendNetworkRequest(com.tencent.youtu.sdkkitframework.common.StringCode.NET_REPORTING, this.resultUrl, makeActionReflectLiveReq, null, new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.8
                @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
                public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.TAG, "handle actreflect response");
                    com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "actrefl request failed" + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("actrefl request failed: " + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(e17) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.9
                final /* synthetic */ java.lang.Exception val$e;

                {
                    this.val$e = e17;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_NETWORK_ERROR));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_NETWORK_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_NET_ERROR, e17.getLocalizedMessage()));
                }
            });
        }
    }

    private void onActionRequest() {
        java.lang.String str;
        try {
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName == null) {
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("action request action state is null");
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "action request action state is null");
                return;
            }
            this.bestImage = (com.tencent.youtu.sdkkitframework.common.YTImageData) stateByName.getStateDataBy("best_frame");
            if (stateByName.getStateDataBy("frames") instanceof java.lang.String) {
                str = (java.lang.String) stateByName.getStateDataBy("frames");
            } else {
                byte[] bArr = (byte[]) stateByName.getStateDataBy("frames");
                str = bArr == null ? "" : new java.lang.String(android.util.Base64.encode(bArr, 2));
            }
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "action data is null");
            }
            java.lang.String makeActionStr = makeActionStr((java.lang.String[]) stateByName.getStateDataBy("action_seq"));
            parseControlConfig();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionLiveReqData actionLiveReqData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ActionLiveReqData();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData();
            actionLiveReqData.baseInfo = netBaseInfoData;
            netBaseInfoData.appId = this.appId;
            netBaseInfoData.sessionId = java.util.UUID.randomUUID().toString();
            actionLiveReqData.bestImage = new java.lang.String(android.util.Base64.encode(((com.tencent.youtu.sdkkitframework.common.YTImageData) this.bestImage).imgData, 2));
            actionLiveReqData.actionStr = makeActionStr;
            if (this.needVideoData) {
                actionLiveReqData.actionVideo = str;
            } else {
                actionLiveReqData.actionVideo = "";
            }
            actionLiveReqData.needEyeDetect = true;
            actionLiveReqData.needMouthDetect = true;
            actionLiveReqData.reflectConfig = this.extraConfig;
            actionLiveReqData.controlConfig = this.controlConfig;
            actionLiveReqData.colorNum = this.changePointNum;
            actionLiveReqData.config = (java.lang.String) stateByName.getStateDataBy("config");
            actionLiveReqData.reservedfield = "";
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendNetworkRequest(com.tencent.youtu.sdkkitframework.common.StringCode.NET_REPORTING, this.resultUrl, com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.makeActionLiveReq(actionLiveReqData), null, new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.4
                @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
                public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.TAG, "Handle action response");
                    com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "action request failed" + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("action request failed: " + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(e17) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.5
                final /* synthetic */ java.lang.Exception val$e;

                {
                    this.val$e = e17;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED, e17.getLocalizedMessage()));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckResponseManual() {
        if (this.needManualTrigger) {
            try {
                com.tencent.youtu.sdkkitframework.framework.YtFSM ytFSM = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance();
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
                ytFSM.getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)).handleStateAction("reset_manual_trigger", null);
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName));
            } catch (java.lang.Exception e17) {
                java.lang.String str = "on Check response manual failed " + e17.getLocalizedMessage();
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, str);
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo(str);
            }
        }
    }

    private void onReflectRequest() {
        java.lang.String makeReflectLiveReq;
        com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkBegin("reflect_request_s1");
        try {
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.bestImage = (android.graphics.YuvImage) stateByName.getStateDataBy("best_image");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            ((android.graphics.YuvImage) this.bestImage).compressToJpeg(new android.graphics.Rect(0, 0, ((android.graphics.YuvImage) this.bestImage).getWidth(), ((android.graphics.YuvImage) this.bestImage).getHeight()), 95, byteArrayOutputStream);
            byte[] encode = android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2);
            this.stateData.put("best_frame", this.bestImage);
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName2 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState stateByName3 = com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq reflectLiveReq = (com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq) stateByName2.getStateDataBy("reflect_request_object");
            java.lang.String str = (java.lang.String) stateByName3.getStateDataBy("extra_config");
            if (str != null) {
                this.extraConfig = str;
            }
            java.lang.String str2 = (java.lang.String) stateByName2.getStateDataBy("refcontrol_begin");
            if (str2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str3 = this.extraConfig;
                if (str3 == null) {
                    str3 = "";
                }
                sb6.append(str3);
                sb6.append(" refcontrol_begin ");
                sb6.append(str2);
                this.extraConfig = sb6.toString();
            }
            java.lang.String str4 = (java.lang.String) stateByName3.getStateDataBy("cp_num");
            if (str4 != null) {
                this.changePointNum = java.lang.Integer.parseInt(str4);
            }
            reflectLiveReq.session_id = java.util.UUID.randomUUID().toString();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ReflectLiveReqData reflectLiveReqData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ReflectLiveReqData();
            com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData();
            reflectLiveReqData.baseInfo = netBaseInfoData;
            netBaseInfoData.appId = this.appId;
            netBaseInfoData.sessionId = java.util.UUID.randomUUID().toString();
            reflectLiveReqData.baseInfo.businessId = this.requestOptions.containsKey("business_id") ? this.requestOptions.get("business_id") : null;
            reflectLiveReqData.baseInfo.personId = this.requestOptions.containsKey("person_id") ? this.requestOptions.get("person_id") : null;
            reflectLiveReqData.baseInfo.personType = this.requestOptions.containsKey("person_type") ? this.requestOptions.get("person_type") : null;
            reflectLiveReqData.baseInfo.reqType = this.requestOptions.containsKey("req_type") ? this.requestOptions.get("req_type") : null;
            reflectLiveReqData.baseInfo.liveType = this.requestOptions.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE) ? java.lang.Integer.parseInt(this.requestOptions.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE)) : 0;
            reflectLiveReqData.colorData = reflectLiveReq.color_data;
            reflectLiveReqData.liveImage = new java.lang.String(encode);
            reflectLiveReqData.reflectData = reflectLiveReq.reflect_data;
            reflectLiveReqData.config = this.extraConfig;
            reflectLiveReqData.colorNum = this.changePointNum;
            if (this.backendProtoType == 2) {
                android.graphics.YuvImage yuvImage = (android.graphics.YuvImage) stateByName.getStateDataBy("best_image");
                float[] fArr = (float[]) stateByName.getStateDataBy("best_shape");
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, ((android.graphics.YuvImage) this.bestImage).getWidth(), ((android.graphics.YuvImage) this.bestImage).getHeight()), 95, byteArrayOutputStream2);
                reflectLiveReqData.bestImage = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream2.toByteArray(), fArr, (java.lang.String) null);
                android.graphics.YuvImage yuvImage2 = (android.graphics.YuvImage) stateByName.getStateDataBy("openmouth_image");
                float[] fArr2 = (float[]) stateByName.getStateDataBy("openmouth_shape");
                java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
                yuvImage2.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage2.getWidth(), yuvImage2.getHeight()), 95, byteArrayOutputStream3);
                reflectLiveReqData.openMouthImage = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream3.toByteArray(), fArr2, (java.lang.String) null);
                android.graphics.YuvImage yuvImage3 = (android.graphics.YuvImage) stateByName.getStateDataBy("closeeye_image");
                float[] fArr3 = (float[]) stateByName.getStateDataBy("closeeye_shape");
                java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                yuvImage3.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage3.getWidth(), yuvImage3.getHeight()), 95, byteArrayOutputStream4);
                reflectLiveReqData.closeEyeImage = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream4.toByteArray(), fArr3, (java.lang.String) null);
                makeReflectLiveReq = com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.makePersonLiveReq(reflectLiveReqData);
            } else {
                makeReflectLiveReq = com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.makeReflectLiveReq(reflectLiveReqData);
            }
            java.lang.String str5 = makeReflectLiveReq;
            com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "begin request...uploadsize " + str5.length());
            com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkEnd("reflect_request_s1");
            com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkBegin("reflect_request_s2");
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendNetworkRequest(com.tencent.youtu.sdkkitframework.common.StringCode.NET_REPORTING, this.resultUrl, str5, null, new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.6
                @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
                public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                    com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkEnd("reflect_request_s2");
                    com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkBegin("reflect_request_s3");
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.TAG, "handle reflection response");
                    com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                    com.tencent.youtu.sdkkitframework.common.CommonUtils.benchMarkEnd("reflect_request_s3");
                    com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.onCheckResponseManual();
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "reflection request failed" + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("reflection request failed: " + e17.getLocalizedMessage());
            com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(e17) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.7
                final /* synthetic */ java.lang.Exception val$e;

                {
                    this.val$e = e17;
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.PROCESS_FIN);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR));
                    put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED, e17.getLocalizedMessage()));
                }
            });
        }
    }

    private void onSilentRequest() {
        android.graphics.YuvImage yuvImage = (android.graphics.YuvImage) com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getStateByName(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).getStateDataBy("best_image");
        this.bestImage = yuvImage;
        int width = yuvImage.getWidth();
        int height = ((android.graphics.YuvImage) this.bestImage).getHeight();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ((android.graphics.YuvImage) this.bestImage).compressToJpeg(new android.graphics.Rect(0, 0, width, height), 95, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PictureLiveReqData pictureLiveReqData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.PictureLiveReqData();
        com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData();
        pictureLiveReqData.baseInfo = netBaseInfoData;
        netBaseInfoData.sessionId = java.util.UUID.randomUUID().toString();
        pictureLiveReqData.baseInfo.appId = this.appId;
        pictureLiveReqData.imageInfo = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.ImageInfo(byteArray, (float[]) null, (java.lang.String) null);
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendNetworkRequest(com.tencent.youtu.sdkkitframework.common.StringCode.NET_REPORTING, this.resultUrl, com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.makePictureLiveReq(pictureLiveReqData), null, new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.2
            @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
            public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.TAG, "Parse silent response");
                com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.handleResponseEvent(hashMap, exc);
                com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.this.onCheckResponseManual();
            }
        });
    }

    private void parseControlConfig() {
        if (android.text.TextUtils.isEmpty(this.controlConfig)) {
            return;
        }
        java.lang.String[] split = this.controlConfig.split("&");
        if (split.length > 0) {
            for (java.lang.String str : split) {
                java.lang.String[] split2 = str.split("=");
                if (split2.length > 1) {
                    if (split2[0].equals("need_action_video") && split2[1].equals("false")) {
                        this.needVideoData = false;
                    }
                    if (split2[0].equals("actref_ux_mode")) {
                        this.actRefUXMode = java.lang.Integer.parseInt(split2[1]);
                    }
                }
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.1
            {
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_ACTION, com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.NET_REQ);
            }
        });
        int i17 = com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.AnonymousClass10.$SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode().ordinal()];
        if (i17 == 1 || i17 == 2) {
            onActionRequest();
        } else if (i17 == 3) {
            onReflectRequest();
        } else {
            if (i17 != 4) {
                return;
            }
            onActReflectRequest();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            this.appId = jSONObject.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            java.lang.String string = jSONObject.getString("result_api_url");
            this.resultUrl = string;
            if (string == null) {
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "parse url failed");
                return;
            }
            if (jSONObject.has("secret_key")) {
                this.secretKey = jSONObject.getString("secret_key");
            }
            if (jSONObject.has("secret_id")) {
                this.secretId = jSONObject.getString("secret_id");
            }
            if (jSONObject.has("user_id")) {
                this.userId = jSONObject.getString("user_id");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.simiThreshold = jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("final_liveness_confidence_threshold")) {
                this.finalConfidenceThreshold = jSONObject.getInt("final_liveness_confidence_threshold");
            } else {
                this.finalConfidenceThreshold = 85;
            }
            if (jSONObject.has("extra_config")) {
                this.extraConfig = jSONObject.getString("extra_config");
            } else {
                this.extraConfig = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.controlConfig = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.changePointNum = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("manual_trigger")) {
                this.needManualTrigger = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("request_options")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("request_options");
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    this.requestOptions.put(next, jSONObject2.getString(next));
                }
            }
            if (jSONObject.has("backend_proto_type")) {
                this.backendProtoType = jSONObject.getInt("backend_proto_type");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
    }
}
