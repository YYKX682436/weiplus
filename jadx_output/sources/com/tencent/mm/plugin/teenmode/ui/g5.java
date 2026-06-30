package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder f173012d;

    public g5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder settingsTeenModeMainFinder) {
        this.f173012d = settingsTeenModeMainFinder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder settingsTeenModeMainFinder = this.f173012d;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder.T6(settingsTeenModeMainFinder, 2);
        settingsTeenModeMainFinder.f172887f = 2;
        settingsTeenModeMainFinder.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
