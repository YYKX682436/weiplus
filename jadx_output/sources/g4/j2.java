package g4;

/* loaded from: classes5.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.p2 f268387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.m4 f268388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(g4.p2 p2Var, g4.m4 m4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268387e = p2Var;
        this.f268388f = m4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.j2(this.f268387e, this.f268388f, completion);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.j2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268386d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j g17 = kotlinx.coroutines.flow.l.g(this.f268387e.f268489h.f268633d);
            g4.i2 i2Var = new g4.i2(this);
            this.f268386d = 1;
            if (((kotlinx.coroutines.flow.e) g17).a(i2Var, this) == aVar) {
                return aVar;
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
