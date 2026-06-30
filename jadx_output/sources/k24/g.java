package k24;

/* loaded from: classes11.dex */
public final class g implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite f303758a;

    public g(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite) {
        this.f303758a = settingSwitchNotifyInvite;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite = this.f303758a;
        settingSwitchNotifyInvite.f161955i = z17;
        settingSwitchNotifyInvite.t7(settingSwitchNotifyInvite.getActivity().getIntent());
        settingSwitchNotifyInvite.f885d = settingSwitchNotifyInvite.v7();
        if (!z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingSwitchNotifyInvite.getContext(), 1, false);
            k0Var.s(com.tencent.mm.ui.id.b(settingSwitchNotifyInvite.getContext()).inflate(com.tencent.mm.R.layout.dmx, (android.view.ViewGroup) null), false);
            k0Var.f211872n = new k24.c(settingSwitchNotifyInvite);
            k0Var.f211881s = new k24.d(settingSwitchNotifyInvite);
            k0Var.m("取消");
            k0Var.C = new k24.e(settingSwitchNotifyInvite);
            k0Var.f211854d = new k24.f(settingSwitchNotifyInvite);
            k0Var.v();
            return;
        }
        ip.l.s(true);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(500L, 2L, 1L, false);
        c01.a9.b(false, true);
        l14.e.f315008a.b(l14.d.f315004f);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 4;
        objArr[1] = java.lang.Integer.valueOf(settingSwitchNotifyInvite.f161954h ? 1 : 2);
        g0Var.d(29634, objArr);
        settingSwitchNotifyInvite.s7();
    }
}
