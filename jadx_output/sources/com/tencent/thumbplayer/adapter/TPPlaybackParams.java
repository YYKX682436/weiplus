package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlaybackParams {
    private static final java.lang.String TAG = "TPPlaybackParams";
    private float mAudioGainRatio;
    private java.lang.String mAudioNormalizeVolumeParams;
    private com.tencent.thumbplayer.adapter.TPPlaybackParams.LoopbackAttribute mLoopback;
    private boolean mOutputMute;
    private float mSpeedRatio;
    private java.lang.Object mSurfaceObj;
    private com.tencent.thumbplayer.api.TPProgramInfo mTpProgramInfo;
    private int mSurfaceType = 0;
    private int trackId = -1;
    private java.util.Map<java.lang.String, com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute> mSubtitleSources = new java.util.HashMap(0);
    private java.util.Map<java.lang.String, com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute> mAudioTrackSources = new java.util.HashMap(0);
    private com.tencent.thumbplayer.adapter.TPPlayerDataSource mDataSource = new com.tencent.thumbplayer.adapter.TPPlayerDataSource();
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.api.TPOptionalParam> mOptionalParams = new java.util.HashMap(0);
    private java.util.Map<java.lang.Integer, com.tencent.thumbplayer.api.TPTrackInfo> mTpSelectedTypeTrackInfoMap = new java.util.HashMap(0);
    private java.util.ArrayList<com.tencent.thumbplayer.api.TPTrackInfo> mTpTrackInfoList = new java.util.ArrayList<>();
    private java.util.ArrayList<com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute> mSelectTrackAttributes = new java.util.ArrayList<>();

    /* loaded from: classes16.dex */
    public static class AudioTrackAttribute {
        public java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> audioTrackParams;
        public java.util.Map<java.lang.String, java.lang.String> httpHeader;
        public java.lang.String name;
        public java.lang.String url;
    }

    /* loaded from: classes16.dex */
    public static class LoopbackAttribute {
        public long endPositionMs;
        public boolean isLoopback;
        public long startPositionMs;
    }

    /* loaded from: classes16.dex */
    public static class SelectTrackAttribute {
        public long opaque;
        public int trackIndex;
        public com.tencent.thumbplayer.api.TPTrackInfo trackInfo;
    }

    /* loaded from: classes16.dex */
    public static class SubtitleAttribute {
        public java.util.Map<java.lang.String, java.lang.String> httpHeader;
        public java.lang.String mimeType;
        public java.lang.String name;
        public java.lang.String url;
    }

    private void generateTrackInfoBySubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.trackId++;
        com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = new com.tencent.thumbplayer.api.TPTrackInfo();
        tPTrackInfo.trackType = 3;
        tPTrackInfo.name = str3;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.mTpTrackInfoList.add(tPTrackInfo);
    }

    private void generateTrackInfoByTrackSource(java.lang.String str, java.lang.String str2) {
        this.trackId++;
        com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = new com.tencent.thumbplayer.api.TPTrackInfo();
        tPTrackInfo.trackType = 2;
        tPTrackInfo.name = str2;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.mTpTrackInfoList.add(tPTrackInfo);
    }

    public void addAudioTrackSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute audioTrackAttribute = new com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute();
        audioTrackAttribute.url = str;
        audioTrackAttribute.httpHeader = map;
        audioTrackAttribute.name = str2;
        audioTrackAttribute.audioTrackParams = list;
        this.mAudioTrackSources.put(str, audioTrackAttribute);
        generateTrackInfoByTrackSource(str, str2);
    }

    public void addOptionalParams(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam != null) {
            this.mOptionalParams.put(java.lang.Integer.valueOf(tPOptionalParam.getKey()), tPOptionalParam);
        }
    }

    public void addSelectedTrackInfo(int i17, long j17, com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo) {
        this.mTpSelectedTypeTrackInfoMap.put(java.lang.Integer.valueOf(tPTrackInfo.getTrackType()), tPTrackInfo);
        if (i17 < 0 || i17 >= this.mTpTrackInfoList.size()) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "track Index:" + i17 + " is invalid, trackInfoList size:" + this.mTpTrackInfoList.size());
            return;
        }
        com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute selectTrackAttribute = new com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute();
        selectTrackAttribute.trackIndex = i17;
        selectTrackAttribute.opaque = j17;
        java.util.Iterator<com.tencent.thumbplayer.api.TPTrackInfo> it = this.mTpTrackInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.api.TPTrackInfo next = it.next();
            if (next.trackType == tPTrackInfo.trackType) {
                if ((android.text.TextUtils.isEmpty(next.name) && android.text.TextUtils.isEmpty(tPTrackInfo.name)) || next.name.equals(tPTrackInfo.name)) {
                    next.isSelected = true;
                    selectTrackAttribute.trackInfo = next;
                } else {
                    next.isSelected = false;
                }
            }
        }
        this.mSelectTrackAttributes.add(selectTrackAttribute);
    }

    public void addSubtitleSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute subtitleAttribute = new com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute();
        subtitleAttribute.url = str;
        subtitleAttribute.httpHeader = map;
        subtitleAttribute.mimeType = str2;
        subtitleAttribute.name = str3;
        this.mSubtitleSources.put(str, subtitleAttribute);
        generateTrackInfoBySubtitleSource(str, str2, str3);
    }

    public float audioGainRatio() {
        return this.mAudioGainRatio;
    }

    public java.lang.String audioNormalizeVolumeParams() {
        return this.mAudioNormalizeVolumeParams;
    }

    public java.util.List<com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute> audioTrackSources() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mAudioTrackSources.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.tencent.thumbplayer.adapter.TPPlaybackParams.AudioTrackAttribute>> it = this.mAudioTrackSources.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public com.tencent.thumbplayer.adapter.TPPlayerDataSource dataSource() {
        return this.mDataSource;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam getOptionalParam(int i17) {
        return this.mOptionalParams.get(java.lang.Integer.valueOf(i17));
    }

    public com.tencent.thumbplayer.api.TPProgramInfo getSelectProgramInfo() {
        return this.mTpProgramInfo;
    }

    public java.util.ArrayList<com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute> getSelectTrackAttributes() {
        return this.mSelectTrackAttributes;
    }

    public com.tencent.thumbplayer.api.TPTrackInfo getTrackInfoByType(int i17) {
        return this.mTpSelectedTypeTrackInfoMap.get(java.lang.Integer.valueOf(i17));
    }

    public java.util.ArrayList<com.tencent.thumbplayer.api.TPTrackInfo> getTrackInfos() {
        return this.mTpTrackInfoList;
    }

    public com.tencent.thumbplayer.adapter.TPPlaybackParams.LoopbackAttribute loopback() {
        return this.mLoopback;
    }

    public java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> optionalParams() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mOptionalParams.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.tencent.thumbplayer.api.TPOptionalParam>> it = this.mOptionalParams.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public boolean outputMute() {
        return this.mOutputMute;
    }

    public void reset() {
        this.mSubtitleSources.clear();
        this.mAudioTrackSources.clear();
        this.mOutputMute = false;
        this.mAudioGainRatio = 1.0f;
        this.mAudioNormalizeVolumeParams = "";
        this.mSpeedRatio = 1.0f;
        this.mTpSelectedTypeTrackInfoMap.clear();
        this.mSurfaceObj = null;
        this.mSurfaceType = 0;
        this.mOptionalParams.clear();
        this.mDataSource = new com.tencent.thumbplayer.adapter.TPPlayerDataSource();
        this.mLoopback = null;
        this.mTpProgramInfo = null;
        this.trackId = -1;
        this.mTpTrackInfoList.clear();
        this.mSelectTrackAttributes.clear();
    }

    public void setAudioGainRatio(float f17) {
        this.mAudioGainRatio = f17;
    }

    public void setAudioNormalizeVolumeParams(java.lang.String str) {
        this.mAudioNormalizeVolumeParams = str;
    }

    public void setDataSource(java.lang.String str) {
        this.mDataSource.setUrl(str);
    }

    public void setDeselectTrackInfo(int i17, long j17, com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo) {
        this.mTpSelectedTypeTrackInfoMap.remove(java.lang.Integer.valueOf(tPTrackInfo.getTrackType()));
        if (i17 < 0 || i17 >= this.mTpTrackInfoList.size()) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "track Index:" + i17 + " is invalid, trackInfoList size:" + this.mTpTrackInfoList.size());
            return;
        }
        java.util.Iterator<com.tencent.thumbplayer.api.TPTrackInfo> it = this.mTpTrackInfoList.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.api.TPTrackInfo next = it.next();
            if (next.trackType == tPTrackInfo.trackType && ((android.text.TextUtils.isEmpty(next.name) && android.text.TextUtils.isEmpty(tPTrackInfo.name)) || next.name.equals(tPTrackInfo.name))) {
                next.isSelected = false;
                break;
            }
        }
        java.util.Iterator<com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute> it6 = this.mSelectTrackAttributes.iterator();
        while (it6.hasNext()) {
            com.tencent.thumbplayer.adapter.TPPlaybackParams.SelectTrackAttribute next2 = it6.next();
            com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo2 = next2.trackInfo;
            if (tPTrackInfo2 != null && tPTrackInfo2.equals(tPTrackInfo)) {
                this.mSelectTrackAttributes.remove(next2);
                return;
            }
        }
    }

    public void setLoopback(boolean z17) {
        if (this.mLoopback == null) {
            this.mLoopback = new com.tencent.thumbplayer.adapter.TPPlaybackParams.LoopbackAttribute();
        }
        com.tencent.thumbplayer.adapter.TPPlaybackParams.LoopbackAttribute loopbackAttribute = this.mLoopback;
        loopbackAttribute.isLoopback = z17;
        loopbackAttribute.startPositionMs = 0L;
        loopbackAttribute.endPositionMs = -1L;
    }

    public void setOutputMute(boolean z17) {
        this.mOutputMute = z17;
    }

    public void setSelectProgramInfo(com.tencent.thumbplayer.api.TPProgramInfo tPProgramInfo) {
        this.mTpProgramInfo = tPProgramInfo;
    }

    public void setSpeedRatio(float f17) {
        this.mSpeedRatio = f17;
    }

    public void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17) {
        this.mSurfaceObj = surface;
        this.mSurfaceType = this.mSurfaceType;
    }

    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.mSurfaceObj = surfaceHolder;
    }

    public float speedRatio() {
        return this.mSpeedRatio;
    }

    public java.util.List<com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute> subtitleSources() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mSubtitleSources.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.tencent.thumbplayer.adapter.TPPlaybackParams.SubtitleAttribute>> it = this.mSubtitleSources.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public boolean supportClip() {
        return dataSource() != null && dataSource().getType() == 2;
    }

    public java.lang.Object surface() {
        return this.mSurfaceObj;
    }

    public int surfaceType() {
        return this.mSurfaceType;
    }

    public boolean validDataSource() {
        com.tencent.thumbplayer.adapter.TPPlayerDataSource tPPlayerDataSource = this.mDataSource;
        return tPPlayerDataSource != null && tPPlayerDataSource.isValid();
    }

    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mDataSource.setUrl(str);
        this.mDataSource.setHttpHeaders(map);
    }

    public void setDataSource(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mDataSource.setTpUrlDataSource(tPUrlDataSource);
        this.mDataSource.setHttpHeaders(map);
    }

    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mDataSource.setAssetFileDescriptor(assetFileDescriptor);
    }

    public void setLoopback(boolean z17, long j17, long j18) {
        if (this.mLoopback == null) {
            this.mLoopback = new com.tencent.thumbplayer.adapter.TPPlaybackParams.LoopbackAttribute();
        }
        com.tencent.thumbplayer.adapter.TPPlaybackParams.LoopbackAttribute loopbackAttribute = this.mLoopback;
        loopbackAttribute.isLoopback = z17;
        loopbackAttribute.startPositionMs = j17;
        loopbackAttribute.endPositionMs = j18;
    }

    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.mDataSource.setParcelFileDescriptor(parcelFileDescriptor);
    }

    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        this.mDataSource.setMediaClipInfo(iTPMediaAsset);
    }
}
