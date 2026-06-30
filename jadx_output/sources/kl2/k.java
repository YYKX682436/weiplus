package kl2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f308788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kl2.n nVar) {
        super(1);
        this.f308788d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kl2.n nVar = this.f308788d;
        jl2.a aVar = nVar.f308791h;
        if (booleanValue) {
            il2.s sVar = il2.s.f292086a;
            zl2.e5 e5Var = zl2.e5.f473741h;
            il2.r rVar = (il2.r) aVar;
            mm2.p5 p5Var = (mm2.p5) ((mm2.v5) rVar.S0().a(mm2.v5.class)).f329483f.getValue();
            sVar.a(e5Var, p5Var != null ? p5Var.f329350b : 0L);
            mm2.p5 p5Var2 = nVar.f308800t;
            long j17 = p5Var2 != null ? p5Var2.f329350b : 0L;
            com.tencent.mars.xlog.Log.i("RestrictConsumeDialogWidget", "handleFaceVerifyResult: " + j17);
            zl2.j5.f473850a.e(j17);
            ((mm2.v5) rVar.S0().a(mm2.v5.class)).f329488n.postValue(mm2.u5.f329464a);
        } else {
            ((mm2.v5) ((il2.r) aVar).S0().a(mm2.v5.class)).f329488n.postValue(mm2.r5.f329380a);
        }
        return jz5.f0.f302826a;
    }
}
