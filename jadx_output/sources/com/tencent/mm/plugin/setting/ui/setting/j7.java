package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class j7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.l7 f161184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f161186f;

    public j7(com.tencent.mm.plugin.setting.ui.setting.l7 l7Var, int i17, r45.ov6 ov6Var) {
        this.f161184d = l7Var;
        this.f161185e = i17;
        this.f161186f = ov6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.g7 g7Var = this.f161184d.f161280m;
        if (g7Var != null) {
            int i17 = this.f161185e;
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = ((com.tencent.mm.plugin.setting.ui.setting.p7) g7Var).f161426a;
            r45.ov6 userAuthApp = this.f161186f;
            kotlin.jvm.internal.o.g(userAuthApp, "userAuthApp");
            try {
                settingsAuthUI.f160340s = i17;
                android.content.Intent intent = new android.content.Intent(settingsAuthUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI.class);
                intent.putExtra("key_user_auth_app", userAuthApp.toByteArray());
                settingsAuthUI.startActivityForResult(intent, 1000);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsAuthUI", e17, "jump to SettingsDelAuthUI exception", new java.lang.Object[0]);
            }
            l14.f.f315010a.a(204, userAuthApp);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
