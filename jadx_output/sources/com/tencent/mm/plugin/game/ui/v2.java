package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.x2 f141797d;

    public v2(com.tencent.mm.plugin.game.ui.x2 x2Var) {
        this.f141797d = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.x2 x2Var = this.f141797d;
        if (x2Var.f141844d.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI = x2Var.f141844d;
        gameDownloadGuidanceUI.f140753r = r53.f.e(gameDownloadGuidanceUI);
        x2Var.f141844d.f140753r.show();
    }
}
