package r01;

/* loaded from: classes4.dex */
public final class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f368048e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f368049d;

    static {
        l75.e0 e0Var = c01.x.f37558p;
        f368048e = new java.lang.String[]{l75.n0.getCreateSQLs(c01.x.f37558p, "BizBlockFinderInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l75.k0 db6) {
        super(db6, c01.x.f37558p, "BizBlockFinderInfo", dm.w0.f240709g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = c01.x.f37558p;
        this.f368049d = db6;
    }

    public final boolean d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizBlockFinderInfoStorage", "[delete] username: " + str + " unblock");
        c01.x xVar = new c01.x();
        xVar.field_bizUsername = str;
        return super.delete(xVar, new java.lang.String[0]);
    }
}
