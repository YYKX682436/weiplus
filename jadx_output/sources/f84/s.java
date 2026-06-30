package f84;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f260202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f84.u uVar) {
        super(0);
        this.f260202d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mRightMaskView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mRightMaskView$2");
        android.widget.FrameLayout z17 = f84.u.z(this.f260202d);
        android.view.View findViewById = z17 != null ? z17.findViewById(com.tencent.mm.R.id.ufe) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mRightMaskView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mRightMaskView$2");
        return findViewById;
    }
}
