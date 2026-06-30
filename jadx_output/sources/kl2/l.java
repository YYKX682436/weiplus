package kl2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f308789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kl2.n nVar) {
        super(0);
        this.f308789d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        kl2.n nVar = this.f308789d;
        int ordinal = nVar.f308798r.ordinal();
        jz5.f0 f0Var = jz5.f0.f302826a;
        jl2.a aVar = nVar.f308791h;
        if (ordinal == 0) {
            il2.r rVar = (il2.r) aVar;
            rVar.getClass();
            mm2.p5 p5Var = (mm2.p5) ((mm2.v5) rVar.P0(mm2.v5.class)).f329483f.getValue();
            long j17 = p5Var != null ? p5Var.f329350b : 0L;
            com.tencent.mars.xlog.Log.i("FinderLiveRestrictConsumePlugin", "continueSend: " + j17);
            zl2.j5.f473850a.e(j17);
            ((mm2.v5) rVar.P0(mm2.v5.class)).f329488n.postValue(mm2.q5.f329367a);
            il2.s.f292086a.a(zl2.e5.f473740g, nVar.f308797q);
            return f0Var;
        }
        if (ordinal != 1) {
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consumeVerifyUrl jump: ");
        mm2.p5 p5Var2 = nVar.f308800t;
        sb6.append(p5Var2 != null ? p5Var2.f329352d : null);
        com.tencent.mars.xlog.Log.i("RestrictConsumeDialogWidget", sb6.toString());
        mm2.p5 p5Var3 = nVar.f308800t;
        if (p5Var3 == null || (str = p5Var3.f329352d) == null) {
            return null;
        }
        java.lang.String str2 = p5Var3.f329351c;
        if (str2 == null) {
            str2 = "";
        }
        ((il2.r) aVar).n(new il2.a(1, str2, str, new kl2.k(nVar)));
        return f0Var;
    }
}
