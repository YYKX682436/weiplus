package com.tencent.tavkit.composition.video;

/* loaded from: classes10.dex */
class DefaultVideoMixFilter implements com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter {
    private void checkFillInRenderSize(com.tencent.tavkit.composition.video.RenderInfo renderInfo, com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair trackImagePair, com.tencent.tavkit.ciimage.CIImage cIImage) {
        if (trackImagePair.getTrack() instanceof com.tencent.tavkit.composition.TAVClip) {
            com.tencent.tavkit.composition.model.TAVVideoConfiguration videoConfiguration = ((com.tencent.tavkit.composition.TAVClip) trackImagePair.getTrack()).getVideoConfiguration();
            if (videoConfiguration.frameEnable()) {
                return;
            }
            cIImage.applyFillInFrame(new com.tencent.tav.coremedia.CGRect(new android.graphics.PointF(0.0f, 0.0f), renderInfo.getRenderSize()), videoConfiguration.getContentMode());
        }
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
    public com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect, com.tencent.tavkit.composition.video.ImageCollection imageCollection, com.tencent.tavkit.composition.video.RenderInfo renderInfo) {
        com.tencent.tavkit.ciimage.CIImage cIImage = new com.tencent.tavkit.ciimage.CIImage(renderInfo.getRenderSize());
        for (com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair trackImagePair : imageCollection.getVideoChannelImages()) {
            com.tencent.tavkit.ciimage.CIImage image = trackImagePair.getImage();
            checkFillInRenderSize(renderInfo, trackImagePair, image);
            image.imageByCompositingOverImage(cIImage);
        }
        for (com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair trackImagePair2 : imageCollection.getOverlayImages()) {
            com.tencent.tavkit.ciimage.CIImage image2 = trackImagePair2.getImage();
            checkFillInRenderSize(renderInfo, trackImagePair2, image2);
            image2.imageByCompositingOverImage(cIImage);
        }
        return cIImage;
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
    public void release() {
    }
}
