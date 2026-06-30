package gx0;

/* loaded from: classes5.dex */
public final class f4 extends gx0.w {
    public final jz5.g D;
    public final jz5.g E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.D = jz5.h.b(new gx0.e4(this));
        this.E = jz5.h.b(new gx0.d4(this));
    }

    @Override // gx0.w
    public void A7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.maas.moviecomposing.segments.Segment b76 = I7().b7(segmentID);
        if (b76 == null) {
            return;
        }
        gx0.bf bfVar = (gx0.bf) ((jz5.n) this.E).getValue();
        com.tencent.maas.model.time.MJTimeRange B = b76.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(bfVar, B);
    }

    @Override // gx0.w
    public boolean D7(com.tencent.maas.base.MJID segmentID, boolean z17, zw0.b entrance, du0.g parentUIC) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        kotlin.jvm.internal.o.g(parentUIC, "parentUIC");
        jz5.g gVar = this.B;
        if (((pv0.y) ((jz5.n) gVar).getValue()).X6()) {
            return false;
        }
        com.tencent.maas.moviecomposing.segments.Segment segment = I7().b7(segmentID);
        if (!(segment instanceof ug.n)) {
            return false;
        }
        kotlin.jvm.internal.o.g(segment, "segment");
        ix0.g gVar2 = new ix0.g(segment, (pv0.y) ((jz5.n) gVar).getValue(), I7(), (gx0.bf) ((jz5.n) this.E).getValue(), getMainScope());
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f492515mc0);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        pv0.j jVar = pv0.j.f358533e;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_TIMBRE_ARGS", new pv0.h(segment, gVar2, r17, jVar, z17, false, true));
        if (parentUIC instanceof gx0.w8) {
            C7(entrance);
            Z6().k7((pv0.y) ((jz5.n) gVar).getValue(), hashMap, entrance, this.C);
        } else {
            if (!(parentUIC instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k)) {
                return false;
            }
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7((com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k) parentUIC, (pv0.y) ((jz5.n) gVar).getValue(), hashMap, null, null, null, 28, null);
        }
        return true;
    }

    @Override // gx0.w
    public boolean E7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.maas.moviecomposing.segments.Segment b76 = I7().b7(segmentID);
        if (b76 == null) {
            return false;
        }
        ug.m C = b76.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f277091r).getValue();
        com.tencent.maas.base.MJID mjid = b76.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        boolean h76 = gx0.hf.h7(hfVar, mjid, false, false, 6, null);
        F7(C);
        return h76;
    }

    @Override // gx0.w
    public void G7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        I7().r7(snapshotDesc, null);
    }

    public final gx0.kh I7() {
        return (gx0.kh) ((jz5.n) this.D).getValue();
    }

    @Override // gx0.w
    public ex0.b W6() {
        com.tencent.maas.model.time.MJTime ZeroTime = (ou0.g) ((gx0.bf) ((jz5.n) this.E).getValue()).A.getValue();
        if (ZeroTime == null) {
            ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        }
        ex0.b e76 = I7().e7(ZeroTime);
        if (e76 != null) {
            if (e76.A(e76.D(), ZeroTime) != null) {
                return e76;
            }
        }
        return null;
    }

    @Override // gx0.w
    public ex0.c X6() {
        com.tencent.maas.model.time.MJTime ZeroTime = (ou0.g) ((gx0.bf) ((jz5.n) this.E).getValue()).A.getValue();
        if (ZeroTime == null) {
            ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        }
        return I7().g7(ZeroTime);
    }

    @Override // gx0.w
    public boolean e7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.maas.moviecomposing.segments.Segment b76 = I7().b7(segmentID);
        if (b76 == null || !(b76 instanceof com.tencent.maas.moviecomposing.segments.MusicSegment)) {
            return false;
        }
        com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = (com.tencent.maas.moviecomposing.segments.MusicSegment) b76;
        com.tencent.maas.moviecomposing.Timeline D = musicSegment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.MusicSegment.F1(musicSegment, D);
        }
        ug.m C = musicSegment.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        F7(C);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.c4(this, null), 3, null);
        return true;
    }

    @Override // gx0.w
    public uw0.o i7() {
        return (uw0.o) T6(gx0.h0.class);
    }

    @Override // gx0.w
    public uw0.t0 k7() {
        return (uw0.t0) T6(gx0.u0.class);
    }

    @Override // gx0.w
    public uw0.e1 l7() {
        return (uw0.e1) T6(gx0.h1.class);
    }

    @Override // gx0.w
    public hw0.n m7() {
        return (hw0.n) T6(gx0.r1.class);
    }

    @Override // gx0.w
    public ow0.a0 n7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // gx0.w
    public jv0.g o7() {
        return (jv0.g) T6(gx0.y3.class);
    }

    @Override // gx0.w
    public kv0.b p7() {
        return (kv0.b) T6(gx0.b4.class);
    }

    @Override // gx0.w
    public hw0.z q7() {
        return (hw0.z) T6(gx0.m4.class);
    }

    @Override // gx0.w
    public du0.o r7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // gx0.w
    public yt0.c s7() {
        return (yt0.c) T6(gx0.w8.class);
    }

    @Override // gx0.w
    public bw0.l t7() {
        return (bw0.l) T6(gx0.c9.class);
    }

    @Override // gx0.w
    public ew0.l u7() {
        return (ew0.l) T6(gx0.w9.class);
    }

    @Override // gx0.w
    public cw0.l0 v7() {
        return (cw0.l0) T6(gx0.ac.class);
    }

    @Override // gx0.w
    public gx0.hf w7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // gx0.w
    public pv0.y x7() {
        return (pv0.y) T6(gx0.sc.class);
    }

    @Override // gx0.w
    public lw0.l y7() {
        return (lw0.l) T6(gx0.dd.class);
    }
}
