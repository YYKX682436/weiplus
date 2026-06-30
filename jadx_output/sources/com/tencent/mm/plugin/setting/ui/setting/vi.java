package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class vi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI f161647d;

    public vi(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI) {
        this.f161647d = settingsMusicAiCoverModelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI.f160567h;
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCoverModelUI settingsMusicAiCoverModelUI = this.f161647d;
        settingsMusicAiCoverModelUI.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tyt_create_page_switch_model_complete", "view_clk", kz5.b1.e(new jz5.l("model_type", java.lang.String.valueOf(settingsMusicAiCoverModelUI.f160569e))), 5, false);
        qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
        int i18 = settingsMusicAiCoverModelUI.f160569e;
        ef0.y2 y2Var = (ef0.y2) o8Var;
        y2Var.getClass();
        bw5.lc0 Ui = y2Var.Ui();
        int i19 = Ui != null ? Ui.f29743m : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setAiCoverModelType state: " + i18 + ", old: " + i19);
        bw5.lc0 Ui2 = y2Var.Ui();
        if (Ui2 != null) {
            Ui2.f29743m = i18;
            Ui2.f29749s[7] = true;
        }
        y2Var.wi();
        pq5.g l17 = new vk4.f(y2Var.Ui()).l();
        l17.f(settingsMusicAiCoverModelUI);
        l17.q(new ef0.s2(y2Var, i18, i19));
        settingsMusicAiCoverModelUI.finish();
        return true;
    }
}
