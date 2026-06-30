package zs2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public r45.mt2 f475246a;

    /* renamed from: b, reason: collision with root package name */
    public int f475247b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f475248c;

    /* renamed from: d, reason: collision with root package name */
    public jz5.l f475249d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475250e;

    /* renamed from: f, reason: collision with root package name */
    public int f475251f;

    public c() {
        r45.mt2 mt2Var = new r45.mt2();
        this.f475246a = mt2Var;
        this.f475247b = mt2Var.getInteger(4);
        this.f475248c = new java.util.ArrayList();
        this.f475250e = "";
    }

    public final km2.m a() {
        int size = this.f475248c.size();
        int i17 = this.f475247b;
        boolean z17 = false;
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (z17) {
            return (km2.m) this.f475248c.get(i17);
        }
        return null;
    }

    public final void b(int i17) {
        gk2.e eVar;
        com.tencent.mars.xlog.Log.i("FinderReplayLiveData", "set curPos:" + i17);
        km2.m a17 = a();
        ct2.j jVar = (a17 == null || (eVar = a17.f309130e) == null) ? null : (ct2.j) eVar.a(ct2.j.class);
        if (jVar != null) {
            jVar.A = i17;
        }
        this.f475247b = i17;
    }

    public final void c(jz5.l lVar) {
        com.tencent.mm.sdk.platformtools.Log.c("FinderReplayLiveData", "fromFloatInfo:" + this.f475249d + " -> " + lVar, new java.lang.Object[0]);
        this.f475249d = lVar;
    }
}
