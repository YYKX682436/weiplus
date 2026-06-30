package com.tencent.thumbplayer.adapter.player.thumbplayer;

/* loaded from: classes16.dex */
public class TPThumbPlayer implements com.tencent.thumbplayer.adapter.player.ITPPlayerBase {
    private static final int EVENT_MSG_ASYNC_CALL = 1;
    private static final int EVENT_MSG_ON_DETAIL_INFO = 5;
    private static final int EVENT_MSG_ON_ERROR = 4;
    private static final int EVENT_MSG_ON_INFO_LONG = 2;
    private static final int EVENT_MSG_ON_INFO_OBJECT = 3;
    private static final java.lang.String TAG = "TPThumbPlayer";
    static final java.util.Set<java.lang.Integer> sVerboseObjectInfoTypes = new java.util.HashSet<java.lang.Integer>() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.9
        {
            add(503);
        }
    };
    private com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.EventHandler mEventHandler;
    private com.tencent.thumbplayer.adapter.player.ITPCapture mImageGenerator;
    private com.tencent.thumbplayer.log.TPBaseLogger mLogger;
    private com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig mNativeInitConfig;
    private com.tencent.thumbplayer.core.player.TPNativePlayer mPlayer;
    private com.tencent.thumbplayer.adapter.TPPlayerBaseListeners mPlayerListenerReps;
    private com.tencent.thumbplayer.api.TPSubtitleData mSubtitleData = new com.tencent.thumbplayer.api.TPSubtitleData();
    private com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback mNativeMessageCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.2
        private void sendMessage(int i17, java.lang.Object obj) {
            if (com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mEventHandler != null) {
                android.os.Message.obtain(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mEventHandler, i17, obj).sendToTarget();
            }
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onASyncCallResult(int i17, long j17, int i18, int i19) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.info("onASyncCallResult, callType:" + i17 + ", opaque:" + j17 + ", errorType:" + i18 + ", errorCode:" + i19);
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnASyncCallResultInfo onASyncCallResultInfo = new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnASyncCallResultInfo();
            onASyncCallResultInfo.callType = i17;
            onASyncCallResultInfo.opaque = j17;
            onASyncCallResultInfo.errorType = i18;
            onASyncCallResultInfo.errorCode = i19;
            sendMessage(1, onASyncCallResultInfo);
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onDetailInfo(com.tencent.thumbplayer.core.common.TPDetailInfo tPDetailInfo) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.info("onDetailInfo, type:" + tPDetailInfo.type + ", time:" + tPDetailInfo.timeSince1970Us);
            sendMessage(5, tPDetailInfo);
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onError(int i17, int i18) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.info("onError, msgType:" + i17 + ", errorCode:" + i18);
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnErrorInfo onErrorInfo = new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnErrorInfo();
            onErrorInfo.msgType = i17;
            onErrorInfo.errorCode = i18;
            sendMessage(4, onErrorInfo);
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onInfoLong(int i17, long j17, long j18) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.info("onInfoLong, infoType:" + i17 + ", lParam1:" + j17 + ", lParam2:" + j18);
            if (i17 == 253) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.addDRMBlacklist(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapDrmType.class, (int) j17));
                return;
            }
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoLongInfo onInfoLongInfo = new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoLongInfo();
            onInfoLongInfo.infoType = i17;
            onInfoLongInfo.lParam1 = j17;
            onInfoLongInfo.lParam2 = j18;
            sendMessage(2, onInfoLongInfo);
        }

        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback
        public void onInfoObject(int i17, java.lang.Object obj) {
            if (!com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.isObjectInfoTypeVerbose(i17)) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.info("onInfoObject, infoType:" + i17 + ", objParam:" + obj);
            }
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoObjectInfo onInfoObjectInfo = new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoObjectInfo();
            onInfoObjectInfo.infoType = i17;
            onInfoObjectInfo.objParam = obj;
            sendMessage(3, onInfoObjectInfo);
        }
    };
    private com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback mNativeAudioFrameCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.3
        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback
        public void onAudioFrame(com.tencent.thumbplayer.core.common.TPAudioFrame tPAudioFrame, int i17) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onAudioPcmOut(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPAudioFrameBuffer(tPAudioFrame));
        }
    };
    private com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback mNativeVideoFrameCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.4
        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback
        public void onVideoFrame(com.tencent.thumbplayer.core.common.TPVideoFrame tPVideoFrame, int i17) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onVideoFrameOut(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPVideoFrameBuffer(tPVideoFrame));
        }
    };
    private com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback mNativeSubtitleFrameCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.5
        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback
        public void onSubtitleFrame(com.tencent.thumbplayer.core.common.TPSubtitleFrame tPSubtitleFrame, int i17) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onSubtitleFrameOut(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPSubtitleFrameBuffer(tPSubtitleFrame));
        }
    };
    private com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback mNativePostProcessFrameCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.6
        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback
        public com.tencent.thumbplayer.core.common.TPPostProcessFrame onPostProcessFrame(com.tencent.thumbplayer.core.common.TPPostProcessFrame tPPostProcessFrame, int i17) {
            com.tencent.thumbplayer.api.TPPostProcessFrameBuffer convert2TPPostProcessFrameBuffer = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPPostProcessFrameBuffer(tPPostProcessFrame);
            convert2TPPostProcessFrameBuffer.eventFlag = i17;
            int i18 = tPPostProcessFrame.mediaType;
            if (i18 == 0) {
                return com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPPostProcessFrame(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onVideoProcessFrameOut(convert2TPPostProcessFrameBuffer));
            }
            if (i18 == 1) {
                return com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPPostProcessFrame(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onAudioProcessFrameOut(convert2TPPostProcessFrameBuffer));
            }
            return null;
        }
    };
    private com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback mNativeDemuxerCallback = new com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.7
        @Override // com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback
        public com.tencent.thumbplayer.core.demuxer.TPNativeRemoteSdpInfo onSdpExchange(java.lang.String str, int i17) {
            return com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPNativeRemoteSdpInfo(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onSdpExchange(str, i17));
        }
    };
    private com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback mNativeEventRecordCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.8
        @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback
        public void onDrmInfo(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams) {
            if (tPPlayerDrmParams == null) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.error("Native DrmInfo is null!");
                return;
            }
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.info("onDrmInfo");
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onDrmInfo(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPDrmInfo(tPPlayerDrmParams));
        }
    };

    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer> mWeakRef;

        public EventHandler(android.os.Looper looper, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer tPThumbPlayer) {
            super(looper);
            this.mWeakRef = new java.lang.ref.WeakReference<>(tPThumbPlayer);
        }

        private void handleOnAsyncCallResult(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnASyncCallResultInfo onASyncCallResultInfo) {
            int i17 = onASyncCallResultInfo.callType;
            if (i17 == 1) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleOnPrepared();
            } else if (i17 != 2) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleCommonASyncCallResult(onASyncCallResultInfo);
            } else {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleOnSeekComplete();
            }
        }

        private void handleOnDetailInfo(com.tencent.thumbplayer.core.common.TPDetailInfo tPDetailInfo) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onDetailInfo(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPPlayerDetailInfo(tPDetailInfo));
        }

        private void handleOnError(@com.tencent.thumbplayer.api.TPCommonEnum.NativeErrorType int i17, int i18) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onError(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapErrorType.class, i17), i18, 0L, 0L);
        }

        private void handleOnInfoLong(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoLongInfo onInfoLongInfo) {
            int i17 = onInfoLongInfo.infoType;
            if (i17 == 154) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleOnComplete();
            } else if (i17 != 250) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleOnInfoLongNoConvertToListener(i17, onInfoLongInfo);
            } else {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleOnVideoSizeChanged(onInfoLongInfo.lParam1, onInfoLongInfo.lParam2);
            }
        }

        private void handleOnInfoObject(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoObjectInfo onInfoObjectInfo) {
            int i17 = onInfoObjectInfo.infoType;
            if (i17 != 502) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.handleOnInfoObjectNoConvertToListener(i17, onInfoObjectInfo);
            } else if (onInfoObjectInfo.objParam instanceof java.lang.String) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mSubtitleData.subtitleData = (java.lang.String) onInfoObjectInfo.objParam;
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mPlayerListenerReps.onSubtitleData(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mSubtitleData);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (this.mWeakRef.get() == null) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.error("mWeakRef is null");
                return;
            }
            int i17 = message.what;
            if (i17 == 1) {
                handleOnAsyncCallResult((com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnASyncCallResultInfo) message.obj);
                return;
            }
            if (i17 == 2) {
                handleOnInfoLong((com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoLongInfo) message.obj);
                return;
            }
            if (i17 == 3) {
                handleOnInfoObject((com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoObjectInfo) message.obj);
                return;
            }
            if (i17 == 4) {
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnErrorInfo onErrorInfo = (com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnErrorInfo) message.obj;
                handleOnError(onErrorInfo.msgType, onErrorInfo.errorCode);
            } else {
                if (i17 == 5) {
                    handleOnDetailInfo((com.tencent.thumbplayer.core.common.TPDetailInfo) message.obj);
                    return;
                }
                com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.mLogger.warn("message :" + message.what + "  not recognition");
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class OnASyncCallResultInfo {

        @com.tencent.thumbplayer.api.TPCommonEnum.NativeMsgInfo
        int callType;
        int errorCode;
        int errorType;
        long opaque;
    }

    /* loaded from: classes16.dex */
    public static class OnErrorInfo {
        int errorCode;
        int msgType;
    }

    /* loaded from: classes16.dex */
    public static class OnInfoLongInfo {
        int infoType;
        long lParam1;
        long lParam2;
    }

    /* loaded from: classes16.dex */
    public static class OnInfoObjectInfo {
        int infoType;
        java.lang.Object objParam;
    }

    public TPThumbPlayer(android.content.Context context, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mLogger = new com.tencent.thumbplayer.log.TPBaseLogger(tPLoggerContext, TAG) { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.1
            @Override // com.tencent.thumbplayer.log.TPBaseLogger, com.tencent.thumbplayer.log.ITPLogger
            public void error(java.lang.String str) {
                super.error("tp@" + com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.hashCode() + " " + str);
            }

            @Override // com.tencent.thumbplayer.log.TPBaseLogger, com.tencent.thumbplayer.log.ITPLogger
            public void info(java.lang.String str) {
                super.info("tp@" + com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.hashCode() + " " + str);
            }

            @Override // com.tencent.thumbplayer.log.TPBaseLogger, com.tencent.thumbplayer.log.ITPLogger
            public void warn(java.lang.String str) {
                super.warn("tp@" + com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.this.hashCode() + " " + str);
            }
        };
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = new com.tencent.thumbplayer.core.player.TPNativePlayer(context);
        this.mPlayer = tPNativePlayer;
        tPNativePlayer.setMessageCallback(this.mNativeMessageCallback);
        this.mPlayer.setAudioFrameCallback(this.mNativeAudioFrameCallback);
        this.mPlayer.setVideoFrameCallback(this.mNativeVideoFrameCallback);
        this.mPlayer.setSubtitleFrameCallback(this.mNativeSubtitleFrameCallback);
        this.mPlayer.setPostProcessFrameCallback(this.mNativePostProcessFrameCallback);
        this.mPlayer.setDemuxerCallback(this.mNativeDemuxerCallback);
        this.mPlayer.setEventRecordCallback(this.mNativeEventRecordCallback);
        this.mNativeInitConfig = new com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig();
        this.mPlayerListenerReps = new com.tencent.thumbplayer.adapter.TPPlayerBaseListeners(this.mLogger.getTag());
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.EventHandler(myLooper, this);
        } else {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.EventHandler(mainLooper, this);
            } else {
                this.mEventHandler = null;
            }
        }
        java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker> concurrentSkipListMap = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.stackMap;
        if (concurrentSkipListMap.size() > 100) {
            concurrentSkipListMap.remove(concurrentSkipListMap.firstEntry().getKey());
        }
        java.lang.String stack = tPLoggerContext.getStack();
        java.lang.String commentScene = tPLoggerContext.getCommentScene();
        int hashCode = hashCode();
        concurrentSkipListMap.put(java.lang.Integer.valueOf(hashCode), new com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker(hashCode, this, commentScene, stack));
        com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = this.mLogger;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableStackTrace add:");
        sb6.append(hashCode);
        sb6.append(" size:");
        sb6.append(concurrentSkipListMap.size());
        sb6.append(" scene:");
        sb6.append(commentScene);
        sb6.append(" stack:");
        sb6.append(com.tencent.thumbplayer.config.TPPlayerConfig.enableStackTrace ? stack : "disabled");
        tPBaseLogger.warn(sb6.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCommonASyncCallResult(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnASyncCallResultInfo onASyncCallResultInfo) {
        this.mPlayerListenerReps.onInfo(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapMsgInfo.class, onASyncCallResultInfo.callType), onASyncCallResultInfo.errorType, onASyncCallResultInfo.errorCode, java.lang.Long.valueOf(onASyncCallResultInfo.opaque));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnComplete() {
        this.mPlayerListenerReps.onCompletion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnInfoLongNoConvertToListener(@com.tencent.thumbplayer.api.TPCommonEnum.NativeErrorType int i17, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoLongInfo onInfoLongInfo) {
        int tPIntValue;
        long j17;
        int tPIntValue2 = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapMsgInfo.class, i17);
        if (tPIntValue2 < 0) {
            this.mLogger.warn("msgType:" + i17 + ", cannot convert to thumbPlayer Info");
            return;
        }
        long j18 = onInfoLongInfo.lParam1;
        long j19 = onInfoLongInfo.lParam2;
        if (tPIntValue2 == 203) {
            tPIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioDecoderType.class, (int) j18);
        } else {
            if (tPIntValue2 != 204) {
                this.mLogger.warn("unhandled thumbPlayerInfo=" + tPIntValue2);
                j17 = j18;
                this.mPlayerListenerReps.onInfo(tPIntValue2, j17, j19, null);
            }
            tPIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoDecoderType.class, (int) j18);
        }
        j17 = tPIntValue;
        this.mPlayerListenerReps.onInfo(tPIntValue2, j17, j19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnInfoObjectNoConvertToListener(@com.tencent.thumbplayer.api.TPCommonEnum.NativeMsgInfo int i17, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoObjectInfo onInfoObjectInfo) {
        java.lang.Object obj;
        java.lang.Object convert2TPVideoCropInfo;
        java.lang.Object obj2;
        int tPIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapMsgInfo.class, i17);
        if (tPIntValue < 0 || (obj = onInfoObjectInfo.objParam) == null) {
            this.mLogger.warn("msgType:" + i17 + ", cannot convert to thumbPlayer Info");
            return;
        }
        if (tPIntValue != 500) {
            if (tPIntValue == 602) {
                if (obj != null) {
                    convert2TPVideoCropInfo = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPBufferDurationInfo((com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.BufferDurationInfo) obj);
                }
                obj2 = obj;
            } else if (tPIntValue == 502) {
                convert2TPVideoCropInfo = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPMediaCodecInfo((com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.MediaCodecInfo) obj);
            } else if (tPIntValue == 503) {
                if (obj != null) {
                    convert2TPVideoCropInfo = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPVideoSeiInfo((com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoSeiInfo) obj);
                }
                obj2 = obj;
            } else if (tPIntValue != 505) {
                if (tPIntValue == 506) {
                    obj = (java.lang.String) obj;
                    this.mLogger.info("TP_PLAYER_INFO_OBJECT_SUBTITLE_NOTE:" + obj);
                }
                obj2 = obj;
            } else {
                convert2TPVideoCropInfo = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPMediaDrmInfo((com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.MediaDrmInfo) obj);
            }
            this.mPlayerListenerReps.onInfo(tPIntValue, 0L, 0L, obj2);
        }
        convert2TPVideoCropInfo = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPVideoCropInfo((com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoCropInfo) obj);
        obj2 = convert2TPVideoCropInfo;
        this.mPlayerListenerReps.onInfo(tPIntValue, 0L, 0L, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnPrepared() {
        this.mPlayerListenerReps.onPrepared();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnSeekComplete() {
        this.mPlayerListenerReps.onSeekComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnVideoSizeChanged(long j17, long j18) {
        this.mPlayerListenerReps.onVideoSizeChanged(j17, j18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isObjectInfoTypeVerbose(int i17) {
        return sVerboseObjectInfoTypes.contains(java.lang.Integer.valueOf(i17));
    }

    private com.tencent.thumbplayer.api.TPProgramInfo programInfoConvert(com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo tPNativePlayerProgramInfo) {
        if (tPNativePlayerProgramInfo == null) {
            return null;
        }
        com.tencent.thumbplayer.api.TPProgramInfo tPProgramInfo = new com.tencent.thumbplayer.api.TPProgramInfo();
        tPProgramInfo.url = tPNativePlayerProgramInfo.url;
        tPProgramInfo.bandwidth = tPNativePlayerProgramInfo.bandwidth;
        tPProgramInfo.resolution = tPNativePlayerProgramInfo.resolution;
        tPProgramInfo.programId = tPNativePlayerProgramInfo.programId;
        tPProgramInfo.actived = tPNativePlayerProgramInfo.actived;
        return tPProgramInfo;
    }

    private void setPlayerInitConfigWithParamBoolean(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping boolean is invalid, not found in array, id: " + i17);
            return;
        }
        if (convertToNativeOptionalId.getOptionalIDType() == 3) {
            this.mNativeInitConfig.setBool(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamBoolean.value);
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerInitConfigWithParamFloat(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat optionalParamFloat) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping float is invalid, not found in array, id: " + i17);
            return;
        }
        if (7 == convertToNativeOptionalId.getOptionalIDType()) {
            this.mNativeInitConfig.setFloat(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamFloat.value);
            return;
        }
        this.mLogger.error("optionID:" + convertToNativeOptionalId.getNativePlayerOptionalID() + " is not float");
    }

    private void setPlayerInitConfigWithParamInt(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamInt optionalParamInt) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId == null) {
            this.mLogger.error("player optionalIdMapping int is invalid, not found in array, id: " + i17);
            return;
        }
        if (4 == convertToNativeOptionalId.getOptionalIDType()) {
            this.mNativeInitConfig.setInt(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamInt.value);
            return;
        }
        this.mLogger.error("optionID:" + convertToNativeOptionalId.getNativePlayerOptionalID() + " is not int");
    }

    private void setPlayerInitConfigWithParamLong(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong optionalParamLong) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping long is invalid, not found in array, id: " + i17);
            return;
        }
        int optionalIDType = convertToNativeOptionalId.getOptionalIDType();
        if (optionalIDType == 1) {
            this.mNativeInitConfig.setLong(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamLong.value);
            return;
        }
        if (optionalIDType == 3) {
            this.mNativeInitConfig.setBool(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamLong.value > 0);
            return;
        }
        if (optionalIDType == 4) {
            this.mNativeInitConfig.setInt(convertToNativeOptionalId.getNativePlayerOptionalID(), (int) optionalParamLong.value);
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerInitConfigWithParamObject(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamObject optionalParamObject) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId == null) {
            this.mLogger.error("convertToNativeOptionalId failed, key: " + i17);
            return;
        }
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping object is invalid, not found in array, id: " + i17);
            return;
        }
        int nativePlayerOptionalID = convertToNativeOptionalId.getNativePlayerOptionalID();
        if (nativePlayerOptionalID == 126) {
            this.mNativeInitConfig.setObject(convertToNativeOptionalId.getNativePlayerOptionalID(), com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPNativeBufferConfig((com.tencent.thumbplayer.api.TPJitterBufferConfig) optionalParamObject.objectValue));
        } else {
            if (nativePlayerOptionalID == 414) {
                this.mNativeInitConfig.setObject(convertToNativeOptionalId.getNativePlayerOptionalID(), com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convertToTPNativeAudioAttributes((com.tencent.thumbplayer.api.TPAudioAttributes) optionalParamObject.objectValue));
                return;
            }
            this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        }
    }

    private void setPlayerInitConfigWithParamQueueInt(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueInt optionalParamQueueInt) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping queue_int is invalid, not found in array, id: " + i17);
            return;
        }
        int[] iArr = optionalParamQueueInt.queueValue;
        if (iArr == null || iArr.length == 0) {
            this.mLogger.error("queueint params is empty in" + i17);
            return;
        }
        if (convertToNativeOptionalId.getOptionalIDType() == 5) {
            for (int i18 = 0; i18 < optionalParamQueueInt.queueValue.length; i18++) {
                this.mNativeInitConfig.addQueueInt(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamQueueInt.queueValue[i18]);
            }
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerInitConfigWithParamQueueString(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueString optionalParamQueueString) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping queue_string is invalid, not found in array, id: " + i17);
            return;
        }
        java.lang.String[] strArr = optionalParamQueueString.queueValue;
        if (strArr == null || strArr.length == 0) {
            this.mLogger.error("queue String params is empty in" + i17);
            return;
        }
        if (convertToNativeOptionalId.getOptionalIDType() == 6) {
            for (int i18 = 0; i18 < optionalParamQueueString.queueValue.length; i18++) {
                this.mNativeInitConfig.addQueueString(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamQueueString.queueValue[i18]);
            }
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerInitConfigWithParamString(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString optionalParamString) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId == null) {
            this.mLogger.error("player optionalIdMapping int is invalid, not found in array, id: " + i17);
            return;
        }
        if (2 == convertToNativeOptionalId.getOptionalIDType()) {
            this.mNativeInitConfig.setString(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamString.value);
            return;
        }
        this.mLogger.error("optionID:" + convertToNativeOptionalId.getNativePlayerOptionalID() + " is not string");
    }

    private void setPlayerOptionWithParamBoolean(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping string is invalid, not found in array, id: " + i17);
            return;
        }
        if (convertToNativeOptionalId.getOptionalIDType() == 3) {
            this.mPlayer.setOptionLong(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamBoolean.value ? 1L : 0L, 0L);
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerOptionWithParamLong(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong optionalParamLong) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping long is invalid, not found in array, id: " + i17);
            return;
        }
        int optionalIDType = convertToNativeOptionalId.getOptionalIDType();
        if (optionalIDType == 1 || optionalIDType == 3 || optionalIDType == 4) {
            this.mPlayer.setOptionLong(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamLong.value, optionalParamLong.param1);
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerOptionWithParamObject(int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamObject optionalParamObject) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId == null) {
            this.mLogger.error("player optionaIdMapping object is invalid, not found in array, id: " + i17);
            return;
        }
        if (convertToNativeOptionalId.getNativePlayerOptionalID() == 1001) {
            this.mPlayer.setOptionObject(convertToNativeOptionalId.getNativePlayerOptionalID(), com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPNativeSubtitleRenderParams((com.tencent.thumbplayer.api.TPSubtitleRenderModel) optionalParamObject.objectValue));
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerOptionWithParamString(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString optionalParamString) {
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeOptionalId(i17);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping string is invalid, not found in array, id: " + i17);
            return;
        }
        if (convertToNativeOptionalId.getOptionalIDType() == 2) {
            this.mPlayer.setOptionObject(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamString.value);
            return;
        }
        this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void throwExceptionIfPlayerReleased() {
        if (this.mPlayer == null) {
            throw new java.lang.IllegalStateException("player has release");
        }
    }

    private com.tencent.thumbplayer.api.TPTrackInfo trackInfoConvert(com.tencent.thumbplayer.core.common.TPMediaTrackInfo tPMediaTrackInfo) {
        com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = new com.tencent.thumbplayer.api.TPTrackInfo();
        tPTrackInfo.name = tPMediaTrackInfo.trackName;
        tPTrackInfo.trackType = tPMediaTrackInfo.trackType;
        int i17 = tPMediaTrackInfo.contianerType;
        tPTrackInfo.containerType = i17;
        if (i17 == 1) {
            com.tencent.thumbplayer.api.TPHlsTag tPHlsTag = tPTrackInfo.hlsTag;
            com.tencent.thumbplayer.core.common.TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfo.hlsTag;
            tPHlsTag.name = tPMediaTrackHlsTag.name;
            tPHlsTag.bandwidth = tPMediaTrackHlsTag.bandwidth;
            tPHlsTag.resolution = tPMediaTrackHlsTag.resolution;
            tPHlsTag.framerate = tPMediaTrackHlsTag.framerate;
            tPHlsTag.codecs = tPMediaTrackHlsTag.codecs;
            tPHlsTag.groupId = tPMediaTrackHlsTag.groupId;
            tPHlsTag.language = tPMediaTrackHlsTag.language;
        } else if (i17 == 2) {
            tPTrackInfo.dashFormat = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPDashFormat(tPMediaTrackInfo.dashFormat);
        }
        tPTrackInfo.isExclusive = tPMediaTrackInfo.isExclusive;
        tPTrackInfo.isSelected = tPMediaTrackInfo.isSelected;
        tPTrackInfo.isInternal = tPMediaTrackInfo.isInternal;
        return tPTrackInfo;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        addAudioTrackSource(str, null, str2, list);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        addSubtitleSource(str, null, str2, str3);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        this.mLogger.info("captureVideo, params" + tPCaptureParams);
        if (this.mImageGenerator == null) {
            tPCaptureCallBack.onCaptureVideoFailed(com.tencent.thumbplayer.core.common.TPGeneralError.UNMATCHED_STATE);
            return;
        }
        com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams = new com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams();
        tPImageGeneratorParams.width = tPCaptureParams.width;
        tPImageGeneratorParams.height = tPCaptureParams.height;
        tPImageGeneratorParams.format = tPCaptureParams.format;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
        this.mImageGenerator.generateImageAsyncAtTime(getCurrentPositionMs(), tPImageGeneratorParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        this.mLogger.info("configBufferDurationAsync");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.configBufferDurationAsync(i17, j17, j18, j19);
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void deselectTrack(int i17, long j17) {
        this.mLogger.info("selectTrack");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.deselectTrackAsync(i17, j17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getAutoExpendBufferCount() {
        this.mLogger.info("getAutoExpendBufferCount");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getAutoExpendBufferCount();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadDurationPosMs() {
        this.mLogger.info("getBufferIOMaxReadDurationPosMs");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferIOMaxReadDurationPosMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadFileOffset() {
        this.mLogger.info("getBufferIOMaxReadFileOffset");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferIOMaxReadFileOffset();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteDurationPosMs() {
        this.mLogger.info("getBufferIOMaxWriteDurationPosMs");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferIOMaxWriteDurationPosMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteFileOffset() {
        this.mLogger.info("getBufferIOMaxWriteFileOffset");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferIOMaxWriteFileOffset();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedDurationMs() {
        this.mLogger.info("getBufferedDuration");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferedDurationMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedSize() {
        this.mLogger.info("getBufferedSize");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferedSize();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getCurrentPositionMs() {
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getCurrentPositionMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDemuxerOffsetInFile() {
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDemuxerOffsetInFile();
        }
        this.mLogger.info("player has released, return -1");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDurationMs() {
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDurationMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17) {
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getDynamicStatisticParams(z17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getGeneralPlayFlowParams();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPlayableDurationMs() {
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferedDurationMs() + this.mPlayer.getCurrentPositionMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo() {
        this.mLogger.info("getProgramInfo");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        com.tencent.thumbplayer.api.TPProgramInfo[] tPProgramInfoArr = null;
        if (tPNativePlayer == null) {
            this.mLogger.info("player has released, return 0");
            return null;
        }
        com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo[] programInfo = tPNativePlayer.getProgramInfo();
        if (programInfo != null && programInfo.length >= 1) {
            tPProgramInfoArr = new com.tencent.thumbplayer.api.TPProgramInfo[programInfo.length];
            for (int i17 = 0; i17 < programInfo.length; i17++) {
                tPProgramInfoArr[i17] = programInfoConvert(programInfo[i17]);
            }
        }
        return tPProgramInfoArr;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPropertyLong(int i17) {
        this.mLogger.info("getPropertyLong:" + i17);
        throwExceptionIfPlayerReleased();
        int nativeIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapPropertyId.class, i17);
        if (nativeIntValue >= 0) {
            return this.mPlayer.getPropertyLong(nativeIntValue);
        }
        this.mLogger.warn("paramId not found, return -1");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public java.lang.String getPropertyString(int i17) {
        this.mLogger.info("getPropertyString:" + i17);
        throwExceptionIfPlayerReleased();
        try {
            int nativeIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapPropertyId.class, i17);
            if (nativeIntValue >= 0) {
                return this.mPlayer.getPropertyString(nativeIntValue);
            }
            this.mLogger.warn("getPropertyString, tpToNativeValue(TPNativeKeyMap.MapPropertyId.class," + i17 + "), return" + nativeIntValue);
            return "";
        } catch (java.lang.IllegalArgumentException unused) {
            this.mLogger.warn("paramId not found, return");
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        this.mLogger.info("getTrackInfo");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        com.tencent.thumbplayer.api.TPTrackInfo[] tPTrackInfoArr = null;
        if (tPNativePlayer == null) {
            this.mLogger.info("player has released, return 0");
            return null;
        }
        com.tencent.thumbplayer.core.common.TPMediaTrackInfo[] trackInfo = tPNativePlayer.getTrackInfo();
        if (trackInfo != null && trackInfo.length >= 1) {
            tPTrackInfoArr = new com.tencent.thumbplayer.api.TPTrackInfo[trackInfo.length];
            for (int i17 = 0; i17 < trackInfo.length; i17++) {
                tPTrackInfoArr[i17] = trackInfoConvert(trackInfo[i17]);
            }
        }
        return tPTrackInfoArr;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoHeight() {
        this.mLogger.info("getVideoHeight");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoHeight();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoWidth() {
        this.mLogger.info("getVideoWidth");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoWidth();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void pause() {
        this.mLogger.info("pause");
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.pause() != 0) {
            throw new java.lang.IllegalStateException("pause failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepare() {
        this.mLogger.info("prepare");
        throwExceptionIfPlayerReleased();
        this.mPlayer.setInitConfig(this.mNativeInitConfig);
        if (this.mPlayer.prepare() != 0) {
            throw new java.lang.IllegalStateException("prepare failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepareAsync() {
        this.mLogger.info("prepareAsync");
        throwExceptionIfPlayerReleased();
        this.mPlayer.setInitConfig(this.mNativeInitConfig);
        if (this.mPlayer.prepareAsync() != 0) {
            throw new java.lang.IllegalStateException("prepareAsync failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void release() {
        this.mLogger.info("release");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            tPNativePlayer.release();
            this.mPlayer = null;
            java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker> concurrentSkipListMap = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.stackMap;
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker remove = concurrentSkipListMap.remove(java.lang.Integer.valueOf(hashCode()));
            java.lang.String str = remove == null ? "null" : remove.scene;
            java.lang.String str2 = remove != null ? remove.stack : "null";
            com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = this.mLogger;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableStackTrace remove:");
            sb6.append(hashCode());
            sb6.append(" size:");
            sb6.append(concurrentSkipListMap.size());
            sb6.append(" scene:");
            sb6.append(str);
            sb6.append(" stack:");
            if (!com.tencent.thumbplayer.config.TPPlayerConfig.enableStackTrace) {
                str2 = "disabled";
            }
            sb6.append(str2);
            tPBaseLogger.warn(sb6.toString());
        }
        com.tencent.thumbplayer.adapter.player.ITPCapture iTPCapture = this.mImageGenerator;
        if (iTPCapture != null) {
            iTPCapture.release();
            this.mImageGenerator = null;
        }
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.mEventHandler = null;
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void reset() {
        this.mLogger.info("reset");
        if (this.mPlayer == null) {
            this.mLogger.warn("reset, player has released.");
            return;
        }
        this.mLogger.info("reset before");
        this.mPlayer.reset();
        com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
        this.mLogger.info("reset after");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17) {
        this.mLogger.info("seekTo:" + i17);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.seekToAsync(i17, 1, 0L) == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("seek to position:" + i17 + " failed!!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectProgram(int i17, long j17) {
        this.mLogger.info("selectProgram, programIndex:" + i17);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.selectProgramAsync(i17, j17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectTrack(int i17, long j17) {
        this.mLogger.info("selectTrack");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.selectTrackAsync(i17, j17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioGainRatio(float f17) {
        this.mLogger.info("setAudioGainRatio:" + f17);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setAudioVolume(f17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioNormalizeVolumeParams(java.lang.String str) {
        this.mLogger.info("setAudioNormalizeVolumeParams:" + str);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setAudioNormalizeVolumeParams(str);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str) {
        this.mLogger.info("setDataSource: " + str);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.setDataSource(str) == 0) {
            this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(str);
            return;
        }
        throw new java.lang.IllegalStateException("setDataSource url failed!!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17) {
        this.mLogger.info("setLoopback:" + z17);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setLoopback(z17, 0L, -1L);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioPcmOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        this.mPlayerListenerReps.setOnAudioPcmOutListener(iOnAudioPcmOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        this.mPlayerListenerReps.setOnAudioProcessFrameListener(iOnAudioProcessOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnCompletionListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mPlayerListenerReps.setOnCompletionListener(iOnCompletionListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDemuxerListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
        this.mPlayerListenerReps.setOnDemuxerListener(iOnDemuxerListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDetailInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
        this.mPlayerListenerReps.setOnDetailInfoListener(iOnDetailInfoListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnErrorListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mPlayerListenerReps.setOnErrorListener(iOnErrorListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnEventRecordListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
        this.mPlayerListenerReps.setOnEventRecordListener(iOnEventRecordListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mPlayerListenerReps.setOnInfoListener(iOnInfoListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnPreparedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        this.mPlayerListenerReps.setOnPreparedListener(iOnPreparedListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSeekCompleteListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.mPlayerListenerReps.setOnSeekCompleteListener(iOnSeekCompleteListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSubtitleDataListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.mPlayerListenerReps.setOnSubtitleDataListener(iOnSubtitleDataListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.mPlayerListenerReps.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.mPlayerListenerReps.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        this.mPlayerListenerReps.setOnVideoProcessFrameListener(iOnVideoProcessOutListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mPlayerListenerReps.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOutputMute(boolean z17) {
        this.mLogger.info("setOutputMute:" + z17);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setAudioMute(z17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySharpenSwitch() {
        this.mLogger.info("setPlaySharpenSwitch");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setPlaySharpenSwitch();
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySpeedRatio(float f17) {
        this.mLogger.info("setPlaySpeedRatio:" + f17);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setPlaybackRate(f17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        this.mLogger.info("setPlayerOptionalParam:" + tPOptionalParam);
        if (this.mPlayer == null) {
            this.mLogger.warn("player has released, return");
            return;
        }
        if (tPOptionalParam.getParamType() == 1) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamBoolean(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
                return;
            } else {
                setPlayerOptionWithParamBoolean(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 2) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamLong(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
                return;
            } else {
                setPlayerOptionWithParamLong(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 6) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamFloat(tPOptionalParam.getKey(), tPOptionalParam.getParamFloat());
                return;
            }
            return;
        }
        if (tPOptionalParam.getParamType() == 8) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamInt(tPOptionalParam.getKey(), tPOptionalParam.getParamInt());
                return;
            }
            return;
        }
        if (tPOptionalParam.getParamType() == 3) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamString(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
                return;
            } else {
                setPlayerOptionWithParamString(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 4) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamQueueInt(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueInt());
            }
        } else if (tPOptionalParam.getParamType() == 5) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamQueueString(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueString());
            }
        } else if (tPOptionalParam.getParamType() != 7) {
            this.mLogger.warn("optionalParam param type is unknown, return");
        } else if (tPOptionalParam.getKey() < 500) {
            setPlayerInitConfigWithParamObject(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
        } else {
            setPlayerOptionWithParamObject(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17) {
        com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = this.mLogger;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface, surface is null ? : ");
        sb6.append(surface == null);
        tPBaseLogger.info(sb6.toString());
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (tPNativePlayer.setVideoSurfaceWithType(surface, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeSurfaceType(i17)) != 0) {
            throw new java.lang.IllegalStateException("setSurface failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = this.mLogger;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SurfaceHolder, surfaceHolder is null ? : ");
        sb6.append(surfaceHolder == null);
        tPBaseLogger.info(sb6.toString());
        if (this.mPlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (surfaceHolder != null && surfaceHolder.getSurface() == null) {
            this.mLogger.error("SurfaceHolder，err.");
        } else {
            if (this.mPlayer.setVideoSurface(surfaceHolder == null ? null : surfaceHolder.getSurface()) != 0) {
                throw new java.lang.IllegalStateException("setSurface failed!!");
            }
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void start() {
        this.mLogger.info("start");
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.start() != 0) {
            throw new java.lang.IllegalStateException("start failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void stop() {
        this.mLogger.info("stop");
        throwExceptionIfPlayerReleased();
        this.mLogger.info("stop before");
        int stop = this.mPlayer.stop();
        this.mLogger.info("stop after");
        if (stop != 0) {
            throw new java.lang.IllegalStateException("stop failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        this.mLogger.info("switchDefinition url:" + str + " opaque:" + j17);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.switchDefinitionAsync(str, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode.class, i17), j17) == 0) {
            com.tencent.thumbplayer.adapter.player.ITPCapture iTPCapture = this.mImageGenerator;
            if (iTPCapture != null) {
                iTPCapture.release();
                this.mImageGenerator = null;
            }
            this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(str);
            return;
        }
        throw new java.lang.IllegalStateException("switchDefinition in invalid state");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchHdrModeWithSurface(android.view.Surface surface, int i17, int i18) {
        com.tencent.thumbplayer.log.TPBaseLogger tPBaseLogger = this.mLogger;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface, surface is null ? : ");
        sb6.append(surface == null);
        tPBaseLogger.info(sb6.toString());
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (tPNativePlayer.switchHdrModeWithSurface(surface, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.convertToNativeSurfaceType(i17), i18) != 0) {
            throw new java.lang.IllegalStateException("setSurface failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mLogger.updateContext(new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG));
        if (tPLoggerContext != null) {
            this.mPlayerListenerReps.updateTag(this.mLogger.getTPLoggerContext().getTag());
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        this.mLogger.info("addAudioTrackSource");
        if (this.mPlayer == null) {
            this.mLogger.warn("player has released, return");
            return;
        }
        com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo();
        tPAudioTrackInfo.audioTrackUrl = str;
        tPAudioTrackInfo.paramData = list;
        com.tencent.thumbplayer.adapter.TPPlayerBaseListeners tPPlayerBaseListeners = this.mPlayerListenerReps;
        if (tPPlayerBaseListeners != null) {
            tPPlayerBaseListeners.onInfo(1012, 0L, 0L, tPAudioTrackInfo);
        }
        if (android.text.TextUtils.isEmpty(tPAudioTrackInfo.proxyUrl)) {
            this.mPlayer.addAudioTrackSource(tPAudioTrackInfo.audioTrackUrl, str2, tPAudioTrackInfo.httpHeader);
        } else {
            this.mPlayer.addAudioTrackSource(tPAudioTrackInfo.proxyUrl, str2, tPAudioTrackInfo.httpHeader);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        this.mLogger.info("addSubtitleSource");
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.addSubtitleTrackSource(str, str3, map);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int i18) {
        this.mLogger.info("seekTo:" + i17 + " mode:" + i18);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.seekToAsync(i17, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSeekMode.class, i18), 0L) == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("seek to position:" + i17 + " failed!!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17, long j17, long j18) {
        this.mLogger.info("setLoopback:" + z17 + " loopStartPositionMs:" + j17 + " loopEndPositionMs:" + j18);
        com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (tPNativePlayer.setLoopback(z17, j17, j18) != 0) {
            throw new java.lang.IllegalStateException("set loopback failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mLogger.info("setDataSource: " + str);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.setDataSource(str, map) == 0) {
            this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(str);
            return;
        }
        throw new java.lang.IllegalStateException("setDataSource url and header failed!!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            int detachFd = parcelFileDescriptor.detachFd();
            android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(detachFd);
            int detachFd2 = fromFd.detachFd();
            fromFd.close();
            parcelFileDescriptor.close();
            this.mLogger.info("setDataSource: " + parcelFileDescriptor + ", playFd:" + detachFd + ", captureFd: " + detachFd2);
            throwExceptionIfPlayerReleased();
            if (this.mPlayer.setDataSource(detachFd, 0L, 0L) == 0) {
                this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(detachFd2);
                return;
            }
            throw new java.lang.IllegalStateException("setDataSource url pfd failed!!");
        }
        throw new java.lang.IllegalStateException("setDataSource url pfd is null!!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        this.mLogger.info("switchDefinition url:" + str + "httpHeader:" + map + " opaque:" + j17);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.switchDefinitionAsync(str, map, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode.class, i17), j17) == 0) {
            com.tencent.thumbplayer.adapter.player.ITPCapture iTPCapture = this.mImageGenerator;
            if (iTPCapture != null) {
                iTPCapture.release();
                this.mImageGenerator = null;
            }
            this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(str);
            return;
        }
        throw new java.lang.IllegalStateException("switchDefinition in invalid state");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        int switchDefinitionAsync;
        this.mLogger.info("switchDefinition mediaAsset:" + iTPMediaAsset + " opaque:" + j17);
        throwExceptionIfPlayerReleased();
        if (iTPMediaAsset != null) {
            int nativeIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode.class, i17);
            java.util.Map<java.lang.String, java.lang.String> httpHeader = iTPMediaAsset.getHttpHeader();
            if (httpHeader == null) {
                switchDefinitionAsync = this.mPlayer.switchDefinitionAsync(iTPMediaAsset.getUrl(), nativeIntValue, j17);
            } else {
                switchDefinitionAsync = this.mPlayer.switchDefinitionAsync(iTPMediaAsset.getUrl(), httpHeader, nativeIntValue, j17);
            }
            if (switchDefinitionAsync == 0) {
                this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(iTPMediaAsset.getUrl());
                return;
            }
            throw new java.lang.IllegalStateException("switchDefinition in invalid state");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            int detachFd = assetFileDescriptor.getParcelFileDescriptor().detachFd();
            long startOffset = assetFileDescriptor.getStartOffset();
            long length = assetFileDescriptor.getLength();
            android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(detachFd);
            int detachFd2 = fromFd.detachFd();
            fromFd.close();
            assetFileDescriptor.close();
            this.mLogger.info("setDataSource: " + assetFileDescriptor + ", playFd: " + detachFd + ", offset: " + startOffset + ", length: " + length + ", captureFd: " + detachFd2);
            throwExceptionIfPlayerReleased();
            if (this.mPlayer.setDataSource(detachFd, startOffset, length) == 0) {
                this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(detachFd2, startOffset, length);
                return;
            }
            throw new java.lang.IllegalStateException("setDataSource url afd failed!!");
        }
        throw new java.lang.IllegalStateException("setDataSource url afd is null!!");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        int dataSource;
        this.mLogger.info("setDataSource: " + iTPMediaAsset);
        throwExceptionIfPlayerReleased();
        if (iTPMediaAsset != null) {
            java.lang.String url = iTPMediaAsset.getUrl();
            java.util.Map<java.lang.String, java.lang.String> httpHeader = iTPMediaAsset.getHttpHeader();
            if (httpHeader == null) {
                dataSource = this.mPlayer.setDataSource(url);
            } else {
                dataSource = this.mPlayer.setDataSource(url, httpHeader);
            }
            if (dataSource == 0) {
                this.mImageGenerator = new com.tencent.thumbplayer.caputure.TPThumbCapture(url);
                return;
            }
            throw new java.lang.IllegalStateException("setDataSource mediaAsset failed!!");
        }
        throw new java.lang.IllegalStateException("media asset is null!");
    }
}
