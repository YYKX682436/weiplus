package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class g6 implements com.tencent.mm.plugin.ipcall.ui.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.l6 f142840a;

    public g6(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
        this.f142840a = l6Var;
    }

    @Override // com.tencent.mm.plugin.ipcall.ui.i2
    public void a(boolean z17) {
        if (!com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
            if ((!com.tencent.mm.plugin.ipcall.model.r.aj().f448651e) || com.tencent.mm.plugin.ipcall.model.r.bj().c()) {
                return;
            }
            com.tencent.mm.plugin.ipcall.model.r.aj().c(z17);
            return;
        }
        this.f142840a.getClass();
        j83.b Ai = com.tencent.mm.plugin.ipcall.model.r.Ai();
        if (Ai != null) {
            Ai.f298165p = z17;
        }
        j83.b Ai2 = com.tencent.mm.plugin.ipcall.model.r.Ai();
        if (Ai2 != null) {
            Ai2.f298166q = z17;
        }
        com.tencent.mm.plugin.ipcall.model.r.Di().b(z17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12057, 0, 1, 0, 0);
    }
}
