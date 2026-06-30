package zx4;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f477213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f477214g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(zx4.l0 l0Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, boolean z17, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(0);
        this.f477211d = l0Var;
        this.f477212e = webViewUI;
        this.f477213f = z17;
        this.f477214g = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "captureResult failed: save failed");
        zx4.l0.c(this.f477211d, this.f477212e, this.f477213f, this.f477214g);
        return jz5.f0.f302826a;
    }
}
