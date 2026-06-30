package fp4;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup f265360d;

    public g(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup) {
        this.f265360d = timeCropViewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup = this.f265360d;
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
        if (seekSlider != null) {
            seekSlider.f(true, timeCropViewGroup.f175945r + (((float) timeCropViewGroup.f175942o) * timeCropViewGroup.f175944q));
        }
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider2 = timeCropViewGroup.getSeekSlider();
        if (seekSlider2 != null) {
            seekSlider2.f(false, timeCropViewGroup.f175945r + (((float) timeCropViewGroup.f175943p) * timeCropViewGroup.f175944q));
        }
    }
}
