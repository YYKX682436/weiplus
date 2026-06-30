package yc4;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc4.f f460838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yc4.f fVar) {
        super(0);
        this.f460838d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
        yc4.f fVar = this.f460838d;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        androidx.appcompat.app.AppCompatActivity activity = fVar.f460851d.getActivity();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport$context$2");
        return activity;
    }
}
