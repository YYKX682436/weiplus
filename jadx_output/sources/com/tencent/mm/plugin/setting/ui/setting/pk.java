package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class pk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI f161447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f161448e;

    public pk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, android.widget.TextView textView) {
        this.f161447d = settingsPersonalInfoPreviewUI;
        this.f161448e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI.f160597g;
        java.lang.Object value = ((jz5.n) this.f161447d.f160598d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        intent.putExtra("rawUrl", (java.lang.String) value);
        intent.putExtra("show_feedback", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(this.f161448e.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f61522d = 151L;
        userPrivacySettingClientReportStruct.k();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
