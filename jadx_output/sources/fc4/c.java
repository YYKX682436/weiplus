package fc4;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f261098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f261100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f261101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f261102h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f261103i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f261104m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f261105n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f261106o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f261107p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f261108q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ fc4.g f261109r;

    public c(float f17, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView, int i17, int i18, int i19, int i27, boolean z17, int i28, int i29, int i37, int i38, fc4.g gVar) {
        this.f261098d = f17;
        this.f261099e = flexibleVideoView;
        this.f261100f = i17;
        this.f261101g = i18;
        this.f261102h = i19;
        this.f261103i = i27;
        this.f261104m = z17;
        this.f261105n = i28;
        this.f261106o = i29;
        this.f261107p = i37;
        this.f261108q = i38;
        this.f261109r = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = 1;
        float f18 = this.f261098d;
        float f19 = 1.0f - floatValue;
        float f27 = f17 - ((f17 - f18) * f19);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261099e;
        flexibleVideoView.setScaleX(f27);
        flexibleVideoView.setScaleY(f27);
        float f28 = f17 - floatValue;
        flexibleVideoView.setTranslationX((this.f261100f - this.f261101g) * f28);
        flexibleVideoView.setTranslationY((this.f261102h - this.f261103i) * f28);
        if (this.f261104m) {
            int i17 = (int) (((((this.f261105n * f18) - this.f261106o) * f19) * (f17 / f27)) / 2);
            flexibleVideoView.setClipBounds(new android.graphics.Rect(i17, 0, flexibleVideoView.getWidth() - i17, flexibleVideoView.getHeight()));
        } else {
            int i18 = (int) (((((this.f261107p * f18) - this.f261108q) * f19) * (f17 / f27)) / 2);
            flexibleVideoView.setClipBounds(new android.graphics.Rect(0, i18, flexibleVideoView.getWidth(), flexibleVideoView.getHeight() - i18));
        }
        flexibleVideoView.setVisibility(0);
        androidx.appcompat.app.AppCompatActivity activity = this.f261109r.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((fc4.h) pf5.z.f353948a.a(activity).a(fc4.h.class)).O6(floatValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$2");
    }
}
