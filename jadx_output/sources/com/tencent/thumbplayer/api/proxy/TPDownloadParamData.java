package com.tencent.thumbplayer.api.proxy;

/* loaded from: classes16.dex */
public class TPDownloadParamData {
    public java.lang.String audioTrackKeyId;
    private java.lang.String[] bakUrl;
    private int bandwidthLevel;
    private java.lang.String base;
    private int clipCount;
    private int clipNo;
    private java.lang.String currentFormat;
    private int currentFormatID;
    private java.lang.String decKey;
    private java.util.List<java.util.Map<java.lang.String, java.lang.String>> defInfoList;
    private int dlType;
    private java.lang.String downloadFileID;
    private int endTimeMS;
    private int expectDelay;
    private java.util.Map<java.lang.String, java.lang.String> extInfoMap;
    private boolean extraParam;
    private long fileDuration;
    private java.lang.String fileMD5;
    private long fileSize;
    public java.lang.String flowId;
    private java.util.Map<java.lang.String, java.lang.Integer> formatInfo;
    private int fp2p;
    private java.util.List<java.util.Map<java.lang.String, java.lang.String>> headersList;
    private boolean isCacheCopyFirst;
    private boolean isCharge;
    private boolean isNeedFlowControl;
    private boolean isOffline;
    private java.lang.String linkVid;
    private java.lang.String m3u8;
    private boolean needEncryptCache;
    private java.lang.String nonce;
    private java.lang.String pcdnChargeId;
    private java.util.ArrayList<java.lang.String> pcdnUrlList;
    private java.util.ArrayList<java.lang.Integer> pcdnVtList;
    private java.lang.String playDefinition;
    private long preloadDuration;
    private long preloadHttpStartTimeMs;
    private long preloadSize;
    private java.lang.String randoms;
    private java.lang.String savePath;
    private java.lang.String sceneId;
    private java.util.List<java.util.Map<java.lang.String, java.lang.String>> secondaryM3u8List;
    private int starTimeMS;
    private int taskType;
    private int testid;

    /* renamed from: tm, reason: collision with root package name */
    private long f215541tm;
    public java.lang.String url;
    private java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> urlCdnidHttpHeaderList;
    private java.util.ArrayList<java.lang.String> urlCdnidList;
    private java.util.ArrayList<java.lang.String> urlCookieList;
    private int urlExpireTime;
    private java.util.ArrayList<java.lang.String> urlHostList;
    private java.lang.String vid;

    public TPDownloadParamData() {
        this.clipCount = 1;
        this.clipNo = 1;
        this.fp2p = 1;
        this.isOffline = false;
        this.preloadHttpStartTimeMs = -1L;
        this.isCacheCopyFirst = false;
        this.isNeedFlowControl = false;
    }

    public java.lang.String getAudioTrackKeyId() {
        return this.audioTrackKeyId;
    }

    public java.lang.String[] getBakUrl() {
        return this.bakUrl;
    }

    public int getBandwidthLevel() {
        return this.bandwidthLevel;
    }

    public java.lang.String getBase() {
        return this.base;
    }

    public int getClipCount() {
        return this.clipCount;
    }

    public int getClipNo() {
        return this.clipNo;
    }

    public java.lang.String getCurrentFormat() {
        return this.currentFormat;
    }

    public int getCurrentFormatID() {
        return this.currentFormatID;
    }

    public java.lang.String getDecKey() {
        return this.decKey;
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getDefInfoList() {
        return this.defInfoList;
    }

    public int getDlType() {
        return this.dlType;
    }

    public java.lang.String getDownloadFileID() {
        return this.downloadFileID;
    }

    public int getEndTimeMS() {
        return this.endTimeMS;
    }

    public int getExceptDelay() {
        return this.expectDelay;
    }

    public java.util.Map<java.lang.String, java.lang.String> getExtInfoMap() {
        return this.extInfoMap;
    }

    public long getFileDuration() {
        return this.fileDuration;
    }

    public java.lang.String getFileMD5() {
        return this.fileMD5;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public java.lang.String getFlowId() {
        return this.flowId;
    }

    public java.util.Map<java.lang.String, java.lang.Integer> getFormatInfo() {
        return this.formatInfo;
    }

    public int getFp2p() {
        return this.fp2p;
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getHeadersList() {
        return this.headersList;
    }

    public java.lang.String getLinkVid() {
        return this.linkVid;
    }

    public java.lang.String getM3u8() {
        return this.m3u8;
    }

    public java.lang.String getNonce() {
        return this.nonce;
    }

    public java.lang.String getPcdnChargeId() {
        return this.pcdnChargeId;
    }

    public java.util.ArrayList<java.lang.String> getPcdnUrlList() {
        return this.pcdnUrlList;
    }

    public java.util.ArrayList<java.lang.Integer> getPcdnVtList() {
        return this.pcdnVtList;
    }

    public java.lang.String getPlayDefinition() {
        return this.playDefinition;
    }

    public long getPreloadDuration() {
        return this.preloadDuration;
    }

    public long getPreloadHttpStartTimeMs() {
        return this.preloadHttpStartTimeMs;
    }

    public long getPreloadSize() {
        return this.preloadSize;
    }

    public java.lang.String getRandoms() {
        return this.randoms;
    }

    public java.lang.String getSavePath() {
        return this.savePath;
    }

    public java.lang.String getSceneId() {
        return this.sceneId;
    }

    public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getSecondaryM3u8List() {
        return this.secondaryM3u8List;
    }

    public int getStarTimeMS() {
        return this.starTimeMS;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public int getTestid() {
        return this.testid;
    }

    public long getTm() {
        return this.f215541tm;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> getUrlCdnidHttpHeaderList() {
        return this.urlCdnidHttpHeaderList;
    }

    public java.util.ArrayList<java.lang.String> getUrlCdnidList() {
        return this.urlCdnidList;
    }

    public java.util.ArrayList<java.lang.String> getUrlCookieList() {
        return this.urlCookieList;
    }

    public int getUrlExpireTime() {
        return this.urlExpireTime;
    }

    public java.util.ArrayList<java.lang.String> getUrlHostList() {
        return this.urlHostList;
    }

    public java.lang.String getVid() {
        return this.vid;
    }

    public boolean isCacheCopyFirst() {
        return this.isCacheCopyFirst;
    }

    public boolean isCharge() {
        return this.isCharge;
    }

    public boolean isExtraParam() {
        return this.extraParam;
    }

    public boolean isNeedEncryptCache() {
        return this.needEncryptCache;
    }

    public boolean isNeedFlowControl() {
        return this.isNeedFlowControl;
    }

    public boolean isOffline() {
        return this.isOffline;
    }

    public void setAudioTrackKeyId(java.lang.String str) {
        this.audioTrackKeyId = str;
    }

    public void setBakUrl(java.lang.String[] strArr) {
        this.bakUrl = strArr;
    }

    public void setBandwidthLevel(int i17) {
        this.bandwidthLevel = i17;
    }

    public void setBase(java.lang.String str) {
        this.base = str;
    }

    public void setCacheCopyFirst(boolean z17) {
        this.isCacheCopyFirst = z17;
    }

    public void setCharge(boolean z17) {
        this.isCharge = z17;
    }

    public void setClipCount(int i17) {
        this.clipCount = i17;
    }

    public void setClipNo(int i17) {
        this.clipNo = i17;
    }

    public void setCurrentFormat(java.lang.String str) {
        this.currentFormat = str;
    }

    public void setCurrentFormatID(int i17) {
        this.currentFormatID = i17;
    }

    public void setDecKey(java.lang.String str) {
        this.decKey = str;
    }

    public void setDefInfoList(java.util.List<java.util.Map<java.lang.String, java.lang.String>> list) {
        this.defInfoList = list;
    }

    public void setDlType(int i17) {
        this.dlType = i17;
    }

    public void setDownloadFileID(java.lang.String str) {
        this.downloadFileID = str;
    }

    public void setEndTimeMS(int i17) {
        this.endTimeMS = i17;
    }

    public void setExpectDelay(int i17) {
        this.expectDelay = i17;
    }

    public void setExtInfoMap(java.util.Map<java.lang.String, java.lang.String> map) {
        this.extInfoMap = map;
    }

    public void setExtraParam(boolean z17) {
        this.extraParam = z17;
    }

    public void setFileDuration(long j17) {
        this.fileDuration = j17;
    }

    public void setFileMD5(java.lang.String str) {
        this.fileMD5 = str;
    }

    public void setFileSize(long j17) {
        this.fileSize = j17;
    }

    public void setFlowId(java.lang.String str) {
        this.flowId = str;
    }

    public void setFormatInfo(java.util.Map<java.lang.String, java.lang.Integer> map) {
        this.formatInfo = map;
    }

    public void setFp2p(int i17) {
        this.fp2p = i17;
    }

    public void setHeadersList(java.util.List<java.util.Map<java.lang.String, java.lang.String>> list) {
        this.headersList = list;
    }

    public void setLinkVid(java.lang.String str) {
        this.linkVid = str;
    }

    public void setM3u8(java.lang.String str) {
        this.m3u8 = str;
    }

    public void setNeedEncryptCache(boolean z17) {
        this.needEncryptCache = z17;
    }

    public void setNeedFlowControl(boolean z17) {
        this.isNeedFlowControl = z17;
    }

    public void setNonce(java.lang.String str) {
        this.nonce = str;
    }

    public void setOffline(boolean z17) {
        this.isOffline = z17;
    }

    public void setPcdnChargeId(java.lang.String str) {
        this.pcdnChargeId = str;
    }

    public void setPcdnUrlList(java.util.ArrayList<java.lang.String> arrayList) {
        this.pcdnUrlList = arrayList;
    }

    public void setPcdnVtList(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.pcdnVtList = arrayList;
    }

    public void setPlayDefinition(java.lang.String str) {
        this.playDefinition = str;
    }

    public void setPreloadDuration(long j17) {
        this.preloadDuration = j17;
    }

    public void setPreloadHttpStartTimeMs(long j17) {
        this.preloadHttpStartTimeMs = j17;
    }

    public void setPreloadSize(long j17) {
        this.preloadSize = j17;
    }

    public void setRandoms(java.lang.String str) {
        this.randoms = str;
    }

    public void setSavePath(java.lang.String str) {
        this.savePath = str;
    }

    public void setSceneId(java.lang.String str) {
        this.sceneId = str;
    }

    public void setSecondaryM3u8List(java.util.List<java.util.Map<java.lang.String, java.lang.String>> list) {
        this.secondaryM3u8List = list;
    }

    public void setStarTimeMS(int i17) {
        this.starTimeMS = i17;
    }

    public void setTaskType(int i17) {
        this.taskType = i17;
    }

    public void setTestid(int i17) {
        this.testid = i17;
    }

    public void setTm(long j17) {
        this.f215541tm = j17;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }

    public void setUrlCdnidList(java.util.ArrayList<java.lang.String> arrayList) {
        this.urlCdnidList = arrayList;
    }

    public void setUrlCookieList(java.util.ArrayList<java.lang.String> arrayList) {
        this.urlCookieList = arrayList;
    }

    public void setUrlExpireTime(int i17) {
        this.urlExpireTime = i17;
    }

    public void setUrlHostList(java.util.ArrayList<java.lang.String> arrayList) {
        this.urlHostList = arrayList;
    }

    public void setVid(java.lang.String str) {
        this.vid = str;
    }

    public void setUrlCdnidList(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList2) {
        this.urlCdnidList = arrayList;
        this.urlCdnidHttpHeaderList = arrayList2;
    }

    public TPDownloadParamData(int i17) {
        this(null, i17);
    }

    public TPDownloadParamData(java.lang.String str) {
        this(str, 0);
    }

    public TPDownloadParamData(java.lang.String str, int i17) {
        this.clipCount = 1;
        this.clipNo = 1;
        this.fp2p = 1;
        this.isOffline = false;
        this.preloadHttpStartTimeMs = -1L;
        this.isCacheCopyFirst = false;
        this.isNeedFlowControl = false;
        this.downloadFileID = str;
        this.dlType = i17;
    }
}
