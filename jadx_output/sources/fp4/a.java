package fp4;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar f265347g;

    public a(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar, int i17, int i18, int i19) {
        this.f265347g = timeCropSliderSeekBar;
        this.f265344d = i17;
        this.f265345e = i18;
        this.f265346f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar = this.f265347g;
        int i17 = timeCropSliderSeekBar.f175923p * 2;
        int i18 = this.f265344d;
        if (i18 <= i17) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        timeCropSliderSeekBar.f175915e = true;
        int i19 = this.f265345e;
        timeCropSliderSeekBar.D = i19;
        timeCropSliderSeekBar.f175917g = java.lang.Math.min(i18, timeCropSliderSeekBar.getWidth() - (i19 * 2));
        timeCropSliderSeekBar.f175918h = java.lang.Math.max(this.f265346f, timeCropSliderSeekBar.f175923p * 2);
        timeCropSliderSeekBar.e();
        if (timeCropSliderSeekBar.F == null && timeCropSliderSeekBar.G == null) {
            timeCropSliderSeekBar.F = new android.graphics.Rect(timeCropSliderSeekBar.f175921n.getBounds().left, timeCropSliderSeekBar.f175921n.getBounds().top, timeCropSliderSeekBar.f175921n.getBounds().right, timeCropSliderSeekBar.f175921n.getBounds().bottom);
            timeCropSliderSeekBar.G = new android.graphics.Rect(timeCropSliderSeekBar.f175922o.getBounds().left, timeCropSliderSeekBar.f175922o.getBounds().top, timeCropSliderSeekBar.f175922o.getBounds().right, timeCropSliderSeekBar.f175922o.getBounds().bottom);
        }
        timeCropSliderSeekBar.invalidate();
    }
}
