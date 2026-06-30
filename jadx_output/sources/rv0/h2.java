package rv0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400029d;

    /* renamed from: e, reason: collision with root package name */
    public int f400030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400031f = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.h2(this.f400031f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.h2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ex0.a0 s76;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400030e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = false;
        rv0.n1 n1Var = this.f400031f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s76 = n1Var.s7();
            if (s76 == null) {
                wt0.a.a("No focused segment!!!!", n1Var.getMainScope());
                return f0Var;
            }
            gx0.bf p76 = n1Var.p7();
            this.f400029d = s76;
            this.f400030e = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            s76 = (ex0.a0) this.f400029d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ex0.r n17 = s76.n();
        if (n17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.w("TimelineViewModel", "toggleFocusedSegmentContentRotationMode: focusedSegmentVM == null");
        } else {
            com.tencent.maas.moviecomposing.segments.Segment segment = n17.f257167a;
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment == null) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mars.xlog.Log.w("TimelineViewModel", "toggleFocusedSegmentContentRotationMode: clipSegment == null");
            } else {
                sg.b bVar = sg.b.None;
                com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                int ordinal = (D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.a1(clipSegment, D) : bVar).ordinal();
                if (ordinal == 0) {
                    bVar = sg.b.CCW90;
                } else if (ordinal == 1) {
                    bVar = sg.b.CW180;
                } else if (ordinal == 2) {
                    bVar = sg.b.CW90;
                } else if (ordinal != 3) {
                    throw new jz5.j();
                }
                com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
                if (D2 != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.P0(clipSegment, bVar, D2);
                }
                java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224508d);
                kotlin.jvm.internal.o.f(of6, "of(...)");
                s76.J(of6, null);
                z17 = true;
            }
        }
        if (z17) {
            yy0.m7 m7Var = (yy0.m7) n1Var.R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.x3(m7Var, null), 3, null);
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.lmf);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
            gx0.bf p77 = n1Var.p7();
            this.f400029d = null;
            this.f400030e = 2;
            if (gx0.bf.d7(p77, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
