package pk3;

/* loaded from: classes8.dex */
public final class c extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.e f356439d;

    public c(pk3.e eVar) {
        this.f356439d = eVar;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f356439d.a();
    }
}
