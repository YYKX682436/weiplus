package kj;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj.u f308266d;

    public t(kj.u uVar) {
        this.f308266d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52740v;
        boolean z17 = com.tencent.matrix.lifecycle.owners.f0.f52739u;
        this.f308266d.getClass();
        boolean z18 = com.tencent.matrix.lifecycle.owners.f0.f52739u;
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String e17 = (z18 || !this.f308266d.f308269g.f253267n) ? lj.f.e(android.os.Looper.getMainLooper().getThread().getStackTrace()) : "";
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f291471b);
            jSONObject.put("detail", fj.a.LAG);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
            jSONObject.put("sceneChanging", z17);
            jSONObject.put("threadStack", e17);
            jSONObject.put("isProcessForeground", z18);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_EvilMethod";
            d0Var.f395862d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("Matrix.AnrTracer", "happens lag : %s, scene : %s ", e17, str2);
        } catch (org.json.JSONException e18) {
            oj.j.b("Matrix.AnrTracer", "[JSONException error: %s", e18);
        }
    }
}
