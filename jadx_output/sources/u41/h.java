package u41;

/* loaded from: classes4.dex */
public class h extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f424630e = {l75.n0.getCreateSQLs(u41.g.f424629p, "OpenIMFinderInfoNew")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f424631d;

    public h(l75.k0 k0Var) {
        super(k0Var, u41.g.f424629p, "OpenIMFinderInfoNew", null);
        this.f424631d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean replace(u41.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenIMFinderInfoStg", "replace " + gVar.field_openIMUsername + "," + gVar.field_finder_username);
        return super.replace(gVar);
    }
}
