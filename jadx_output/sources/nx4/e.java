package nx4;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI f341365a;

    public e(com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI, nx4.a aVar) {
        this.f341365a = baseEmojiStoreSearchWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "onPageFinished url:%s", str);
        com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI = this.f341365a;
        baseEmojiStoreSearchWebViewUI.showOptionMenu(false);
        baseEmojiStoreSearchWebViewUI.A3.r(baseEmojiStoreSearchWebViewUI.B3);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f341365a.showOptionMenu(false);
    }
}
