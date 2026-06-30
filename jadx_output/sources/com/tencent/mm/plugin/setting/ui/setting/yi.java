package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class yi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI f161789d;

    public yi(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI) {
        this.f161789d = settingsMusicAiCreateModelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI.f160572h;
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicAiCreateModelUI settingsMusicAiCreateModelUI = this.f161789d;
        settingsMusicAiCreateModelUI.getClass();
        qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
        int i18 = settingsMusicAiCreateModelUI.f160574e;
        ef0.y2 y2Var = (ef0.y2) o8Var;
        y2Var.getClass();
        bw5.lc0 Ui = y2Var.Ui();
        int i19 = Ui != null ? Ui.f29746p : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setAiCreateModelType state: " + i18 + ", old: " + i19);
        bw5.lc0 Ui2 = y2Var.Ui();
        if (Ui2 != null) {
            Ui2.f29746p = i18;
            Ui2.f29749s[10] = true;
        }
        y2Var.wi();
        pq5.g l17 = new vk4.f(y2Var.Ui()).l();
        l17.f(settingsMusicAiCreateModelUI);
        l17.q(new ef0.t2(y2Var, i18, i19));
        settingsMusicAiCreateModelUI.finish();
        return true;
    }
}
