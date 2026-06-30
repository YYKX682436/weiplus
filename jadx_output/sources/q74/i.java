package q74;

/* loaded from: classes4.dex */
public final class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f360461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q74.t f360462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s34.o1 f360463f;

    public i(int i17, q74.t tVar, s34.o1 o1Var) {
        this.f360461d = i17;
        this.f360462e = tVar;
        this.f360463f = o1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.w("AdSlideProductItemViewLogic", "doEnterAnim onAnimationCancel, index is " + this.f360461d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.Long c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("AdSlideProductItemViewLogic", "doEnterAnim onAnimationEnd, index is " + this.f360461d);
        q74.t tVar = this.f360462e;
        android.widget.ImageView g17 = q74.t.g(tVar);
        if (g17 != null) {
            g17.setTranslationX(0.0f);
        }
        android.widget.ImageView g18 = q74.t.g(tVar);
        if (g18 != null) {
            g18.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.ViewGroup viewGroup = tVar.f360525g;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        a84.y0.i(q74.t.g(tVar));
        android.widget.ImageView g19 = q74.t.g(tVar);
        android.widget.ImageView h17 = q74.t.h(tVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.f360528j = h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMProductIconIn$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        tVar.f360527i = g19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMProductIconOut$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductIconContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductIconContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        a84.y0.b(tVar.f360526h, q74.t.h(tVar), 0);
        q74.t.c(tVar).removeCallbacksAndMessages(null);
        com.tencent.mm.sdk.platformtools.n3 c18 = q74.t.c(tVar);
        q74.h hVar = new q74.h(tVar);
        s34.o1 o1Var = this.f360463f;
        c18.postDelayed(hVar, (o1Var == null || (c17 = o1Var.c()) == null) ? 1500L : c17.longValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("AdSlideProductItemViewLogic", "doEnterAnim onAnimationStart, index is " + this.f360461d);
        q74.t tVar = this.f360462e;
        android.widget.ImageView h17 = q74.t.h(tVar);
        if (h17 != null) {
            h17.setAlpha(0.0f);
        }
        android.widget.ImageView g17 = q74.t.g(tVar);
        if (g17 != null) {
            g17.setTranslationX(-q74.t.a(tVar));
        }
        android.widget.ImageView g18 = q74.t.g(tVar);
        if (g18 != null) {
            g18.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.view.ViewGroup viewGroup = tVar.f360525g;
        if (viewGroup != null) {
            viewGroup.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doEnterAnim$1");
    }
}
