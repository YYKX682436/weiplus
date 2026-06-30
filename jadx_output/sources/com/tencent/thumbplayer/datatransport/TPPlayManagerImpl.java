package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPPlayManagerImpl implements com.tencent.thumbplayer.datatransport.ITPPlayManager, com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener, com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener {
    private static final int API_CALL_TIME_OUT_MS = 500;
    private static final int MSG_DOWN_LOAD_CDN_INFO_UPDATE = 4100;
    private static final int MSG_DOWN_LOAD_CDN_URL_EXPERIED = 4103;
    private static final int MSG_DOWN_LOAD_CDN_URL_UPDATE = 4099;
    private static final int MSG_DOWN_LOAD_ERROR = 4098;
    private static final int MSG_DOWN_LOAD_FINISH = 4097;
    private static final int MSG_DOWN_LOAD_LONG_GET_PLAY_INFO = 4105;
    private static final int MSG_DOWN_LOAD_PLAY_BACK = 4104;
    private static final int MSG_DOWN_LOAD_PROGRESS_UPDARE = 4106;
    private static final int MSG_DOWN_LOAD_PROTOCOL_UPDATE = 4102;
    private static final int MSG_DOWN_LOAD_STATUS_UPDATE = 4101;
    private static final int MSG_DOWN_LOAD_STRING_GET_PLAY_INFO = 4107;
    private static final int MSG_GLOBAL_EVENT = 4196;
    private static final int MSG_INDEX = 4096;
    private static final int MSG_NETWORK_STATUS_EVENT = 4197;
    private static final int MSG_PROXY_CANCEL_READ_DATA = 4109;
    private static final int MSG_PROXY_GET_CONTENT_TYPE = 4112;
    private static final int MSG_PROXY_GET_DATA_FILE_PATH = 4111;
    private static final int MSG_PROXY_GET_DATA_TOTAL_SIZE = 4110;
    private static final int MSG_PROXY_START_READ_DATA = 4108;
    private static final java.lang.String TAG = "TPThumbPlayer[TPPlayManagerImpl.java]";
    private static final int TYPE_NOT_INIT = -1;
    private final android.content.Context mContext;
    private java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> mDownloadPramList;
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy mDownloadProxy;
    private java.lang.String mFileID;
    private com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.EventHandler mHandler;
    private final com.tencent.thumbplayer.utils.TPReadWriteLock mHandlerLock;
    private com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.InnerProxyListener mInnerProxyListener;
    private java.lang.String mOriginUrl;
    private int mPlayID;
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener mPlayListener;
    private long mSkipEndTimeMs;
    private long mStartTimeMs;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mTrackProxyUrlPlayIdMap;
    private com.tencent.thumbplayer.api.TPVideoInfo mVideoInfo;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mDownloadProxyRWLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private volatile int mLoadProxyState = 0;
    private volatile int mServiceType = -1;
    private com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener mPlayerProxyListener = null;
    private final java.util.Deque<com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel> mPendingDefTaskQueue = new java.util.LinkedList();
    private boolean mIsRemuxer = false;
    private boolean mIsActive = true;
    private boolean mEnableSuggestedBitrateCallback = false;
    private boolean mEnableAdaptiveSwitch = false;
    private boolean mEnableMultiNetworkCard = false;
    private long mMaxBitrateBps = 100000000;
    private boolean mIsUseResourceLoader = false;

    /* loaded from: classes6.dex */
    public static final class DownloadProxyState {
        private static final int STATE_LOAD_FAILED = 1;
        private static final int STATE_LOAD_RELEASE = 3;
        private static final int STATE_LOAD_SUCCEEDED = 2;
        private static final int STATE_NO_LOADED = 0;

        private DownloadProxyState() {
        }
    }

    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener == null) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TAG, "handleMessage failed, mPlayListener is null and return");
                return;
            }
            int i17 = message.what;
            if (i17 == com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_GLOBAL_EVENT) {
                com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.handleGlobalEvent(message.arg1);
                return;
            }
            if (i17 == com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_NETWORK_STATUS_EVENT) {
                com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.handleNetworkStatusEvent(message.arg1);
                return;
            }
            switch (i17) {
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_FINISH /* 4097 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadFinish();
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_ERROR /* 4098 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadError(message.arg1, message.arg2, (java.lang.String) message.obj);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_UPDATE /* 4099 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadCdnUrlUpdate((java.lang.String) message.obj);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_INFO_UPDATE /* 4100 */:
                    com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo) message.obj;
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadCdnUrlInfoUpdate(tPCDNURLInfo.url, tPCDNURLInfo.cdnIp, tPCDNURLInfo.uIp, tPCDNURLInfo.errorStr);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_STATUS_UPDATE /* 4101 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadStatusUpdate(message.arg1);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_PROTOCOL_UPDATE /* 4102 */:
                    com.tencent.thumbplayer.api.TPPlayerMsg.TPProtocolInfo tPProtocolInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPProtocolInfo) message.obj;
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadProtocolUpdate(tPProtocolInfo.protocolName, tPProtocolInfo.protocolVersion);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_EXPERIED /* 4103 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadCdnUrlExpired((java.util.Map) message.obj);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_PLAY_BACK /* 4104 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams tPMessageParams = (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams) message.obj;
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPOnPlayCallBackParams tPOnPlayCallBackParams = (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPOnPlayCallBackParams) tPMessageParams.params;
                    tPMessageParams.result.setResult(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onPlayCallback(tPOnPlayCallBackParams.messageType, tPOnPlayCallBackParams.ext1, tPOnPlayCallBackParams.ext2, tPOnPlayCallBackParams.ext3, tPOnPlayCallBackParams.ext4));
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_LONG_GET_PLAY_INFO /* 4105 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams tPMessageParams2 = (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams) message.obj;
                    tPMessageParams2.result.setResult(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getPlayInfo(((java.lang.Long) tPMessageParams2.params).longValue()));
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_PROGRESS_UPDARE /* 4106 */:
                    com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) message.obj;
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onDownloadProgressUpdate((int) tPDownLoadProgressInfo.playableDurationMS, tPDownLoadProgressInfo.downloadSpeedKBps, tPDownLoadProgressInfo.currentDownloadSize, tPDownLoadProgressInfo.totalFileSize, tPDownLoadProgressInfo.extraInfo);
                    return;
                case com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_STRING_GET_PLAY_INFO /* 4107 */:
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams tPMessageParams3 = (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams) message.obj;
                    tPMessageParams3.result.setResult(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getPlayInfo((java.lang.String) tPMessageParams3.params));
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class TPDefTaskModel {
        long definitionID;
        int proxyTaskID;

        public TPDefTaskModel(long j17, int i17) {
            this.definitionID = j17;
            this.proxyTaskID = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class TPDownloadSeqAndClipIndexMapping {
        int clipIndex;
        int downloadSeq;

        public TPDownloadSeqAndClipIndexMapping(int i17, int i18) {
            this.downloadSeq = i17;
            this.clipIndex = i18;
        }
    }

    /* loaded from: classes16.dex */
    public static class TPMessageParams {
        java.lang.Object params;
        com.tencent.thumbplayer.utils.TPFutureResult result;

        private TPMessageParams() {
        }
    }

    /* loaded from: classes16.dex */
    public static class TPOnPlayCallBackParams {
        java.lang.Object ext1;
        java.lang.Object ext2;
        java.lang.Object ext3;
        java.lang.Object ext4;
        int messageType;

        private TPOnPlayCallBackParams() {
        }
    }

    public TPPlayManagerImpl(android.content.Context context, android.os.Looper looper) {
        this.mContext = context;
        this.mHandler = new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.EventHandler(looper);
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.addEventListener(this);
        com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getInstance().addOnNetStatusChangeListener(this);
        this.mInnerProxyListener = new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.InnerProxyListener();
        this.mPlayListener = new com.tencent.thumbplayer.datatransport.TPPlayProxyListenerEmptyImpl(TAG);
        this.mTrackProxyUrlPlayIdMap = new java.util.HashMap<>();
        this.mDownloadPramList = new java.util.ArrayList<>();
        this.mHandlerLock = new com.tencent.thumbplayer.utils.TPReadWriteLock();
    }

    private boolean addAudioTrack(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_DATA_TRANSFER_MODE, 1);
        return this.mDownloadProxy.setClipInfo(this.mPlayID, 2, str2, new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(arrayList, 3, hashMap));
    }

    private java.util.Map<java.lang.String, java.lang.Object> buildTPProxyConfig() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE, java.lang.Integer.valueOf((this.mEnableAdaptiveSwitch || this.mEnableSuggestedBitrateCallback) ? 1 : 0));
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, java.lang.Integer.valueOf(this.mEnableMultiNetworkCard ? 1 : 0));
        return hashMap;
    }

    private com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam convertDownloadParam(java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        return com.tencent.thumbplayer.datatransport.TPProxyUtils.convertProxyDownloadParams(str, tPDownloadParamData, map, map2);
    }

    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> getAssetClips(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack;
        if (iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaComposition) {
            java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> allAVTracks = ((com.tencent.thumbplayer.composition.TPMediaComposition) iTPMediaAsset).getAllAVTracks();
            if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(allAVTracks) || (iTPMediaTrack = allAVTracks.get(0)) == null || com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(iTPMediaTrack.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack.getAllTrackClips();
        }
        if (iTPMediaAsset instanceof com.tencent.thumbplayer.api.composition.ITPMediaTrack) {
            com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack2 = (com.tencent.thumbplayer.api.composition.ITPMediaTrack) iTPMediaAsset;
            if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(iTPMediaTrack2.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack2.getAllTrackClips();
        }
        if (!(iTPMediaAsset instanceof com.tencent.thumbplayer.api.composition.ITPMediaTrackClip)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add((com.tencent.thumbplayer.api.composition.ITPMediaTrackClip) iTPMediaAsset);
        return arrayList;
    }

    private com.tencent.thumbplayer.api.proxy.TPDownloadParamData getDownloadParamDataWithIndex(java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> arrayList, int i17) {
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(arrayList) || i17 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i17);
    }

    private java.lang.String getFileId() {
        return this.mFileID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object getFutureResult(com.tencent.thumbplayer.utils.TPFutureResult tPFutureResult) {
        try {
            return tPFutureResult.getResult(500L);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPlayCallback getResult has exception:" + th6.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGlobalEvent(int i17) {
        switch (i17) {
            case 100001:
                pushEventByInner(13);
                return;
            case 100002:
                pushEventByInner(14);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIsActive() {
        try {
            this.mDownloadProxy.setPlayState(this.mPlayID, this.mIsActive ? 101 : 100);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNetworkStatusEvent(int i17) {
        if (i17 == 1) {
            pushEventByInner(1);
            pushEventByInner(10);
        } else if (i17 == 2) {
            pushEventByInner(2);
            pushEventByInner(9);
        } else {
            if (i17 != 3) {
                return;
            }
            pushEventByInner(2);
            pushEventByInner(10);
        }
    }

    private boolean initProxy() {
        if (this.mServiceType == -1) {
            this.mServiceType = com.tencent.thumbplayer.datatransport.config.TPProxyConfig.getDefaultServiceType();
        }
        com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter playerProxy = com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.getInstance().getPlayerProxy(this.mServiceType);
        if (playerProxy == null || playerProxy.getDownloadProxy() == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "initProxy failed, serviceType:" + this.mServiceType + ", playProxyManager:" + playerProxy);
            return false;
        }
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy downloadProxy = playerProxy.getDownloadProxy();
        this.mDownloadProxy = downloadProxy;
        downloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_IS_VIP, java.lang.Boolean.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.isUserIsVip()));
        if (!android.text.TextUtils.isEmpty(com.tencent.thumbplayer.config.TPPlayerConfig.getUserUin())) {
            this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UIN, com.tencent.thumbplayer.config.TPPlayerConfig.getUserUin());
        }
        if (!android.text.TextUtils.isEmpty(com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(this.mContext))) {
            this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION, com.tencent.thumbplayer.config.TPPlayerConfig.getAppVersionName(this.mContext));
        }
        if (com.tencent.thumbplayer.config.TPPlayerConfig.getBuildNumber(this.mContext) != -1) {
            this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_APP_VERSION_CODE, java.lang.String.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getBuildNumber(this.mContext)));
        }
        this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC, com.tencent.thumbplayer.config.TPPlayerConfig.getUserUpc());
        this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_UPC_STATE, java.lang.Integer.valueOf(com.tencent.thumbplayer.config.TPPlayerConfig.getUserUpcState()));
        this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, com.tencent.thumbplayer.config.TPPlayerConfig.getOutNetIp());
        this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.TAB_ABUSERID, com.tencent.thumbplayer.config.TPPlayerConfig.getAbUserId());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalMessage(int i17, java.lang.Object obj) {
        internalMessage(i17, 0, 0, obj, false, false, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInitDownloadProxyFailed() {
        if (!com.tencent.thumbplayer.datatransport.config.TPProxyConfig.isProxyEnable()) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "config set don't use p2p proxy!");
            return true;
        }
        try {
            this.mDownloadProxyRWLock.readLock().lock();
            if (this.mLoadProxyState != 1) {
                if (this.mLoadProxyState != 3) {
                    try {
                        this.mDownloadProxyRWLock.writeLock().lock();
                        if (this.mLoadProxyState == 0) {
                            this.mLoadProxyState = initProxy() ? 2 : 1;
                        }
                        return this.mLoadProxyState == 1;
                    } finally {
                        this.mDownloadProxyRWLock.writeLock().unlock();
                    }
                }
            }
            return true;
        } finally {
            this.mDownloadProxyRWLock.readLock().unlock();
        }
    }

    private java.lang.String messageToCommand(int i17) {
        switch (i17) {
            case MSG_DOWN_LOAD_FINISH /* 4097 */:
                return "onDownloadFinish";
            case MSG_DOWN_LOAD_ERROR /* 4098 */:
                return "onDownloadError";
            case MSG_DOWN_LOAD_CDN_URL_UPDATE /* 4099 */:
                return "onDownloadCdnUrlUpdate";
            case MSG_DOWN_LOAD_CDN_INFO_UPDATE /* 4100 */:
                return "onDownloadCdnUrlInfoUpdate";
            case MSG_DOWN_LOAD_STATUS_UPDATE /* 4101 */:
                return "onDownloadStatusUpdate";
            case MSG_DOWN_LOAD_PROTOCOL_UPDATE /* 4102 */:
                return "onDownloadProtocolUpdate";
            case MSG_DOWN_LOAD_CDN_URL_EXPERIED /* 4103 */:
                return "onDownloadCdnUrlExpired";
            case MSG_DOWN_LOAD_PLAY_BACK /* 4104 */:
                return "onPlayCallback";
            case MSG_DOWN_LOAD_LONG_GET_PLAY_INFO /* 4105 */:
            case MSG_DOWN_LOAD_STRING_GET_PLAY_INFO /* 4107 */:
                return "getPlayInfo";
            case MSG_DOWN_LOAD_PROGRESS_UPDARE /* 4106 */:
                return "onDownloadProgressUpdate";
            default:
                return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
    }

    private void releaseHandler() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "inner event : release handler");
        this.mHandlerLock.writeLock().lock();
        com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.EventHandler eventHandler = this.mHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        this.mHandlerLock.writeLock().unlock();
    }

    private void reset() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reset");
        this.mFileID = "";
        this.mOriginUrl = "";
        this.mVideoInfo = null;
        this.mStartTimeMs = 0L;
        this.mSkipEndTimeMs = 0L;
        this.mIsRemuxer = false;
        this.mIsActive = true;
        this.mEnableSuggestedBitrateCallback = false;
        this.mEnableAdaptiveSwitch = false;
        this.mEnableMultiNetworkCard = false;
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mDownloadPramList)) {
            this.mDownloadPramList.clear();
        }
        this.mDownloadProxyRWLock.writeLock().lock();
        this.mLoadProxyState = 0;
        this.mServiceType = -1;
        this.mDownloadProxy = null;
        this.mDownloadProxyRWLock.writeLock().unlock();
        this.mMaxBitrateBps = 100000000L;
    }

    private void setPlayUserData() {
        this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, java.lang.Long.valueOf(this.mStartTimeMs));
        this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, java.lang.Long.valueOf(this.mSkipEndTimeMs));
    }

    private int startClipPlay(java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> list, java.lang.String str, java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> arrayList) {
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(list)) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "clipList is empty, return");
            return -1;
        }
        int size = list.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i17 = 1;
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip = list.get(i18);
            if ((iTPMediaTrackClip instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip) && com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(((com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip) iTPMediaTrackClip).getFilePath())) {
                linkedHashMap.put(iTPMediaTrackClip, new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDownloadSeqAndClipIndexMapping(i17, i18));
                i17++;
            }
        }
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(linkedHashMap)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "all urls is local file url, return");
            return -1;
        }
        int startClipPlay = this.mDownloadProxy.startClipPlay(str, linkedHashMap.size(), this.mInnerProxyListener);
        if (startClipPlay > 0) {
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip2 = (com.tencent.thumbplayer.api.composition.ITPMediaTrackClip) entry.getKey();
                com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDownloadSeqAndClipIndexMapping tPDownloadSeqAndClipIndexMapping = (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDownloadSeqAndClipIndexMapping) entry.getValue();
                if (iTPMediaTrackClip2 instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip) {
                    com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip tPMediaCompositionTrackClip = (com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip) iTPMediaTrackClip2;
                    com.tencent.thumbplayer.api.proxy.TPDownloadParamData downloadParamDataWithIndex = getDownloadParamDataWithIndex(arrayList, tPDownloadSeqAndClipIndexMapping.clipIndex);
                    if (downloadParamDataWithIndex == null) {
                        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "fatal err, paramData is null.");
                        return -1;
                    }
                    com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "multi trackClipIndex:" + tPDownloadSeqAndClipIndexMapping.clipIndex + ", download seq:" + tPDownloadSeqAndClipIndexMapping.downloadSeq + ", clip.url:" + tPMediaCompositionTrackClip.getUrl() + ", clip.getFilePath:" + tPMediaCompositionTrackClip.getFilePath() + ", paramData.savePath:" + downloadParamDataWithIndex.getSavePath() + ", paramData.DownloadFileID:" + downloadParamDataWithIndex.getDownloadFileID());
                    if (this.mDownloadProxy.setClipInfo(startClipPlay, tPDownloadSeqAndClipIndexMapping.downloadSeq, downloadParamDataWithIndex.getDownloadFileID(), convertDownloadParam(tPMediaCompositionTrackClip.getFilePath(), downloadParamDataWithIndex, tPMediaCompositionTrackClip.getHttpHeader(), buildTPProxyConfig()))) {
                        tPMediaCompositionTrackClip.setFilePath(this.mDownloadProxy.getClipPlayUrl(startClipPlay, tPDownloadSeqAndClipIndexMapping.downloadSeq, 1));
                    }
                }
            }
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy start clip play failed, cause : playId < 0");
        }
        return startClipPlay;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaAsset startDownloadPlayByClipAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> assetClips = getAssetClips(iTPMediaAsset);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(assetClips)) {
            this.mPlayID = startClipPlay(assetClips, getFileId(), this.mDownloadPramList);
            handleIsActive();
            updateProxyTaskInfo();
        }
        return iTPMediaAsset;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaAsset startDownloadPlayByDRMAsset(com.tencent.thumbplayer.composition.TPMediaDRMAsset tPMediaDRMAsset) {
        tPMediaDRMAsset.setDrmPlayUrl(startDownloadPlay(tPMediaDRMAsset.getDrmPlayUrl(), tPMediaDRMAsset.getHttpHeader()).getSelfPlayerUrl());
        return tPMediaDRMAsset;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaAsset startDownloadPlayByUrlAsset(com.tencent.thumbplayer.composition.TPMediaUrlAsset tPMediaUrlAsset) {
        tPMediaUrlAsset.setStreamUrl(startDownloadPlay(tPMediaUrlAsset.getStreamUrl(), tPMediaUrlAsset.getHttpHeader()).getSelfPlayerUrl());
        return tPMediaUrlAsset;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaAsset startSwitchDefTaskByClipAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> assetClips = getAssetClips(iTPMediaAsset);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(assetClips) && tPVideoInfo != null) {
            int startClipPlay = startClipPlay(assetClips, tPVideoInfo.getProxyFileID(), tPVideoInfo.getDownloadPraramList());
            if (startClipPlay > 0) {
                this.mPendingDefTaskQueue.offer(new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel(j17, startClipPlay));
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "p2p proxy switch def sucess, defId:" + j17 + ",playId:" + startClipPlay);
                return iTPMediaAsset;
            }
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy switch clip def failed, cause : playId < 0");
        }
        return iTPMediaAsset;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaAsset startSwitchDefTaskByDRMAsset(com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset iTPMediaDRMAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        iTPMediaDRMAsset.setDrmPlayUrl(startSwitchDefTask(j17, iTPMediaDRMAsset.getDrmPlayUrl(), (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) ? null : tPVideoInfo.getDownloadPraramList().get(0), iTPMediaDRMAsset.getHttpHeader()).getSelfPlayerUrl());
        return iTPMediaDRMAsset;
    }

    private com.tencent.thumbplayer.api.composition.ITPMediaAsset startSwitchDefTaskByUrlAsset(com.tencent.thumbplayer.composition.TPMediaUrlAsset tPMediaUrlAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        tPMediaUrlAsset.setStreamUrl(startSwitchDefTask(j17, tPMediaUrlAsset.getStreamUrl(), tPVideoInfo, tPMediaUrlAsset.getHttpHeader()).getSelfPlayerUrl());
        return tPMediaUrlAsset;
    }

    private void updateProxyTaskInfo() {
        int i17 = this.mPlayID;
        if (i17 > 0) {
            this.mDownloadProxy.updateTaskInfo(i17, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.TASKINFO_ADAPTIVE_DYNAMIC_SWITCH, java.lang.Integer.valueOf((this.mEnableSuggestedBitrateCallback || this.mEnableAdaptiveSwitch) ? 1 : 0));
            this.mDownloadProxy.updateTaskInfo(this.mPlayID, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.TASKINFO_MAX_BITRATE, java.lang.Long.valueOf(this.mMaxBitrateBps));
            this.mDownloadProxy.updateTaskInfo(this.mPlayID, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, java.lang.Integer.valueOf(this.mEnableMultiNetworkCard ? 1 : 0));
        }
    }

    private void updateVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        this.mVideoInfo = tPVideoInfo;
        if (tPVideoInfo == null || tPVideoInfo.getDownloadPraramList() == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "video or downloadParamList is null, return");
            return;
        }
        if (this.mPlayID <= 0) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "p2p proxy not start, return");
            return;
        }
        java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
        for (int i17 = 0; i17 < downloadPraramList.size(); i17++) {
            com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData = downloadPraramList.get(i17);
            if (!this.mDownloadProxy.setClipInfo(this.mPlayID, tPDownloadParamData.getClipNo(), tPDownloadParamData.getDownloadFileID(), convertDownloadParam(tPDownloadParamData.getUrl(), tPDownloadParamData, null, buildTPProxyConfig()))) {
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "setClipInfo failed, playID:" + this.mPlayID + ", clipNo:" + tPDownloadParamData.getClipNo() + ", downloadFileID:" + tPDownloadParamData.getDownloadFileID());
            }
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public java.lang.String getPlayErrorCodeStr() {
        if (isInitDownloadProxyFailed()) {
            return null;
        }
        try {
            return this.mDownloadProxy.getPlayErrorCodeStr(this.mPlayID);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener getTPPlayerProxyListener() {
        return this.mPlayerProxyListener;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public boolean hasWaitDefTask() {
        if (isInitDownloadProxyFailed()) {
            return false;
        }
        return !this.mPendingDefTaskQueue.isEmpty();
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public boolean isEnable() {
        return !isInitDownloadProxyFailed();
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public boolean isUseResourceLoader() {
        return this.mIsUseResourceLoader;
    }

    @Override // com.tencent.thumbplayer.utils.TPGlobalEventNofication.OnGlobalEventChangeListener
    public void onEvent(int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onEvent eventId: " + i17 + ", arg1: " + i18 + ", arg2: " + i19 + ", object" + obj);
        internalMessage(MSG_GLOBAL_EVENT, i17, 0, null, false, false, 0L);
    }

    @Override // com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.OnNetStatusChangeListener
    public void onStatusChanged(int i17, int i18, int i19, int i27) {
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "onNetworkStatusChanged oldNetStatus: " + i17 + ", netStatus: " + i18);
        internalMessage(MSG_NETWORK_STATUS_EVENT, i18, 0, null, false, false, 0L);
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void pauseDownload() {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        pauseDownload(this.mPlayID);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mPendingDefTaskQueue)) {
            for (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel tPDefTaskModel : this.mPendingDefTaskQueue) {
                if (tPDefTaskModel != null) {
                    pauseDownload(tPDefTaskModel.proxyTaskID);
                }
            }
        }
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mTrackProxyUrlPlayIdMap)) {
            return;
        }
        java.util.Iterator<java.lang.Integer> it = this.mTrackProxyUrlPlayIdMap.values().iterator();
        while (it.hasNext()) {
            pauseDownload(it.next().intValue());
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void playerSwitchDefComplete(long j17) {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        try {
            if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mPendingDefTaskQueue)) {
                return;
            }
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel peek = this.mPendingDefTaskQueue.peek();
            while (peek != null && peek.definitionID != j17) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "stop proxy definitionID:" + peek.definitionID + ", taskID:" + peek.proxyTaskID);
                stopDownload(peek.proxyTaskID);
                this.mPendingDefTaskQueue.removeFirst();
                peek = this.mPendingDefTaskQueue.peek();
            }
            if (peek != null) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "stop proxy task id:" + peek.proxyTaskID);
                stopDownload(this.mPlayID);
                this.mPlayID = peek.proxyTaskID;
                handleIsActive();
                updateProxyTaskInfo();
                this.mPendingDefTaskQueue.remove(peek);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17, "playerSwitchDefComplete exception");
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void pushEvent(final int i17) {
        this.mHandlerLock.readLock().lock();
        com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.EventHandler eventHandler = this.mHandler;
        if (eventHandler != null) {
            eventHandler.post(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.isInitDownloadProxyFailed()) {
                        return;
                    }
                    try {
                        com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.pushEventByInner(com.tencent.thumbplayer.datatransport.TPProxyEnumUtils.eventID2Inner(i17));
                    } catch (java.lang.IllegalArgumentException e17) {
                        com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TAG, e17);
                    }
                }
            });
            this.mHandlerLock.readLock().unlock();
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "pushEvent event=" + i17 + " already release");
        }
    }

    public void pushEventByInner(int i17) {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        try {
            this.mDownloadProxy.pushEvent(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6, "p2p proxy pushEvent failed, event:" + i17);
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void release() {
        stopDownload();
        com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getInstance().removeOnNetStatusChangeListener(this);
        com.tencent.thumbplayer.utils.TPGlobalEventNofication.removeEventListener(this);
        releaseHandler();
        this.mPlayerProxyListener = null;
        this.mPlayListener = new com.tencent.thumbplayer.datatransport.TPPlayProxyListenerEmptyImpl(TAG);
        this.mInnerProxyListener = null;
        this.mDownloadProxyRWLock.writeLock().lock();
        this.mLoadProxyState = 3;
        this.mServiceType = -1;
        this.mDownloadProxy = null;
        this.mDownloadProxyRWLock.writeLock().unlock();
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void resumeDownload() {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        resumeDownload(this.mPlayID);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mPendingDefTaskQueue)) {
            for (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel tPDefTaskModel : this.mPendingDefTaskQueue) {
                if (tPDefTaskModel != null) {
                    resumeDownload(tPDefTaskModel.proxyTaskID);
                }
            }
        }
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mTrackProxyUrlPlayIdMap)) {
            return;
        }
        java.util.Iterator<java.lang.Integer> it = this.mTrackProxyUrlPlayIdMap.values().iterator();
        while (it.hasNext()) {
            resumeDownload(it.next().intValue());
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void setIsActive(boolean z17) {
        this.mHandlerLock.readLock().lock();
        if (this.mHandler == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "setIsActive isActive=" + z17);
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "setIsActive: " + z17);
            this.mIsActive = z17;
            this.mHandler.post(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.isInitDownloadProxyFailed()) {
                        return;
                    }
                    com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.handleIsActive();
                }
            });
            this.mHandlerLock.readLock().unlock();
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setIsUseResourceLoader(boolean z17) {
        this.mIsUseResourceLoader = z17;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setLogListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener) {
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setPlayListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener) {
        if (iTPPlayListener == null) {
            this.mPlayListener = new com.tencent.thumbplayer.datatransport.TPPlayProxyListenerEmptyImpl(TAG);
        } else {
            this.mPlayListener = iTPPlayListener;
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setPlaySpeedRatio(float f17) {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        if (f17 <= 0.0f) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "set play speed ratio, value invalid:" + f17);
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "set play speed value to proxy:" + f17);
            this.mDownloadProxy.updateTaskInfo(this.mPlayID, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.TASKINFO_SPEED_RATIO, java.lang.Float.valueOf(f17));
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        if (isInitDownloadProxyFailed() || tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 100) {
            this.mStartTimeMs = tPOptionalParam.getParamLong().value;
            return;
        }
        if (tPOptionalParam.getKey() == 500) {
            long j17 = tPOptionalParam.getParamLong().value;
            this.mSkipEndTimeMs = j17;
            if (this.mPlayID > 0) {
                this.mDownloadProxy.setUserData(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, java.lang.Long.valueOf(j17));
                return;
            }
            return;
        }
        if (tPOptionalParam.getKey() == 503) {
            this.mMaxBitrateBps = tPOptionalParam.getParamLong().param1;
            updateProxyTaskInfo();
            return;
        }
        if (tPOptionalParam.getKey() == 508) {
            this.mEnableSuggestedBitrateCallback = tPOptionalParam.getParamBoolean().value;
            updateProxyTaskInfo();
        } else if (tPOptionalParam.getKey() == 504) {
            this.mEnableAdaptiveSwitch = tPOptionalParam.getParamLong().value != 0;
            updateProxyTaskInfo();
        } else if (tPOptionalParam.getKey() == 509) {
            this.mEnableMultiNetworkCard = tPOptionalParam.getParamBoolean().value;
            updateProxyTaskInfo();
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setProxyPlayState(int i17) {
        com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "setProxyPlayState: " + i17);
        if (isInitDownloadProxyFailed()) {
            return;
        }
        try {
            this.mDownloadProxy.setPlayState(this.mPlayID, i17);
            if ((i17 == 5 || i17 == 0) && !com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mPendingDefTaskQueue)) {
                for (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel tPDefTaskModel : this.mPendingDefTaskQueue) {
                    if (tPDefTaskModel != null) {
                        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "setProxyPlayState definitionID:" + tPDefTaskModel.definitionID + ", taskID:" + tPDefTaskModel.proxyTaskID + ", state:" + i17);
                        this.mDownloadProxy.setPlayState(tPDefTaskModel.proxyTaskID, i17);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6);
        }
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void setProxyServiceType(int i17) {
        this.mServiceType = i17;
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPlayerProxy
    public void setTPPlayerProxyListener(com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener iTPPlayerProxyListener) {
        this.mPlayerProxyListener = iTPPlayerProxyListener;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "setVideoInfo, param is null ");
            return;
        }
        if (this.mVideoInfo != null) {
            updateVideoInfo(tPVideoInfo);
        }
        this.mVideoInfo = tPVideoInfo;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "setVideoInfo, enter");
        this.mFileID = tPVideoInfo.getProxyFileID();
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mDownloadPramList)) {
            this.mDownloadPramList.clear();
        }
        if (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) {
            return;
        }
        this.mDownloadPramList.addAll(tPVideoInfo.getDownloadPraramList());
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public java.lang.String startDownLoadTrackUrl(int i17, java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
        java.lang.String md52;
        com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "return coz url is empty");
            return str;
        }
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "return coz url is locol url, not need use proxy");
            return str;
        }
        if (isInitDownloadProxyFailed()) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "return coz download proxy init failed");
            return str;
        }
        int i18 = 2;
        int i19 = 1;
        try {
            if (tPDownloadParamData != null) {
                tPDownloadParam = com.tencent.thumbplayer.datatransport.TPProxyUtils.convertProxyDownloadParams(str, tPDownloadParamData, null, null);
                if (tPDownloadParamData.getTaskType() != 1) {
                    i18 = 1;
                }
                md52 = tPDownloadParamData.getDownloadFileID();
                if (android.text.TextUtils.isEmpty(md52)) {
                    md52 = com.tencent.thumbplayer.utils.TPCommonUtils.getMd5(str);
                }
                i19 = i18;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam2 = new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(arrayList, i17 == 2 ? 3 : 0, null);
                md52 = com.tencent.thumbplayer.utils.TPCommonUtils.getMd5(str);
                tPDownloadParam = tPDownloadParam2;
            }
            int startPlay = this.mDownloadProxy.startPlay(md52, tPDownloadParam, this.mInnerProxyListener);
            if (startPlay <= 0) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy start play failed, cause : playId <= 0");
                return str;
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "p2p proxy start play, url type" + i19);
            java.lang.String playUrl = this.mDownloadProxy.getPlayUrl(startPlay, i19);
            this.mTrackProxyUrlPlayIdMap.put(playUrl, java.lang.Integer.valueOf(startPlay));
            return playUrl;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy start play failed:" + th6);
            return str;
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public com.tencent.thumbplayer.adapter.player.TPUrlDataSource startDownloadPlay(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource = new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(str) || isInitDownloadProxyFailed()) {
            return tPUrlDataSource;
        }
        setPlayUserData();
        this.mOriginUrl = str;
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData downloadParamDataWithIndex = getDownloadParamDataWithIndex(this.mDownloadPramList, 0);
        if (this.mIsUseResourceLoader && downloadParamDataWithIndex != null && downloadParamDataWithIndex.getDlType() == 1) {
            downloadParamDataWithIndex = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(11);
        }
        com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam convertDownloadParam = downloadParamDataWithIndex != null ? convertDownloadParam(str, downloadParamDataWithIndex, map, buildTPProxyConfig()) : null;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("single url:");
            sb6.append(str);
            sb6.append(", paramData.savePath:");
            sb6.append(downloadParamDataWithIndex != null ? downloadParamDataWithIndex.getSavePath() : "null");
            sb6.append(", paramData.DownloadFileID:");
            sb6.append(downloadParamDataWithIndex != null ? downloadParamDataWithIndex.getDownloadFileID() : "null");
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, sb6.toString());
            int startPlay = this.mDownloadProxy.startPlay(getFileId(), convertDownloadParam, this.mInnerProxyListener);
            if (startPlay > 0) {
                java.lang.String playUrl = this.mDownloadProxy.getPlayUrl(startPlay, 0);
                if (android.text.TextUtils.isEmpty(playUrl)) {
                    playUrl = str;
                }
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "startDownloadPlay, playId:" + startPlay);
                tPUrlDataSource.setSelfPlayerUrl(playUrl);
                java.lang.String playUrl2 = this.mDownloadProxy.getPlayUrl(startPlay, 1);
                if (!android.text.TextUtils.isEmpty(playUrl2)) {
                    str = playUrl2;
                }
                tPUrlDataSource.setSystemPlayerUrl(str);
                this.mPlayID = startPlay;
                handleIsActive();
                updateProxyTaskInfo();
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy start play failed, cause : playId <= 0");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6, "p2p proxy start play failed");
        }
        return tPUrlDataSource;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public com.tencent.thumbplayer.api.composition.ITPMediaAsset startDownloadPlayByAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        if (isInitDownloadProxyFailed()) {
            return iTPMediaAsset;
        }
        setPlayUserData();
        return iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaDRMAsset ? startDownloadPlayByDRMAsset((com.tencent.thumbplayer.composition.TPMediaDRMAsset) iTPMediaAsset) : iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaUrlAsset ? startDownloadPlayByUrlAsset((com.tencent.thumbplayer.composition.TPMediaUrlAsset) iTPMediaAsset) : startDownloadPlayByClipAsset(iTPMediaAsset);
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void startRemuxer(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(str) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "startRemuxer, audioTrackUrl:" + str + ", keyId:" + str2);
            return;
        }
        if (isInitDownloadProxyFailed()) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "startRemuxer, download proxy init failed.");
            return;
        }
        if (this.mIsRemuxer) {
            int i17 = this.mPlayID;
            if (i17 > 0) {
                stopDownload(i17);
            }
            this.mPlayID = 0;
            startDownloadPlay(this.mOriginUrl, null);
            if (!addAudioTrack(str, str2)) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "startRemuxer, addAudioTrack err.");
                return;
            }
        } else if (!addAudioTrack(str, str2)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "startRemuxer, addAudioTrack err.");
            return;
        }
        this.mIsRemuxer = true;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public com.tencent.thumbplayer.adapter.player.TPUrlDataSource startSwitchDefTask(long j17, java.lang.String str, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map<java.lang.String, java.lang.String> map) {
        if (tPVideoInfo == null) {
            return new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
        }
        return startSwitchDefTask(j17, str, (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) ? null : tPVideoInfo.getDownloadPraramList().get(0), map);
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public com.tencent.thumbplayer.api.composition.ITPMediaAsset startSwitchDefTaskByAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo) {
        return (isInitDownloadProxyFailed() || iTPMediaAsset == null || tPVideoInfo == null) ? iTPMediaAsset : iTPMediaAsset instanceof com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset ? startSwitchDefTaskByDRMAsset((com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset) iTPMediaAsset, j17, tPVideoInfo) : iTPMediaAsset instanceof com.tencent.thumbplayer.composition.TPMediaUrlAsset ? startSwitchDefTaskByUrlAsset((com.tencent.thumbplayer.composition.TPMediaUrlAsset) iTPMediaAsset, j17, tPVideoInfo) : startSwitchDefTaskByClipAsset(iTPMediaAsset, j17, tPVideoInfo);
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void stopDownLoadTrackUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "return coz url is empty");
            return;
        }
        if (isInitDownloadProxyFailed()) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "return coz download proxy init failed");
            return;
        }
        if (!this.mTrackProxyUrlPlayIdMap.containsKey(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "return, coz mTrackProxyUrlPlayIdMap not contain current proxy url:" + str + ", or it is not proxy url");
            return;
        }
        try {
            this.mDownloadProxy.stopPlay(this.mTrackProxyUrlPlayIdMap.get(str).intValue());
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy stop play failed:" + e17);
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void stopDownload() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "stopDownload, playId:" + this.mPlayID);
        int i17 = this.mPlayID;
        if (i17 > 0) {
            stopDownload(i17);
        }
        this.mPlayID = 0;
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mPendingDefTaskQueue)) {
            for (com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel tPDefTaskModel : this.mPendingDefTaskQueue) {
                if (tPDefTaskModel != null) {
                    stopDownload(tPDefTaskModel.proxyTaskID);
                }
            }
            this.mPendingDefTaskQueue.clear();
        }
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mTrackProxyUrlPlayIdMap)) {
            java.util.Iterator<java.lang.Integer> it = this.mTrackProxyUrlPlayIdMap.values().iterator();
            while (it.hasNext()) {
                stopDownload(it.next().intValue());
            }
            this.mTrackProxyUrlPlayIdMap.clear();
        }
        reset();
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPPlayManager
    public void stopRemuxer() {
        if (isInitDownloadProxyFailed()) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "stopRemuxer, download proxy init failed.");
            return;
        }
        if (this.mIsRemuxer) {
            int i17 = this.mPlayID;
            if (i17 > 0) {
                stopDownload(i17);
            }
            this.mPlayID = 0;
            startDownloadPlay(this.mOriginUrl, null);
        }
        this.mIsRemuxer = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalMessage(int i17, int i18, int i19, java.lang.Object obj, boolean z17, boolean z18, long j17) {
        this.mHandlerLock.readLock().lock();
        com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.EventHandler eventHandler = this.mHandler;
        if (eventHandler == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, messageToCommand(i17) + " , send failed , handler null");
            this.mHandlerLock.readLock().unlock();
            return;
        }
        if (z17 && obj == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, messageToCommand(i17) + ", send failed , params null");
            this.mHandlerLock.readLock().unlock();
            return;
        }
        if (z18) {
            eventHandler.removeMessages(i17);
        }
        android.os.Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i17;
        obtainMessage.arg1 = i18;
        obtainMessage.arg2 = i19;
        obtainMessage.obj = obj;
        this.mHandler.sendMessageDelayed(obtainMessage, j17);
        this.mHandlerLock.readLock().unlock();
    }

    private com.tencent.thumbplayer.adapter.player.TPUrlDataSource startSwitchDefTask(long j17, java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData, java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource = new com.tencent.thumbplayer.adapter.player.TPUrlDataSource(str);
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isUrl(str) || isInitDownloadProxyFailed()) {
            return tPUrlDataSource;
        }
        java.lang.String str2 = null;
        com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam convertDownloadParam = tPDownloadParamData != null ? convertDownloadParam(str, tPDownloadParamData, map, buildTPProxyConfig()) : null;
        if (tPDownloadParamData != null) {
            try {
                str2 = tPDownloadParamData.getDownloadFileID();
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6, "p2p proxy switch def failed");
            }
        }
        int startPlay = this.mDownloadProxy.startPlay(str2, convertDownloadParam, this.mInnerProxyListener);
        if (startPlay > 0) {
            java.lang.String playUrl = this.mDownloadProxy.getPlayUrl(startPlay, 1);
            if (android.text.TextUtils.isEmpty(playUrl)) {
                playUrl = str;
            }
            tPUrlDataSource.setSelfPlayerUrl(playUrl);
            java.lang.String playUrl2 = this.mDownloadProxy.getPlayUrl(startPlay, 0);
            if (!android.text.TextUtils.isEmpty(playUrl2)) {
                str = playUrl2;
            }
            tPUrlDataSource.setSystemPlayerUrl(str);
            this.mPendingDefTaskQueue.offer(new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPDefTaskModel(j17, startPlay));
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "p2p proxy switch def sucess, defId:" + j17 + ",playId:" + startPlay);
            return tPUrlDataSource;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "p2p proxy switch def failed, cause : playId <= 0");
        return tPUrlDataSource;
    }

    /* loaded from: classes16.dex */
    public class InnerProxyListener implements com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener {
        private InnerProxyListener() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getAdvRemainTime();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getContentType(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getCurrentPlayClipNo();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPlayOffset() {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getCurrentPlayOffset();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getCurrentPosition();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getDataFilePath(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getDataTotalSize(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getM3U8Content(i17, str, str2);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object getPlayInfo(long j17) {
            com.tencent.thumbplayer.utils.TPFutureResult tPFutureResult = new com.tencent.thumbplayer.utils.TPFutureResult();
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams tPMessageParams = new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams();
            tPMessageParams.params = java.lang.Long.valueOf(j17);
            tPMessageParams.result = tPFutureResult;
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_LONG_GET_PLAY_INFO, tPMessageParams);
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.getFutureResult(tPFutureResult);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.getPlayerBufferLength();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map) {
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_EXPERIED, map);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            tPCDNURLInfo.errorStr = str4;
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_INFO_UPDATE, tPCDNURLInfo);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(java.lang.String str) {
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_CDN_URL_UPDATE, str);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i17, int i18, java.lang.String str) {
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_ERROR, i17, i18, str, false, false, 0L);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_FINISH, null);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = i17;
            tPDownLoadProgressInfo.downloadSpeedKBps = i18;
            tPDownLoadProgressInfo.currentDownloadSize = j17;
            tPDownLoadProgressInfo.totalFileSize = j18;
            tPDownLoadProgressInfo.extraInfo = str;
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_PROGRESS_UPDARE, tPDownLoadProgressInfo);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2) {
            com.tencent.thumbplayer.api.TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_PROTOCOL_UPDATE, tPProtocolInfo);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i17) {
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_STATUS_UPDATE, i17, 0, null, false, false, 0L);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object onPlayCallback(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPOnPlayCallBackParams tPOnPlayCallBackParams = new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPOnPlayCallBackParams();
            tPOnPlayCallBackParams.messageType = i17;
            tPOnPlayCallBackParams.ext1 = obj;
            tPOnPlayCallBackParams.ext2 = obj2;
            tPOnPlayCallBackParams.ext3 = obj3;
            tPOnPlayCallBackParams.ext4 = obj4;
            com.tencent.thumbplayer.utils.TPFutureResult tPFutureResult = new com.tencent.thumbplayer.utils.TPFutureResult();
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams tPMessageParams = new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams();
            tPMessageParams.params = tPOnPlayCallBackParams;
            tPMessageParams.result = tPFutureResult;
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_PLAY_BACK, tPMessageParams);
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.getFutureResult(tPFutureResult);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onReadData(i17, str, str2, j17, j18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onStartReadData(i17, str, str2, j17, j18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.mPlayListener.onStopReadData(i17, str, str2, i18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
        public java.lang.Object getPlayInfo(java.lang.String str) {
            com.tencent.thumbplayer.utils.TPFutureResult tPFutureResult = new com.tencent.thumbplayer.utils.TPFutureResult();
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams tPMessageParams = new com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.TPMessageParams();
            tPMessageParams.params = str;
            tPMessageParams.result = tPFutureResult;
            com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.internalMessage(com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.MSG_DOWN_LOAD_STRING_GET_PLAY_INFO, tPMessageParams);
            return com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.this.getFutureResult(tPFutureResult);
        }
    }

    private void pauseDownload(int i17) {
        try {
            this.mDownloadProxy.pauseDownload(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6, "p2p proxy pause download failed, taskId:" + i17);
        }
    }

    private void resumeDownload(int i17) {
        try {
            this.mDownloadProxy.resumeDownload(this.mPlayID);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6, "p2p proxy resume download failed, taskId:" + i17);
        }
    }

    private void stopDownload(int i17) {
        if (isInitDownloadProxyFailed()) {
            return;
        }
        try {
            this.mDownloadProxy.stopPlay(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6, "p2p proxy stop play failed, taskID:" + i17);
        }
    }
}
