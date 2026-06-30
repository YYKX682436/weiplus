package ms4;

/* loaded from: classes8.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.b0 f330999a;

    public a0(ms4.b0 b0Var) {
        this.f330999a = b0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f330999a.a(5, 3, fVar.f70616b, fVar.f70617c);
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "cancelWecoinRechargeRequest errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
