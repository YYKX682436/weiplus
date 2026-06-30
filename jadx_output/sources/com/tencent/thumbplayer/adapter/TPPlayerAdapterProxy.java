package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlayerAdapterProxy implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String METHOD_NAME_PAUSE = "pause";
    private static final java.lang.String METHOD_NAME_PREPARE = "prepareAsync";
    private static final java.lang.String METHOD_NAME_RELEASE = "release";
    private static final java.lang.String METHOD_NAME_RESET = "reset";
    private static final java.lang.String METHOD_NAME_SEEK_TO = "seekTo";
    private static final java.lang.String METHOD_NAME_SELECT_TRACK = "selectTrack";
    private static final java.lang.String METHOD_NAME_SET_ON_ERROR_LISTENER = "setOnErrorListener";
    private static final java.lang.String METHOD_NAME_SET_ON_INFO_LISTENER = "setOnInfoListener";
    private static final java.lang.String METHOD_NAME_SET_ON_PREPARED_LISTENER = "setOnPreparedListener";
    private static final java.lang.String METHOD_NAME_SET_ON_SEEK_COMPLETION_LISTENER = "setOnSeekCompleteListener";
    private static final java.lang.String METHOD_NAME_SET_PLAY_SPEED = "setPlaySpeedRatio";
    private static final java.lang.String METHOD_NAME_START = "start";
    private static final java.lang.String METHOD_NAME_STOP = "stop";
    private static final java.util.Map<java.lang.String, java.lang.Class> REPORT_LISTENER_CLASS_MAP;
    private static final java.lang.String TAG = "TPPlayerAdapterProxy";
    private com.tencent.thumbplayer.adapter.TPPlayerAdapter mPlayerAdapter;
    private java.lang.Object mPlayerAdapterInterfaceProxy;
    private com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.TPPlayerAdapterProxyListeners mPlayerAdapterProxyListeners;
    private com.tencent.thumbplayer.adapter.TPPlayerBaseListeners mPlayerBaseListeners = new com.tencent.thumbplayer.adapter.TPPlayerBaseListeners(TAG);
    private com.tencent.thumbplayer.tplayer.TPContext mPlayerContext;

    /* loaded from: classes16.dex */
    public class TPPlayerAdapterProxyListeners implements com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener {
        private TPPlayerAdapterProxyListeners() {
        }

        private void publishBufferingEndEvent(long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo());
        }

        private void publishBufferingStartEvent(long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingStartEventInfo());
        }

        private void publishSelectTrackEndEvent(long j17, long j18, java.lang.Object obj) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackEndEventInfo selectTrackEndEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackEndEventInfo();
            selectTrackEndEventInfo.setOpaque(((java.lang.Long) obj).longValue());
            selectTrackEndEventInfo.setErrorCode((int) j18);
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(selectTrackEndEventInfo);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener
        public void onDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.DrmEventInfo drmEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.DrmEventInfo();
            drmEventInfo.setDrmInfo(tPDrmInfo);
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(drmEventInfo);
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerBaseListeners.onDrmInfo(tPDrmInfo);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener
        public void onError(@com.tencent.thumbplayer.api.TPCommonEnum.TPErrorType int i17, int i18, long j17, long j18) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo playErrorEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo();
            playErrorEventInfo.setErrorCode(i18);
            playErrorEventInfo.setErrorType(i17);
            com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams generalPlayFlowParams = com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerAdapter.getGeneralPlayFlowParams();
            if (generalPlayFlowParams == null) {
                generalPlayFlowParams = new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams();
            }
            playErrorEventInfo.setGeneralPlayFlowParams(generalPlayFlowParams);
            com.tencent.thumbplayer.core.player.TPDynamicStatisticParams dynamicStatisticParams = com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerAdapter.getDynamicStatisticParams(false);
            if (dynamicStatisticParams == null) {
                dynamicStatisticParams = new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams();
            }
            playErrorEventInfo.setDynamicStatisticParams(dynamicStatisticParams);
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(playErrorEventInfo);
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerBaseListeners.onError(i17, i18, j17, j18);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener
        public void onInfo(int i17, long j17, long j18, java.lang.Object obj) {
            if (i17 == 4) {
                publishSelectTrackEndEvent(j17, j18, obj);
            } else if (i17 == 200) {
                publishBufferingStartEvent(j17, j18, obj);
            } else if (i17 == 201) {
                publishBufferingEndEvent(j17, j18, obj);
            }
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerBaseListeners.onInfo(i17, j17, j18, obj);
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener
        public void onPrepared() {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo();
            prepareEndEventInfo.setPlayerType(com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerAdapter.getPlayerType());
            prepareEndEventInfo.setDurationMs(com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerAdapter.getDurationMs());
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(prepareEndEventInfo);
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerBaseListeners.onPrepared();
        }

        @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener
        public void onSeekComplete() {
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekEndEventInfo());
            com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.this.mPlayerBaseListeners.onSeekComplete();
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        REPORT_LISTENER_CLASS_MAP = hashMap;
        hashMap.put(METHOD_NAME_SET_ON_PREPARED_LISTENER, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener.class);
        hashMap.put(METHOD_NAME_SET_ON_INFO_LISTENER, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener.class);
        hashMap.put(METHOD_NAME_SET_ON_ERROR_LISTENER, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener.class);
        hashMap.put(METHOD_NAME_SET_ON_SEEK_COMPLETION_LISTENER, com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener.class);
    }

    public TPPlayerAdapterProxy(com.tencent.thumbplayer.adapter.TPPlayerAdapter tPPlayerAdapter, com.tencent.thumbplayer.tplayer.TPContext tPContext) {
        com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.TPPlayerAdapterProxyListeners tPPlayerAdapterProxyListeners = new com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy.TPPlayerAdapterProxyListeners();
        this.mPlayerAdapterProxyListeners = tPPlayerAdapterProxyListeners;
        this.mPlayerAdapter = tPPlayerAdapter;
        this.mPlayerContext = tPContext;
        tPPlayerAdapter.setOnEventRecordListener(tPPlayerAdapterProxyListeners);
    }

    private static java.lang.Object dealReturn(java.lang.reflect.Method method) {
        java.lang.String name = method.getReturnType().getName();
        if (name.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
            return java.lang.Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        return null;
    }

    private void doHookListener(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.util.Map<java.lang.String, java.lang.Class> map = REPORT_LISTENER_CLASS_MAP;
        if (map.containsKey(method.getName())) {
            try {
                this.mPlayerBaseListeners.getClass().getMethod(method.getName(), map.get(method.getName())).invoke(this.mPlayerBaseListeners, objArr[0]);
                objArr[0] = this.mPlayerAdapterProxyListeners;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    private void doPublishEventIfNeed(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        name.getClass();
        char c17 = 65535;
        switch (name.hashCode()) {
            case -2055859787:
                if (name.equals(METHOD_NAME_PREPARE)) {
                    c17 = 0;
                    break;
                }
                break;
            case -906224877:
                if (name.equals(METHOD_NAME_SEEK_TO)) {
                    c17 = 1;
                    break;
                }
                break;
            case 3540994:
                if (name.equals(METHOD_NAME_STOP)) {
                    c17 = 2;
                    break;
                }
                break;
            case 106440182:
                if (name.equals(METHOD_NAME_PAUSE)) {
                    c17 = 3;
                    break;
                }
                break;
            case 108404047:
                if (name.equals(METHOD_NAME_RESET)) {
                    c17 = 4;
                    break;
                }
                break;
            case 109757538:
                if (name.equals(METHOD_NAME_START)) {
                    c17 = 5;
                    break;
                }
                break;
            case 205228463:
                if (name.equals(METHOD_NAME_SELECT_TRACK)) {
                    c17 = 6;
                    break;
                }
                break;
            case 218603354:
                if (name.equals(METHOD_NAME_SET_PLAY_SPEED)) {
                    c17 = 7;
                    break;
                }
                break;
            case 1090594823:
                if (name.equals("release")) {
                    c17 = '\b';
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                publishPrepareEvent(objArr);
                return;
            case 1:
                publishSeekToEvent(objArr);
                return;
            case 2:
                publishStopEvent(objArr);
                return;
            case 3:
                publishPauseEvent(objArr);
                return;
            case 4:
                publishResetEvent(objArr);
                return;
            case 5:
                publishStartEvent(objArr);
                return;
            case 6:
                publishSelectTrackEvent(objArr);
                return;
            case 7:
                publishSetPlaySpeedRatioEvent(objArr);
                return;
            case '\b':
                publishReleaseEvent(objArr);
                return;
            default:
                return;
        }
    }

    private void publishPauseEvent(java.lang.Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayPauseEventInfo());
    }

    private void publishPrepareEvent(java.lang.Object[] objArr) {
    }

    private void publishReleaseEvent(java.lang.Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayReleaseEventInfo());
    }

    private void publishResetEvent(java.lang.Object[] objArr) {
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayResetEventInfo playResetEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayResetEventInfo();
        com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams generalPlayFlowParams = this.mPlayerAdapter.getGeneralPlayFlowParams();
        if (generalPlayFlowParams == null) {
            generalPlayFlowParams = new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams();
        }
        playResetEventInfo.setGeneralPlayFlowParams(generalPlayFlowParams);
        com.tencent.thumbplayer.core.player.TPDynamicStatisticParams dynamicStatisticParams = this.mPlayerAdapter.getDynamicStatisticParams(false);
        if (dynamicStatisticParams == null) {
            dynamicStatisticParams = new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams();
        }
        playResetEventInfo.setDynamicStatisticParams(dynamicStatisticParams);
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(playResetEventInfo);
    }

    private void publishSeekToEvent(java.lang.Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekStartEventInfo());
    }

    private void publishSelectTrackEvent(java.lang.Object[] objArr) {
        com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackStartEventInfo selectTrackStartEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackStartEventInfo();
        selectTrackStartEventInfo.setTrackIndex(((java.lang.Integer) objArr[0]).intValue());
        selectTrackStartEventInfo.setOpaque(((java.lang.Long) objArr[1]).longValue());
        selectTrackStartEventInfo.setTrackInfo(this.mPlayerAdapter.getTrackInfo()[((java.lang.Integer) objArr[0]).intValue()]);
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(selectTrackStartEventInfo);
    }

    private void publishSetPlaySpeedRatioEvent(java.lang.Object[] objArr) {
        com.tencent.thumbplayer.event.TPPlayerEventInfo.SetPlaySpeedEventInfo setPlaySpeedEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.SetPlaySpeedEventInfo();
        setPlaySpeedEventInfo.setPlaySpeedRatio(((java.lang.Float) objArr[0]).floatValue());
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(setPlaySpeedEventInfo);
    }

    private void publishStartEvent(java.lang.Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo());
    }

    private void publishStopEvent(java.lang.Object[] objArr) {
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStopEventInfo playStopEventInfo = new com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStopEventInfo();
        com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams generalPlayFlowParams = this.mPlayerAdapter.getGeneralPlayFlowParams();
        if (generalPlayFlowParams == null) {
            generalPlayFlowParams = new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams();
        }
        playStopEventInfo.setGeneralPlayFlowParams(generalPlayFlowParams);
        com.tencent.thumbplayer.core.player.TPDynamicStatisticParams dynamicStatisticParams = this.mPlayerAdapter.getDynamicStatisticParams(false);
        if (dynamicStatisticParams == null) {
            dynamicStatisticParams = new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams();
        }
        playStopEventInfo.setDynamicStatisticParams(dynamicStatisticParams);
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(playStopEventInfo);
    }

    public synchronized java.lang.Object getProxyInstance() {
        if (this.mPlayerAdapterInterfaceProxy == null) {
            this.mPlayerAdapterInterfaceProxy = java.lang.reflect.Proxy.newProxyInstance(this.mPlayerAdapter.getClass().getClassLoader(), this.mPlayerAdapter.getClass().getInterfaces(), this);
        }
        return this.mPlayerAdapterInterfaceProxy;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        try {
            doPublishEventIfNeed(method, objArr);
            doHookListener(method, objArr);
            return method.invoke(this.mPlayerAdapter, objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            if (e17.getTargetException() != null) {
                throw e17.getTargetException();
            }
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + e17.toString());
            return dealReturn(method);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + th6.toString());
            return dealReturn(method);
        }
    }
}
