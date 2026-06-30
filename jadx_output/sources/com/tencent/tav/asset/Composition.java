package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class Composition<CTrack extends com.tencent.tav.asset.CompositionTrack> extends com.tencent.tav.asset.Asset {
    protected java.util.List<CTrack> tracks;

    public Composition() {
        this.tracks = new java.util.ArrayList();
    }

    @Override // com.tencent.tav.asset.Asset
    public void createTracks() {
        int trackCount = this.extractor.getTrackCount();
        if (this.tracks == null) {
            this.tracks = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < trackCount; i17++) {
            java.lang.String string = this.extractor.getTrackFormat(i17).getString("mime");
            if (string.startsWith("video/")) {
                int i18 = this.trackIndex;
                this.trackIndex = i18 + 1;
                this.tracks.add(new com.tencent.tav.asset.CompositionTrack(this, i18, 1, new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, getVideoDuration())));
            } else if (string.startsWith("audio/")) {
                int i19 = this.trackIndex;
                this.trackIndex = i19 + 1;
                this.tracks.add(new com.tencent.tav.asset.CompositionTrack(this, i19, 2, new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, getAudioDuration())));
            }
        }
        com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.asset.Asset.TAG, " Composition createTracks finish, has track count: " + this.tracks);
    }

    @Override // com.tencent.tav.asset.Asset
    public com.tencent.tav.coremedia.CMTime getAudioDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (CTrack ctrack : this.tracks) {
            if (ctrack.getMediaType() == 2) {
                com.tencent.tav.coremedia.CMTime duration = ctrack.getDuration();
                if (duration.bigThan(cMTime)) {
                    cMTime = duration;
                }
            }
        }
        return cMTime;
    }

    @Override // com.tencent.tav.asset.Asset
    public java.util.List<CTrack> getTracks() {
        java.util.Objects.toString(this.tracks);
        return this.tracks;
    }

    @Override // com.tencent.tav.asset.Asset
    public com.tencent.tav.coremedia.CMTime getVideoDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (CTrack ctrack : this.tracks) {
            if (ctrack.getMediaType() == 1) {
                com.tencent.tav.coremedia.CMTime duration = ctrack.getDuration();
                if (duration.bigThan(cMTime)) {
                    cMTime = duration;
                }
            }
        }
        return cMTime;
    }

    @Override // com.tencent.tav.asset.AsynchronousKeyValueLoading
    public void loadValuesAsynchronouslyForKeys(java.util.List<java.lang.String> list, com.tencent.tav.asset.AsynchronousKeyValueLoading.loadCallback loadcallback) {
    }

    @Override // com.tencent.tav.asset.AsynchronousKeyValueLoading
    public int statusOfValueForKey(java.lang.String str) {
        return 1;
    }

    public java.lang.String toString() {
        return "Composition{\ntracks=" + this.tracks + "\ntrackCount=" + this.trackCount + '}';
    }

    public Composition(java.net.URL url) {
        super(url);
        this.tracks = new java.util.ArrayList();
    }

    public Composition(java.lang.String str) {
        super(str);
        this.tracks = new java.util.ArrayList();
    }
}
