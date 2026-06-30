package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPReportController implements com.tencent.thumbplayer.api.reportv2.ITPExtendReportController, com.tencent.thumbplayer.event.ITPEventReceiver {
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP;
    private static final java.lang.String TAG = "TPReportController";
    private static final long mSyncWaitTimeOutMs = 500;
    private android.content.Context mContext;
    private com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter mReportInfoGetter = null;
    private android.os.HandlerThread mReportThread = null;
    private com.tencent.thumbplayer.tplayer.reportv2.TPReportController.TPReportEventHandler mEventHandler = null;
    private com.tencent.thumbplayer.tplayer.reportv2.ITPReporter mITPReporter = null;
    private com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams mReporterInitParams = new com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams();
    private com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter mPlayerInfoGetter = null;
    private com.tencent.thumbplayer.tplayer.reportv2.TPReportControllerState mControllerState = new com.tencent.thumbplayer.tplayer.reportv2.TPReportControllerState();
    private java.lang.Object mReleaseSyncObjectLock = new java.lang.Object();
    private com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener mProcessLifeCycleChangeListener = new com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener() { // from class: com.tencent.thumbplayer.tplayer.reportv2.TPReportController.1
        @Override // com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener
        public void onEvent(int i17) {
            int i18;
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.tplayer.reportv2.TPReportController.TAG, "ProcessLifeCycleChangeListener eventId: " + i17);
            if (i17 == 2) {
                i18 = 1002;
            } else if (i17 != 3) {
                return;
            } else {
                i18 = 1001;
            }
            com.tencent.thumbplayer.tplayer.reportv2.TPReportController.this.mEventHandler.sendEmptyMessage(i18);
        }
    };
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener>> mReportChannelListenerList = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* loaded from: classes16.dex */
    public class TPReportEventHandler extends android.os.Handler {
        public TPReportEventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i17 = message.what;
            com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo) message.obj;
            com.tencent.thumbplayer.tplayer.reportv2.TPReportController.this.dealSpecialEventBeforeReporterIfNeed(i17, baseEventInfo);
            if (com.tencent.thumbplayer.tplayer.reportv2.TPReportController.this.mITPReporter != null) {
                com.tencent.thumbplayer.tplayer.reportv2.TPReportController.this.mITPReporter.onEvent(i17, baseEventInfo);
            }
            com.tencent.thumbplayer.tplayer.reportv2.TPReportController.this.dealSpecialEventAfterReporterIfNeed(i17, baseEventInfo);
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP = hashMap;
        hashMap.put(117, 0);
        hashMap.put(204, 103);
        hashMap.put(101, 1);
        hashMap.put(102, 2);
        hashMap.put(103, 3);
        hashMap.put(104, 4);
        hashMap.put(105, 5);
        hashMap.put(107, 5);
        hashMap.put(108, 5);
        hashMap.put(106, 6);
        hashMap.put(109, 7);
        hashMap.put(110, 8);
        hashMap.put(111, 9);
        hashMap.put(112, 10);
        hashMap.put(114, 11);
        hashMap.put(115, 12);
        hashMap.put(201, 100);
        hashMap.put(202, 101);
        hashMap.put(203, 102);
        hashMap.put(116, 14);
        hashMap.put(113, 13);
        hashMap.put(118, 15);
    }

    public TPReportController(android.content.Context context) {
        this.mContext = null;
        this.mContext = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealSpecialEventAfterReporterIfNeed(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i17 == 5) {
            onPlayEnd(baseEventInfo);
        } else {
            if (i17 != 1000) {
                return;
            }
            onControllerRelease(baseEventInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealSpecialEventBeforeReporterIfNeed(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i17 == 0) {
            onSetDataSource(baseEventInfo);
            return;
        }
        if (i17 == 1) {
            onPrepareStart(baseEventInfo);
            return;
        }
        if (i17 == 2) {
            onPrepareEnd(baseEventInfo);
        } else if (i17 == 6) {
            onPlayError(baseEventInfo);
        } else {
            if (i17 != 103) {
                return;
            }
            onGetConvertedDataSource(baseEventInfo);
        }
    }

    private void initReporter(int i17) {
        if (this.mITPReporter != null) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "mITPReporter has been create, do not create again.");
            return;
        }
        com.tencent.thumbplayer.tplayer.reportv2.ITPReporter createReporterWithType = com.tencent.thumbplayer.tplayer.reportv2.TPReporterFactory.createReporterWithType(i17);
        this.mITPReporter = createReporterWithType;
        if (createReporterWithType == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "initReporter(" + i17 + ") fail, mITPReporter is null.");
            return;
        }
        createReporterWithType.init(this.mContext, this.mReporterInitParams);
        this.mITPReporter.setReportInfoGetter(this.mReportInfoGetter);
        this.mITPReporter.setPlayerInfoGetter(this.mPlayerInfoGetter);
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener>> it = this.mReportChannelListenerList.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener iTPReportChannelListener = it.next().get();
            if (iTPReportChannelListener != null) {
                this.mITPReporter.addReportChannelListener(iTPReportChannelListener);
            }
        }
    }

    private void onControllerRelease(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onControllerRelease");
        synchronized (this.mReleaseSyncObjectLock) {
            if (this.mReportThread != null) {
                com.tencent.thumbplayer.utils.TPThreadPool.getInstance().recycle(this.mReportThread, this.mEventHandler);
                this.mReportThread = null;
                this.mEventHandler = null;
            }
            this.mReportChannelListenerList.clear();
            this.mReleaseSyncObjectLock.notifyAll();
            this.mReleaseSyncObjectLock = null;
        }
    }

    private void onGetConvertedDataSource(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.DTReturnConvertedUrlEventInfo) {
            this.mReporterInitParams.mConvertDataSourceETimeMs = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.DTReturnConvertedUrlEventInfo) baseEventInfo).getEventTimeSinceBootMs();
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onGetConvertedDataSource time:" + this.mReporterInitParams.mConvertDataSourceETimeMs);
        }
    }

    private void onPlayEnd(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        this.mControllerState.setState(1);
        com.tencent.thumbplayer.tplayer.reportv2.ITPReporter iTPReporter = this.mITPReporter;
        if (iTPReporter != null) {
            iTPReporter.reset();
            this.mITPReporter = null;
        }
        this.mReporterInitParams = new com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams();
    }

    private void onPlayError(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (this.mControllerState.isMatchState(2)) {
            initReporter(2);
        }
        this.mControllerState.setState(1);
    }

    private void onPrepareEnd(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!this.mControllerState.isMatchState(2)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPrepareEnd Current state is not match:" + this.mControllerState.toString());
            return;
        }
        this.mControllerState.setState(3);
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo) baseEventInfo;
            this.mReporterInitParams.mPlayerType = com.tencent.thumbplayer.tplayer.reportv2.TPReportUtils.convertTPPlayerTypeToReportPlayerEnum(prepareEndEventInfo.getPlayerType());
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPrepareEnd durationMs:" + prepareEndEventInfo.getDurationMs() + " playType:" + this.mReporterInitParams.mPlayerType);
            if (prepareEndEventInfo.getDurationMs() == 0) {
                initReporter(1);
            } else {
                initReporter(0);
            }
        }
    }

    private void onPrepareStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        this.mControllerState.setState(2);
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareStartEventInfo) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareStartEventInfo prepareStartEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareStartEventInfo) baseEventInfo;
            this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs = prepareStartEventInfo.getEventTimeSinceBootMs();
            this.mReporterInitParams.mTPPrepareStartOccurTimeSince1970Ms = prepareStartEventInfo.getEventTimeSince1970Ms();
            this.mReporterInitParams.mPlayFlowId = prepareStartEventInfo.getFlowId();
        }
    }

    private void onSetDataSource(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.SetDataSourceEventInfo) {
            com.tencent.thumbplayer.event.TPPlayerEventInfo.SetDataSourceEventInfo setDataSourceEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.SetDataSourceEventInfo) baseEventInfo;
            this.mReporterInitParams.mTPSetDataSourceTimeMs = setDataSourceEventInfo.getEventTimeSinceBootMs();
            this.mReporterInitParams.mOriginalUrl = setDataSourceEventInfo.getUrl();
            this.mReporterInitParams.mIsUseProxy = setDataSourceEventInfo.isIsUseProxy() ? 1 : 0;
            this.mReporterInitParams.mUrlProtocol = setDataSourceEventInfo.getUrlProtocol();
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onSetDataSource url:" + this.mReporterInitParams.mOriginalUrl + " isUseProxy:" + this.mReporterInitParams.mIsUseProxy + " urlProtocol:" + this.mReporterInitParams.mUrlProtocol);
        }
    }

    @Override // com.tencent.thumbplayer.api.reportv2.ITPExtendReportController
    public void addReportChannelListener(com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener iTPReportChannelListener) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener>> copyOnWriteArrayList = this.mReportChannelListenerList;
        if (copyOnWriteArrayList == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "mReportChannelListenerList is null");
            return;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTPReportChannelListener) {
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.mReportChannelListenerList.add(new java.lang.ref.WeakReference<>(iTPReportChannelListener));
    }

    public void init() {
        this.mReportThread = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainHandleThread("TPReportController_Thread");
        this.mEventHandler = new com.tencent.thumbplayer.tplayer.reportv2.TPReportController.TPReportEventHandler(this.mReportThread.getLooper());
        com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.addEventListener(this.mProcessLifeCycleChangeListener);
    }

    @Override // com.tencent.thumbplayer.event.ITPEventReceiver
    public void onEvent(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        java.util.Map<java.lang.Integer, java.lang.Integer> map = CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP;
        if (map.containsKey(java.lang.Integer.valueOf(baseEventInfo.getEventId()))) {
            this.mEventHandler.obtainMessage(map.get(java.lang.Integer.valueOf(baseEventInfo.getEventId())).intValue(), baseEventInfo).sendToTarget();
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "EventId:" + baseEventInfo.getEventId() + " is not need process");
    }

    public void release() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "release");
        com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.removeEventListener(this.mProcessLifeCycleChangeListener);
        synchronized (this.mReleaseSyncObjectLock) {
            com.tencent.thumbplayer.tplayer.reportv2.TPReportController.TPReportEventHandler tPReportEventHandler = this.mEventHandler;
            if (tPReportEventHandler != null) {
                tPReportEventHandler.sendEmptyMessage(1000);
            }
            try {
                this.mReleaseSyncObjectLock.wait(500L);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    public void setPlayerInfoGetter(com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter) {
        this.mPlayerInfoGetter = iTPPlayerInfoGetter;
    }

    @Override // com.tencent.thumbplayer.api.reportv2.ITPExtendReportController
    public void setReportInfoGetter(com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter iTPReportInfoGetter) {
        this.mReportInfoGetter = iTPReportInfoGetter;
    }

    public void setReportToBeaconNeeded(boolean z17) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reporting is needed:" + z17);
        this.mReporterInitParams.mNeedReportToBeacon = java.lang.Boolean.valueOf(z17);
    }
}
