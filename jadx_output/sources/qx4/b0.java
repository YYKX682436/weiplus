package qx4;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f367388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f367389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f367390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.MMActivity mMActivity, org.json.JSONObject jSONObject, java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f367388d = mMActivity;
        this.f367389e = jSONObject;
        this.f367390f = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zx4.l0 l0Var = new zx4.l0();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f367388d;
        java.lang.String optString = this.f367389e.optString("exif", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        l0Var.g(webViewUI, false, true, optString, new qx4.a0(this.f367390f));
        return jz5.f0.f302826a;
    }
}
