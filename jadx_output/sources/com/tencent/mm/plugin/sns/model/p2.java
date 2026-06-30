package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class p2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f164569m = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164570d;

    /* renamed from: e, reason: collision with root package name */
    public final long f164571e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164572f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f164573g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.v1 f164574h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f164575i = false;

    public p2(long j17) {
        this.f164571e = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.m96();
        lVar.f70665b = new r45.n96();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
        lVar.f70667d = 210;
        lVar.f70668e = 101;
        lVar.f70669f = 1000000101;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164570d = a17;
        com.tencent.mm.modelbase.m mVar = a17.f70710a;
        ((r45.m96) mVar.f70684a).f380285d = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetNameList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        ((r45.m96) mVar.f70684a).f380286e = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetNameList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
    }

    public static boolean H(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        java.util.List list = f164569m;
        if (((java.util.Vector) list).contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            return false;
        }
        ((java.util.Vector) list).add(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return true;
    }

    public boolean I(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFeedForbidAccessWithResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        boolean z17 = true;
        boolean z18 = i17 == 0 && i18 == 0;
        r45.n96 n96Var = (r45.n96) this.f164570d.f70711b.f70700a;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = n96Var.f381186d;
        int i19 = n96Var.f381187e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectDetial", "checkFeedForbidAccessWithResp errType=%s, errCode=%s, CanNotSeeReason=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if ((!z18 && i19 == 0) || (snsObject != null && snsObject.Id != 0)) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFeedForbidAccessWithResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return z17;
    }

    public com.tencent.mm.protocal.protobuf.SnsObject J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRespSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = ((r45.n96) this.f164570d.f70711b.f70700a).f381186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRespSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return snsObject;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        this.f164572f = u0Var;
        int dispatch = dispatch(sVar, this.f164570d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return 210;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        if (i18 != 0 || i19 != 0) {
            this.f164572f.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            return;
        }
        r45.n96 n96Var = (r45.n96) this.f164570d.f70711b.f70700a;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = n96Var.f381186d;
        if (snsObject != null) {
            ca4.f1.f39897a.j("MicroMsg.NetSceneSnsObjectDetial", snsObject, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + x51.j1.f(snsObject.ObjectDesc));
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = new com.tencent.mm.protocal.protobuf.SnsObject();
            try {
                snsObject2.parseFrom(snsObject.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectDetial", e17, "SnsObject parseFrom error", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.sns.model.s5.p(snsObject2);
            java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.j(snsObject.Id, it.next());
            }
        }
        this.f164572f.onSceneEnd(i18, i19, str, this);
        if (n96Var.f381187e == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            ((java.util.Vector) f164569m).remove(java.lang.Long.valueOf(this.f164571e));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
    }
}
