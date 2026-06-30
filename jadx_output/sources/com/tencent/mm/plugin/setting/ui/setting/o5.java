package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161378d;

    public o5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161378d = settingsAboutMicroMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://beian.miit.gov.cn");
        j45.l.j(this.f161378d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
