package df2;

/* loaded from: classes3.dex */
public final class p0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f231026d;

    public p0(df2.v0 v0Var) {
        this.f231026d = v0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            df2.v0 v0Var = this.f231026d;
            g4Var.f(1, v0Var.O6().getResources().getString(com.tencent.mm.R.string.f491763e61));
            g4Var.f(2, v0Var.O6().getResources().getString(com.tencent.mm.R.string.f491766e64));
            df2.v0.Z6(v0Var, 1, df2.k0.f230531e);
            df2.v0.Z6(v0Var, 1, df2.k0.f230532f);
            df2.v0.Z6(v0Var, 1, df2.k0.f230533g);
        }
    }
}
