package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelectSexUI f160896d;

    public c2(com.tencent.mm.plugin.setting.ui.setting.SelectSexUI selectSexUI) {
        this.f160896d = selectSexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SelectSexUI.f160170h;
        com.tencent.mm.plugin.setting.ui.setting.SelectSexUI selectSexUI = this.f160896d;
        selectSexUI.getClass();
        c01.fb a17 = c01.fb.a();
        int i18 = selectSexUI.f160174g;
        if (i18 != -1) {
            a17.f37188b = i18;
        }
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
        com.tencent.mm.plugin.report.service.b1.f(4, 4);
        selectSexUI.finish();
        return true;
    }
}
