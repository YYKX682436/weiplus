package com.tencent.thumbplayer.tplayer.plugins.report;

/* loaded from: classes16.dex */
public class TPReportManager implements com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase, com.tencent.thumbplayer.api.report.ITPBusinessReportManager {
    private static final boolean APP_STATE_BACKGROUND = false;
    private static final boolean APP_STATE_FOREGROUND = true;
    private static final int BUFFERING_DURATION_THRESHOLD_MS = 1200;
    private static final int DEVICE_TYPE_AN_PAD = 5;
    private static final int DEVICE_TYPE_AN_PHONE = 2;
    private static final int DEVICE_TYPE_AN_TV = 9;
    private static final java.lang.String EVENT_KEY_BUFFERING = "second_buffering";
    private static final java.lang.String EVENT_KEY_FIRST_LOAD = "first_load";
    private static final java.lang.String EVENT_KEY_FIRST_RENDERING = "first_rendering";
    private static final java.lang.String EVENT_KEY_GET_CDN_URL = "get_cdn_url";
    private static final java.lang.String EVENT_KEY_INIT_PLAYER = "init_player";
    private static final java.lang.String EVENT_KEY_LIVE_FIRST_LOAD = "live_loading";
    private static final java.lang.String EVENT_KEY_LIVE_PERIOD = "live_period";
    private static final java.lang.String EVENT_KEY_LIVE_PLAY_ERROR = "live_error";
    private static final java.lang.String EVENT_KEY_LOAD_SUBTITLE = "load_subtitle";
    private static final java.lang.String EVENT_KEY_PLAY_DONE = "play_done";
    private static final java.lang.String EVENT_KEY_REDIRECT = "302_redirect";
    private static final java.lang.String EVENT_KEY_USER_SEEK = "user_seek";
    private static final java.lang.String LIVE_HLS_M3U8_TAG_PREFIX = "#EXT-X-PROGRAM-DATE-TIME:";
    private static final int LIVE_REPORT_PERIOD = 60000;
    private static final int MAX_BUFFERING_REPORT_COUNT = 20;
    private static final int MAX_SEEK_REPORT_COUNT = 20;
    private static final java.lang.String PROXY_HITDOWNLOADED_KEY = "hitDownloaded";
    private static final java.lang.String REPORT_DATA_CACHE_NAME = "TPReportCache";
    private static final java.lang.String TAG = "TPReportManager";
    private static final int VOD_HIT_DOWNLOADED_UNSET = -1;
    private android.content.Context mContext;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.EventHandler mEventHandler;
    private android.os.HandlerThread mReportThread;
    private static final java.lang.String OS_VERSION = java.lang.String.format("Android %s", com.tencent.thumbplayer.core.common.TPSystemInfo.getOsVersion());
    private static java.lang.String sDisplayResolutionReportString = "";
    private static boolean hasReportLastEvent = false;
    private static com.tencent.thumbplayer.utils.TPDiskReadWrite mCache = null;
    private final java.lang.Object mExitLock = new java.lang.Object();
    private boolean mIsExit = false;
    private com.tencent.thumbplayer.api.report.TPDefaultReportInfo mReportInfoGetter = null;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams mReportParams = null;
    private int mPlayScene = 1;
    private int mLastEvent = 0;
    private boolean mIsPlayDone = true;
    private boolean mAppState = true;
    private boolean mIsPrepare = false;
    private boolean mIsLoadingSubtitle = false;
    private long mPlayStartTimeMs = 0;
    private long mPlayDurationMs = 0;
    private int mSignalStrength = 81;
    private int mNetworkSpeed = 0;
    private int mSeekBufferingDuration = 0;
    private int mSeekBufferingCount = 0;
    private boolean mIsSeeking = false;
    private boolean mIsBuffering = false;
    private boolean mIsUseP2P = false;
    private java.lang.String mErrorCode = "0";
    private java.lang.String mProto = "";
    private java.lang.String mProtoVer = "";
    private java.lang.String mFlowId = "";
    private int mPlayerType = 0;
    private int mDownloadType = 0;
    private java.lang.String mMediaResolution = "";
    private int mMediaRate = 0;
    private long mMediaDurationMs = 0;
    private int mPlayType = -1;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler mReportHandler = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.DefaultReportHandler();
    private double mSamplingRate = 1.0d;
    private boolean mNeedReportToBeacon = true;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams mCurBufferingParams = null;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams mCurSeekParams = null;
    private final com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord mParamRecord = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord();
    private com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener mGlobalEventListener = new com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener() { // from class: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.1
        @Override // com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener
        public void onEvent(int i17, int i18, int i19, java.lang.Object obj) {
            int i27;
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.TAG, "OnGlobalEventChangeListener eventId: " + i17);
            switch (i17) {
                case 100001:
                    i27 = 2100;
                    break;
                case 100002:
                    i27 = 2101;
                    break;
                default:
                    return;
            }
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.mEventHandler.obtainMessage(i27, null).sendToTarget();
        }
    };

    /* loaded from: classes16.dex */
    public class DefaultReportHandler implements com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler {
        public DefaultReportHandler() {
        }

        @Override // com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler
        public void handleReportEvent(int i17, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.updateCommonParam(iTPReportProperties, i17, i17 <= 30);
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onReportEvent(iTPReportProperties);
        }
    }

    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        private static final int MSG_302_REDIRECT = 2001;
        private static final int MSG_APP_BACKGROUND = 2100;
        private static final int MSG_APP_FOREGROUND = 2101;
        private static final int MSG_BUFFERING_END = 1014;
        private static final int MSG_BUFFERING_START = 1013;
        private static final int MSG_CDN_UPDATE = 1018;
        private static final int MSG_CREATE_DONE = 1000;
        private static final int MSG_CREATE_START = 999;
        private static final int MSG_DOWNLOAD_UPDATE = 1017;
        private static final int MSG_EARLY_ERROR = 2003;
        private static final int MSG_EXIT_THREAD = 100;
        private static final int MSG_FIRSTCLIP_OPEN = 1022;
        private static final int MSG_FIRST_PACKET = 1019;
        private static final int MSG_GET_CDN = 2000;
        private static final int MSG_HLS_PRIVATE_TAG = 1016;
        private static final int MSG_LIVE_PERIOD_REPORT = 3000;
        private static final int MSG_LOAD_SUBTITLE = 2002;
        private static final int MSG_PLAYER_ERROR = 1006;
        private static final int MSG_PLAYER_PAUSE = 1004;
        private static final int MSG_PLAYER_RELEASE = 1010;
        private static final int MSG_PLAYER_RESET = 1011;
        private static final int MSG_PLAYER_STOP = 1005;
        private static final int MSG_PLAY_COMPLETE = 1009;
        private static final int MSG_PREPARE_DONE = 1002;
        private static final int MSG_PROTOCOL_UPDATE = 1023;
        private static final int MSG_RENDERING_START = 1012;
        private static final int MSG_REPORT_LAST_EVENT = 4000;
        private static final int MSG_SEEK_COMPLETE = 1008;
        private static final int MSG_SELECT_TRACK = 2004;
        private static final int MSG_SELECT_TRACK_DONE = 2005;
        private static final int MSG_SET_PLAY_SPEED = 1015;
        private static final int MSG_SIGNAL_STRENGTH_REGISTER = 4001;
        private static final int MSG_SIGNAL_STRENGTH_UNREGISTER = 4002;
        private static final int MSG_START_PLAY = 1003;
        private static final int MSG_START_PREPARE = 1001;
        private static final int MSG_START_SEEK = 1007;
        private static final int MSG_SWITCH_DEF = 1020;
        private static final int MSG_SWITCH_DEF_END = 1021;

        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.Object obj = message.obj;
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            int i17 = message.what;
            if (i17 == 100) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.handleReportThreadExit();
                return;
            }
            if (i17 == 3000) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onLivePeriodReport();
                return;
            }
            if (i17 == 4000) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onReportLastEvent();
                return;
            }
            if (i17 == MSG_APP_BACKGROUND) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onAppBackground();
                return;
            }
            if (i17 == 2101) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onAppForeground();
                return;
            }
            switch (i17) {
                case 999:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerCreateStart(map);
                    return;
                case 1000:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerCreateDone(map);
                    return;
                case 1001:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onStartPrepare(map);
                    return;
                case 1002:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPrepareDone(map);
                    return;
                case 1003:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onStartPlayer(map);
                    return;
                case 1004:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerPause(map);
                    return;
                case 1005:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerStop(map);
                    return;
                case 1006:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerError(map);
                    return;
                case 1007:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onStartSeek(map);
                    return;
                case 1008:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onSeekComplete(map);
                    return;
                case 1009:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayComplete(map);
                    return;
                case 1010:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerRelease(map);
                    return;
                case 1011:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerReset(map);
                    return;
                case 1012:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onRenderingStart(map);
                    return;
                case 1013:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onBufferingStart(map);
                    return;
                case 1014:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onBufferingEnd(map);
                    return;
                case 1015:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onSetPlaySpeed(map);
                    return;
                case 1016:
                    if (obj instanceof java.lang.String) {
                        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onHandleHlsTag((java.lang.String) obj);
                        return;
                    }
                    return;
                case 1017:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onProxyInfoUpdate(map);
                    return;
                case 1018:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onCdnInfoUpdate(map);
                    return;
                case 1019:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onFirstPacketRead(map);
                    return;
                case 1020:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onSwitchDef(map);
                    return;
                case 1021:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onSwitchDefEnd(map);
                    return;
                case 1022:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onFirstClipOpen(map);
                    return;
                case MSG_PROTOCOL_UPDATE /* 1023 */:
                    com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onReportProtocolUpdate(map);
                    return;
                default:
                    switch (i17) {
                        case 2000:
                            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onGetCdn(map);
                            return;
                        case 2001:
                            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.on302Redirect(map);
                            return;
                        case 2002:
                            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onLoadSubtitle(map);
                            return;
                        case 2003:
                            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onPlayerEarlyError(map);
                            return;
                        case 2004:
                            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onSelectTrack(map);
                            return;
                        case 2005:
                            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onSelectTrackDone(map);
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* loaded from: classes16.dex */
    public interface IReportHandler {
        void handleReportEvent(int i17, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties);
    }

    /* loaded from: classes16.dex */
    public class LiveReportHandler implements com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler {
        public LiveReportHandler() {
        }

        @Override // com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler
        public void handleReportEvent(int i17, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
            boolean z17 = i17 <= 30 || i17 == 263;
            if (i17 == 30) {
                i17 = 205;
            } else if (i17 == 50) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.mEventHandler.removeMessages(3000);
                i17 = 263;
            } else if (i17 == 150) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.mEventHandler.removeMessages(3000);
            } else {
                if (i17 != 263) {
                    return;
                }
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.mEventHandler.removeMessages(3000);
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.mEventHandler.sendEmptyMessageDelayed(3000, 60000L);
            }
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.updateCommonParam(tPProperties, i17, z17);
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.updateLiveExParam(tPProperties, z17);
            if (i17 != 205) {
                tPProperties.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_LOADING_TIME, 0);
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.TAG, "liveExParam.prePlayLengthInt: " + com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.mReportParams.getLiveExParam().prePlayLengthInt);
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onReportEvent(tPProperties);
        }
    }

    /* loaded from: classes16.dex */
    public class ParamRecord {
        int bufferingCount;
        int bufferingDurationMs;
        java.lang.String cdnIp;
        java.lang.String cdnUip;
        java.lang.String cdnUrl;
        java.lang.String defId;
        long endBufferingTimeMs;
        long endPrepareTimeMs;
        int getSpeedCnt;
        int hitDownloaded;
        boolean isMultiTrack;
        boolean isSelectedSubtitle;
        boolean isSwitchingDef;
        int liveDelayMs;
        int maxSpeed;
        int playDurationMs;
        java.lang.String spanId;
        long startBufferingTimeMs;
        long startPlayTimeMs;
        long startPrepareTimeMs;
        java.util.ArrayList<com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.SubtitleInfo> subtitleInfos;
        int totalSpeed;
        java.lang.String tuid;

        private ParamRecord() {
            this.startPlayTimeMs = 0L;
            this.playDurationMs = 0;
            this.startPrepareTimeMs = 0L;
            this.endPrepareTimeMs = 0L;
            this.bufferingCount = 0;
            this.bufferingDurationMs = 0;
            this.startBufferingTimeMs = 0L;
            this.endBufferingTimeMs = 0L;
            this.liveDelayMs = 0;
            this.maxSpeed = 0;
            this.totalSpeed = 0;
            this.getSpeedCnt = 0;
            this.isSelectedSubtitle = false;
            this.isMultiTrack = false;
            this.isSwitchingDef = false;
            this.hitDownloaded = -1;
            this.defId = "";
            this.cdnUrl = "";
            this.cdnIp = "";
            this.cdnUip = "";
            this.spanId = "";
            this.tuid = "";
            this.subtitleInfos = new java.util.ArrayList<>();
        }

        public void reset() {
            this.startPlayTimeMs = 0L;
            this.playDurationMs = 0;
            this.startPrepareTimeMs = 0L;
            this.endPrepareTimeMs = 0L;
            this.bufferingCount = 0;
            this.bufferingDurationMs = 0;
            this.startBufferingTimeMs = 0L;
            this.endBufferingTimeMs = 0L;
            this.liveDelayMs = 0;
            this.maxSpeed = 0;
            this.totalSpeed = 0;
            this.getSpeedCnt = 0;
            this.isSelectedSubtitle = false;
            this.isMultiTrack = false;
            this.isSwitchingDef = false;
            this.hitDownloaded = -1;
            this.defId = "";
            this.cdnUrl = "";
            this.cdnIp = "";
            this.cdnUip = "";
            this.spanId = "";
            this.tuid = "";
            this.subtitleInfos.clear();
        }
    }

    /* loaded from: classes16.dex */
    public class SubtitleInfo {
        java.lang.String name;
        long opaque = -1;
        java.lang.String url;

        public SubtitleInfo(java.lang.String str, java.lang.String str2) {
            this.name = str;
            this.url = str2;
        }
    }

    /* loaded from: classes16.dex */
    public class VodReportHandler implements com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler {
        public VodReportHandler() {
        }

        @Override // com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.IReportHandler
        public void handleReportEvent(int i17, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
            boolean z17 = i17 <= 30;
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.updateCommonParam(iTPReportProperties, i17, z17);
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.updateVodExParam(iTPReportProperties, z17);
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.this.onReportEvent(iTPReportProperties);
        }
    }

    public TPReportManager(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    private java.lang.String getDeviceResolution() {
        if (this.mContext == null) {
            return "0";
        }
        if (!android.text.TextUtils.isEmpty(sDisplayResolutionReportString)) {
            return sDisplayResolutionReportString;
        }
        int i17 = this.mContext.getResources().getDisplayMetrics().widthPixels;
        java.lang.String str = this.mContext.getResources().getDisplayMetrics().heightPixels + "*" + i17;
        sDisplayResolutionReportString = str;
        return str;
    }

    private int getDeviceType() {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) this.mContext.getSystemService("uimode");
        if (uiModeManager == null) {
            return 2;
        }
        if (uiModeManager.getCurrentModeType() == 4) {
            return 9;
        }
        return (this.mContext.getResources().getConfiguration().screenLayout & 15) >= 3 ? 5 : 2;
    }

    private static java.lang.String getEventId(int i17) {
        if (i17 == 5) {
            return EVENT_KEY_INIT_PLAYER;
        }
        if (i17 == 15) {
            return EVENT_KEY_GET_CDN_URL;
        }
        if (i17 == 30) {
            return EVENT_KEY_FIRST_LOAD;
        }
        if (i17 == 40) {
            return EVENT_KEY_USER_SEEK;
        }
        if (i17 == 50) {
            return EVENT_KEY_PLAY_DONE;
        }
        if (i17 == 150) {
            return EVENT_KEY_LIVE_PLAY_ERROR;
        }
        if (i17 == 205) {
            return EVENT_KEY_LIVE_FIRST_LOAD;
        }
        if (i17 == 263) {
            return EVENT_KEY_LIVE_PERIOD;
        }
        switch (i17) {
            case 32:
                return EVENT_KEY_FIRST_RENDERING;
            case 33:
                return EVENT_KEY_LOAD_SUBTITLE;
            case 34:
                return EVENT_KEY_REDIRECT;
            case 35:
                return EVENT_KEY_BUFFERING;
            default:
                return "";
        }
    }

    private void getHitDownloadedInfo(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(PROXY_HITDOWNLOADED_KEY)) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
                if (paramRecord.hitDownloaded == -1) {
                    paramRecord.hitDownloaded = jSONObject.getInt(PROXY_HITDOWNLOADED_KEY);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    private boolean getMapValueBool(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, boolean z17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? z17 : ((java.lang.Boolean) obj).booleanValue();
    }

    private float getMapValueFloat(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, float f17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? f17 : ((java.lang.Float) obj).floatValue();
    }

    private int getMapValueInteger(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, int i17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? i17 : ((java.lang.Integer) obj).intValue();
    }

    private long getMapValueLong(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, long j17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? j17 : ((java.lang.Long) obj).longValue();
    }

    private java.lang.String getMapValueString(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? str2 : (java.lang.String) obj;
    }

    private int getMobileSubType(int i17) {
        switch (i17) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    private int getNetWorkType() {
        android.net.NetworkInfo activeNetworkInfo;
        int mobileSubType;
        android.content.Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                mobileSubType = 1;
                if (type != 1) {
                    if (type != 9) {
                        return 0;
                    }
                    mobileSubType = 10;
                }
            } else {
                mobileSubType = getMobileSubType(activeNetworkInfo.getSubtype());
            }
            return mobileSubType;
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleReportThreadExit() {
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "handleReportThreadExit");
        synchronized (this.mExitLock) {
            this.mIsExit = true;
            this.mExitLock.notify();
        }
    }

    private void init() {
        this.mReportThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainHandleThread("TP-ReportThread");
        this.mEventHandler = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.EventHandler(this.mReportThread.getLooper());
        this.mReportParams = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams();
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.addEventListener(this.mGlobalEventListener);
        synchronized (com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.class) {
            if (mCache == null) {
                mCache = new com.tencent.thumbplayer.utils.TPDiskReadWrite(this.mContext, REPORT_DATA_CACHE_NAME);
            }
            if (!hasReportLastEvent) {
                this.mEventHandler.obtainMessage(4000).sendToTarget();
            }
            hasReportLastEvent = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void on302Redirect(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "on302Redirect");
        if (map == null) {
            return;
        }
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.RedirectParams redirectParams = this.mReportParams.getRedirectParams();
        redirectParams.cdnTypeInt = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, 0);
        redirectParams.redirectCountInt = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_T302, 0);
        redirectParams.redirectedUrlString = getMapValueString(map, "url", "");
        redirectParams.starTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, 0L);
        redirectParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, 0L);
        redirectParams.errCodeString = getMapValueString(map, "code", "0");
        redirectParams.paramsToProperties(tPProperties);
        this.mReportHandler.handleReportEvent(34, tPProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAppBackground() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onAppBackground");
        if (this.mIsPlayDone || this.mPlayType == 1 || !this.mAppState) {
            return;
        }
        this.mAppState = false;
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        this.mReportParams.getBufferingTotalParams().paramsToProperties(tPProperties);
        this.mReportParams.getUserSeekTotalParams().paramsToProperties(tPProperties);
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayDoneParams playDoneParams = this.mReportParams.getPlayDoneParams();
        playDoneParams.endTimeUnix = java.lang.System.currentTimeMillis();
        playDoneParams.reasonInt = 2;
        playDoneParams.errCodeString = this.mErrorCode;
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            int i17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = i17 + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
            paramRecord2.startPlayTimeMs = 0L;
        }
        long j17 = this.mPlayStartTimeMs;
        if (j17 > 0) {
            this.mPlayDurationMs += playDoneParams.endTimeUnix - j17;
            this.mPlayStartTimeMs = 0L;
        }
        playDoneParams.playDurationFloat = ((float) this.mPlayDurationMs) / 1000.0f;
        playDoneParams.paramsToProperties(tPProperties);
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
        commonParams.stepInt = 50;
        commonParams.paramsToProperties(tPProperties);
        int i18 = this.mPlayType;
        if (i18 == 0) {
            updateVodExParam(tPProperties, false);
        } else if (i18 == 1) {
            updateLiveExParam(tPProperties, false);
        }
        if (mCache == null || android.text.TextUtils.isEmpty(this.mFlowId) || !this.mNeedReportToBeacon) {
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Cache report event. mFlowId: " + this.mFlowId);
        mCache.writeFile(this.mFlowId, tPProperties.getProperties());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAppForeground() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onAppForeground");
        if (this.mAppState) {
            return;
        }
        this.mAppState = true;
        removeCacheEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBufferingEnd(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onBufferingEnd");
        this.mIsBuffering = false;
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (!paramRecord.isSwitchingDef) {
            paramRecord.startPlayTimeMs = java.lang.System.currentTimeMillis();
        }
        if (map == null) {
            return;
        }
        long mapValueLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.System.currentTimeMillis());
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
        long j17 = paramRecord2.startBufferingTimeMs;
        int i17 = (int) (mapValueLong - j17);
        if (i17 > 1200 && !this.mIsSeeking) {
            paramRecord2.bufferingCount++;
            paramRecord2.endBufferingTimeMs = mapValueLong;
            paramRecord2.bufferingDurationMs += (int) (mapValueLong - j17);
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams bufferingOnceParams = this.mCurBufferingParams;
            if (bufferingOnceParams == null) {
                return;
            }
            bufferingOnceParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, 0L);
            this.mCurBufferingParams.errCodeString = this.mErrorCode;
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingTotalParams bufferingTotalParams = this.mReportParams.getBufferingTotalParams();
            bufferingTotalParams.bufferingCountInt++;
            bufferingTotalParams.bufferingDurationInt += i17;
            if (bufferingTotalParams.bufferingOnceParamsList.size() < 20) {
                bufferingTotalParams.bufferingOnceParamsList.add(this.mCurBufferingParams);
                com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
                this.mCurBufferingParams.paramsToProperties(tPProperties);
                this.mReportHandler.handleReportEvent(35, tPProperties);
            }
            this.mCurBufferingParams = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBufferingStart(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onBufferingStart");
        if (map == null) {
            return;
        }
        this.mIsBuffering = true;
        if (this.mIsSeeking) {
            return;
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            int i17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = i17 + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
            paramRecord2.startPlayTimeMs = 0L;
        }
        this.mParamRecord.startBufferingTimeMs = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.System.currentTimeMillis());
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams createBufferingOnceParams = this.mReportParams.createBufferingOnceParams();
        this.mCurBufferingParams = createBufferingOnceParams;
        createBufferingOnceParams.starTimeUnix = this.mParamRecord.startBufferingTimeMs;
        createBufferingOnceParams.formatInt = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, 0);
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams bufferingOnceParams = this.mCurBufferingParams;
        bufferingOnceParams.formatInt = commonParams.mediaFormatInt;
        bufferingOnceParams.reasonInt = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 0);
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.BufferingOnceParams bufferingOnceParams2 = this.mCurBufferingParams;
        bufferingOnceParams2.lastEventInt = this.mLastEvent;
        bufferingOnceParams2.sceneInt = this.mPlayScene;
        bufferingOnceParams2.bufferingPresentTimeLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, 0L) / 1000;
        this.mCurBufferingParams.urlString = getMapValueString(map, "url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCdnInfoUpdate(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.mParamRecord.cdnUrl = getMapValueString(map, "url", "");
        this.mParamRecord.cdnIp = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_IP, "");
        this.mParamRecord.cdnUip = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_UIP, "");
        if (android.text.TextUtils.isEmpty(this.mParamRecord.cdnUrl) || !this.mParamRecord.cdnUrl.contains("sid=")) {
            return;
        }
        int indexOf = this.mParamRecord.cdnUrl.indexOf("sid=");
        int indexOf2 = this.mParamRecord.cdnUrl.indexOf("&", indexOf);
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        paramRecord.tuid = indexOf2 > -1 ? paramRecord.cdnUrl.substring(indexOf + 4, indexOf2) : paramRecord.cdnUrl.substring(indexOf + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstClipOpen(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.mReportParams.getFirstLoadParams().firstOpenTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstPacketRead(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LiveExParam liveExParam = this.mReportParams.getLiveExParam();
        long mapValueLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.System.currentTimeMillis());
        liveExParam.getSyncFrameDurationInt = (int) (mapValueLong - this.mParamRecord.startPrepareTimeMs);
        this.mReportParams.getFirstLoadParams().firstPacketReadTimeUnix = mapValueLong;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onGetCdn(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onGetCdn");
        if (map == null) {
            return;
        }
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.GetCdnUrlParams getCdnParams = this.mReportParams.getGetCdnParams();
        getCdnParams.proxyIpString = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, "");
        getCdnParams.starTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, 0L);
        getCdnParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, 0L);
        getCdnParams.errCodeString = getMapValueString(map, "code", "0");
        getCdnParams.paramsToProperties(tPProperties);
        this.mReportHandler.handleReportEvent(15, tPProperties);
        if (android.text.TextUtils.isEmpty(getCdnParams.errCodeString) || getCdnParams.errCodeString.equals("0") || getCdnParams.errCodeString.equals(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN)) {
            return;
        }
        this.mErrorCode = getCdnParams.errCodeString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onHandleHlsTag(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onHandleHlsTag, tag is null");
            return;
        }
        if (!str.startsWith(LIVE_HLS_M3U8_TAG_PREFIX)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onHandleHlsTag, tag is not start with #EXT-X-PROGRAM-DATE-TIME:");
            return;
        }
        try {
            java.lang.String substring = str.substring(25);
            int indexOf = substring.indexOf(43);
            if (indexOf != -1) {
                str2 = substring.substring(0, indexOf).replace('T', ' ');
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "handleOnPlayerPrivaterHlsM3u8Tag , player_m3u8_tag , tag do not contains time zone");
                str2 = substring.replace('T', ' ');
            }
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            str2 = "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onHandleHlsTag , player_m3u8_tag , dataTime is null ");
            return;
        }
        long j17 = 0;
        try {
            java.util.Date parse = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).parse(str2);
            if (parse != null) {
                j17 = parse.getTime();
            }
        } catch (java.lang.Exception e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e18);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHandleHlsTag , player_m3u8_tag , sysCurTime: ");
        sb6.append(currentTimeMillis);
        sb6.append(", time:");
        sb6.append(j17);
        sb6.append(", delay:");
        long j18 = currentTimeMillis - j17;
        sb6.append(j18);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, sb6.toString());
        this.mParamRecord.liveDelayMs = (int) j18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLivePeriodReport() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onLivePeriodReport");
        this.mReportHandler.handleReportEvent(263, new com.tencent.thumbplayer.utils.TPProperties());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoadSubtitle(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onLoadSubtitle");
        if (map == null) {
            return;
        }
        this.mParamRecord.subtitleInfos.add(new com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.SubtitleInfo(getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, ""), getMapValueString(map, "url", "")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayComplete(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayComplete");
        if (map == null) {
            return;
        }
        map.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 0);
        onPlayEnd(map);
    }

    private void onPlayEnd(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayEnd");
        if (map == null || this.mIsPlayDone) {
            return;
        }
        this.mIsPlayDone = true;
        if (this.mPlayType != 1 && this.mIsPrepare) {
            onPrepareDone(new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
        }
        if (this.mIsBuffering) {
            onBufferingEnd(new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
        }
        if (this.mIsSeeking) {
            onSeekComplete(new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            int i17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = i17 + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
            paramRecord2.startPlayTimeMs = 0L;
        }
        this.mIsSeeking = false;
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        this.mReportParams.getBufferingTotalParams().paramsToProperties(tPProperties);
        this.mReportParams.getBufferingTotalParams().reset();
        this.mReportParams.getUserSeekTotalParams().paramsToProperties(tPProperties);
        this.mReportParams.getUserSeekTotalParams().reset();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayDoneParams playDoneParams = this.mReportParams.getPlayDoneParams();
        playDoneParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.System.currentTimeMillis());
        playDoneParams.reasonInt = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 0);
        playDoneParams.errCodeString = this.mErrorCode;
        long j17 = this.mPlayStartTimeMs;
        if (j17 > 0) {
            this.mPlayDurationMs += playDoneParams.endTimeUnix - j17;
            this.mPlayStartTimeMs = 0L;
        }
        playDoneParams.playDurationFloat = ((float) this.mPlayDurationMs) / 1000.0f;
        playDoneParams.paramsToProperties(tPProperties);
        this.mReportHandler.handleReportEvent(50, tPProperties);
        this.mErrorCode = "0";
        this.mReportParams.resetAllParam();
        removeCacheEvent();
        resetLocalParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerCreateDone(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerCreateDone");
        if (map == null) {
            return;
        }
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PlayerInitParams initParams = this.mReportParams.getInitParams();
        initParams.playEndTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.System.currentTimeMillis());
        initParams.errCodeString = this.mErrorCode;
        initParams.paramsToProperties(tPProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerCreateStart(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerCreateStart");
        if (map == null) {
            return;
        }
        this.mReportParams.getInitParams().playStarTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerEarlyError(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.mFlowId = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform();
        this.mErrorCode = getMapValueString(map, "code", "0");
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null) {
            this.mPlayType = tPDefaultReportInfo.getPlayType();
        }
        if (this.mPlayType == 1) {
            this.mReportHandler.handleReportEvent(150, new com.tencent.thumbplayer.utils.TPProperties());
        } else {
            map.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 3);
            this.mIsPlayDone = false;
            onPlayEnd(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerError(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerError");
        if (map == null) {
            return;
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            int i17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = i17 + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
            paramRecord2.startPlayTimeMs = 0L;
        }
        this.mErrorCode = getMapValueString(map, "code", "0");
        if (this.mPlayType == 1) {
            this.mReportHandler.handleReportEvent(150, new com.tencent.thumbplayer.utils.TPProperties());
        } else {
            map.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 3);
            onPlayEnd(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerPause(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerPause");
        if (map == null) {
            return;
        }
        if (this.mPlayStartTimeMs > 0) {
            this.mPlayDurationMs += getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.System.currentTimeMillis()) - this.mPlayStartTimeMs;
            this.mPlayStartTimeMs = 0L;
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            int i17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = i17 + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
            paramRecord2.startPlayTimeMs = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerRelease(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerRelease");
        if (map == null) {
            return;
        }
        map.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 1);
        onPlayEnd(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerReset(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerReset");
        if (map == null) {
            return;
        }
        map.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 1);
        onPlayEnd(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerStop(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPlayerStop");
        if (map == null) {
            return;
        }
        if (this.mPlayStartTimeMs > 0) {
            this.mPlayDurationMs += getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.System.currentTimeMillis()) - this.mPlayStartTimeMs;
            this.mPlayStartTimeMs = 0L;
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            int i17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = i17 + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
            paramRecord2.startPlayTimeMs = 0L;
        }
        map.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 1);
        onPlayEnd(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrepareDone(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.mIsPrepare) {
            this.mIsPrepare = false;
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPrepareDone");
            if (map == null) {
                return;
            }
            this.mParamRecord.endPrepareTimeMs = java.lang.System.currentTimeMillis();
            this.mParamRecord.isMultiTrack = getMapValueBool(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_MULTI_TRACK, false);
            com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
            if (getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAYER_TYPE, 0) == 1) {
                this.mPlayerType = 0;
            } else {
                this.mPlayerType = 1;
            }
            this.mMediaResolution = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, "");
            this.mMediaDurationMs = getMapValueLong(map, "duration", 0L);
            this.mMediaRate = (int) getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, 0L);
            java.lang.String mapValueString = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_FORMAT, "");
            if (mapValueString == null || !mapValueString.contains("hls")) {
                this.mDownloadType = 1;
            } else {
                this.mDownloadType = 3;
            }
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstLoadParams firstLoadParams = this.mReportParams.getFirstLoadParams();
            firstLoadParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, 0L);
            firstLoadParams.errCodeString = this.mErrorCode;
            firstLoadParams.paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(30, tPProperties);
            this.mReportParams.getFirstLoadParams().reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProxyInfoUpdate(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        int mapValueInteger = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, 0);
        this.mNetworkSpeed = mapValueInteger;
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        paramRecord.totalSpeed += mapValueInteger;
        paramRecord.getSpeedCnt++;
        if (mapValueInteger > paramRecord.maxSpeed) {
            paramRecord.maxSpeed = mapValueInteger;
        }
        java.lang.String mapValueString = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_FX_SPANID, "");
        if (android.text.TextUtils.isEmpty(mapValueString)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(mapValueString);
            if (jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_FX_SPANID)) {
                this.mParamRecord.spanId = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_FX_SPANID);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
        getHitDownloadedInfo(mapValueString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRenderingStart(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onRenderingStart");
        if (map == null) {
            return;
        }
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstRenderParams firstRenderParams = this.mReportParams.getFirstRenderParams();
        firstRenderParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, 0L);
        firstRenderParams.errCodeString = this.mErrorCode;
        firstRenderParams.paramsToProperties(tPProperties);
        this.mReportHandler.handleReportEvent(32, tPProperties);
        this.mReportParams.getFirstRenderParams().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReportEvent(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        java.lang.String str;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onReportEvent, needReportToBeacon:" + this.mNeedReportToBeacon + ", params:" + iTPReportProperties.toString());
        if (this.mNeedReportToBeacon) {
            java.util.HashMap hashMap = new java.util.HashMap();
            iTPReportProperties.propertiesToMap(hashMap);
            if (!hashMap.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP) || (str = (java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP)) == null) {
                return;
            }
            java.lang.String eventId = getEventId(java.lang.Integer.parseInt(str));
            if (android.text.TextUtils.isEmpty(eventId)) {
                return;
            }
            com.tencent.thumbplayer.common.report.TPBeaconReportWrapper.trackCustomKVEvent(eventId, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReportLastEvent() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onReportLastEvent");
        com.tencent.thumbplayer.utils.TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite == null) {
            return;
        }
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) tPDiskReadWrite.readAllFile();
            if (arrayList == null) {
                return;
            }
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                try {
                    java.util.Properties properties = (java.util.Properties) arrayList.get(i17);
                    if (properties != null) {
                        onReportEvent(new com.tencent.thumbplayer.utils.TPProperties(properties));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReportProtocolUpdate(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.mProto = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, "");
        this.mProtoVer = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTOVER, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSeekComplete(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams userSeekOnceParams;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onSeekComplete");
        this.mIsSeeking = false;
        if (map == null || (userSeekOnceParams = this.mCurSeekParams) == null) {
            return;
        }
        userSeekOnceParams.seekEndTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.System.currentTimeMillis());
        this.mCurSeekParams.endPresentTimeLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, 0L) / 1000;
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams userSeekOnceParams2 = this.mCurSeekParams;
        userSeekOnceParams2.errCodeString = this.mErrorCode;
        long j17 = userSeekOnceParams2.seekEndTimeUnix - userSeekOnceParams2.seekStartTimeUnix;
        if (j17 > 1200) {
            this.mSeekBufferingCount++;
            this.mSeekBufferingDuration = (int) (this.mSeekBufferingDuration + j17);
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekTotalParams userSeekTotalParams = this.mReportParams.getUserSeekTotalParams();
        userSeekTotalParams.seekTotalCountInt++;
        userSeekTotalParams.seekBufferingDurationInt = this.mSeekBufferingDuration;
        userSeekTotalParams.seekBufferingCountInt = this.mSeekBufferingCount;
        if (userSeekTotalParams.seekOnceParamsList.size() < 20) {
            userSeekTotalParams.seekOnceParamsList.add(this.mCurSeekParams);
            com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
            this.mCurSeekParams.paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(40, tPProperties);
        }
        this.mCurSeekParams = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSelectTrack(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onSelectTrack");
        if (map == null || this.mParamRecord.subtitleInfos.size() == 0 || getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SELECT_TRACK_TYPE, 0) != 3) {
            return;
        }
        this.mIsLoadingSubtitle = true;
        this.mParamRecord.isSelectedSubtitle = true;
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LoadSubtitleParams loadSubtitleParams = this.mReportParams.getLoadSubtitleParams();
        loadSubtitleParams.starTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, 0L);
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null) {
            loadSubtitleParams.cdnTypeInt = tPDefaultReportInfo.subtitleCdnType;
            loadSubtitleParams.cgiUrlIndex = tPDefaultReportInfo.subtitleUrlIndex;
        }
        long mapValueLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, -1L);
        java.lang.String mapValueString = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
        java.util.Iterator<com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.SubtitleInfo> it = this.mParamRecord.subtitleInfos.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.SubtitleInfo next = it.next();
            if (!android.text.TextUtils.isEmpty(mapValueString) && next.name.equals(mapValueString)) {
                loadSubtitleParams.subtitleUrlString = next.url;
                next.opaque = mapValueLong;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSelectTrackDone(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onSelectTrackDone");
        if (!this.mIsLoadingSubtitle || map == null || this.mParamRecord.subtitleInfos.size() == 0) {
            return;
        }
        long mapValueLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, -1L);
        if (mapValueLong == -1) {
            return;
        }
        java.util.Iterator<com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.SubtitleInfo> it = this.mParamRecord.subtitleInfos.iterator();
        while (it.hasNext()) {
            if (it.next().opaque == mapValueLong) {
                com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LoadSubtitleParams loadSubtitleParams = this.mReportParams.getLoadSubtitleParams();
                loadSubtitleParams.endTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, 0L);
                loadSubtitleParams.errCodeString = getMapValueString(map, "code", "0");
                loadSubtitleParams.bufferingDurationInt = (int) (loadSubtitleParams.endTimeUnix - loadSubtitleParams.starTimeUnix);
                com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
                loadSubtitleParams.paramsToProperties(tPProperties);
                this.mReportHandler.handleReportEvent(33, tPProperties);
                this.mIsLoadingSubtitle = false;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSetPlaySpeed(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        if (getMapValueFloat(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1.0f) != 1.0f) {
            this.mPlayScene = 2;
        } else {
            this.mPlayScene = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStartPlayer(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStartPlayer");
        this.mIsPlayDone = false;
        if (map == null) {
            return;
        }
        this.mParamRecord.startPlayTimeMs = java.lang.System.currentTimeMillis();
        long mapValueLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, 0L);
        if (this.mPlayStartTimeMs > 0) {
            this.mPlayDurationMs += java.lang.System.currentTimeMillis() - mapValueLong;
        }
        this.mPlayStartTimeMs = mapValueLong;
        if (this.mPlayType == 1) {
            this.mEventHandler.removeMessages(3000);
            this.mEventHandler.sendEmptyMessageDelayed(3000, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStartPrepare(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.mIsPrepare) {
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStartPrepare");
        this.mIsPlayDone = false;
        this.mFlowId = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_FLOW_ID, "");
        this.mIsUseP2P = getMapValueBool(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_P2P, false);
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null) {
            this.mPlayType = tPDefaultReportInfo.getPlayType();
        }
        int i17 = this.mPlayType;
        if (i17 == 1) {
            this.mReportHandler = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.LiveReportHandler();
        } else if (i17 == 0) {
            this.mReportHandler = new com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.VodReportHandler();
        }
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        this.mReportParams.getInitParams().paramsToProperties(tPProperties);
        this.mReportHandler.handleReportEvent(5, tPProperties);
        this.mParamRecord.startPrepareTimeMs = java.lang.System.currentTimeMillis();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.FirstLoadParams firstLoadParams = this.mReportParams.getFirstLoadParams();
        java.lang.String str = this.mParamRecord.cdnUrl;
        firstLoadParams.cdnUrlString = str;
        if (android.text.TextUtils.isEmpty(str)) {
            firstLoadParams.cdnUrlString = getMapValueString(map, "url", "");
        }
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo2 = this.mReportInfoGetter;
        if (tPDefaultReportInfo2 != null) {
            firstLoadParams.cgiUrlIndex = tPDefaultReportInfo2.cdnUrlIndex;
        }
        firstLoadParams.cgiUrlIndex = getMapValueInteger(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_URL_INDEX, 0);
        firstLoadParams.starTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, 0L);
        this.mReportParams.getFirstRenderParams().starTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, 0L);
        this.mIsPrepare = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStartSeek(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStartSeek");
        if (map == null) {
            return;
        }
        if (this.mIsBuffering) {
            onBufferingEnd(new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
        }
        if (this.mIsSeeking) {
            onSeekComplete(new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, java.lang.Long.valueOf(getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, 0L) / 1000)).build());
        }
        this.mIsSeeking = true;
        this.mLastEvent = 1;
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams createUserSeekOnceParams = this.mReportParams.createUserSeekOnceParams();
        this.mCurSeekParams = createUserSeekOnceParams;
        createUserSeekOnceParams.seekStartTimeUnix = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.System.currentTimeMillis());
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.UserSeekOnceParams userSeekOnceParams = this.mCurSeekParams;
        userSeekOnceParams.formatInt = commonParams.mediaFormatInt;
        userSeekOnceParams.startPresentTimeLong = getMapValueLong(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, 0L) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSwitchDef(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onSwitchDef");
        if (map == null) {
            return;
        }
        this.mParamRecord.defId = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, "");
        this.mParamRecord.isSwitchingDef = true;
        if (this.mPlayType == 1) {
            this.mEventHandler.removeMessages(3000);
            onLivePeriodReport();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
            paramRecord.startPrepareTimeMs = 0L;
            paramRecord.endPrepareTimeMs = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSwitchDefEnd(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onSwitchDefEnd");
        if (map == null) {
            return;
        }
        this.mParamRecord.defId = getMapValueString(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, "");
        this.mParamRecord.isSwitchingDef = false;
        if (this.mPlayType == 1) {
            this.mReportHandler.handleReportEvent(30, new com.tencent.thumbplayer.utils.TPProperties());
            this.mEventHandler.removeMessages(3000);
            this.mEventHandler.sendEmptyMessageDelayed(3000, 60000L);
            this.mParamRecord.startPlayTimeMs = java.lang.System.currentTimeMillis();
        }
    }

    private void release() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "release: ");
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.removeEventListener(this.mGlobalEventListener);
        android.os.HandlerThread handlerThread = this.mReportThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mReportThread = null;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "release: end!");
    }

    private void removeCacheEvent() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "removeCacheEvent: mFlowId: " + this.mFlowId);
        if (mCache == null || android.text.TextUtils.isEmpty(this.mFlowId)) {
            return;
        }
        mCache.rmFile(this.mFlowId);
    }

    private void resetLocalParam() {
        this.mPlayStartTimeMs = 0L;
        this.mPlayDurationMs = 0L;
        this.mSeekBufferingCount = 0;
        this.mSeekBufferingDuration = 0;
        this.mIsSeeking = false;
        this.mIsBuffering = false;
        this.mIsPrepare = false;
        this.mIsLoadingSubtitle = false;
        this.mFlowId = "";
        this.mPlayerType = 0;
        this.mDownloadType = 0;
        this.mMediaRate = 0;
        this.mMediaDurationMs = 0L;
        this.mNetworkSpeed = 0;
        this.mIsUseP2P = false;
        this.mProto = "";
        this.mProtoVer = "";
        this.mMediaResolution = "";
        this.mPlayType = -1;
        this.mErrorCode = "0";
        this.mParamRecord.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCommonParam(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties, int i17, boolean z17) {
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
        commonParams.stepInt = i17;
        commonParams.seqInt++;
        java.lang.String str = this.mFlowId;
        commonParams.flowIdString = str;
        commonParams.playNoString = str;
        commonParams.signalStrengthInt = this.mSignalStrength;
        commonParams.networkSpeedInt = this.mNetworkSpeed;
        commonParams.networkTypeInt = getNetWorkType();
        commonParams.deviceNameString = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName();
        commonParams.deviceResolutionString = getDeviceResolution();
        commonParams.osVersionString = OS_VERSION;
        commonParams.p2pVersionString = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getNativeLibVersion();
        commonParams.playerVersionString = com.tencent.thumbplayer.config.TPPlayerConfig.VERSION;
        commonParams.playerTypeInt = this.mPlayerType;
        commonParams.p2pInt = this.mIsUseP2P ? 1 : 0;
        commonParams.proto = this.mProto;
        commonParams.protover = this.mProtoVer;
        commonParams.playTypeInt = this.mPlayType;
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null && z17) {
            commonParams.testIdInt = tPDefaultReportInfo.testId;
            commonParams.cdnIdInt = tPDefaultReportInfo.cdnId;
            commonParams.downloadTypeInt = tPDefaultReportInfo.dlType;
            commonParams.loginTypeInt = tPDefaultReportInfo.loginType;
            commonParams.mediaFormatInt = tPDefaultReportInfo.mediaFormat;
            commonParams.mediaRateInt = tPDefaultReportInfo.mediaRate;
            commonParams.platformLong = tPDefaultReportInfo.platform;
            commonParams.onlineInt = tPDefaultReportInfo.isOnline ? 1 : 0;
            commonParams.mediaDurationFloat = tPDefaultReportInfo.mediaDuration;
            commonParams.uinString = tPDefaultReportInfo.uin;
            commonParams.qqOpenIdString = tPDefaultReportInfo.qqOpenId;
            commonParams.wxOpenIdString = tPDefaultReportInfo.wxOpenId;
            commonParams.guidString = tPDefaultReportInfo.guid;
            commonParams.uipString = tPDefaultReportInfo.uip;
            commonParams.cdnUipString = tPDefaultReportInfo.cdnUip;
            commonParams.cdnIpString = tPDefaultReportInfo.cdnIp;
            commonParams.appVersionString = tPDefaultReportInfo.appVersion;
            commonParams.vidString = tPDefaultReportInfo.vid;
            commonParams.mediaResolutionString = tPDefaultReportInfo.mediaResolution;
            commonParams.scenesId = tPDefaultReportInfo.scenesId;
            java.util.Properties properties = tPDefaultReportInfo.reportInfoProperties;
            if (properties != null) {
                for (java.util.Map.Entry entry : properties.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value == null) {
                        iTPReportProperties.put(key.toString(), "");
                    } else {
                        iTPReportProperties.put(key.toString(), value.toString());
                    }
                }
            }
            this.mPlayType = this.mReportInfoGetter.getPlayType();
        }
        if (commonParams.platformLong <= 0) {
            commonParams.platformLong = com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform();
        }
        if (android.text.TextUtils.isEmpty(commonParams.uinString)) {
            commonParams.uinString = com.tencent.thumbplayer.config.TPPlayerConfig.getUserUin();
        }
        if (android.text.TextUtils.isEmpty(commonParams.guidString)) {
            commonParams.guidString = com.tencent.thumbplayer.config.TPPlayerConfig.getGuid();
        }
        if (android.text.TextUtils.isEmpty(commonParams.appVersionString)) {
            commonParams.appVersionString = com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(this.mContext);
        }
        if (android.text.TextUtils.isEmpty(commonParams.uipString)) {
            commonParams.uipString = this.mParamRecord.cdnUip;
        }
        if (android.text.TextUtils.isEmpty(commonParams.cdnUipString)) {
            commonParams.cdnUipString = this.mParamRecord.cdnUip;
        }
        if (android.text.TextUtils.isEmpty(commonParams.cdnIpString)) {
            commonParams.cdnIpString = this.mParamRecord.cdnIp;
        }
        if (commonParams.downloadTypeInt <= 0) {
            commonParams.downloadTypeInt = this.mDownloadType;
        }
        if (android.text.TextUtils.isEmpty(commonParams.mediaResolutionString)) {
            commonParams.mediaResolutionString = this.mMediaResolution;
        }
        if (commonParams.mediaDurationFloat <= 0.0f) {
            commonParams.mediaDurationFloat = ((float) this.mMediaDurationMs) / 1000.0f;
        }
        if (commonParams.mediaRateInt <= 0) {
            commonParams.mediaRateInt = this.mMediaRate;
        }
        commonParams.paramsToProperties(iTPReportProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLiveExParam(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties, boolean z17) {
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.LiveExParam liveExParam = this.mReportParams.getLiveExParam();
        if (liveExParam == null) {
            return;
        }
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof com.tencent.thumbplayer.api.report.TPLiveReportInfo) && z17) {
            liveExParam.adPlayLengthInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).adPlayLength;
            liveExParam.liveProgramIdInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).programId;
            liveExParam.streamIdInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).streamId;
            liveExParam.contentIdInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).contentId;
            liveExParam.playTimeInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).playTime;
            liveExParam.liveTypeInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).liveType;
            liveExParam.isUserPayInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).isUserPay ? 1 : 0;
            liveExParam.isLookBackInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).isLookBack ? 1 : 0;
            liveExParam.cdnServerString = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).cdnServer;
            liveExParam.freeTypeInt = tPDefaultReportInfo.freeType;
            liveExParam.userQQString = tPDefaultReportInfo.uin;
            liveExParam.userIpString = tPDefaultReportInfo.uip;
            liveExParam.isStreamP2PInt = tPDefaultReportInfo.enableP2p ? 1 : 0;
        }
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof com.tencent.thumbplayer.api.report.TPLiveReportInfo)) {
            liveExParam.liveDelayInt = ((com.tencent.thumbplayer.api.report.TPLiveReportInfo) tPDefaultReportInfo).liveDelay;
        }
        liveExParam.isUseP2PInt = this.mIsUseP2P ? 1 : 0;
        java.lang.String str = this.mParamRecord.cdnUrl;
        liveExParam.downloadUrl = str;
        if (android.text.TextUtils.isEmpty(str)) {
            liveExParam.downloadUrl = this.mReportParams.getFirstLoadParams().cdnUrlString;
        }
        liveExParam.downloadServerIpString = this.mParamRecord.cdnIp;
        liveExParam.reportTimeLong = java.lang.System.currentTimeMillis();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        if (paramRecord.startPlayTimeMs > 0) {
            long j17 = paramRecord.playDurationMs;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord2 = this.mParamRecord;
            paramRecord.playDurationMs = (int) (j17 + (currentTimeMillis - paramRecord2.startPlayTimeMs));
            if (this.mIsPlayDone || this.mIsBuffering || paramRecord2.isSwitchingDef) {
                paramRecord2.startPlayTimeMs = 0L;
            } else {
                paramRecord2.startPlayTimeMs = java.lang.System.currentTimeMillis();
            }
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord3 = this.mParamRecord;
        liveExParam.prePlayLengthInt = paramRecord3.playDurationMs;
        paramRecord3.playDurationMs = 0;
        liveExParam.playerVersionString = com.tencent.thumbplayer.config.TPPlayerConfig.VERSION;
        liveExParam.deviceTypeInt = getDeviceType();
        liveExParam.networkTypeInt = getNetWorkType();
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord4 = this.mParamRecord;
        liveExParam.maxSpeedInt = paramRecord4.maxSpeed;
        paramRecord4.maxSpeed = 0;
        liveExParam.testSpeedInt = this.mNetworkSpeed;
        int i17 = paramRecord4.getSpeedCnt;
        if (i17 > 0) {
            liveExParam.downSpeedInt = paramRecord4.totalSpeed / i17;
            paramRecord4.totalSpeed = 0;
            paramRecord4.getSpeedCnt = 0;
        }
        liveExParam.liveTagInt = 0;
        liveExParam.extraInfoString = "";
        liveExParam.reconnectCntInt = 0;
        liveExParam.connectTimeInt = 0;
        liveExParam.getUrlTimeInt = 0;
        liveExParam.defSwitchString = paramRecord4.defId;
        liveExParam.loadingTimeLong = paramRecord4.endPrepareTimeMs - paramRecord4.startPrepareTimeMs;
        liveExParam.blockTimeInt = paramRecord4.bufferingDurationMs;
        liveExParam.blockCountInt = paramRecord4.bufferingCount;
        paramRecord4.bufferingCount = 0;
        paramRecord4.bufferingDurationMs = 0;
        liveExParam.errCodeInt = 0;
        liveExParam.fullErrCodeString = this.mErrorCode;
        liveExParam.spanId = paramRecord4.spanId;
        liveExParam.tuid = paramRecord4.tuid;
        liveExParam.paramsToProperties(iTPReportProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVodExParam(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties, boolean z17) {
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.VodExParam vodExParam = this.mReportParams.getVodExParam();
        if (vodExParam == null) {
            return;
        }
        com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof com.tencent.thumbplayer.api.report.TPVodReportInfo) && z17) {
            vodExParam.currentPlayInt = ((com.tencent.thumbplayer.api.report.TPVodReportInfo) tPDefaultReportInfo).currentPlayState;
            vodExParam.optimizedPlayInt = ((com.tencent.thumbplayer.api.report.TPVodReportInfo) tPDefaultReportInfo).optimizedPlay;
            vodExParam.hasSubtitleInt = ((com.tencent.thumbplayer.api.report.TPVodReportInfo) tPDefaultReportInfo).hasSubtitles ? 1 : 0;
            vodExParam.bizIdInt = ((com.tencent.thumbplayer.api.report.TPVodReportInfo) tPDefaultReportInfo).bizId;
            vodExParam.clipInt = ((com.tencent.thumbplayer.api.report.TPVodReportInfo) tPDefaultReportInfo).clipCount;
            vodExParam.statusInt = ((com.tencent.thumbplayer.api.report.TPVodReportInfo) tPDefaultReportInfo).videoStatus;
            vodExParam.freeTypeInt = tPDefaultReportInfo.freeType;
        }
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.ParamRecord paramRecord = this.mParamRecord;
        vodExParam.multiTrackInt = paramRecord.isMultiTrack ? 1 : 0;
        vodExParam.isSelectedSubtitleInt = paramRecord.isSelectedSubtitle ? 1 : 0;
        vodExParam.hevcLcInt = 0;
        vodExParam.hitDownloaded = paramRecord.hitDownloaded;
        vodExParam.paramsToProperties(iTPReportProperties);
    }

    public boolean doReportSampling() {
        if (java.lang.Math.random() < this.mSamplingRate) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reports are sampled");
            this.mNeedReportToBeacon = true;
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reports are not sampled");
            this.mNeedReportToBeacon = false;
        }
        return this.mNeedReportToBeacon;
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onAttach() {
        init();
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onDetach() {
        release();
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onEvent(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        int i27;
        switch (i17) {
            case 100:
                i27 = 999;
                break;
            case 101:
                i27 = 1000;
                break;
            case 102:
                i27 = 1001;
                break;
            case 103:
                i27 = 1002;
                break;
            case 104:
                i27 = 1003;
                break;
            case 105:
                i27 = 1012;
                break;
            case 106:
                i27 = 1004;
                break;
            case 107:
                i27 = 1005;
                break;
            case 108:
                i27 = 1006;
                break;
            case 109:
                i27 = 1007;
                break;
            case 110:
                i27 = 1008;
                break;
            case 111:
                i27 = 1009;
                break;
            case 112:
                i27 = 1010;
                break;
            case 113:
                i27 = 1011;
                break;
            case 114:
                i27 = 1013;
                break;
            case 115:
                i27 = 1014;
                break;
            case 116:
                i27 = 1015;
                break;
            case 117:
                i27 = 1016;
                break;
            case 118:
                i27 = 2002;
                break;
            case 119:
                i27 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT;
                break;
            case 120:
                i27 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
                break;
            case 121:
                i27 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER;
                break;
            case 122:
                i27 = 2004;
                break;
            case 123:
                i27 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
                break;
            case 124:
                i27 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
                break;
            default:
                switch (i17) {
                    case 200:
                        i27 = 1017;
                        break;
                    case 201:
                        i27 = 1018;
                        break;
                    case 202:
                        i27 = 1023;
                        break;
                    default:
                        return;
                }
        }
        this.mEventHandler.obtainMessage(i27, obj).sendToTarget();
    }

    @Override // com.tencent.thumbplayer.api.report.ITPBusinessReportManager
    public void reportEvent(int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
    }

    @Override // com.tencent.thumbplayer.api.report.ITPBusinessReportManager
    public void setReportInfoGetter(com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo) {
        this.mReportInfoGetter = tPDefaultReportInfo;
    }

    @Override // com.tencent.thumbplayer.api.report.ITPBusinessReportManager
    public void setReportSamplingRate(double d17) {
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        if (d17 > 1.0d) {
            d17 = 1.0d;
        }
        this.mSamplingRate = d17;
    }
}
