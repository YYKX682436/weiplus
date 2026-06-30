package m0;

/* loaded from: classes14.dex */
public final class f0 extends android.graphics.drawable.RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f322462d;

    /* renamed from: e, reason: collision with root package name */
    public e1.y f322463e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f322464f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322465g;

    public f0(boolean z17) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z17 ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.f322462d = z17;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public android.graphics.Rect getDirtyBounds() {
        if (!this.f322462d) {
            this.f322465g = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        kotlin.jvm.internal.o.f(dirtyBounds, "super.getDirtyBounds()");
        this.f322465g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f322465g;
    }
}
