package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class s5 implements q80.f0 {
    public s5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "OpenLiteApp fail");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMicroMsgUI", "OpenLiteApp success");
    }
}
