package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class b2 implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.n2 f145173a;

    public b2(com.tencent.mm.plugin.luckymoney.model.n2 n2Var) {
        this.f145173a = n2Var;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        java.util.LinkedList linkedList;
        r45.co3 co3Var = (r45.co3) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do get show source net callback");
        if (co3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "retcode: %s", java.lang.Integer.valueOf(co3Var.f371703d));
            if (co3Var.f371703d != 0 || (linkedList = co3Var.f371705f) == null) {
                return;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.wv3 wv3Var = (r45.wv3) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load resource: %s, %s", wv3Var.f389498d, wv3Var.f389500f);
                if (wv3Var.f389499e <= 0) {
                    this.f145173a.f145459d.vj(wv3Var);
                }
            }
        }
    }
}
