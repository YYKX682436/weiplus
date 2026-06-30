package eh5;

/* loaded from: classes10.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252974d;

    public v(eh5.y yVar) {
        this.f252974d = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f252974d.f252982n;
        if (roundCornerFrameLayout != null) {
            roundCornerFrameLayout.invalidateOutline();
        } else {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
    }
}
