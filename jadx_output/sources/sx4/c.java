package sx4;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI f413579a;

    public c(com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI gameChattingRoomWebViewUI) {
        this.f413579a = gameChattingRoomWebViewUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI gameChattingRoomWebViewUI = this.f413579a;
        gameChattingRoomWebViewUI.setResult(gameChattingRoomWebViewUI.B3, new android.content.Intent());
        gameChattingRoomWebViewUI.finish();
    }
}
