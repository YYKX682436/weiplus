package la3;

/* loaded from: classes8.dex */
public final class i extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f317536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f317538d;

    public i(zg0.q2 q2Var, android.content.Context context, zg0.q2 q2Var2) {
        this.f317536b = q2Var;
        this.f317537c = context;
        this.f317538d = q2Var2;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        zg0.q2 q2Var = this.f317536b;
        try {
            ((com.tencent.mm.plugin.webview.core.r0) q2Var).e0().rg(new la3.h(this.f317537c, this.f317538d), ((com.tencent.mm.plugin.webview.core.r0) q2Var).U());
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "bind web view callback failed");
        }
    }
}
