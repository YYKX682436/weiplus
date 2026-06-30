package y80;

@j95.b
/* loaded from: classes12.dex */
public final class p0 extends jm0.o implements z80.h0 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(a90.f.class);
    }

    public qi3.b0 Zi(y80.q1 params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsgFeatureService", "createSendLocationTask: toUser=" + params.f459901a);
        return new y80.t0(params);
    }

    public boolean aj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsgFeatureService", "resendLocation: msgId=" + msgInfo.getMsgId() + ", talker=" + msgInfo.Q0());
        java.lang.String Q0 = msgInfo.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        y80.q1 q1Var = new y80.q1(Q0);
        q1Var.f459902b = true;
        q1Var.f459903c = g45.b.f268846a.b(msgInfo);
        bj(Zi(q1Var));
        return true;
    }

    public void bj(qi3.b0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationMsgFeatureService", "sendSync: starting task " + task.id());
        boolean z17 = task instanceof qi3.c;
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendSync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendAsync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        jz5.g gVar = a90.f.f2410g;
        y80.p0 p0Var = (y80.p0) i95.n0.c(y80.p0.class);
        kotlin.jvm.internal.o.d(p0Var);
        if (!jm0.g.class.isAssignableFrom(a90.f.class)) {
            throw new java.lang.IllegalArgumentException(y80.p0.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(p0Var.getViewModel(), new jm0.e(p0Var)).a(a90.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qi3.c cVar = (qi3.c) task;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(2, 0, null, 6, null);
        cVar.f363678g = b17;
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) ((a90.f) ((jm0.g) a17)).f2411f).getValue(), null, new a90.d(cVar, null), 1, null);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null || v65.i.b(lifecycleScope, null, new y80.o0(b17, null), 1, null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationMsgFeatureService", "sendSync: accountScope is null, cannot execute task " + task.id());
        }
    }
}
