package yy0;

@j95.b
/* loaded from: classes5.dex */
public final class o0 extends i95.w implements pp0.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f468258d = "MicroMsg.MJPublisherReporterFeatureService";

    public void Ai(java.lang.String templateId, int i17, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.o4(m7Var, templateId, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("template_id", templateId);
        Ai.put("template_position", java.lang.Integer.valueOf(i17));
        try {
            if (gVar != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(gVar.f192156a, 2);
                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                Ai.put("template_session_buffer", encodeToString);
            } else {
                Ai.put("template_session_buffer", "");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f468258d, "encodeToString templateSessionBuffer exception: " + e17);
            Ai.put("template_session_buffer", "");
        }
        Ai.put("template_type", 1);
        Ai.put("view_id", "mc_template_expose");
        ((cy1.a) rVar).yj("mc_template_expose", null, Ai, 6, false);
    }

    public void Bi(java.lang.String templateId, int i17, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.q4(m7Var, templateId, null), 3, null);
        yy0.m7 m7Var2 = (yy0.m7) l0Var;
        m7Var2.uj(templateId);
        m7Var2.xj(i17);
        m7Var2.yj(gVar);
        m7Var2.Aj(1);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var2.Ai();
        Ai.put("view_id", "mc_start_preview");
        ((cy1.a) rVar).yj("mc_start_preview", null, Ai, 6, false);
    }

    public void Di() {
        long j17;
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        java.util.Map Ai = m7Var.Ai();
        synchronized (yy0.m7.class) {
            com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = m7Var.f468228g;
            if (mJPublisherSessionMetrics != null) {
                j17 = mJPublisherSessionMetrics.b();
            } else {
                com.tencent.mars.xlog.Log.w(m7Var.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
                j17 = 0;
            }
        }
        if (j17 <= 7) {
            Ai.put("view_id", "exit_no_operation");
            ((cy1.a) rVar).yj("exit_no_operation", null, Ai, 6, false);
        }
        Ai.put("view_id", "post_out");
        Ai.put("post_state", "0");
        ((cy1.a) rVar).yj("post_out", null, Ai, 6, false);
        m7Var.cj("UserExit");
        m7Var.fj("UserExit");
        m7Var.bj("UserExit");
        m7Var.mj();
    }

    public void Ni(java.lang.String cancelReason, java.lang.String cancelMessage, long j17) {
        kotlin.jvm.internal.o.g(cancelReason, "cancelReason");
        kotlin.jvm.internal.o.g(cancelMessage, "cancelMessage");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.y1(m7Var, cancelReason, cancelMessage, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("record_duration", java.lang.Long.valueOf(j17));
        Ai.put("cancel_reason", cancelReason);
        Ai.put("cancel_message", cancelMessage);
        Ai.put("view_id", "sc_end_record");
        ((cy1.a) rVar).yj("sc_end_record", null, Ai, 6, false);
    }

    public void Ri(long j17) {
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.d2(m7Var, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) l0Var).Ai();
        Ai.put("preview_duration", java.lang.Long.valueOf(j17));
        Ai.put("view_id", "sc_end_preview");
        ((cy1.a) rVar).yj("sc_end_preview", null, Ai, 6, false);
    }

    public void Ui(java.lang.String templateId, long j17, int i17, com.tencent.mm.protobuf.g gVar, int i18, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        java.lang.String templateTabID = java.lang.String.valueOf(j17);
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        kotlin.jvm.internal.o.g(templateTabID, "templateTabID");
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.m2(m7Var, templateId, templateTabID, i17, z17, "", z18, !z19, z27, z28, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        yy0.m7 m7Var2 = (yy0.m7) l0Var;
        m7Var2.uj(templateId);
        m7Var2.zj(java.lang.String.valueOf(j17));
        m7Var2.xj(i17);
        if (gVar != null) {
            m7Var2.yj(gVar);
        }
        m7Var2.Aj(i18);
        m7Var2.wj(z27);
        m7Var2.vj(z28);
        java.util.Map Ai = m7Var2.Ai();
        Ai.put("active_click", z17 ? "0" : "1");
        Ai.put("view_id", "sc_start_preview");
        ((cy1.a) rVar).yj("sc_start_preview", null, Ai, 6, false);
    }

    public void wi(long j17) {
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("State", "Succeed");
        jSONObject.put("TimeCost", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.oj("PS_AIGCRequestEvent", r26.i0.t(jSONObject2, ",", ";", false));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("time_cost", java.lang.Long.valueOf(j17));
        Ai.put("view_id", "aigc_request_succeed");
        ((cy1.a) rVar).yj("aigc_request_succeed", null, Ai, 6, false);
    }
}
