package dt4;

/* loaded from: classes8.dex */
public class y extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f243305e = {l75.n0.getCreateSQLs(at4.s1.f13952y, "WalletRegionGreyAreaList")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243306d;

    public y(l75.k0 k0Var) {
        super(k0Var, at4.s1.f13952y, "WalletRegionGreyAreaList", null);
        this.f243306d = k0Var;
    }

    public at4.s1 y0(int i17) {
        java.lang.String str = "select * from WalletRegionGreyAreaList where wallet_region = " + i17;
        android.database.Cursor f17 = this.f243306d.f(str, null, 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem " + str);
        if (f17 == null) {
            return new at4.s1();
        }
        at4.s1 s1Var = new at4.s1();
        if (f17.moveToNext()) {
            s1Var = new at4.s1();
            s1Var.convertFrom(f17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
        f17.close();
        return s1Var;
    }

    public void z0(int i17, r45.k65 k65Var) {
        at4.s1 s1Var = new at4.s1();
        s1Var.field_wallet_region = i17;
        try {
            s1Var.field_wallet_grey_item_buf = k65Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + e17.getMessage());
        }
        super.replace(s1Var);
    }
}
