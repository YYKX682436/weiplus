package hs1;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f284560e = {l75.n0.getCreateSQLs(hs1.a.f284559t, "BizAppMsgReportContext")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f284561f = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f284562d;

    public b(l75.k0 k0Var) {
        super(k0Var, hs1.a.f284559t, "BizAppMsgReportContext", f284561f);
        this.f284562d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean insert(hs1.a aVar) {
        aVar.field_appMsgReportContextId = aVar.field_reportTime;
        return super.insert(aVar);
    }

    public void z0(java.util.List list) {
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            delete((hs1.a) it.next(), new java.lang.String[0]);
        }
        gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
    }
}
