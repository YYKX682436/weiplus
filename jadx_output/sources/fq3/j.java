package fq3;

/* loaded from: classes12.dex */
public class j implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq3.n f265524d;

    public j(fq3.n nVar) {
        this.f265524d = nVar;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f470458d) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.c2cpreload.RepairerConfigC2CPreloadInsertAsync()) != 1) {
            fq3.n.Zi(this.f265524d, l0Var);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new fq3.i(this, l0Var), "C2CPreloadThread");
    }
}
