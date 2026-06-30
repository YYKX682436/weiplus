package el4;

/* loaded from: classes8.dex */
public final class b extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f254002d;

    public b() {
        super(0);
        this.f254002d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingRedDotSyncEnable()) == 1;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        jm4.c2 c2Var;
        com.tencent.mm.autogen.events.BypNotifyActionEvent event = (com.tencent.mm.autogen.events.BypNotifyActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.j1 j1Var = event.f54019g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (j1Var.f6992a == 8) {
            boolean Vi = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi();
            if (Vi) {
                hm4.c cVar = (hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f397137h.getValue();
                long j17 = j1Var.f6992a;
                byte[] bArr = j1Var.f6993b;
                if (!cVar.b()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TingSyncExtension", "handleNotifySync no need do sync");
                } else if (bArr == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TingSyncExtension", "syncOnNotify data is null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TingSyncExtension", "handleNotifySync doSync");
                    w71.m1 a17 = cVar.a();
                    if (a17 != null) {
                        urgen.ur_C563.UR_379F.UR_DE8E(((w71.n1) a17).getCppPointer(), j17, bArr);
                    }
                }
            }
            r45.cg4 cg4Var = new r45.cg4();
            cg4Var.parseFrom(j1Var.f6993b);
            com.tencent.mars.xlog.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "notify from bypListen dataSize = " + j1Var.f6993b.length + ", notifyType = " + cg4Var.f371541d);
            int i17 = cg4Var.f371541d;
            el4.a[] aVarArr = el4.a.f254001d;
            if (i17 == 1) {
                if (!Vi) {
                    if (this.f254002d) {
                        com.tencent.mm.protobuf.g gVar = cg4Var.f371542e;
                        byte[] g17 = gVar != null ? gVar.g() : null;
                        if (g17 != null) {
                            if (!(g17.length == 0)) {
                                ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
                                int i18 = jm4.f4.f300382d;
                                jm4.e4 e4Var = (jm4.e4) urgen.ur_0025.UR_E533.UR_1332();
                                if (e4Var != null) {
                                    urgen.ur_0025.UR_E533.UR_D729(((jm4.f4) e4Var).getCppPointer(), g17, 3);
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "try requestSyncItem  syncBuffer is empty");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "try requestSyncItem not enable fetch red dot");
                    }
                }
                return true;
            }
            if (i17 == 3 && (c2Var = (jm4.c2) ((jz5.n) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f397135f).getValue()) != null) {
                urgen.ur_0025.UR_B0D8.UR_2A8C(((jm4.d2) c2Var).getCppPointer(), true, null);
            }
        }
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BypListenRedDotNotifyEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
        return true;
    }
}
