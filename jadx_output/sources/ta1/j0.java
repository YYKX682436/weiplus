package ta1;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f416634f;

    public j0(ta1.q0 q0Var, java.lang.String str, ta1.t0 t0Var) {
        this.f416634f = q0Var;
        this.f416632d = str;
        this.f416633e = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f416632d;
        ta1.t0 t0Var = this.f416633e;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: requestAnalyze %s", str);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            this.f416634f.f416667c.analysis(jSONObject.toString().getBytes(), new ta1.i0(this));
        } catch (org.json.JSONException e17) {
            t0Var.a(1, -1, "analysis error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            t0Var.a(1, -1, "analysis error: " + e18.getMessage(), null);
        }
    }
}
