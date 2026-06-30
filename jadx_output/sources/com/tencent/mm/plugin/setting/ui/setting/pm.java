package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class pm implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.rm f161451e;

    public pm(com.tencent.mm.plugin.setting.ui.setting.rm rmVar, int i17) {
        this.f161451e = rmVar;
        this.f161450d = i17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.setting.ui.setting.rm rmVar = this.f161451e;
        g4Var.f(0, rmVar.f161519a.getString(com.tencent.mm.R.string.iz6));
        boolean z17 = !com.tencent.mm.ui.bk.A();
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = rmVar.f161519a;
        if (z17) {
            g4Var.f(1, settingsSwitchAccountUI.getString(this.f161450d == 0 ? com.tencent.mm.R.string.iz8 : com.tencent.mm.R.string.iz7));
        }
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.f160683y;
        settingsSwitchAccountUI.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", settingsSwitchAccountUI.f160696s, 34575);
    }
}
