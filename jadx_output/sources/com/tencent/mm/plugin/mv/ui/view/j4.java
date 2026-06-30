package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes15.dex */
public class j4 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f151878a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f151879b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f151880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.SliderSeekBar f151881d;

    public j4(com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f151881d = sliderSeekBar;
        this.f151879b = drawable;
        this.f151880c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f151878a ? this.f151879b : this.f151880c;
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
        this.f151879b.setAlpha(i17);
        this.f151880c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f151879b.setColorFilter(colorFilter);
        this.f151880c.setColorFilter(colorFilter);
    }
}
