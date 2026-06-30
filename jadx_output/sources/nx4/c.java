package nx4;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI f341363d;

    public c(com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI) {
        this.f341363d = baseEmojiStoreSearchWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI = this.f341363d;
        baseEmojiStoreSearchWebViewUI.A3.a();
        baseEmojiStoreSearchWebViewUI.hideVKB();
    }
}
