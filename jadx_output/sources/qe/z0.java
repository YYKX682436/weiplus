package qe;

/* loaded from: classes7.dex */
public class z0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.f0 f362010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f362011e;

    public z0(qe.d1 d1Var, com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var) {
        this.f362011e = d1Var;
        this.f362010d = f0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND != bVar || this.f362011e.f361935h == null) {
            return;
        }
        this.f362010d.k(new qe.y0(this), true);
    }
}
