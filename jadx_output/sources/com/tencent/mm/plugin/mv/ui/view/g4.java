package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes15.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f151835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.SliderSeekBar f151836g;

    public g4(com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar, int i17, int i18, int i19) {
        this.f151836g = sliderSeekBar;
        this.f151833d = i17;
        this.f151834e = i18;
        this.f151835f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar = this.f151836g;
        int i17 = sliderSeekBar.f151743o * 2;
        int i18 = this.f151833d;
        if (i18 <= i17) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        sliderSeekBar.f151735d = true;
        int i19 = this.f151834e;
        sliderSeekBar.f151753y = i19;
        sliderSeekBar.f151737f = java.lang.Math.min(i18, sliderSeekBar.getWidth() - (i19 * 2));
        sliderSeekBar.f151738g = java.lang.Math.max(this.f151835f, 0);
        if (sliderSeekBar.C) {
            android.graphics.drawable.Drawable drawable = sliderSeekBar.f151741m;
            int i27 = sliderSeekBar.f151753y;
            drawable.setBounds(i27, 0, sliderSeekBar.f151743o + i27, sliderSeekBar.getHeight());
            android.graphics.drawable.Drawable drawable2 = sliderSeekBar.f151742n;
            int i28 = sliderSeekBar.f151753y + sliderSeekBar.f151737f;
            drawable2.setBounds(i28 - sliderSeekBar.f151743o, 0, i28, sliderSeekBar.getHeight());
        } else {
            android.graphics.drawable.Drawable drawable3 = sliderSeekBar.f151741m;
            int i29 = sliderSeekBar.f151753y;
            drawable3.setBounds(i29 - sliderSeekBar.f151743o, 0, i29, sliderSeekBar.getHeight());
            android.graphics.drawable.Drawable drawable4 = sliderSeekBar.f151742n;
            int i37 = sliderSeekBar.f151753y + sliderSeekBar.f151737f;
            drawable4.setBounds(i37, 0, sliderSeekBar.f151743o + i37, sliderSeekBar.getHeight());
        }
        if (sliderSeekBar.A == null && sliderSeekBar.B == null) {
            sliderSeekBar.A = new android.graphics.Rect(sliderSeekBar.f151741m.getBounds().left, sliderSeekBar.f151741m.getBounds().top, sliderSeekBar.f151741m.getBounds().right, sliderSeekBar.f151741m.getBounds().bottom);
            sliderSeekBar.B = new android.graphics.Rect(sliderSeekBar.f151742n.getBounds().left, sliderSeekBar.f151742n.getBounds().top, sliderSeekBar.f151742n.getBounds().right, sliderSeekBar.f151742n.getBounds().bottom);
        }
        sliderSeekBar.invalidate();
    }
}
