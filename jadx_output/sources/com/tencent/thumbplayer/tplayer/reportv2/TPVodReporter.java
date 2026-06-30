package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPVodReporter extends com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter {
    private static final int BUFFERING_DURATION_THRESHOLD_MS = 1200;
    private static final int PLAYER_END_NO_ERROR = 0;
    private static final java.lang.String TAG = "TPVodReporter";
    private boolean mIsPlayDone = true;
    private boolean mIsSeeking = false;
    private boolean mIsBuffering = false;
    private boolean mIsPausing = false;
    private com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord mReportParamRecord = new com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord();

    private void fillDynamicStatisticFlowParams(com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodPlayFlowParams tPVodPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        tPVodPlayFlowParams.setMaxStreamBitrateKbps(tPDynamicStatisticParams.mMaxVideoStreamBitrate);
        tPVodPlayFlowParams.setAvgStreamBitrateKbps(tPDynamicStatisticParams.mAvgVideoStreamBitrate);
        tPVodPlayFlowParams.setMinStreamBitrateKbps(tPDynamicStatisticParams.mMinVideoStreamBitrate);
        tPVodPlayFlowParams.setMaxVideoDecodeCostTimeMs(tPDynamicStatisticParams.mMaxVideoDecodeCostTimeMs);
        tPVodPlayFlowParams.setAvgVideoDecodeCostTimeMs(tPDynamicStatisticParams.mAvgVideoDecodeCostTimeMs);
        tPVodPlayFlowParams.setMinVideoDecodeCostTimeMs(tPDynamicStatisticParams.mMinVideoDecodeCostTimeMs);
        tPVodPlayFlowParams.setVideoDecodeFrameTotalCount(tPDynamicStatisticParams.mVideoDecodeFrameCount);
        tPVodPlayFlowParams.setVideoRenderFrameTotalCount(tPDynamicStatisticParams.mVideoRenderFrameCount);
    }

    private void fillGeneralPlayFlowParams(com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodPlayFlowParams tPVodPlayFlowParams, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPVodPlayFlowParams.setCoreApiPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPVodPlayFlowParams.setCoreSchedulingThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        tPVodPlayFlowParams.setDemuxerThreadPrepareTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        tPVodPlayFlowParams.setDemuxerOpenFileSTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        tPVodPlayFlowParams.setDemuxerOpenFileEtimems(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        tPVodPlayFlowParams.setInitFirstClipPositionETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        tPVodPlayFlowParams.setFirstVideoPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        tPVodPlayFlowParams.setFirstAudioPacketReadETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        tPVodPlayFlowParams.setDemuxerThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        tPVodPlayFlowParams.setCoreSchedulingThreadOnPreparedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        tPVodPlayFlowParams.setVideoDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        tPVodPlayFlowParams.setFirstVideoFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        tPVodPlayFlowParams.setAudioDecoderOpenedTimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        tPVodPlayFlowParams.setFirstAudioFrameRenderETimeMs(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }

    private void fillPlayerEndConfigParams(com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodEndParams tPVodEndParams, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        tPVodEndParams.setVideoDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        tPVodEndParams.setAudioDecoderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        tPVodEndParams.setVideoRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        tPVodEndParams.setAudioRenderType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        tPVodEndParams.setDemuxerType(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    private com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodDrmParams getVodDrmParams(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
        com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodDrmParams tPVodDrmParams = new com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodDrmParams();
        tPVodDrmParams.setDrmAbility(tPDrmInfo.drmAbility);
        tPVodDrmParams.setSupportSecureDecoder(tPDrmInfo.drmSupportSecureDecoder);
        tPVodDrmParams.setSupportSecureDecrypt(tPDrmInfo.drmSupportSecureDecrypt);
        tPVodDrmParams.setSecureLevel(tPDrmInfo.drmSecureLevel);
        tPVodDrmParams.setComponentName(tPDrmInfo.drmComponentName);
        tPVodDrmParams.setDrmType(tPDrmInfo.drmType);
        tPVodDrmParams.setPrepareSTimeMs(tPDrmInfo.drmPrepareStartTimeMs);
        tPVodDrmParams.setPrepareETimeMs(tPDrmInfo.drmPrepareEndTimeMs);
        tPVodDrmParams.setOpenSessionSTimeMs(tPDrmInfo.drmOpenSessionStartTimeMs);
        tPVodDrmParams.setOpenSessionETimeMs(tPDrmInfo.drmOpenSessionEndTimeMs);
        tPVodDrmParams.setGetProvisionReqSTimeMs(tPDrmInfo.drmGetProvisionReqStartTimeMs);
        tPVodDrmParams.setGetProvisionReqETimeMs(tPDrmInfo.drmGetProvisionReqEndTimeMs);
        tPVodDrmParams.setSendProvisionReqTimeMs(tPDrmInfo.drmSendProvisionReqTimeMs);
        tPVodDrmParams.setRecvProvisionRespTimeMs(tPDrmInfo.drmRecvProvisionRespTimeMs);
        tPVodDrmParams.setProvideProvisionRespSTimeMs(tPDrmInfo.drmProvideProvisionRespStartTimeMs);
        tPVodDrmParams.setProvideProvisionRespETimeMs(tPDrmInfo.drmProvideProvisionRespEndTimeMs);
        tPVodDrmParams.setGetKeyReqSTimeMs(tPDrmInfo.drmGetKeyReqStartTimeMs);
        tPVodDrmParams.setGetKeyReqETimeMs(tPDrmInfo.drmGetKeyReqEndTimeMs);
        tPVodDrmParams.setSendKeyReqTimeMs(tPDrmInfo.drmSendKeyReqTimeMs);
        tPVodDrmParams.setRecvKeyRespTimeMs(tPDrmInfo.drmRecvKeyRespTimeMs);
        tPVodDrmParams.setProvideKeyRespSTimeMs(tPDrmInfo.drmProvideKeyRespStartTimeMs);
        tPVodDrmParams.setProvideKeyRespETimeMs(tPDrmInfo.drmProvideKeyRespEndTimeMs);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        tPVodDrmParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPVodDrmParams;
    }

    private com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodEndParams getVodEndParams(long j17, int i17, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodEndParams tPVodEndParams = new com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodEndParams();
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        long j18 = j17 - tPVodReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs;
        tPVodReportParamRecord.mRetentionDurationMs = j18;
        tPVodEndParams.setRetentionDurationMs(j18);
        tPVodEndParams.setErrorCode(i17);
        tPVodEndParams.setTSeekCount(this.mReportParamRecord.mSeekTotalCount);
        tPVodEndParams.setTSeekBufferingCount(this.mReportParamRecord.mSeekBufferingTotalCount);
        tPVodEndParams.setTSeekBufferingDurationMs(this.mReportParamRecord.mSeekBufferingTotalDurationMs);
        tPVodEndParams.setTSecondBufferingCount(this.mReportParamRecord.mBufferingTotalCount);
        tPVodEndParams.setTSecondBufferingDurationMs(this.mReportParamRecord.mBufferingTotalDurationMs);
        fillPlayerEndConfigParams(tPVodEndParams, tPGeneralPlayFlowParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i18 = this.mReportEventSeq;
        this.mReportEventSeq = i18 + 1;
        tPCommonParams.setSeq(i18);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPVodEndParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPVodEndParams;
    }

    private com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodPlayFlowParams getVodPlayFlowParams(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodPlayFlowParams tPVodPlayFlowParams = new com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodPlayFlowParams();
        tPVodPlayFlowParams.setTPSetDataSourceTimeMs(this.mReporterInitParams.mTPSetDataSourceTimeMs);
        tPVodPlayFlowParams.setConvertDataSourceETimeMs(this.mReporterInitParams.mConvertDataSourceETimeMs);
        tPVodPlayFlowParams.setTPPrepareTimeMs(this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs);
        tPVodPlayFlowParams.setTPOnPreparedTimeMs(this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs);
        fillGeneralPlayFlowParams(tPVodPlayFlowParams, tPGeneralPlayFlowParams);
        fillDynamicStatisticFlowParams(tPVodPlayFlowParams, tPDynamicStatisticParams);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        tPVodPlayFlowParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        return tPVodPlayFlowParams;
    }

    private void onAppBackground() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onAppBackground");
        if (this.mIsPlayDone) {
            return;
        }
        cacheReport(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_FLOW, getVodPlayFlowParams(getGeneralPlayFlowParamsFromCore(), getDynamicStatisticParamsFromCore(false)));
        cacheReport(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_END, getVodEndParams(android.os.SystemClock.elapsedRealtime(), 0, getGeneralPlayFlowParamsFromCore()));
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
        com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo bufferingEndEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo) baseEventInfo;
        this.mIsBuffering = false;
        if (this.mIsSeeking) {
            return;
        }
        long eventTimeSinceBootMs = bufferingEndEventInfo.getEventTimeSinceBootMs() - this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onBufferingEnd bufferingCostTimeMs:" + eventTimeSinceBootMs);
        if (eventTimeSinceBootMs <= 1200) {
            return;
        }
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        tPVodReportParamRecord.mBufferingTotalCount++;
        tPVodReportParamRecord.mBufferingTotalDurationMs = (int) (tPVodReportParamRecord.mBufferingTotalDurationMs + eventTimeSinceBootMs);
        com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodBufferingParams tPVodBufferingParams = new com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodBufferingParams();
        tPVodBufferingParams.setPlaySpeed(this.mReportParamRecord.mPlaySpeed);
        tPVodBufferingParams.setCostTimeMs(eventTimeSinceBootMs);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        tPVodBufferingParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPVodBufferingParams.fillParamsToMap();
        dumpMapInfo("onBufferingEnd", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_BUFFERING, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_BUFFERING, fillParamsToMap);
    }

    private void onBufferingStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingStartEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onBufferingStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingStartEventInfo bufferingStartEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingStartEventInfo) baseEventInfo;
        this.mIsBuffering = true;
        if (this.mIsSeeking) {
            return;
        }
        this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs = bufferingStartEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onBufferingStart timeMs:" + this.mReportParamRecord.mBufferingStartOccurElapsedTimeMs);
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
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        tPVodReportParamRecord.mDTCdnIp = cdnIp;
        tPVodReportParamRecord.mDTUserIp = userIp;
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

    private void onDrmInfo(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.DrmEventInfo) {
            reportVodDrmInfoEvent(((com.tencent.thumbplayer.event.TPPlayerEventInfo.DrmEventInfo) baseEventInfo).getDrmInfo());
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onDrmInfo fail:params is not match");
        }
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

    private void onPlayerPause(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayPauseEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPlayerPause fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayPauseEventInfo playPauseEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayPauseEventInfo) baseEventInfo;
        if (this.mIsPausing) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPlayerPause has been called");
            return;
        }
        this.mIsPausing = true;
        this.mReportParamRecord.mPauseStartOccurElapsedTimeMs = playPauseEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onPlayerPause timeMs:" + this.mReportParamRecord.mPauseStartOccurElapsedTimeMs);
    }

    private void onPlayerStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPlayerStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo playStartEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStartEventInfo) baseEventInfo;
        this.mIsPlayDone = false;
        this.mIsPausing = false;
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        if (tPVodReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs == 0) {
            tPVodReportParamRecord.mPlayerFirstStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        }
        this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs = playStartEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onPlayerStart timeMs:" + this.mReportParamRecord.mPlayerStartOccurElapsedTimeMs);
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord2 = this.mReportParamRecord;
        if (tPVodReportParamRecord2.mPauseStartOccurElapsedTimeMs > 0) {
            long j17 = tPVodReportParamRecord2.mPauseTotalDurationMs;
            long eventTimeSinceBootMs = playStartEventInfo.getEventTimeSinceBootMs();
            com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord3 = this.mReportParamRecord;
            tPVodReportParamRecord2.mPauseTotalDurationMs = j17 + (eventTimeSinceBootMs - tPVodReportParamRecord3.mPauseStartOccurElapsedTimeMs);
            tPVodReportParamRecord3.mPauseStartOccurElapsedTimeMs = 0L;
        }
    }

    private void onPrepareDone(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPrepareDone fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PrepareEndEventInfo) baseEventInfo;
        long eventTimeSinceBootMs = prepareEndEventInfo.getEventTimeSinceBootMs() - this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs;
        this.mReportParamRecord.mPrepareEndOccurElapsedTimeMs = prepareEndEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onPrepareDone timeMs:" + eventTimeSinceBootMs);
        fillStreamInfoToCommonParams(this.mReportParamRecord);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i17 = this.mReportEventSeq;
        this.mReportEventSeq = i17 + 1;
        tPCommonParams.setSeq(i17);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        fillInitExtReportInfoToCommonParams(this.mReportParamRecord);
        com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodFirstLoadParams tPVodFirstLoadParams = new com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodFirstLoadParams();
        tPVodFirstLoadParams.setCostTimeMs(eventTimeSinceBootMs);
        tPVodFirstLoadParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPVodFirstLoadParams.fillParamsToMap();
        dumpMapInfo("onPrepareDone", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_FIRST_LOAD, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_FIRST_LOAD, fillParamsToMap);
    }

    private void onSeekEnd(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekEndEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onSeekEnd fail:params is not match");
            return;
        }
        this.mIsSeeking = false;
        long eventTimeSinceBootMs = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekEndEventInfo) baseEventInfo).getEventTimeSinceBootMs();
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
        long j17 = eventTimeSinceBootMs - tPVodReportParamRecord.mSeekStartOccurElapsedTimeMs;
        if (j17 > 1200) {
            tPVodReportParamRecord.mSeekBufferingTotalCount++;
            tPVodReportParamRecord.mSeekBufferingTotalDurationMs = (int) (tPVodReportParamRecord.mSeekBufferingTotalDurationMs + j17);
        }
        tPVodReportParamRecord.mSeekTotalCount++;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onSeekEnd seekCostTimeMs:" + j17 + " mSeekTotalCount:" + this.mReportParamRecord.mSeekTotalCount + " mSeekBufferingTotalCount:" + this.mReportParamRecord.mSeekBufferingTotalCount + " mSeekBufferingTotalDurationMs:" + this.mReportParamRecord.mSeekBufferingTotalDurationMs);
    }

    private void onSeekStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekStartEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onSeekStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekStartEventInfo seekStartEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekStartEventInfo) baseEventInfo;
        if (this.mIsBuffering) {
            onBufferingEnd(new com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo());
        }
        if (this.mIsSeeking) {
            onSeekEnd(new com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekEndEventInfo());
        }
        this.mIsSeeking = true;
        this.mReportParamRecord.mSeekStartOccurElapsedTimeMs = seekStartEventInfo.getEventTimeSinceBootMs();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onSeekStart timeMs:" + this.mReportParamRecord.mSeekStartOccurElapsedTimeMs);
    }

    private void onSelectTrackEnd(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackEndEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onSelectTrackEnd fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackEndEventInfo selectTrackEndEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackEndEventInfo) baseEventInfo;
        int errorCode = selectTrackEndEventInfo.getErrorCode();
        long opaque = selectTrackEndEventInfo.getOpaque();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onSelectTrackEnd errorCode:" + errorCode + " trackUniqueIndex:" + opaque);
        reportSelectTrackEndEvent(opaque, selectTrackEndEventInfo.getEventTimeSinceBootMs(), errorCode);
    }

    private void onSelectTrackStart(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackStartEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onSelectTrackStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackStartEventInfo selectTrackStartEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.SelectTrackStartEventInfo) baseEventInfo;
        int trackIndex = selectTrackStartEventInfo.getTrackIndex();
        long opaque = selectTrackStartEventInfo.getOpaque();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onSelectTrackStart trackId:" + trackIndex + " trackUniqueIndex:" + opaque);
        if (this.mReportParamRecord.mSelectTrackInfoList.containsKey(java.lang.Long.valueOf(opaque))) {
            return;
        }
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord.TPSelectTrackInfo tPSelectTrackInfo = new com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord.TPSelectTrackInfo();
        tPSelectTrackInfo.mSelectTrackId = trackIndex;
        tPSelectTrackInfo.mTrackInfo = selectTrackStartEventInfo.getTrackInfo();
        tPSelectTrackInfo.mSelectTrackStartOccurElapsedTimeMs = selectTrackStartEventInfo.getEventTimeSinceBootMs();
        this.mReportParamRecord.mSelectTrackInfoList.put(java.lang.Long.valueOf(selectTrackStartEventInfo.getOpaque()), tPSelectTrackInfo);
    }

    private void onSetPlaySpeed(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.SetPlaySpeedEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onSetPlaySpeed fail:params is not match");
            return;
        }
        this.mReportParamRecord.mPlaySpeed = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.SetPlaySpeedEventInfo) baseEventInfo).getPlaySpeedRatio();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "Vod onSetPlaySpeed mPlaySpeed:" + this.mReportParamRecord.mPlaySpeed);
    }

    private void reportPlayerEndEvent(long j17, int i17, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.mIsBuffering) {
            onBufferingEnd(new com.tencent.thumbplayer.event.TPPlayerEventInfo.BufferingEndEventInfo());
            this.mIsBuffering = false;
        }
        if (this.mIsSeeking) {
            onSeekEnd(new com.tencent.thumbplayer.event.TPPlayerEventInfo.SeekEndEventInfo());
            this.mIsSeeking = false;
        }
        if (this.mIsPausing) {
            com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord = this.mReportParamRecord;
            if (tPVodReportParamRecord.mPauseStartOccurElapsedTimeMs > 0) {
                long j18 = tPVodReportParamRecord.mPauseTotalDurationMs;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord tPVodReportParamRecord2 = this.mReportParamRecord;
                tPVodReportParamRecord.mPauseTotalDurationMs = j18 + (elapsedRealtime - tPVodReportParamRecord2.mPauseStartOccurElapsedTimeMs);
                tPVodReportParamRecord2.mPauseStartOccurElapsedTimeMs = 0L;
            }
            this.mIsPausing = false;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reportPlayerEndEvent playerStopTimeMs:" + j17 + " errorCode:" + i17);
        reportVodEndFlowEvent(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        reportVodEndEvent(j17, i17, tPGeneralPlayFlowParams);
    }

    private void reportSelectTrackEndEvent(long j17, long j18, int i17) {
        if (!this.mReportParamRecord.mSelectTrackInfoList.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "reportSelectTrackEndEvent mSelectTrackInfoList is not contain key:" + j17);
            return;
        }
        com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord.TPSelectTrackInfo tPSelectTrackInfo = this.mReportParamRecord.mSelectTrackInfoList.get(java.lang.Long.valueOf(j17));
        long j19 = j18 - tPSelectTrackInfo.mSelectTrackStartOccurElapsedTimeMs;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reportSelectTrackEndEvent trackUniqueIndex:" + j17 + " costTimeMs:" + j19 + " trackId:" + tPSelectTrackInfo.mSelectTrackId);
        com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodSelectTrackParams tPVodSelectTrackParams = new com.tencent.thumbplayer.tplayer.reportv2.data.vod.TPVodSelectTrackParams();
        tPVodSelectTrackParams.setErrorCode(i17);
        tPVodSelectTrackParams.setCostTimeMs(j19);
        tPVodSelectTrackParams.setMediaType(tPSelectTrackInfo.mTrackInfo.getTrackType());
        tPVodSelectTrackParams.setAttachFormat(tPSelectTrackInfo.mTrackInfo.isInternal ? 1 : 0);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = this.mReportParamRecord.mCommonParams;
        int i18 = this.mReportEventSeq;
        this.mReportEventSeq = i18 + 1;
        tPCommonParams.setSeq(i18);
        tPVodSelectTrackParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPVodSelectTrackParams.fillParamsToMap();
        dumpMapInfo("onSelectTrackEnd", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_SELECT_TRACK, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_SELECT_TRACK, fillParamsToMap);
        this.mReportParamRecord.mSelectTrackInfoList.remove(java.lang.Long.valueOf(j17));
    }

    private void reportVodDrmInfoEvent(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = getVodDrmParams(tPDrmInfo).fillParamsToMap();
        dumpMapInfo("reportPlayerDrmInfoEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_DRM, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_DRM, fillParamsToMap);
    }

    private void reportVodEndEvent(long j17, int i17, com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = getVodEndParams(j17, i17, tPGeneralPlayFlowParams).fillParamsToMap();
        dumpMapInfo("reportVodEndEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_END, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_END, fillParamsToMap);
    }

    private void reportVodEndFlowEvent(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams, com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = getVodPlayFlowParams(tPGeneralPlayFlowParams, tPDynamicStatisticParams).fillParamsToMap();
        dumpMapInfo("reportVodEndFlowEvent", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_FLOW, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_VOD_FLOW, fillParamsToMap);
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void init(android.content.Context context, com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams tPReporterInitParams) {
        super.init(context, tPReporterInitParams);
        this.mReportUtils.initDeviceParams(this.mReportParamRecord.mCommonParams);
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void onEvent(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i17 == 1001) {
            onAppForeground();
            return;
        }
        if (i17 == 1002) {
            onAppBackground();
            return;
        }
        switch (i17) {
            case 2:
                onPrepareDone(baseEventInfo);
                return;
            case 3:
                onPlayerStart(baseEventInfo);
                return;
            case 4:
                onPlayerPause(baseEventInfo);
                return;
            case 5:
                onPlayerEnd(baseEventInfo);
                return;
            case 6:
                onPlayerError(baseEventInfo);
                return;
            case 7:
                onSeekStart(baseEventInfo);
                return;
            case 8:
                onSeekEnd(baseEventInfo);
                return;
            case 9:
                onBufferingStart(baseEventInfo);
                return;
            case 10:
                onBufferingEnd(baseEventInfo);
                return;
            case 11:
                onSelectTrackStart(baseEventInfo);
                return;
            case 12:
                onSelectTrackEnd(baseEventInfo);
                return;
            case 13:
                onSetPlaySpeed(baseEventInfo);
                return;
            case 14:
                onDrmInfo(baseEventInfo);
                return;
            default:
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
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void reset() {
        super.reset();
    }
}
