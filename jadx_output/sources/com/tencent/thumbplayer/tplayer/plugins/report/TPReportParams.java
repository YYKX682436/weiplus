package com.tencent.thumbplayer.tplayer.plugins.report;

/* loaded from: classes16.dex */
public class TPReportParams {
    public static final int BUFFERING_REASON_BITRATE_JITTER = 1400109;
    public static final int BUFFERING_REASON_CDN_TIMEOUT = 1400103;
    public static final int BUFFERING_REASON_CDN_TIMEOUT_BUT_CONNECTED = 1400104;
    public static final int BUFFERING_REASON_DOWNLOAD_SHORT_TIME = 1400111;
    public static final int BUFFERING_REASON_DOWNLOAD_TASK = 1400101;
    public static final int BUFFERING_REASON_NETWORK_DEVICE_EXCEPTION = 1400102;
    public static final int BUFFERING_REASON_NETWORK_UNSTABLE = 1400100;
    public static final int BUFFERING_REASON_P2P_FASTER_THAN_HTTP = 1400110;
    public static final int BUFFERING_REASON_P2P_UPLOAD = 1400112;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT = 1400105;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT_BUT_CONNECTED = 1400106;
    public static final int BUFFERING_REASON_SLOWLY_SPEED = 1400107;
    public static final int BUFFERING_REASON_SLOWLY_SPEED_BUT_CONNECTED = 1400108;
    public static final java.lang.String ERROR_CODE_NO_ERROR = "0";
    public static final java.lang.String JSON_KEY_VAL = "val";
    public static final int LIVE_STEP_FAILED = 150;
    public static final int LIVE_STEP_LOADING_SUCC = 205;
    public static final int LIVE_STEP_PLAY = 263;
    public static final int NETWORK_TYPE_2G = 2;
    public static final int NETWORK_TYPE_3G = 3;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_5G = 5;
    public static final int NETWORK_TYPE_ETHERNET = 10;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 1;
    public static final int PLAYER_STEP_BUFFERING = 35;
    public static final int PLAYER_STEP_FIRST_LOAD = 30;
    public static final int PLAYER_STEP_FIRST_RENDERING = 32;
    public static final int PLAYER_STEP_GET_CDN_URL = 15;
    public static final int PLAYER_STEP_INIT_PLAYER = 5;
    public static final int PLAYER_STEP_LOAD_SUBTITLE = 33;
    public static final int PLAYER_STEP_PLAY_DONE = 50;
    public static final int PLAYER_STEP_REDIRECT = 34;
    public static final int PLAYER_STEP_USER_SEEK = 40;
    public static final int PLAYER_TYPE_SYSTEM_PLAYER = 0;
    public static final int PLAYER_TYPE_THUMB_PLAYER = 1;
    public static final int PLAY_END_REASON_APP_EXIT = 2;
    public static final int PLAY_END_REASON_EOS = 0;
    public static final int PLAY_END_REASON_PLAYER_ERROR = 3;
    public static final int PLAY_END_REASON_USER_STOP = 1;
    public static final int PLAY_EVENT_NONE = 0;
    public static final int PLAY_EVENT_PAUSE_BY_DEVICE = 2;
    public static final int PLAY_EVENT_SCREEN_SHOT = 3;
    public static final int PLAY_EVENT_SEEK = 1;
    public static final int PLAY_SCENE_NORMAL_PLAY = 1;
    public static final int PLAY_SCENE_TRICK_PLAY = 2;
    public static final int PLAY_TYPE_LIVE = 1;
    public static final int PLAY_TYPE_UNKNOWN = -1;
    public static final int PLAY_TYPE_VOD = 0;
    public static final java.lang.String PROP_KEY_DATA = "data";
    private static final java.lang.String TAG = "TPReportParams";
    public static final int VIDEO_DL_TYPE_HLS = 3;
    public static final int VIDEO_DL_TYPE_MP4 = 1;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams commonParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayerInitParams initParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayerInitParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.GetCdnUrlParams getCdnParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.GetCdnUrlParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstLoadParams firstLoadParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstLoadParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstRenderParams firstRenderParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstRenderParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LoadSubtitleParams loadSubtitleParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LoadSubtitleParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.RedirectParams redirectParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.RedirectParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingTotalParams bufferingTotalParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingTotalParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekTotalParams userSeekTotalParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekTotalParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayDoneParams playDoneParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayDoneParams();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LiveExParam liveExParam = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LiveExParam();
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.VodExParam vodExParam = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.VodExParam();

    /* loaded from: classes16.dex */
    public class BufferingOnceParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public long bufferingPresentTimeLong;
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public int formatInt;
        public int lastEventInt;
        public int reasonInt;
        public int sceneInt;
        public long starTimeUnix;
        public java.lang.String urlString;

        public BufferingOnceParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.sceneInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_LAST_EVENT, this.lastEventInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, this.bufferingPresentTimeLong);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put("url", this.urlString);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.sceneInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_LAST_EVENT, this.lastEventInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, this.bufferingPresentTimeLong);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put("url", this.urlString);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.sceneInt = 1;
            this.lastEventInt = 0;
            this.reasonInt = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BUFFERING_REASON_NETWORK_UNSTABLE;
        }
    }

    /* loaded from: classes16.dex */
    public class BufferingTotalParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public int bufferingCountInt;
        public int bufferingDurationInt;
        public java.util.List<com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams> bufferingOnceParamsList = new java.util.LinkedList();

        public BufferingTotalParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_COUNT, this.bufferingCountInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_DURATION, this.bufferingDurationInt);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams bufferingOnceParams : this.bufferingOnceParamsList) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    bufferingOnceParams.paramsToJson(jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, jSONArray);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_COUNT, this.bufferingCountInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_DURATION, this.bufferingDurationInt);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.bufferingCountInt = 0;
            this.bufferingDurationInt = 0;
            this.bufferingOnceParamsList.clear();
        }
    }

    /* loaded from: classes16.dex */
    public class CommonParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public java.lang.String appVersionString;
        public int cdnIdInt;
        public java.lang.String cdnIpString;
        public java.lang.String cdnUipString;
        public java.lang.String deviceNameString;
        public java.lang.String deviceResolutionString;
        public int downloadTypeInt;
        public java.lang.String flowIdString;
        public java.lang.String guidString;
        public int loginTypeInt;
        public float mediaDurationFloat;
        public int mediaFormatInt;
        public int mediaRateInt;
        public java.lang.String mediaResolutionString;
        public int networkSpeedInt;
        public int networkTypeInt;
        public int onlineInt;
        public java.lang.String osVersionString;
        public int p2pInt;
        public java.lang.String p2pVersionString;
        public long platformLong;
        public java.lang.String playNoString;
        public int playTypeInt;
        public int playerTypeInt;
        public java.lang.String playerVersionString;
        public java.lang.String proto;
        public java.lang.String protover;
        public java.lang.String qqOpenIdString;
        public int scenesId;
        public int seqInt = 0;
        public int signalStrengthInt;
        public int stepInt;
        public int testIdInt;
        public java.lang.String uinString;
        public java.lang.String uipString;
        public java.lang.String vidString;
        public java.lang.String wxOpenIdString;

        public CommonParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, this.stepInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, this.seqInt);
            iTPReportProperties.put("platform", this.platformLong);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_FLOW_ID, this.flowIdString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAY_NO, this.playNoString);
            iTPReportProperties.put("uin", this.uinString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_QQ_OPEN_ID, this.qqOpenIdString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_WX_OPEN_ID, this.wxOpenIdString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_LOGIN_TYPE, this.loginTypeInt);
            iTPReportProperties.put("guid", this.guidString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_UIP, this.uipString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_UIP, this.cdnUipString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_IP, this.cdnIpString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_ONLINE, this.onlineInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_P2P, this.p2pInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SIG_STRENGTH, this.signalStrengthInt);
            iTPReportProperties.put("network", this.networkTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, this.networkSpeedInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME, this.deviceNameString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, this.deviceResolutionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_TEST_ID, this.testIdInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_OS_VERSION, this.osVersionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_P2P_VERSION, this.p2pVersionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_APP_VERSION, this.appVersionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAYER_VERSION, this.playerVersionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAYER_TYPE, this.playerTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_ID, this.cdnIdInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SCENES_ID, this.scenesId);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAY_TYPE, this.playTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DL_TYPE, this.downloadTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID, this.vidString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, this.mediaResolutionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_FORMAT, this.mediaFormatInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, this.mediaRateInt);
            iTPReportProperties.put("duration", this.mediaDurationFloat);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, this.proto);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTOVER, this.protover);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.stepInt = 0;
            this.seqInt = 0;
            this.platformLong = 0L;
            this.flowIdString = "";
            this.playNoString = "";
            this.uinString = "";
            this.qqOpenIdString = "";
            this.wxOpenIdString = "";
            this.loginTypeInt = 0;
            this.guidString = "";
            this.uipString = "";
            this.cdnUipString = "";
            this.cdnIpString = "";
            this.onlineInt = 0;
            this.p2pInt = 0;
            this.signalStrengthInt = 0;
            this.networkTypeInt = 0;
            this.networkSpeedInt = 0;
            this.deviceNameString = "";
            this.deviceResolutionString = "";
            this.testIdInt = 0;
            this.osVersionString = "";
            this.p2pVersionString = "";
            this.appVersionString = "";
            this.playerVersionString = "";
            this.playerTypeInt = 0;
            this.cdnIdInt = 0;
            this.scenesId = 0;
            this.downloadTypeInt = 0;
            this.vidString = "";
            this.mediaResolutionString = "";
            this.mediaFormatInt = 0;
            this.mediaRateInt = 0;
            this.mediaDurationFloat = 0.0f;
            this.proto = "";
            this.protover = "";
        }
    }

    /* loaded from: classes16.dex */
    public class FirstLoadParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public java.lang.String cdnUrlString;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public long firstOpenTimeUnix;
        public long firstPacketReadTimeUnix;
        public long starTimeUnix;

        public FirstLoadParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FIRST_OPEN_TIME, this.firstOpenTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FIRST_PACKET_READ_TIME, this.firstPacketReadTimeUnix);
                jSONObject.put("url", this.cdnUrlString);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FIRST_OPEN_TIME, this.firstOpenTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FIRST_PACKET_READ_TIME, this.firstPacketReadTimeUnix);
            iTPReportProperties.put("url", this.cdnUrlString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.starTimeUnix = 0L;
            this.firstOpenTimeUnix = 0L;
            this.firstPacketReadTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.cdnUrlString = "";
            this.cgiUrlIndex = 0;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class FirstRenderParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public long starTimeUnix;

        public FirstRenderParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class GetCdnUrlParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public java.lang.String proxyIpString;
        public long starTimeUnix;

        public GetCdnUrlParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, this.proxyIpString);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, this.proxyIpString);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.proxyIpString = "";
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class LiveExParam implements com.tencent.thumbplayer.common.report.ITPReportParams {
        int adPlayLengthInt;
        int blockCountInt;
        int blockTimeInt;
        java.lang.String cdnServerString;
        int connectTimeInt;
        int contentIdInt;
        java.lang.String defSwitchString;
        int deviceTypeInt;
        int downSpeedInt;
        java.lang.String downloadServerIpString;
        java.lang.String downloadUrl;
        int errCodeInt;
        java.lang.String extraInfoString;
        int freeTypeInt;
        java.lang.String fullErrCodeString;
        int getStreamDurationInt;
        int getSyncFrameDurationInt;
        int getUrlTimeInt;
        int isLookBackInt;
        int isStreamP2PInt;
        int isUseP2PInt;
        int isUserPayInt;
        int liveDelayInt;
        int liveProgramIdInt;
        int liveTagInt;
        int liveTypeInt;
        long loadingTimeLong;
        int maxSpeedInt;
        int networkTypeInt;
        int playTimeInt;
        java.lang.String playerVersionString;
        int prePlayLengthInt;
        int reconnectCntInt;
        long reportTimeLong;
        java.lang.String spanId;
        int streamIdInt;
        int testSpeedInt;
        java.lang.String tuid;
        java.lang.String userIpString;
        java.lang.String userQQString;

        public LiveExParam() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_REPORT_TIME, this.reportTimeLong);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_S_IP, this.userIpString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_I_QQ, this.userQQString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_PRE_DURATION, this.prePlayLengthInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_AD_DURATION, this.adPlayLengthInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_PLAYER_VER, this.playerVersionString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DL_IP, this.downloadServerIpString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEV_TYPE, this.deviceTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_NET_TYPE, this.networkTypeInt);
            iTPReportProperties.put("freetype", this.freeTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_USE_P2P, this.isUseP2PInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_P2P_PLAY, this.isStreamP2PInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_PROGRAM_ID, this.liveProgramIdInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, this.streamIdInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_CONTENT_ID, this.contentIdInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_PLAY_TIME, this.playTimeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_IS_USER_PAY, this.isUserPayInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, this.defSwitchString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE, this.liveTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_CDN_SERVER, this.cdnServerString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DOWNLOAD_URL, this.downloadUrl);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_IS_LOOK_BACK, this.isLookBackInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_DELAY, this.liveDelayInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TAG, this.liveTagInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.extraInfoString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_CONN_TIME, this.connectTimeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_MAX_SPEED, this.maxSpeedInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_TEST_SPEED, this.testSpeedInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DOWN_SPEED, this.downSpeedInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_RECONNECT_TIME, this.reconnectCntInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LOADING_TIME, this.loadingTimeLong);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_BLOCK_TIME, this.blockTimeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_BLOCK_COUNT, this.blockCountInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, this.errCodeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_GET_URL_TIME, this.getUrlTimeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_FULL_CODE, this.fullErrCodeString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_GET_DATA_DURATION, this.getStreamDurationInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_GET_SYNC_FRAM, this.getSyncFrameDurationInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_FX_SPANID, this.spanId);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LICE_FX_TUID, this.tuid);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
        }
    }

    /* loaded from: classes16.dex */
    public class LoadSubtitleParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public int bufferingDurationInt;
        public int cdnTypeInt;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public long starTimeUnix;
        public java.lang.String subtitleUrlString;

        public LoadSubtitleParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFER_DURATION, this.bufferingDurationInt);
                jSONObject.put("url", this.subtitleUrlString);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.starTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFER_DURATION, this.bufferingDurationInt);
            iTPReportProperties.put("url", this.subtitleUrlString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_URL_INDEX, this.cgiUrlIndex);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.bufferingDurationInt = 0;
            this.subtitleUrlString = "";
            this.cdnTypeInt = 0;
            this.cgiUrlIndex = 0;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class PlayDoneParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public float playDurationFloat;
        public int reasonInt;

        public PlayDoneParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_PLAY_DURATION, this.playDurationFloat);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, this.reasonInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_PLAY_DURATION, this.playDurationFloat);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.reasonInt = 0;
            this.endTimeUnix = 0L;
            this.playDurationFloat = 0.0f;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class PlayerInitParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public java.lang.String errCodeString;
        public long playEndTimeUnix;
        public long playStarTimeUnix;

        public PlayerInitParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.playStarTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.playEndTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, this.playStarTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.playEndTimeUnix);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.playStarTimeUnix = 0L;
            this.playEndTimeUnix = 0L;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class RedirectParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public int cdnTypeInt;
        public long endTimeUnix;
        public java.lang.String errCodeString;
        public int redirectCountInt;
        public java.lang.String redirectedUrlString;
        public long starTimeUnix;

        public RedirectParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
                jSONObject.put("url", this.redirectedUrlString);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_T302, this.redirectCountInt);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, this.endTimeUnix);
            iTPReportProperties.put("url", this.redirectedUrlString);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, this.cdnTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_T302, this.redirectCountInt);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.starTimeUnix = 0L;
            this.endTimeUnix = 0L;
            this.redirectedUrlString = "";
            this.cdnTypeInt = 0;
            this.redirectCountInt = 0;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class UserSeekOnceParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public long endPresentTimeLong;
        public java.lang.String errCodeString;
        public int formatInt;
        public long seekEndTimeUnix;
        public long seekStartTimeUnix;
        public long startPresentTimeLong;

        public UserSeekOnceParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, this.startPresentTimeLong);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, this.endPresentTimeLong);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_START_TIME, this.seekStartTimeUnix);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_END_TIME, this.seekEndTimeUnix);
                jSONObject.put("code", this.errCodeString);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, this.formatInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, this.startPresentTimeLong);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, this.endPresentTimeLong);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_START_TIME, this.seekStartTimeUnix);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_END_TIME, this.seekEndTimeUnix);
            iTPReportProperties.put("code", this.errCodeString);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.startPresentTimeLong = 0L;
            this.endPresentTimeLong = 0L;
            this.seekStartTimeUnix = 0L;
            this.seekEndTimeUnix = 0L;
            this.errCodeString = "0";
        }
    }

    /* loaded from: classes16.dex */
    public class UserSeekTotalParams implements com.tencent.thumbplayer.common.report.ITPReportParams {
        public int seekBufferingCountInt;
        public int seekBufferingDurationInt;
        public java.util.List<com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams> seekOnceParamsList = new java.util.LinkedList();
        public int seekTotalCountInt;

        public UserSeekTotalParams() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_COUNT, this.seekTotalCountInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_COUNT, this.seekBufferingCountInt);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_DURATION, this.seekBufferingDurationInt);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams userSeekOnceParams : this.seekOnceParamsList) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    userSeekOnceParams.paramsToJson(jSONObject2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, jSONArray);
            } catch (org.json.JSONException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.TAG, e17);
            }
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_COUNT, this.seekTotalCountInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_COUNT, this.seekBufferingCountInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_BUFFERING_DURATION, this.seekBufferingDurationInt);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
            this.seekTotalCountInt = 0;
            this.seekBufferingCountInt = 0;
            this.seekBufferingDurationInt = 0;
            this.seekOnceParamsList.clear();
        }
    }

    /* loaded from: classes16.dex */
    public class VodExParam implements com.tencent.thumbplayer.common.report.ITPReportParams {
        int bizIdInt;
        int clipInt;
        int currentPlayInt;
        int freeTypeInt;
        int hasSubtitleInt;
        int hevcLcInt;
        int hitDownloaded;
        int isSelectedSubtitleInt;
        int multiTrackInt;
        int optimizedPlayInt;
        int statusInt;

        public VodExParam() {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToJson(org.json.JSONObject jSONObject) {
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void paramsToProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            iTPReportProperties.put("freetype", this.freeTypeInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_CURRENT_PLAY, this.currentPlayInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_OPTIMIZED_PLAY, this.optimizedPlayInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_HAS_SUBTITLE, this.hasSubtitleInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_SELECTED_SUBTITLE, this.isSelectedSubtitleInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_MULTI_TRACK, this.multiTrackInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_BIZ_ID, this.bizIdInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_HEVC_LC, this.hevcLcInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_CLIP_COUNT, this.clipInt);
            iTPReportProperties.put("status", this.statusInt);
            iTPReportProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_HIT_DOWNLOADED, this.hitDownloaded);
        }

        @Override // com.tencent.thumbplayer.common.report.ITPReportParams
        public void reset() {
        }
    }

    public TPReportParams() {
        this.commonParams.reset();
        this.initParams.reset();
        this.getCdnParams.reset();
        this.firstLoadParams.reset();
        this.firstRenderParams.reset();
        this.loadSubtitleParams.reset();
        this.redirectParams.reset();
        this.bufferingTotalParams.reset();
        this.userSeekTotalParams.reset();
        this.playDoneParams.reset();
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams createBufferingOnceParams() {
        return new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams();
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams createUserSeekOnceParams() {
        return new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams();
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingTotalParams getBufferingTotalParams() {
        return this.bufferingTotalParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams getCommonParams() {
        return this.commonParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstLoadParams getFirstLoadParams() {
        return this.firstLoadParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstRenderParams getFirstRenderParams() {
        return this.firstRenderParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.GetCdnUrlParams getGetCdnParams() {
        return this.getCdnParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayerInitParams getInitParams() {
        return this.initParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LiveExParam getLiveExParam() {
        return this.liveExParam;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LoadSubtitleParams getLoadSubtitleParams() {
        return this.loadSubtitleParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayDoneParams getPlayDoneParams() {
        return this.playDoneParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.RedirectParams getRedirectParams() {
        return this.redirectParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekTotalParams getUserSeekTotalParams() {
        return this.userSeekTotalParams;
    }

    public com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.VodExParam getVodExParam() {
        return this.vodExParam;
    }

    public void resetAllParam() {
        this.commonParams.reset();
        this.firstLoadParams.reset();
        this.firstRenderParams.reset();
        this.loadSubtitleParams.reset();
        this.getCdnParams.reset();
        this.redirectParams.reset();
        this.bufferingTotalParams.reset();
        this.userSeekTotalParams.reset();
        this.playDoneParams.reset();
        this.liveExParam.reset();
        this.vodExParam.reset();
    }
}
