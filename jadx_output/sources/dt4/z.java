package dt4;

/* loaded from: classes9.dex */
public class z extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f243307f = {l75.n0.getCreateSQLs(at4.v1.S1, "WalletUserInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f243308d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f243309e;

    public z(l75.k0 k0Var) {
        super(k0Var, at4.v1.S1, "WalletUserInfo", null);
        this.f243309e = new java.util.LinkedList();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoStorage", "already call constructor.");
        this.f243308d = k0Var;
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.delete((at4.v1) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f243309e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    public boolean update(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.update((at4.v1) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f243309e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    public at4.v1 y0() {
        at4.v1 v1Var = new at4.v1();
        android.database.Cursor f17 = this.f243308d.f("select * from WalletUserInfo", null, 2);
        v1Var.field_is_reg = -1;
        if (f17 == null) {
            return v1Var;
        }
        if (f17.moveToNext()) {
            v1Var.convertFrom(f17);
        }
        f17.close();
        return v1Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(at4.v1 v1Var) {
        if (!super.insert(v1Var)) {
            return false;
        }
        java.util.Iterator it = this.f243309e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }
}
