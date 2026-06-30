package h62;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ef3 f279196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h62.l f279197e;

    public k(h62.l lVar, r45.ef3 ef3Var) {
        this.f279197e = lVar;
        this.f279196d = ef3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        h62.l lVar = this.f279197e;
        lVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        r45.ef3 ef3Var = this.f279196d;
        if (ef3Var == null || ef3Var.getBaseResponse() == null) {
            return;
        }
        if (ef3Var.getBaseResponse().f376959d != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetExpt", "get expt error. resp baseResp [%d] [%s]", java.lang.Integer.valueOf(ef3Var.getBaseResponse().f376959d), ef3Var.getBaseResponse().f376960e);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 2L, 1L, false);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = ef3Var.f373388g;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                r45.lm0 lm0Var = (r45.lm0) it.next();
                j62.c cVar = new j62.c();
                cVar.t0(lm0Var.f379595g);
                cVar.field_exptCheckSum = lm0Var.f379597i;
                cVar.field_bucketSrc = lm0Var.f379598m;
                cVar.field_paramHashVal = lm0Var.f379599n;
                int i17 = cVar.field_exptId;
                int i18 = lm0Var.f379592d;
                if (i17 != i18 || cVar.field_groupId != lm0Var.f379593e || cVar.field_exptSeq != lm0Var.f379594f) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetExpt", "expt item proto[%d %d %d] is different expt content[%d %d %d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(lm0Var.f379593e), java.lang.Integer.valueOf(lm0Var.f379594f), java.lang.Integer.valueOf(cVar.field_exptId), java.lang.Integer.valueOf(cVar.field_groupId), java.lang.Integer.valueOf(cVar.field_exptSeq));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 6L, 1L, false);
                }
                linkedList.add(cVar);
            }
        }
        h62.d vj6 = h62.d.vj();
        int i19 = ef3Var.f373389h;
        java.util.LinkedList linkedList3 = ef3Var.f373387f;
        vj6.Ij(i19, linkedList3, linkedList, ef3Var.f373390i);
        lVar.I(ef3Var.f373385d);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_INTERVAL_SEC_INT, java.lang.Integer.valueOf(ef3Var.f373386e));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 1L, 1L, false);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(ef3Var.f373385d);
        objArr[1] = java.lang.Integer.valueOf(ef3Var.f373386e);
        objArr[2] = java.lang.Integer.valueOf(ef3Var.f373389h);
        objArr[3] = java.lang.Integer.valueOf(linkedList3 != null ? linkedList3.size() : 0);
        objArr[4] = java.lang.Integer.valueOf(linkedList.size());
        objArr[5] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExpt", "update expt svrTime:%d interval:%d exptFlag:%d  deleteCount:[svr:%d] replaceCount:[svr:%d] cost[%d]", objArr);
    }
}
