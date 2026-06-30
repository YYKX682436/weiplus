package l75;

/* loaded from: classes11.dex */
public class x0 extends l75.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.a1 f316977e;

    public x0(l75.a1 a1Var) {
        this.f316977e = a1Var;
    }

    @Override // l75.v0
    public boolean g() {
        return this.f316977e.c();
    }

    @Override // l75.v0
    public void h(java.lang.Object obj, java.lang.Object obj2) {
        l75.z0 z0Var = (l75.z0) obj;
        l75.y0 y0Var = (l75.y0) obj2;
        if (this.f316977e.f()) {
            z0Var.g(y0Var.f316978a, y0Var.f316981d, y0Var.f316979b);
        }
    }

    @Override // l75.v0
    public void i(java.lang.Object obj) {
        this.f316977e.d((l75.y0) obj);
    }
}
