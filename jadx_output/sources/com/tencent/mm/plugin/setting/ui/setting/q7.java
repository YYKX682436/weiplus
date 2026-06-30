package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public final class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f161465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161466e;

    public q7(android.widget.ProgressBar progressBar, com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161465d = progressBar;
        this.f161466e = settingsAuthUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f161465d.setVisibility(0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.T6(this.f161466e);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
