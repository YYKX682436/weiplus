package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.v1 f141818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.x2 f141819e;

    public w2(com.tencent.mm.plugin.game.ui.x2 x2Var, com.tencent.mm.plugin.game.model.v1 v1Var) {
        this.f141819e = x2Var;
        this.f141818d = v1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.x2 x2Var = this.f141819e;
        try {
            x2Var.f141844d.Z6(this.f141818d, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", e17.getMessage());
            x2Var.f141844d.finish();
        }
    }
}
