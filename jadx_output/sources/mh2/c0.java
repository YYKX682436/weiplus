package mh2;

/* loaded from: classes10.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(mh2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326306e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.c0(this.f326306e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326305d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mh2.k0 k0Var = this.f326306e;
            kotlinx.coroutines.flow.j c17 = k0Var.f326383d.c();
            if (c17 != null) {
                mh2.b0 b0Var = new mh2.b0(k0Var);
                this.f326305d = 1;
                if (c17.a(b0Var, this) == aVar) {
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
