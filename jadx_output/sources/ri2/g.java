package ri2;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ri2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396052e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ri2.g(this.f396052e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ri2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396051d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f396051d = 1;
            if (kotlinx.coroutines.k1.b(2500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ri2.j jVar = this.f396052e;
        android.view.View view = jVar.f396066i;
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(500L)) != null && (listener = duration.setListener(new ri2.f(jVar))) != null) {
            listener.start();
        }
        return jz5.f0.f302826a;
    }
}
