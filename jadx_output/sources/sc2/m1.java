package sc2;

/* loaded from: classes.dex */
public final class m1 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f406069d;

    public m1(yz5.a aVar) {
        this.f406069d = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f406069d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
