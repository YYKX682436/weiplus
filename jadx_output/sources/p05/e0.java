package p05;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.i0 f350498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f350499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.n0 f350500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p05.m0 f350502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p05.i0 i0Var, long j17, p05.n0 n0Var, java.lang.String str, p05.m0 m0Var) {
        super(0);
        this.f350498d = i0Var;
        this.f350499e = j17;
        this.f350500f = n0Var;
        this.f350501g = str;
        this.f350502h = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        p05.m0 m0Var = this.f350502h;
        jSONObject2.put("stickerNum", m0Var.f350615a);
        jSONObject2.put("materialPath", m0Var.f350616b);
        jSONObject.put("wv_render_params", jSONObject2);
        com.tencent.mars.xlog.Log.i("FinderLive.FallingGiftEffect", "msgJsonObj = " + jSONObject);
        p05.i0 i0Var = this.f350498d;
        rh0.d0 d0Var = i0Var.f350542c;
        long j17 = this.f350499e;
        if (d0Var != null) {
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ((p05.l4) d0Var).G(j17, jSONObject3, 0);
        }
        if (j17 > 0) {
            i0Var.f350546g = this.f350500f;
            i0Var.f350545f.add(new p05.d0(j17, this.f350501g + "/Lua"));
        }
        return jz5.f0.f302826a;
    }
}
