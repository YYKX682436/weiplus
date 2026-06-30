package du0;

/* loaded from: classes5.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.o f243385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f243386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ex0.o oVar, du0.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243385e = oVar;
        this.f243386f = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.m1(this.f243385e, this.f243386f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rv0.n1 n1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243384d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f243384d = 1;
            if (this.f243385e.G(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        du0.p1 p1Var = this.f243386f;
        rv0.n1 n1Var2 = (rv0.n1) ((jz5.n) p1Var.f243416s).getValue();
        if ((n1Var2 != null && n1Var2.X6()) && (n1Var = (rv0.n1) ((jz5.n) p1Var.f243416s).getValue()) != null) {
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(n1Var.r7(), false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
