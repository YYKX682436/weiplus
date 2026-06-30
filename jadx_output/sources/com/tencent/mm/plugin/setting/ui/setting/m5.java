package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class m5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161314d;

    public m5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161314d = settingsAboutMicroMsgUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161314d;
        if (settingsAboutMicroMsgUI.f160273u) {
            g4Var.f(0, settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.iov));
        }
        if (settingsAboutMicroMsgUI.f160274v) {
            g4Var.f(1, settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.iou));
        }
    }
}
