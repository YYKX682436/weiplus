package dt4;

/* loaded from: classes9.dex */
public class w extends l75.n0 implements qg0.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f243300e = {l75.n0.getCreateSQLs(at4.k1.f13887J, "WalletLuckyMoney")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f243301f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243302d;

    public w(l75.k0 k0Var) {
        super(k0Var, at4.k1.f13887J, "WalletLuckyMoney", null);
        this.f243302d = k0Var;
    }

    public at4.k1 D0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Map map = f243301f;
        if (((java.util.HashMap) map).containsKey(str)) {
            return (at4.k1) ((java.util.HashMap) map).get(str);
        }
        at4.k1 z07 = z0(str);
        if (z07 == null) {
            return null;
        }
        ((java.util.HashMap) map).put(str, z07);
        return z07;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean replace(at4.k1 k1Var) {
        if (k1Var != null) {
            java.util.Map map = f243301f;
            if (((java.util.HashMap) map).containsKey(k1Var.field_mNativeUrl)) {
                ((java.util.HashMap) map).put(k1Var.field_mNativeUrl, k1Var);
            }
        }
        return super.replace(k1Var);
    }

    public at4.k1 y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            android.database.Cursor D = this.f243302d.D("WalletLuckyMoney", new java.lang.String[]{"*"}, "sendId=?", new java.lang.String[]{str}, null, null, null, 2);
            try {
                if (!D.moveToFirst()) {
                    D.close();
                    D.close();
                    return null;
                }
                at4.k1 k1Var = new at4.k1();
                k1Var.convertFrom(D);
                D.close();
                D.close();
                return k1Var;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLuckyMoneyStg", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public at4.k1 z0(java.lang.String str) {
        android.database.Cursor B = this.f243302d.B("select * from WalletLuckyMoney where mNativeUrl=?", new java.lang.String[]{str});
        if (B == null) {
            return null;
        }
        if (B.getCount() == 0) {
            B.close();
            return null;
        }
        B.moveToFirst();
        at4.k1 k1Var = new at4.k1();
        k1Var.convertFrom(B);
        B.close();
        return k1Var;
    }
}
