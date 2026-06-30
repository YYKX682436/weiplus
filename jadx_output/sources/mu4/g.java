package mu4;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.plugin.webview.core.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.n f331408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f331409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mu4.h f331410c;

    public g(nw4.n nVar, int i17, mu4.h hVar) {
        this.f331408a = nVar;
        this.f331409b = i17;
        this.f331410c = hVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.y0
    public void a(com.tencent.mm.plugin.webview.core.x0 conn) {
        nw4.n nVar = this.f331408a;
        kotlin.jvm.internal.o.g(conn, "conn");
        try {
            com.tencent.mm.plugin.webview.core.k3 k3Var = (com.tencent.mm.plugin.webview.core.k3) conn;
            com.tencent.mm.plugin.webview.stub.v0 v0Var = k3Var.f181864d.f181880g;
            kotlin.jvm.internal.o.d(v0Var);
            nVar.f340899m = v0Var;
            com.tencent.mm.plugin.webview.stub.v0 v0Var2 = k3Var.f181864d.f181880g;
            kotlin.jvm.internal.o.d(v0Var2);
            v0Var2.rg(new mu4.f(nVar), this.f331409b);
            nVar.A0(true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f331410c.f331419e, "onConnected ex " + th6.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.y0
    public boolean b() {
        return false;
    }
}
