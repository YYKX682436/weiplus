package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class e3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164168d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164169e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164170f;

    public e3(int i17, long j17, java.lang.String str, int i18, java.util.List list, int i19) {
        list.size();
        this.f164169e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pa6();
        lVar.f70665b = new r45.qa6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
        lVar.f70667d = 291;
        lVar.f70668e = 115;
        lVar.f70669f = 1000000115;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164168d = a17;
        r45.pa6 pa6Var = (r45.pa6) a17.f70710a.f70684a;
        pa6Var.f382913d = i17;
        pa6Var.f382914e = j17;
        pa6Var.f382915f = str;
        pa6Var.f382916g = i18;
        pa6Var.f382918i = i19;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = str2;
            du5Var.f372757e = true;
            linkedList.add(du5Var);
        }
        pa6Var.f382917h = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        this.f164170f = u0Var;
        int dispatch = dispatch(sVar, this.f164168d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        return 291;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        if (i18 != 0 || i19 != 0) {
            this.f164170f.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
            return;
        }
        r45.ma6 ma6Var = ((r45.qa6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f383794d;
        ma6Var.toString();
        com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(ma6Var.f380311d);
        D0.field_tagId = ma6Var.f380311d;
        java.lang.String str2 = ma6Var.f380312e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        D0.field_tagName = str2;
        int i27 = this.f164169e;
        if (i27 == 1 || i27 == 2 || i27 == 3) {
            D0.field_count = ma6Var.f380313f;
            D0.t0(ma6Var.f380314g);
        }
        com.tencent.mm.plugin.sns.model.l4.Lj().d1(D0);
        this.f164170f.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
    }
}
