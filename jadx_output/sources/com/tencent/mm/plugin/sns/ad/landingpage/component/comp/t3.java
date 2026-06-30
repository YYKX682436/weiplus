package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 f162950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3 u3Var) {
        super(0);
        this.f162950d = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$mTextView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$mTextView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContentView$p$s-705992641", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.view.View view = this.f162950d.f165056n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContentView$p$s-705992641", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n4f) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$mTextView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp$mTextView$2");
        return textView;
    }
}
