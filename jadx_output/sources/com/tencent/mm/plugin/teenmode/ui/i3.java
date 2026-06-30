package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro f173031d;

    public i3(com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro) {
        this.f173031d = settingsSysTeenModeIntro;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro.f172832s;
        com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro = this.f173031d;
        settingsSysTeenModeIntro.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(settingsSysTeenModeIntro, "com.tencent.mm.ui.LauncherUI", intent, null);
        settingsSysTeenModeIntro.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
