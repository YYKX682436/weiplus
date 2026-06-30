package ta1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416640f;

    public l(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416640f = q0Var;
        this.f416638d = jSONObject;
        this.f416639e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416638d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorGetTrack " + jSONObject.toString());
            this.f416640f.f416667c.editorGetTrack(jSONObject.toString().getBytes(), new ta1.k(this));
        } catch (java.lang.Exception e17) {
            this.f416639e.a(1, -1, "editorGetTrack error: " + e17.getMessage(), null);
        }
    }
}
