package rv0;

/* loaded from: classes5.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(rv0.n1 n1Var, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400275e = n1Var;
        this.f400276f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.u3(this.f400275e, this.f400276f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400274d;
        rv0.n1 n1Var = this.f400275e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f400274d = 1;
            if (gx0.bf.d7(p76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ex0.r n17 = this.f400276f.n();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (n17 == null) {
            return f0Var;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r76 = n1Var.r7();
        com.tencent.maas.base.MJID segmentID = n17.f257168b;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        bx0.h hVar = r76.timelineLayoutCalc;
        android.graphics.Rect b17 = hVar != null ? hVar.b(segmentID, false) : null;
        if (b17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return f0Var;
        }
        double scrolledX = n1Var.r7().getScrolledX() + n1Var.r7().getInsets().f247044a;
        double d17 = b17.right;
        com.tencent.maas.moviecomposing.segments.Segment segment = n17.f257167a;
        com.tencent.maas.model.time.MJTime A = d17 >= scrolledX ? segment.A() : segment.B().getEndTime().sub(new com.tencent.maas.model.time.MJTime(1L));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r77 = n1Var.r7();
        kotlin.jvm.internal.o.d(A);
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(r77, A, false, 2, null);
        gx0.bf.q7(n1Var.p7(), A, true, 0L, 4, null);
        return f0Var;
    }
}
