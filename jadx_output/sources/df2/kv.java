package df2;

/* loaded from: classes3.dex */
public final class kv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lv f230602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(df2.lv lvVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230602e = lvVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.kv(this.f230602e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((df2.kv) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230601d;
        df2.lv lvVar = this.f230602e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (((mm2.c1) lvVar.business(mm2.c1.class)).a8()) {
                boolean z17 = ((je2.n) lvVar.business(je2.n.class)).P6() != null;
                this.f230601d = 1;
                if (df2.lv.Z6(lvVar, "onViewMount_liveStarted", z17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.i2 i2Var = ((je2.n) lvVar.business(je2.n.class)).f299250n;
        df2.jv jvVar = new df2.jv(lvVar);
        this.f230601d = 2;
        kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
        q2Var.getClass();
        if (kotlinx.coroutines.flow.q2.l(q2Var, jvVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
