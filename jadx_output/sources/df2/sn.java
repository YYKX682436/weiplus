package df2;

/* loaded from: classes10.dex */
public final class sn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.un f231351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(df2.un unVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231351e = unVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.sn(this.f231351e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.sn) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231350d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.un unVar = this.f231351e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.v4) unVar.business(mm2.v4.class)).f329477g;
            df2.rn rnVar = new df2.rn(unVar);
            this.f231350d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(rnVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
