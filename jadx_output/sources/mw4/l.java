package mw4;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f331775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, yz5.r rVar) {
        super(3);
        this.f331774d = str;
        this.f331775e = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj2;
        java.util.Map lowercaseHeaders = (java.util.Map) obj3;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        android.net.Uri url = request.getUrl();
        java.lang.String path = url != null ? url.getPath() : null;
        if (kotlin.jvm.internal.o.b(path, this.f331774d)) {
            return (com.tencent.xweb.y0) this.f331775e.C(path, lowercaseHeaders, webview, request);
        }
        return null;
    }
}
