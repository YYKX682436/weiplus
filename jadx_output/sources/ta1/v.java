package ta1;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416690f;

    public v(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416690f = q0Var;
        this.f416688d = jSONObject;
        this.f416689e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416688d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorRemove " + jSONObject.toString());
            this.f416690f.f416667c.editorRemove(jSONObject.toString().getBytes(), new ta1.u(this));
        } catch (java.lang.Exception e17) {
            this.f416689e.a(1, -1, "editorRemove error: " + e17.getMessage(), null);
        }
    }
}
