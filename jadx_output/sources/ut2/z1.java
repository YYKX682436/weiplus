package ut2;

/* loaded from: classes3.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ut2.s3 s3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431171e = s3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.z1(this.f431171e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f431170d;
        ut2.s3 s3Var = this.f431171e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f431170d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                s3Var.v().setVisibility(8);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CART_EDU_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        s3Var.v().setVisibility(0);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveCartEduAnimView v17 = s3Var.v();
        this.f431170d = 2;
        if (v17.b(this) == aVar) {
            return aVar;
        }
        s3Var.v().setVisibility(8);
        return jz5.f0.f302826a;
    }
}
