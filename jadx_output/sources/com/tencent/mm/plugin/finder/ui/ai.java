package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ai implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI f128864d;

    public ai(com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI) {
        this.f128864d = finderSettingProtectUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            int i18 = com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI.f128749w;
            com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI = this.f128864d;
            finderSettingProtectUI.getClass();
            com.tencent.mars.xlog.Log.i("FinderSettingProtectUI", "modUserProtect close");
            finderSettingProtectUI.d7();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f280090e.n(false, finderSettingProtectUI.f128752v, finderSettingProtectUI.f128751u);
        }
    }
}
