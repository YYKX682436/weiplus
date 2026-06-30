package je2;

/* loaded from: classes3.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f299254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r45.kv1 kv1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299254e = kv1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new je2.q(this.f299254e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299253d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.u7 u7Var = dk2.u7.f234181a;
            r45.kv1 it = this.f299254e;
            kotlin.jvm.internal.o.f(it, "$it");
            this.f299253d = 1;
            if (u7Var.k(it, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
