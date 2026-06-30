package xb4;

/* loaded from: classes4.dex */
public final class e extends wb4.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xb4.f f452929b;

    public e(xb4.f fVar) {
        this.f452929b = fVar;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        fVar.f452933c = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
    }

    @Override // wb4.i
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$toDetailBackAnimation$1");
        this.f452929b.a(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$toDetailBackAnimation$1");
    }
}
