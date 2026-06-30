package t00;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f414291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t00.k0 f414294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i17, boolean z17, int i18, c00.n3 n3Var, t00.k0 k0Var) {
        super(1);
        this.f414290d = i17;
        this.f414291e = z17;
        this.f414292f = i18;
        this.f414293g = n3Var;
        this.f414294h = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        c00.n3 n3Var = this.f414293g;
        if (intValue == 0) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest(this.f414290d, this.f414291e, this.f414292f), t00.c0.class, new t00.i0(n3Var));
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("permissionErrType", intValue);
            n3Var.d(jSONObject);
        }
        this.f414294h.f414305a = null;
        return jz5.f0.f302826a;
    }
}
