package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.v1 f141017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.b3 f141018e;

    public a3(com.tencent.mm.plugin.game.ui.b3 b3Var, com.tencent.mm.plugin.game.model.v1 v1Var) {
        this.f141018e = b3Var;
        this.f141017d = v1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.b3 b3Var = this.f141018e;
        try {
            b3Var.f141045f.Z6(this.f141017d, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", e17.getMessage());
            b3Var.f141045f.finish();
        }
        android.app.Dialog dialog = b3Var.f141045f.f140753r;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadGuidanceUI", "Server data parsing time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b3Var.f141044e));
    }
}
