package ms4;

/* loaded from: classes8.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.o0 f331063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f331064b;

    public l0(ms4.o0 o0Var, yz5.l lVar) {
        this.f331063a = o0Var;
        this.f331064b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeViewModel", "getWecoinPageInfoRequest errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        ms4.o0 o0Var = this.f331063a;
        o0Var.f331096r.postValue(java.lang.Boolean.FALSE);
        boolean h17 = os4.h.h(fVar);
        yz5.l lVar = this.f331064b;
        if (h17) {
            java.lang.Long l17 = (java.lang.Long) o0Var.f331086e.getValue();
            if (l17 != null && l17.longValue() == 0) {
                r2 = false;
            }
            lVar.invoke(java.lang.Boolean.valueOf(r2));
        } else {
            lVar.invoke(java.lang.Boolean.valueOf(((r45.hs3) fVar.f70618d).f376416d != 0));
        }
        return jz5.f0.f302826a;
    }
}
