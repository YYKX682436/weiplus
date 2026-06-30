package gx0;

/* loaded from: classes5.dex */
public final class w9 extends ew0.l {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f277126z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277126z = jz5.h.b(new gx0.u9(this));
        this.A = jz5.h.b(new gx0.s9(this));
        this.B = jz5.h.b(new gx0.t9(this));
    }

    @Override // ew0.l
    public void A7(ew0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.A7(panel);
        ((gx0.gf) ((jz5.n) this.B).getValue()).f276473f.observe(W6(), new gx0.q9(this));
    }

    @Override // ew0.l
    public du0.o B7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // ew0.l
    public cw0.l0 C7() {
        return (cw0.l0) T6(gx0.ac.class);
    }

    @Override // ew0.l
    public gx0.hf D7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // ew0.l
    public void E7(ex0.q narrationVM, com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment) {
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        kotlin.jvm.internal.o.g(narrationSegment, "narrationSegment");
        gx0.kh khVar = (gx0.kh) ((jz5.n) this.f277126z).getValue();
        khVar.getClass();
        ex0.a0 a0Var = khVar.f276642r;
        if (a0Var != null) {
            com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment2 = narrationVM.f257162q;
            narrationSegment2.getClass();
            com.tencent.maas.moviecomposing.Timeline D = narrationSegment2.D();
            java.lang.String C1 = D != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.C1(narrationSegment2, D) : "";
            narrationSegment2.getClass();
            com.tencent.maas.moviecomposing.Timeline D2 = narrationSegment2.D();
            java.lang.String K1 = D2 != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.K1(narrationSegment2, D2) : "";
            narrationSegment2.getClass();
            com.tencent.maas.moviecomposing.Timeline D3 = narrationSegment2.D();
            java.lang.String G1 = D3 != null ? com.tencent.maas.moviecomposing.segments.NarrationSegment.G1(narrationSegment2, D3) : "";
            java.util.List list = a0Var.f257097g.f257178f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((ex0.r) next).f257169c == ug.m.Narration) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ex0.r rVar = (ex0.r) it6.next();
                ex0.q qVar = rVar instanceof ex0.q ? (ex0.q) rVar : null;
                if (qVar != null) {
                    qVar.O(C1);
                    qVar.M(K1);
                    qVar.L(G1);
                }
            }
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.r9(this, null), 3, null);
        H7(narrationSegment);
    }

    @Override // ew0.l
    public void F7(java.lang.String text) {
        com.tencent.maas.base.MJID mjid;
        ex0.q z76;
        kotlin.jvm.internal.o.g(text, "text");
        super.F7(text);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.v9(this, null), 3, null);
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = this.f257028w;
        if (narrationSegment == null || (mjid = narrationSegment.f48532a) == null || (z76 = z7(mjid)) == null) {
            return;
        }
        com.tencent.maas.moviecomposing.segments.Segment segment = z76.f257167a;
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment2 = segment instanceof com.tencent.maas.moviecomposing.segments.NarrationSegment ? (com.tencent.maas.moviecomposing.segments.NarrationSegment) segment : null;
        if (narrationSegment2 != null) {
            H7(narrationSegment2);
        }
    }

    public final gx0.bf G7() {
        return (gx0.bf) ((jz5.n) this.A).getValue();
    }

    public final void H7(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment) {
        com.tencent.maas.model.time.MJTimeRange timeRange;
        com.tencent.maas.moviecomposing.segments.CaptionItem captionItem = this.f257029x;
        if (captionItem == null || (timeRange = captionItem.getTimeRange()) == null) {
            return;
        }
        ou0.d.b(G7(), new com.tencent.maas.model.time.MJTimeRange(timeRange.getStartTime().add(narrationSegment.A()), timeRange.getDuration()));
    }

    @Override // ew0.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = ((gx0.kh) ((jz5.n) this.f277126z).getValue()).f276642r;
        if (a0Var != null) {
            a0Var.J(cx0.d.f224510f.a(cx0.d.f224509e), null);
        }
    }

    @Override // ew0.l
    public void x7(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(narrationSegment, "narrationSegment");
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        ((gx0.kh) ((jz5.n) this.f277126z).getValue()).r7(snapshotDesc, narrationSegment.A());
    }

    @Override // ew0.l
    public com.tencent.maas.model.time.MJTime y7() {
        return (com.tencent.maas.model.time.MJTime) G7().A.getValue();
    }

    @Override // ew0.l
    public ex0.q z7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return ((gx0.kh) ((jz5.n) this.f277126z).getValue()).n7(segmentID);
    }
}
