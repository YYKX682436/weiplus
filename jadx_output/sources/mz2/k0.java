package mz2;

/* loaded from: classes9.dex */
public class k0 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz2.c f333144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz2.l0 f333145b;

    public k0(mz2.l0 l0Var, pz2.c cVar) {
        this.f333145b = l0Var;
        this.f333144a = cVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        int i17 = cVar.f341543a;
        if (i17 == 0) {
            java.lang.String str = cVar.f341545c;
            mz2.l0 l0Var = this.f333145b;
            l0Var.f333150e = str;
            l0Var.f333151f = cVar.f341546d;
        }
        this.f333144a.a(i17, cVar.f341544b, -1, -1);
    }
}
