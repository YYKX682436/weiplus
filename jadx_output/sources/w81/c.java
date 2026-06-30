package w81;

/* loaded from: classes4.dex */
public final class c extends dm.bd {

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f443809p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f443810q;

    static {
        l75.e0 initAutoDBInfo = dm.bd.initAutoDBInfo(w81.c.class);
        f443809p = initAutoDBInfo;
        java.lang.String createSQLs = l75.n0.getCreateSQLs(initAutoDBInfo, "WxaSecurityStorageInfo");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f443810q = new java.lang.String[]{createSQLs};
    }

    @Override // dm.bd, l75.f0
    public l75.e0 getDBInfo() {
        return f443809p;
    }
}
