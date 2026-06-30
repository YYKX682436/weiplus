package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class ja implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161190d;

    public ja(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        this.f161190d = settingsDelAuthUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI = this.f161190d;
        r45.ov6 ov6Var = settingsDelAuthUI.f160382e;
        if (ov6Var != null) {
            l14.f.f315010a.a(205, ov6Var);
        }
        settingsDelAuthUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsDelAuthUI.getContext(), 1, true);
        java.lang.String string = settingsDelAuthUI.getResources().getString(com.tencent.mm.R.string.ipe);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.ov6 ov6Var2 = settingsDelAuthUI.f160382e;
        java.lang.String str = ov6Var2 != null ? ov6Var2.f382561e : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        k0Var.r(format, 17, i65.a.b(settingsDelAuthUI, 14), null);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.la(settingsDelAuthUI);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.ma(settingsDelAuthUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsDelAuthUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
