package com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBSclView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdLandingMBSclView extends com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdLandingMBSclView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
    }

    @Override // com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i("AdLandingMBSclView", "AdLandingMBSclView, onLayout:w=" + (i19 - i17) + ", h=" + (i27 - i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLandingMBSclView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
