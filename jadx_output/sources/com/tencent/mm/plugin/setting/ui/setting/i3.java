package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI f161143d;

    public i3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI) {
        this.f161143d = settingFingerprintHomeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.ub.f161603a;
        if (str == null) {
            str = "";
        }
        hashMap.put("fingerprint_session_id", str);
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_reset_button", "view_clk", hashMap);
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI = this.f161143d;
        settingFingerprintHomeUI.f160214n = true;
        settingFingerprintHomeUI.V6(true, true);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
