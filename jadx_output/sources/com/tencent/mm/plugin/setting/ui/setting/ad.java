package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class ad implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f160811d;

    public ad(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f160811d = settingsHearingAidInitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI = this.f160811d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsHearingAidInitUI.getContext());
        u1Var.a(false);
        u1Var.g(settingsHearingAidInitUI.getString(com.tencent.mm.R.string.p0v));
        u1Var.n(settingsHearingAidInitUI.getString(com.tencent.mm.R.string.p0u));
        u1Var.j(settingsHearingAidInitUI.getString(com.tencent.mm.R.string.p0t));
        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.zc(settingsHearingAidInitUI));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
