package s83;

/* loaded from: classes4.dex */
public class k extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f404883e = {l75.n0.getCreateSQLs(s83.i.f404881r, "IPCallPopularCountry")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f404884d;

    public k(l75.k0 k0Var) {
        super(k0Var, s83.i.f404881r, "IPCallPopularCountry", null);
        new s83.j(this);
        this.f404884d = k0Var;
    }

    @Override // l75.n0
    public java.lang.String getTableName() {
        return "IPCallPopularCountry";
    }

    public void y0(int i17, long j17) {
        boolean replace;
        s83.i iVar = new s83.i();
        android.database.Cursor D = this.f404884d.D("IPCallPopularCountry", null, "countryCode=?", new java.lang.String[]{java.lang.Integer.toString(i17)}, null, null, null, 2);
        if (D.moveToFirst()) {
            iVar.convertFrom(D);
            iVar.field_callTimeCount++;
            iVar.field_lastCallTime = j17;
            replace = super.replace(iVar);
            D.close();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:" + i17);
            D.close();
            iVar.field_countryCode = i17;
            iVar.field_lastCallTime = j17;
            iVar.field_callTimeCount = 1L;
            replace = insert(iVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:" + replace);
    }
}
