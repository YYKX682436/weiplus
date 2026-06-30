package vf2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vf2.q f436347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vf2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436347e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vf2.l(this.f436347e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vf2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436346d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vf2.q qVar = this.f436347e;
            r45.n73 n73Var = qVar.f436354m;
            if (n73Var != null) {
                this.f436346d = 1;
                if (vf2.q.a7(qVar, n73Var, this) == aVar) {
                    return aVar;
                }
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
