package gx0;

/* loaded from: classes5.dex */
public final class u2 extends ow0.a0 {
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.D = jz5.h.b(new gx0.i2(this));
        this.E = jz5.h.b(new gx0.v1(this));
        this.F = jz5.h.b(new gx0.t2(this));
        this.G = jz5.h.b(new gx0.o2(this));
        this.H = jz5.h.b(new gx0.s2(this));
        this.I = jz5.h.b(new gx0.n2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[LOOP:1: B:30:0x00da->B:32:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q7(gx0.u2 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.u2.Q7(gx0.u2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ow0.a0
    public gx0.gg A7() {
        return (gx0.gg) T6(gx0.mc.class);
    }

    @Override // ow0.a0, rw0.b
    public void B(com.tencent.maas.base.MJID clipSegmentID) {
        kotlin.jvm.internal.o.g(clipSegmentID, "clipSegmentID");
        super.B(clipSegmentID);
        Z7(clipSegmentID);
        X7(clipSegmentID);
    }

    @Override // ow0.a0
    public void B7() {
        T7().f7(this.f349291y == vw0.g.f440777f ? new ou0.y(true) : new ou0.v(true));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = n7();
        if (n76 == null) {
            return;
        }
        ex0.a0 a0Var = S7().f276642r;
        if (a0Var != null) {
            if (n76.getWidth() <= 0) {
                n76.getViewTreeObserver().addOnGlobalLayoutListener(new ow0.o0(n76, this, a0Var));
            } else {
                ow0.q0.d(this, n76, a0Var, null, 4, null);
            }
        }
        super.B7();
    }

    @Override // ow0.a0, rw0.b
    public void C0(android.view.View view, com.tencent.maas.base.MJID clipSegmentID) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(clipSegmentID, "clipSegmentID");
        super.C0(view, clipSegmentID);
        ex0.c f76 = S7().f7(clipSegmentID);
        com.tencent.maas.moviecomposing.segments.Segment segment = f76 != null ? f76.f257167a : null;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07 = clipSegment != null ? clipSegment.h0() : null;
        if (h07 == null) {
            return;
        }
        V7(h07);
        X7(clipSegmentID);
    }

    @Override // ow0.a0
    public void C7() {
        ex0.a0 a0Var;
        ex0.a0 a0Var2 = S7().f276642r;
        if (a0Var2 == null) {
            return;
        }
        ex0.r n17 = a0Var2.n();
        if ((n17 != null ? n17.f257169c : null) == ug.m.Caption) {
            ex0.r n18 = a0Var2.n();
            if ((n18 != null ? n18.f257171e : null) != ax0.b.f14965e || (a0Var = S7().f276642r) == null) {
                return;
            }
            ex0.r n19 = a0Var.n();
            ex0.b bVar = n19 instanceof ex0.b ? (ex0.b) n19 : null;
            if (bVar == null) {
                return;
            }
            if (a0Var.G(bVar.f257168b, false, ax0.e.f14975d)) {
                ((gx0.f4) ((jz5.n) this.E).getValue()).F7(bVar.f257169c);
            }
            ex0.i0.m(a0Var);
            kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.u1(this, null), 3, null);
        }
    }

    @Override // ow0.a0, rw0.b
    public void D5(com.tencent.maas.base.MJID clipSegmentID) {
        kotlin.jvm.internal.o.g(clipSegmentID, "clipSegmentID");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.j2(this, clipSegmentID, null), 3, null);
    }

    @Override // ow0.a0
    public void D7() {
        T7().f7(new ou0.v(false, 1, null));
        U7(R7().h7());
        super.D7();
    }

    @Override // ow0.a0
    public void E7(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        gx0.bf R7 = R7();
        com.tencent.maas.model.time.MJTimeRange B = segment.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(R7, B);
    }

    @Override // ow0.a0
    public void F7() {
        T7().f7(new ou0.v(false, 1, null));
        super.F7();
    }

    @Override // ow0.a0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: G7, reason: merged with bridge method [inline-methods] */
    public void a7(ow0.g panel) {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76;
        kotlin.jvm.internal.o.g(panel, "panel");
        super.a7(panel);
        gx0.bh T7 = T7();
        gx0.r2 r2Var = new gx0.r2(this);
        T7.getClass();
        T7.L.addFirst(r2Var);
        if (S7().f276642r == null || (n76 = n7()) == null) {
            return;
        }
        double s17 = r5.s(n76.getTimelineLayoutType()) * R7().V6().i7().toSeconds();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView o76 = o7();
        if (o76 != null) {
            android.view.View view = o76.f69322f;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = ((int) s17) + o76.f69330q;
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // ow0.a0
    public void H7(java.util.List list) {
        ex0.a0 a0Var = S7().f276642r;
        if (a0Var == null) {
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.l2(list, a0Var, this, null), 3, null);
    }

    @Override // ow0.a0
    public void I7() {
        T7().f7(new ou0.v(false, 1, null));
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = S7().l7();
        if (l76 != null) {
            com.tencent.maas.model.time.MJTime b76 = T7().b7();
            if (!l76.B().containsTime(b76)) {
                b76 = l76.A();
                kotlin.jvm.internal.o.d(b76);
            }
            gx0.fd fdVar = (gx0.fd) R7().f276255v.getValue();
            int i17 = fdVar == null ? -1 : gx0.s1.f276938a[fdVar.ordinal()];
            if (i17 == 1) {
                pf5.e.launchUI$default(this, null, null, new gx0.w1(this, null), 3, null);
            } else if (i17 == 2 || i17 == 3) {
                gx0.bf R7 = R7();
                com.tencent.maas.model.time.MJTimeRange B = l76.B();
                kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
                ou0.d.b(R7, B);
                p7().X6(b76);
            }
        }
        a8();
        Y7();
        super.I7();
    }

    @Override // ow0.a0
    public void J7() {
        T7().f7(this.f349291y == vw0.g.f440777f ? new ou0.y(true) : new ou0.v(true));
    }

    @Override // ow0.a0, rw0.e
    public void N(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = S7().l7();
        if (l76 != null) {
            V7(l76);
            Y7();
        }
    }

    public final gx0.bf R7() {
        return (gx0.bf) ((jz5.n) this.I).getValue();
    }

    @Override // ow0.a0, rw0.e
    public void S() {
        super.S();
        a8();
        Y7();
    }

    public final gx0.kh S7() {
        return (gx0.kh) ((jz5.n) this.H).getValue();
    }

    public final gx0.bh T7() {
        return (gx0.bh) ((jz5.n) this.F).getValue();
    }

    public final void U7(com.tencent.maas.model.time.MJTime mJTime) {
        java.lang.String str;
        java.lang.Object obj;
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07;
        ex0.c g76 = S7().g7(mJTime);
        if (g76 == null) {
            return;
        }
        boolean isPlaying = R7().isPlaying();
        com.tencent.maas.base.MJID segmentID = g76.f257168b;
        if (!isPlaying) {
            X7(segmentID);
        }
        com.tencent.maas.moviecomposing.segments.Segment segment = g76.f257167a;
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ElementSegment ? (com.tencent.maas.moviecomposing.segments.ElementSegment) segment : null;
        if (elementSegment == null || (h07 = elementSegment.h0()) == null || (str = h07.P0()) == null) {
            str = "";
        }
        ow0.g gVar = (ow0.g) this.f69240i;
        if (gVar != null) {
            kotlin.jvm.internal.o.g(segmentID, "segmentID");
            sw0.f fVar = sw0.f.f413430e;
            java.util.Iterator it = gVar.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((sw0.n) obj).f413444b == fVar) {
                        break;
                    }
                }
            }
            sw0.n nVar = (sw0.n) obj;
            android.view.View view = nVar != null ? nVar.f413445c : null;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView ? view : null);
            if (setContentDescView != null) {
                setContentDescView.f(segmentID);
                setContentDescView.d(segmentID, str);
            }
        }
    }

    public final void V7(com.tencent.maas.moviecomposing.segments.Segment segment) {
        ug.m C = segment.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        gx0.hf p76 = p7();
        com.tencent.maas.base.MJID mjid = segment.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        if (gx0.hf.h7(p76, mjid, false, false, 6, null)) {
            ((gx0.f4) ((jz5.n) this.E).getValue()).F7(C);
        }
    }

    public final void W7(com.tencent.maas.base.MJID captionSegmentID) {
        kotlin.jvm.internal.o.g(captionSegmentID, "captionSegmentID");
        if (R7().m7()) {
            O7(captionSegmentID, false);
        }
    }

    public final void X7(com.tencent.maas.base.MJID mjid) {
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07;
        com.tencent.maas.base.MJID mjid2;
        ex0.c f76 = S7().f7(mjid);
        java.lang.Object obj = f76 != null ? f76.f257167a : null;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = obj instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) obj : null;
        if (clipSegment == null || (h07 = clipSegment.h0()) == null || (mjid2 = h07.f48532a) == null) {
            ((du0.o) ((jz5.n) this.f349281o).getValue()).U6(false);
        } else {
            O7(mjid2, true);
        }
    }

    public final void Y7() {
        com.tencent.maas.base.MJID mjid;
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = S7().l7();
        if (l76 == null || (mjid = l76.f48532a) == null) {
            ((du0.o) ((jz5.n) this.f349281o).getValue()).U6(false);
        } else {
            O7(mjid, true);
        }
    }

    public final void Z7(com.tencent.maas.base.MJID mjid) {
        com.tencent.maas.moviecomposing.segments.Segment segment;
        ex0.c f76 = S7().f7(mjid);
        if (f76 == null || (segment = f76.f257167a) == null) {
            return;
        }
        if (segment.B().containsTime(R7().h7())) {
            return;
        }
        gx0.bf R7 = R7();
        com.tencent.maas.model.time.MJTime startTime = segment.B().getStartTime();
        kotlin.jvm.internal.o.f(startTime, "getStartTime(...)");
        gx0.bf.q7(R7, startTime, true, 0L, 4, null);
    }

    public final void a8() {
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = S7().l7();
        if (l76 == null) {
            return;
        }
        if (l76.B().containsTime(R7().h7())) {
            return;
        }
        gx0.bf R7 = R7();
        com.tencent.maas.model.time.MJTime A = l76.A();
        kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
        gx0.bf.q7(R7, A, true, 0L, 4, null);
    }

    @Override // ow0.a0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        super.b7();
        T7().L.p();
        com.tencent.maas.moviecomposing.Timeline o76 = S7().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = S7().h7();
            int k76 = S7().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.k1(m7Var, o76, h76, k76, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if ((r0.getCurrentPage() == sw0.f.f413432g) == true) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b8(com.tencent.maas.model.time.MJTime r6) {
        /*
            r5 = this;
            java.lang.String r0 = "targetTime"
            kotlin.jvm.internal.o.g(r6, r0)
            gx0.kh r0 = r5.S7()
            ex0.a0 r0 = r0.f276642r
            if (r0 != 0) goto Le
            return
        Le:
            r1 = 1
            r0.N(r6, r1)
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r2 = r5.f69240i
            ow0.g r2 = (ow0.g) r2
            r3 = 0
            if (r2 == 0) goto L28
            sw0.f r2 = r2.getCurrentPage()
            sw0.f r4 = sw0.f.f413432g
            if (r2 != r4) goto L23
            r2 = r1
            goto L24
        L23:
            r2 = r3
        L24:
            if (r2 != r1) goto L28
            r2 = r1
            goto L29
        L28:
            r2 = r3
        L29:
            if (r2 == 0) goto L3c
            ex0.r r2 = r0.n()
            if (r2 == 0) goto L34
            ug.m r2 = r2.f257169c
            goto L35
        L34:
            r2 = 0
        L35:
            ug.m r4 = ug.m.Caption
            if (r2 == r4) goto L3c
            ex0.i0.a(r0, r6)
        L3c:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r5.f69240i
            ow0.g r0 = (ow0.g) r0
            if (r0 == 0) goto L50
            sw0.f r0 = r0.getCurrentPage()
            sw0.f r2 = sw0.f.f413432g
            if (r0 != r2) goto L4c
            r0 = r1
            goto L4d
        L4c:
            r0 = r3
        L4d:
            if (r0 != r1) goto L50
            goto L51
        L50:
            r1 = r3
        L51:
            if (r1 == 0) goto L56
            ow0.q0.c(r5, r6, r3)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.u2.b8(com.tencent.maas.model.time.MJTime):void");
    }

    @Override // ow0.a0, rw0.a
    public void d0() {
        super.d0();
    }

    @Override // ow0.a0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        super.d7();
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) ((gx0.gf) ((jz5.n) this.G).getValue()).f276473f.getValue();
        if (mJTime != null) {
            ow0.q0.e(this, mJTime);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void f7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        ow0.g panel = (ow0.g) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.k2(this, null), 3, null);
    }

    @Override // ow0.a0, rw0.a
    public void g3(boolean z17) {
        super.g3(z17);
        ((vu0.o0) ((jz5.n) this.C).getValue()).b(S7().c7());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // ow0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k7(kw0.a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "stickerData"
            kotlin.jvm.internal.o.g(r9, r0)
            gx0.hf r0 = r8.p7()
            ug.m r1 = ug.m.FancyText
            com.tencent.maas.model.time.MJTimeRange r0 = r0.Y6(r1)
            gx0.kh r1 = r8.S7()
            com.tencent.maas.material.MJMaterialInfo r9 = r9.f312788a
            java.lang.String r3 = r9.f48224b
            java.lang.String r9 = "getMaterialID(...)"
            kotlin.jvm.internal.o.f(r3, r9)
            r1.getClass()
            ex0.a0 r9 = r1.f276642r
            r1 = 0
            if (r9 != 0) goto L25
            goto L3c
        L25:
            com.tencent.maas.moviecomposing.Timeline r2 = r9.f257092b
            com.tencent.maas.model.time.MJTime r4 = r0.getStartTime()
            com.tencent.maas.model.time.MJTime r5 = r0.getDuration()
            r6 = 1
            r7 = 0
            com.tencent.maas.base.MJID r2 = r2.e(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L3a
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.z.f193105a
            r2 = r1
        L3a:
            if (r2 != 0) goto L3e
        L3c:
            r2 = r1
            goto L49
        L3e:
            cx0.d r3 = cx0.d.f224510f
            cx0.d r4 = cx0.d.f224509e
            java.util.EnumSet r3 = r3.a(r4)
            r9.J(r3, r1)
        L49:
            if (r2 != 0) goto L4e
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.z.f193105a
            r2 = r1
        L4e:
            if (r2 != 0) goto L51
            return
        L51:
            gx0.kh r9 = r8.S7()
            ex0.k r9 = r9.i7(r2)
            if (r9 != 0) goto L5e
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.z.f193105a
            goto L5f
        L5e:
            r1 = r9
        L5f:
            if (r1 != 0) goto L62
            return
        L62:
            com.tencent.maas.moviecomposing.segments.FancyTextSegment r9 = r1.f257144p
            java.lang.String r2 = r9.N0()
            java.lang.String r3 = "getTitle(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r9.getClass()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            com.tencent.maas.moviecomposing.Timeline r4 = r9.D()
            if (r4 == 0) goto L7c
            java.lang.Boolean r3 = com.tencent.maas.moviecomposing.segments.FancyTextSegment.x0(r9, r2, r4)
        L7c:
            r3.booleanValue()
            com.tencent.maas.moviecomposing.segments.Segment r9 = r1.f257167a
            boolean r1 = r9 instanceof com.tencent.maas.moviecomposing.segments.FancyTextSegment
            if (r1 == 0) goto L9a
            com.tencent.maas.moviecomposing.segments.FancyTextSegment r9 = (com.tencent.maas.moviecomposing.segments.FancyTextSegment) r9
            com.tencent.maas.base.MJID r9 = r9.f48532a
            java.lang.String r1 = "getSegmentID(...)"
            kotlin.jvm.internal.o.f(r9, r1)
            gx0.hf r1 = r8.p7()
            gx0.t1 r2 = new gx0.t1
            r2.<init>(r8, r9)
            r1.W6(r9, r0, r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.u2.k7(kw0.a):void");
    }

    @Override // ow0.a0
    public java.util.List l7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.lmt), sw0.f.f413429d, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView(getActivity(), null, 0, 6, null)));
        yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
        m0Var.getClass();
        boolean z17 = false;
        if (pp0.h0.Q2(m0Var, false, 1, null)) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieContentDescEnable()) == 1) {
                z17 = true;
            }
        }
        if (z17) {
            arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.lms), sw0.f.f413430e, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView(getActivity(), null, 0, 6, null)));
        }
        arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.mbz), sw0.f.f413431f, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView(getActivity(), null, 0, 6, null)));
        if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ui()) {
            arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.m_s), sw0.f.f413432g, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView(getActivity(), null, 0, 6, null)));
        }
        return arrayList;
    }

    @Override // ow0.a0
    public ex0.b m7(com.tencent.maas.base.MJID mjid) {
        if (mjid != null) {
            ex0.a0 a0Var = S7().f276642r;
            if (a0Var != null) {
                return ex0.i0.c(a0Var, mjid);
            }
            return null;
        }
        ex0.a0 a0Var2 = S7().f276642r;
        ex0.r n17 = a0Var2 != null ? a0Var2.n() : null;
        if (n17 instanceof ex0.b) {
            return (ex0.b) n17;
        }
        return null;
    }

    @Override // ow0.a0
    public com.tencent.maas.moviecomposing.segments.Segment q7() {
        return S7().l7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r8.C() != ug.m.ImageClip) goto L28;
     */
    @Override // ow0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r7() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.u2.r7():void");
    }

    @Override // ow0.a0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a
    public void s1(fv0.a operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        super.s1(operation);
    }

    @Override // ow0.a0, rw0.c
    public void s5(kw0.a fancyTextData) {
        kotlin.jvm.internal.o.g(fancyTextData, "fancyTextData");
        super.s5(fancyTextData);
    }

    @Override // ow0.a0
    public void s7(ow0.g panel) {
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        androidx.lifecycle.j0 j0Var3;
        androidx.lifecycle.j0 j0Var4;
        androidx.lifecycle.j0 j0Var5;
        androidx.lifecycle.j0 j0Var6;
        kotlin.jvm.internal.o.g(panel, "panel");
        ex0.a0 a0Var = S7().f276642r;
        if (a0Var != null) {
            ex0.i0.m(a0Var);
        }
        if (a0Var != null) {
            a0Var.f257116z.setValue(null);
        }
        if (a0Var != null) {
            a0Var.H();
        }
        if (a0Var != null && (j0Var6 = a0Var.f257115y) != null) {
            j0Var6.observe(W6(), new gx0.z1(this));
        }
        if (a0Var != null && (j0Var5 = a0Var.A) != null) {
            j0Var5.observe(W6(), new gx0.a2(this, panel));
        }
        ((gx0.gf) ((jz5.n) this.G).getValue()).f276473f.observe(W6(), new gx0.b2(panel, this));
        R7().f276255v.observe(W6(), new gx0.d2(panel, this));
        if (a0Var != null && (j0Var4 = a0Var.f257116z) != null) {
            j0Var4.observe(W6(), new gx0.e2(this));
        }
        if (a0Var != null && (j0Var3 = a0Var.f257105o) != null) {
            j0Var3.observe(W6(), new gx0.f2(panel, this));
        }
        if (a0Var != null && (j0Var2 = a0Var.f257114x) != null) {
            j0Var2.observe(W6(), new gx0.g2(this));
        }
        if (a0Var != null && (j0Var = a0Var.f257106p) != null) {
            j0Var.observe(W6(), new gx0.h2(this));
        }
        super.s7(panel);
    }

    @Override // ow0.a0
    public uw0.o t7() {
        return (uw0.o) T6(gx0.h0.class);
    }

    @Override // ow0.a0
    public uw0.t0 u7() {
        return (uw0.t0) T6(gx0.u0.class);
    }

    @Override // ow0.a0
    public uw0.e1 v7() {
        return (uw0.e1) T6(gx0.h1.class);
    }

    @Override // ow0.a0
    public jv0.g w7() {
        return (jv0.g) T6(gx0.y3.class);
    }

    @Override // ow0.a0
    public hw0.z x7() {
        return (hw0.z) T6(gx0.m4.class);
    }

    @Override // ow0.a0
    public du0.o y7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // ow0.a0
    public gx0.hf z7() {
        return (gx0.hf) T6(gx0.kc.class);
    }
}
