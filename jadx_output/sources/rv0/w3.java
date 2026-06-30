package rv0;

/* loaded from: classes5.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400311f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(rv0.n1 n1Var, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400310e = n1Var;
        this.f400311f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.w3(this.f400310e, this.f400311f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.w3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400309d;
        rv0.n1 n1Var = this.f400310e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            n1Var.v7(ZeroTime);
            ex0.a0 a0Var = this.f400311f;
            ex0.i0.m(a0Var);
            a0Var.g();
            gx0.bf p76 = n1Var.p7();
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            this.f400309d = 1;
            if (gx0.bf.d7(p76, null, ZeroTime, false, this, 5, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        n1Var.r7().a();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r76 = n1Var.r7();
        com.tencent.maas.model.time.MJTime ZeroTime2 = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime2, "ZeroTime");
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(r76, ZeroTime2, false, 2, null);
        n1Var.w7();
        return jz5.f0.f302826a;
    }
}
