package tn5;

/* loaded from: classes15.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn5.f f420866d;

    public d(tn5.f fVar) {
        this.f420866d = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        tn5.a aVar;
        sn5.b bVar;
        sn5.b bVar2;
        kotlin.jvm.internal.o.g(animation, "animation");
        if (animation.getDuration() == 0) {
            return;
        }
        tn5.f fVar = this.f420866d;
        fVar.f420872e = null;
        mn5.b bVar3 = fVar.f420870c;
        if (bVar3 == null) {
            kotlin.jvm.internal.o.o("cValues");
            throw null;
        }
        if (bVar3.f330209b == 0 && (bVar = (aVar = fVar.f420869b).f420851b) != (bVar2 = sn5.b.f410157p) && !bVar.f410171g && !bVar.f410170f) {
            aVar.c(bVar2);
            return;
        }
        tn5.a aVar2 = fVar.f420869b;
        sn5.b bVar4 = aVar2.f420851b;
        if (bVar4 != aVar2.f420852c) {
            aVar2.d(bVar4);
        }
    }
}
