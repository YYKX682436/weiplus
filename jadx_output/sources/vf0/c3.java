package vf0;

/* loaded from: classes12.dex */
public final class c3 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).mj(this);
    }

    @Override // wf0.j1
    public void l1(qi3.e0 event) {
        vf0.h3 h3Var;
        c01.h7 a17;
        kotlin.jvm.internal.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f363692b;
        if (v0Var == null || (h3Var = v0Var.f472563i) == null) {
            return;
        }
        if (event.f363691a != qi3.g0.f363712n) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
        java.lang.String a18 = msgIdTalker != null ? msgIdTalker.a() : null;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = event.f363697g;
        com.tencent.mm.storage.f9 k17 = e0Var.k(a18, msgIdTalker2 != null ? msgIdTalker2.f149480d : 0L);
        if (k17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.video.VideoSendIncrementalCleanFSC", "onSendVideoEventAsync: " + k17.getMsgId() + '-' + tg3.l1.a(k17) + ",try to clean incremental");
        c01.h7 h7Var = h3Var.f436175b.f436284f;
        if (h7Var != null && (a17 = c01.i7.a(h7Var)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.video.VideoSendIncrementalCleanFSC", "onSendVideoEventAsync: forwardMsgId=" + a17.f37227b + ",forwardMsgTalker=" + a17.f37229d);
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(a17.f37227b), a17.f37229d);
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(k17.getMsgId()), k17.Q0());
    }
}
