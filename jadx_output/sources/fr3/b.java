package fr3;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr3.f f265785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f265786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fr3.f fVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265785e = fVar;
        this.f265786f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fr3.b(this.f265785e, this.f265786f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265784d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j2 j2Var = this.f265785e.f265792d;
            fr3.j jVar = new fr3.j(this.f265786f);
            this.f265784d = 1;
            ((kotlinx.coroutines.flow.h3) j2Var).emit(jVar, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
