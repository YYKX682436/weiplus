package u41;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f424621e = {l75.n0.getCreateSQLs(u41.a.f424620t, "OpenIMAccTypeInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f424622d;

    public b(l75.k0 k0Var) {
        super(k0Var, u41.a.f424620t, "OpenIMAccTypeInfo", null);
        this.f424622d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean replace(u41.a aVar) {
        aVar.field_updateTime = com.tencent.mm.sdk.platformtools.t8.i1();
        return super.replace(aVar);
    }
}
