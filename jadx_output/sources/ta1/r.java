package ta1;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416673f;

    public r(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416673f = q0Var;
        this.f416671d = jSONObject;
        this.f416672e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416671d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorRemoveTrack " + jSONObject.toString());
            this.f416673f.f416667c.editorDelTrack(jSONObject.toString().getBytes(), new ta1.q(this));
        } catch (java.lang.Exception e17) {
            this.f416672e.a(1, -1, "editorRemoveTrack error: " + e17.getMessage(), null);
        }
    }
}
