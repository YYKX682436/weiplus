package df2;

/* loaded from: classes3.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231328e = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.sb(this.f231328e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.sb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231327d;
        df2.zb zbVar = this.f231328e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.ff1 ff1Var = zbVar.f231944r;
            int integer = ff1Var != null ? ff1Var.getInteger(5) : 12;
            this.f231327d = 1;
            if (kotlinx.coroutines.k1.b(integer * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        df2.zb.w7(zbVar, false, null, 2, null);
        zbVar.q7(7);
        zbVar.s7(r45.n72.kActionType_AiassistantClose, 1, "");
        return jz5.f0.f302826a;
    }
}
