package pz5;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f359197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f359198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f359199f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.coroutines.Continuation continuation, oz5.l lVar, yz5.p pVar, java.lang.Object obj) {
        super(continuation, lVar);
        this.f359198e = pVar;
        this.f359199f = obj;
        kotlin.jvm.internal.o.e(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // qz5.a
    public java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17 = this.f359197d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.f359197d = 2;
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        this.f359197d = 1;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.p pVar = this.f359198e;
        kotlin.jvm.internal.o.e(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        kotlin.jvm.internal.m0.e(pVar, 2);
        return pVar.invoke(this.f359199f, this);
    }
}
