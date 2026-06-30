package du3;

/* loaded from: classes3.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(du3.g2 g2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243778d = g2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.z1(this.f243778d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return java.lang.Boolean.valueOf(this.f243778d.B().performHapticFeedback(0, 3));
    }
}
