package sd4;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity f406691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity snsJankActivity) {
        super(0);
        this.f406691d = snsJankActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
        java.lang.Float valueOf = java.lang.Float.valueOf(this.f406691d.getWindowManager().getDefaultDisplay().getRefreshRate());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
        return valueOf;
    }
}
