package rp1;

/* loaded from: classes14.dex */
public class i1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f398419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f398423h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398424i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f398425m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f398426n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f398427o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f398428p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f398429q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398430r;

    public i1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, int i17, int i18, int i19, int i27, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, float f17, float f18) {
        this.f398430r = floatBallView;
        this.f398419d = i17;
        this.f398420e = i18;
        this.f398421f = i19;
        this.f398422g = i27;
        this.f398423h = z17;
        this.f398424i = z18;
        this.f398425m = z19;
        this.f398426n = z27;
        this.f398427o = z28;
        this.f398428p = f17;
        this.f398429q = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = this.f398420e;
        int i17 = this.f398419d;
        float f18 = i17;
        int i18 = ((int) (((f17 * 1.0f) - f18) * floatValue)) + i17;
        int i19 = this.f398421f;
        int i27 = ((int) (((this.f398422g * 1.0f) - i19) * floatValue)) + i19;
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398430r;
        boolean z17 = this.f398423h;
        if (z17) {
            int i28 = com.tencent.mm.plugin.ball.view.FloatBallView.f93514u2;
            floatBallView.I0(floatBallView.Z(i18), i18, i27, false, false);
        }
        this.f398430r.z0(i18, i27, false, false, true, this.f398424i);
        if (this.f398425m && !floatBallView.f93543n2 && floatValue > 0.5f) {
            boolean z18 = this.f398426n;
            if (z18 && floatBallView.K != 0) {
                floatBallView.K = 0;
                floatBallView.f93520J.setRotation(0);
            } else if (!z18 && floatBallView.K != 180) {
                floatBallView.K = 180;
                floatBallView.f93520J.setRotation(180);
            }
        }
        if (!this.f398427o || z17) {
            return;
        }
        float f19 = i18;
        floatBallView.getClass();
        java.lang.Boolean bool = qp1.w.f365755a;
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, (f19 - f18) / (f17 - f18)));
        float f27 = this.f398429q;
        float f28 = this.f398428p;
        floatBallView.Y0(f28 + (max * (f27 - f28)));
    }
}
