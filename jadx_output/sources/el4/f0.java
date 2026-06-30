package el4;

/* loaded from: classes8.dex */
public final class f0 extends com.tencent.mm.sdk.event.n {
    public f0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderRedDotExpirationEvent event = (com.tencent.mm.autogen.events.FinderRedDotExpirationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.yc ycVar = event.f54319g;
        int i17 = ycVar.f8453a.field_ctrType;
        if (i17 < 600000 || i17 >= 699999) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotExpiredEventListener", "handleTingRedDotExpiredEvent");
        qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
        r45.vs2 vs2Var = ycVar.f8453a.field_ctrInfo;
        ((ef0.z3) d9Var).getClass();
        em4.c cVar = em4.c.f255213a;
        java.util.Objects.toString(vs2Var);
        if (vs2Var == null || !em4.c.f255213a.c(null)) {
            return false;
        }
        em4.c.d("red_dot_expired", em4.c.b(vs2Var, null, null, 4, null));
        return false;
    }
}
