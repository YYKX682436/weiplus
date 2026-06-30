package rv0;

/* loaded from: classes5.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(rv0.n1 n1Var, ex0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400219e = n1Var;
        this.f400220f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.r2(this.f400219e, this.f400220f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400218d;
        ex0.r rVar = this.f400220f;
        rv0.n1 n1Var = this.f400219e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n1Var.p7().o7(rVar.l(), true);
            gx0.bf p76 = n1Var.p7();
            com.tencent.maas.model.time.MJTime k17 = rVar.k();
            this.f400218d = 1;
            if (gx0.bf.d7(p76, null, k17, false, this, 5, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(n1Var.r7(), rVar.k(), false, 2, null);
        return jz5.f0.f302826a;
    }
}
