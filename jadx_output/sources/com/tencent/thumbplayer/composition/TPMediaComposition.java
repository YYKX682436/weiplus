package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaComposition extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaComposition {
    private static final java.lang.String TAG = "TPMediaComposition";
    private int mVideoTrackSequence = 0;
    private int mAudioTrackSequence = 0;
    private int mAVTrackSequence = 0;
    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> mVideoTracks = new java.util.ArrayList(1);
    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> mAudioTracks = new java.util.ArrayList(1);
    private java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> mAVTracks = new java.util.ArrayList(1);

    private synchronized int generateAVTrackSequence() {
        int i17;
        i17 = this.mAVTrackSequence + 1;
        this.mAVTrackSequence = i17;
        return i17;
    }

    private synchronized int generateAudioTrackSequence() {
        int i17;
        i17 = this.mAudioTrackSequence + 1;
        this.mAudioTrackSequence = i17;
        return i17;
    }

    private synchronized int generateVideoTrackSequence() {
        int i17;
        i17 = this.mVideoTrackSequence + 1;
        this.mVideoTrackSequence = i17;
        return i17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized com.tencent.thumbplayer.api.composition.ITPMediaTrack addAVTrack() {
        com.tencent.thumbplayer.composition.TPMediaCompositionTrack tPMediaCompositionTrack;
        tPMediaCompositionTrack = new com.tencent.thumbplayer.composition.TPMediaCompositionTrack(generateAVTrackSequence(), 1);
        this.mAVTracks.add(tPMediaCompositionTrack);
        return tPMediaCompositionTrack;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized com.tencent.thumbplayer.api.composition.ITPMediaTrack addAudioTrack() {
        com.tencent.thumbplayer.composition.TPMediaCompositionTrack tPMediaCompositionTrack;
        tPMediaCompositionTrack = new com.tencent.thumbplayer.composition.TPMediaCompositionTrack(generateAudioTrackSequence(), 3);
        this.mAudioTracks.add(tPMediaCompositionTrack);
        return tPMediaCompositionTrack;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized com.tencent.thumbplayer.api.composition.ITPMediaTrack addVideoTrack() {
        com.tencent.thumbplayer.composition.TPMediaCompositionTrack tPMediaCompositionTrack;
        tPMediaCompositionTrack = new com.tencent.thumbplayer.composition.TPMediaCompositionTrack(generateVideoTrackSequence(), 2);
        this.mVideoTracks.add(tPMediaCompositionTrack);
        return tPMediaCompositionTrack;
    }

    public long getAVDuration() {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list = this.mAVTracks;
        long j17 = 0;
        if (list != null) {
            for (com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack : list) {
                if (j17 < iTPMediaTrack.getTimelineDurationMs()) {
                    j17 = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return j17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> getAllAVTracks() {
        return this.mAVTracks;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> getAllAudioTracks() {
        return this.mAudioTracks;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> getAllVideoTracks() {
        return this.mVideoTracks;
    }

    public long getAudioDuration() {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list = this.mAudioTracks;
        long j17 = 0;
        if (list != null) {
            for (com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack : list) {
                if (j17 < iTPMediaTrack.getTimelineDurationMs()) {
                    j17 = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return j17;
    }

    public synchronized com.tencent.thumbplayer.api.composition.ITPMediaTrack getAudioTrack(int i17) {
        return this.mAudioTracks.get(i17);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public long getDurationMs() {
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.mAVTracks)) {
            return getAVDuration();
        }
        long audioDuration = getAudioDuration();
        long videoDuration = getVideoDuration();
        long j17 = videoDuration > audioDuration ? videoDuration : audioDuration;
        java.lang.String str = com.tencent.thumbplayer.composition.TPMediaCompositionHelper.composition_duration_strategy;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2046821033:
                if (str.equals("base_longer")) {
                    c17 = 0;
                    break;
                }
                break;
            case -491658008:
                if (str.equals("base_audio")) {
                    c17 = 1;
                    break;
                }
                break;
            case -472621683:
                if (str.equals("base_video")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                if (videoDuration <= audioDuration) {
                    return audioDuration;
                }
                break;
            case 1:
                return audioDuration;
            case 2:
                break;
            default:
                return j17;
        }
        return videoDuration;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 4;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.lang.String getUrl() {
        try {
            return com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator.buildAssetXmlFromComposition(this);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return null;
        }
    }

    public long getVideoDuration() {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list = this.mVideoTracks;
        long j17 = 0;
        if (list != null) {
            for (com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack : list) {
                if (j17 < iTPMediaTrack.getTimelineDurationMs()) {
                    j17 = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return j17;
    }

    public synchronized com.tencent.thumbplayer.api.composition.ITPMediaTrack getVideoTrack(int i17) {
        return this.mVideoTracks.get(i17);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public void release() {
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list = this.mVideoTracks;
        if (list != null) {
            list.clear();
            this.mVideoTracks = null;
        }
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list2 = this.mAudioTracks;
        if (list2 != null) {
            list2.clear();
            this.mAudioTracks = null;
        }
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list3 = this.mAVTracks;
        if (list3 != null) {
            list3.clear();
            this.mAVTracks = null;
        }
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public boolean removeAVTrack(com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack != null) {
            return this.mAVTracks.remove(iTPMediaTrack);
        }
        throw new java.lang.IllegalArgumentException("remove audio track , track is null .");
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized boolean removeAudioTrack(com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack == null) {
            throw new java.lang.IllegalArgumentException("remove audio track , track is null .");
        }
        return this.mAudioTracks.remove(iTPMediaTrack);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaComposition
    public synchronized boolean removeVideoTrack(com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack == null) {
            throw new java.lang.IllegalArgumentException("remove video track , track is null .");
        }
        return this.mVideoTracks.remove(iTPMediaTrack);
    }

    public void setAVTracks(java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list) {
        this.mAVTracks = list;
    }

    public void setAudioTracks(java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list) {
        this.mAudioTracks = list;
    }

    public void setVideoTracks(java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list) {
        this.mVideoTracks = list;
    }
}
