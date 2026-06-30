package d7;

/* loaded from: classes13.dex */
public final class g0 implements w6.z0, w6.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.Resources f226805d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.z0 f226806e;

    public g0(android.content.res.Resources resources, w6.z0 z0Var) {
        q7.n.b(resources);
        this.f226805d = resources;
        q7.n.b(z0Var);
        this.f226806e = z0Var;
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return android.graphics.drawable.BitmapDrawable.class;
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return new android.graphics.drawable.BitmapDrawable(this.f226805d, (android.graphics.Bitmap) this.f226806e.get());
    }

    @Override // w6.z0
    public int getSize() {
        return this.f226806e.getSize();
    }

    @Override // w6.u0
    public void initialize() {
        w6.z0 z0Var = this.f226806e;
        if (z0Var instanceof w6.u0) {
            ((w6.u0) z0Var).initialize();
        }
    }

    @Override // w6.z0
    public void recycle() {
        this.f226806e.recycle();
    }
}
