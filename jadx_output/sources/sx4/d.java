package sx4;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI f413580a;

    public d(com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI gameChattingRoomWebViewUI) {
        this.f413580a = gameChattingRoomWebViewUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI gameChattingRoomWebViewUI = this.f413580a;
        intent.putExtra("rawUrl", gameChattingRoomWebViewUI.A3);
        gameChattingRoomWebViewUI.setResult(gameChattingRoomWebViewUI.C3, intent);
        gameChattingRoomWebViewUI.finish();
    }
}
