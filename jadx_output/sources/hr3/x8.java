package hr3;

/* loaded from: classes.dex */
public final class x8 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.z8 f284175a;

    public x8(hr3.z8 z8Var) {
        this.f284175a = z8Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://");
        sb6.append(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn));
        sb6.append("/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=");
        hr3.z8 z8Var = this.f284175a;
        sb6.append(com.tencent.mm.sdk.platformtools.m2.f(z8Var.getContext()));
        java.lang.String sb7 = sb6.toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", sb7);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(z8Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
