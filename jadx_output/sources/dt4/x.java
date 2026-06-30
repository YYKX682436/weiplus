package dt4;

/* loaded from: classes9.dex */
public class x extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f243303e = {l75.n0.getCreateSQLs(at4.m1.D, "WalletPrefInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243304d;

    public x(l75.k0 k0Var) {
        super(k0Var, at4.m1.D, "WalletPrefInfo", null);
        this.f243304d = k0Var;
    }

    public boolean y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return this.f243304d.A("WalletPrefInfo", "delete from WalletPrefInfo where pref_key='" + str + "'");
    }

    public at4.m1 z0(java.lang.String str) {
        at4.m1 m1Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.database.Cursor f17 = this.f243304d.f("select * from WalletPrefInfo where pref_key=?", new java.lang.String[]{str}, 2);
            if (f17 == null) {
                return null;
            }
            if (f17.moveToFirst()) {
                m1Var = new at4.m1();
                m1Var.convertFrom(f17);
            }
            f17.close();
        }
        return m1Var;
    }
}
