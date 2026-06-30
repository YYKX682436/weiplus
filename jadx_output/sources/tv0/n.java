package tv0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f422221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f422222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f422223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView f422224h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tv0.o f422225i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f422226m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tv0.j0 j0Var, double d17, ex0.a0 a0Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView, tv0.o oVar, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422221e = j0Var;
        this.f422222f = d17;
        this.f422223g = a0Var;
        this.f422224h = cropMaterialTimelineView;
        this.f422225i = oVar;
        this.f422226m = clipSegment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tv0.n(this.f422221e, this.f422222f, this.f422223g, this.f422224h, this.f422225i, this.f422226m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422220d;
        tv0.j0 j0Var = this.f422221e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = j0Var.p7();
            this.f422220d = 1;
            if (p76.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f422222f / this.f422223g.s(this.f422224h.getTimelineLayoutType()));
        kotlin.jvm.internal.o.f(fromSeconds, "fromSeconds(...)");
        tv0.o oVar = this.f422225i;
        com.tencent.maas.model.time.MJTime mJTime = oVar.f422227a;
        kotlin.jvm.internal.o.f(mJTime, "access$getMinTargetTime$p(...)");
        com.tencent.maas.model.time.MJTime a17 = ou0.f.a(fromSeconds, mJTime);
        com.tencent.maas.model.time.MJTime mJTime2 = oVar.f422228b;
        kotlin.jvm.internal.o.f(mJTime2, "access$getMaxTargetTime$p(...)");
        com.tencent.maas.model.time.MJTime b17 = ou0.f.b(a17, mJTime2);
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f422226m;
        com.tencent.maas.model.time.MJTime add = clipSegment.A().add(b17);
        kotlin.jvm.internal.o.d(add);
        com.tencent.maas.model.time.MJTime mJTime3 = oVar.f422229c;
        kotlin.jvm.internal.o.f(mJTime3, "access$getMaxPlaybackTimeInTimeline$p(...)");
        j0Var.f422213z = ou0.f.b(add, mJTime3);
        ((rv0.n1) ((jz5.n) j0Var.f422208u).getValue()).v7(j0Var.f422213z);
        java.lang.Double d17 = new java.lang.Double(clipSegment.v1());
        double doubleValue = d17.doubleValue();
        if (!((java.lang.Double.isInfinite(doubleValue) || java.lang.Double.isNaN(doubleValue)) ? false : true)) {
            d17 = null;
        }
        com.tencent.maas.model.time.MJTime add2 = b17.add(clipSegment.x1().getStartTime().multi(1 / (d17 != null ? d17.doubleValue() : 1.0d)));
        kotlin.jvm.internal.o.f(add2, "add(...)");
        if (j0Var.p7().L) {
            j0Var.p7().b7(add2, false);
        }
        tv0.d dVar = (tv0.d) j0Var.f69240i;
        if (dVar != null) {
            dVar.K(b17);
        }
        return jz5.f0.f302826a;
    }
}
