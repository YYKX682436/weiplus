package i64;

/* loaded from: classes.dex */
public class n0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f289245d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f289246e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f289247f;

    public n0(java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        this.f289247f = list;
        lVar.f70664a = new r45.k3();
        lVar.f70665b = new r45.l3();
        lVar.f70666c = "/cgi-bin/mmux-bin/adlog";
        lVar.f70667d = 1802;
        int i17 = 0;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f289245d = a17;
        r45.k3 k3Var = (r45.k3) a17.f70710a.f70684a;
        r45.d44 d44Var = new r45.d44();
        d44Var.f372091d = o45.wf.f343025c;
        d44Var.f372092e = o45.wf.f343024b;
        d44Var.f372093f = o45.wf.f343027e;
        d44Var.f372094g = wo.q.f447785f;
        d44Var.f372095h = com.tencent.mm.sdk.platformtools.m2.d();
        d44Var.f372096i = (int) (java.lang.System.currentTimeMillis() / 1000);
        k3Var.f378337d = d44Var;
        while (true) {
            int size = list.size();
            java.util.LinkedList linkedList = k3Var.f378338e;
            if (i17 >= size) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdLog", "report count: " + linkedList.size());
                return;
            }
            linkedList.add((r45.e44) list.get(i17));
            i17++;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        this.f289246e = u0Var;
        int dispatch = dispatch(sVar, this.f289245d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        return 1802;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        if (i18 == 0 && i19 == 0) {
            int i27 = ((r45.l3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f379106d;
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_SNS_ADLOG_FREQUENCY_INT, java.lang.Integer.valueOf(i27));
        }
        this.f289246e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
    }
}
