package yc4;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc4.u f460868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yc4.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f460868d = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        yc4.t tVar = new yc4.t(this.f460868d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        yc4.t tVar = (yc4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        yc4.u uVar = this.f460868d;
        uVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        uVar.f460870f = com.tencent.mm.plugin.sns.model.l4.Fj().h2(0L, 1, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        int p17 = c01.e2.p();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setContactCount$cp", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        yc4.u.f460869m = p17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setContactCount$cp", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
        return f0Var;
    }
}
