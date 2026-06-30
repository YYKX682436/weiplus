package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class h6 implements com.tencent.mm.plugin.ipcall.ui.i2 {
    public h6(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
    }

    @Override // com.tencent.mm.plugin.ipcall.ui.i2
    public void a(boolean z17) {
        if (com.tencent.mm.plugin.ipcall.model.r.bj().f142482a == 5) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a;
            int C = z17 ? v2protocalVar.C(412) : v2protocalVar.C(413);
            if (C < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallEngineManager", "tryMuteMicrophone ret:" + C);
            }
            com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298162m.b(z17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12057, 1, 0, 0, 0);
        }
    }
}
