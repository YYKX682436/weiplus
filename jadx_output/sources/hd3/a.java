package hd3;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "sendMessageToDevTools";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        qk.u6 u6Var;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("payload");
        lc3.e eVar = this.f317890a;
        sc3.k1 k1Var = eVar instanceof sc3.k1 ? (sc3.k1) eVar : null;
        if (k1Var == null || (u6Var = (qk.u6) ((jz5.n) k1Var.H).getValue()) == null) {
            return;
        }
        ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Di(u6Var, optString);
    }
}
