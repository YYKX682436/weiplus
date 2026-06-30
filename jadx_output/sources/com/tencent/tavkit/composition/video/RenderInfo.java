package com.tencent.tavkit.composition.video;

/* loaded from: classes10.dex */
public class RenderInfo {
    private final com.tencent.tavkit.ciimage.CIContext ciContext;
    private final com.tencent.tav.coremedia.CGSize renderSize;
    private final com.tencent.tav.coremedia.CMTime time;
    private final java.util.List<com.tencent.tavkit.composition.model.TAVVideoCompositionTrack> tracks = new java.util.ArrayList();

    public RenderInfo(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tavkit.ciimage.CIContext cIContext) {
        this.time = cMTime;
        this.renderSize = cGSize;
        this.ciContext = cIContext;
    }

    public void addTrack(com.tencent.tavkit.composition.model.TAVVideoCompositionTrack tAVVideoCompositionTrack) {
        if (this.tracks.contains(tAVVideoCompositionTrack)) {
            return;
        }
        this.tracks.add(tAVVideoCompositionTrack);
    }

    public com.tencent.tavkit.ciimage.CIContext getCiContext() {
        return this.ciContext;
    }

    public java.lang.Object getParam(java.lang.String str) {
        com.tencent.tav.decoder.RenderContextParams params = this.ciContext.getRenderContext().getParams();
        if (params != null) {
            return params.getParam(str);
        }
        return null;
    }

    public int getRenderHeight() {
        return (int) this.renderSize.height;
    }

    public com.tencent.tav.coremedia.CGSize getRenderSize() {
        return this.renderSize;
    }

    public int getRenderWidth() {
        return (int) this.renderSize.width;
    }

    public com.tencent.tav.coremedia.CMTime getTime() {
        return this.time;
    }

    public java.lang.Object getTrackExtraInfo(java.lang.String str) {
        java.util.Iterator<com.tencent.tavkit.composition.model.TAVVideoCompositionTrack> it = this.tracks.iterator();
        while (it.hasNext()) {
            java.lang.Object extraTrackInfo = it.next().getExtraTrackInfo(str);
            if (extraTrackInfo != null) {
                return extraTrackInfo;
            }
        }
        return null;
    }

    public java.util.List<com.tencent.tavkit.composition.model.TAVVideoCompositionTrack> getTracks() {
        return this.tracks;
    }

    public void putParam(java.lang.String str, java.lang.Object obj) {
        com.tencent.tav.decoder.RenderContextParams params = this.ciContext.getRenderContext().getParams();
        if (params != null) {
            params.putParam(str, obj);
        }
    }
}
