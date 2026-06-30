package com.tencent.mm.plugin.ipcall;

/* loaded from: classes14.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.j f142442d;

    public i(com.tencent.mm.plugin.ipcall.j jVar) {
        this.f142442d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.ipcall.l lVar;
        com.tencent.mm.plugin.ipcall.j jVar = this.f142442d;
        jVar.l();
        if (!com.tencent.mm.plugin.ipcall.model.r.bj().c() || (lVar = jVar.f142444d) == null) {
            return true;
        }
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = (com.tencent.mm.plugin.ipcall.ui.l6) lVar;
        int H1 = (int) com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.plugin.ipcall.model.r.Bi().f142508i.f142456s);
        if (H1 <= 0) {
            H1 = 0;
        }
        l6Var.A = H1;
        l6Var.g(5);
        return true;
    }
}
