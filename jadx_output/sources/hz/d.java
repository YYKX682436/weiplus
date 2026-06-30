package hz;

@j95.b
/* loaded from: classes9.dex */
public final class d extends jm0.o implements iz.e {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(jz.f.class);
    }

    public qi3.b0 Zi(hz.m params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsgFeatureService", "createSendContactCardTask: toUser=" + params.f286233a + ", contentUser=" + params.f286234b);
        return new hz.h(params);
    }

    public void aj(qi3.b0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactCardMsgFeatureService", "sendSync: starting task " + task.id());
        boolean z17 = task instanceof qi3.c;
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendSync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendAsync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        jz5.g gVar = jz.f.f302560g;
        hz.d dVar = (hz.d) i95.n0.c(hz.d.class);
        kotlin.jvm.internal.o.d(dVar);
        if (!jm0.g.class.isAssignableFrom(jz.f.class)) {
            throw new java.lang.IllegalArgumentException(hz.d.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(dVar.getViewModel(), new jm0.e(dVar)).a(jz.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qi3.c cVar = (qi3.c) task;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(2, 0, null, 6, null);
        cVar.f363678g = b17;
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) ((jz.f) ((jm0.g) a17)).f302561f).getValue(), null, new jz.d(cVar, null), 1, null);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null || v65.i.b(lifecycleScope, null, new hz.c(b17, null), 1, null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactCardMsgFeatureService", "sendSync: accountScope is null, cannot execute task " + task.id());
        }
    }
}
