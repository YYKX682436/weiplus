package yx0;

/* loaded from: classes5.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467477e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.n3(this.f467477e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467476d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f467477e.f467194u;
            if (r2Var == null) {
                return null;
            }
            yx0.b8 b8Var = this.f467477e;
            this.f467476d = 1;
            if (b8Var.a0(r2Var, "markTemplateFavorite", this) == aVar) {
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
