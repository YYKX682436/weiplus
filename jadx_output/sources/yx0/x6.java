package yx0;

/* loaded from: classes5.dex */
public final class x6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467767e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.x6(this.f467767e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.x6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467766d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f467767e.f467194u;
            if (r2Var == null) {
                return null;
            }
            yx0.b8 b8Var = this.f467767e;
            this.f467766d = 1;
            if (b8Var.a0(r2Var, "switchMakeup", this) == aVar) {
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
