package p44;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView f351787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView randomPickCardView) {
        super(0);
        this.f351787d = randomPickCardView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$isFromPreviewMode$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$isFromPreviewMode$2");
        android.content.Context context = this.f351787d.getContext();
        java.lang.Boolean bool = null;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI ? (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context : null;
        if (snsAdNativeLandingPagesUI != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z17 = snsAdNativeLandingPagesUI.I == 26;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            bool = java.lang.Boolean.valueOf(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$isFromPreviewMode$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$isFromPreviewMode$2");
        return bool;
    }
}
