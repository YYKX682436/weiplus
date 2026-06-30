package dk2;

/* loaded from: classes3.dex */
public final class j1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233631b;

    public j1(dk2.r4 r4Var, yz5.p pVar) {
        this.f233630a = r4Var;
        this.f233631b = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        dk2.r4 r4Var = this.f233630a;
        com.tencent.mars.xlog.Log.i(r4Var.f234009d, "doGetGiftList errType:" + i17 + ", errCode:" + i18);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.p pVar = this.f233631b;
        if (i17 == 0 && i18 == 0) {
            dk2.ef efVar = dk2.ef.f233372a;
            dk2.ef.N = ((r45.d81) fVar.f70618d).getByteString(2);
            dk2.ef.P = ((r45.d81) fVar.f70618d).getInteger(3);
            dk2.ef.Q = ((r45.d81) fVar.f70618d).getInteger(4);
            if (zl2.r4.f473950a.w1()) {
                r45.aq1 aq1Var = new r45.aq1();
                aq1Var.set(1, db2.t4.f228171a.a(11250));
                aq1Var.set(2, xy2.c.f(r4Var.f234008c));
                pq5.g l17 = aq1Var.d().l();
                l17.K(new dk2.i1(pVar, i18, r4Var));
                if (r4Var.M() == null || !(r4Var.M() instanceof com.tencent.mm.ui.MMActivity)) {
                    return l17;
                }
                android.content.Context M = r4Var.M();
                kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) M);
                return l17;
            }
            if (pVar != null) {
                pVar.invoke(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18));
                return f0Var;
            }
        } else if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18));
            return f0Var;
        }
        return null;
    }
}
