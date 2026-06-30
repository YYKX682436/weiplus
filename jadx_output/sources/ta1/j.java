package ta1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416631f;

    public j(ta1.q0 q0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        this.f416631f = q0Var;
        this.f416629d = jSONObject;
        this.f416630e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f416629d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger editorCreate " + jSONObject.toString());
            this.f416631f.f416667c.editorCreate(jSONObject.toString().getBytes(), new ta1.i(this));
        } catch (java.lang.Exception e17) {
            this.f416630e.a(1, -1, "editorCreate error: " + e17.getMessage(), null);
        }
    }
}
