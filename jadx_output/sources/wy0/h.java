package wy0;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f450614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f450615f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450614e = list;
        this.f450615f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wy0.h(this.f450614e, this.f450615f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wy0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f450613d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            wy0.g gVar = new wy0.g(this.f450614e, this.f450615f, null);
            this.f450613d = 1;
            if (kotlinx.coroutines.l.g(p0Var, gVar, this) == aVar) {
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
