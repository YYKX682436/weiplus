package o36;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final l36.a f342778a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.e f342779b;

    /* renamed from: c, reason: collision with root package name */
    public final l36.f0 f342780c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f342781d;

    /* renamed from: e, reason: collision with root package name */
    public int f342782e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f342783f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f342784g = new java.util.ArrayList();

    public h(l36.a aVar, o36.e eVar, l36.n nVar, l36.f0 f0Var) {
        this.f342781d = java.util.Collections.emptyList();
        this.f342778a = aVar;
        this.f342779b = eVar;
        this.f342780c = f0Var;
        l36.k0 k0Var = aVar.f315444a;
        java.net.Proxy proxy = aVar.f315451h;
        if (proxy != null) {
            this.f342781d = java.util.Collections.singletonList(proxy);
        } else {
            java.util.List<java.net.Proxy> select = aVar.f315450g.select(k0Var.o());
            this.f342781d = (select == null || select.isEmpty()) ? m36.e.m(java.net.Proxy.NO_PROXY) : m36.e.l(select);
        }
        this.f342782e = 0;
    }

    public void a(l36.d1 d1Var, java.io.IOException iOException) {
        l36.a aVar;
        java.net.ProxySelector proxySelector;
        if (d1Var.f315476b.type() != java.net.Proxy.Type.DIRECT && (proxySelector = (aVar = this.f342778a).f315450g) != null) {
            proxySelector.connectFailed(aVar.f315444a.o(), d1Var.f315476b.address(), iOException);
        }
        o36.e eVar = this.f342779b;
        synchronized (eVar) {
            eVar.f342773a.add(d1Var);
        }
    }
}
