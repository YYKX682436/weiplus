package xn2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455528d;

    /* renamed from: e, reason: collision with root package name */
    public int f455529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f455530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455531g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlin.jvm.internal.c0 c0Var, xn2.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455530f = c0Var;
        this.f455531g = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xn2.m0(this.f455530f, this.f455531g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xn2.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f455529e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.c0 c0Var2 = this.f455530f;
            this.f455528d = c0Var2;
            this.f455529e = 1;
            java.lang.Object c17 = xn2.p0.c(this.f455531g, this);
            if (c17 == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            obj = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f455528d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c0Var.f310112d = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f302826a;
    }
}
