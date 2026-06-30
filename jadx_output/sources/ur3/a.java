package ur3;

/* loaded from: classes4.dex */
public class a extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f430432d = {l75.n0.getCreateSQLs(sr3.j.U, "ProfileInfo")};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f430433e = new java.lang.String[0];

    public a(l75.k0 k0Var) {
        super(k0Var, sr3.j.U, "ProfileInfo", f430433e);
    }

    public sr3.j y0(java.lang.String str) {
        sr3.j jVar = new sr3.j();
        jVar.field_username = str;
        if (get(jVar, dm.i4.COL_USERNAME)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileInfoStorage", "get username:%s", jVar.field_username);
            return jVar;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ProfileInfoStorage", "profileInfo is null");
        return null;
    }
}
