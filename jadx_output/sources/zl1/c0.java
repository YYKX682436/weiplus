package zl1;

/* loaded from: classes7.dex */
public class c0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.d0 f473575d;

    public c0(zl1.d0 d0Var) {
        this.f473575d = d0Var;
    }

    @Override // l01.u
    public void b() {
        zl1.d0 d0Var = this.f473575d;
        d0Var.f473628c.a("Failed to load icon via network", d0Var);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f473575d.f473626a;
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        zl1.d0 d0Var = this.f473575d;
        zl1.z zVar = d0Var.f473631f;
        if (zVar != null) {
            zVar.a(bitmap, d0Var);
        }
    }
}
