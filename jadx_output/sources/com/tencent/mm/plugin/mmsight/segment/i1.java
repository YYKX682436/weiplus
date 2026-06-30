package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f149037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f149038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SliderSeekBar f149039g;

    public i1(com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar, int i17, int i18, int i19) {
        this.f149039g = sliderSeekBar;
        this.f149036d = i17;
        this.f149037e = i18;
        this.f149038f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.f149039g;
        int i17 = sliderSeekBar.f148948p * 2;
        int i18 = this.f149036d;
        if (i18 <= i17) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        sliderSeekBar.f148940e = true;
        int i19 = this.f149037e;
        sliderSeekBar.f148958z = i19;
        sliderSeekBar.f148942g = java.lang.Math.min(i18, sliderSeekBar.getWidth() - (i19 * 2));
        sliderSeekBar.f148943h = java.lang.Math.max(this.f149038f, 0);
        sliderSeekBar.e();
        if (sliderSeekBar.B == null && sliderSeekBar.C == null) {
            sliderSeekBar.B = new android.graphics.Rect(sliderSeekBar.f148946n.getBounds().left, sliderSeekBar.f148946n.getBounds().top, sliderSeekBar.f148946n.getBounds().right, sliderSeekBar.f148946n.getBounds().bottom);
            sliderSeekBar.C = new android.graphics.Rect(sliderSeekBar.f148947o.getBounds().left, sliderSeekBar.f148947o.getBounds().top, sliderSeekBar.f148947o.getBounds().right, sliderSeekBar.f148947o.getBounds().bottom);
        }
        sliderSeekBar.invalidate();
    }
}
