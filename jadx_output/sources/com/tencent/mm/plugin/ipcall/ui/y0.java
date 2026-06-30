package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class y0 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f143081d;

    public y0(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f143081d = iPCallContactUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143081d;
        iPCallContactUI.f142558p = str;
        com.tencent.mm.sdk.platformtools.n3 n3Var = iPCallContactUI.f142565w;
        java.lang.Runnable runnable = iPCallContactUI.f142563u;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 200L);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        iPCallContactUI.f142554i.setVisibility(8);
        iPCallContactUI.f142551f.setVisibility(0);
        iPCallContactUI.f142555m.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12767, 1);
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143081d;
        iPCallContactUI.f142554i.setVisibility(0);
        iPCallContactUI.f142551f.setVisibility(8);
        iPCallContactUI.f142555m.setVisibility(8);
        iPCallContactUI.f142564v = false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143081d;
        iPCallContactUI.f142558p = "";
        com.tencent.mm.sdk.platformtools.n3 n3Var = iPCallContactUI.f142565w;
        java.lang.Runnable runnable = iPCallContactUI.f142563u;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 200L);
        iPCallContactUI.f142564v = true;
        iPCallContactUI.f142552g.notifyDataSetChanged();
        iPCallContactUI.f142554i.setVisibility(8);
        iPCallContactUI.f142551f.setVisibility(0);
        iPCallContactUI.f142555m.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143081d;
        iPCallContactUI.f142554i.setVisibility(0);
        iPCallContactUI.f142551f.setVisibility(8);
        iPCallContactUI.f142555m.setVisibility(8);
    }
}
