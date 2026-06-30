package ms4;

/* loaded from: classes8.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.h f331019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f331020b;

    public g(ms4.h hVar, int i17) {
        this.f331019a = hVar;
        this.f331020b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RechargeProductsDialogViewModel", "getWecoinPriceListInfo errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        ms4.h hVar = this.f331019a;
        hVar.f331033i = null;
        os4.a.a(hVar.f331031g, java.lang.Boolean.FALSE);
        boolean h17 = os4.h.h(fVar);
        androidx.lifecycle.j0 j0Var = hVar.f331029e;
        androidx.lifecycle.j0 j0Var2 = hVar.f331032h;
        if (h17) {
            if (j0Var2.getValue() == null) {
                os4.a.a(j0Var, new ms4.a(fVar.f70615a, fVar.f70616b, fVar.f70617c, null, 8, null));
                hVar.P6();
            }
            hVar.N6(8, 3, fVar.f70616b, fVar.f70617c);
        } else {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 == null) {
                if (j0Var2.getValue() == null) {
                    os4.a.a(j0Var, new ms4.a(3, -1, "", null, 8, null));
                    hVar.P6();
                }
                hVar.N6(8, 3, 3, "callback resp is null");
            } else {
                r45.js3 js3Var = (r45.js3) fVar2;
                os4.h.k("MicroMsg.RechargeProductsDialogViewModel", js3Var);
                hVar.f331034m = js3Var.f378088g;
                j0Var2.postValue(js3Var);
                pm0.v.K(null, new os4.g(js3Var, this.f331020b));
                hVar.N6(8, 3, 0, "");
            }
        }
        return jz5.f0.f302826a;
    }
}
