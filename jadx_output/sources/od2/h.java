package od2;

/* loaded from: classes12.dex */
public class h extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f344614n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f344615o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ od2.k f344616p;

    public h(od2.k kVar, java.lang.String str) {
        this.f344616p = kVar;
        this.f344614n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertFinderFollowTask";
    }

    @Override // p13.c
    public boolean i() {
        od2.k kVar = this.f344616p;
        kVar.f344621f.h();
        od2.e eVar = kVar.f344621f;
        int[] iArr = o13.d.f342220f;
        java.lang.String username = this.f344614n;
        eVar.m0(iArr, username);
        c61.l7 l7Var = (c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class));
        l7Var.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        ya2.b2 y07 = l7Var.Jj().y0(username);
        if (y07 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String D0 = y07.D0();
            long hashCode = D0.hashCode();
            kVar.f344621f.u(589824, 1, hashCode, D0, currentTimeMillis, y07.w0());
            kVar.f344621f.u(589824, 2, hashCode, D0, currentTimeMillis, o13.n.i(y07.w0(), false));
            kVar.f344621f.u(589824, 3, hashCode, D0, currentTimeMillis, o13.n.i(y07.w0(), true));
            this.f344615o = y07.w0();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "inserted we app info id = %s", D0);
        }
        kVar.f344621f.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{name: %s id: %s}", this.f344615o, this.f344614n);
    }
}
