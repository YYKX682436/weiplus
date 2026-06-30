package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaCompositionTrack extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaTrack, java.io.Serializable {
    private static final java.lang.String TAG = "TPMediaCompositionTrack";
    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> mTrackClips;
    private int mTrackId;
    private int mTrackType;

    public TPMediaCompositionTrack(int i17) {
        this.mTrackId = -1;
        this.mTrackType = i17;
        this.mTrackClips = new java.util.ArrayList();
    }

    private synchronized void checkClipValid(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip) {
        try {
            if (iTPMediaTrackClip == null) {
                throw new java.lang.IllegalArgumentException("add track clip , clip can not be null");
            }
            if (iTPMediaTrackClip.getMediaType() != this.mTrackType) {
                throw new java.lang.IllegalArgumentException("add track clip failed, media type is not same");
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized int addTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip) {
        checkClipValid(iTPMediaTrackClip);
        if (!this.mTrackClips.contains(iTPMediaTrackClip)) {
            this.mTrackClips.add(iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
        return iTPMediaTrackClip.getClipId();
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> getAllTrackClips() {
        return this.mTrackClips;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public synchronized int getMediaType() {
        return this.mTrackType;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized long getTimelineDurationMs() {
        long j17;
        java.util.Iterator<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> it = this.mTrackClips.iterator();
        j17 = 0;
        while (it.hasNext()) {
            j17 += it.next().getOriginalDurationMs();
        }
        return j17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized com.tencent.thumbplayer.api.composition.ITPMediaTrackClip getTrackClip(int i17) {
        for (com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip : this.mTrackClips) {
            if (iTPMediaTrackClip.getClipId() == i17) {
                return iTPMediaTrackClip;
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized int getTrackId() {
        return this.mTrackId;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public synchronized java.lang.String getUrl() {
        try {
        } catch (java.io.IOException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return null;
        }
        return com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator.buildXmlPathFromTrackInfo(this.mTrackClips, this.mTrackType);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized int insertTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip, int i17) {
        checkClipValid(iTPMediaTrackClip);
        if (this.mTrackClips.contains(iTPMediaTrackClip)) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
            return iTPMediaTrackClip.getClipId();
        }
        if (i17 == -1) {
            this.mTrackClips.add(0, iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        int size = this.mTrackClips.size();
        for (int i18 = 0; i18 < size; i18++) {
            if (this.mTrackClips.get(i18).getClipId() == i17) {
                this.mTrackClips.add(i18 + 1, iTPMediaTrackClip);
                return iTPMediaTrackClip.getClipId();
            }
        }
        this.mTrackClips.add(iTPMediaTrackClip);
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "insert track clip into the end, coz after clip not found :" + i17);
        return iTPMediaTrackClip.getClipId();
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized void removeAllTrackClips() {
        this.mTrackClips.clear();
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized boolean removeTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip == null) {
            throw new java.lang.IllegalArgumentException("remove track clip , clip can not be null");
        }
        return this.mTrackClips.remove(iTPMediaTrackClip);
    }

    public void setTrackId(int i17) {
        this.mTrackId = i17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized boolean swapTrackClip(int i17, int i18) {
        if (i17 >= 0) {
            if (i17 < this.mTrackClips.size()) {
                if (i18 >= 0 && i18 < this.mTrackClips.size()) {
                    java.util.Collections.swap(this.mTrackClips, i17, i18);
                    return true;
                }
                com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "swap clip failed, to pos invalid , to pos :" + i18);
                return false;
            }
        }
        com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "swap clip failed, from pos invalid , from pos : " + i17);
        return false;
    }

    public TPMediaCompositionTrack(int i17, int i18) {
        this.mTrackId = i17;
        this.mTrackType = i18;
        this.mTrackClips = new java.util.ArrayList();
    }
}
