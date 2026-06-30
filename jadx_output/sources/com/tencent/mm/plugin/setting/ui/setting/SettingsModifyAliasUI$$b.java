package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final /* synthetic */ class SettingsModifyAliasUI$$b implements android.content.DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI.f160519u;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasUI", "onCancel");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2133L, 0L, 1L, false);
    }
}
