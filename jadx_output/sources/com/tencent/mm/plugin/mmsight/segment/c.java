package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f148990a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f148991b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f148992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar f148993d;

    public c(com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f148993d = editSliderSeekBar;
        this.f148991b = drawable;
        this.f148992c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f148990a ? this.f148991b : this.f148992c;
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
        this.f148991b.setAlpha(i17);
        this.f148992c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f148991b.setColorFilter(colorFilter);
        this.f148992c.setColorFilter(colorFilter);
    }
}
