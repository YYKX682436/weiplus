package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI f141844d;

    public x2(com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI) {
        this.f141844d = gameDownloadGuidanceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("pb_download_guidance");
        if (D0 == null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.v2(this));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.w2(this, new com.tencent.mm.plugin.game.model.v1(D0)));
        }
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI gameDownloadGuidanceUI = this.f141844d;
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.f3(d17, com.tencent.mm.plugin.game.model.f.e(gameDownloadGuidanceUI), gameDownloadGuidanceUI.f140701m, gameDownloadGuidanceUI.f140702n, gameDownloadGuidanceUI.f140703o, gameDownloadGuidanceUI.f140699h));
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", com.tencent.mm.sdk.platformtools.m2.d()).commit();
        r53.b.f392640a.b();
    }
}
