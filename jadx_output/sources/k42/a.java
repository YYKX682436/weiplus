package k42;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f304058d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f304059e;

    /* renamed from: f, reason: collision with root package name */
    public final u42.c f304060f;

    public a(java.util.List list, u42.c cVar) {
        this.f304059e = list;
        this.f304060f = cVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f304058d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vh0();
        lVar.f70665b = new r45.wh0();
        lVar.f70666c = "/cgi-bin/mmfddataecappsvr/edgerealtimereport";
        lVar.f70667d = 4871;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((r45.vh0) a17.f70710a.f70684a).f388232d.addAll(this.f304059e);
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4871;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneEdgeComputingRtReport", "[onGYNetEnd] netId[%d] errType[%d] errCode[%d] errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.List<r45.uh0> list = this.f304059e;
        u42.c cVar = this.f304060f;
        if (i18 == 0 && i19 == 0) {
            r45.wh0 wh0Var = (r45.wh0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            long j17 = wh0Var.f389154d;
            java.util.LinkedList<r45.th0> linkedList2 = wh0Var.f389155e;
            u42.a aVar = (u42.a) cVar;
            aVar.getClass();
            com.tencent.mm.sdk.platformtools.o4 e17 = g42.i.e();
            if (e17 != null) {
                e17.putLong("mmkv_key_realtime_report_period", j17);
            }
            aVar.f424639b = j17;
            if (linkedList2 != null && list != null) {
                boolean z17 = false;
                for (r45.th0 th0Var : linkedList2) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r45.uh0 uh0Var = (r45.uh0) it.next();
                            if (u46.l.c(uh0Var.f387375d, th0Var.f386421d) && uh0Var.f387376e == th0Var.f386422e) {
                                if (th0Var.f386423f != 0 && (linkedList = uh0Var.f387377f) != null) {
                                    java.util.Iterator it6 = linkedList.iterator();
                                    while (it6.hasNext()) {
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(uh0Var.f387376e, (java.lang.String) it6.next());
                                    }
                                    com.tencent.mars.xlog.Log.e("EdgeComputingReporter", "report realtimeReport svr reject configID : " + uh0Var.f387375d + ", logID : " + uh0Var.f387376e + ", dropFlag : " + th0Var.f386423f + ", contents size : " + linkedList.size());
                                    z17 = true;
                                }
                            }
                        }
                    }
                }
                if (z17) {
                    t42.a.d(4);
                } else {
                    t42.a.d(5);
                }
            }
            t42.a.d(2);
        } else {
            ((u42.a) cVar).getClass();
            if (list != null && list.size() > 0) {
                for (r45.uh0 uh0Var2 : list) {
                    java.util.Iterator it7 = uh0Var2.f387377f.iterator();
                    while (it7.hasNext()) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(uh0Var2.f387376e, (java.lang.String) it7.next());
                    }
                }
                t42.a.d(3);
            }
        }
        this.f304058d.onSceneEnd(i18, i19, str, this);
    }
}
