package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class m2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Vector f164468i = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164469d;

    /* renamed from: e, reason: collision with root package name */
    public final long f164470e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164471f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f164472g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164473h;

    public m2(long j17, java.lang.String str) {
        this.f164470e = 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.v76();
        lVar.f70665b = new r45.w76();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
        lVar.f70667d = 601;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164469d = a17;
        this.f164470e = j17;
        this.f164471f = 2;
        r45.v76 v76Var = (r45.v76) a17.f70710a.f70684a;
        v76Var.f387971d = "";
        v76Var.f387972e = j17;
        v76Var.f387973f = str;
        v76Var.f387974g = 1;
        ca4.z0.t0(j17);
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.m2.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            java.util.Vector vector = f164468i;
            if (vector.contains(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                return false;
            }
            vector.add(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            return true;
        }
    }

    public static synchronized boolean I(java.lang.String str) {
        synchronized (com.tencent.mm.plugin.sns.model.m2.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            f164468i.remove(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        }
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        this.f164473h = u0Var;
        int dispatch = dispatch(sVar, this.f164469d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        return 601;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        r45.w76 w76Var = (r45.w76) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (v0Var.getRespObj().getRetCode() != 207 && v0Var.getRespObj().getRetCode() != 0 && v0Var.getRespObj().getRetCode() != 212) {
            I("@__classify_timeline");
            this.f164473h.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            return;
        }
        v0Var.getRespObj().getRetCode();
        int i27 = w76Var.f388951g;
        ca4.z0.s0(this.f164470e);
        java.util.Iterator it = w76Var.f388950f.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) it.next();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
            if (snsInfo.setContent(new java.lang.String(snsObject.ObjectDesc.f371841f.g()))) {
                snsObject.ObjectDesc.d(new byte[0]);
                snsInfo.setUserName(snsObject.Username);
                snsInfo.setCreateTime(snsObject.CreateTime);
                snsInfo.setLikeFlag(snsObject.LikeFlag);
                snsInfo.setSnsId(snsObject.Id);
                snsInfo.setStringSeq(snsObject.Id);
                snsInfo.addSourceFlag(this.f164471f);
                try {
                    snsInfo.setAttrBuf(snsObject.toByteArray());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsClassifyTimeLine", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                timeLine.UserName = snsObject.Username;
                snsInfo.setPravited(timeLine.Privated);
                snsInfo.setExtFlag();
                snsInfo.setTimeLine(timeLine);
                snsInfo.setTypeFlag(timeLine.ContentObj.f369837e);
                snsInfo.setSubTypeFlag(timeLine.ContentObj.f369841i);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                snsInfo = null;
            }
            if (snsInfo != null) {
                this.f164472g.add(snsInfo);
            }
        }
        I("@__classify_timeline");
        this.f164473h.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
    }
}
