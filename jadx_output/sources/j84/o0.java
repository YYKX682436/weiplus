package j84;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f298224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(android.content.Context context) {
        super(0);
        this.f298224d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$touchSlopSquare$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$touchSlopSquare$2");
        int scaledTouchSlop = android.view.ViewConfiguration.get(this.f298224d).getScaledTouchSlop();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(scaledTouchSlop * scaledTouchSlop);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$touchSlopSquare$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCoverView$touchSlopSquare$2");
        return valueOf;
    }
}
