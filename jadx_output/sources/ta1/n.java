package ta1;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416647f;

    public n(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416647f = q0Var;
        this.f416645d = jSONObject;
        this.f416646e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416645d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorCreateTrack " + jSONObject.toString());
            this.f416647f.f416667c.editorAddTrack(jSONObject.toString().getBytes(), new ta1.m(this));
        } catch (java.lang.Exception e17) {
            this.f416646e.a(1, -1, "editorCreateTrack error: " + e17.getMessage(), null);
        }
    }
}
