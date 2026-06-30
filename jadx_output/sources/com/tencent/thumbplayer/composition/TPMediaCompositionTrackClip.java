package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaCompositionTrackClip extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaTrackClip, java.io.Serializable {
    private int mClipId;
    private java.lang.String mClipPath;
    private int mClipType;
    private long mEndTime;
    private long mOriginalDuration;
    private long mStartPosition;
    private long mStartTime;

    private TPMediaCompositionTrackClip() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public com.tencent.thumbplayer.api.composition.ITPMediaTrackClip clone(int i17) {
        if (i17 != 3 && i17 != 2 && i17 != 1) {
            return null;
        }
        com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip tPMediaCompositionTrackClip = new com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip();
        tPMediaCompositionTrackClip.mClipType = i17;
        tPMediaCompositionTrackClip.mClipId = com.tencent.thumbplayer.composition.TPMediaCompositionHelper.generateTrackClipId(this.mClipType);
        tPMediaCompositionTrackClip.mStartTime = this.mStartTime;
        tPMediaCompositionTrackClip.mEndTime = this.mEndTime;
        tPMediaCompositionTrackClip.mClipPath = this.mClipPath;
        return tPMediaCompositionTrackClip;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip)) {
            return false;
        }
        com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip tPMediaCompositionTrackClip = (com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip) obj;
        return this.mClipId == tPMediaCompositionTrackClip.getClipId() && this.mClipType == tPMediaCompositionTrackClip.getMediaType();
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public int getClipId() {
        return this.mClipId;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public long getEndTimeMs() {
        return this.mEndTime;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public java.lang.String getFilePath() {
        return this.mClipPath;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return this.mClipType;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public long getOriginalDurationMs() {
        return this.mOriginalDuration;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public long getStartPositionMs() {
        return this.mStartPosition;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public long getStartTimeMs() {
        return this.mStartTime;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.lang.String getUrl() {
        return this.mClipPath;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public void setCutTimeRange(long j17, long j18) {
        if (j17 >= getOriginalDurationMs()) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        if (j18 > getOriginalDurationMs()) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        if (j17 < 0) {
            j17 = 0;
        }
        if (j18 <= 0) {
            j18 = getOriginalDurationMs();
        }
        if (j17 >= j18) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.mStartTime = j17;
        this.mEndTime = j18;
    }

    public void setFilePath(java.lang.String str) {
        this.mClipPath = str;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public void setOriginalDurationMs(long j17) {
        this.mOriginalDuration = j17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public void setStartPositionMs(long j17) {
        this.mStartPosition = j17;
    }

    public TPMediaCompositionTrackClip(java.lang.String str, int i17) {
        this(str, i17, 0L, -1L);
    }

    public TPMediaCompositionTrackClip(java.lang.String str, int i17, long j17, long j18) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mClipType = i17;
            this.mClipPath = str;
            this.mStartTime = j17;
            this.mEndTime = j18;
            if (j17 < 0) {
                this.mStartTime = 0L;
            }
            if (j18 <= 0) {
                this.mEndTime = getOriginalDurationMs();
            }
            this.mClipId = com.tencent.thumbplayer.composition.TPMediaCompositionHelper.generateTrackClipId(this.mClipType);
            return;
        }
        throw new java.lang.IllegalArgumentException("TPMediaCompositionTrackClip : clipPath empty");
    }
}
