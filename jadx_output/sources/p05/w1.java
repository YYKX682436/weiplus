package p05;

/* loaded from: classes10.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.s1 f350722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f350723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p05.d2 d2Var, p05.s1 s1Var, p05.w0 w0Var) {
        super(0);
        this.f350721d = d2Var;
        this.f350722e = s1Var;
        this.f350723f = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("resetFaceEffectsTimer", 1);
        jSONObject.put("wv_render_params", jSONObject2);
        p05.d2 d2Var = this.f350721d;
        rh0.d0 d0Var = d2Var.f350488c;
        p05.s1 s1Var = this.f350722e;
        if (d0Var != null) {
            long j17 = s1Var.f350681a;
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            ((p05.l4) d0Var).G(j17, jSONObject3, 0);
        }
        s1Var.f350686f = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#newWayAppend reset same effect timer: same_ptr=");
        long j18 = s1Var.f350681a;
        sb6.append(j18);
        sb6.append(" command=");
        sb6.append(jSONObject);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", sb6.toString());
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        p05.w0 w0Var = this.f350723f;
        jSONObject5.put("startPosX", w0Var.f350719d[0]);
        jSONObject5.put("startPosY", w0Var.f350719d[1]);
        long j19 = w0Var.f350718c;
        if (j19 >= 0) {
            jSONObject5.put("giftCount", j19);
            int i17 = d2Var.f350493h;
            d2Var.f350493h = i17 + 1;
            jSONObject5.put("identifierNum", i17);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.Float[] fArr = w0Var.f350720e;
        jSONArray.put(fArr[0]);
        jSONArray.put(fArr[1]);
        jSONArray.put(fArr[2]);
        jSONArray.put(fArr[3]);
        jSONObject5.put("detectRegion", jSONArray);
        jSONObject4.put("wv_render_params", jSONObject5);
        rh0.d0 d0Var2 = d2Var.f350488c;
        if (d0Var2 != null) {
            java.lang.String jSONObject6 = jSONObject4.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            ((p05.l4) d0Var2).G(j18, jSONObject6, 0);
        }
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#newWayAppend gl_ptr=" + j18 + " command=" + jSONObject4);
        return jz5.f0.f302826a;
    }
}
