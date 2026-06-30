package com.tencent.tavkit.composition.video;

/* loaded from: classes16.dex */
public class TAVVideoCompositionLayerInstruction implements com.tencent.tav.core.composition.VideoCompositionLayerInstruction {
    private final com.tencent.tavkit.composition.model.TAVVideoCompositionTrack imageSource;
    private android.graphics.Matrix preferredTransform;
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    private int trackID;
    private com.tencent.tavkit.composition.video.TAVVideoTransition transition;
    private final com.tencent.tavkit.composition.model.TAVVideoConfiguration videoConfiguration;

    public TAVVideoCompositionLayerInstruction(int i17, com.tencent.tavkit.composition.model.TAVVideoConfiguration tAVVideoConfiguration, com.tencent.tavkit.composition.model.TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        this.trackID = i17;
        this.videoConfiguration = tAVVideoConfiguration;
        this.imageSource = tAVVideoCompositionTrack;
        this.preferredTransform = new android.graphics.Matrix();
    }

    public android.graphics.Bitmap applySourceImage(android.graphics.Bitmap bitmap, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize) {
        return null;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp getCropRectangleRampForTime(com.tencent.tav.coremedia.CMTime cMTime) {
        return null;
    }

    public com.tencent.tavkit.composition.model.TAVVideoCompositionTrack getImageSource() {
        return this.imageSource;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp getOpacityRampForTime(com.tencent.tav.coremedia.CMTime cMTime) {
        return null;
    }

    public android.graphics.Matrix getPreferredTransform() {
        return this.preferredTransform;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public int getTrackID() {
        return this.trackID;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp getTransformRampForTime(com.tencent.tav.coremedia.CMTime cMTime) {
        return null;
    }

    public com.tencent.tavkit.composition.video.TAVVideoTransition getTransition() {
        return this.transition;
    }

    public com.tencent.tavkit.composition.model.TAVVideoConfiguration getVideoConfiguration() {
        return this.videoConfiguration;
    }

    public void setPreferredTransform(android.graphics.Matrix matrix) {
        this.preferredTransform = matrix;
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public void setTrackID(int i17) {
        this.trackID = i17;
    }

    public void setTransition(com.tencent.tavkit.composition.video.TAVVideoTransition tAVVideoTransition) {
        this.transition = tAVVideoTransition;
    }

    public java.lang.String toString() {
        return "TAVVideoCompositionLayerInstruction{trackID=" + this.trackID + ", timeRange=" + this.timeRange.toSimpleString() + ", preferredTransform=" + this.preferredTransform + ", imageSource=" + this.imageSource + ", transition=" + this.transition + ", videoConfiguration=" + this.videoConfiguration + '}';
    }

    public TAVVideoCompositionLayerInstruction(int i17, com.tencent.tavkit.composition.model.TAVTransitionableVideo tAVTransitionableVideo) {
        this(i17, tAVTransitionableVideo.getVideoConfiguration(), tAVTransitionableVideo);
        setTimeRange(tAVTransitionableVideo.getTimeRange());
        setTransition(tAVTransitionableVideo.getVideoTransition());
    }
}
