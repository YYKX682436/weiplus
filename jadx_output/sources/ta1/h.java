package ta1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416624f;

    public h(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416624f = q0Var;
        this.f416622d = jSONObject;
        this.f416623e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416622d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger remux " + jSONObject.toString());
            this.f416624f.f416667c.remux(jSONObject.toString().getBytes(), new ta1.g(this));
        } catch (java.lang.Exception e17) {
            this.f416623e.a(1, -1, "remux error: " + e17.getMessage(), new org.json.JSONObject());
        }
    }
}
