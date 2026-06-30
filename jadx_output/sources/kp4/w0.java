package kp4;

/* loaded from: classes10.dex */
public final class w0 implements com.tencent.mm.plugin.mmsight.segment.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView f311153a;

    public w0(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView) {
        this.f311153a = trackCropView;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void a(boolean z17) {
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311153a;
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.a(trackCropView);
        com.tencent.mars.xlog.Log.i(trackCropView.f176054d, "onMove: " + z17 + ", " + trackCropView.f176063p + ", " + trackCropView.f176064q);
        kp4.t0 callback = trackCropView.getCallback();
        if (callback != null) {
            callback.a(trackCropView.f176063p, trackCropView.f176064q);
        }
        if (z17) {
            kp4.t0 callback2 = trackCropView.getCallback();
            if (callback2 != null) {
                callback2.seekTo(trackCropView.f176063p);
            }
            trackCropView.setProgress(trackCropView.f176063p);
            return;
        }
        kp4.t0 callback3 = trackCropView.getCallback();
        if (callback3 != null) {
            callback3.seekTo(trackCropView.f176064q);
        }
        trackCropView.setProgress(trackCropView.f176064q);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void b(boolean z17) {
        kp4.t0 callback = this.f311153a.getCallback();
        if (callback != null) {
            callback.pause();
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.k1
    public void c(boolean z17) {
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311153a;
        trackCropView.setCutCnt(trackCropView.getCutCnt() + 1);
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.a(trackCropView);
        com.tencent.mars.xlog.Log.i(trackCropView.f176054d, "onScrollStateChanged: " + trackCropView.f176063p + ", " + trackCropView.f176064q);
        kp4.t0 callback = trackCropView.getCallback();
        if (callback != null) {
            callback.b(trackCropView.f176063p, trackCropView.f176064q);
        }
    }
}
