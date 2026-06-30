package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class AssetTrack<Segment extends com.tencent.tav.asset.AssetTrackSegment> {
    public static final int PersistentTrackID_Invalid = -1;
    protected java.lang.ref.WeakReference<com.tencent.tav.asset.Asset> asset;
    protected java.util.List<java.lang.String> availableMetadataFormats;
    protected java.util.List<java.lang.String> availableTrackAssociationTypes;
    protected java.util.List<com.tencent.tav.asset.MetadataItem> commonMetadata;
    protected boolean enabled;
    protected float estimatedDataRate;
    protected int mediaType;
    protected com.tencent.tav.coremedia.CGSize naturalSize;
    protected int naturalTimeScale;
    protected float nominalFrameRate;
    protected int preferredRotation;
    protected android.graphics.Matrix preferredTransform;
    protected float preferredVolume;
    protected java.util.List<Segment> segments;
    protected java.lang.String sourcePath;
    protected com.tencent.tav.coremedia.CMTimeRange timeRange;
    protected long totalSampleDataLength;
    protected int trackID;

    public AssetTrack() {
        this.enabled = true;
        this.preferredVolume = 1.0f;
        this.preferredRotation = 0;
        this.nominalFrameRate = 30.0f;
        this.segments = new java.util.ArrayList();
    }

    public java.util.List<com.tencent.tav.asset.AssetTrack> associatedTracksOfType(java.lang.String str) {
        return null;
    }

    public void createAssetTrackSegments(com.tencent.tav.asset.Asset asset) {
        if (this.segments == null) {
            this.segments = new java.util.ArrayList();
        }
        if (asset == null || asset.getTrackCount() <= this.trackID) {
            return;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.timeRange;
        this.segments.add(new com.tencent.tav.asset.AssetTrackSegment(cMTimeRange, cMTimeRange));
    }

    public com.tencent.tav.asset.Asset getAsset() {
        java.lang.ref.WeakReference<com.tencent.tav.asset.Asset> weakReference = this.asset;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public java.util.List<java.lang.String> getAvailableMetadataFormats() {
        return this.availableMetadataFormats;
    }

    public java.util.List<java.lang.String> getAvailableTrackAssociationTypes() {
        return this.availableTrackAssociationTypes;
    }

    public java.util.List<com.tencent.tav.asset.MetadataItem> getCommonMetadata() {
        return this.commonMetadata;
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.timeRange;
        return cMTimeRange != null ? cMTimeRange.getDuration() : com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    public float getEstimatedDataRate() {
        return this.estimatedDataRate;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public com.tencent.tav.coremedia.CGSize getNaturalSize() {
        return this.naturalSize;
    }

    public int getNaturalTimeScale() {
        return this.naturalTimeScale;
    }

    public float getNominalFrameRate() {
        return this.nominalFrameRate;
    }

    public int getPreferredRotation() {
        return this.preferredRotation;
    }

    public android.graphics.Matrix getPreferredTransform() {
        return this.preferredTransform;
    }

    public float getPreferredVolume() {
        return this.preferredVolume;
    }

    public java.util.List<Segment> getSegments() {
        return this.segments;
    }

    public java.lang.String getSourcePath() {
        return this.sourcePath;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.timeRange;
        if (cMTimeRange == null || cMTimeRange == com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid) {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, getDuration());
        }
        return this.timeRange;
    }

    public long getTotalSampleDataLength() {
        return this.totalSampleDataLength;
    }

    public int getTrackID() {
        return this.trackID;
    }

    public boolean hasMediaCharacteristic(java.lang.String str) {
        return false;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public java.util.List<com.tencent.tav.asset.MetadataItem> metadataForFormat(java.lang.String str) {
        return null;
    }

    public com.tencent.tav.coremedia.CMTime samplePresentationTimeForTrackTime(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.extractor.AssetExtractor extractor;
        java.lang.ref.WeakReference<com.tencent.tav.asset.Asset> weakReference = this.asset;
        if (weakReference == null || weakReference.get() == null || (extractor = this.asset.get().getExtractor()) == null) {
            return null;
        }
        extractor.seekTo(cMTime.getTimeUs(), 2);
        if (extractor.getSampleTime() > cMTime.getTimeUs()) {
            extractor.seekTo(cMTime.getTimeUs(), 0);
        }
        return com.tencent.tav.coremedia.TimeUtil.us2CMTime(extractor.getSampleTime());
    }

    public com.tencent.tav.asset.AssetTrackSegment segmentForTrackTime(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMTimeRange target;
        java.util.List<Segment> list = this.segments;
        if (list == null) {
            return null;
        }
        for (Segment segment : list) {
            if (segment != null && (target = segment.getTimeMapping().getTarget()) != null && target.containsTime(cMTime)) {
                return segment;
            }
        }
        return null;
    }

    public void setPreferredRotation(int i17) {
        this.preferredRotation = i17;
    }

    public void setPreferredTransform(android.graphics.Matrix matrix) {
        this.preferredTransform = matrix;
    }

    public void setPreferredVolume(float f17) {
        this.preferredVolume = f17;
    }

    public AssetTrack(com.tencent.tav.asset.Asset asset, int i17, int i18, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.enabled = true;
        this.preferredVolume = 1.0f;
        this.preferredRotation = 0;
        this.nominalFrameRate = 30.0f;
        this.segments = new java.util.ArrayList();
        this.trackID = i17;
        this.mediaType = i18;
        this.timeRange = cMTimeRange;
        if (asset != null && i17 < asset.getTrackCount()) {
            this.asset = new java.lang.ref.WeakReference<>(asset);
            this.nominalFrameRate = com.tencent.tav.extractor.ExtractorUtils.getFrameRate(asset.getTrackFormat(i17));
            this.naturalSize = asset.getNaturalSize();
            this.sourcePath = asset.getSourcePath();
        }
        createAssetTrackSegments(asset);
    }
}
