package ms4;

/* loaded from: classes8.dex */
public class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js4.o f331131a;

    public x(ms4.z zVar, js4.o oVar) {
        this.f331131a = oVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinManagerImplement", "CgiGetWecoinBalanceRequest errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        boolean h17 = os4.h.h(fVar);
        js4.o oVar = this.f331131a;
        if (h17) {
            if (oVar == null) {
                return null;
            }
            oVar.a(fVar.f70615a, fVar.f70616b, fVar.f70617c);
            return null;
        }
        r45.fs3 fs3Var = (r45.fs3) fVar.f70618d;
        fs3Var.f374586e = false;
        if (oVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinManagerImplement", "CgiGetWecoinBalanceRequest response.balance: %s newUserDiscount: %s", java.lang.Long.valueOf(fs3Var.f374585d), java.lang.Boolean.valueOf(fs3Var.f374586e));
        os4.h.l(fs3Var.f374585d);
        oVar.onSuccess(fs3Var);
        return null;
    }
}
