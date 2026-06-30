package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPEmptyTrackClip extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaTrackClip, java.io.Serializable {
    private int mClipId;
    private int mClipType;
    private long mStartPosition;
    private long mStartTime = 0;
    private long mEndTime = 0;

    public TPEmptyTrackClip(int i17) {
        this.mClipType = i17;
        this.mClipId = com.tencent.thumbplayer.composition.TPMediaCompositionHelper.generateTrackClipId(i17);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public com.tencent.thumbplayer.api.composition.ITPMediaTrackClip clone(int i17) {
        if (i17 != 3 && i17 != 2 && i17 != 1) {
            return null;
        }
        com.tencent.thumbplayer.composition.TPEmptyTrackClip tPEmptyTrackClip = new com.tencent.thumbplayer.composition.TPEmptyTrackClip(i17);
        tPEmptyTrackClip.mClipId = com.tencent.thumbplayer.composition.TPMediaCompositionHelper.generateTrackClipId(i17);
        tPEmptyTrackClip.mStartTime = this.mStartTime;
        tPEmptyTrackClip.mEndTime = this.mEndTime;
        return tPEmptyTrackClip;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.thumbplayer.composition.TPEmptyTrackClip)) {
            return false;
        }
        com.tencent.thumbplayer.composition.TPEmptyTrackClip tPEmptyTrackClip = (com.tencent.thumbplayer.composition.TPEmptyTrackClip) obj;
        return this.mClipId == tPEmptyTrackClip.getClipId() && this.mClipType == tPEmptyTrackClip.getMediaType();
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
        return null;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return this.mClipType;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public long getOriginalDurationMs() {
        return this.mEndTime - this.mStartTime;
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
        return null;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public void setCutTimeRange(long j17, long j18) {
        if (j17 < 0) {
            j17 = 0;
        }
        if (j17 >= j18) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.mStartTime = j17;
        this.mEndTime = j18;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public void setOriginalDurationMs(long j17) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrackClip
    public void setStartPositionMs(long j17) {
        this.mStartPosition = j17;
    }
}
