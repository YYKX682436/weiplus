package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI f161093d;

    public h3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI) {
        this.f161093d = settingFingerprintHomeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI = this.f161093d;
        settingFingerprintHomeUI.f160214n = false;
        settingFingerprintHomeUI.V6(false, false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
