package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public abstract class Asset<Track extends com.tencent.tav.asset.AssetTrack> implements com.tencent.tav.asset.AsynchronousKeyValueLoading {
    public static final java.lang.String TAG = "Asset";
    private boolean canContainFragments;
    private boolean composable;
    private boolean containsFragments;
    private boolean exportable;
    protected com.tencent.tav.extractor.AssetExtractor extractor;
    private boolean hasProtectedContent;
    private java.lang.String lyrics;
    private android.media.MediaFormat mediaFormat;
    protected com.tencent.tav.coremedia.CGSize naturalSize;
    private com.tencent.tav.coremedia.CMTime overallDurationHint;
    private boolean playable;
    private android.graphics.Matrix preferredTransform;
    private boolean providesPreciseDurationAndTiming;
    private boolean readable;
    protected java.util.List<Track> tracks;
    protected int trackIndex = 0;
    protected int trackCount = 0;
    private com.tencent.tav.coremedia.CMTime duration = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    private float preferredRate = 1.0f;
    protected int preferRotation = 0;
    private int mirror = 0;
    protected float preferredVolume = 1.0f;
    private int extractorRetryCount = 3;

    public Asset() {
    }

    private void initMembers() {
        this.trackCount = this.extractor.getTrackCount();
        this.duration = getDuration();
        this.naturalSize = com.tencent.tav.extractor.ExtractorUtils.getVideoSize(this.extractor);
        int preferRotation = com.tencent.tav.extractor.ExtractorUtils.getPreferRotation(this.extractor);
        this.preferRotation = preferRotation;
        if (preferRotation == 0) {
            return;
        }
        this.preferredTransform = new android.graphics.Matrix();
        while (true) {
            int i17 = this.preferRotation;
            if (i17 >= 0) {
                int i18 = i17 % 4;
                this.preferRotation = i18;
                android.graphics.Matrix matrix = this.preferredTransform;
                com.tencent.tav.coremedia.CGSize cGSize = this.naturalSize;
                com.tencent.tav.decoder.DecoderUtils.getRotationMatrix(matrix, i18, cGSize.width, cGSize.height);
                return;
            }
            this.preferRotation = i17 + 4;
        }
    }

    private void tryInitMembers() {
        int i17 = this.extractorRetryCount;
        this.extractorRetryCount = i17 - 1;
        if (i17 <= 0) {
            return;
        }
        try {
            initMembers();
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "Asset: initMembers failed, path = " + getSourcePath(), e17);
            trySleep(100);
            tryInitMembers();
        }
        com.tencent.tav.decoder.logger.Logger.v(TAG, "tryInitMembers: try count = " + (3 - this.extractorRetryCount));
    }

    private void trySleep(int i17) {
        try {
            java.lang.Thread.sleep(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "tryInitMembers: Thread.sleep(100) ", e17);
        }
    }

    public synchronized void cancelLoading() {
    }

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
                com.tencent.tav.asset.AssetTrack assetTrack = new com.tencent.tav.asset.AssetTrack(this, i18, 1, new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, getVideoDuration()));
                assetTrack.setPreferredTransform(this.preferredTransform);
                assetTrack.setPreferredRotation(this.preferRotation);
                this.tracks.add(assetTrack);
            } else if (string.startsWith("audio/")) {
                int i19 = this.trackIndex;
                this.trackIndex = i19 + 1;
                com.tencent.tav.asset.AssetTrack assetTrack2 = new com.tencent.tav.asset.AssetTrack(this, i19, 2, new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, getAudioDuration()));
                assetTrack2.setPreferredVolume(this.preferredVolume);
                this.tracks.add(assetTrack2);
            }
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "Asset createTracks finish, has track count: " + this.tracks);
    }

    public com.tencent.tav.coremedia.CMTime getAudioDuration() {
        return com.tencent.tav.coremedia.TimeUtil.us2CMTime(this.extractor.getAudioDuration());
    }

    public synchronized com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = this.duration;
        if (cMTime == null || cMTime.equalsTo(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
            com.tencent.tav.coremedia.CMTime videoDuration = getVideoDuration();
            if (com.tencent.tav.coremedia.CMTime.CMTimeZero.equalsTo(videoDuration)) {
                videoDuration = getAudioDuration();
            }
            this.duration = videoDuration;
        }
        return this.duration;
    }

    public synchronized com.tencent.tav.extractor.AssetExtractor getExtractor() {
        return this.extractor;
    }

    public java.lang.String getLyrics() {
        return this.lyrics;
    }

    public android.media.MediaFormat getMediaFormat() {
        return this.mediaFormat;
    }

    public com.tencent.tav.coremedia.CGSize getNaturalSize() {
        return this.naturalSize;
    }

    public com.tencent.tav.coremedia.CMTime getOverallDurationHint() {
        return this.overallDurationHint;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public float getPreferredRate() {
        return this.preferredRate;
    }

    public android.graphics.Matrix getPreferredTransform() {
        return this.preferredTransform;
    }

    public float getPreferredVolume() {
        return this.preferredVolume;
    }

    public synchronized java.lang.String getSourcePath() {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public synchronized android.media.MediaFormat getTrackFormat(int i17) {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getTrackFormat(i17);
    }

    public java.util.List<Track> getTracks() {
        com.tencent.tav.decoder.logger.Logger.e(TAG, "getTracks finish, has track count: " + this.tracks);
        return this.tracks;
    }

    public com.tencent.tav.coremedia.CMTime getVideoDuration() {
        return com.tencent.tav.coremedia.TimeUtil.us2CMTime(this.extractor.getDuration());
    }

    public boolean isCanContainFragments() {
        return this.canContainFragments;
    }

    public boolean isComposable() {
        return this.composable;
    }

    public boolean isContainsFragments() {
        return this.containsFragments;
    }

    public boolean isExportable() {
        return this.exportable;
    }

    public boolean isHasProtectedContent() {
        return this.hasProtectedContent;
    }

    public boolean isPlayable() {
        return this.playable;
    }

    public boolean isProvidesPreciseDurationAndTiming() {
        return this.providesPreciseDurationAndTiming;
    }

    public boolean isReadable() {
        return this.readable;
    }

    public void release() {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor != null) {
            assetExtractor.release();
        }
    }

    public synchronized void selectTrack(int i17) {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor != null) {
            assetExtractor.selectTrack(i17);
        }
    }

    public com.tencent.tav.asset.AssetTrack trackWithTrackID(int i17) {
        java.util.List<Track> list = this.tracks;
        if (list == null) {
            return null;
        }
        for (Track track : list) {
            if (track != null && track.getTrackID() == i17) {
                return track;
            }
        }
        return null;
    }

    public java.util.List<com.tencent.tav.asset.AssetTrack> tracksWithMediaCharacteristic(java.lang.String str) {
        return null;
    }

    public java.util.List<com.tencent.tav.asset.AssetTrack> tracksWithMediaType(int i17) {
        if (this.tracks == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Track track : this.tracks) {
            if (track != null && track.getMediaType() == i17) {
                arrayList.add(track);
            }
        }
        return arrayList;
    }

    public Asset(java.net.URL url) {
    }

    public Asset(java.lang.String str) {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        tryInitMembers();
        createTracks();
    }
}
