package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class k7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.l7 f161226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov6 f161228f;

    public k7(com.tencent.mm.plugin.setting.ui.setting.l7 l7Var, int i17, r45.ov6 ov6Var) {
        this.f161226d = l7Var;
        this.f161227e = i17;
        this.f161228f = ov6Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.setting.ui.setting.l7 l7Var = this.f161226d;
        com.tencent.mm.plugin.setting.ui.setting.g7 g7Var = l7Var.f161280m;
        if (g7Var != null) {
            kotlin.jvm.internal.o.d(view);
            int i17 = l7Var.f161281n;
            int i18 = l7Var.f161282o;
            r45.ov6 userAuthApp = this.f161228f;
            kotlin.jvm.internal.o.g(userAuthApp, "userAuthApp");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick position: ");
            int i19 = this.f161227e;
            sb6.append(i19);
            sb6.append(", appId: ");
            sb6.append(userAuthApp.f382560d);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUI", sb6.toString());
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = ((com.tencent.mm.plugin.setting.ui.setting.p7) g7Var).f161426a;
            rl5.r rVar = settingsAuthUI.f160342u;
            if (rVar != null) {
                rVar.h(view, new com.tencent.mm.plugin.setting.ui.setting.n7(settingsAuthUI), new com.tencent.mm.plugin.setting.ui.setting.o7(settingsAuthUI, i19, userAuthApp), i17, i18);
            }
            l14.f.f315010a.a(201, userAuthApp);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
