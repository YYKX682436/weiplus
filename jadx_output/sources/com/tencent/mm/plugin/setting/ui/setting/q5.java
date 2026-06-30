package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161463d;

    public q5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161463d = settingsAboutMicroMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/L2gYohyNu0eD41ud");
        j45.l.j(this.f161463d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
