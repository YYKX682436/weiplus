package p1;

/* loaded from: classes10.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350875d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.q0 f350877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f350878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p1.q0 q0Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350877f = q0Var;
        this.f350878g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p1.r0 r0Var = new p1.r0(this.f350877f, this.f350878g, continuation);
        r0Var.f350876e = obj;
        return r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((p1.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f350875d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f350876e;
            p1.q0 q0Var = this.f350877f;
            q0Var.getClass();
            kotlin.jvm.internal.o.g(y0Var, "<set-?>");
            q0Var.f350873p = y0Var;
            this.f350875d = 1;
            if (this.f350878g.invoke(q0Var, this) == aVar) {
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
