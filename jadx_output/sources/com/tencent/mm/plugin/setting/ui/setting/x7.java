package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161730d;

    public x7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161730d = settingsAuthUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI.f160327x;
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161730d;
        settingsAuthUI.Y6(false);
        settingsAuthUI.Z6(true);
        androidx.appcompat.app.AppCompatActivity context = settingsAuthUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.setting.ui.setting.b7) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.setting.ui.setting.b7.class)).O6(null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
