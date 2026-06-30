package hr3;

/* loaded from: classes.dex */
public class oh implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283867a;

    public oh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f283867a = sayHiWithSnsPermissionUI3;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283867a;
        sayHiWithSnsPermissionUI3.hideVKB();
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.f(sayHiWithSnsPermissionUI3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(sayHiWithSnsPermissionUI3.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
