package dk2;

/* loaded from: classes12.dex */
public final class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f233368d;

    public eb(dk2.tb tbVar) {
        this.f233368d = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km2.r rVar;
        km2.r rVar2;
        dk2.tb tbVar = this.f233368d;
        if (tbVar.f234126g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "doPollingRequestRunnable liveContext is null, cancel:".concat(tbVar.c()));
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.LinkedList<dk2.bb> linkedList = new java.util.LinkedList();
        java.util.Iterator it = tbVar.f234120a.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (it.hasNext()) {
            dk2.bb bbVar = (dk2.bb) it.next();
            if (bbVar.f233252h > (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3743f4).getValue()).r()).intValue() * 1000) + uptimeMillis) {
                break;
            }
            if (!bbVar.f233250f) {
                linkedList.add(bbVar);
                sb6.append(bbVar.toString());
                sb6.append(",");
                it.remove();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "doPollingRequest mergeGap:" + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3743f4).getValue()).r()).intValue() + ", " + ((java.lang.Object) sb6) + ' ' + tbVar.c());
        gk2.e eVar = tbVar.f234126g;
        if (eVar != null) {
            java.util.Map map = tbVar.f234121b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (dk2.bb bbVar2 : linkedList) {
                arrayList.add(new jz5.l(java.lang.Integer.valueOf(bbVar2.f233248d), bbVar2));
            }
            kz5.c1.o(map, arrayList);
            boolean z17 = g92.b.f269769e.k2().getInteger(4) == 3;
            r45.qt2 qt2Var = new r45.qt2();
            km2.n nVar = dk2.ef.H;
            qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
            km2.n nVar2 = dk2.ef.H;
            qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f309151c) == null) ? 0 : rVar.f309206k));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (dk2.bb bbVar3 : linkedList) {
                r45.hj6 hj6Var = new r45.hj6();
                hj6Var.set(0, java.lang.Integer.valueOf(bbVar3.f233248d));
                hj6Var.set(1, com.tencent.mm.protobuf.g.b(bbVar3.f233249e.toByteArray()));
                hj6Var.set(2, (com.tencent.mm.protobuf.g) ((java.util.concurrent.ConcurrentHashMap) tbVar.f234122c).get(java.lang.Integer.valueOf(bbVar3.f233248d)));
                arrayList2.add(hj6Var);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList(arrayList2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "doPollingRequestRunnable request, cmdId to lastBuffer:".concat(kz5.n0.g0(linkedList2, null, null, null, 0, null, dk2.db.f233326d, 31, null)));
            ek2.o2 o2Var = new ek2.o2(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o, z17 ? xy2.c.f(qt2Var) : null, com.tencent.mm.protobuf.g.b(((mm2.e1) eVar.a(mm2.e1.class)).f328985o), linkedList2, ((mm2.c1) eVar.a(mm2.c1.class)).f328844m5, tbVar, qt2Var);
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((dk2.bb) it6.next()).f233253i = o2Var;
            }
            o2Var.l();
        }
        dk2.tb.b(tbVar);
    }
}
