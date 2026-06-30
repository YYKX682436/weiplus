package zm5;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.g f474188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zm5.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474188d = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zm5.c(this.f474188d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zm5.c cVar = (zm5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zm5.g gVar = this.f474188d;
        gVar.getClass();
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(150L);
        gVar.O6().startAnimation(alphaAnimation);
        gVar.O6().setVisibility(8);
        return jz5.f0.f302826a;
    }
}
