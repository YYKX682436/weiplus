package p05;

/* loaded from: classes10.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f350735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f350736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(p05.d2 d2Var, long j17, p05.w0 w0Var) {
        super(0);
        this.f350734d = d2Var;
        this.f350735e = j17;
        this.f350736f = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.w0 w0Var;
        java.lang.Object obj;
        int i17;
        p05.d2 d2Var = this.f350734d;
        java.util.Iterator it = d2Var.f350491f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w0Var = this.f350736f;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            p05.s1 s1Var = (p05.s1) obj;
            if (kotlin.jvm.internal.o.b(s1Var.f350682b, w0Var.f350716a) && !s1Var.f350685e) {
                break;
            }
        }
        p05.s1 s1Var2 = (p05.s1) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#oldWayAppend gl_ptr=");
        long j17 = this.f350735e;
        sb6.append(j17);
        sb6.append(" same_ptr=");
        sb6.append(s1Var2 != null ? java.lang.Long.valueOf(s1Var2.f350681a) : null);
        sb6.append(" same_stage=");
        sb6.append(s1Var2 != null ? java.lang.Integer.valueOf(s1Var2.f350684d) : null);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", sb6.toString());
        if (s1Var2 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("resetFaceEffectsTimer", 1);
            jSONObject.put("wv_render_params", jSONObject2);
            rh0.d0 d0Var = d2Var.f350488c;
            long j18 = s1Var2.f350681a;
            if (d0Var != null) {
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                ((p05.l4) d0Var).G(j18, jSONObject3, 0);
            }
            s1Var2.f350686f = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#oldWayAppend reset same effect timer: same_ptr=" + j18 + " command=" + jSONObject);
        }
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        jSONObject5.put("startPosX", w0Var.f350719d[0]);
        jSONObject5.put("startPosY", w0Var.f350719d[1]);
        long j19 = w0Var.f350718c;
        if (j19 >= 0) {
            jSONObject5.put("giftCount", j19);
            int i18 = d2Var.f350493h;
            d2Var.f350493h = i18 + 1;
            jSONObject5.put("identifierNum", i18);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.Float[] fArr = w0Var.f350720e;
        jSONArray.put(fArr[0]);
        jSONArray.put(fArr[1]);
        jSONArray.put(fArr[2]);
        jSONArray.put(fArr[3]);
        jSONObject5.put("detectRegion", jSONArray);
        if (s1Var2 != null) {
            i17 = 0;
            jSONObject5.put("enableFaceEffect", 0);
        } else {
            i17 = 0;
        }
        jSONObject4.put("wv_render_params", jSONObject5);
        rh0.d0 d0Var2 = d2Var.f350488c;
        if (d0Var2 != null) {
            java.lang.String jSONObject6 = jSONObject4.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            ((p05.l4) d0Var2).G(j17, jSONObject6, i17);
        }
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#oldWayAppend gl_ptr=" + j17 + " command=" + jSONObject4);
        p05.d2.c(d2Var, new p05.s1(this.f350735e, w0Var.f350716a, w0Var.f350717b, 111, s1Var2 != null ? 1 : i17, 0L, 32, null));
        return jz5.f0.f302826a;
    }
}
