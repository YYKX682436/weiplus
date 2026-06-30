package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class e implements za4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164162a;

    public e(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy) {
        this.f164162a = adLandingPagesProxy;
    }

    @Override // za4.f
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL("stopped", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }

    @Override // za4.f
    public void b(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }

    @Override // za4.f
    public void c(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL("progress", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }

    @Override // za4.f
    public void d(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL("resumed", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }

    @Override // za4.f
    public void e(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }

    @Override // za4.f
    public void f(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL("paused", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }

    @Override // za4.f
    public void n(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
        this.f164162a.CLIENT_CALL("start", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
    }
}
