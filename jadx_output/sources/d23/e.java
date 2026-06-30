package d23;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d23.g f225892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d23.g gVar) {
        super(0);
        this.f225892d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        av4.j jVar = this.f225892d.f14326a;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView = jVar != null ? jVar.getWebView() : null;
        if (webView != null) {
            webView.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
