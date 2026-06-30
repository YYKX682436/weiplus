package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct f173195d;

    public y4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct) {
        this.f173195d = settingsTeenModeMainBizAcct;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct = this.f173195d;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct.T6(settingsTeenModeMainBizAcct, 2);
        settingsTeenModeMainBizAcct.f172879h = 2;
        settingsTeenModeMainBizAcct.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
