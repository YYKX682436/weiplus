package ka1;

/* loaded from: classes7.dex */
public class f extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd.y f305994a;

    public f(ka1.g gVar, yd.y yVar) {
        this.f305994a = yVar;
    }

    public final com.tencent.xweb.y0 C(java.lang.String str) {
        yd.y yVar = this.f305994a;
        ((yd.b) yVar).getClass();
        if (!yd.e.f460938j.equals(str)) {
            return null;
        }
        yd.x b17 = yVar.b("WAGameVConsole.html");
        return new com.tencent.xweb.y0(b17.f460974a, com.tencent.mapsdk.internal.rv.f51270c, b17.f460975b);
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f305994a.a();
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        return C(x0Var.getUrl().toString());
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        return C(x0Var.getUrl().toString());
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 z(com.tencent.xweb.WebView webView, java.lang.String str) {
        return C(str);
    }
}
