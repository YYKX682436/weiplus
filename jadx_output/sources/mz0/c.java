package mz0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f332905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mz0.b2 b2Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332904e = b2Var;
        this.f332905f = m5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.c(this.f332904e, this.f332905f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332903d;
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f332905f;
        mz0.b2 b2Var = this.f332904e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.p pVar = b2Var.o7().f70093k;
            this.f332903d = 1;
            obj = pVar.invoke(m5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            b2Var.o7().e(((com.tencent.mm.mj_template.sns.compose.widget.k5) m5Var).f70077a);
        }
        return jz5.f0.f302826a;
    }
}
