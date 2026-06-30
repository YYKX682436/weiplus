package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class a9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.e9 f160807d;

    public a9(com.tencent.mm.plugin.setting.ui.setting.e9 e9Var) {
        this.f160807d = e9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.e9 e9Var = this.f160807d;
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = e9Var.f160988d;
        if (itemId == settingsCareModeIntro.B) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsCareModeIntro.getContext());
            u1Var.g(e9Var.f160988d.getContext().getResources().getString(com.tencent.mm.R.string.f492980ij4));
            u1Var.a(true);
            u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.z8(this));
            u1Var.q(false);
        }
    }
}
