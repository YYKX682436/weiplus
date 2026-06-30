package ep3;

/* loaded from: classes.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f255728e = {l75.n0.getCreateSQLs(ep3.a.f255727r, "OrderCommonMsgXml")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f255729d;

    public b(l75.k0 k0Var) {
        super(k0Var, ep3.a.f255727r, "OrderCommonMsgXml", null);
        this.f255729d = k0Var;
    }

    @Override // l75.n0
    public android.database.Cursor getAll() {
        return this.f255729d.B("select * from OrderCommonMsgXml order by msgId desc", null);
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        return super.insert((ep3.a) f0Var);
    }

    @Override // l75.n0, l75.g0
    public boolean update(l75.f0 f0Var, java.lang.String[] strArr) {
        return super.update((ep3.a) f0Var, strArr);
    }
}
