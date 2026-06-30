package gx0;

/* loaded from: classes5.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276907d;

    /* renamed from: e, reason: collision with root package name */
    public int f276908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.f f276910g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276911h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(ex0.a0 a0Var, ex0.f fVar, gx0.y3 y3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276909f = a0Var;
        this.f276910g = fVar;
        this.f276911h = y3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.r3(this.f276909f, this.f276910g, this.f276911h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTimeRange mJTimeRange;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276908e;
        gx0.y3 y3Var = this.f276911h;
        ex0.f fVar = this.f276910g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ex0.a0 a0Var = this.f276909f;
            a0Var.I(fVar);
            com.tencent.maas.model.time.MJTimeRange l17 = fVar.l();
            com.tencent.maas.model.time.MJTime c17 = a0Var.f257097g.c();
            fVar.f257139o = true;
            y3Var.o7().o();
            com.tencent.maas.model.time.MJTime endTime = l17.getEndTime();
            kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
            fVar.z(endTime);
            fVar.y(c17);
            gx0.bf z76 = y3Var.z7();
            this.f276907d = l17;
            this.f276908e = 1;
            if (gx0.bf.d7(z76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
            mJTimeRange = l17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mJTimeRange = (com.tencent.maas.model.time.MJTimeRange) this.f276907d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.model.time.MJTime endTime2 = mJTimeRange.getEndTime();
        kotlin.jvm.internal.o.f(endTime2, "getEndTime(...)");
        fVar.y(endTime2);
        com.tencent.maas.model.time.MJTime duration = mJTimeRange.getDuration();
        kotlin.jvm.internal.o.f(duration, "getDuration(...)");
        fVar.z(duration);
        fVar.f257139o = false;
        y3Var.o7().p();
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(y3Var.o7(), false, 1, null);
        return jz5.f0.f302826a;
    }
}
