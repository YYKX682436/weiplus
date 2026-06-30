package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class f3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164187d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164188e;

    /* renamed from: f, reason: collision with root package name */
    public final long f164189f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164190g;

    public f3(int i17, long j17, java.lang.String str) {
        this.f164189f = 0L;
        this.f164189f = j17;
        this.f164188e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ra6();
        lVar.f70665b = new r45.sa6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnstagoption";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX;
        lVar.f70668e = 114;
        lVar.f70669f = 1000000114;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164187d = a17;
        r45.ra6 ra6Var = (r45.ra6) a17.f70710a.f70684a;
        ra6Var.f384697d = i17;
        ra6Var.f384698e = j17;
        ra6Var.f384699f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        this.f164190g = u0Var;
        int dispatch = dispatch(sVar, this.f164187d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        return com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        if (i18 != 0 || i19 != 0) {
            this.f164190g.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
            return;
        }
        r45.ma6 ma6Var = ((r45.sa6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f385600d;
        ma6Var.toString();
        int i27 = this.f164188e;
        if (i27 == 1 || i27 == 2) {
            com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(ma6Var.f380311d);
            D0.field_tagId = ma6Var.f380311d;
            java.lang.String str2 = ma6Var.f380312e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            D0.field_tagName = str2;
            D0.field_count = ma6Var.f380313f;
            D0.t0(ma6Var.f380314g);
            com.tencent.mm.plugin.sns.model.l4.Lj().d1(D0);
        } else if (i27 == 3) {
            com.tencent.mm.plugin.sns.model.l4.Lj().y0(this.f164189f);
        }
        this.f164190g.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
    }
}
