package mw4;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw4.n f331773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mw4.n nVar) {
        super(3);
        this.f331773d = nVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj2;
        java.util.Map lowercaseHeaders = (java.util.Map) obj3;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        java.util.Iterator it = ((java.util.ArrayList) this.f331773d.f331781a).iterator();
        com.tencent.xweb.y0 y0Var = null;
        while (it.hasNext() && (y0Var = (com.tencent.xweb.y0) ((yz5.q) it.next()).invoke(webview, request, lowercaseHeaders)) == null) {
        }
        return y0Var;
    }
}
