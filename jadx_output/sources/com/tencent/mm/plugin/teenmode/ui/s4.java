package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class s4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173133d;

    public s4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173133d = settingsTeenModeMain;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20917, 4, 1, 2, "", "", "", "");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f173133d;
            db5.t7.h(settingsTeenModeMain, settingsTeenModeMain.getString(com.tencent.mm.R.string.jrl));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, 0L);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_SHOW_TEENAGER_REST_TIME_LONG_SYNC, 0L);
            java.lang.String str = "default";
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).Yd()) {
                if (gm0.j1.a()) {
                    str = gm0.j1.b().j();
                    kotlin.jvm.internal.o.f(str, "getUinString(...)");
                }
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.TeenModeStatusManager_".concat(str));
                kotlin.jvm.internal.o.f(M, "getMMKV(...)");
                M.putBoolean("MMKVKey_ManuallyClose", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeStatusManager", "resetManuallyClose:true");
            } else {
                if (gm0.j1.a()) {
                    str = gm0.j1.b().j();
                    kotlin.jvm.internal.o.f(str, "getUinString(...)");
                }
                com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.TeenModeStatusManager_".concat(str));
                kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
                M2.putBoolean("MMKVKey_ManuallyClose", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeStatusManager", "resetManuallyClose:false");
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.teenmode.ui.r4(this), 2000L);
        }
    }
}
