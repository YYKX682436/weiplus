package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class ma implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161322d;

    public ma(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        this.f161322d = settingsDelAuthUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI = this.f161322d;
            r45.ov6 ov6Var = settingsDelAuthUI.f160382e;
            if (ov6Var != null) {
                l14.f.f315010a.a(206, ov6Var);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsDelAuthUI.f160383f;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            settingsDelAuthUI.f160383f = db5.e1.Q(settingsDelAuthUI.getContext(), "", settingsDelAuthUI.getContext().getString(com.tencent.mm.R.string.ipg), true, false, null);
            r45.ov6 ov6Var2 = settingsDelAuthUI.f160382e;
            java.lang.String str = ov6Var2 != null ? ov6Var2.f382560d : null;
            if (str == null || str.length() == 0) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = settingsDelAuthUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.setting.ui.setting.d7 d7Var = (com.tencent.mm.plugin.setting.ui.setting.d7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.d7.class);
            r45.ov6 ov6Var3 = settingsDelAuthUI.f160382e;
            java.lang.String str2 = ov6Var3 != null ? ov6Var3.f382560d : null;
            if (str2 == null) {
                str2 = "";
            }
            d7Var.O6(str2, 1);
        }
    }
}
