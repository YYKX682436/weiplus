package q93;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.plugin.webview.core.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.n f360907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q93.d f360908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f360909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q93.d f360910d;

    public b(q93.d dVar, nw4.n nVar, q93.d dVar2, int i17) {
        this.f360910d = dVar;
        this.f360907a = nVar;
        this.f360908b = dVar2;
        this.f360909c = i17;
    }

    @Override // com.tencent.mm.plugin.webview.core.y0
    public void a(com.tencent.mm.plugin.webview.core.x0 x0Var) {
        com.tencent.mm.plugin.webview.core.k3 k3Var = (com.tencent.mm.plugin.webview.core.k3) x0Var;
        com.tencent.mm.plugin.webview.stub.v0 v0Var = k3Var.f181864d.f181880g;
        kotlin.jvm.internal.o.d(v0Var);
        nw4.n nVar = this.f360907a;
        nVar.f340899m = v0Var;
        try {
            com.tencent.mm.plugin.webview.stub.v0 v0Var2 = k3Var.f181864d.f181880g;
            kotlin.jvm.internal.o.d(v0Var2);
            v0Var2.rg(new q93.c(this.f360910d, nVar, this.f360908b), this.f360909c);
        } catch (java.lang.Exception unused) {
        }
        nVar.A0(true);
    }

    @Override // com.tencent.mm.plugin.webview.core.y0
    public boolean b() {
        return false;
    }
}
