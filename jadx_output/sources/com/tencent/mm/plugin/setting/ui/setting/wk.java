package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class wk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f161710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI f161711e;

    public wk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI, android.graphics.Bitmap bitmap) {
        this.f161711e = settingsPersonalInfoUI;
        this.f161710d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.a();
        c01.z1.r();
        if (gm0.j1.a()) {
            android.graphics.Bitmap bitmap = this.f161710d;
            if (bitmap != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.T6(bitmap, com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".last", true, false));
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, true));
        }
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.f160601m;
        com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI = this.f161711e;
        com.tencent.mm.ui.base.preference.HeadImgNewPreference headImgNewPreference = (com.tencent.mm.ui.base.preference.HeadImgNewPreference) ((com.tencent.mm.ui.base.preference.h0) settingsPersonalInfoUI.f160602g).h("settings_change_avatar");
        headImgNewPreference.M(c01.z1.r());
        headImgNewPreference.S = new com.tencent.mm.plugin.setting.ui.setting.sk(settingsPersonalInfoUI);
        if (settingsPersonalInfoUI.f160603h) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 4, 4);
        }
    }
}
