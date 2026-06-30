package uf2;

/* loaded from: classes2.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f427166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f427167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f427168f;

    public b(float f17, float f18, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f427166d = f17;
        this.f427167e = f18;
        this.f427168f = mMPAGView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float f17 = this.f427166d;
        float f18 = this.f427167e;
        this.f427168f.setTranslationY(f18 + ((f17 - f18) * it.getAnimatedFraction()));
    }
}
