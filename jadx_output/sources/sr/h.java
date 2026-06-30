package sr;

/* loaded from: classes5.dex */
public class h implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.view.EmojiPanelInputComponent f411394a;

    public h(com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent) {
        this.f411394a = emojiPanelInputComponent;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        try {
            this.f411394a.f64939h.n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiPanelInputComponent", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection = this.f411394a.f64939h.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
            inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
