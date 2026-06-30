package lb3;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f317753a;

    /* renamed from: b, reason: collision with root package name */
    public r45.mr5 f317754b;

    /* renamed from: c, reason: collision with root package name */
    public r45.js5 f317755c;

    public pq5.g a(gm5.a aVar) {
        f();
        this.f317755c = b();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        this.f317753a = iVar;
        r45.mr5 mr5Var = this.f317754b;
        r45.js5 js5Var = this.f317755c;
        if (mr5Var == null || js5Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiBase called withoud req or resp req?[");
            sb6.append(mr5Var == null);
            sb6.append("] resp?[");
            sb6.append(js5Var == null);
            sb6.append("]");
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = c();
        lVar.f70666c = d();
        lVar.f70664a = mr5Var;
        lVar.f70665b = js5Var;
        iVar.p(lVar.a());
        pq5.g l17 = this.f317753a.l();
        l17.K(new lb3.a(this));
        return l17.h(aVar);
    }

    public abstract r45.js5 b();

    public abstract int c();

    public abstract java.lang.String d();

    public void e() {
    }

    public void f() {
    }
}
