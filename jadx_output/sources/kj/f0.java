package kj;

/* loaded from: classes12.dex */
public class f0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            if (java.lang.System.currentTimeMillis() - com.tencent.matrix.trace.tracer.TouchEventLagTracer.f53026f < 4000) {
                return;
            }
            oj.j.c("Matrix.TouchEventLagTracer", "onTouchEventLag report", new java.lang.Object[0]);
            com.tencent.matrix.trace.tracer.TouchEventLagTracer.f53026f = java.lang.System.currentTimeMillis();
            dj.b bVar = (dj.b) ih.d.d().a(dj.b.class);
            if (bVar == null) {
                return;
            }
            java.lang.String str = com.tencent.matrix.trace.tracer.TouchEventLagTracer.f53027g;
            boolean h17 = lj.a.h();
            java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52740v;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            oj.d.d(jSONObject, ih.d.d().f291471b);
            jSONObject.put("detail", fj.a.LAG_TOUCH);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2);
            jSONObject.put("threadStack", str);
            jSONObject.put("isProcessForeground", h17);
            ri.d0 d0Var = new ri.d0();
            d0Var.f395860b = "Trace_EvilMethod";
            d0Var.f395862d = jSONObject;
            bVar.d(d0Var);
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.TouchEventLagTracer", "Matrix error, error = " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
