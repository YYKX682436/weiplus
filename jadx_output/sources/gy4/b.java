package gy4;

/* loaded from: classes8.dex */
public final class b extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gy4.c f277587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277588b;

    public b(gy4.c cVar, java.lang.String str) {
        this.f277587a = cVar;
        this.f277588b = str;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f277587a.f277589d.set(false);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        gy4.c cVar = this.f277587a;
        if (cVar.f277589d.get()) {
            cVar.T6().setMMTitle(this.f277588b);
        }
    }
}
