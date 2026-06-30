package pz5;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f359192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.coroutines.Continuation continuation, oz5.l lVar, yz5.l lVar2) {
        super(continuation, lVar);
        this.f359193e = lVar2;
        kotlin.jvm.internal.o.e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // qz5.a
    public java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17 = this.f359192d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.f359192d = 2;
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        this.f359192d = 1;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.l lVar = this.f359193e;
        kotlin.jvm.internal.o.e(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        kotlin.jvm.internal.m0.e(lVar, 1);
        return lVar.invoke(this);
    }
}
