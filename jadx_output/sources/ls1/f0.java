package ls1;

/* loaded from: classes8.dex */
public final class f0 extends com.tencent.mm.ui.widget.MMWebView {
    public yz5.a G;
    public yz5.l H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final yz5.a getCurrentUrlProxy() {
        return this.G;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public java.lang.String getUrl() {
        yz5.l lVar;
        java.lang.String url = super.getUrl();
        if (this.G == null || (lVar = this.H) == null) {
            return url;
        }
        kotlin.jvm.internal.o.d(lVar);
        if (((java.lang.Boolean) lVar.invoke(url)).booleanValue()) {
            return url;
        }
        yz5.a aVar = this.G;
        kotlin.jvm.internal.o.d(aVar);
        return (java.lang.String) aVar.invoke();
    }

    public final yz5.l getValidUrlProxy() {
        return this.H;
    }

    public final void setCurrentUrlProxy(yz5.a aVar) {
        this.G = aVar;
    }

    public final void setValidUrlProxy(yz5.l lVar) {
        this.H = lVar;
    }
}
