package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164378d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164379e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xf f164380f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f164381g;

    public l2(java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wf();
        lVar.f70665b = new r45.xf();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsbatchobjectdetail";
        lVar.f70667d = 5987;
        lVar.f70668e = 97;
        lVar.f70669f = 1000000097;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164378d = a17;
        r45.wf wfVar = (r45.wf) a17.f70710a.f70684a;
        this.f164381g = list;
        wfVar.f389122d.addAll(list);
        wfVar.f389123e = pc4.d.f353410a.t();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        this.f164379e = u0Var;
        int dispatch = dispatch(sVar, this.f164378d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        return 5987;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsBatchDetail", "errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.xf xfVar = (r45.xf) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f164380f = xfVar;
        if (xfVar != null) {
            pc4.d.f353410a.H(xfVar.f390045e);
        }
        this.f164379e.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
    }
}
