package com.tencent.thumbplayer.richmedia.plugins;

/* loaded from: classes16.dex */
public class TPRichMediaSynchronizerReportPlugin implements com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase {
    private static final java.lang.String REPORT_EVENT_RICH_MEDIA_FEATURE_DATA_CALLBACK = "rich_media_feature_data_callback";
    private static final java.lang.String REPORT_EVENT_RICH_MEDIA_FEATURE_SELECT = "rich_media_feature_select";
    private static final java.lang.String REPORT_EVENT_RICH_MEDIA_PREPARE = "rich_media_prepare";
    private static final java.lang.String REPORT_KEY_APP_PLATFORM = "appplatform";
    private static final java.lang.String REPORT_KEY_CODE = "code";
    private static final java.lang.String REPORT_KEY_DURATION = "duration";
    private static final java.lang.String REPORT_KEY_FEATURE_TYPE = "featuretype";
    private static final java.lang.String REPORT_KEY_FLOW_ID = "flowid";
    private static final java.lang.String REPORT_KEY_GUID = "guid";
    private static final java.lang.String REPORT_KEY_NETWORK = "network";
    private static final java.lang.String REPORT_KEY_POSITION = "position";
    private static final java.lang.String REPORT_KEY_SEQ = "seq";
    private static final java.lang.String REPORT_KEY_URL = "url";
    private static final int SUCCESS = 0;
    private com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] mFeatures;
    private java.lang.String mFlowId;
    private java.lang.String mUrl;
    com.tencent.thumbplayer.utils.TPReadWriteLock mLock = new com.tencent.thumbplayer.utils.TPReadWriteLock();
    private int mSelectSeq = 0;
    private int mCallbackDataSeq = 0;
    private int mCurrentPositionMs = -1;
    private long mPrepareStartTimeMs = 0;
    private java.util.List<com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPSelectFeatureParam> mSelectFeatureParams = new java.util.ArrayList();
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPCallbackDataParam> mCallbackDataParams = new java.util.HashMap();

    /* loaded from: classes16.dex */
    public static class TPCallbackDataParam {
        public int seq;
        public long startTimeMs;

        private TPCallbackDataParam() {
        }
    }

    /* loaded from: classes16.dex */
    public static class TPSelectFeatureParam {
        public int featureIndex;
        public int seq;
        public long startTimeMs;

        private TPSelectFeatureParam() {
        }
    }

    private void addCommonProperties(com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        iTPReportProperties.put("url", this.mUrl);
        iTPReportProperties.put("flowid", this.mFlowId);
        iTPReportProperties.put("guid", com.tencent.thumbplayer.config.TPPlayerConfig.getGuid());
        iTPReportProperties.put(REPORT_KEY_APP_PLATFORM, com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform());
        iTPReportProperties.put("network", com.tencent.thumbplayer.utils.TPNetworkChangeMonitor.getDetailNetSubType());
    }

    private void allFeatureDataCallbackDone(int i17) {
        if (this.mFeatures != null) {
            for (int i18 = 0; i18 < this.mFeatures.length; i18++) {
                featureDataCallbackDone(i18, 0);
            }
        }
    }

    private void allFeatureSelectDone(int i17) {
        if (this.mFeatures != null) {
            for (int i18 = 0; i18 < this.mFeatures.length; i18++) {
                featureSelectDone(i18, 0);
            }
        }
    }

    private void clearResource() {
        this.mFeatures = null;
        this.mSelectSeq = 0;
        this.mCallbackDataSeq = 0;
        this.mPrepareStartTimeMs = 0L;
        this.mSelectFeatureParams.clear();
        this.mCallbackDataParams.clear();
    }

    private void featureDataCallbackDone(int i17, int i18) {
        if (this.mCallbackDataParams.containsKey(java.lang.Integer.valueOf(i17))) {
            reportFeatureDataCallback(this.mCallbackDataParams.get(java.lang.Integer.valueOf(i17)), getFeatureType(i17), i18);
            this.mCallbackDataParams.remove(java.lang.Integer.valueOf(i17));
        }
    }

    private void featureSelectDone(int i17, int i18) {
        java.lang.String featureType = getFeatureType(i17);
        java.util.Iterator<com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPSelectFeatureParam> it = this.mSelectFeatureParams.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPSelectFeatureParam next = it.next();
            if (next.featureIndex == i17) {
                reportFeatureSelect(next, featureType, i18);
                it.remove();
            }
        }
    }

    private void finishReport(int i17) {
        reportRichMediaPrepared(i17);
        allFeatureSelectDone(i17);
        allFeatureDataCallbackDone(i17);
    }

    private void finishReportAndClearResource(int i17) {
        finishReport(i17);
        clearResource();
    }

    private java.lang.String getFeatureType(int i17) {
        com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] tPRichMediaFeatureArr = this.mFeatures;
        return (tPRichMediaFeatureArr == null || i17 < 0 || i17 >= tPRichMediaFeatureArr.length) ? "" : tPRichMediaFeatureArr[i17].getFeatureType();
    }

    private void onDeselectDone(int i17) {
        featureDataCallbackDone(i17, 0);
    }

    private void onError(int i17) {
        finishReportAndClearResource(i17);
    }

    private void onFeatureFailure(int i17, int i18) {
        featureSelectDone(i17, i18);
        featureDataCallbackDone(i17, i18);
    }

    private void onPrepared(java.lang.Object obj) {
        if (obj instanceof com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[]) {
            this.mFeatures = (com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[]) obj;
        }
        reportRichMediaPrepared(0);
    }

    private void onRelease() {
        finishReportAndClearResource(0);
    }

    private void onReset() {
        finishReportAndClearResource(0);
    }

    private void onSelectDone(int i17) {
        featureSelectDone(i17, 0);
        if (this.mCallbackDataParams.containsKey(java.lang.Integer.valueOf(i17))) {
            return;
        }
        this.mCallbackDataSeq++;
        com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPCallbackDataParam tPCallbackDataParam = new com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPCallbackDataParam();
        tPCallbackDataParam.seq = this.mCallbackDataSeq;
        tPCallbackDataParam.startTimeMs = android.os.SystemClock.elapsedRealtime();
        this.mCallbackDataParams.put(java.lang.Integer.valueOf(i17), tPCallbackDataParam);
    }

    private void onSetUrl(java.lang.String str) {
        this.mFlowId = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.tencent.thumbplayer.config.TPPlayerConfig.getPlatform();
        this.mUrl = str;
    }

    private void onStartDeselect(int i17) {
        featureSelectDone(i17, 0);
    }

    private void onStartPrepare() {
        this.mPrepareStartTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    private void onStartSelect(int i17) {
        this.mSelectSeq++;
        com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPSelectFeatureParam tPSelectFeatureParam = new com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPSelectFeatureParam();
        tPSelectFeatureParam.featureIndex = i17;
        tPSelectFeatureParam.seq = this.mSelectSeq;
        tPSelectFeatureParam.startTimeMs = android.os.SystemClock.elapsedRealtime();
        this.mSelectFeatureParams.add(tPSelectFeatureParam);
    }

    private void onUpdatePosition(int i17) {
        this.mCurrentPositionMs = i17;
    }

    private void reportEvent(java.lang.String str, com.tencent.thumbplayer.common.report.ITPReportProperties iTPReportProperties) {
        addCommonProperties(iTPReportProperties);
        com.tencent.thumbplayer.common.report.TPBeaconReportWrapper.trackCustomKVEvent(str, iTPReportProperties);
    }

    private void reportFeatureDataCallback(com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPCallbackDataParam tPCallbackDataParam, java.lang.String str, int i17) {
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        tPProperties.put("duration", android.os.SystemClock.elapsedRealtime() - tPCallbackDataParam.startTimeMs);
        tPProperties.put("code", i17);
        tPProperties.put("seq", tPCallbackDataParam.seq);
        tPProperties.put(REPORT_KEY_FEATURE_TYPE, str);
        tPProperties.put(REPORT_KEY_POSITION, this.mCurrentPositionMs);
        reportEvent(REPORT_EVENT_RICH_MEDIA_FEATURE_DATA_CALLBACK, tPProperties);
    }

    private void reportFeatureSelect(com.tencent.thumbplayer.richmedia.plugins.TPRichMediaSynchronizerReportPlugin.TPSelectFeatureParam tPSelectFeatureParam, java.lang.String str, int i17) {
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        tPProperties.put("duration", android.os.SystemClock.elapsedRealtime() - tPSelectFeatureParam.startTimeMs);
        tPProperties.put("code", i17);
        tPProperties.put("seq", tPSelectFeatureParam.seq);
        tPProperties.put(REPORT_KEY_FEATURE_TYPE, str);
        tPProperties.put(REPORT_KEY_POSITION, this.mCurrentPositionMs);
        reportEvent(REPORT_EVENT_RICH_MEDIA_FEATURE_SELECT, tPProperties);
    }

    private void reportRichMediaPrepared(int i17) {
        if (this.mPrepareStartTimeMs <= 0) {
            return;
        }
        com.tencent.thumbplayer.utils.TPProperties tPProperties = new com.tencent.thumbplayer.utils.TPProperties();
        tPProperties.put("duration", android.os.SystemClock.elapsedRealtime() - this.mPrepareStartTimeMs);
        tPProperties.put("code", i17);
        reportEvent(REPORT_EVENT_RICH_MEDIA_PREPARE, tPProperties);
        this.mPrepareStartTimeMs = 0L;
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onAttach() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onDetach() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onEvent(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        this.mLock.writeLock().lock();
        switch (i17) {
            case 300:
                onStartPrepare();
                break;
            case 301:
                onPrepared(obj);
                break;
            case 302:
                onStartSelect(i18);
                break;
            case 303:
                onSelectDone(i18);
                break;
            case 304:
                onStartDeselect(i18);
                break;
            case 305:
                onDeselectDone(i18);
                break;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET /* 306 */:
                onReset();
                break;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                onRelease();
                break;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                onError(i18);
                break;
            case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                onSetUrl(str);
                break;
            case 310:
                onFeatureFailure(i18, i19);
                break;
            case 311:
                onUpdatePosition(i18);
                break;
        }
        this.mLock.writeLock().unlock();
    }
}
