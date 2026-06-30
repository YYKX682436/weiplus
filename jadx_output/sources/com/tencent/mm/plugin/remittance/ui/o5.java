package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.q5 f157861d;

    public o5(com.tencent.mm.plugin.remittance.ui.q5 q5Var) {
        this.f157861d = q5Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.remittance.model.v0 v0Var;
        java.util.Iterator it = this.f157861d.f157898d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.remittance.model.e1 e1Var = (com.tencent.mm.plugin.remittance.model.e1) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f156811a) && (v0Var = e1Var.f156812b) != null && v0Var.f157036a != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", " add option :%s", e1Var.f156811a);
                g4Var.f(i17, e1Var.f156811a);
            }
            i17++;
        }
    }
}
