package z85;

/* loaded from: classes4.dex */
public final class z extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f470830f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470831d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f470832e;

    static {
        java.lang.String createSQLs = l75.n0.getCreateSQLs(z85.y.f470829p, "GetEmotionStoreRecListCache");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f470830f = new java.lang.String[]{createSQLs};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l75.k0 k0Var) {
        super(k0Var, z85.y.f470829p, "GetEmotionStoreRecListCache", null);
        l75.e0 e0Var = z85.y.f470829p;
        this.f470831d = k0Var;
        this.f470832e = "MicroMsg.GetEmotionStoreRecListCacheStorage";
    }

    public final boolean y0(int i17, r45.oo3 oo3Var) {
        if (oo3Var == null) {
            return false;
        }
        try {
            l75.k0 k0Var = this.f470831d;
            java.lang.Integer valueOf = k0Var != null ? java.lang.Integer.valueOf(k0Var.delete("GetEmotionStoreRecListCache", "reqType=?", new java.lang.String[]{java.lang.String.valueOf(i17)})) : null;
            if (valueOf != null) {
                valueOf.intValue();
            }
            java.lang.String reqType = i17 + "";
            byte[] byteArray = oo3Var.toByteArray();
            kotlin.jvm.internal.o.g(reqType, "reqType");
            z85.y yVar = new z85.y();
            yVar.field_reqType = reqType;
            yVar.field_cache = byteArray;
            return insert(yVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e(this.f470832e, "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }
}
