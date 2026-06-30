package el4;

/* loaded from: classes8.dex */
public final class d0 extends com.tencent.mm.sdk.event.n {
    public d0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderRedDotEraseEvent event = (com.tencent.mm.autogen.events.FinderRedDotEraseEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.xc xcVar = event.f54318g;
        int i17 = xcVar.f8372a.field_ctrType;
        if (i17 < 600000 || i17 >= 699999) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotEraseEventListener", "handleTingRedDotEraseEvent");
        qk.d9 d9Var = (qk.d9) i95.n0.c(qk.d9.class);
        r45.vs2 vs2Var = xcVar.f8372a.field_ctrInfo;
        r45.f03 f03Var = xcVar.f8373b;
        ((ef0.z3) d9Var).getClass();
        if (vs2Var == null) {
            em4.c cVar = em4.c.f255213a;
            return false;
        }
        if (!em4.c.f255213a.c(f03Var != null ? f03Var.f373892i : null)) {
            return false;
        }
        em4.c.d("red_dot_erase", em4.c.b(vs2Var, f03Var, null, 4, null));
        return false;
    }
}
