package com.tencent.youtu.sdkkitframework.liveness;

/* loaded from: classes14.dex */
public class NetFetchState extends com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState {
    private static final java.lang.String TAG = "NetFetchState";
    private java.lang.String appId;
    private java.lang.String configUrl;
    private org.json.JSONObject sdkConfigData;
    private java.lang.String localColorData = "";
    private java.lang.String actionSeqData = "";
    private boolean needLocalConfig = false;
    private java.lang.String extraConfig = "";
    private java.lang.String controlConfig = "";
    private int changePointNum = 2;
    private org.json.JSONObject selectData = null;
    private int backendProtoType = 0;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$4, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode;

        static {
            int[] iArr = new int[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values().length];
            $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode = iArr;
            try {
                iArr[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface NetworkCallback {
        void onFailed(int i17, java.lang.String str);

        void onSucceed(java.lang.String str);
    }

    private void onReflectRequest() {
        com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.getLiveCheckType(com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getContext().currentAppContext, new com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.3
            @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult
            public void onFailed(int i17, java.lang.String str, java.lang.String str2) {
                com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, "network failed " + str + " fix " + str2);
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(i17, str);
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(i17, str, str2) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.3.2
                    final /* synthetic */ int val$code1;
                    final /* synthetic */ java.lang.String val$howToFix1;
                    final /* synthetic */ java.lang.String val$tips1;

                    {
                        this.val$code1 = i17;
                        this.val$tips1 = str;
                        this.val$howToFix1 = str2;
                        put("ui_error", java.lang.Integer.valueOf(i17));
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.NET_FETCH_FAILED);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_NETWORK_ERROR));
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_NETWORK_ERROR, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_NET_ERROR, "msg_net_error " + str + " " + str2));
                    }
                });
            }

            @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.GetLiveStyleResult
            public void onSuccess(com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester.YTLiveStyleReq yTLiveStyleReq, com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleResponse liveStyleResponse) {
                ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this).stateData.put("select_data", yTLiveStyleReq.select_data);
                if ((!android.text.TextUtils.isEmpty(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.localColorData) && com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.needLocalConfig) || com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.configUrl == null) {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, "Use local data");
                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this).stateData.put("color_data", com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.localColorData);
                    ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this).stateData.put("action_data", com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.actionSeqData);
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, "select data:" + com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData);
                    if (com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData != null) {
                        try {
                            if (com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData.has("config")) {
                                ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this).stateData.put("control_config", com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData.getString("config"));
                            }
                            if (com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData.has("reflect_param")) {
                                ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this).stateData.put("extra_config", com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData.getString("reflect_param"));
                            }
                            if (com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData.has("change_point_num")) {
                                ((com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState) com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this).stateData.put("cp_num", com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.selectData.getString("change_point_num"));
                            }
                        } catch (org.json.JSONException e17) {
                            java.lang.String str = "Select data parse failed " + e17.getLocalizedMessage();
                            com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, str);
                            com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo(str);
                        }
                    } else {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, "select data is null");
                        com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportInfo("select data is null");
                    }
                    com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.moveToNextState();
                    return;
                }
                com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetLiveTypeReqData getLiveTypeReqData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.GetLiveTypeReqData();
                com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData();
                getLiveTypeReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.appId;
                com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = getLiveTypeReqData.baseInfo;
                netBaseInfoData2.businessId = "wx_default";
                netBaseInfoData2.lux = yTLiveStyleReq.select_data.android_data.lux;
                getLiveTypeReqData.reflectConfig = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.extraConfig;
                if (com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.sdkConfigData.has("control_config")) {
                    try {
                        com.tencent.youtu.sdkkitframework.liveness.NetFetchState netFetchState = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this;
                        netFetchState.controlConfig = netFetchState.sdkConfigData.getString("control_config");
                    } catch (org.json.JSONException e18) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, "Failed to parse json:" + e18.getLocalizedMessage());
                    }
                }
                getLiveTypeReqData.controlConfig = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.controlConfig;
                getLiveTypeReqData.colorNum = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.changePointNum;
                java.lang.String makeGetLiveTypeReq = com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper.makeGetLiveTypeReq(getLiveTypeReqData);
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.liveness.NetFetchState.TAG, "Use online data ---> on get config info: " + makeGetLiveTypeReq);
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendNetworkRequest(com.tencent.youtu.sdkkitframework.common.StringCode.NET_FETCH_DATA, com.tencent.youtu.sdkkitframework.liveness.NetFetchState.this.configUrl, makeGetLiveTypeReq, null, new com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.3.1
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0239  */
                    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
                    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void onNetworkResponseEvent(java.util.HashMap<java.lang.String, java.lang.String> r22, java.lang.Exception r23) {
                        /*
                            Method dump skipped, instructions count: 618
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.AnonymousClass3.AnonymousClass1.onNetworkResponseEvent(java.util.HashMap, java.lang.Exception):void");
                    }
                });
            }
        });
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.1
            {
                put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.NET_FETCH_DATA);
            }
        });
        int i17 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.AnonymousClass4.$SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode().ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
            onReflectRequest();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(java.lang.String str, org.json.JSONObject jSONObject) {
        this.sdkConfigData = jSONObject;
        super.loadStateWith(str, jSONObject);
        try {
            java.lang.String string = jSONObject.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            this.appId = string;
            if (string == null) {
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
            }
            if (jSONObject.has("config_api_url")) {
                this.configUrl = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                this.localColorData = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                this.needLocalConfig = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    this.actionSeqData += jSONArray.getString(i17);
                    if (i17 < jSONArray.length() - 1) {
                        this.actionSeqData += ",";
                    }
                }
            } else {
                this.actionSeqData = "0";
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
            if (jSONObject.has("select_data")) {
                this.selectData = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                this.backendProtoType = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        try {
            int i17 = com.tencent.youtu.sdkkitframework.liveness.NetFetchState.AnonymousClass4.$SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode[com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode().ordinal()];
            if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().transitNextRound(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.classNameOfState(com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            } else {
                java.lang.String str = "Unknown work mode " + com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().getWorkMode();
                com.tencent.youtu.sdkkitframework.common.YtSDKStats.getInstance().reportError(4194304, str);
                com.tencent.youtu.sdkkitframework.framework.YtFSM.getInstance().sendFSMEvent(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.2
                    final /* synthetic */ java.lang.String val$message;

                    {
                        this.val$message = str;
                        put("ui_error", 4194304);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.UI_TIPS, com.tencent.youtu.sdkkitframework.common.StringCode.RST_FAILED);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.PROCESS_RESULT, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 4194304);
                        put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, com.tencent.youtu.sdkkitframework.common.CommonUtils.makeMessageJson(4194304, com.tencent.youtu.sdkkitframework.common.StringCode.MSG_PARAM_ERROR, str));
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(TAG, "move to next stat failed " + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskHelper.getInstance().unload();
    }
}
