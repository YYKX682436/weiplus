package sx4;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.plugin.webview.ui.tools.widget.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.q f413634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(sx4.q qVar, com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi mMWebViewWithJsApi) {
        super(mMWebViewWithJsApi);
        this.f413634e = qVar;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        kh0.h hVar = this.f413634e.f413644h;
        if (hVar == null) {
            return false;
        }
        ((vz4.x) hVar).f(consoleMessage);
        return false;
    }
}
