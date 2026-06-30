package k24;

/* loaded from: classes11.dex */
public final class n implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg f303765a;

    public n(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg) {
        this.f303765a = settingSwitchNotifyNewMsg;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyNewMsg settingSwitchNotifyNewMsg = this.f303765a;
        settingSwitchNotifyNewMsg.f161957i = z17;
        settingSwitchNotifyNewMsg.t7(settingSwitchNotifyNewMsg.getActivity().getIntent());
        settingSwitchNotifyNewMsg.f885d = settingSwitchNotifyNewMsg.v7();
        if (z17) {
            ip.l.r(true);
            l14.e.f315008a.b(l14.d.f315003e);
            settingSwitchNotifyNewMsg.s7();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 3;
            objArr[1] = java.lang.Integer.valueOf(settingSwitchNotifyNewMsg.f161956h ? 1 : 2);
            g0Var.d(29634, objArr);
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingSwitchNotifyNewMsg.getContext(), 1, false);
            k0Var.s(com.tencent.mm.ui.id.b(settingSwitchNotifyNewMsg.getContext()).inflate(com.tencent.mm.R.layout.dmw, (android.view.ViewGroup) null), false);
            k0Var.f211872n = new k24.j(settingSwitchNotifyNewMsg);
            k0Var.f211881s = new k24.k(settingSwitchNotifyNewMsg);
            k0Var.m("取消");
            k0Var.C = new k24.l(settingSwitchNotifyNewMsg);
            k0Var.f211854d = new k24.m(settingSwitchNotifyNewMsg);
            k0Var.v();
        }
        if (!fp.h.c(26) || ip.b.u()) {
            if (settingSwitchNotifyNewMsg.f161957i) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 0L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 1L, 1L, false);
            }
            c01.a9.b(true, false);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingSwitchNotifyNewMsg.getContext());
        u1Var.g(settingSwitchNotifyNewMsg.getString(com.tencent.mm.R.string.f492990df4));
        u1Var.a(false);
        settingSwitchNotifyNewMsg.f161957i = false;
        ip.l.r(false);
        u1Var.b(new k24.i(settingSwitchNotifyNewMsg));
        u1Var.q(false);
    }
}
