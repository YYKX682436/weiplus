package yx0;

/* loaded from: classes5.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467298e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.f3(this.f467298e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vt3.r rVar;
        xx0.i iVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467297d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xx0.i iVar2 = this.f467298e.J1;
            if (iVar2 != null && (rVar = iVar2.f457905c) != null && (iVar = this.f467298e.J1) != null) {
                this.f467297d = 1;
                obj = iVar.c(rVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return f0Var;
    }
}
