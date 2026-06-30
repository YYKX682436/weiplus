package mh2;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(mh2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326319e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.e0(this.f326319e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326318d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mh2.k0 k0Var = this.f326319e;
            kotlinx.coroutines.flow.j e17 = k0Var.f326383d.e();
            if (e17 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.flow.j n17 = kotlinx.coroutines.flow.l.n(e17, kotlinx.coroutines.internal.b0.f310484a);
                if (n17 != null) {
                    mh2.d0 d0Var = new mh2.d0(k0Var);
                    this.f326318d = 1;
                    if (n17.a(d0Var, this) == aVar) {
                        return aVar;
                    }
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
