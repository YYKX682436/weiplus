package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class tj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161580d;

    public tj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161580d = settingsNotificationUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ip.l.r(false);
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(2);
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.setType(1);
            f9Var.u1("weixin");
            com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161580d;
            f9Var.d1(settingsNotificationUI.getContext().getString(com.tencent.mm.R.string.f493061m52, wo.w0.m()));
            c01.w9.x(f9Var);
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("weixin");
            if (p17 != null) {
                p17.l1(settingsNotificationUI.getContext().getString(com.tencent.mm.R.string.f493061m52, wo.w0.m()));
                p17.Y1(p17.d1() + 1);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "weixin");
            } else {
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                l4Var.l1(settingsNotificationUI.getContext().getString(com.tencent.mm.R.string.f493061m52, wo.w0.m()));
                l4Var.b2("weixin");
                l4Var.Y1(1);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
            }
            settingsNotificationUI.initView();
            l14.e.f315008a.b(l14.d.f315003e);
        }
    }
}
