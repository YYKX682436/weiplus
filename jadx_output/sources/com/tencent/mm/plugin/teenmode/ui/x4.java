package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct f173184d;

    public x4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct) {
        this.f173184d = settingsTeenModeMainBizAcct;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct = this.f173184d;
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct.T6(settingsTeenModeMainBizAcct, 0);
        settingsTeenModeMainBizAcct.f172879h = 0;
        settingsTeenModeMainBizAcct.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainBizAcct$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
