package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class xl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount f161763d;

    public xl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount settingsSelectCreateAccount) {
        this.f161763d = settingsSelectCreateAccount;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSelectCreateAccount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=signup/secondaryid_faq");
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount settingsSelectCreateAccount = this.f161763d;
        j45.l.j(settingsSelectCreateAccount.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23530, settingsSelectCreateAccount.f160665g, wo.w0.k(), 0, 2, 1001, 10103, null, java.lang.Integer.valueOf(settingsSelectCreateAccount.f160663e));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectCreateAccount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
