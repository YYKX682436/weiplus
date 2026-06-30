package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPBaseReporter implements com.tencent.thumbplayer.tplayer.reportv2.ITPReporter {
    protected static final java.lang.String CONFIG_NAME_BUFFER_MAX_DURATION = "buffermaxtotaldurationms";
    protected static final java.lang.String CONFIG_NAME_BUFFER_MIN_DURATION = "buffermintotaldurationms";
    protected static final java.lang.String CONFIG_NAME_BUFFER_TYPE = "buffertype";
    protected static final java.lang.String CONFIG_NAME_MAX_BUFFERING_TIME = "maxbufferingtimems";
    protected static final java.lang.String CONFIG_NAME_MIN_BUFFERING_DURATION = "minbufferingdurationms";
    protected static final java.lang.String CONFIG_NAME_MIN_BUFFERING_TIME = "minbufferingtimems";
    protected static final java.lang.String CONFIG_NAME_PRELOAD_DURATION = "preloadtotaldurationms";
    protected static final java.lang.String CONFIG_NAME_REDUCE_LATENCY_ACTION = "reducelatencyaction";
    protected static final java.lang.String CONFIG_NAME_REDUCE_LATENCY_SPEED = "reducelatencyspeed";
    private static final java.lang.String REPORT_CACHE_NAME = "TPReporterCache";
    private static final java.lang.String TAG = "TPBaseReporter";
    private static com.tencent.thumbplayer.utils.TPDiskReadWrite mCache;
    protected android.content.Context mContext;
    protected com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter mPlayerInfoGetter;
    protected java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener>> mReportChannelListenerList;
    protected com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter mReportInfoGetter;
    protected com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams mReporterInitParams;
    protected com.tencent.thumbplayer.tplayer.reportv2.TPReportUtils mReportUtils = null;
    protected int mReportEventSeq = 0;
    protected java.util.Map<java.lang.String, java.lang.Object> mPlayerConfigKeyValueMap = new java.util.HashMap();

    private static java.lang.String analyseReportIdFromCacheKey(java.lang.String str) {
        for (java.lang.reflect.Field field : com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.class.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType() == java.lang.String.class) {
                try {
                    java.lang.String str2 = (java.lang.String) field.get(com.tencent.thumbplayer.tplayer.reportv2.TPReportEventId.class);
                    if (str2 != null && str.endsWith(str2)) {
                        return str2;
                    }
                } catch (java.lang.IllegalAccessException unused) {
                    com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "fail to get value of field(" + field.getName() + ") in TPReportEventId.class)");
                }
            }
        }
        return null;
    }

    public static void classifyMapIntoRsvExtMapAndExtMap(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (isValidRsvExtKey(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            } else if (isValidExtKey(entry.getKey())) {
                map3.put(entry.getKey(), entry.getValue());
            } else {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "invalid extend info <" + entry.getKey() + ", " + entry.getValue() + "> from ITPReportInfoGetter, key valid!");
            }
        }
    }

    private synchronized void createLocalCache(android.content.Context context, java.lang.String str) {
        if (mCache != null) {
            return;
        }
        mCache = new com.tencent.thumbplayer.utils.TPDiskReadWrite(this.mContext, str);
    }

    public static boolean isValidExtKey(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ext_");
    }

    public static boolean isValidRsvExtKey(java.lang.String str) {
        if (str == null) {
            return false;
        }
        for (java.lang.reflect.Field field : com.tencent.thumbplayer.api.reportv2.TPExtendCommonKey.class.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                java.lang.String str2 = (java.lang.String) field.get(com.tencent.thumbplayer.api.reportv2.TPExtendCommonKey.class);
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            } catch (java.lang.IllegalAccessException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
        return false;
    }

    private synchronized void reportAndClearCache() {
        com.tencent.thumbplayer.utils.TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = tPDiskReadWrite.getKeylist().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            java.lang.String analyseReportIdFromCacheKey = analyseReportIdFromCacheKey(next);
            com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams = (com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams) mCache.readFile(next);
            if (analyseReportIdFromCacheKey != null && tPCommonParams != null) {
                java.util.Map<java.lang.String, java.lang.String> fillParamsToMap = tPCommonParams.fillParamsToMap();
                reportToExternalReportChannelIfNeed(analyseReportIdFromCacheKey, fillParamsToMap);
                com.tencent.thumbplayer.common.report.TPBeaconReportWrapper.trackCustomKVEvent(analyseReportIdFromCacheKey, fillParamsToMap);
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "report cached reportEvent, key:" + next);
            }
        }
        mCache.clearAllFile();
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
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

    public synchronized void cacheReport(java.lang.String str, com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams tPCommonParams) {
        if (mCache != null && this.mReporterInitParams.mNeedReportToBeacon.booleanValue()) {
            mCache.writeFile(tPCommonParams.getFlowId() + str, tPCommonParams);
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "write cache, flowid:" + tPCommonParams.getFlowId() + ", reportId:" + str);
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "mCache is null or does not need to report to beacon, no caching!");
    }

    public void dumpMapInfo(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(":{");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            sb6.append(key);
            sb6.append(":");
            sb6.append(value);
            sb6.append(",");
        }
        sb6.append("}");
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, sb6.toString());
    }

    public void fillInitExtReportInfoToCommonParams(com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord) {
        com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter iTPReportInfoGetter = this.mReportInfoGetter;
        if (iTPReportInfoGetter == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> initExtendReportInfo = iTPReportInfoGetter.getInitExtendReportInfo();
        if (initExtendReportInfo == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "fillInitExtReportInfoToCommonParams fail, initExtendReportInfo is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        classifyMapIntoRsvExtMapAndExtMap(initExtendReportInfo, hashMap, hashMap2);
        tPBaseReportParamRecord.mCommonParams.setInitRsvExtFields(hashMap);
        tPBaseReportParamRecord.mCommonParams.setInitExtFields(hashMap2);
    }

    public void fillStreamInfoToCommonParams(com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord tPBaseReportParamRecord) {
        com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams generalPlayFlowParams = iTPPlayerInfoGetter.getGeneralPlayFlowParams();
        tPBaseReportParamRecord.mCommonParams.setFlowId(this.mReporterInitParams.mPlayFlowId);
        tPBaseReportParamRecord.mCommonParams.setDurationMs(generalPlayFlowParams.mPlayerBaseMediaParams.mDurationMs);
        tPBaseReportParamRecord.mCommonParams.setHlsSourceType(generalPlayFlowParams.mPlayerBaseMediaParams.mHlsSourceType);
        tPBaseReportParamRecord.mCommonParams.setPlayerType(this.mReporterInitParams.mPlayerType);
        tPBaseReportParamRecord.mCommonParams.setUrlProtocol(this.mReporterInitParams.mUrlProtocol);
        tPBaseReportParamRecord.mCommonParams.setContainerFormat(generalPlayFlowParams.mPlayerBaseMediaParams.mFormatContainer);
        tPBaseReportParamRecord.mCommonParams.setVideoEncodeFmt(generalPlayFlowParams.mPlayerBaseMediaParams.mVideoEncodeFormat);
        tPBaseReportParamRecord.mCommonParams.setAudioEncodeFmt(generalPlayFlowParams.mPlayerBaseMediaParams.mAudioEncodeFormat);
        tPBaseReportParamRecord.mCommonParams.setSubtitleEncodeFmt(generalPlayFlowParams.mPlayerBaseMediaParams.mSubtitleEncodeFormat);
        tPBaseReportParamRecord.mCommonParams.setStreamBitrateKbps(generalPlayFlowParams.mPlayerBaseMediaParams.mVideoStreamBitrateKbps);
        tPBaseReportParamRecord.mCommonParams.setVideoFrameRate(generalPlayFlowParams.mPlayerBaseMediaParams.mVideoFrameRate);
        tPBaseReportParamRecord.mCommonParams.setUrl(this.mReporterInitParams.mOriginalUrl);
        tPBaseReportParamRecord.mCommonParams.setResolution("" + generalPlayFlowParams.mPlayerBaseMediaParams.mVideoWidth + "*" + generalPlayFlowParams.mPlayerBaseMediaParams.mVideoHeight);
        tPBaseReportParamRecord.mCommonParams.setDataTransportVer(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getNativeLibVersion());
        tPBaseReportParamRecord.mCommonParams.setSpeedKbps(tPBaseReportParamRecord.mDTSpeedKbps);
        tPBaseReportParamRecord.mCommonParams.setDataTransportProtocolVer(tPBaseReportParamRecord.mDTProtocolVer);
        tPBaseReportParamRecord.mCommonParams.setCdnUip(tPBaseReportParamRecord.mDTUserIp);
        tPBaseReportParamRecord.mCommonParams.setCdnIp(tPBaseReportParamRecord.mDTCdnIp);
        tPBaseReportParamRecord.mCommonParams.setUseDataTransport(this.mReporterInitParams.mIsUseProxy);
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_BUFFER_MIN_DURATION, java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_BUFFER_MAX_DURATION, java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_PRELOAD_DURATION, java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_MIN_BUFFERING_DURATION, java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingDurationMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_MIN_BUFFERING_TIME, java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMinBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_MAX_BUFFERING_TIME, java.lang.Long.valueOf(generalPlayFlowParams.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_REDUCE_LATENCY_ACTION, java.lang.Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyAction));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_REDUCE_LATENCY_SPEED, java.lang.Float.valueOf(generalPlayFlowParams.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.mPlayerConfigKeyValueMap.put(CONFIG_NAME_BUFFER_TYPE, java.lang.Integer.valueOf(generalPlayFlowParams.mPlayerConfigParams.mBufferType));
        try {
            tPBaseReportParamRecord.mCommonParams.setPlayerConfig(new org.json.JSONObject(this.mPlayerConfigKeyValueMap).toString());
        } catch (java.lang.NullPointerException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParamsFromCore(boolean z17) {
        com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter != null) {
            return iTPPlayerInfoGetter.getDynamicStatisticParams(z17);
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "getDynamicStatParamsFromCore failed, mPlayerInfoGetter is null, return default value");
        return new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams();
    }

    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParamsFromEventInfo(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams;
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStopEventInfo) {
            tPDynamicStatisticParams = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStopEventInfo) baseEventInfo).getDynamicStatisticParams();
        } else if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayResetEventInfo) {
            tPDynamicStatisticParams = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayResetEventInfo) baseEventInfo).getDynamicStatisticParams();
        } else if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo) {
            tPDynamicStatisticParams = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo).getDynamicStatisticParams();
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "event info do not have dynamicStatisticParams");
            tPDynamicStatisticParams = null;
        }
        return tPDynamicStatisticParams == null ? new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams() : tPDynamicStatisticParams;
    }

    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParamsFromCore() {
        com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter = this.mPlayerInfoGetter;
        if (iTPPlayerInfoGetter != null) {
            return iTPPlayerInfoGetter.getGeneralPlayFlowParams();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "getGeneralPlayFlowParams failed, mPlayerInfoGetter is null, return default value");
        return new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams();
    }

    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParamsFromEventInfo(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams;
        if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStopEventInfo) {
            tPGeneralPlayFlowParams = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayStopEventInfo) baseEventInfo).getGeneralPlayFlowParams();
        } else if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayResetEventInfo) {
            tPGeneralPlayFlowParams = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayResetEventInfo) baseEventInfo).getGeneralPlayFlowParams();
        } else if (baseEventInfo instanceof com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo) {
            tPGeneralPlayFlowParams = ((com.tencent.thumbplayer.event.TPPlayerEventInfo.PlayErrorEventInfo) baseEventInfo).getGeneralPlayFlowParams();
        } else {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "event info do not have generalPlayFlowParams");
            tPGeneralPlayFlowParams = null;
        }
        return tPGeneralPlayFlowParams == null ? new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams() : tPGeneralPlayFlowParams;
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void init(android.content.Context context, com.tencent.thumbplayer.tplayer.reportv2.TPReporterInitParams tPReporterInitParams) {
        this.mContext = context;
        this.mReportChannelListenerList = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mReporterInitParams = tPReporterInitParams;
        this.mReportUtils = new com.tencent.thumbplayer.tplayer.reportv2.TPReportUtils(context);
        createLocalCache(context, REPORT_CACHE_NAME);
        reportAndClearCache();
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void onEvent(int i17, com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
    }

    public synchronized void removeCachedReport(java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.utils.TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite == null) {
            return;
        }
        tPDiskReadWrite.rmFile(str + str2);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "remove cache, flowid:" + str + ", reportId:" + str2);
    }

    public synchronized void removeCachedReports(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = tPDiskReadWrite.getKeylist().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (next.startsWith(str)) {
                mCache.rmFile(next);
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "remove cache, key:" + next);
            }
        }
    }

    public void reportToBeaconIfNeed(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.mReporterInitParams.mNeedReportToBeacon.booleanValue()) {
            com.tencent.thumbplayer.common.report.TPBeaconReportWrapper.trackCustomKVEvent(str, map);
            return;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "eventId:" + str + ", no need to report to beacon because of sampling");
    }

    public void reportToExternalReportChannelIfNeed(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.mReportChannelListenerList.size() == 0) {
            return;
        }
        for (int i17 = 0; i17 < this.mReportChannelListenerList.size(); i17++) {
            com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener iTPReportChannelListener = this.mReportChannelListenerList.get(i17).get();
            if (iTPReportChannelListener != null) {
                iTPReportChannelListener.reportEvent(str, map);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void reset() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener>> copyOnWriteArrayList = this.mReportChannelListenerList;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.mReportChannelListenerList = null;
        }
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void setPlayerInfoGetter(com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter iTPPlayerInfoGetter) {
        this.mPlayerInfoGetter = iTPPlayerInfoGetter;
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.ITPReporter
    public void setReportInfoGetter(com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter iTPReportInfoGetter) {
        this.mReportInfoGetter = iTPReportInfoGetter;
    }
}
