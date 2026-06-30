package t74;

/* loaded from: classes4.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(t74.w1 w1Var) {
        super(0);
        this.f416106d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFrontMiddleMediaContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFrontMiddleMediaContainer$2");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout a07 = t74.w1.a0(this.f416106d);
        com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout alphaMaskLayout = a07 != null ? (com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AlphaMaskLayout) a07.findViewById(com.tencent.mm.R.id.tyh) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFrontMiddleMediaContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFrontMiddleMediaContainer$2");
        return alphaMaskLayout;
    }
}
