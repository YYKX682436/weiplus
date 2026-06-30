package f7;

/* loaded from: classes13.dex */
public abstract class b implements w6.z0, w6.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f260024d;

    public b(android.graphics.drawable.Drawable drawable) {
        q7.n.b(drawable);
        this.f260024d = drawable;
    }

    @Override // w6.z0
    public java.lang.Object get() {
        android.graphics.drawable.Drawable drawable = this.f260024d;
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // w6.u0
    public void initialize() {
        android.graphics.drawable.Drawable drawable = this.f260024d;
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof h7.f) {
            ((h7.f) drawable).f279333d.f279332a.f279360l.prepareToDraw();
        }
    }
}
