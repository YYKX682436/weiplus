package xb4;

/* loaded from: classes4.dex */
public final class k extends wb4.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xb4.l f452954b;

    public k(xb4.l lVar) {
        this.f452954b = lVar;
        lVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        lVar.f452959d = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
    }

    @Override // wb4.j
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$toDetailClickAnimation$1");
        this.f452954b.a(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$toDetailClickAnimation$1");
    }
}
