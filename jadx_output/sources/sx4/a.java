package sx4;

/* loaded from: classes8.dex */
public class a extends sx4.v {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI f413577g;

    public a(com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI gameBaseWebViewUI) {
        this.f413577g = gameBaseWebViewUI;
    }

    @Override // sx4.v
    public void b(android.os.Bundle bundle) {
        try {
            com.tencent.mm.plugin.webview.stub.v0 v0Var = this.f413577g.K1;
            if (v0Var == null || bundle == null) {
                return;
            }
            v0Var.i(96, bundle);
        } catch (android.os.RemoteException unused) {
        }
    }
}
