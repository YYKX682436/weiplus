package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class to implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161585d;

    public to(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161585d = settingsUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).fj((de0.f) m1Var, "last_logout_no_pwd_ticket_for_one_click", true);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.setting.ui.setting.so(this));
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161585d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsUI.f160747p;
        if (b4Var != null) {
            b4Var.d();
        }
        settingsUI.l7();
    }
}
