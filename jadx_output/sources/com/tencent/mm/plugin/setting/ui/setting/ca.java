package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f160902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f160904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.da f160905g;

    public ca(com.tencent.mm.plugin.setting.ui.setting.da daVar, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f160905g = daVar;
        this.f160902d = m1Var;
        this.f160903e = i17;
        this.f160904f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.da daVar = this.f160905g;
        android.app.ProgressDialog progressDialog = daVar.f160938d.f160372e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            daVar.f160938d.f160372e = null;
        }
        daVar.f160938d.f160380p = null;
        if (this.f160902d.getType() == 255) {
            boolean z17 = (this.f160903e == -3 && this.f160904f == 4) ? false : true;
            android.content.Intent intent = new android.content.Intent(daVar.f160938d, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI.class);
            intent.putExtra("has_pwd", z17);
            com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI = daVar.f160938d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(settingsCreateAliasUI, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsCreateAliasUI$5$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsCreateAliasUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(settingsCreateAliasUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsCreateAliasUI$5$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            daVar.f160938d.finish();
        }
    }
}
