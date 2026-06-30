package qx4;

/* loaded from: classes8.dex */
public final class x0 extends com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView {
    public x0(com.tencent.xweb.f1 f1Var, android.content.MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper, f1Var);
    }

    @Override // com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView
    public java.lang.String getUserAgentString() {
        java.lang.String a17 = ik1.l0.a(getContext(), getSettings().g(), (ik1.k0) nd.f.a(ik1.k0.class));
        kotlin.jvm.internal.o.f(a17, "appendUserAgent(...)");
        return a17;
    }
}
