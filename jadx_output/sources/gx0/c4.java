package gx0;

/* loaded from: classes5.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.f4 f276279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(gx0.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276279e = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.c4(this.f276279e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276278d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        gx0.f4 f4Var = this.f276279e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f276278d = 1;
            java.lang.Object d76 = gx0.bf.d7((gx0.bf) ((jz5.n) f4Var.E).getValue(), null, null, false, this, 7, null);
            if (d76 != aVar) {
                d76 = f0Var;
            }
            if (d76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((du0.o) ((jz5.n) f4Var.f277086m).getValue()).U6(false);
        return f0Var;
    }
}
