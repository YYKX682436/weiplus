package z43;

/* loaded from: classes5.dex */
public final class o0 implements m33.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f470126a;

    public o0(java.lang.String str) {
        this.f470126a = str;
    }

    @Override // m33.w0
    public void a(org.json.JSONObject jSONObject) {
        m33.x0.f323344a.f323345a.remove(this.f470126a);
        if (jSONObject != null) {
            com.tencent.mars.xlog.Log.i("showInputToolView", "onFinish result = " + jSONObject);
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.l("GCInputDidCommit", jSONObject);
            }
        }
    }

    @Override // m33.w0
    public void b(m33.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("showInputToolView", "GameInputStateChange onChanged state = " + u0Var);
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("gamecenter_identifier", this.f470126a);
            jSONObject.put("isShow", u0Var.f323340d);
            jSONObject.put("inputHeight", u0Var.f323339c);
            jSONObject.put("inputTop", u0Var.f323338b);
            jSONObject.put("contentText", u0Var.f323337a);
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            com.tencent.mm.plugin.lite.w.l("GCInputStateChange", jSONObject);
        }
    }
}
