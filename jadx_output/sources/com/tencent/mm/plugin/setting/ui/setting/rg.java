package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class rg implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI f161510a;

    public rg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI) {
        this.f161510a = settingsManageFindOtherServiceUI;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = this.f161510a;
        if (en0Var == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = no");
            settingsManageFindOtherServiceUI.finish();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = yes");
            settingsManageFindOtherServiceUI.f160513u.postDelayed(new com.tencent.mm.plugin.setting.ui.setting.sg(settingsManageFindOtherServiceUI), 1000L);
        }
    }
}
