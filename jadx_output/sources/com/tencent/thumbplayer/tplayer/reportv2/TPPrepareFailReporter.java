package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPPrepareFailReporter extends com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter {
    private static final java.lang.String TAG = "TPPrepareFailReporter";
    private static final int UN_USE_PROXY = 0;
    private static final int USE_PROXY = 1;
    private com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord mReportParamRecord = new com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord();

    private void fillStreamInfoToCommonParams() {
        com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams generalPlayFlowParams = iTPPlayerInfoGetter.getGeneralPlayFlowParams();
        this.mReportParamRecord.mCommonParams.setFlowId(this.mReporterInitParams.mPlayFlowId);
        this.mReportParamRecord.mCommonParams.setPlayerType(this.mReporterInitParams.mPlayerType);
        this.mReportParamRecord.mCommonParams.setUrl(this.mReporterInitParams.mOriginalUrl);
        this.mReportParamRecord.mCommonParams.setDataTransportVer(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getNativeLibVersion());
        com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord = this.mReportParamRecord;
        tPBaseReportParamRecord.mCommonParams.setSpeedKbps(tPBaseReportParamRecord.mDTSpeedKbps);
        com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord2 = this.mReportParamRecord;
        tPBaseReportParamRecord2.mCommonParams.setDataTransportProtocolVer(tPBaseReportParamRecord2.mDTProtocolVer);
        com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord3 = this.mReportParamRecord;
        tPBaseReportParamRecord3.mCommonParams.setCdnUip(tPBaseReportParamRecord3.mDTUserIp);
        com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord4 = this.mReportParamRecord;
        tPBaseReportParamRecord4.mCommonParams.setCdnIp(tPBaseReportParamRecord4.mDTCdnIp);
        this.mReportParamRecord.mCommonParams.setUseDataTransport(this.mReporterInitParams.mIsUseProxy);
        this.mPlayerConfigKeyValueMap.put("buffermintotaldurationms", java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put("buffermaxtotaldurationms", java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put("preloadtotaldurationms", java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put("minbufferingdurationms", java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingDurationMs));
        this.mPlayerConfigKeyValueMap.put("minbufferingtimems", java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put("maxbufferingtimems", java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put("reducelatencyaction", java.lang.Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyAction));
        this.mPlayerConfigKeyValueMap.put("reducelatencyspeed", java.lang.Float.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.mPlayerConfigKeyValueMap.put("buffertype", java.lang.Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferType));
        try {
            this.mReportParamRecord.mCommonParams.setPlayerConfig(new org.json.JSONObject(this.mPlayerConfigKeyValueMap).toString());
        } catch (java.lang.NullPointerException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
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
        com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord = this.mReportParamRecord;
        tPBaseReportParamRecord.mDTCdnIp = cdnIp;
        tPBaseReportParamRecord.mDTUserIp = userIp;
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

    private void onPrepareError(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo)) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "onPrepareError fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo playErrorEventInfo = (com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo;
        int errorType = playErrorEventInfo.getErrorType();
        int errorCode = playErrorEventInfo.getErrorCode();
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onPrepareError errorType:" + errorType + " errorCode:" + errorCode);
        com.tencent.thumbplayer.tplayer.reportv2.data.TPPrepareFailParams tPPrepareFailParams = new com.tencent.thumbplayer.tplayer.reportv2.data.TPPrepareFailParams();
        tPPrepareFailParams.setErrorCode(errorCode);
        fillStreamInfoToCommonParams();
        fillInitExtReportInfoToCommonParams(this.mReportParamRecord);
        this.mReportUtils.updateCommonParams(this.mReportParamRecord.mCommonParams);
        tPPrepareFailParams.copyCommonParams(this.mReportParamRecord.mCommonParams);
        java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPPrepareFailParams.fillParamsToMap();
        dumpMapInfo("onPrepareError", fillParamsToMap);
        reportToExternalReportChannelIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_PREPARE_FAIL, fillParamsToMap);
        reportToBeaconIfNeed(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.TP_REPORT_EVENT_PREPARE_FAIL, fillParamsToMap);
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void init(android.content.Context context, com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams tPReporterInitParams) {
        super.init(context, tPReporterInitParams);
        this.mReportUtils.initDeviceParams(this.mReportParamRecord.mCommonParams);
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.TPBaseReporter, com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void onEvent(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i17 == 6) {
            onPrepareError(baseEventInfo);
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
    }
}
