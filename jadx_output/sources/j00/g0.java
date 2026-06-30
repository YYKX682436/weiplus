package j00;

/* loaded from: classes7.dex */
public final class g0 {
    public final void a(java.lang.String seqId, long j17, java.lang.String finderUsername, java.lang.String giftId) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(seqId, "seqId");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mars.xlog.Log.i("Ecs.Gift.Live.EcsGiftInLiveMonitor", "onStartResend, seqId: " + seqId + ", liveId: " + j17 + ", finderUsername: " + finderUsername + ", giftId: " + giftId);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            j00.s1[] s1VarArr = j00.s1.f296885d;
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(1)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, "resend_start"), new jz5.l("seqId", seqId), new jz5.l("liveId", java.lang.String.valueOf(j17)), new jz5.l("finderUsername", finderUsername), new jz5.l("giftId", giftId))).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            y02.v0 a17 = y02.x0.f458634d.a();
            if (a17 != null) {
                a17.p1(bw5.d5.EcsGiftSendFlow, 1, t17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Ecs.Gift.Live.EcsGiftInLiveMonitor", m524exceptionOrNullimpl, "onStartResend", new java.lang.Object[0]);
        }
    }
}
