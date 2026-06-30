package n44;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.View view) {
        super(0);
        this.f334928d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$loading$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$loading$2");
        android.view.View view = this.f334928d;
        android.widget.ProgressBar progressBar = view != null ? (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ilp) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$loading$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper$loading$2");
        return progressBar;
    }
}
