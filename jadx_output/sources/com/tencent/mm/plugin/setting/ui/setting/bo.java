package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class bo implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f160881d;

    public bo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f160881d = settingsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f160881d;
        android.widget.CheckBox checkBox = settingsUI.E;
        if (checkBox != null && checkBox.isChecked()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "push notify mode exit");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(99L, 143L, 1L, false);
            g0Var.d(11545, 6);
            v61.d.d("close_wechat_ack_btn", 1, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
            o4Var.getClass();
            o4Var.putBoolean("is_in_notify_mode", true).commit();
            settingsUI.a7(false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "normally exit");
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(99L, 144L, 1L, false);
        g0Var2.d(11545, 7);
        v61.d.d("close_wechat_ack_btn", 0, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
        if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
            gm0.j1.d().f70764d.C(false);
        }
        new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
        settingsUI.X6();
    }
}
