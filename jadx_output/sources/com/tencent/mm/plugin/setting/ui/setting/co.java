package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class co implements android.content.DialogInterface.OnClickListener {
    public co(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11545, 5);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
    }
}
