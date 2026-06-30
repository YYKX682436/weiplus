package oa;

/* loaded from: classes15.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f343762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f343763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f343764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f343765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oa.h f343766h;

    public f(oa.h hVar, int i17, int i18, int i19, int i27) {
        this.f343766h = hVar;
        this.f343762d = i17;
        this.f343763e = i18;
        this.f343764f = i19;
        this.f343765g = i27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        android.animation.TimeInterpolator timeInterpolator = w9.a.f444034a;
        int i17 = this.f343763e;
        int round = this.f343762d + java.lang.Math.round((i17 - r1) * animatedFraction);
        int i18 = this.f343765g;
        int round2 = this.f343764f + java.lang.Math.round(animatedFraction * (i18 - r2));
        oa.h hVar = this.f343766h;
        if (round == hVar.f343774i && round2 == hVar.f343775m) {
            return;
        }
        hVar.f343774i = round;
        hVar.f343775m = round2;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(hVar);
    }
}
