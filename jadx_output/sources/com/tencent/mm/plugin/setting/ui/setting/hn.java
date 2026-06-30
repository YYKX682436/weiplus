package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class hn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI f161120d;

    public hn(com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI settingsSystemPermissionUI) {
        this.f161120d = settingsSystemPermissionUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f161120d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f61522d = 101L;
        userPrivacySettingClientReportStruct.k();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
