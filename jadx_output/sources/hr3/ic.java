package hr3;

/* loaded from: classes.dex */
public class ic implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 f283656a;

    public ic(com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2) {
        this.f283656a = permissionSettingUI2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2 = this.f283656a;
        permissionSettingUI2.hideVKB();
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.f(permissionSettingUI2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(permissionSettingUI2.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
