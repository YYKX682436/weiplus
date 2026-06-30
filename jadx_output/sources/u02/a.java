package u02;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u02.b f423454d;

    public a(u02.b bVar) {
        this.f423454d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f423454d.getClass();
        long c17 = c01.id.c() - 2592000000L;
        p75.n0 n0Var = dm.n2.f238621n;
        n0Var.getClass();
        p75.m0 x17 = dm.n2.f238625r.x(java.lang.Long.valueOf(c17));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        w02.a aVar = w02.b.f441874m;
        l75.k0 Q4 = aVar.a().Q4();
        com.tencent.mars.xlog.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "delete result: " + (Q4 != null ? Q4.delete(table, b17, e17) : -1));
        l75.k0 Q42 = aVar.a().Q4();
        com.tencent.mars.xlog.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "vacuum old check dup msg, res:" + (Q42 != null ? java.lang.Boolean.valueOf(Q42.u()) : null));
    }
}
