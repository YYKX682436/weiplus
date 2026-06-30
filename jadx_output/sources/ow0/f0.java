package ow0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f349306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f349307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView f349308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(double d17, ex0.a0 a0Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView, gx0.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f349306d = d17;
        this.f349307e = a0Var;
        this.f349308f = captionTimelineView;
        this.f349309g = u2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ow0.f0(this.f349306d, this.f349307e, this.f349308f, this.f349309g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ow0.f0 f0Var = (ow0.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f349306d / this.f349307e.s(this.f349308f.getTimelineLayoutType()));
        gx0.bf R7 = this.f349309g.R7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(R7, fromSeconds, true, 0L, 4, null);
        return jz5.f0.f302826a;
    }
}
