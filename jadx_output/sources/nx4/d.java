package nx4;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI f341364d;

    public d(com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI baseEmojiStoreSearchWebViewUI) {
        this.f341364d = baseEmojiStoreSearchWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f341364d.f183844p0;
        if (nVar != null) {
            nVar.F(true);
        }
    }
}
