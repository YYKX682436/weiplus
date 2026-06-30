package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class l1 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f149053a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f149054b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f149055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SliderSeekBar f149056d;

    public l1(com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f149056d = sliderSeekBar;
        this.f149054b = drawable;
        this.f149055c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f149053a ? this.f149054b : this.f149055c;
        if (!getBounds().equals(drawable.getBounds())) {
            drawable.setBounds(getBounds());
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f149054b.setAlpha(i17);
        this.f149055c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f149054b.setColorFilter(colorFilter);
        this.f149055c.setColorFilter(colorFilter);
    }
}
