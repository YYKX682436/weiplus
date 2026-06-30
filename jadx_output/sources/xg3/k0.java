package xg3;

/* loaded from: classes12.dex */
public class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f454404e = com.tencent.mm.sdk.platformtools.o4.M("db_max_id_record");

    /* renamed from: a, reason: collision with root package name */
    public long f454405a;

    /* renamed from: b, reason: collision with root package name */
    public final xg3.j0[] f454406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f454407c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f454408d;

    public k0(int i17, java.lang.String str, xg3.j0[] j0VarArr) {
        iz5.a.g(null, str != null && str.length() > 0);
        this.f454408d = str;
        iz5.a.g(null, j0VarArr.length == 3);
        xg3.j0 j0Var = j0VarArr[0];
        iz5.a.g(null, j0Var.f454403b >= j0Var.f454402a);
        xg3.j0 j0Var2 = j0VarArr[1];
        iz5.a.g(null, j0Var2.f454403b >= j0Var2.f454402a);
        iz5.a.g(null, j0VarArr[1].f454402a >= j0VarArr[0].f454403b);
        xg3.j0 j0Var3 = j0VarArr[2];
        long j17 = j0Var3.f454403b;
        if (j17 != -1 || j0Var3.f454402a != -1) {
            iz5.a.g(null, j17 >= j0Var3.f454402a);
            iz5.a.g(null, j0VarArr[2].f454402a >= j0VarArr[1].f454403b);
        }
        this.f454406b = j0VarArr;
        this.f454407c = i17;
        this.f454405a = j0VarArr[0].f454402a;
    }

    public static xg3.j0[] a(long j17, long j18, long j19, long j27, long j28, long j29) {
        xg3.j0 j0Var = new xg3.j0(null);
        j0Var.f454402a = j17;
        j0Var.f454403b = j18;
        xg3.j0 j0Var2 = new xg3.j0(null);
        j0Var2.f454402a = j19;
        j0Var2.f454403b = j27;
        xg3.j0 j0Var3 = new xg3.j0(null);
        j0Var3.f454402a = j28;
        j0Var3.f454403b = j29;
        return new xg3.j0[]{j0Var, j0Var2, j0Var3};
    }

    public synchronized void b(com.tencent.mm.storage.f9 f9Var) {
        long j17 = this.f454405a;
        xg3.j0[] j0VarArr = this.f454406b;
        if (j17 == j0VarArr[0].f454403b) {
            this.f454405a = j0VarArr[1].f454402a;
            jx3.f.INSTANCE.idkeyStat(111L, 251L, 1L, false);
        } else if (j17 == j0VarArr[1].f454403b) {
            this.f454405a = j0VarArr[2].f454402a;
        } else {
            this.f454405a = j17 + 1;
        }
        if (!z65.c.f470458d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgTable", "incMsgLocalId %d  ", java.lang.Long.valueOf(this.f454405a));
        }
        f9Var.setMsgId(this.f454405a);
        f454404e.putLong("msg." + this.f454408d, this.f454405a);
    }

    public boolean c(long j17) {
        for (xg3.j0 j0Var : this.f454406b) {
            if (j17 >= j0Var.f454402a && j17 <= j0Var.f454403b) {
                return true;
            }
        }
        return false;
    }
}
