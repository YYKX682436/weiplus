package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class l1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182992d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182993e;

    public l1(java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b34();
        lVar.f70665b = new r45.c34();
        lVar.f70666c = "/cgi-bin/mmux-bin/jslog";
        lVar.f70667d = 1803;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182993e = a17;
        r45.b34 b34Var = (r45.b34) a17.f70710a.f70684a;
        r45.d44 d44Var = new r45.d44();
        d44Var.f372091d = o45.wf.f343025c;
        d44Var.f372092e = o45.wf.f343024b;
        d44Var.f372093f = o45.wf.f343027e;
        d44Var.f372094g = wo.q.f447785f;
        d44Var.f372095h = com.tencent.mm.sdk.platformtools.m2.d();
        d44Var.f372096i = (int) (java.lang.System.currentTimeMillis() / 1000);
        b34Var.f370497d = d44Var;
        b34Var.f370498e.addAll(list);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182992d = u0Var;
        return dispatch(sVar, this.f182993e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1803;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        if (i18 == 0 && i19 == 0) {
            r45.c34 c34Var = (r45.c34) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ ");
            boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(c34Var.f371254d);
            java.util.LinkedList<r45.i04> linkedList = c34Var.f371254d;
            if (L0) {
                sb6.append("{  }");
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.i04 i04Var = (r45.i04) it.next();
                    sb6.append(java.lang.String.format(" { logId(%d), interval(%d) },", java.lang.Integer.valueOf(i04Var.f376621d), java.lang.Integer.valueOf(i04Var.f376622e)));
                }
            }
            sb6.append(" }");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJsLog", sb6.toString());
            com.tencent.mm.plugin.webview.model.v0.f183133a.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                for (r45.i04 i04Var2 : linkedList) {
                    com.tencent.mm.plugin.webview.modeltools.z.Ui().f183112e.c(java.lang.Integer.valueOf(i04Var2.f376621d), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1() + i04Var2.f376622e));
                }
                com.tencent.mm.plugin.webview.modeltools.z.Ui().f183112e.a(true);
            }
        }
        this.f182992d.onSceneEnd(i18, i19, str, this);
    }
}
