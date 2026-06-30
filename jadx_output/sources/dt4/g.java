package dt4;

/* loaded from: classes8.dex */
public class g extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f243240e = {l75.n0.getCreateSQLs(at4.j1.f13877x, "WalletKindInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243241d;

    public g(l75.k0 k0Var) {
        super(k0Var, at4.j1.f13877x, "WalletKindInfo", null);
        this.f243241d = k0Var;
    }

    public java.util.ArrayList y0() {
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f243241d.f("select * from WalletKindInfo", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                at4.j1 j1Var = new at4.j1();
                j1Var.convertFrom(f17);
                arrayList2.add(j1Var);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }
}
