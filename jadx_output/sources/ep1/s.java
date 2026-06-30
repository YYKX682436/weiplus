package ep1;

/* loaded from: classes3.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f255660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f255663i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f255664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f255665n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f255666o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f255667p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f255668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f255669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f255670s;

    public s(int i17, android.view.View view, boolean z17, android.view.View view2, android.view.View view3, int i18, float f17, float f18, float f19, float f27, boolean z18, float f28, float f29) {
        this.f255658d = i17;
        this.f255659e = view;
        this.f255660f = z17;
        this.f255661g = view2;
        this.f255662h = view3;
        this.f255663i = i18;
        this.f255664m = f17;
        this.f255665n = f18;
        this.f255666o = f19;
        this.f255667p = f27;
        this.f255668q = z18;
        this.f255669r = f28;
        this.f255670s = f29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        float f17;
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        ep1.u uVar = ep1.u.f255676a;
        android.view.View view = this.f255659e;
        int i17 = this.f255658d;
        if (i17 == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            if (animatedFraction >= 0.9f) {
                f17 = uVar.a().getInterpolation(1.0f - ((animatedFraction - 0.9f) / (1 - 0.9f)));
                if (!this.f255660f) {
                    ((gp1.v) ((jz5.n) ep1.u.f255678c).getValue()).W(1.0f - f17);
                }
            } else {
                f17 = 1.0f;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f255661g;
        if (view2 != null) {
            float f18 = i17 == 1 ? animatedFraction : 1.0f - animatedFraction;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateBgViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateBgViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        int i18 = ep1.u.f255677b;
        float f19 = this.f255663i;
        int i19 = (i18 & 16777215) | (((int) (i17 == 1 ? f19 * animatedFraction : f19 * (1.0f - animatedFraction))) << 24);
        android.view.View view3 = this.f255662h;
        if (view3 != null) {
            view3.setBackgroundColor(i19);
        }
        float f27 = this.f255665n;
        float f28 = this.f255664m;
        android.view.View view4 = this.f255659e;
        view4.setScaleX(((f27 - f28) * animatedFraction) + f28);
        float f29 = this.f255667p;
        float f37 = this.f255666o;
        view4.setScaleY(f37 + ((f29 - f37) * animatedFraction));
        if (this.f255668q) {
            float f38 = this.f255670s;
            float f39 = this.f255669r;
            float max = java.lang.Math.max((view4.getHeight() - (f39 + ((f38 - f39) * animatedFraction))) / 2.0f, 0.0f);
            float intValue = i17 == 1 ? (((java.lang.Number) ((jz5.n) ep1.u.f255679d).getValue()).intValue() / f28) * (1 - animatedFraction) : (((java.lang.Number) ((jz5.n) ep1.u.f255679d).getValue()).intValue() / f27) * animatedFraction;
            view4.setClipToOutline(true);
            view4.setOutlineProvider(new ep1.r(max, intValue));
        }
    }
}
