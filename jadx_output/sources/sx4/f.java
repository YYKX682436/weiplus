package sx4;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI f413604b;

    public f(com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI gameChattingRoomWebViewUI) {
        this.f413604b = gameChattingRoomWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 r(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return new com.tencent.mm.plugin.webview.core.h3(false, false);
        }
        if (!str.toLowerCase().startsWith("weixin://jump/") && !str.toLowerCase().startsWith("weixin://scanqrcode/")) {
            return new com.tencent.mm.plugin.webview.core.h3(false, false);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new sx4.e(this, str));
        return new com.tencent.mm.plugin.webview.core.h3(true, true);
    }
}
