package kj;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String a17 = lj.f.a();
            boolean h17 = lj.a.h();
            java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52740v;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f291471b);
            jSONObject.put("detail", fj.a.LAG_IDLE_HANDLER);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
            jSONObject.put("threadStack", a17);
            jSONObject.put("isProcessForeground", h17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_EvilMethod";
            d0Var.f395862d = jSONObject;
            bVar.d(d0Var);
            oj.j.b("Matrix.IdleHandlerLagTracer", "happens idle handler Lag : %s ", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.IdleHandlerLagTracer", "Matrix error, error = " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
