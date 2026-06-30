package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class jl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161203d;

    public jl(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161203d = settingsSearchAuthUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161203d;
        android.view.View view2 = settingsSearchAuthUI.f160650w;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = settingsSearchAuthUI.f160651x;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.U6(settingsSearchAuthUI, settingsSearchAuthUI.f160643p, settingsSearchAuthUI.f160646s);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
