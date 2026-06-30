package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class pg implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.qg f161443a;

    public pg(com.tencent.mm.plugin.setting.ui.setting.qg qgVar) {
        this.f161443a = qgVar;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        com.tencent.mm.plugin.setting.ui.setting.qg qgVar = this.f161443a;
        if (en0Var == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = no");
            qgVar.f161475d.finish();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = yes");
            com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = qgVar.f161475d;
            settingsManageFindOtherServiceUI.f160513u.postDelayed(new com.tencent.mm.plugin.setting.ui.setting.sg(settingsManageFindOtherServiceUI), 1000L);
        }
    }
}
