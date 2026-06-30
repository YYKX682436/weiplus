package k71;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f304675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17) {
        super(1);
        this.f304675d = appCompatActivity;
        this.f304676e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        kotlin.jvm.internal.o.g(it, "it");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f304675d;
        if (appCompatActivity instanceof com.tencent.mm.plugin.account.ui.MobileInputUI) {
            ((com.tencent.mm.plugin.account.ui.MobileInputUI) appCompatActivity).getClass();
            v61.d.g("login_forget_password", 2);
        } else if (appCompatActivity instanceof com.tencent.mm.plugin.account.ui.LoginUI) {
            ((com.tencent.mm.plugin.account.ui.LoginUI) appCompatActivity).getClass();
            v61.d.g("login_forget_password", 3);
        }
        java.lang.String str = appCompatActivity.getString(com.tencent.mm.R.string.f492405gi2) + com.tencent.mm.sdk.platformtools.m2.d();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(appCompatActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        int i17 = this.f304676e;
        if (i17 > 0) {
            v61.d.f(i17);
        }
        return jz5.f0.f302826a;
    }
}
