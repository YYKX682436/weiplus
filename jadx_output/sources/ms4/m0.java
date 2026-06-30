package ms4;

/* loaded from: classes8.dex */
public final class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.o0 f331066a;

    public m0(ms4.o0 o0Var) {
        this.f331066a = o0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeViewModel", "getWecoinPageInfoRequest errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        boolean h17 = os4.h.h(fVar);
        ms4.o0 o0Var = this.f331066a;
        if (h17) {
            if (o0Var.f331093o == null) {
                o0Var.f331091m.postValue(new ms4.a(fVar.f70615a, fVar.f70616b, fVar.f70617c, null, 8, null));
            }
            o0Var.N6(3, fVar.f70616b, fVar.f70617c);
        } else {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 == null) {
                if (o0Var.f331093o == null) {
                    o0Var.f331091m.postValue(new ms4.a(3, -1, "", null, 8, null));
                }
                o0Var.N6(3, 3, "callback resp is null");
            } else {
                r45.hs3 hs3Var = (r45.hs3) fVar2;
                os4.h.k("MicroMsg.WeCoinRechargeViewModel", hs3Var);
                o0Var.f331087f.postValue(new ms4.j(hs3Var.f376420h, hs3Var.f376417e));
                o0Var.f331086e.postValue(java.lang.Long.valueOf(hs3Var.f376416d));
                o0Var.f331088g.postValue(hs3Var.f376421i);
                o0Var.f331089h.postValue(hs3Var.f376418f);
                o0Var.f331090i.postValue(hs3Var.f376422m);
                o0Var.f331092n.postValue(new ms4.k0(hs3Var.f376423n, hs3Var.f376424o));
                o0Var.f331097s.postValue(hs3Var.f376425p);
                o0Var.f331093o = hs3Var;
                os4.h.l(hs3Var.f376416d);
                o0Var.f331094p.postValue(java.lang.Boolean.valueOf(((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()));
                o0Var.N6(3, 0, "");
            }
        }
        return jz5.f0.f302826a;
    }
}
