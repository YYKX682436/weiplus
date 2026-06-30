package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class n1 implements com.tencent.mm.plugin.sns.ui.z4, ce4.b {

    /* renamed from: b, reason: collision with root package name */
    public r45.lh0 f169956b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f169957c;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nk0 f169959e;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f169955a = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.m1 f169958d = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f169960f = new java.util.HashMap();

    public n1(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f169957c = mMActivity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        java.util.HashSet hashSet = new java.util.HashSet();
        n(hashSet);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ce4.a aVar = (ce4.a) it.next();
            this.f169960f.put(aVar.getClass().getSimpleName(), aVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        java.util.Iterator it = this.f169960f.entrySet().iterator();
        while (it.hasNext()) {
            ((ce4.a) ((java.util.Map.Entry) it.next()).getValue()).i();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        java.util.Iterator it = this.f169960f.entrySet().iterator();
        while (it.hasNext()) {
            ((ce4.a) ((java.util.Map.Entry) it.next()).getValue()).h(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }

    public ce4.a k(java.lang.Class cls) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("component", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        ce4.a aVar = (ce4.a) this.f169960f.get(cls.getSimpleName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("component", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        return aVar;
    }

    public boolean l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedSetCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedSetCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        return false;
    }

    public void m(com.tencent.mm.plugin.sns.model.y7 y7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageGroupInfo", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        bw5.nk0 nk0Var = this.f169959e;
        y7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsVisibilityData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (nk0Var != null && nk0Var.b() != bw5.qk0.SNS_VISIBILITY_UNKNOWN) {
            cj0.a aVar = cj0.a.f41853a;
            aVar.l("MicroMsg.UploadPackHelper", nk0Var);
            r45.kj4 kj4Var = y7Var.f164782g;
            kj4Var.T = nk0Var;
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = y7Var.f164784i;
            snsObject.ExtFlag = 1;
            snsObject.VisibilityType = nk0Var.b().f32151d;
            int ordinal = nk0Var.b().ordinal();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = y7Var.f164781f;
            if (ordinal == 1) {
                y7Var.f164778c = 0;
                kj4Var.f378743f = 0;
                timeLineObject.Privated = 0;
            } else if (ordinal == 2) {
                y7Var.f164778c = 1;
                kj4Var.f378743f = 1;
                timeLineObject.Privated = 1;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = y7Var.f164783h;
                snsInfo.setPravited(1);
                snsInfo.setLocalPrivate();
                snsInfo.removeSourceFlag(2);
                snsInfo.unSetExtFlag();
            } else if (ordinal == 3) {
                y7Var.k(nk0Var);
                if (!nk0Var.f30716i.isEmpty()) {
                    snsObject.ExtFlag |= 4096;
                    java.util.LinkedList<r45.du5> k17 = ca4.f1.k(aVar.i(nk0Var));
                    snsObject.RecentInteractUserCount = k17.size();
                    snsObject.RecentInteractUserList = k17;
                }
            } else if (ordinal == 4) {
                y7Var.k(nk0Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsVisibilityData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageGroupInfo", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }

    public void n(java.util.HashSet hashSet) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }
}
