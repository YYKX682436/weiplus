package v74;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.g f433778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v74.g gVar) {
        super(0);
        this.f433778d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mTipLayoutExtraRightPadding$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mTipLayoutExtraRightPadding$2");
        v74.l0 l0Var = v74.s0.f433890v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        v74.g gVar = this.f433778d;
        android.content.Context context = gVar.f433785d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLookbookCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLookbookCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        s34.s e17 = gVar.f433788g.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMItemSize$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMItemSize$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        gVar.f433787f.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCardHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCardHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (l0Var.a(context, e17, r4.f433889d).x * 0.8f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mTipLayoutExtraRightPadding$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mTipLayoutExtraRightPadding$2");
        return valueOf;
    }
}
