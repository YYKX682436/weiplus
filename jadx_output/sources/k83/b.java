package k83;

/* loaded from: classes14.dex */
public abstract class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public k83.a f304890d;

    /* renamed from: e, reason: collision with root package name */
    public k83.g f304891e;

    public void c() {
        for (int i17 : d()) {
            c01.d9.e().q(i17, this);
        }
        this.f304890d = null;
        g();
    }

    public abstract int[] d();

    public abstract int e();

    public void f() {
        for (int i17 : d()) {
            c01.d9.e().a(i17, this);
        }
        h();
    }

    public abstract void g();

    public abstract void h();

    public abstract void i(k83.g gVar);

    public void j(k83.g gVar) {
        e();
        this.f304891e = gVar;
        i(gVar);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        e();
        if (i17 == 0 && i18 == 0) {
            k83.a aVar = this.f304890d;
            if (aVar != null) {
                aVar.b(e(), m1Var, i17, i18);
                return;
            }
            return;
        }
        k83.a aVar2 = this.f304890d;
        if (aVar2 != null) {
            aVar2.a(e(), m1Var, i17, i18);
        }
    }
}
