package ow0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f349300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f349302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f349303g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView f349304h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gx0.u2 u2Var, double d17, ex0.a0 a0Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f349301e = u2Var;
        this.f349302f = d17;
        this.f349303g = a0Var;
        this.f349304h = captionTimelineView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ow0.e0(this.f349301e, this.f349302f, this.f349303g, this.f349304h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ow0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f349300d;
        gx0.u2 u2Var = this.f349301e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf R7 = u2Var.R7();
            this.f349300d = 1;
            if (R7.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bx0.i timelineLayoutType = this.f349304h.getTimelineLayoutType();
        ex0.a0 a0Var = this.f349303g;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f349302f / a0Var.s(timelineLayoutType));
        kotlin.jvm.internal.o.d(fromSeconds);
        u2Var.b8(fromSeconds);
        u2Var.R7().p7(a0Var.a(fromSeconds), false, 16L);
        return jz5.f0.f302826a;
    }
}
