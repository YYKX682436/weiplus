package k24;

/* loaded from: classes11.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite f303755d;

    public d(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite) {
        this.f303755d = settingSwitchNotifyInvite;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        if (menuItem.getItemId() == 1) {
            ip.l.s(false);
            com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite settingSwitchNotifyInvite = this.f303755d;
            settingSwitchNotifyInvite.s7();
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(2);
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.setType(1);
            f9Var.u1("weixin");
            f9Var.d1(settingSwitchNotifyInvite.getContext().getString(com.tencent.mm.R.string.iu_, wo.w0.m()));
            c01.w9.x(f9Var);
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("weixin");
            if (p17 != null) {
                p17.l1(settingSwitchNotifyInvite.getContext().getString(com.tencent.mm.R.string.iu_, wo.w0.m()));
                p17.Y1(p17.d1() + 1);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "weixin");
            } else {
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                l4Var.l1(settingSwitchNotifyInvite.getContext().getString(com.tencent.mm.R.string.iu_, wo.w0.m()));
                l4Var.b2("weixin");
                l4Var.Y1(1);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
            }
            l14.e.f315008a.b(l14.d.f315004f);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 3L, 1L, false);
            c01.a9.b(false, true);
        }
    }
}
