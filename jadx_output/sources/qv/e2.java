package qv;

/* loaded from: classes5.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk.f f366850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(sk.f fVar) {
        super(0);
        this.f366850d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        android.content.Context context = ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd) this.f366850d).f186690a.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        com.tencent.mm.plugin.webview.ui.tools.u4 u4Var = (webViewUI == null || (e3Var = webViewUI.L1) == null) ? null : e3Var.Z0;
        if (u4Var != null) {
            u4Var.f186925a = null;
        }
        return jz5.f0.f302826a;
    }
}
