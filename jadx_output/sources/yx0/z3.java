package yx0;

/* loaded from: classes.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f467807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(yx0.b8 b8Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467806e = b8Var;
        this.f467807f = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.z3(this.f467806e, this.f467807f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467805d;
        yx0.b8 b8Var = this.f467806e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tx0.k kVar = b8Var.S1;
            this.f467805d = 1;
            c17 = kVar.c(this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m527isFailureimpl(c17)) {
            c17 = null;
        }
        kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.l5(b8Var, (com.tencent.mm.modelgeo.Addr) c17, null), 3, null);
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        yx0.y3 y3Var = new yx0.y3(this.f467807f, null);
        this.f467805d = 2;
        if (kotlinx.coroutines.l.g(g3Var, y3Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
