package zz3;

/* loaded from: classes5.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f477705e = {l75.n0.getCreateSQLs(fz3.a.f267292x, "ScanHistoryItem")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f477706d;

    public a(l75.k0 k0Var) {
        super(k0Var, fz3.a.f267292x, "ScanHistoryItem", null);
        this.f477706d = k0Var;
    }

    @Override // l75.n0
    public android.database.Cursor getAll() {
        return this.f477706d.B("select * from ScanHistoryItem order by ScanTime desc", null);
    }
}
