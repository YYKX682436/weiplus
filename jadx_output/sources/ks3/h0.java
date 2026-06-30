package ks3;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs3.l f311682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ks3.k0 f311683e;

    public h0(ks3.k0 k0Var, hs3.l lVar) {
        this.f311683e = k0Var;
        this.f311682d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ks3.k0 k0Var = this.f311683e;
        ks3.j0 j0Var = new ks3.j0(k0Var, null);
        java.util.Map map = k0Var.f311709e;
        hs3.l lVar = this.f311682d;
        ((java.util.HashMap) map).put(java.lang.Long.valueOf(lVar.f284583a), lVar);
        ((java.util.HashMap) k0Var.f311710f).put(java.lang.Long.valueOf(lVar.f284583a), j0Var);
        if (lVar.f284589g.c()) {
            j0Var.f311700e = lVar;
            j0Var.execute(lVar);
        }
    }
}
