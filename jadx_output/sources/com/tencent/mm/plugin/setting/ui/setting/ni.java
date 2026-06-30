package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ni implements xg3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI f161362a;

    public ni(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI settingsModifyNameUI) {
        this.f161362a = settingsModifyNameUI;
    }

    @Override // xg3.n0
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsModifyNameUI", "updateChatBotRemarkName op ret :" + i17);
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI settingsModifyNameUI = this.f161362a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsModifyNameUI.f160547e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        settingsModifyNameUI.finish();
    }
}
