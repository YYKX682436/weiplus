package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.x1 f141441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.l0 f141442e;

    public k0(com.tencent.mm.plugin.game.ui.l0 l0Var, com.tencent.mm.plugin.game.model.x1 x1Var) {
        this.f141442e = l0Var;
        this.f141441d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.l0 l0Var = this.f141442e;
        try {
            com.tencent.mm.plugin.game.ui.GameCenterUI5.Z6(l0Var.f141454f, this.f141441d, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUI5", "GameCenter crash, %s", e17.getMessage());
            l0Var.f141454f.finish();
        }
        android.app.Dialog dialog = l0Var.f141454f.f140727z;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUI5", "Server data parsing time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - l0Var.f141453e));
    }
}
