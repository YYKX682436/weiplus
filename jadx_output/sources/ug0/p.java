package ug0;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f427469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ug0.q qVar) {
        super(1);
        this.f427469d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        ug0.x state = (ug0.x) obj;
        kotlin.jvm.internal.o.g(state, "state");
        ug0.q qVar = this.f427469d;
        qVar.getClass();
        j75.d dVar = state.f298066d;
        tg0.u1 u1Var = qVar.f427475h;
        if (dVar != null && (dVar instanceof tg0.o2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotReceived");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = ((tg0.o2) dVar).f419098b;
            if (jbVar2 != null) {
                java.util.Iterator it = jbVar2.L0().iterator();
                while (it.hasNext()) {
                    ((wg0.a) u1Var).a("red_dot_received", jbVar2, (r45.f03) it.next(), null);
                }
            }
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).Di(20);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof tg0.l2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotExpired");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = ((tg0.l2) dVar2).f419092b;
            if (jbVar3 != null) {
                ((wg0.a) u1Var).a("red_dot_expired", jbVar3, null, null);
            }
        }
        j75.d dVar3 = state.f298066d;
        jm0.o oVar = qVar.f300267d;
        if (dVar3 != null && (dVar3 instanceof tg0.j2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onObserveRedDotUpdates, redDotResult: ");
            com.tencent.mm.plugin.finder.extension.reddot.a aVar = ((tg0.j2) dVar3).f419086b;
            sb6.append(aVar);
            sb6.append(", isShow: ");
            sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f105327a) : null);
            sb6.append(", path: ");
            sb6.append(aVar != null ? aVar.f105331e : null);
            sb6.append(", field_tips_uuid: ");
            java.lang.String str = (aVar == null || (jbVar = aVar.f105329c) == null) ? null : jbVar.field_tips_uuid;
            if (str == null) {
                str = "null";
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb6.toString());
            tg0.u1 aj6 = ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
            java.lang.String str2 = aVar != null ? aVar.f105331e : null;
            wg0.a aVar2 = (wg0.a) aj6;
            aVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotReporter", "resetExpose, path: " + str2);
            if (str2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) aVar2.f445708a).remove(str2);
                ((java.util.concurrent.ConcurrentHashMap) aVar2.f445709b).remove(str2);
            }
            j75.f Ai = oVar.Ai();
            if (Ai != null) {
                Ai.B3(new tg0.i2(aVar));
            }
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof tg0.k2)) {
            tg0.k2 k2Var = (tg0.k2) dVar4;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotErased");
            wg0.a aVar3 = (wg0.a) u1Var;
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar4 = k2Var.f419087b;
            r45.f03 f03Var = k2Var.f419088c;
            if (jbVar4 == null) {
                aVar3.getClass();
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchRedDotReporter", "reportErased, invalid params, ctrInfo: " + jbVar4 + ", showInfo: " + f03Var);
            } else {
                aVar3.a("red_dot_erase", jbVar4, f03Var, null);
            }
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof tg0.p2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveCheckDBRequest, fromBiz: " + ((tg0.p2) dVar5).f419102b);
            com.tencent.mm.plugin.finder.extension.reddot.a aVar4 = new com.tencent.mm.plugin.finder.extension.reddot.a(false, null, null, "");
            j75.f Ai2 = oVar.Ai();
            if (Ai2 != null) {
                Ai2.B3(new tg0.i2(aVar4));
            }
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof tg0.q2)) {
            tg0.q2 q2Var = (tg0.q2) dVar6;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onObserveSyncRequest, syncScene: ");
            sb7.append(q2Var.f419103b);
            sb7.append(", cgiBizId: ");
            int i17 = q2Var.f419104c;
            sb7.append(i17);
            sb7.append(", shouldCheckConfig: false, ctxBuffer: ");
            byte[] bArr = q2Var.f419105d;
            sb7.append(bArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb7.toString());
            qVar.U6(q2Var.f419103b, i17, false, bArr);
        }
        j75.d dVar7 = state.f298066d;
        if (dVar7 != null && (dVar7 instanceof tg0.n2)) {
            tg0.n2 n2Var = (tg0.n2) dVar7;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onObserveWebSearchPage, pageEvent: ");
            sb8.append(n2Var.f419096b);
            sb8.append(", scene: ");
            int i18 = n2Var.f419097c;
            sb8.append(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", sb8.toString());
            int[] iArr = ug0.i.f427459a;
            androidx.lifecycle.m mVar = n2Var.f419096b;
            int i19 = iArr[mVar.ordinal()];
            if (i18 == 20) {
                if (mVar == androidx.lifecycle.m.ON_CREATE) {
                    qVar.U6(3000, 8, false, null);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Search.Entrance");
                } else if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Search.Entrance");
                }
            }
        }
        j75.d dVar8 = state.f298066d;
        if (dVar8 != null && (dVar8 instanceof tg0.m2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "requestRedDotSync onFindMoreResume.");
            qVar.U6(com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_RUNTIME_EXCEPTION, 8, true, null);
        }
        return jz5.f0.f302826a;
    }
}
