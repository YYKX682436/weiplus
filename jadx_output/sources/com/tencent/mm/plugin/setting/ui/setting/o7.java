package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class o7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f161382f;

    public o7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI, int i17, r45.ov6 ov6Var) {
        this.f161380d = settingsAuthUI;
        this.f161381e = i17;
        this.f161382f = ov6Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161380d;
            settingsAuthUI.f160340s = this.f161381e;
            l14.f fVar = l14.f.f315010a;
            r45.ov6 ov6Var = this.f161382f;
            fVar.a(202, ov6Var);
            settingsAuthUI.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsAuthUI.getContext(), 1, true);
            java.lang.String string = settingsAuthUI.getResources().getString(com.tencent.mm.R.string.ipe);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String str = ov6Var.f382561e;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            k0Var.r(format, 17, i65.a.b(settingsAuthUI, 14), null);
            k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.y7(settingsAuthUI);
            k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.z7(ov6Var, settingsAuthUI);
            k0Var.v();
        }
    }
}
