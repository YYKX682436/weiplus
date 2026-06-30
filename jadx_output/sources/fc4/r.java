package fc4;

/* loaded from: classes3.dex */
public final class r implements al5.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc4.v f261201b;

    public r(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView, fc4.v vVar) {
        this.f261200a = flexibleVideoView;
        this.f261201b = vVar;
    }

    @Override // al5.a4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$1");
        android.view.View.OnLongClickListener qVar = new fc4.q(this.f261201b);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261200a;
        flexibleVideoView.v(flexibleVideoView, qVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$1");
    }
}
