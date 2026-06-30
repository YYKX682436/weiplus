package pn4;

/* loaded from: classes4.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f357258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.c2 f357259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.t1 f357260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(kotlinx.coroutines.flow.j jVar, pn4.c2 c2Var, pn4.t1 t1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357258e = jVar;
        this.f357259f = c2Var;
        this.f357260g = t1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pn4.y1(this.f357258e, this.f357259f, this.f357260g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357257d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pn4.x1 x1Var = new pn4.x1(this.f357259f, this.f357260g);
            this.f357257d = 1;
            if (this.f357258e.a(x1Var, this) == aVar) {
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
