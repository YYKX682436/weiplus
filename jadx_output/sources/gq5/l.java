package gq5;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq5.o f274643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274643e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gq5.l(this.f274643e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f274642d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f274642d = 1;
            if (gq5.o.b7(this.f274643e, this) == aVar) {
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
