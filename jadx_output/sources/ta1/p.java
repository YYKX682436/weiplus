package ta1;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416659f;

    public p(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416659f = q0Var;
        this.f416657d = jSONObject;
        this.f416658e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416657d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorUpdateTrack " + jSONObject.toString());
            this.f416659f.f416667c.editorUpdateTrack(jSONObject.toString().getBytes(), new ta1.o(this));
        } catch (java.lang.Exception e17) {
            this.f416658e.a(1, -1, "editorUpdateTrack error: " + e17.getMessage(), null);
        }
    }
}
