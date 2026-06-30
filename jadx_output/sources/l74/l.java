package l74;

/* loaded from: classes4.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l74.m f316897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f316898b;

    public l(l74.m mVar, long j17) {
        this.f316897a = mVar;
        this.f316898b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        ca4.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", "PersonalizedAdSwitchReq, errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("status is ");
        sb6.append(((r45.y75) fVar.f70618d).f390839d);
        com.tencent.mars.xlog.Log.i("FeedbackVer2PromptManager", sb6.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            if (((r45.y75) fVar.f70618d).f390839d.equals("false")) {
                i17 = 2;
            } else {
                if (!((r45.y75) fVar.f70618d).f390839d.equals("true")) {
                    com.tencent.mars.xlog.Log.e("FeedbackVer2PromptManager", "PersonalizedAdSwitch invalid status");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
                    jz5.f0 f0Var = jz5.f0.f302826a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
                    return f0Var;
                }
                i17 = 1;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFeedbackVer2Displayer$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            l74.m mVar = this.f316897a;
            l74.k kVar = mVar.f316899q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFeedbackVer2Displayer$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            kVar.c(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setOriginalStatus$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            mVar.f316902t = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setOriginalStatus$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 179);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDataSupplier$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDataSupplier$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsSnsDetailUI$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsSnsDetailUI$p$s-226950187", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager");
            int i18 = (int) (currentTimeMillis - this.f316898b);
            i74.a aVar2 = mVar.f289496i;
            aVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = aVar2.f289456b;
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                aVar = null;
            } else {
                ca4.a aVar3 = new ca4.a(snsInfo.getUxinfo(), mVar.f289499o ? 2 : 1, 1557, java.lang.Integer.valueOf(i18), 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdActTypeData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                aVar = aVar3;
            }
            a84.t0.a(aVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2PromptManager$requestStatusAndUpdate$1");
        return f0Var2;
    }
}
