package e94;

/* loaded from: classes4.dex */
public final class e extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView f250375a;

    public e(com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView) {
        this.f250375a = flyingFlipAnimView;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$mCardOutlineProvider$1");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardW$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView = this.f250375a;
        int i18 = flyingFlipAnimView.f163881d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardW$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardH$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        int i19 = flyingFlipAnimView.f163882e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardH$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardRadius$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        float f17 = flyingFlipAnimView.f163883f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardRadius$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        outline.setRoundRect(0, 0, i18, i19, f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$mCardOutlineProvider$1");
    }
}
