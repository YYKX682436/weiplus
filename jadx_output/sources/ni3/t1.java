package ni3;

/* loaded from: classes12.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f337739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f337741g;

    public t1(ni3.g2 g2Var, long j17, com.tencent.mm.storage.u3 u3Var, long j18) {
        this.f337741g = g2Var;
        this.f337738d = j17;
        this.f337739e = u3Var;
        this.f337740f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            long j17 = this.f337738d;
            z65.c.f470460f = j17;
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_FLAG_LONG, java.lang.Long.valueOf(j17));
            long j18 = this.f337740f;
            com.tencent.mm.storage.u3 u3Var = this.f337739e;
            if (u3Var != null) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser heavyUser[%d, %d], fkey[%s], value[%d]", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f337741g.f337599x), u3Var, java.lang.Long.valueOf(j18));
        }
    }
}
