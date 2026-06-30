package uw0;

/* loaded from: classes5.dex */
public abstract class o extends ov0.c {
    public final com.tencent.mm.ui.widget.dialog.u3 A;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f431584t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f431585u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f431586v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f431587w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f431588x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.segments.ClipSegment f431589y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f431590z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f431584t = jz5.h.b(new uw0.n(this));
        this.f431585u = jz5.h.b(new uw0.b(this));
        this.f431586v = jz5.h.b(new uw0.m(this));
        this.f431587w = jz5.h.b(new uw0.c(this));
        this.A = com.tencent.mm.ui.widget.dialog.u3.c(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), false, 0, null);
    }

    public java.util.List A7() {
        return kz5.p0.f313996d;
    }

    public ex0.c B7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }

    public ex0.d C7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }

    public com.tencent.maas.moviecomposing.segments.ContentDescSegment D7() {
        return null;
    }

    public final sw0.b E7(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment) {
        java.lang.String P0 = contentDescSegment.P0();
        kotlin.jvm.internal.o.f(P0, "getText(...)");
        com.tencent.maas.moviecomposing.Timeline D = contentDescSegment.D();
        java.lang.String I0 = D != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.I0(contentDescSegment, D) : "";
        com.tencent.maas.moviecomposing.Timeline D2 = contentDescSegment.D();
        java.lang.String F0 = D2 != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.F0(contentDescSegment, D2) : "";
        com.tencent.maas.moviecomposing.Timeline D3 = contentDescSegment.D();
        return new sw0.b(P0, I0, F0, D3 != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.z0(contentDescSegment, D3) : "", contentDescSegment.g0());
    }

    public final gx0.u2 F7() {
        return (gx0.u2) ((jz5.n) this.f431584t).getValue();
    }

    public final void G7(uw0.a panel, com.tencent.maas.moviecomposing.segments.ClipSegment segment) {
        java.lang.String P0;
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(segment, "segment");
        this.f431589y = segment;
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07 = segment.h0();
        this.f349117p = h07 != null ? E7(h07) : null;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = segment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.ElementSegment.Y(segment, D);
        }
        this.f431588x = bool.booleanValue();
        java.util.Objects.toString(this.f349117p);
        com.tencent.maas.moviecomposing.segments.ContentDescSegment D7 = D7();
        this.f349118q = D7 != null ? E7(D7) : this.f349117p;
        com.tencent.maas.moviecomposing.Timeline D2 = segment.D();
        com.tencent.maas.base.MJID N = D2 != null ? com.tencent.maas.moviecomposing.segments.ElementSegment.N(segment, D2) : null;
        java.lang.String str = "";
        if (N == null || !I7(N)) {
            q7("");
        } else {
            ex0.d C7 = C7(N);
            java.lang.Object obj = C7 != null ? C7.f257167a : null;
            com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment = obj instanceof com.tencent.maas.moviecomposing.segments.ContentDescSegment ? (com.tencent.maas.moviecomposing.segments.ContentDescSegment) obj : null;
            if (contentDescSegment != null && (P0 = contentDescSegment.P0()) != null) {
                str = P0;
            }
            q7(str);
        }
        if (kotlin.jvm.internal.o.b(z7(segment), segment)) {
            panel.getNextBtn().setVisibility(8);
        } else {
            panel.getNextBtn().setVisibility(0);
        }
    }

    public void H7(uw0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        u7().f457652p.observe(W6(), new uw0.d(panel, this));
        u7().f457654r.observe(W6(), new uw0.e(panel, this));
        u7().f457650n.observe(W6(), new uw0.g(panel, this));
    }

    public boolean I7(com.tencent.maas.base.MJID mjid) {
        return false;
    }

    public abstract gx0.w J7();

    @Override // vw0.d0
    public void K3(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        u7().v(data);
    }

    public void K7(sw0.d data, com.tencent.maas.moviecomposing.segments.ClipSegment belongingSegment) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(belongingSegment, "belongingSegment");
    }

    @Override // vw0.d0
    public void L6(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f349119r = true;
        u7().u(data);
    }

    @Override // ov0.c
    /* renamed from: L7, reason: merged with bridge method [inline-methods] */
    public void Z6(uw0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.Z6(panel);
        panel.getNextBtn().setOnClickListener(new uw0.h(this, panel));
    }

    public void M7(com.tencent.maas.moviecomposing.segments.ClipSegment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
    }

    public void N7() {
    }

    public void O7() {
    }

    @Override // vw0.d0
    public void P5(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    public void P7() {
    }

    public void Q7() {
    }

    public final void R7() {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        java.lang.String str = null;
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07 = clipSegment != null ? clipSegment.h0() : null;
        boolean z17 = this.f431588x;
        if (!z17 || h07 == null) {
            if (!z17 && h07 != null) {
                str = j65.q.a(getContext()).getString(com.tencent.mm.R.string.lls);
            } else if (z17 && h07 == null) {
                str = j65.q.a(getContext()).getString(com.tencent.mm.R.string.f492510lm4);
            }
        } else if (!kotlin.jvm.internal.o.b(this.f349118q, this.f349117p)) {
            str = j65.q.a(getContext()).getString(com.tencent.mm.R.string.f492510lm4);
        }
        if (str != null) {
            y7(str);
        }
    }

    public final void S7(sw0.e eVar) {
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        sw0.b bVar = null;
        if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
            java.lang.String str = dVar.f413422a.f48224b;
            java.util.Iterator it = A7().iterator();
            while (it.hasNext()) {
                com.tencent.maas.base.MJID mjid = ((com.tencent.maas.moviecomposing.segments.ContentDescSegment) it.next()).f48532a;
                kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
                ex0.d C7 = C7(mjid);
                if (C7 != null) {
                    kotlin.jvm.internal.o.d(str);
                    com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment = C7.f257121p;
                    contentDescSegment.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.tencent.maas.moviecomposing.Timeline D = contentDescSegment.D();
                    if (D != null) {
                        bool = com.tencent.maas.moviecomposing.segments.ContentDescSegment.B0(contentDescSegment, str, D);
                    }
                    bool.booleanValue();
                }
            }
            sw0.b bVar2 = this.f349118q;
            if (bVar2 != null) {
                kotlin.jvm.internal.o.d(str);
                bVar = sw0.b.a(bVar2, null, null, str, null, null, 27, null);
            }
            this.f349118q = bVar;
            N7();
        }
    }

    public final void T7(java.lang.String text) {
        sw0.e eVar;
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        com.tencent.maas.base.MJID mjid = (clipSegment == null || (h07 = clipSegment.h0()) == null) ? null : h07.f48532a;
        if (mjid != null) {
            ex0.d C7 = C7(mjid);
            if (C7 != null) {
                kotlin.jvm.internal.o.g(text, "text");
                com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment = C7.f257121p;
                contentDescSegment.getClass();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.maas.moviecomposing.Timeline D = contentDescSegment.D();
                if (D != null) {
                    bool = com.tencent.maas.moviecomposing.segments.ContentDescSegment.M0(contentDescSegment, text, D);
                }
                bool.booleanValue();
            }
            com.tencent.maas.moviecomposing.segments.ContentDescSegment D7 = D7();
            this.f349118q = D7 != null ? E7(D7) : this.f349117p;
            O7();
            return;
        }
        if (this.f431590z || (eVar = (sw0.e) u7().f457650n.getValue()) == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        if (dVar == null || zu0.i.f475676f != dVar.f413423b) {
            return;
        }
        x7(dVar);
        sw0.e eVar2 = (sw0.e) u7().f457654r.getValue();
        if (eVar2 != null) {
            S7(eVar2);
        }
        sw0.e eVar3 = (sw0.e) u7().f457652p.getValue();
        if (eVar3 != null) {
            U7(eVar3);
        }
        T7(text);
    }

    public final void U7(sw0.e eVar) {
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        sw0.b bVar = null;
        if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
            java.lang.String str = dVar.f413422a.f48224b;
            java.util.Iterator it = A7().iterator();
            while (it.hasNext()) {
                com.tencent.maas.base.MJID mjid = ((com.tencent.maas.moviecomposing.segments.ContentDescSegment) it.next()).f48532a;
                kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
                ex0.d C7 = C7(mjid);
                if (C7 != null) {
                    kotlin.jvm.internal.o.d(str);
                    com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment = C7.f257121p;
                    contentDescSegment.getClass();
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.tencent.maas.moviecomposing.Timeline D = contentDescSegment.D();
                    if (D != null) {
                        bool = com.tencent.maas.moviecomposing.segments.ContentDescSegment.O0(contentDescSegment, str, D);
                    }
                    bool.booleanValue();
                }
            }
            sw0.b bVar2 = this.f349118q;
            if (bVar2 != null) {
                kotlin.jvm.internal.o.d(str);
                bVar = sw0.b.a(bVar2, null, null, null, str, null, 23, null);
            }
            this.f349118q = bVar;
            Q7();
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new uw0.a(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        uw0.a panel = (uw0.a) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        uw0.a aVar = (uw0.a) this.f69240i;
        com.tencent.maas.base.MJID mjid = aVar != null ? (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(aVar, "key_belonging_segment_id", null, 2, null) : null;
        if (mjid != null) {
            ex0.c B7 = B7(mjid);
            com.tencent.maas.moviecomposing.segments.Segment segment = B7 != null ? B7.f257167a : null;
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment != null) {
                G7(panel, clipSegment);
            }
        }
        if (this.f431589y == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
            return;
        }
        panel.setInputMethodChangeCallback(new uw0.j(this, panel));
        if (!u7().f457642f) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
            if (!u3Var.isShowing()) {
                u3Var.show();
            }
        }
        H7(panel);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07;
        R7();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        if (clipSegment != null && (h07 = clipSegment.h0()) != null) {
            java.lang.String P0 = h07.P0();
            kotlin.jvm.internal.o.f(P0, "getText(...)");
            if (P0.length() == 0) {
                gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f431586v).getValue();
                com.tencent.maas.base.MJID mjid = h07.f48532a;
                kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
                gx0.hf.h7(kcVar, mjid, false, false, 6, null);
            }
            if (v7()) {
                gx0.w.V6((gx0.w) ((jz5.n) this.f431585u).getValue(), null, h07, new uw0.k(this), 1, null);
            }
        }
        u7().t();
        this.f431588x = false;
        this.f349117p = null;
        this.f349118q = null;
        this.f431589y = null;
        this.f431590z = false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        if (F7().X6()) {
            return;
        }
        gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f431586v).getValue();
        uw0.a aVar = (uw0.a) this.f69240i;
        if (aVar == null || (dVar = aVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(kcVar, dVar, null, 2, null);
    }

    @Override // vw0.d0
    public void l5() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new uw0.l(this, null), 3, null);
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.ln7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        u7().s();
    }

    @Override // vw0.d0
    public void p0() {
    }

    @Override // ov0.i0
    public void p7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (this.f431589y == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        T7(str);
        if (str.length() == 0) {
            uw0.a aVar = (uw0.a) this.f69240i;
            if (aVar != null) {
                aVar.J();
                return;
            }
            return;
        }
        uw0.a aVar2 = (uw0.a) this.f69240i;
        if (aVar2 != null) {
            aVar2.Q();
        }
    }

    @Override // ov0.c
    public ug.m t7() {
        return ug.m.ContentDesc;
    }

    @Override // vw0.d0
    public void w1() {
        sw0.e eVar = (sw0.e) u7().f457650n.getValue();
        if (eVar == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        if (dVar == null) {
            return;
        }
        xw0.r u76 = u7();
        sw0.b bVar = this.f349118q;
        u76.l(dVar, bVar != null ? bVar.f413416c : null, true);
    }

    public final void x7(sw0.d dVar) {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f431589y;
        if (clipSegment != null) {
            if (clipSegment.C() == ug.m.MovieClip || clipSegment.C() == ug.m.ImageClip) {
                this.f431590z = true;
                K7(dVar, clipSegment);
                this.f431590z = false;
            }
        }
    }

    public void y7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
    }

    public com.tencent.maas.moviecomposing.segments.ClipSegment z7(com.tencent.maas.moviecomposing.segments.ClipSegment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        return null;
    }
}
