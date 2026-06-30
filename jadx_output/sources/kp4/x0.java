package kp4;

/* loaded from: classes10.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView f311155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311156e;

    public x0(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView, int i17) {
        this.f311155d = trackCropView;
        this.f311156e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311155d;
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar seekSlider = trackCropView.getSeekSlider();
        int i17 = this.f311156e;
        if (seekSlider != null) {
            seekSlider.f(true, (trackCropView.f176066s + (((float) trackCropView.f176063p) * trackCropView.f176065r)) - i17);
        }
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar seekSlider2 = trackCropView.getSeekSlider();
        if (seekSlider2 != null) {
            seekSlider2.f(false, (trackCropView.f176066s + (((float) trackCropView.f176064q) * trackCropView.f176065r)) - i17);
        }
        trackCropView.f176073z = true;
    }
}
