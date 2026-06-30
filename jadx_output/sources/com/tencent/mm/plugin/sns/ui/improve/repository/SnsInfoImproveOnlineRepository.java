package com.tencent.mm.plugin.sns.ui.improve.repository;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsInfoImproveOnlineRepository;", "Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsBaseRepository;", "Lp94/m0;", "Landroidx/lifecycle/y;", "lifecycle", "<init>", "(Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsInfoImproveOnlineRepository extends com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository implements p94.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.d6 f169106e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.q f169107f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.q f169108g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.q f169109h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f169110i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsInfoImproveOnlineRepository(androidx.lifecycle.y lifecycle) {
        super(lifecycle);
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        this.f169106e = com.tencent.mm.plugin.sns.model.l4.Kj();
        this.f169110i = true;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOtherAddSize respMinSeq:");
        sb6.append(str2);
        sb6.append(" isOnRecentErr:");
        sb6.append(z17);
        sb6.append(" recentErrType:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(d0Var != null ? java.lang.Integer.valueOf(d0Var.k()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", sb6.toString());
        kotlinx.coroutines.q qVar = this.f169109h;
        if (qVar != null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(d0Var));
        }
        this.f169109h = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // p94.m0
    public void O0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFpSetSize respMinSeq:");
        sb6.append(str);
        sb6.append(" isOnRecentErr:");
        sb6.append(z17);
        sb6.append(" recentErrType:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(d0Var != null ? java.lang.Integer.valueOf(d0Var.k()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", sb6.toString());
        this.f169110i = i17 != 207;
        kotlinx.coroutines.q qVar = this.f169107f;
        if (qVar != null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(d0Var != null ? d0Var.k() : 0)));
        }
        this.f169107f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNpAddSize respMinSeq:");
        sb6.append(str);
        sb6.append(" isOnRecentErr:");
        sb6.append(z17);
        sb6.append(" recentErrType:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(d0Var != null ? java.lang.Integer.valueOf(d0Var.k()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", sb6.toString());
        boolean z18 = false;
        boolean z19 = i17 != 207;
        boolean z27 = (d0Var != null ? d0Var.k() : 0) > 0;
        if (z19 && z27) {
            z18 = true;
        }
        this.f169110i = z18;
        kotlinx.coroutines.q qVar = this.f169108g;
        if (qVar != null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(d0Var));
        }
        this.f169108g = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        zy1.e.f477325a.b(12076, "next_page_count", 1);
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataOnlineRepository", "onCreate");
        this.f169106e.w(1, "", this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataOnlineRepository", "onDestroy");
        this.f169106e.c(this, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", "onError errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        kotlinx.coroutines.q qVar = this.f169107f;
        if (qVar != null) {
            if (qVar != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(0));
            }
            this.f169107f = null;
        }
        kotlinx.coroutines.q qVar2 = this.f169108g;
        if (qVar2 != null) {
            if (qVar2 != null) {
                qVar2.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
            this.f169108g = null;
        }
        kotlinx.coroutines.q qVar3 = this.f169109h;
        if (qVar3 != null) {
            if (qVar3 != null) {
                qVar3.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
            this.f169109h = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }
}
