package s83;

/* loaded from: classes8.dex */
public class m extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f404886e = {l75.n0.getCreateSQLs(s83.l.f404885x, "IPCallRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f404887f = {"*", "rowid"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f404888d;

    public m(l75.k0 k0Var) {
        super(k0Var, s83.l.f404885x, "IPCallRecord", null);
        this.f404888d = k0Var;
    }

    public android.database.Cursor y0(long j17) {
        return this.f404888d.E("IPCallRecord", f404887f, "addressId=?", new java.lang.String[]{j17 + ""}, null, null, "calltime desc");
    }

    public void z0(s83.l lVar) {
        if (lVar != null) {
            update(lVar.systemRowid, lVar);
        }
    }
}
