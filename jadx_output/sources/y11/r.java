package y11;

/* loaded from: classes12.dex */
public final class r extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f, g75.t
    public void c() {
        super.c();
    }

    @h75.a
    public final j75.b handleMsgCommonFillMsgActionDone(g75.z state, y11.f action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return new y11.g(action.f458813b);
    }

    @h75.a
    public final j75.b handleMsgInsertInitStgActionDone(g75.z state, y11.h action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return new y11.l(action.f458815b);
    }

    @h75.a
    public final j75.b handleResendMsgInfoDealActionDone(g75.z state, y11.j action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        return new y11.l(action.f458818b);
    }

    @h75.a
    public final j75.b handleSendMsgInitAction(g75.z state, y11.p action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        if (m().f442132g != 0 && m().f442132g != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMainFlowPPC", "handleSendMsgInitAction resend");
            state.l("PPCKey_LocalMsgId", java.lang.Long.valueOf(m().f442132g));
            state.l("PPCKey_IsResend", java.lang.Boolean.TRUE);
            return new y11.i(m().f442132g, m().f442127b);
        }
        if (m().f442129d.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMainFlowPPC", "handleSendMsgInitAction content.isEmpty");
            return new y11.l(0L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMainFlowPPC", "handleSendMsgInitAction content.isNotEmpty");
        return new y11.e(new com.tencent.mm.storage.f9());
    }

    @Override // g75.f
    public j75.b l(g75.z state) {
        kotlin.jvm.internal.o.g(state, "state");
        return new y11.p();
    }

    public final w11.r1 m() {
        java.lang.Object d17 = h().d("PPCKey_Params");
        kotlin.jvm.internal.o.d(d17);
        return (w11.r1) d17;
    }

    @h75.a
    public final j75.b success(g75.z state, y11.m action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        g75.z zVar = new g75.z();
        zVar.l("PPCKey_LocalMsgId", java.lang.Long.valueOf(action.f458820b));
        return new g75.a0(zVar);
    }
}
