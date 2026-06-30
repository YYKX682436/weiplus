package df2;

/* loaded from: classes3.dex */
public final class mc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.tc f230770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f230771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(df2.tc tcVar, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230770e = tcVar;
        this.f230771f = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.mc(this.f230770e, this.f230771f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.mc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230769d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.tc tcVar = this.f230770e;
            kotlinx.coroutines.flow.i2 i2Var = ((mm2.x) tcVar.business(mm2.x.class)).f329520f;
            df2.lc lcVar = new df2.lc(tcVar, this.f230771f);
            this.f230769d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, lcVar, this) == aVar) {
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
