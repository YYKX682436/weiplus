package sx4;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sx4.n f413618g;

    public j(sx4.n nVar, java.lang.String str, int i17, int i18) {
        this.f413618g = nVar;
        this.f413615d = str;
        this.f413616e = i17;
        this.f413617f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413618g.f413632e.f413638b;
        java.lang.String str = this.f413615d;
        int i17 = this.f413616e;
        int i18 = this.f413617f;
        gameWebViewUI.getClass();
        gameWebViewUI.a9(null, str, i17, i18, new java.util.HashMap());
    }
}
