package fp4;

/* loaded from: classes10.dex */
public class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f265355a = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f265356b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f265357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar f265358d;

    public d(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        this.f265358d = timeCropSliderSeekBar;
        this.f265356b = drawable;
        this.f265357c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f265355a ? this.f265356b : this.f265357c;
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
        this.f265356b.setAlpha(i17);
        this.f265357c.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f265356b.setColorFilter(colorFilter);
        this.f265357c.setColorFilter(colorFilter);
    }
}
