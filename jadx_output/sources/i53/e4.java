package i53;

/* loaded from: classes8.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI f288569f;

    public e4(com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI gameVideoEditorProxyUI, java.lang.String str, java.lang.String str2) {
        this.f288569f = gameVideoEditorProxyUI;
        this.f288567d = str;
        this.f288568e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI.f140083w;
        com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI gameVideoEditorProxyUI = this.f288569f;
        java.lang.String O6 = gameVideoEditorProxyUI.O6(this.f288567d, this.f288568e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", O6);
        j45.l.n(gameVideoEditorProxyUI.f140084e, "webview", ".ui.tools.WebViewUI", intent, 131);
    }
}
