package xc5;

/* loaded from: classes12.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f453404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xc5.h0 h0Var, mf3.k kVar, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453402e = h0Var;
        this.f453403f = kVar;
        this.f453404g = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.c0(this.f453402e, this.f453403f, this.f453404g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453401d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            xc5.b0 b0Var = new xc5.b0(this.f453402e, this.f453403f, this.f453404g, null);
            this.f453401d = 1;
            if (kotlinx.coroutines.l.g(g3Var, b0Var, this) == aVar) {
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
