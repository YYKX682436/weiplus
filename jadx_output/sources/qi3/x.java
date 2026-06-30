package qi3;

/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ qi3.x f363761a = new qi3.x();

    public final void a(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        hm.j a17 = hm.j.f282154g.a();
        long j17 = msgIdTalker.f149480d;
        if (j17 <= 0 || !(!r26.n0.N(msgIdTalker.a()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend.MsgSendingFSC", "invalid msgIdTalker " + msgIdTalker);
            return;
        }
        java.lang.String str = j17 + ';' + msgIdTalker.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend.MsgSendingFSC", "addSendingMsgIdTalker " + str);
        if (a17.T6().f(str)) {
            return;
        }
        a17.T6().A(str, 1);
    }

    public final boolean b(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        hm.j a17 = hm.j.f282154g.a();
        long j17 = msgIdTalker.f149480d;
        if (j17 <= 0 || !(!r26.n0.N(msgIdTalker.a()))) {
            return false;
        }
        return a17.T6().f(j17 + ';' + msgIdTalker.a());
    }

    public final void c(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        hm.j a17 = hm.j.f282154g.a();
        java.lang.String str = msgIdTalker.f149480d + ';' + msgIdTalker.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend.MsgSendingFSC", "removeSendingMsgIdTalker " + str);
        a17.T6().remove(str);
    }

    public final kotlinx.coroutines.flow.j d(qi3.b0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        int ordinal = task.C().ordinal();
        if (ordinal != 2) {
            if (ordinal != 5) {
                if (ordinal != 10) {
                    if (ordinal != 12) {
                        return kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                    }
                }
            }
            return ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(task);
        }
        vf0.y2 y2Var = (vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class));
        y2Var.getClass();
        if (!(task instanceof zf0.v0)) {
            throw new java.lang.UnsupportedOperationException("MicroMsg.video.VideoSendFeatureServicesendAsync only support SendVideoTask Type");
        }
        yf0.k0 a17 = yf0.k0.f461576o.a();
        zf0.v0 v0Var = (zf0.v0) task;
        a17.getClass();
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(2, 0, null, 6, null);
        v0Var.f363678g = b17;
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) a17.f461578f).getValue(), null, new yf0.g0(v0Var, a17, null), 1, null);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new vf0.w2(b17, y2Var, null), 1, null);
        }
        return b17;
    }
}
