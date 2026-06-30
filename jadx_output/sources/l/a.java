package l;

/* loaded from: classes13.dex */
public abstract class a extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f314023d;

    public a(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f314023d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f314023d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        this.f314023d.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f314023d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        return this.f314023d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f314023d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f314023d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f314023d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f314023d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f314023d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        return this.f314023d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f314023d.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        return this.f314023d.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return f3.a.d(this.f314023d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f314023d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f314023d.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        this.f314023d.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i17) {
        return this.f314023d.setLevel(i17);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j17) {
        scheduleSelf(runnable, j17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f314023d.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z17) {
        f3.a.e(this.f314023d, z17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i17) {
        this.f314023d.setChangingConfigurations(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f314023d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z17) {
        this.f314023d.setDither(z17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z17) {
        this.f314023d.setFilterBitmap(z17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f17, float f18) {
        f3.b.e(this.f314023d, f17, f18);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i17, int i18, int i19, int i27) {
        f3.b.f(this.f314023d, i17, i18, i19, i27);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f314023d.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i17) {
        f3.b.g(this.f314023d, i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        f3.b.h(this.f314023d, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        f3.b.i(this.f314023d, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        return super.setVisible(z17, z18) || this.f314023d.setVisible(z17, z18);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
