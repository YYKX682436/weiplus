package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes14.dex */
public class n extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.model.p f142483d;

    public n(com.tencent.mm.plugin.ipcall.model.p pVar) {
        this.f142483d = pVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.plugin.ipcall.model.p pVar;
        r83.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "onNetworkChange, st: %d", java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.plugin.ipcall.model.r.Ni().f324720d) {
            int i18 = com.tencent.mm.plugin.ipcall.model.r.bj().f142482a;
            if ((i18 == 4 || i18 == 5) && i17 == 4 && (fVar = (pVar = this.f142483d).f142497t) != null) {
                fVar.j(pVar.f142498u);
            }
        }
    }
}
