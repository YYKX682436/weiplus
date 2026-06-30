package dd4;

/* loaded from: classes4.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f229036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView) {
        super(1);
        this.f229036d = flexibleVideoView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestFullDownload$path$1");
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestFullDownload$path$1");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.f169220J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getProgressView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = this.f229036d.f169227m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getProgressView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        mMPinProgressBtn.setProgress((int) floatValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestFullDownload$path$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestFullDownload$path$1");
        return f0Var;
    }
}
