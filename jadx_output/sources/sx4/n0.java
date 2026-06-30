package sx4;

/* loaded from: classes8.dex */
public class n0 extends com.tencent.mm.plugin.webview.ui.tools.tc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI) {
        super(gameWebViewUI);
        this.f413633d = gameWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.tc, com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        kh0.h hVar = this.f413633d.C3;
        if (hVar != null) {
            ((vz4.x) hVar).f(consoleMessage);
        }
        super.b(consoleMessage);
        return false;
    }
}
