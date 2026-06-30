package uw2;

/* loaded from: classes2.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431673d;

    public h(yz5.a aVar) {
        this.f431673d = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(it, "it");
        if (!kotlin.jvm.internal.o.b(it.getAnimatedValue(), java.lang.Float.valueOf(0.0f)) || (aVar = this.f431673d) == null) {
            return;
        }
        aVar.invoke();
    }
}
