package gx0;

/* loaded from: classes5.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276284e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.c7(this.f276284e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.c7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276283d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf V6 = this.f276284e.V6();
            this.f276283d = 1;
            if (gx0.bf.t7(V6, false, this, 1, null) == aVar) {
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
