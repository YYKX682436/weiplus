package p05;

/* loaded from: classes10.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f350702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f350703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(p05.d2 d2Var, long j17, p05.w0 w0Var) {
        super(0);
        this.f350701d = d2Var;
        this.f350702e = j17;
        this.f350703f = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        p05.w0 w0Var = this.f350703f;
        jSONObject2.put("startPosX", w0Var.f350719d[0]);
        jSONObject2.put("startPosY", w0Var.f350719d[1]);
        long j17 = w0Var.f350718c;
        p05.d2 d2Var = this.f350701d;
        if (j17 >= 0) {
            jSONObject2.put("giftCount", j17);
            int i17 = d2Var.f350493h;
            d2Var.f350493h = i17 + 1;
            jSONObject2.put("identifierNum", i17);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.Float[] fArr = w0Var.f350720e;
        jSONArray.put(fArr[0]);
        jSONArray.put(fArr[1]);
        jSONArray.put(fArr[2]);
        jSONArray.put(fArr[3]);
        jSONObject2.put("detectRegion", jSONArray);
        jSONObject.put("wv_render_params", jSONObject2);
        rh0.d0 d0Var = d2Var.f350488c;
        long j18 = this.f350702e;
        if (d0Var != null) {
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ((p05.l4) d0Var).G(j18, jSONObject3, 0);
        }
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#newWayAppend gl_ptr=" + j18 + " command=" + jSONObject);
        p05.d2.c(d2Var, new p05.s1(this.f350702e, w0Var.f350716a, w0Var.f350717b, 111, false, 0L, 32, null));
        return jz5.f0.f302826a;
    }
}
