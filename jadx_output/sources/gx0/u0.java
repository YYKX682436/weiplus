package gx0;

/* loaded from: classes5.dex */
public final class u0 extends uw0.t0 {
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f277011J;
    public final jz5.g K;
    public final jz5.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.G = jz5.h.b(new gx0.m0(this));
        this.H = jz5.h.b(new gx0.s0(this));
        this.I = jz5.h.b(new gx0.r0(this));
        this.f277011J = jz5.h.b(new gx0.n0(this));
        this.K = jz5.h.b(new gx0.o0(this));
        this.L = jz5.h.b(new gx0.j0(this));
    }

    @Override // uw0.t0
    public java.lang.Object A7(kotlin.coroutines.Continuation continuation) {
        java.lang.Object s76 = Z7().s7(continuation);
        return s76 == pz5.a.f359186d ? s76 : jz5.f0.f302826a;
    }

    @Override // uw0.t0
    public void B7(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        gx0.w.V6((gx0.f4) ((jz5.n) this.L).getValue(), null, segment, new gx0.i0(this), 1, null);
    }

    @Override // uw0.t0
    public void C7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        a8().r7(snapshotDesc, (com.tencent.maas.model.time.MJTime) Z7().A.getValue());
    }

    @Override // uw0.t0
    public java.util.List D7() {
        java.util.List<com.tencent.maas.moviecomposing.segments.ClipSegment> c76 = a8().c7();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c76, 10));
        for (com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment : c76) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
            arrayList.add(D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.U0(clipSegment, D) : null);
        }
        return arrayList;
    }

    @Override // uw0.t0
    public java.lang.String E7() {
        com.tencent.maas.moviecomposing.Storyline storyline;
        com.tencent.maas.moviecomposing.segments.MusicSegment m17;
        com.tencent.maas.model.MJMusicInfo N1;
        com.tencent.maas.moviecomposing.Timeline o76 = a8().o7();
        if (o76 == null || (storyline = o76.f48414a) == null || (m17 = storyline.m()) == null || (N1 = m17.N1()) == null) {
            return null;
        }
        return N1.getMusicID();
    }

    @Override // uw0.t0
    public com.tencent.maas.model.time.MJTime F7() {
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment J7 = J7();
        if (J7 == null) {
            return Z7().i7();
        }
        gx0.bf Z7 = Z7();
        com.tencent.maas.model.time.MJTimeRange B = J7.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        return ou0.d.b(Z7, B);
    }

    @Override // uw0.t0
    public com.tencent.maas.moviecomposing.segments.MovieTitleSegment J7() {
        return a8().l7();
    }

    @Override // uw0.t0
    public ex0.l K7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        gx0.kh a86 = a8();
        a86.getClass();
        ex0.a0 a0Var = a86.f276642r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f257097g.g(segmentID);
        ex0.l lVar = g17 instanceof ex0.l ? (ex0.l) g17 : null;
        if (lVar != null) {
            return lVar;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    @Override // uw0.t0
    public boolean L7() {
        return a8().q7();
    }

    @Override // uw0.t0
    public void M7(uw0.x panel) {
        androidx.lifecycle.j0 j0Var;
        kotlin.jvm.internal.o.g(panel, "panel");
        super.M7(panel);
        ex0.a0 a0Var = a8().f276642r;
        if (a0Var != null && (j0Var = a0Var.f257115y) != null) {
            j0Var.observe(W6(), new gx0.k0(this));
        }
        ((gx0.gf) ((jz5.n) this.K).getValue()).f276473f.observe(W6(), new gx0.l0(this));
    }

    @Override // uw0.t0
    public ow0.a0 N7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // uw0.t0
    public du0.o O7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // uw0.t0
    public gx0.hf P7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // uw0.t0
    public by0.n Q7() {
        return new by0.n(Z7());
    }

    @Override // uw0.t0
    public void R7(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment) {
        com.tencent.maas.model.time.MJTime mJTime;
        if (movieTitleSegment != null) {
            mJTime = !movieTitleSegment.B().containsTime(Z7().h7()) ? movieTitleSegment.A() : com.tencent.maas.model.time.MJTime.InvalidTime;
        } else {
            mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        com.tencent.maas.model.time.MJTime mJTime2 = mJTime;
        if (mJTime2.isNumeric()) {
            gx0.bf.q7(Z7(), mJTime2, true, 0L, 4, null);
        }
    }

    @Override // uw0.t0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: S7, reason: merged with bridge method [inline-methods] */
    public void a7(uw0.x panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.a7(panel);
        gx0.bh bhVar = (gx0.bh) ((jz5.n) this.H).getValue();
        gx0.q0 q0Var = new gx0.q0(this);
        bhVar.getClass();
        bhVar.L.addFirst(q0Var);
    }

    @Override // uw0.t0
    public java.lang.Object T7(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, kotlin.coroutines.Continuation continuation) {
        gx0.bf Z7 = Z7();
        com.tencent.maas.model.time.MJTime A = movieTitleSegment.A();
        kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
        java.lang.Object r76 = gx0.bf.r7(Z7, false, A, 1, false, movieTitleSegment.B(), continuation, 9, null);
        return r76 == pz5.a.f359186d ? r76 : jz5.f0.f302826a;
    }

    @Override // uw0.t0
    public boolean Y7(com.tencent.maas.base.MJID segmentID, java.lang.String title) {
        ex0.l K7;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(title, "title");
        if (!super.Y7(segmentID, title) || Z7().k7() == null || (K7 = K7(segmentID)) == null) {
            return false;
        }
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment = K7.f257146p;
        movieTitleSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = movieTitleSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.MovieTitleSegment.I0(movieTitleSegment, title, D);
        }
        bool.booleanValue();
        gx0.bf Z7 = Z7();
        com.tencent.maas.model.time.MJTimeRange B = K7.f257167a.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(Z7, B);
        ow0.a0 I7 = I7();
        I7.getClass();
        ow0.g gVar = (ow0.g) I7.f69240i;
        if (gVar != null) {
            gVar.setTitle(title);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.t0(this, null), 3, null);
        return true;
    }

    public final gx0.bf Z7() {
        return (gx0.bf) ((jz5.n) this.f277011J).getValue();
    }

    public final gx0.kh a8() {
        return (gx0.kh) ((jz5.n) this.I).getValue();
    }

    @Override // uw0.t0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        super.e7();
        ((gx0.bh) ((jz5.n) this.H).getValue()).L.p();
    }

    @Override // uw0.t0
    public com.tencent.maas.base.MJID y7(java.lang.String materialID, com.tencent.maas.model.time.MJTimeRange timeRange) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        gx0.kh a86 = a8();
        a86.getClass();
        ex0.a0 a0Var = a86.f276642r;
        if (a0Var == null) {
            return null;
        }
        com.tencent.maas.base.MJID f17 = a0Var.f257092b.f(materialID, timeRange.getStartTime(), timeRange.getDuration(), true);
        if (f17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            f17 = null;
        }
        if (f17 == null) {
            return null;
        }
        a0Var.J(cx0.d.f224510f.a(cx0.d.f224509e), null);
        return f17;
    }

    @Override // uw0.t0
    public void z7(ex0.l movieTitleVM) {
        kotlin.jvm.internal.o.g(movieTitleVM, "movieTitleVM");
        ou0.e0.a(movieTitleVM, Z7(), a8(), ((gx0.w8) ((jz5.n) this.G).getValue()).C7());
    }
}
