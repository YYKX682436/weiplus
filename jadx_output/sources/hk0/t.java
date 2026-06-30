package hk0;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk0.v f281805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk0.b1 f281806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hk0.v vVar, hk0.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281805d = vVar;
        this.f281806e = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hk0.t(this.f281805d, this.f281806e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hk0.t tVar = (hk0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hk0.v vVar = this.f281805d;
        vVar.f281830d = false;
        android.animation.ValueAnimator valueAnimator = vVar.f281829c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        vVar.f281829c = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        android.animation.ValueAnimator valueAnimator2 = vVar.f281829c;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new hk0.r(this.f281806e));
        }
        android.animation.ValueAnimator valueAnimator3 = vVar.f281829c;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new hk0.s());
        }
        android.animation.ValueAnimator valueAnimator4 = vVar.f281829c;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        android.animation.ValueAnimator valueAnimator5 = vVar.f281829c;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        return jz5.f0.f302826a;
    }
}
