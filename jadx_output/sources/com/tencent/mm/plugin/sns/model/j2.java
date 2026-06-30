package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class j2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164320d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164321e;

    public j2(java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.y2();
        lVar.f70665b = new r45.z2();
        lVar.f70666c = "/cgi-bin/mmoc-bin/ad/addatareport";
        lVar.f70667d = 1295;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164320d = a17;
        ((r45.y2) a17.f70710a.f70684a).f390724d = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdDataReport", "report %d ads", java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        this.f164321e = u0Var;
        int dispatch = dispatch(sVar, this.f164320d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        return 1295;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        this.f164321e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
    }
}
