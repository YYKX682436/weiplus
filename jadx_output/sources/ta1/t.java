package ta1;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416686f;

    public t(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416686f = q0Var;
        this.f416684d = jSONObject;
        this.f416685e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416684d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorExport " + jSONObject.toString());
            this.f416686f.f416667c.editorExport(jSONObject.toString().getBytes(), new ta1.s(this));
        } catch (java.lang.Exception e17) {
            this.f416685e.a(1, -1, "editorExport error: " + e17.getMessage(), null);
        }
    }
}
