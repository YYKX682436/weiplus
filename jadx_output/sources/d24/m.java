package d24;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f225946b;

    public m(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f225945a = settingButtonExitAccount;
        this.f225946b = z2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225945a;
        android.view.ViewGroup viewGroup = settingButtonExitAccount.f161842g;
        kotlin.jvm.internal.o.d(viewGroup);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f486873mq3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById;
        v61.d.d("close_wechat_ack_btn", checkBox.isChecked() ? 1 : 0, 2);
        if (checkBox.isChecked()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "push notify mode exit");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(99L, 143L, 1L, false);
            g0Var.d(11545, java.lang.Integer.valueOf(settingButtonExitAccount.f161844i));
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
            o4Var.getClass();
            o4Var.putBoolean("is_in_notify_mode", true).commit();
            settingButtonExitAccount.x7(false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "normally exit");
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(99L, 144L, 1L, false);
            g0Var2.d(11545, java.lang.Integer.valueOf(settingButtonExitAccount.f161845m));
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
            if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
                gm0.j1.d().f70764d.C(false);
            }
            new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
            settingButtonExitAccount.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseSettingItem", "dklogout User EXIT Now uin:%d", java.lang.Integer.valueOf(gm0.j1.b().h()));
            if (!gm0.j1.b().t() || c01.z1.x()) {
                settingButtonExitAccount.y7();
            } else {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                d24.e eVar = new d24.e(settingButtonExitAccount);
                settingButtonExitAccount.f161847o = eVar;
                d17.a(281, eVar);
                de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new d24.f(wi6, settingButtonExitAccount), false);
                settingButtonExitAccount.f161846n = b4Var;
                b4Var.c(5000L, 5000L);
                settingButtonExitAccount.f161848p = db5.e1.Q(settingButtonExitAccount.getContext(), settingButtonExitAccount.getString(com.tencent.mm.R.string.f490573yv), settingButtonExitAccount.getString(com.tencent.mm.R.string.l7z), true, true, new d24.g(wi6, settingButtonExitAccount));
            }
        }
        this.f225946b.B();
    }
}
