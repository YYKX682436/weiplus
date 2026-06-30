package q10;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f359503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f359504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, yz5.p pVar) {
        super(1);
        this.f359503d = z17;
        this.f359504e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String res = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(res, "res");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "finishProfile: evaluate done, uploadUrl=".concat(res));
        ku5.u0 u0Var = ku5.t0.f312615d;
        q10.c cVar = new q10.c(this.f359503d, res, this.f359504e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(cVar, 3000L, "FinishProfile_waitClipboard");
        return jz5.f0.f302826a;
    }
}
