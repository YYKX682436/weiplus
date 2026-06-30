package com.tencent.tavkit.composition.video;

/* loaded from: classes10.dex */
public class ImageCollection {
    private final java.util.List<com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair> videoChannelImages = new java.util.ArrayList();
    private final java.util.List<com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair> overlayImages = new java.util.ArrayList();

    /* loaded from: classes10.dex */
    public static class TrackImagePair {
        private final com.tencent.tavkit.ciimage.CIImage image;
        private final com.tencent.tavkit.composition.model.TAVVideoCompositionTrack track;

        public TrackImagePair(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.model.TAVVideoCompositionTrack tAVVideoCompositionTrack) {
            this.image = cIImage;
            this.track = tAVVideoCompositionTrack;
        }

        public com.tencent.tavkit.ciimage.CIImage getImage() {
            return this.image;
        }

        public com.tencent.tavkit.composition.model.TAVVideoCompositionTrack getTrack() {
            return this.track;
        }
    }

    public void addChannelImage(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.model.TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        this.videoChannelImages.add(new com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair(cIImage, tAVVideoCompositionTrack));
    }

    public void addOverlayImage(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.model.TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        this.overlayImages.add(new com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair(cIImage, tAVVideoCompositionTrack));
    }

    public java.util.List<com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair> getOverlayImages() {
        return this.overlayImages;
    }

    public java.util.List<com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair> getVideoChannelImages() {
        return this.videoChannelImages;
    }

    public java.lang.String toString() {
        return "ImageCollection{videoChannelImages=" + this.videoChannelImages + ", overlayImages=" + this.overlayImages + '}';
    }
}
