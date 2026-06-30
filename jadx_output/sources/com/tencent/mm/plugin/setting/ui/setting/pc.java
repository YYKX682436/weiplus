package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class pc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI f161434d;

    public pc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI) {
        this.f161434d = settingsHearingAidFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI = this.f161434d;
        kotlinx.coroutines.y0 b17 = v65.m.b(settingsHearingAidFinishUI);
        wd0.g1 g1Var = settingsHearingAidFinishUI.f160414d;
        if (g1Var == null) {
            kotlin.jvm.internal.o.o("finalMode");
            throw null;
        }
        ((u14.t) l1Var).fj(b17, g1Var);
        com.tencent.xweb.a3.D(true, ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di(), ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni(), null);
        android.content.Intent intent = new android.content.Intent(settingsHearingAidFinishUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.class);
        intent.putExtra("result_code", -1);
        intent.addFlags(603979776);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI2 = this.f161434d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(settingsHearingAidFinishUI2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsHearingAidFinishUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(settingsHearingAidFinishUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsHearingAidFinishUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
