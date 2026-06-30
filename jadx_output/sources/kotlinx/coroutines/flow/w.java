package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f310431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f310432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f310433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlinx.coroutines.flow.k kVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f310432e = kVar;
        this.f310433f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new kotlinx.coroutines.flow.w(this.f310432e, this.f310433f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((kotlinx.coroutines.flow.w) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310431d;
        kotlin.jvm.internal.h0 h0Var = this.f310433f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.internal.l0 l0Var = v26.k0.f433020a;
            java.lang.Object obj2 = h0Var.f310123d;
            if (obj2 == l0Var) {
                obj2 = null;
            }
            this.f310431d = 1;
            if (this.f310432e.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
