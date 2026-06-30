package mw4;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f331771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f331772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.r rVar, yz5.q qVar) {
        super(3);
        this.f331771d = rVar;
        this.f331772e = qVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj2;
        java.util.Map lowercaseHeaders = (java.util.Map) obj3;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        return (com.tencent.xweb.y0) this.f331771d.C(this.f331772e, webview, request, lowercaseHeaders);
    }
}
