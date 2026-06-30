package d24;

/* loaded from: classes11.dex */
public final class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225972d;

    public y(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225972d = settingButtonLogoutAccount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225972d;
        android.widget.CheckBox checkBox = settingButtonLogoutAccount.f161866y;
        if (checkBox != null) {
            if (checkBox != null && checkBox.isChecked()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "push notify mode exit");
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(99L, 143L, 1L, false);
                g0Var.d(11545, java.lang.Integer.valueOf(settingButtonLogoutAccount.f161861t));
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
                o4Var.getClass();
                o4Var.putBoolean("is_in_notify_mode", true).commit();
                settingButtonLogoutAccount.C7(false);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "normally exit");
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(99L, 144L, 1L, false);
        g0Var2.d(11545, java.lang.Integer.valueOf(settingButtonLogoutAccount.f161862u));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
        if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
            gm0.j1.d().f70764d.C(false);
        }
        new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
        settingButtonLogoutAccount.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseSettingItem", "dklogout User EXIT Now uin:%d", java.lang.Integer.valueOf(gm0.j1.b().h()));
        if (!gm0.j1.b().t() || c01.z1.x()) {
            settingButtonLogoutAccount.E7();
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        d24.n nVar = new d24.n(settingButtonLogoutAccount);
        settingButtonLogoutAccount.A = nVar;
        d17.a(281, nVar);
        de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new d24.o(wi6, settingButtonLogoutAccount), false);
        settingButtonLogoutAccount.f161867z = b4Var;
        b4Var.c(5000L, 5000L);
        settingButtonLogoutAccount.B = db5.e1.Q(settingButtonLogoutAccount.getContext(), settingButtonLogoutAccount.getString(com.tencent.mm.R.string.f490573yv), settingButtonLogoutAccount.getString(com.tencent.mm.R.string.l7z), true, true, new d24.p(wi6, settingButtonLogoutAccount));
    }
}
