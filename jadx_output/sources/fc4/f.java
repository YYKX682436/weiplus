package fc4;

/* loaded from: classes3.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f261125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc4.g f261126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f261128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f261129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f261130i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f261131m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f261132n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f261133o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f261134p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f261135q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f261136r;

    public f(float f17, fc4.g gVar, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView, int i17, int i18, int i19, int i27, boolean z17, int i28, int i29, int i37, int i38) {
        this.f261125d = f17;
        this.f261126e = gVar;
        this.f261127f = flexibleVideoView;
        this.f261128g = i17;
        this.f261129h = i18;
        this.f261130i = i19;
        this.f261131m = i27;
        this.f261132n = z17;
        this.f261133o = i28;
        this.f261134p = i29;
        this.f261135q = i37;
        this.f261136r = i38;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runExitAnimation$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPreScale$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        fc4.g gVar = this.f261126e;
        float f17 = gVar.f261149i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPreScale$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        float f18 = this.f261125d;
        float f19 = ((f17 - f18) * (1.0f - floatValue)) + f18;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261127f;
        flexibleVideoView.setScaleX(f19);
        flexibleVideoView.setScaleY(f19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPreDeltaX$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        int i17 = gVar.f261153p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPreDeltaX$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        float f27 = i17;
        float f28 = 1;
        float f29 = f28 - floatValue;
        flexibleVideoView.setTranslationX(((this.f261128g - this.f261129h) * floatValue) + (f27 * f29));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPreDeltaY$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        int i18 = gVar.f261154q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPreDeltaY$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        flexibleVideoView.setTranslationY(((this.f261130i - this.f261131m) * floatValue) + (i18 * f29));
        if (this.f261132n) {
            int i19 = (int) (((((this.f261133o * f18) - this.f261134p) * floatValue) * (f28 / f19)) / 2);
            flexibleVideoView.setClipBounds(new android.graphics.Rect(i19, 0, flexibleVideoView.getWidth() - i19, flexibleVideoView.getHeight()));
        } else {
            int i27 = (int) (((((this.f261135q * f18) - this.f261136r) * floatValue) * (f28 / f19)) / 2);
            flexibleVideoView.setClipBounds(new android.graphics.Rect(0, i27, flexibleVideoView.getWidth(), flexibleVideoView.getHeight() - i27));
        }
        if (floatValue >= 0.95d) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.r(this.f261127f, false, false, false, 6, null);
        }
        androidx.appcompat.app.AppCompatActivity activity = gVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((fc4.h) pf5.z.f353948a.a(activity).a(fc4.h.class)).O6(f29);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runExitAnimation$2");
    }
}
