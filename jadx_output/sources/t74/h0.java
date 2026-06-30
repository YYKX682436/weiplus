package t74;

/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(t74.w1 w1Var) {
        super(0);
        this.f416146d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mBackBottomView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mBackBottomView$2");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout a07 = t74.w1.a0(this.f416146d);
        android.view.View findViewById = a07 != null ? a07.findViewById(com.tencent.mm.R.id.sgi) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mBackBottomView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mBackBottomView$2");
        return findViewById;
    }
}
