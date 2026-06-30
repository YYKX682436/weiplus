package df2;

/* loaded from: classes2.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.e6 f230836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(df2.e6 e6Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230836e = e6Var;
        this.f230837f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.n6(this.f230836e, this.f230837f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.n6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230835d;
        df2.e6 e6Var = this.f230836e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e6Var.f230037d.setText(this.f230837f);
            this.f230835d = 1;
            if (kotlinx.coroutines.k1.b(833L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                animate = e6Var.f230037d.animate();
                if (animate != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(500L)) != null) {
                    duration.start();
                }
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        e6Var.f230037d.setVisibility(0);
        e6Var.f230037d.setAlpha(1.0f);
        this.f230835d = 2;
        if (kotlinx.coroutines.k1.b(1292L, this) == aVar) {
            return aVar;
        }
        animate = e6Var.f230037d.animate();
        if (animate != null) {
            duration.start();
        }
        return jz5.f0.f302826a;
    }
}
