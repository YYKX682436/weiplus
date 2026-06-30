package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPLiveReporter extends com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter {
    private static final int BUFFERING_DURATION_THRESHOLD_MS = 1200;
    private static final int PERIOD_REPORT_TIME_MS = 60000;
    private static final int PLAYER_END_NO_ERROR = 0;
    private static final java.lang.String TAG = "TPLiveReporter";
    private boolean mIsPlayDone = true;
    private boolean mIsBuffering = false;
    private com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord mReportParamRecord = new com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord();
    private final java.lang.Object mPeriodReportTimerLock = new java.lang.Object();
    private java.util.concurrent.Future<?> mPeriodReportTimer = null;
    private java.lang.Runnable mPeriodTimerRunnable = new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.1
        @Override // java.lang.Runnable
        public void run() {
            if (!com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.this.mIsPlayDone) {
                com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.this.periodReportEvent();
                return;
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.TAG, "Period Timer Exit because play done.");
            com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.this.mPeriodReportTimer.cancel(true);
            com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.this.mPeriodReportTimer = null;
        }
    };

    private synchronized void destroyPeriodReportTimer() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "destroyPeriodReportTimer");
        synchronized (this.mPeriodReportTimerLock) {
            java.util.concurrent.Future<?> future = this.mPeriodReportTimer;
            if (future != null) {
                future.cancel(true);
                this.mPeriodReportTimer = null;
            }
        }
    }

    private void fillGeneralPlayFlowParams(com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePlayFlowParams tPLivePlayFlowParams, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPLivePlayFlowParams.setCoreApiPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPLivePlayFlowParams.setCoreSchedulingThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        tPLivePlayFlowParams.setDemuxerThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        tPLivePlayFlowParams.setDemuxerOpenFileSTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        tPLivePlayFlowParams.setDemuxerOpenFileEtimems(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPLivePlayFlowParams.setInitFirstClipPositionETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        tPLivePlayFlowParams.setFirstVideoPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        tPLivePlayFlowParams.setFirstAudioPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        tPLivePlayFlowParams.setDemuxerThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        tPLivePlayFlowParams.setCoreSchedulingThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        tPLivePlayFlowParams.setVideoDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        tPLivePlayFlowParams.setFirstVideoFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        tPLivePlayFlowParams.setAudioDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        tPLivePlayFlowParams.setFirstAudioFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }

    private void fillPeriodExtReportInfoToCommonParams(com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord) {
        com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter iTPReportInfoGetter = this.mReportInfoGetter;
        if (iTPReportInfoGetter == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> periodExtendReportInfo = iTPReportInfoGetter.getPeriodExtendReportInfo();
        if (periodExtendReportInfo == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "fillPeriodExtReportInfoToCommonParams fail, period ExtendReportInfo is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter.classifyMapIntoRsvExtMapAndExtMap(periodExtendReportInfo, hashMap, hashMap2);
        tPBaseReportParamRecord.mCommonParams.setPeriodRsvExtFields(hashMap);
        tPBaseReportParamRecord.mCommonParams.setPeriodExtFields(hashMap2);
    }

    private void fillPlayerEndConfigParams(com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveEndParams tPLiveEndParams, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPLiveEndParams.setVideoDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        tPLiveEndParams.setAudioDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        tPLiveEndParams.setVideoRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        tPLiveEndParams.setAudioRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        tPLiveEndParams.setDemuxerType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    private com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveEndParams getLiveEndParams(long j17, int i17, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveEndParams tPLiveEndParams = new com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveEndParams();
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        long j18 = tPLiveReportParamRecord.mRetentionDurationMs + (j17 - tPLiveReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs);
        tPLiveReportParamRecord.mRetentionDurationMs = j18;
        tPLiveEndParams.setRetentionDurationMs(j18);
        tPLiveEndParams.setErrorCode(i17);
        fillPlayerEndConfigParams(tPLiveEndParams, tPGeneralPlayFlowParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i18 = this.mReportEventSeq;
        this.mReportEventSeq = i18 + 1;
        tPCommonParams.setSeq(i18);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPLiveEndParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPLiveEndParams;
    }

    private com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePlayFlowParams getLiveFlowParams(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePlayFlowParams tPLivePlayFlowParams = new com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePlayFlowParams();
        tPLivePlayFlowParams.setTPSetDataSourceTimeMs(this.mReporterInitParams.mTPSetDataSourceTimeMs);
        tPLivePlayFlowParams.setConvertDataSourceETimeMs(this.mReporterInitParams.mConvertDataSourceETimeMs);
        tPLivePlayFlowParams.setTPPrepareTimeMs(this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs);
        tPLivePlayFlowParams.setTPOnPreparedTimeMs(this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs);
        fillGeneralPlayFlowParams(tPLivePlayFlowParams, tPGeneralPlayFlowParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPLivePlayFlowParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPLivePlayFlowParams;
    }

    private void onAppBackground() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onAppBackground");
        if (this.mIsPlayDone) {
            return;
        }
        cacheReport(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_FLOW, getLiveFlowParams(getGeneralPlayFlowParamsFromCore(), getDynamicStatisticParamsFromCore(false)));
        cacheReport(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_END, getLiveEndParams(android.os.SystemClock.elapsedRealtime(), 0, getGeneralPlayFlowParamsFromCore()));
    }

    private void onAppForeground() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onAppForeground");
        removeCachedReports(this.mReportParamRecord.mCommonParams.getFlowId());
    }

    private void onBufferingEnd(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onBufferingEnd fail:params is not match");
            return;
        }
        this.mIsBuffering = false;
        long eventTimeSinceBootMs = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo) baseEventInfo).getEventTimeSinceBootMs();
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        long j17 = eventTimeSinceBootMs - tPLiveReportParamRecord.mBufferingStartOccurElapsedTimeMs;
        tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs = android.os.SystemClock.elapsedRealtime();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Live onBufferingEnd bufferingCostTimeMs:" + j17);
        if (j17 <= 1200) {
            return;
        }
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord2 = this.mReportParamRecord;
        tPLiveReportParamRecord2.mPeriodBufferingCount++;
        tPLiveReportParamRecord2.mPeriodBufferingTotalDurationMs += j17;
        tPLiveReportParamRecord2.mBufferingStartOccurElapsedTimeMs = 0L;
    }

    private void onBufferingStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingStartEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onBufferingStart fail:params is not match");
            return;
        }
        this.mIsBuffering = true;
        this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingStartEventInfo) baseEventInfo).getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Live onBufferingStart timeMs:" + this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs);
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mPeriodPlayedDurationMs = tPLiveReportParamRecord.mPeriodPlayedDurationMs + (tPLiveReportParamRecord.mBufferingStartOccurElapsedTimeMs - tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs);
    }

    private void onDTCdnUrlUpdate(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.DTCdnUrlUpdataEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.DTCdnUrlUpdataEventInfo) baseEventInfo;
        java.lang.String cdnIp = dTCdnUrlUpdataEventInfo.getCdnIp();
        java.lang.String userIp = dTCdnUrlUpdataEventInfo.getUserIp();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onDTCdnUrlUpdate cdnIp:" + cdnIp + " uIp:" + userIp);
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mDTCdnIp = cdnIp;
        tPLiveReportParamRecord.mDTUserIp = userIp;
    }

    private void onDTProcessUpdate(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onDTProcessUpdate fail:params is not match");
            return;
        }
        int downloadSpeedKbps = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo) baseEventInfo).getDownloadSpeedKbps();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onDTProcessUpdate speedKbps:" + downloadSpeedKbps);
        this.mReportParamRecord.mDTSpeedKbps = downloadSpeedKbps;
    }

    private void onDTProtocolUpdate(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.DTProtocalUpdateEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onDTProtocolUpdate fail:params is not match");
            return;
        }
        java.lang.String protocolVer = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.DTProtocalUpdateEventInfo) baseEventInfo).getProtocolVer();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onDTProtocolUpdate protocolVer:" + protocolVer);
        this.mReportParamRecord.mDTProtocolVer = protocolVer;
    }

    private void onPlayerEnd(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (this.mIsPlayDone) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "Player has been called End");
            return;
        }
        this.mIsPlayDone = true;
        reportPlayerEndEvent(baseEventInfo.getEventTimeSinceBootMs(), 0, getGeneralPlayFlowParamsFromEventInfo(baseEventInfo), getDynamicStatisticParamsFromEventInfo(baseEventInfo));
        removeCachedReports(this.mReportParamRecord.mCommonParams.getFlowId());
    }

    private void onPlayerError(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (this.mIsPlayDone) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "Player has been called End");
            return;
        }
        this.mIsPlayDone = true;
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPlayerError fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo playErrorEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo;
        reportPlayerEndEvent(playErrorEventInfo.getEventTimeSinceBootMs(), playErrorEventInfo.getErrorCode(), getGeneralPlayFlowParamsFromEventInfo(playErrorEventInfo), getDynamicStatisticParamsFromEventInfo(playErrorEventInfo));
        removeCachedReports(this.mReportParamRecord.mCommonParams.getFlowId());
    }

    private void onPlayerStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPlayerStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo playStartEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo) baseEventInfo;
        this.mIsPlayDone = false;
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        if (tPLiveReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs == 0) {
            tPLiveReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        }
        this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Live onPlayerStart FirstStartTimeMs:" + this.mReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs + " mPlayerStartOccurElapsedTimeMs:" + this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs);
        startPeriodReportTimer();
    }

    private void onPrepareDone(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPrepareDone fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo) baseEventInfo;
        long eventTimeSinceBootMs = prepareEndEventInfo.getEventTimeSinceBootMs() - this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs;
        this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs = prepareEndEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Live onPrepareDone timeMs:" + eventTimeSinceBootMs);
        fillStreamInfoToCommonParams(this.mReportParamRecord);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        fillInitExtReportInfoToCommonParams(this.mReportParamRecord);
        com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveFirstLoadParams tPLiveFirstLoadParams = new com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLiveFirstLoadParams();
        tPLiveFirstLoadParams.setCostTimeMs(eventTimeSinceBootMs);
        tPLiveFirstLoadParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPLiveFirstLoadParams.fillParamsToMap();
        dumpMapInfo("onPrepareDone", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_FIRST_LOAD, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_FIRST_LOAD, fillParamsToMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void periodReportEvent() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "periodReportEvent enter.");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mPeriodPlayedDurationMs += elapsedRealtime - tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs;
        tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs = android.os.SystemClock.elapsedRealtime();
        com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePeriodParams tPLivePeriodParams = new com.tencent.thumbplayer.tplayer.reportv2.data.live.TPLivePeriodParams();
        tPLivePeriodParams.setBufferingCount(this.mReportParamRecord.mPeriodBufferingCount);
        tPLivePeriodParams.setBufferingDurationMs(this.mReportParamRecord.mPeriodBufferingTotalDurationMs);
        tPLivePeriodParams.setPlayedDurationMs(this.mReportParamRecord.mPeriodPlayedDurationMs);
        com.tencent.thumbplayer.core.player.TPDynamicStatisticParams dynamicStatisticParams = this.mPlayerInfoGetter.getDynamicStatisticParams(true);
        tPLivePeriodParams.setMaxStreamBitrate(dynamicStatisticParams.mMaxVideoStreamBitrate);
        tPLivePeriodParams.setAvgStreamBitrate(dynamicStatisticParams.mAvgVideoStreamBitrate);
        tPLivePeriodParams.setMinStreamBitrate(dynamicStatisticParams.mMinVideoStreamBitrate);
        tPLivePeriodParams.setMaxVideoDecodeCostTimeMs(dynamicStatisticParams.mMaxVideoDecodeCostTimeMs);
        tPLivePeriodParams.setAvgVideoDecodeCostTimeMs(dynamicStatisticParams.mAvgVideoDecodeCostTimeMs);
        tPLivePeriodParams.setMinVideoDecodeCostTimeMs(dynamicStatisticParams.mMinVideoDecodeCostTimeMs);
        tPLivePeriodParams.setMaxVideoGopSize(dynamicStatisticParams.mMaxVideoGopSize);
        tPLivePeriodParams.setAvgVideoGopSize(dynamicStatisticParams.mAvgVideoGopSize);
        tPLivePeriodParams.setMinVideoGopSize(dynamicStatisticParams.mMinVideoGopSize);
        tPLivePeriodParams.setVideoDecodeFrameCount(dynamicStatisticParams.mVideoDecodeFrameCount);
        tPLivePeriodParams.setVideoRenderFrameCount(dynamicStatisticParams.mVideoRenderFrameCount);
        tPLivePeriodParams.setVideoBufferedDurationMs(dynamicStatisticParams.mVideoBufferedDurationMs);
        tPLivePeriodParams.setAudioBufferedDurationMs(dynamicStatisticParams.mAudioBufferedDurationMs);
        fillPeriodExtReportInfoToCommonParams(this.mReportParamRecord);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPLivePeriodParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPLivePeriodParams.fillParamsToMap();
        dumpMapInfo("periodReportEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_PERIOD, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_PERIOD, fillParamsToMap);
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord2 = this.mReportParamRecord;
        tPLiveReportParamRecord2.mPeriodBufferingCount = 0;
        tPLiveReportParamRecord2.mPeriodBufferingTotalDurationMs = 0L;
        tPLiveReportParamRecord2.mPeriodPlayedDurationMs = 0L;
        tPLiveReportParamRecord2.mCommonParams.setPeriodRsvExtFields(null);
        this.mReportParamRecord.mCommonParams.setPeriodExtFields(null);
    }

    private void reportLiveEndEvent(long j17, int i17, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = getLiveEndParams(j17, i17, tPGeneralPlayFlowParams).fillParamsToMap();
        dumpMapInfo("reportLiveEndEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_END, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_END, fillParamsToMap);
    }

    private void reportLiveEndFlowEvent(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = getLiveFlowParams(tPGeneralPlayFlowParams, tPDynamicStatisticParams).fillParamsToMap();
        dumpMapInfo("reportLiveEndFlowEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_FLOW, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_LIVE_FLOW, fillParamsToMap);
    }

    private void reportPlayerEndEvent(long j17, int i17, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.mIsBuffering) {
            onBufferingEnd(new com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo());
            this.mIsBuffering = false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.thumbplayer.tplayer.reportv2.TPLiveReportParamRecord tPLiveReportParamRecord = this.mReportParamRecord;
        tPLiveReportParamRecord.mPeriodPlayedDurationMs += elapsedRealtime - tPLiveReportParamRecord.mPlayerStartOccurElapsedTimeMs;
        destroyPeriodReportTimer();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reportPlayerEndEvent playerStopTimeMs:" + j17 + " errorCode:" + i17);
        reportLiveEndFlowEvent(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        reportLiveEndEvent(j17, i17, tPGeneralPlayFlowParams);
    }

    private void startPeriodReportTimer() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "startPeriodReportTimer");
        synchronized (this.mPeriodReportTimerLock) {
            if (this.mPeriodReportTimer == null) {
                this.mPeriodReportTimer = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainScheduledExecutorService().scheduleAtFixedRate(this.mPeriodTimerRunnable, 0L, 60000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void init(android.content.Context context, com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams tPReporterInitParams) {
        super.init(context, tPReporterInitParams);
        this.mReportUtils.initDeviceParams(this.mReportParamRecord.mCommonParams);
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void onEvent(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i17 == 2) {
            onPrepareDone(baseEventInfo);
            return;
        }
        if (i17 == 3) {
            onPlayerStart(baseEventInfo);
            return;
        }
        if (i17 == 5) {
            onPlayerEnd(baseEventInfo);
            return;
        }
        if (i17 == 6) {
            onPlayerError(baseEventInfo);
            return;
        }
        if (i17 == 9) {
            onBufferingStart(baseEventInfo);
            return;
        }
        if (i17 == 10) {
            onBufferingEnd(baseEventInfo);
            return;
        }
        if (i17 == 1001) {
            onAppForeground();
            return;
        }
        if (i17 == 1002) {
            onAppBackground();
            return;
        }
        switch (i17) {
            case 100:
                onDTProcessUpdate(baseEventInfo);
                return;
            case 101:
                onDTCdnUrlUpdate(baseEventInfo);
                return;
            case 102:
                onDTProtocolUpdate(baseEventInfo);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void reset() {
        super.reset();
        destroyPeriodReportTimer();
    }
}
