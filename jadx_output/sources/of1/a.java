package of1;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.webview.o f344880d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f344881e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.v0 f344882f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.permission.w f344883g;

    public a(com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar) {
        this.f344880d = oVar;
        this.f344881e = ((of1.w1) oVar).getWebView();
    }

    public final android.content.Context a() {
        android.app.Activity a17 = q75.a.a(((of1.w1) this.f344880d).getAndroidContext());
        if (a17 != null) {
            return a17;
        }
        ft.c4 c4Var = (ft.c4) i95.n0.c(ft.c4.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((et.q) c4Var).getClass();
        return com.tencent.mm.plugin.appbrand.ui.z6.b(context);
    }
}
