package com.tencent.thumbplayer.tplayer;

/* loaded from: classes16.dex */
public class TPPlayer implements com.tencent.thumbplayer.api.ITPPlayer {
    private static java.lang.String LOG_API_CALL_PREFIX = "api call:";
    private static final int MSG_INDEX = 256;
    private static final int MSG_ON_AUDIOPCMOUT = 267;
    private static final int MSG_ON_COMPLETION = 260;
    private static final int MSG_ON_ERROR = 262;
    private static final int MSG_ON_INFO = 261;
    private static final int MSG_ON_PLAYER_STATE_CHANGE = 277;
    private static final int MSG_ON_PLAY_FLOW_EVENT = 1256;
    private static final int MSG_ON_PREPARED = 257;
    private static final int MSG_ON_PROXY_ABTEST_INFO = 281;
    private static final int MSG_ON_PROXY_ALL_DOWNLOAD_FINISH = 271;
    private static final int MSG_ON_PROXY_CDN_URL_EXPIRED = 275;
    private static final int MSG_ON_PROXY_DOWN_LOAD_STATUS_UPDATE = 272;
    private static final int MSG_ON_PROXY_NO_MORE_DATA = 276;
    private static final int MSG_ON_PROXY_PLAYERROR = 268;
    private static final int MSG_ON_PROXY_PLAY_CDN_INFO_UPDATE = 270;
    private static final int MSG_ON_PROXY_PLAY_CDN_URL_UPDATE = 269;
    private static final int MSG_ON_PROXY_PROGRESS_UPDATE = 274;
    private static final int MSG_ON_PROXY_PROTOCOL_UPDATE = 273;
    private static final int MSG_ON_PROXY_SWITCH_DEFINITION = 278;
    private static final int MSG_ON_RPOXY_DETECTED_MULTI_NETWORK_CARD_AND_LOW_SPEED = 283;
    private static final int MSG_ON_RPOXY_M3U8_REFRESH = 282;
    private static final int MSG_ON_RPOXY_MULTI_NETWORK_CARD_STATUS_CHANGE = 284;
    private static final int MSG_ON_SEEK_COMPLETE = 263;
    private static final int MSG_ON_STOP_ASYNC_COMPLETE = 280;
    private static final int MSG_ON_SUBTITLE_DATA = 265;
    private static final int MSG_ON_SUBTITLE_FRAME_BUFFER = 279;
    private static final int MSG_ON_VIDEOFRAMEOUT = 266;
    private static final int MSG_ON_VIDEO_SIZE_CHANGE = 264;
    private static final java.lang.String TAG = "TPPlayer";
    private static final android.util.SparseIntArray mOnInfoMsgTypeToOnDetailMsgType;
    private static java.util.concurrent.atomic.AtomicInteger sLifeCycleId = new java.util.concurrent.atomic.AtomicInteger(1000);
    private com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader mAssetResourceLoader;
    private long mCurrentDownloadSizeByte;
    private long mDownloadPlayableDurationMs;
    private boolean mEnableSuggestedBitrateCallback;
    private android.os.HandlerThread mHandlerThread;
    private com.tencent.thumbplayer.log.TPBaseLogger mLogger;
    private final com.tencent.thumbplayer.datatransport.ITPPlayManager mPlayProxyManager;
    private java.util.concurrent.atomic.AtomicInteger mPlayTaskId;
    private final com.tencent.thumbplayer.adapter.ITPPlayerAdapter mPlayerAdapter;
    private com.tencent.thumbplayer.tplayer.TPPlayerListeners mPlayerListeners;
    private int mProxyStatus;
    private com.tencent.thumbplayer.tplayer.reportv2.TPReportController mReportController;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager mReportManager;
    private com.tencent.thumbplayer.tplayer.plugins.report.TPReportNonImplPlugin mReportNonImplPlugin;
    private int mSkipEndTimeMs;
    private int mStartTimeMs;
    private com.tencent.thumbplayer.tplayer.TPContext mTPContext;
    private com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager mTPPluginManager;
    private android.os.Looper mThreadLooper;
    private long mTotalFileSizeByte;
    private com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler mTransformCallbackHandler;
    private long mUniqueIdCounter;
    private java.util.Map<java.lang.Long, java.lang.Long> mUniqueIdToOpaqueMap;
    private java.lang.String mUrl;
    private volatile boolean mUseProxy;
    private boolean mUsingDefaultLogContext;
    private java.util.ArrayList<java.lang.String> proxyTrackUrls;

    /* loaded from: classes16.dex */
    public class InnerPlayerListener implements com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener {
        public InnerPlayerListener() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener tPPlayerProxyListener = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayProxyManager.getTPPlayerProxyListener();
            if (tPPlayerProxyListener != null) {
                return tPPlayerProxyListener.getAdvRemainTimeMs();
            }
            return -1L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.getContentType(i17, str, str2);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter iTPPlayerAdapter = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter;
            if (iTPPlayerAdapter != null) {
                return iTPPlayerAdapter.getCurrentPlayClipNo();
            }
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPlayOffset() {
            return com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter.getDemuxerOffsetInFile();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return com.tencent.thumbplayer.tplayer.TPPlayer.this.getCurrentPositionMs();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.getDataFilePath(i17, str, str2);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.getDataTotalSize(i17, str, str2);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.getM3U8Content(i17, str, str2);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object getPlayInfo(long j17) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter iTPPlayerAdapter = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter;
            if (iTPPlayerAdapter != null) {
                return java.lang.Math.max(iTPPlayerAdapter.getPlayableDurationMs() - com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter.getCurrentPositionMs(), 0L);
            }
            return 0L;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener
        public void onAudioPcmOut(com.tencent.thumbplayer.api.TPAudioFrameBuffer tPAudioFrameBuffer) {
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.onAudioFrameOut(com.tencent.thumbplayer.tplayer.TPPlayer.this, tPAudioFrameBuffer);
            }
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                return tPPlayerListeners.onAudioProcessFrameOut(com.tencent.thumbplayer.tplayer.TPPlayer.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener
        public void onCompletion() {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.pushEvent(111, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 0).build());
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(260, 0, 0, null);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener
        public void onDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.onDetailInfo(com.tencent.thumbplayer.tplayer.TPPlayer.this, tPPlayerDetailInfo);
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadCdnUrlExpired");
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(275, 0, 0, map);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadCdnUrlInfoUpdate, url:" + str + ", cdnIp:" + str2 + ", uip:" + str3 + ", errorCodeStr:" + str4);
            com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.pushEvent(201, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put("url", str).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_IP, str2).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_CDN_UIP, str3).build());
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(270, 0, 0, tPCDNURLInfo);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(java.lang.String str) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadCdnUrlUpdate, url:" + str);
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(269, 0, 0, str);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i17, int i18, java.lang.String str) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadError, moduleID:" + i17 + ", errorCode:" + i18 + ", extInfo:" + str);
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handleOnError(i17, i18);
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PROXY_PLAYERROR, i17, i18, str);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadFinish");
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(271, 0, 0, 0);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadProgressUpdate");
            long j19 = i17;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mDownloadPlayableDurationMs = j19;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mCurrentDownloadSizeByte = j17;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mTotalFileSizeByte = j18;
            com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = j19;
            tPDownLoadProgressInfo.downloadSpeedKBps = i18;
            tPDownLoadProgressInfo.currentDownloadSize = j17;
            tPDownLoadProgressInfo.totalFileSize = j18;
            tPDownLoadProgressInfo.extraInfo = str;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.pushEvent(200, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, java.lang.Integer.valueOf(i18)).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_FX_SPANID, str).build());
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(274, 0, 0, tPDownLoadProgressInfo);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadProtocolUpdate, protocol:" + str + ", protocolVer:" + str2);
            com.tencent.thumbplayer.api.TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.pushEvent(202, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, str).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTOVER, str2).build());
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(273, 0, 0, tPProtocolInfo);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i17) {
            if (i17 != com.tencent.thumbplayer.tplayer.TPPlayer.this.mProxyStatus) {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadStatusUpdate, status:" + i17);
                com.tencent.thumbplayer.tplayer.TPPlayer.this.mProxyStatus = i17;
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(272, i17, 0, null);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener
        public void onError(int i17, int i18, long j17, long j18) {
            java.lang.String playErrorCodeStr = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayProxyManager.getPlayErrorCodeStr();
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onError playerErrorCodeStr=" + playErrorCodeStr);
            if (!android.text.TextUtils.isEmpty(playErrorCodeStr)) {
                try {
                    i18 = java.lang.Integer.parseInt(playErrorCodeStr);
                    i17 = 4000;
                } catch (java.lang.Exception e17) {
                    com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.printException(e17);
                }
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handleOnError(i17, i18);
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onError errorTypeReal=" + i17 + ", errorCodeReal=" + i18);
            com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams();
            tPSwitchCommonParams.arg1 = j17;
            tPSwitchCommonParams.arg2 = j18;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_ERROR, i17, i18, tPSwitchCommonParams);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener
        public void onInfo(int i17, long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handleOnInfo(i17, j17, j18, obj);
            if (i17 == 1011) {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.handleSelectAudioTrack(obj);
                return;
            }
            if (i17 == 1012) {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.handleAudioTrackProxy(obj);
                return;
            }
            if (i17 == 4) {
                obj = java.lang.Long.valueOf(com.tencent.thumbplayer.tplayer.TPPlayer.this.getOpaqueFromUniqueId(((java.lang.Long) obj).longValue(), "async call select track"));
            }
            com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams();
            tPSwitchCommonParams.arg1 = j17;
            tPSwitchCommonParams.arg2 = j18;
            tPSwitchCommonParams.extraObject = obj;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(261, i17, 0, tPSwitchCommonParams);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object onPlayCallback(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            if (i17 == 1) {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownloadNoMoreData");
                com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(276, 0, 0, obj);
            } else if (i17 != 2) {
                switch (i17) {
                    case 8:
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("AB test info from download proxy received, key: " + obj + ", value: " + obj2);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put((java.lang.String) obj, java.lang.Integer.valueOf((java.lang.String) obj2));
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PROXY_ABTEST_INFO, 0, 0, hashMap);
                        break;
                    case 9:
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownload Refresh M3U8");
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_RPOXY_M3U8_REFRESH, 0, 0, null);
                        break;
                    case 10:
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownload multi network card not open, current low speed");
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(283, 0, 0, null);
                        break;
                    case 11:
                        java.lang.String str = (java.lang.String) obj;
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownload multi network use status change" + str);
                        com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(284, 0, 0, str);
                        break;
                }
            } else if (obj3 instanceof java.lang.Integer) {
                java.lang.Integer num = (java.lang.Integer) obj3;
                com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onDownload suggest bitrate(bps):" + num);
                com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PROXY_SWITCH_DEFINITION, num.intValue(), 0, null);
            } else {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION, err ext3.");
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener
        public void onPrepared() {
            int i17;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayProxyManager.setProxyPlayState(0);
            com.tencent.thumbplayer.adapter.TPPlaybackInfo playbackInfo = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter.getPlaybackInfo();
            java.lang.String str = playbackInfo.getWidth() + "*" + playbackInfo.getHeight();
            com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter.getTrackInfo();
            if (trackInfo != null) {
                i17 = 0;
                for (com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo : trackInfo) {
                    if (tPTrackInfo.trackType == 2) {
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.pushEvent(103, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PLAYER_TYPE, java.lang.Integer.valueOf(com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter.getPlayerType())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, str).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, java.lang.Long.valueOf(playbackInfo.getVideoBitRate() / 8000)).put("duration", java.lang.Long.valueOf(playbackInfo.getDurationMs())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_FORMAT, playbackInfo.getContainerFormat()).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.VodExKeys.VOD_EX_MULTI_TRACK, java.lang.Boolean.valueOf(i17 > 1)).build());
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(257, 0, 0, null);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.onReadData(i17, str, str2, j17, j18);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener
        public com.tencent.thumbplayer.api.TPRemoteSdpInfo onSdpExchange(java.lang.String str, int i17) {
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                return tPPlayerListeners.onSdpExchange(com.tencent.thumbplayer.tplayer.TPPlayer.this, str, i17);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener
        public void onSeekComplete() {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.setProxyStatePlayingOrPause();
            com.tencent.thumbplayer.tplayer.TPPlayer.this.pushEvent(110, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, java.lang.Long.valueOf(com.tencent.thumbplayer.tplayer.TPPlayer.this.getCurrentPositionMs())).build());
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(263, 0, 0, null);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.onStartReadData(i17, str, str2, j17, j18);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnStateChangeListener
        public void onStateChange(int i17, int i18) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(277, i17, i18, null);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
            if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader != null) {
                return com.tencent.thumbplayer.tplayer.TPPlayer.this.mAssetResourceLoader.onStopReadData(i17, str, str2, i18);
            }
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.error("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener
        public void onSubtitleData(com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_SUBTITLE_DATA, 0, 0, tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener
        public void onSubtitleFrameOut(com.tencent.thumbplayer.api.TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_SUBTITLE_FRAME_BUFFER, 0, 0, tPSubtitleFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener
        public void onVideoFrameOut(com.tencent.thumbplayer.api.TPVideoFrameBuffer tPVideoFrameBuffer) {
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.onVideoFrameOut(com.tencent.thumbplayer.tplayer.TPPlayer.this, tPVideoFrameBuffer);
            }
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener
        public com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onVideoProcessFrameOut(com.tencent.thumbplayer.api.TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                return tPPlayerListeners.onVideoProcessFrameOut(com.tencent.thumbplayer.tplayer.TPPlayer.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener
        public void onVideoSizeChanged(long j17, long j18) {
            com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams();
            tPSwitchCommonParams.arg1 = j17;
            tPSwitchCommonParams.arg2 = j18;
            com.tencent.thumbplayer.tplayer.TPPlayer.this.handlePlayerCallback(264, 0, 0, tPSwitchCommonParams);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object getPlayInfo(java.lang.String str) {
            return null;
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        mOnInfoMsgTypeToOnDetailMsgType = sparseIntArray;
        sparseIntArray.put(106, 1005);
        sparseIntArray.put(105, 1006);
    }

    public TPPlayer(android.content.Context context) {
        this(context, null);
    }

    private long assignUniqueIdForOpaque(long j17, java.lang.String str) {
        this.mUniqueIdToOpaqueMap.put(java.lang.Long.valueOf(this.mUniqueIdCounter), java.lang.Long.valueOf(j17));
        this.mLogger.info(str + ", convert opaque(" + j17 + ") => uniqueId(" + this.mUniqueIdCounter + ")");
        long j18 = this.mUniqueIdCounter;
        this.mUniqueIdCounter = 1 + j18;
        return j18;
    }

    private com.tencent.thumbplayer.api.proxy.TPDownloadParamData createDownloadParamData(int i17, int i18) {
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(0);
        tPDownloadParamData.setStarTimeMS(i17);
        tPDownloadParamData.setEndTimeMS(i18);
        return tPDownloadParamData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getOpaqueFromUniqueId(long j17, java.lang.String str) {
        if (!this.mUniqueIdToOpaqueMap.containsKey(java.lang.Long.valueOf(j17))) {
            this.mLogger.error(str + ", invalid uniqueId");
            return -1L;
        }
        long longValue = this.mUniqueIdToOpaqueMap.get(java.lang.Long.valueOf(j17)).longValue();
        this.mLogger.info(str + ", convert uniqueId(" + j17 + ") => opaque(" + longValue + ")");
        return longValue;
    }

    private int getUrlProtocolType(java.lang.String str) {
        if (this.mPlayProxyManager.isUseResourceLoader()) {
            return 5;
        }
        return com.tencent.thumbplayer.utils.TPUrlAnalyzer.getUrlProtocolType(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAudioTrackProxy(java.lang.Object obj) {
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData;
        if (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo) {
            if (!isUseProxyEnable()) {
                this.mLogger.info("handleAudioTrackProxy, proxy not enable and use orinal url");
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo) obj;
            java.util.Iterator<com.tencent.thumbplayer.api.TPOptionalParam> it = tPAudioTrackInfo.paramData.iterator();
            while (true) {
                if (!it.hasNext()) {
                    tPDownloadParamData = null;
                    break;
                }
                com.tencent.thumbplayer.api.TPOptionalParam next = it.next();
                if (next.getKey() == 0) {
                    tPDownloadParamData = (com.tencent.thumbplayer.api.proxy.TPDownloadParamData) next.getParamObject().objectValue;
                    break;
                }
            }
            java.lang.String startDownLoadTrackUrl = this.mPlayProxyManager.startDownLoadTrackUrl(2, tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData);
            this.proxyTrackUrls.add(startDownLoadTrackUrl);
            tPAudioTrackInfo.proxyUrl = startDownLoadTrackUrl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnError(int i17, int i18) {
        pushEvent(108, i17, i18, "", new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 3).put("code", i17 + "." + i18).build());
        this.mPlayProxyManager.setProxyPlayState(3);
        this.mPlayProxyManager.pauseDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnInfo(int i17, long j17, long j18, java.lang.Object obj) {
        if (i17 == 200) {
            this.mPlayProxyManager.setProxyPlayState(4);
            pushEvent(114, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, 0).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, java.lang.Long.valueOf(getCurrentPositionMs())).put("url", this.mUrl).build());
            return;
        }
        if (i17 == 201) {
            setProxyStatePlayingOrPause();
            pushEvent(115, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            return;
        }
        if (i17 == 3) {
            long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : -1L;
            this.mLogger.info("switch definition finish defId:" + longValue);
            if (longValue > 0) {
                this.mPlayProxyManager.playerSwitchDefComplete(longValue);
            }
            pushEvent(121, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, longValue + "").build());
            return;
        }
        if (i17 == 106) {
            pushEvent(105, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            return;
        }
        if (i17 == 501) {
            pushEvent(117, 0, 0, null, obj);
            return;
        }
        if (i17 == 107) {
            pushEvent(119, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            return;
        }
        if (i17 == 4) {
            pushEvent(123, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, obj).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put("code", java.lang.String.valueOf(j18)).build());
            return;
        }
        if (i17 == 101) {
            pushEvent(124, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            return;
        }
        if (i17 == 505 && (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaDrmInfo)) {
            com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaDrmInfo tPMediaDrmInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaDrmInfo) obj;
            this.mLogger.info("TPMediaDrmInfo secureDecoder:" + tPMediaDrmInfo.supportSecureDecoder + " secureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName:" + tPMediaDrmInfo.componentName + " drmType:" + tPMediaDrmInfo.drmType);
        }
    }

    private void handlePlayFlowEvent(@com.tencent.thumbplayer.api.TPPlayerDetailInfo.TPPlayerDetailInfoType int i17) {
        com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = MSG_ON_PLAY_FLOW_EVENT;
            obtainMessage.obj = new com.tencent.thumbplayer.api.TPPlayerDetailInfo(i17);
            this.mTransformCallbackHandler.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlayerCallback(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.mTransformCallbackHandler.sendMessage(obtainMessage);
        }
    }

    private void handlePlayerCallbackDelay(int i17, int i18, int i19, java.lang.Object obj, long j17) {
        com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.mTransformCallbackHandler.removeMessages(i17);
            this.mTransformCallbackHandler.sendMessageDelayed(obtainMessage, j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSelectAudioTrack(java.lang.Object obj) {
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData;
        if (obj instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo) {
            if (!isUseProxyEnable()) {
                this.mLogger.error("handleSelectAudioTrack, proxy is not enable");
                return;
            }
            com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo) obj;
            this.mLogger.info("handleSelectAudioTrack, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            if (android.text.TextUtils.isEmpty(tPAudioTrackInfo.audioTrackUrl)) {
                try {
                    this.mPlayProxyManager.stopRemuxer();
                    return;
                } catch (java.lang.Exception e17) {
                    this.mLogger.printException(e17);
                    return;
                }
            }
            java.util.Iterator<com.tencent.thumbplayer.api.TPOptionalParam> it = tPAudioTrackInfo.paramData.iterator();
            while (true) {
                if (!it.hasNext()) {
                    tPDownloadParamData = null;
                    break;
                }
                com.tencent.thumbplayer.api.TPOptionalParam next = it.next();
                if (next.getKey() == 0) {
                    tPDownloadParamData = (com.tencent.thumbplayer.api.proxy.TPDownloadParamData) next.getParamObject().objectValue;
                    break;
                }
            }
            this.mPlayProxyManager.startRemuxer(tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData != null ? tPDownloadParamData.getAudioTrackKeyId() : "");
        }
    }

    private void internalStop() {
        try {
            this.mPlayerAdapter.stop();
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        pushEvent(107, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 1).build());
        this.mPlayProxyManager.setProxyPlayState(5);
        this.mPlayProxyManager.pauseDownload();
        this.mDownloadPlayableDurationMs = -1L;
        this.mCurrentDownloadSizeByte = -1L;
        this.mTotalFileSizeByte = -1L;
    }

    private boolean isUseProxyEnable() {
        this.mLogger.info("isUseProxyEnable, mPlayProxyManager.isEnable()=" + this.mPlayProxyManager.isEnable() + " TPPlayerConfig.isUseP2P()=" + com.tencent.thumbplayer.datatransport.config.TPProxyConfig.isProxyEnable() + " mUseProxy=" + this.mUseProxy);
        return this.mPlayProxyManager.isEnable() && com.tencent.thumbplayer.datatransport.config.TPProxyConfig.isProxyEnable() && this.mUseProxy;
    }

    private void notifyIsUseProxyInfo() {
        com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = new com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams();
        tPSwitchCommonParams.arg1 = isUseProxyEnable() ? 1L : 0L;
        handlePlayerCallback(261, 1009, 0, tPSwitchCommonParams);
    }

    private void onDetailInfo(com.tencent.thumbplayer.api.TPPlayerDetailInfo tPPlayerDetailInfo) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.onDetailInfo(this, tPPlayerDetailInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onInfoToOnDetailInfo(int i17) {
        int i18 = mOnInfoMsgTypeToOnDetailMsgType.get(i17, -1);
        if (i18 == -1) {
            return;
        }
        onDetailInfo(i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayFlowEvent(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (obj instanceof com.tencent.thumbplayer.api.TPPlayerDetailInfo) {
            onDetailInfo((com.tencent.thumbplayer.api.TPPlayerDetailInfo) obj);
        }
    }

    private void publishPrepareEvent(java.lang.String str) {
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareStartEventInfo prepareStartEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareStartEventInfo();
        prepareStartEventInfo.setFlowId(str);
        this.mTPContext.getPlayerEventPublisher().publishEvent(prepareStartEventInfo);
    }

    private void publishSetDataSourceEvent(java.lang.String str, int i17, boolean z17) {
        com.tencent.thumbplayer.event.TPPlayerEventInfo.SetDataSourceEventInfo setDataSourceEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.SetDataSourceEventInfo();
        setDataSourceEventInfo.setUrl(str);
        setDataSourceEventInfo.setUrlProtocol(i17);
        setDataSourceEventInfo.setIsUseProxy(z17);
        this.mTPContext.getPlayerEventPublisher().publishEvent(setDataSourceEventInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushEvent(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        try {
            com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager iTPPluginManager = this.mTPPluginManager;
            if (iTPPluginManager != null) {
                iTPPluginManager.onEvent(i17, i18, i19, str, obj);
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    private void removePlayerCallback(int i17) {
        com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            eventHandler.removeMessages(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reopenPlayer() {
        try {
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter iTPPlayerAdapter = this.mPlayerAdapter;
            if (iTPPlayerAdapter != null) {
                iTPPlayerAdapter.reopenPlayer();
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.error("reopenPlayer has exception:" + e17.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxyStatePlayingOrPause() {
        this.mPlayProxyManager.setProxyPlayState(this.mPlayerAdapter.isPlaying() ? 0 : 5);
    }

    private void setTPPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 206) {
            this.mUseProxy = tPOptionalParam.getParamBoolean().value;
            this.mLogger.info("setPlayerOptionalParam, use p2p proxy, OPTION_ID_BEFORE_BOOLEAN_USE_PROXY=" + this.mUseProxy);
            return;
        }
        if (tPOptionalParam.getKey() == 508) {
            this.mEnableSuggestedBitrateCallback = tPOptionalParam.getParamBoolean().value;
        } else if (tPOptionalParam.getKey() == 100) {
            this.mStartTimeMs = (int) tPOptionalParam.getParamLong().value;
        } else if (tPOptionalParam.getKey() == 500) {
            this.mSkipEndTimeMs = (int) tPOptionalParam.getParamLong().value;
        }
    }

    private com.tencent.thumbplayer.api.TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17, int i18) {
        this.mLogger.info("updateStartAndSkipEndTimeMsForDownloadParam, startTimeMs:" + i17 + ", skipEndTimeMs:" + i18);
        if (tPVideoInfo == null) {
            return new com.tencent.thumbplayer.api.TPVideoInfo.Builder().downloadParam(createDownloadParamData(i17, i18)).build();
        }
        java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
        if (downloadPraramList == null || downloadPraramList.isEmpty()) {
            tPVideoInfo.getBuilder().downloadParam(createDownloadParamData(i17, i18)).build();
            return tPVideoInfo;
        }
        java.util.Iterator<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> it = downloadPraramList.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.api.proxy.TPDownloadParamData next = it.next();
            next.setStarTimeMS(i17);
            next.setEndTimeMS(i18);
        }
        return tPVideoInfo;
    }

    private boolean validCallSwitchDef() {
        int currentState = this.mPlayerAdapter.getCurrentState();
        return currentState == 4 || currentState == 5 || currentState == 6 || currentState == 7;
    }

    private boolean validStateCall(int i17) {
        int currentState = this.mPlayerAdapter.getCurrentState();
        return i17 == 2 ? currentState == 1 : i17 != 17 || currentState == 4 || currentState == 5 || currentState == 6 || currentState == 7;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "addAudioTrackSource, url:" + str + ", name:" + str2);
        addAudioTrackSource(str, str2, null);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "addSubtitleSource, url:" + str + ", mimeType:" + str2 + ", name:" + str3);
        addSubtitleSource(str, str2, str3, null);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "captureVideo, params:" + tPCaptureParams + ", captureCallBack:" + tPCaptureCallBack);
        try {
            this.mPlayerAdapter.captureVideo(tPCaptureParams, tPCaptureCallBack);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        return this.mPlayerAdapter.configBufferDurationAsync(i17, j17, j18, j19);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void deselectTrack(int i17, long j17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "deselectTrack, trackIndex:" + i17 + ", opaque:" + j17);
        try {
            this.mPlayerAdapter.deselectTrack(i17, j17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void enableTPAssetResourceLoader(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, android.os.Looper looper) {
        if (iTPAssetResourceLoaderListener != null) {
            this.mPlayProxyManager.setIsUseResourceLoader(true);
            com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader = this.mAssetResourceLoader;
            if (iTPAssetResourceLoader != null) {
                iTPAssetResourceLoader.release();
                this.mAssetResourceLoader = null;
            }
            com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader tPAssetResourceLoader = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoader(this.mTPContext.getAppContext(), looper);
            this.mAssetResourceLoader = tPAssetResourceLoader;
            tPAssetResourceLoader.setTPAssetResourceLoaderListener(iTPAssetResourceLoaderListener);
            this.mAssetResourceLoader.fillInContentInformation();
            return;
        }
        this.mPlayProxyManager.setIsUseResourceLoader(false);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getAutoExpendBufferCount() {
        return this.mPlayerAdapter.getAutoExpendBufferCount();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxReadDurationPosMs() {
        return this.mPlayerAdapter.getBufferIOMaxReadDurationPosMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxReadFileOffset() {
        return this.mPlayerAdapter.getBufferIOMaxReadFileOffset();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxWriteDurationPosMs() {
        return this.mPlayerAdapter.getBufferIOMaxWriteDurationPosMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferIOMaxWriteFileOffset() {
        return this.mPlayerAdapter.getBufferIOMaxWriteFileOffset();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public int getBufferPercent() {
        if (this.mPlayerAdapter.getDurationMs() == 0) {
            return 0;
        }
        return (int) ((((float) (this.mPlayerAdapter.getPlayableDurationMs() - this.mPlayerAdapter.getCurrentPositionMs())) * 100.0f) / ((float) this.mPlayerAdapter.getDurationMs()));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferedDurationMs() {
        return this.mPlayerAdapter.getBufferedDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getBufferedSize() {
        return this.mPlayerAdapter.getBufferedSize();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getCurrentPositionMs() {
        return this.mPlayerAdapter.getCurrentPositionMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getCurrentState() {
        return this.mPlayerAdapter.getCurrentState();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getDurationMs() {
        return this.mPlayerAdapter.getDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.reportv2.ITPExtendReportController getExtendReportController() {
        return this.mReportController;
    }

    public android.os.Looper getLooper() {
        return this.mThreadLooper;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPlayableDurationMs() {
        if (!isUseProxyEnable()) {
            return this.mPlayerAdapter.getPlayableDurationMs();
        }
        long j17 = this.mCurrentDownloadSizeByte;
        if (j17 > 0) {
            long j18 = this.mTotalFileSizeByte;
            if (j18 > 0) {
                return (long) (((j17 * 1.0d) / j18) * this.mPlayerAdapter.getDurationMs());
            }
        }
        return this.mDownloadPlayableDurationMs;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public long getPlayerBufferedDurationMs() {
        return this.mPlayerAdapter.getPlayableDurationMs();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.proxy.ITPPlayerProxy getPlayerProxy() {
        return this.mPlayProxyManager;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getPlayerType() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getPlayerType");
        return this.mPlayerAdapter.getPlayerType();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getProgramInfo");
        return this.mPlayerAdapter.getProgramInfo();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public long getPropertyLong(int i17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getPropertyLong, paramId:" + i17);
        try {
            return this.mPlayerAdapter.getPropertyLong(i17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
            return 0L;
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public java.lang.String getPropertyString(int i17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getPropertyString, paramId:" + i17);
        try {
            return this.mPlayerAdapter.getPropertyString(i17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public com.tencent.thumbplayer.api.report.ITPBusinessReportManager getReportManager() {
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager tPReportManager = this.mReportManager;
        return tPReportManager == null ? this.mReportNonImplPlugin : tPReportManager;
    }

    public java.lang.String getTag() {
        return this.mLogger.getTag();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getTrackInfo");
        return this.mPlayerAdapter.getTrackInfo();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getVideoHeight() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getVideoHeight");
        return this.mPlayerAdapter.getVideoHeight();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public int getVideoWidth() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "getVideoWidth");
        return this.mPlayerAdapter.getVideoWidth();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void pause() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "pause");
        try {
            this.mPlayerAdapter.pause();
            pushEvent(106, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            this.mPlayProxyManager.setProxyPlayState(5);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void pauseDownload() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "pauseDownload");
        try {
            this.mPlayerAdapter.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(502, 0L));
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        this.mPlayProxyManager.pauseDownload();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void prepareAsync() {
        java.lang.String str = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform();
        handlePlayFlowEvent(1003);
        this.mLogger.info(LOG_API_CALL_PREFIX + "prepareAsync");
        com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager tPReportManager = this.mReportManager;
        boolean doReportSampling = tPReportManager != null ? tPReportManager.doReportSampling() : true;
        com.tencent.thumbplayer.tplayer.reportv2.TPReportController tPReportController = this.mReportController;
        if (tPReportController != null) {
            tPReportController.setReportToBeaconNeeded(doReportSampling);
        }
        try {
            this.mPlayProxyManager.resumeDownload();
            this.mPlayerAdapter.prepareAsync();
        } catch (java.lang.RuntimeException e17) {
            this.mLogger.printException(e17);
        }
        publishPrepareEvent(str);
        try {
            pushEvent(102, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put("url", this.mUrl).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_P2P, java.lang.Boolean.valueOf(isUseProxyEnable())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_FLOW_ID, str).build());
            notifyIsUseProxyInfo();
        } catch (java.lang.Exception e18) {
            this.mLogger.printException(e18);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void release() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "release");
        this.mPlayerAdapter.release();
        pushEvent(112, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 1).build());
        this.mPlayerListeners.clear();
        this.mPlayProxyManager.release();
        this.proxyTrackUrls.clear();
        com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader = this.mAssetResourceLoader;
        if (iTPAssetResourceLoader != null) {
            iTPAssetResourceLoader.release();
            this.mAssetResourceLoader = null;
        }
        this.mDownloadPlayableDurationMs = -1L;
        this.mCurrentDownloadSizeByte = -1L;
        this.mTotalFileSizeByte = -1L;
        com.tencent.thumbplayer.utils.TPThreadPool.getInstance().recycle(this.mHandlerThread, this.mTransformCallbackHandler);
        this.mHandlerThread = null;
        this.mTransformCallbackHandler = null;
        this.mTPPluginManager.release();
        com.tencent.thumbplayer.tplayer.reportv2.TPReportController tPReportController = this.mReportController;
        if (tPReportController != null) {
            tPReportController.release();
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void reset() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "reset");
        if (this.mUsingDefaultLogContext) {
            this.mLogger.updateTaskId(java.lang.String.valueOf(this.mPlayTaskId.incrementAndGet()));
            this.mPlayerAdapter.updateLoggerContext(this.mLogger.getTPLoggerContext());
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.updateTag(this.mLogger.getTPLoggerContext().getTag());
            }
        }
        try {
            this.mPlayerAdapter.reset();
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        pushEvent(113, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, 1).build());
        this.mPlayProxyManager.stopDownload();
        this.mProxyStatus = -1;
        this.proxyTrackUrls.clear();
        com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader = this.mAssetResourceLoader;
        if (iTPAssetResourceLoader != null) {
            iTPAssetResourceLoader.reset();
        }
        com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler eventHandler = this.mTransformCallbackHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
        this.mDownloadPlayableDurationMs = -1L;
        this.mCurrentDownloadSizeByte = -1L;
        this.mTotalFileSizeByte = -1L;
        this.mUseProxy = true;
        this.mEnableSuggestedBitrateCallback = false;
        this.mStartTimeMs = 0;
        this.mSkipEndTimeMs = 0;
        this.mUniqueIdToOpaqueMap.clear();
        this.mUniqueIdCounter = 0L;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void resumeDownload() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "resumeDownload");
        this.mPlayProxyManager.resumeDownload();
        try {
            this.mPlayerAdapter.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(502, 1L));
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void seekTo(int i17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "seekTo, positionMs:" + i17);
        try {
            this.mPlayerAdapter.seekTo(i17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        this.mPlayProxyManager.setProxyPlayState(1);
        pushEvent(109, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, 0).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, java.lang.Long.valueOf(getCurrentPositionMs())).build());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void selectProgram(int i17, long j17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "selectProgram, programIndex:" + i17 + ", opaque:" + j17);
        try {
            this.mPlayerAdapter.selectProgram(i17, j17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void selectTrack(int i17, long j17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "selectTrack, trackIndex:" + i17 + ", opaque:" + j17);
        try {
            long assignUniqueIdForOpaque = assignUniqueIdForOpaque(j17, "selectTrack");
            com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = this.mPlayerAdapter.getTrackInfo();
            if (trackInfo != null && trackInfo.length > i17) {
                pushEvent(122, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, java.lang.Long.valueOf(assignUniqueIdForOpaque)).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SELECT_TRACK_TYPE, java.lang.Integer.valueOf(trackInfo[i17].getTrackType())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, trackInfo[i17].getName()).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            }
            this.mPlayerAdapter.selectTrack(i17, assignUniqueIdForOpaque);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setAudioGainRatio(float f17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setAudioGainRatio, gainRatio:" + f17);
        try {
            this.mPlayerAdapter.setAudioGainRatio(f17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setAudioNormalizeVolumeParams(java.lang.String str) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setAudioNormalizeVolumeParams, audioNormalizeVolumeParams:" + str);
        try {
            this.mPlayerAdapter.setAudioNormalizeVolumeParams(str);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setDataSource(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.mPlayerAdapter.getCurrentState() == 1) {
                publishSetDataSourceEvent(str, getUrlProtocolType(str), isUseProxyEnable());
                handlePlayFlowEvent(1000);
                this.mLogger.info(LOG_API_CALL_PREFIX + "setDataSource, url:" + str);
                this.mUrl = str;
                com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource = new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
                this.mLogger.info("handleSetDataSource originalUrl=" + str);
                if (isUseProxyEnable()) {
                    tPUrlDataSource = this.mPlayProxyManager.startDownloadPlay(str, null);
                    this.mLogger.info("handleSetDataSource selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
                    this.mLogger.info("handleSetDataSource systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
                }
                this.mPlayerAdapter.setDataSource(tPUrlDataSource);
                handlePlayFlowEvent(1001);
                return;
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is invalid");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void setLoopback(boolean z17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setLoopback, isLoopback:" + z17);
        try {
            this.mPlayerAdapter.setLoopback(z17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnAudioFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnAudioPcmOutputListener(iOnAudioFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnAudioProcessFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnAudioProcessOutputListener(iOnAudioProcessFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnCompletionListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnCompletionListener(iOnCompletionListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnDemuxerListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnDemuxerListener(iOnDemuxerListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnDetailInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnDetailInfoListener(iOnDetailInfoListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnErrorListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnErrorListener(iOnErrorListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnInfoListener(iOnInfoListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnPlayerStateChangeListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnPlayerStateChangeListener(iOnStateChangeListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnPreparedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnPreparedListener(iOnPreparedListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSeekCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnSeekCompleteListener(iOnSeekCompleteListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnStopAsyncCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnStopAsyncCompleteListener(iOnStopAsyncCompleteListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSubtitleDataListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnSubtitleDataListener(iOnSubtitleDataListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoProcessFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnVideoProcessOutputListener(iOnVideoProcessFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
        if (tPPlayerListeners != null) {
            tPPlayerListeners.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setOutputMute(boolean z17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setOutputMute, isOutputMute:" + z17);
        try {
            this.mPlayerAdapter.setOutputMute(z17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setPlaySharpenSwitch() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setPlaySharpenSwitch");
        this.mPlayerAdapter.setPlaySharpenSwitch();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(removeRepeat = true)
    public void setPlaySpeedRatio(float f17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setPlaySpeedRatio, speedRatio:" + f17);
        try {
            this.mPlayProxyManager.setPlaySpeedRatio(f17);
            this.mPlayerAdapter.setPlaySpeedRatio(f17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        pushEvent(116, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Float.valueOf(f17)).build());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getParamType() == 7 && !com.tencent.thumbplayer.utils.TPOptionalParamObjectChecker.checkObjectType(tPOptionalParam.getKey(), tPOptionalParam.getParamObject().objectValue)) {
            this.mLogger.warn("set object param failed, optional id:" + tPOptionalParam.getKey());
            return;
        }
        setTPPlayerOptionalParam(tPOptionalParam);
        this.mPlayProxyManager.setPlayerOptionalParam(tPOptionalParam);
        try {
            this.mPlayerAdapter.setPlayerOptionalParam(tPOptionalParam);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setRichMediaSynchronizer(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        this.mPlayerAdapter.setRichMediaSynchronizer(iTPRichMediaSynchronizer);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setSurface(android.view.Surface surface) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setSurface, surface:" + surface);
        try {
            this.mPlayerAdapter.setSurface(surface, 0);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setSurfaceHolder, SurfaceHolder:" + surfaceHolder);
        try {
            this.mPlayerAdapter.setSurfaceHolder(surfaceHolder);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setTPSurface(com.tencent.thumbplayer.api.TPSurface tPSurface) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setTPSurface, tpSurface:" + tPSurface);
        try {
            if (tPSurface instanceof com.tencent.thumbplayer.api.TPSurface) {
                this.mPlayerAdapter.setSurface(tPSurface, 0);
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo != null) {
            try {
                updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, this.mStartTimeMs, this.mSkipEndTimeMs);
                this.mPlayProxyManager.setVideoInfo(tPVideoInfo);
                this.mPlayerAdapter.setVideoInfo(tPVideoInfo);
            } catch (java.lang.Exception e17) {
                this.mLogger.printException(e17);
            }
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void start() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "start");
        try {
            this.mPlayerAdapter.start();
            pushEvent(104, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
            this.mPlayProxyManager.setProxyPlayState(0);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(needWait = true)
    public void stop() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "stop");
        internalStop();
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void stopAsync() {
        this.mLogger.info(LOG_API_CALL_PREFIX + "stopAsync");
        internalStop();
        handlePlayerCallback(280, 0, 0, null);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j17);
        switchDefinition(str, j17, tPVideoInfo, 0);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void switchHdrModeWithSurface(android.view.Surface surface, int i17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "switchHdrModeWithSurface, surface:" + surface);
        try {
            this.mPlayerAdapter.switchHdrModeWithSurface(surface, 0, i17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        if (tPLoggerContext != null) {
            this.mUsingDefaultLogContext = false;
            this.mLogger.updateContext(new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG));
            this.mPlayerAdapter.updateLoggerContext(this.mLogger.getTPLoggerContext());
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = this.mPlayerListeners;
            if (tPPlayerListeners != null) {
                tPPlayerListeners.updateTag(this.mLogger.getTPLoggerContext().getTag());
            }
        }
    }

    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        private com.tencent.thumbplayer.tplayer.TPPlayer mPlayer;

        public EventHandler(com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer) {
            this.mPlayer = tPPlayer;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.debug("mTransformHandler msg : " + message.what);
            com.tencent.thumbplayer.tplayer.TPPlayerListeners tPPlayerListeners = com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerListeners;
            if (tPPlayerListeners == null) {
                return;
            }
            int i17 = message.what;
            if (i17 == 257) {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.info("onPrepared");
                com.tencent.thumbplayer.tplayer.TPPlayer.this.onDetailInfo(1004);
                tPPlayerListeners.onPrepared(this.mPlayer);
                return;
            }
            if (i17 == com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PLAY_FLOW_EVENT) {
                com.tencent.thumbplayer.tplayer.TPPlayer.this.onPlayFlowEvent(message);
                return;
            }
            switch (i17) {
                case 260:
                    tPPlayerListeners.onCompletion(this.mPlayer);
                    return;
                case 261:
                    com.tencent.thumbplayer.tplayer.TPPlayer.this.onInfoToOnDetailInfo(message.arg1);
                    com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams = (com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams) message.obj;
                    if (tPSwitchCommonParams != null) {
                        tPPlayerListeners.onInfo(this.mPlayer, message.arg1, tPSwitchCommonParams.arg1, tPSwitchCommonParams.arg2, tPSwitchCommonParams.extraObject);
                        return;
                    }
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_ERROR /* 262 */:
                    com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams2 = (com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams) message.obj;
                    if (tPSwitchCommonParams2 != null) {
                        tPPlayerListeners.onError(this.mPlayer, message.arg1, message.arg2, tPSwitchCommonParams2.arg1, tPSwitchCommonParams2.arg2);
                        return;
                    }
                    return;
                case 263:
                    tPPlayerListeners.onSeekComplete(this.mPlayer);
                    return;
                case 264:
                    com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams tPSwitchCommonParams3 = (com.tencent.thumbplayer.tplayer.TPThreadSwitchCommons.TPSwitchCommonParams) message.obj;
                    if (tPSwitchCommonParams3 != null) {
                        tPPlayerListeners.onVideoSizeChanged(this.mPlayer, tPSwitchCommonParams3.arg1, tPSwitchCommonParams3.arg2);
                        return;
                    }
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_SUBTITLE_DATA /* 265 */:
                    tPPlayerListeners.onSubtitleData(this.mPlayer, (com.tencent.thumbplayer.api.TPSubtitleData) message.obj);
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_VIDEOFRAMEOUT /* 266 */:
                    tPPlayerListeners.onVideoFrameOut(this.mPlayer, (com.tencent.thumbplayer.api.TPVideoFrameBuffer) message.obj);
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_AUDIOPCMOUT /* 267 */:
                    tPPlayerListeners.onAudioFrameOut(this.mPlayer, (com.tencent.thumbplayer.api.TPAudioFrameBuffer) message.obj);
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PROXY_PLAYERROR /* 268 */:
                    tPPlayerListeners.onError(this.mPlayer, message.arg1, message.arg2, 0L, 0L);
                    return;
                case 269:
                    tPPlayerListeners.onInfo(this.mPlayer, 1002, message.arg1, message.arg2, message.obj);
                    return;
                case 270:
                    tPPlayerListeners.onInfo(this.mPlayer, 1003, message.arg1, message.arg2, message.obj);
                    return;
                case 271:
                    tPPlayerListeners.onInfo(this.mPlayer, 1001, message.arg1, message.arg2, message.obj);
                    return;
                case 272:
                    tPPlayerListeners.onInfo(this.mPlayer, 1004, message.arg1, message.arg2, message.obj);
                    return;
                case 273:
                    tPPlayerListeners.onInfo(this.mPlayer, 1005, message.arg1, message.arg2, message.obj);
                    return;
                case 274:
                    tPPlayerListeners.onInfo(this.mPlayer, 1006, message.arg1, message.arg2, message.obj);
                    return;
                case 275:
                    tPPlayerListeners.onInfo(this.mPlayer, 1007, message.arg1, message.arg2, message.obj);
                    return;
                case 276:
                    tPPlayerListeners.onInfo(this.mPlayer, 1008, message.arg1, message.arg2, message.obj);
                    return;
                case 277:
                    tPPlayerListeners.onStateChange(message.arg1, message.arg2);
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PROXY_SWITCH_DEFINITION /* 278 */:
                    if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter != null) {
                        try {
                            com.tencent.thumbplayer.tplayer.TPPlayer.this.mPlayerAdapter.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(8000, message.arg1));
                        } catch (java.lang.IllegalStateException e17) {
                            com.tencent.thumbplayer.tplayer.TPPlayer.this.mLogger.printException(e17);
                        }
                    }
                    if (com.tencent.thumbplayer.tplayer.TPPlayer.this.mEnableSuggestedBitrateCallback) {
                        tPPlayerListeners.onInfo(this.mPlayer, 1010, message.arg1, message.arg2, message.obj);
                        return;
                    }
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_SUBTITLE_FRAME_BUFFER /* 279 */:
                    tPPlayerListeners.onSubtitleFrameOut(this.mPlayer, (com.tencent.thumbplayer.api.TPSubtitleFrameBuffer) message.obj);
                    return;
                case 280:
                    tPPlayerListeners.onStopAsyncComplete(this.mPlayer);
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_PROXY_ABTEST_INFO /* 281 */:
                    tPPlayerListeners.onInfo(this.mPlayer, 1015, message.arg1, message.arg2, message.obj);
                    return;
                case com.tencent.thumbplayer.tplayer.TPPlayer.MSG_ON_RPOXY_M3U8_REFRESH /* 282 */:
                    com.tencent.thumbplayer.tplayer.TPPlayer.this.reopenPlayer();
                    return;
                case 283:
                    tPPlayerListeners.onInfo(this.mPlayer, 1016, message.arg1, message.arg2, message.obj);
                    return;
                case 284:
                    tPPlayerListeners.onInfo(this.mPlayer, 1017, message.arg1, message.arg2, message.obj);
                    return;
                default:
                    return;
            }
        }

        public EventHandler(com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer, android.os.Looper looper) {
            super(looper);
            this.mPlayer = tPPlayer;
        }
    }

    public TPPlayer(android.content.Context context, android.os.Looper looper) {
        this(context, looper, null);
    }

    public TPPlayer(android.content.Context context, android.os.Looper looper, android.os.Looper looper2) {
        this(context, looper, looper2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDetailInfo(@com.tencent.thumbplayer.api.TPPlayerDetailInfo.TPPlayerDetailInfoType int i17) {
        onDetailInfo(new com.tencent.thumbplayer.api.TPPlayerDetailInfo(i17));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "addAudioTrackSource, url:" + str + ", name:" + str2 + ", downloadParamData:" + tPDownloadParamData);
        if (!android.text.TextUtils.isEmpty(str2) && com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(str)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam = new com.tencent.thumbplayer.api.TPOptionalParam();
                if (tPDownloadParamData != null) {
                    tPOptionalParam.buildObject(0, tPDownloadParamData);
                }
                arrayList.add(tPOptionalParam);
                this.mPlayerAdapter.addAudioTrackSource(str, (tPDownloadParamData == null || tPDownloadParamData.getUrlCdnidHttpHeaderList() == null || tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty()) ? null : tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0), str2, arrayList);
                return;
            } catch (java.lang.Exception e17) {
                this.mLogger.printException(e17);
                return;
            }
        }
        this.mLogger.error("handleAddAudioSource, illegal argument.");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true)
    public void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
        java.lang.String str4;
        this.mLogger.info(LOG_API_CALL_PREFIX + "addSubtitleSource, url:" + str + ", name:" + str3 + ", downloadParamData:" + tPDownloadParamData);
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (isUseProxyEnable() && com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(str)) {
                str4 = this.mPlayProxyManager.startDownLoadTrackUrl(3, str, tPDownloadParamData);
                this.proxyTrackUrls.add(str4);
            } else {
                str4 = str;
            }
            this.mPlayerAdapter.addSubtitleSource(str4, (tPDownloadParamData == null || tPDownloadParamData.getUrlCdnidHttpHeaderList() == null || tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty()) ? null : tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0), str2, str3);
            pushEvent(118, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(currentTimeMillis)).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put("url", str).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str3).build());
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j17 + ", videoInfo:" + tPVideoInfo + ", httpHeader:" + map);
        try {
            switchDefinition(str, j17, tPVideoInfo, map, 0);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    public TPPlayer(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext2;
        this.mUrl = null;
        this.mUseProxy = true;
        this.mEnableSuggestedBitrateCallback = false;
        this.mProxyStatus = -1;
        this.mPlayTaskId = new java.util.concurrent.atomic.AtomicInteger(1000);
        this.mUsingDefaultLogContext = false;
        this.mReportController = null;
        this.mUniqueIdToOpaqueMap = new java.util.HashMap();
        this.mUniqueIdCounter = 0L;
        if (tPLoggerContext != null) {
            tPLoggerContext2 = new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG);
        } else {
            com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext3 = new com.tencent.thumbplayer.log.TPLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext.PREFIX_THUMB_PLAYER, java.lang.String.valueOf(sLifeCycleId.incrementAndGet()), java.lang.String.valueOf(this.mPlayTaskId.incrementAndGet()), TAG);
            this.mUsingDefaultLogContext = true;
            tPLoggerContext2 = tPLoggerContext3;
        }
        com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = new com.tencent.thumbplayer.log.TPBaseLogger(tPLoggerContext2);
        this.mLogger = tPBaseLogger;
        tPBaseLogger.info("create TPPlayer");
        this.mTPContext = new com.tencent.thumbplayer.tplayer.TPContext(context.getApplicationContext());
        this.mTPPluginManager = new com.tencent.thumbplayer.tplayer.plugins.TPPluginManager();
        pushEvent(100, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
        com.tencent.thumbplayer.tplayer.TPPlayer.InnerPlayerListener innerPlayerListener = new com.tencent.thumbplayer.tplayer.TPPlayer.InnerPlayerListener();
        this.mPlayerListeners = new com.tencent.thumbplayer.tplayer.TPPlayerListeners(this.mLogger.getTag());
        com.tencent.thumbplayer.adapter.ITPPlayerAdapter createTPPlayerAdapter = com.tencent.thumbplayer.adapter.TPPlayerAdapterFactory.createTPPlayerAdapter(tPLoggerContext2, this.mTPContext);
        this.mPlayerAdapter = createTPPlayerAdapter;
        createTPPlayerAdapter.setOnPreparedListener(innerPlayerListener);
        createTPPlayerAdapter.setOnCompletionListener(innerPlayerListener);
        createTPPlayerAdapter.setOnInfoListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoSizeChangedListener(innerPlayerListener);
        createTPPlayerAdapter.setOnErrorListener(innerPlayerListener);
        createTPPlayerAdapter.setOnSeekCompleteListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoSizeChangedListener(innerPlayerListener);
        createTPPlayerAdapter.setOnSubtitleDataListener(innerPlayerListener);
        createTPPlayerAdapter.setOnSubtitleFrameOutListener(innerPlayerListener);
        createTPPlayerAdapter.setOnAudioPcmOutputListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoFrameOutListener(innerPlayerListener);
        createTPPlayerAdapter.setOnVideoProcessOutputListener(innerPlayerListener);
        createTPPlayerAdapter.setOnAudioProcessOutputListener(innerPlayerListener);
        createTPPlayerAdapter.setOnPlayerStateChangeListener(innerPlayerListener);
        createTPPlayerAdapter.setOnDetailInfoListener(innerPlayerListener);
        createTPPlayerAdapter.setOnDemuxerListener(innerPlayerListener);
        if (looper == null || looper == android.os.Looper.getMainLooper()) {
            android.os.HandlerThread obtainHandleThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainHandleThread("TP-workthread");
            this.mHandlerThread = obtainHandleThread;
            looper = obtainHandleThread.getLooper();
        }
        this.mThreadLooper = looper;
        if (looper2 == null) {
            if (android.os.Looper.myLooper() == null) {
                this.mTransformCallbackHandler = new com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler(this, this.mThreadLooper);
            } else {
                this.mTransformCallbackHandler = new com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler(this);
            }
        } else {
            this.mTransformCallbackHandler = new com.tencent.thumbplayer.tplayer.TPPlayer.EventHandler(this, looper2);
        }
        pushEvent(101, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_END_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).build());
        com.tencent.thumbplayer.datatransport.ITPPlayManager createDataTransportManager = com.tencent.thumbplayer.datatransport.TPDataTransportManagerFactory.createDataTransportManager(this.mThreadLooper, this.mTPContext);
        this.mPlayProxyManager = createDataTransportManager;
        createDataTransportManager.setPlayListener(innerPlayerListener);
        this.mTPPluginManager.addPlugin(new com.tencent.thumbplayer.tplayer.plugins.report.TPLogPlugin());
        this.proxyTrackUrls = new java.util.ArrayList<>();
        if (com.tencent.thumbplayer.config.TPPlayerConfig.getNewReportEnable()) {
            com.tencent.thumbplayer.tplayer.reportv2.TPReportController tPReportController = new com.tencent.thumbplayer.tplayer.reportv2.TPReportController(this.mTPContext.getAppContext());
            this.mReportController = tPReportController;
            tPReportController.setPlayerInfoGetter(new com.tencent.thumbplayer.common.TPPlayerInfoGetterImpl(createTPPlayerAdapter));
            this.mReportController.init();
            this.mTPContext.getPlayerEventPublisher().addEventReceiver(this.mReportController);
        }
    }

    private void pushEvent(int i17) {
        pushEvent(i17, 0, 0, "", null);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void setLoopback(boolean z17, long j17, long j18) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setLoopback, isLoopback:" + z17 + ", loopStartPositionMs:" + j17 + ", loopEndPositionMs:" + j18);
        try {
            this.mPlayerAdapter.setLoopback(z17, j17, j18);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "setSurface, surface:" + surface + ", type:" + i17);
        try {
            this.mPlayerAdapter.setSurface(surface, i17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j17 + ", videoInfo:" + tPVideoInfo);
        try {
            switchDefinition(iTPMediaAsset, j17, tPVideoInfo, 0);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    public void enableTPAssetResourceLoader(com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "enableTPAssetResourceLoader, assetResourceLoader:" + iTPAssetResourceLoader);
        if (iTPAssetResourceLoader != null) {
            this.mPlayProxyManager.setIsUseResourceLoader(true);
            com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader2 = this.mAssetResourceLoader;
            if (iTPAssetResourceLoader2 != null) {
                iTPAssetResourceLoader2.release();
                this.mAssetResourceLoader = null;
            }
            this.mAssetResourceLoader = iTPAssetResourceLoader;
            return;
        }
        this.mPlayProxyManager.setIsUseResourceLoader(false);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17) {
        if (!validCallSwitchDef()) {
            this.mLogger.error("error : switchDefinition , state invalid");
        }
        this.mLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j17 + ", mode:" + i17);
        com.tencent.thumbplayer.api.TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam = updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, (int) getCurrentPositionMs(), this.mSkipEndTimeMs);
        com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource = new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
        if (isUseProxyEnable()) {
            tPUrlDataSource = this.mPlayProxyManager.startSwitchDefTask(j17, str, updateStartAndSkipEndTimeMsForDownloadParam, null);
            this.mLogger.info("switchDefinition selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
            this.mLogger.info("switchDefinition systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
        }
        this.mLogger.info("switchDefinition, proxyUrl:" + str + ", defID:" + j17);
        try {
            this.mPlayerAdapter.updateVideoInfo(updateStartAndSkipEndTimeMsForDownloadParam);
            this.mPlayerAdapter.switchDefinition(tPUrlDataSource, i17, j17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        pushEvent(120, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j17 + "").build());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void seekTo(int i17, int i18) {
        this.mLogger.info(LOG_API_CALL_PREFIX + "seekTo, positionMs:" + i17 + ", mode:" + i18);
        try {
            if (i18 > 0) {
                this.mPlayerAdapter.seekTo(i17, i18);
            } else {
                this.mPlayerAdapter.seekTo(i17);
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        this.mPlayProxyManager.setProxyPlayState(1);
        pushEvent(109, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_START_TIME, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, 0).put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, java.lang.Long.valueOf(getCurrentPositionMs())).build());
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.mPlayerAdapter.getCurrentState() == 1) {
                publishSetDataSourceEvent(str, getUrlProtocolType(str), isUseProxyEnable());
                handlePlayFlowEvent(1000);
                this.mLogger.info(LOG_API_CALL_PREFIX + "setDataSource, url:" + str + ", httpHeader:" + map);
                this.mUrl = str;
                com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource = new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
                com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = this.mLogger;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSetDataSource originalUrl=");
                sb6.append(str);
                tPBaseLogger.info(sb6.toString());
                if (isUseProxyEnable()) {
                    tPUrlDataSource = this.mPlayProxyManager.startDownloadPlay(str, map);
                    this.mLogger.info("handleSetDataSource selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
                    this.mLogger.info("handleSetDataSource systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
                }
                this.mPlayerAdapter.setDataSource(tPUrlDataSource, map);
                handlePlayFlowEvent(1001);
                return;
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is invalid");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map<java.lang.String, java.lang.String> map, int i17) {
        if (validCallSwitchDef()) {
            this.mLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, defUrl:" + str + ", defID:" + j17 + ", httpHeader:" + map + ", mode:" + i17);
            com.tencent.thumbplayer.api.TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam = updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, (int) getCurrentPositionMs(), this.mSkipEndTimeMs);
            com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource = new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
            if (isUseProxyEnable()) {
                tPUrlDataSource = this.mPlayProxyManager.startSwitchDefTask(j17, str, updateStartAndSkipEndTimeMsForDownloadParam, map);
                this.mLogger.info("switchDefinition selfPlayerUrl=" + tPUrlDataSource.getSelfPlayerUrl());
                this.mLogger.info("switchDefinition systemPlayerUrl=" + tPUrlDataSource.getSystemPlayerUrl());
            }
            com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource2 = tPUrlDataSource;
            this.mLogger.info("switchDefinition, proxyUrl:" + str + ", defID:" + j17 + ", httpHeader:" + map);
            try {
                this.mPlayerAdapter.updateVideoInfo(updateStartAndSkipEndTimeMsForDownloadParam);
                this.mPlayerAdapter.switchDefinition(tPUrlDataSource2, map, i17, j17);
            } catch (java.lang.Exception e17) {
                this.mLogger.printException(e17);
            }
            pushEvent(120, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j17 + "").build());
            return;
        }
        throw new java.lang.IllegalStateException("error : switchDefinition , state invalid");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            if (this.mPlayerAdapter.getCurrentState() == 1) {
                publishSetDataSourceEvent("", 4, false);
                this.mLogger.info(LOG_API_CALL_PREFIX + "setDataSource, ParcelFileDescriptor");
                try {
                    this.mPlayerAdapter.setDataSource(parcelFileDescriptor);
                    return;
                } catch (java.io.IOException e17) {
                    this.mLogger.printException(e17);
                    return;
                } catch (java.lang.SecurityException e18) {
                    this.mLogger.printException(e18);
                    return;
                }
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is null");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            if (this.mPlayerAdapter.getCurrentState() == 1) {
                publishSetDataSourceEvent("", 4, false);
                this.mLogger.info(LOG_API_CALL_PREFIX + "setDataSource, AssetFileDescriptor");
                try {
                    this.mPlayerAdapter.setDataSource(assetFileDescriptor);
                    return;
                } catch (java.io.IOException e17) {
                    this.mLogger.printException(e17);
                    return;
                } catch (java.lang.SecurityException e18) {
                    this.mLogger.printException(e18);
                    return;
                }
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.mPlayerAdapter.getCurrentState());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is null");
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch(checkObj = true, removeRepeat = true)
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17) {
        if (validCallSwitchDef()) {
            this.mLogger.info(LOG_API_CALL_PREFIX + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j17 + ", videoInfo:" + tPVideoInfo + ", mode:" + i17);
            com.tencent.thumbplayer.api.TPVideoInfo updateStartAndSkipEndTimeMsForDownloadParam = updateStartAndSkipEndTimeMsForDownloadParam(tPVideoInfo, (int) getCurrentPositionMs(), this.mSkipEndTimeMs);
            if (isUseProxyEnable()) {
                iTPMediaAsset = this.mPlayProxyManager.startSwitchDefTaskByAsset(iTPMediaAsset, j17, updateStartAndSkipEndTimeMsForDownloadParam);
            }
            if (iTPMediaAsset != null) {
                this.mLogger.info("handleSwitchDef, proxyMediaAsset:" + iTPMediaAsset + ", defID:" + j17);
                try {
                    this.mPlayerAdapter.updateVideoInfo(updateStartAndSkipEndTimeMsForDownloadParam);
                    this.mPlayerAdapter.switchDefinition(iTPMediaAsset, 0, j17);
                } catch (java.lang.Exception e17) {
                    this.mLogger.printException(e17);
                }
                pushEvent(120, 0, 0, null, new com.tencent.thumbplayer.utils.TPHashMapBuilder().put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, j17 + "").build());
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("error : switchDefinition , state invalid");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0.getDrmAllProperties().isEmpty() == false) goto L14;
     */
    @Override // com.tencent.thumbplayer.api.ITPPlayer
    @com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset r4) {
        /*
            r3 = this;
            if (r4 == 0) goto Lc1
            boolean r0 = r4 instanceof com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
            if (r0 == 0) goto L2c
            java.lang.String r0 = r4.getUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L24
            r0 = r4
            com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset r0 = (com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset) r0
            java.util.Map r1 = r0.getDrmAllProperties()
            if (r1 == 0) goto L24
            java.util.Map r0 = r0.getDrmAllProperties()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            goto L2c
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error : setDataSource , drm asset url is null or drm property is null"
            r4.<init>(r0)
            throw r4
        L2c:
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r0 = r3.mPlayerAdapter
            int r0 = r0.getCurrentState()
            r1 = 1
            if (r0 != r1) goto La7
            java.lang.String r0 = r4.getUrl()
            java.lang.String r1 = r4.getUrl()
            int r1 = r3.getUrlProtocolType(r1)
            boolean r2 = r3.isUseProxyEnable()
            r3.publishSetDataSourceEvent(r0, r1, r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.handlePlayFlowEvent(r0)
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.tencent.thumbplayer.tplayer.TPPlayer.LOG_API_CALL_PREFIX
            r1.append(r2)
            java.lang.String r2 = "setDataSource, ITPMediaAsset"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.info(r1)
            java.lang.String r0 = r4.getUrl()
            r3.mUrl = r0
            boolean r0 = r3.isUseProxyEnable()
            if (r0 == 0) goto L77
            com.tencent.thumbplayer.datatransport.ITPPlayManager r0 = r3.mPlayProxyManager
            com.tencent.thumbplayer.api.composition.ITPMediaAsset r4 = r0.startDownloadPlayByAsset(r4)
        L77:
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleSetDataSource mediaAsset="
            r1.<init>(r2)
            java.lang.String r2 = r4.getUrl()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.info(r1)
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r0 = r3.mPlayerAdapter     // Catch: java.lang.SecurityException -> L94 java.io.IOException -> L9b
            r0.setDataSource(r4)     // Catch: java.lang.SecurityException -> L94 java.io.IOException -> L9b
            goto La1
        L94:
            r4 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            r0.printException(r4)
            goto La1
        L9b:
            r4 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.mLogger
            r0.printException(r4)
        La1:
            r4 = 1001(0x3e9, float:1.403E-42)
            r3.handlePlayFlowEvent(r4)
            return
        La7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "error : setDataSource , state invalid. current state:"
            r0.<init>(r1)
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r1 = r3.mPlayerAdapter
            int r1 = r1.getCurrentState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        Lc1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error : setDataSource , param is null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.TPPlayer.setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset):void");
    }
}
