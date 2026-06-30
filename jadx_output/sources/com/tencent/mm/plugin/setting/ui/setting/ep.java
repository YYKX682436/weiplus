package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class ep implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161009d;

    public ep(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161009d = settingsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f161009d.onSetToTop();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
