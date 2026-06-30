package ug5;

/* loaded from: classes3.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f427627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f427628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f427629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f427630h;

    public l(ug5.v vVar, float f17, float f18, android.widget.FrameLayout frameLayout, android.graphics.Rect rect) {
        this.f427626d = vVar;
        this.f427627e = f17;
        this.f427628f = f18;
        this.f427629g = frameLayout;
        this.f427630h = rect;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        ug5.v vVar = this.f427626d;
        ug5.g gVar = vVar.f427658a;
        gVar.A++;
        float animatedFraction = gVar.f427587a != ug5.b.f427582e ? animator.getAnimatedFraction() : 1.0f - animator.getAnimatedFraction();
        float f17 = 1.0f - animatedFraction;
        float f18 = (this.f427627e * f17) + animatedFraction;
        float f19 = (this.f427628f * f17) + animatedFraction;
        android.widget.FrameLayout frameLayout = this.f427629g;
        android.graphics.RectF a17 = ug5.v.a(vVar, frameLayout.getWidth(), frameLayout.getHeight(), f18, f19);
        ug5.h hVar = vVar.f427658a.f427592f;
        if (hVar != null) {
            float animatedFraction2 = animator.getAnimatedFraction();
            android.graphics.Rect rect = new android.graphics.Rect();
            a17.roundOut(rect);
            hVar.d(animatedFraction2, rect, this.f427630h, vVar);
        }
        if (frameLayout instanceof ug5.d) {
            float[] fArr = vVar.f427658a.f427612z;
            ((ug5.d) frameLayout).a(a17, fArr[0], fArr[1], fArr[2], fArr[3]);
            frameLayout.invalidate();
        }
        ug5.h hVar2 = vVar.f427658a.f427592f;
        if (hVar2 != null) {
            hVar2.onAnimationUpdate(animator);
        }
    }
}
