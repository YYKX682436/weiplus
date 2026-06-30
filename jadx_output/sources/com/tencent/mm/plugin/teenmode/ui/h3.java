package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro f173021d;

    public h3(com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro) {
        this.f173021d = settingsSysTeenModeIntro;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro.f172832s;
        com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro = this.f173021d;
        new vh4.c1().l().h(new com.tencent.mm.plugin.teenmode.ui.e3(db5.e1.Q(settingsSysTeenModeIntro.getContext(), "", settingsSysTeenModeIntro.getContext().getString(com.tencent.mm.R.string.ggd), true, false, null), settingsSysTeenModeIntro));
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
