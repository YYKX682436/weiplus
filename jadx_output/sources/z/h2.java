package z;

/* loaded from: classes14.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468685d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(z.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468687f = l2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z.h2 h2Var = new z.h2(this.f468687f, continuation);
        h2Var.f468686e = obj;
        return h2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        z.g2 g2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468685d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f468686e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f468686e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            g2Var = new z.g2(this.f468687f, z.z1.e(y0Var.getF11582e()));
            this.f468686e = y0Var;
            this.f468685d = 1;
        } while (n0.s2.b(g2Var, this) != aVar);
        return aVar;
    }
}
