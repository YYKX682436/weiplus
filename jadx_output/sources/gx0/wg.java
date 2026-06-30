package gx0;

/* loaded from: classes5.dex */
public final class wg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f277143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(gx0.bh bhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277143e = bhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.wg(this.f277143e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.wg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277142d;
        gx0.bh bhVar = this.f277143e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jx0.h0 h0Var = (jx0.h0) bhVar.L.j();
            if (h0Var != null) {
                this.f277142d = 1;
                if (h0Var.b(this) == aVar) {
                    return aVar;
                }
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
        if (bhVar.V6().f276255v.getValue() == gx0.fd.f276432h) {
            gx0.bf V6 = bhVar.V6();
            this.f277142d = 2;
            if (gx0.bf.t7(V6, false, this, 1, null) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
