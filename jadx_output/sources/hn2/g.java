package hn2;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.h f282526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f282527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hn2.h hVar, yz5.p pVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282526e = hVar;
        this.f282527f = pVar;
        this.f282528g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hn2.g(this.f282526e, this.f282527f, this.f282528g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hn2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f282525d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hn2.h hVar = this.f282526e;
            kotlinx.coroutines.flow.f3 f3Var = hVar.f282529a;
            if (f3Var == null) {
                return jz5.f0.f302826a;
            }
            hn2.f fVar = new hn2.f(hVar, this.f282527f, this.f282528g);
            this.f282525d = 1;
            if (f3Var.a(fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
