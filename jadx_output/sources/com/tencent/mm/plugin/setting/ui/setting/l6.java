package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.m6 f161273e;

    public l6(com.tencent.mm.plugin.setting.ui.setting.m6 m6Var, int i17) {
        this.f161273e = m6Var;
        this.f161272d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.m6 m6Var = this.f161273e;
        ((android.app.Dialog) m6Var.f161315d.getTag()).dismiss();
        gm0.j1.u().c().w(327686, java.lang.Integer.valueOf(this.f161272d));
        gm0.j1.u().c().i(true);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI = m6Var.f161317f;
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.f160275o;
        settingsAboutSystemUI.d7();
    }
}
