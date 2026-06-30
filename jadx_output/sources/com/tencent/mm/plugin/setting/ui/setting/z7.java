package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class z7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f161816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161817e;

    public z7(r45.ov6 ov6Var, com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161816d = ov6Var;
        this.f161817e = settingsAuthUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            l14.f fVar = l14.f.f315010a;
            r45.ov6 ov6Var = this.f161816d;
            fVar.a(203, ov6Var);
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.f160327x;
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161817e;
            settingsAuthUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUI", "doDealUserAuth appId: " + ov6Var.f382560d + ", appName: " + ov6Var.f382561e);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsAuthUI.f160341t;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            settingsAuthUI.f160341t = db5.e1.Q(settingsAuthUI.getContext(), "", settingsAuthUI.getContext().getString(com.tencent.mm.R.string.ipg), true, false, null);
            java.lang.String str = ov6Var.f382560d;
            if (str == null || str.length() == 0) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = settingsAuthUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.setting.ui.setting.d7 d7Var = (com.tencent.mm.plugin.setting.ui.setting.d7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.d7.class);
            java.lang.String str2 = ov6Var.f382560d;
            if (str2 == null) {
                str2 = "";
            }
            d7Var.O6(str2, 1);
        }
    }
}
