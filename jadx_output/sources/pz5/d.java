package pz5;

/* loaded from: classes14.dex */
public final class d extends qz5.j {

    /* renamed from: d, reason: collision with root package name */
    public int f359194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f359195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f359196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.coroutines.Continuation continuation, yz5.p pVar, java.lang.Object obj) {
        super(continuation);
        this.f359195e = pVar;
        this.f359196f = obj;
        kotlin.jvm.internal.o.e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // qz5.a
    public java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17 = this.f359194d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.f359194d = 2;
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        this.f359194d = 1;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.p pVar = this.f359195e;
        kotlin.jvm.internal.o.e(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        kotlin.jvm.internal.m0.e(pVar, 2);
        return pVar.invoke(this.f359196f, this);
    }
}
