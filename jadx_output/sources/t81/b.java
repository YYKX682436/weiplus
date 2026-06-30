package t81;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f416353e = {l75.n0.getCreateSQLs(t81.a.f416352z, "PredownloadBlockCgiRequest")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f416354d;

    public b(l75.k0 k0Var) {
        super(k0Var, t81.a.f416352z, "PredownloadBlockCgiRequest", dm.m9.f238530o);
        this.f416354d = k0Var;
    }

    public final android.util.Pair y0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        long i19 = com.tencent.mm.sdk.platformtools.t8.i1();
        android.database.Cursor B = this.f416354d.B("select reportId from PredownloadBlockCgiRequest where " + str + "=? and startTime<" + i19 + " and " + i19 + "<endTime and cgiList like '%;" + i17 + ";%' and sceneList like '%;" + i18 + ";%'", new java.lang.String[]{str2});
        if (B == null || B.isClosed()) {
            return android.util.Pair.create(java.lang.Boolean.FALSE, -1);
        }
        boolean moveToFirst = B.moveToFirst();
        int i27 = moveToFirst ? B.getInt(0) : -1;
        B.close();
        return android.util.Pair.create(java.lang.Boolean.valueOf(moveToFirst), java.lang.Integer.valueOf(i27));
    }
}
