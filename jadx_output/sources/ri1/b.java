package ri1;

/* loaded from: classes4.dex */
public class b extends dm.sc implements qj1.d {
    public static final l75.e0 A = dm.sc.initAutoDBInfo(ri1.b.class);
    public static final java.lang.String[] B;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f396023z;

    static {
        java.lang.String[] strArr = {"appId", "commLibVersionId", "appVersionId", "pageURL"};
        f396023z = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = A;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
        B = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, "WxaAppWebRenderingCacheAccessStatsTable")};
    }

    @Override // dm.sc, l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f396023z;
    }
}
