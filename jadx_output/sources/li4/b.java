package li4;

/* loaded from: classes11.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f318786e = {l75.n0.getCreateSQLs(hi4.e.P, "TextStatusGreetingItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f318787f = "markUnread";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f318788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, hi4.e.P, "TextStatusGreetingItem", null);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hi4.e.P;
        this.f318788d = db6;
    }

    public static int y0(li4.b bVar, int i17, int i18, java.lang.Object obj) {
        android.database.Cursor B = bVar.f318788d.B("select count(rowid) from TextStatusGreetingItem where Read != 1 ", null);
        if (B != null) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        return r1;
    }

    public final java.util.List Ca(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusGreetingItemStorage", "query() called with: offset = " + i17 + ", nextCount = " + i18);
        p75.i0 i19 = rj4.d.f396269t.i();
        i19.f352659f = kz5.b0.c(rj4.d.f396270u.u());
        i19.c(i18, i17);
        return i19.a().k(this.f318788d, hi4.e.class);
    }

    public final hi4.e z0() {
        p75.n0 TABLE = rj4.d.f396269t;
        kotlin.jvm.internal.o.f(TABLE, "TABLE");
        p75.i0 i17 = TABLE.i();
        i17.f352659f = kz5.b0.c(rj4.d.f396270u.u());
        i17.c(1, 0);
        return (hi4.e) i17.a().o(this.f318788d, hi4.e.class);
    }
}
