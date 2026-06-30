package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class sn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI f161548d;

    public sn(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI) {
        this.f161548d = settingsTrustFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fys) + "/security/readtemplate?t=w_security_center_website/trusted_friend_guide");
        j45.l.j(this.f161548d, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
