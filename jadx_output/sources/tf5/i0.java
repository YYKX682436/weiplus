package tf5;

/* loaded from: classes11.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f418995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418995e = mvvmAddressUIFragment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf5.i0(this.f418995e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418994d;
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f418995e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.S;
            tf5.h0 h0Var = new tf5.h0(mvvmAddressUIFragment.z0().f152072v);
            this.f418994d = 1;
            obj = kotlinx.coroutines.flow.l.k(h0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i19 = com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.S;
        ((tf5.l0) ((jz5.n) mvvmAddressUIFragment.f206602o).getValue()).a();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        tf5.e0 e0Var = new tf5.e0(mvvmAddressUIFragment, null);
        this.f418994d = 2;
        if (kotlinx.coroutines.l.g(g3Var, e0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
