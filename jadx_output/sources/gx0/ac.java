package gx0;

/* loaded from: classes5.dex */
public final class ac extends cw0.l0 {
    public boolean B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final xw0.r I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.C = jz5.h.b(new gx0.ea(this));
        this.D = jz5.h.b(new gx0.ub(this));
        this.E = jz5.h.b(new gx0.eb(this));
        this.F = jz5.h.b(new gx0.yb(this));
        this.G = jz5.h.b(new gx0.zb(this));
        this.H = jz5.h.b(new gx0.vb(this));
        this.I = new xw0.r(Q6());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z7(gx0.ac r8, ex0.q r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof gx0.fa
            if (r0 == 0) goto L16
            r0 = r10
            gx0.fa r0 = (gx0.fa) r0
            int r1 = r0.f276424i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f276424i = r1
            goto L1b
        L16:
            gx0.fa r0 = new gx0.fa
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f276422g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276424i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.f276420e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f276419d
            ex0.q r9 = (ex0.q) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L97
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.f276421f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f276420e
            ex0.q r9 = (ex0.q) r9
            java.lang.Object r2 = r0.f276419d
            gx0.ac r2 = (gx0.ac) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7d
        L4e:
            kotlin.ResultKt.throwOnFailure(r10)
            xw0.r r10 = r8.I
            com.tencent.maas.material.MJMaterialInfo r2 = r10.f457644h
            java.lang.String r2 = r2.f48224b
            if (r2 != 0) goto L5c
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.z.f193105a
            r2 = r5
        L5c:
            if (r2 != 0) goto L60
            java.lang.String r2 = ""
        L60:
            ug.m r6 = ug.m.Narration
            java.lang.String r6 = r10.f(r6)
            if (r6 == 0) goto L6b
            r9.L(r6)
        L6b:
            r0.f276419d = r8
            r0.f276420e = r9
            r0.f276421f = r2
            r0.f276424i = r4
            java.lang.Object r10 = xw0.r.o(r10, r5, r0, r4, r5)
            if (r10 != r1) goto L7a
            goto L9c
        L7a:
            r7 = r2
            r2 = r8
            r8 = r7
        L7d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L84
            r9.M(r10)
        L84:
            du0.t0 r10 = r2.Q6()
            r0.f276419d = r9
            r0.f276420e = r8
            r0.f276421f = r5
            r0.f276424i = r3
            java.lang.Object r10 = r10.V6(r0)
            if (r10 != r1) goto L97
            goto L9c
        L97:
            r9.O(r8)
            jz5.f0 r1 = jz5.f0.f302826a
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.ac.Z7(gx0.ac, ex0.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void a8(gx0.ac acVar, ex0.r rVar) {
        com.tencent.maas.model.time.MJTime b86 = acVar.b8();
        com.tencent.maas.model.time.MJTime startTime = b86.smallThan(rVar.k()) ? rVar.l().getStartTime() : b86.bigThan(rVar.l().getEndTime()) ? rVar.l().getEndTime() : com.tencent.maas.model.time.MJTime.InvalidTime;
        if (startTime.isValid()) {
            gx0.bf.q7(acVar.c8(), startTime, true, 0L, 4, null);
            acVar.g8(startTime);
        }
    }

    public static void f8(gx0.ac acVar, ex0.a0 a0Var, com.tencent.maas.model.time.MJTime mJTime, int i17, java.lang.Object obj) {
        ex0.v vVar;
        java.util.List list;
        if ((i17 & 2) != 0) {
            mJTime = null;
        }
        int i18 = (int) (acVar.getContext().getResources().getDisplayMetrics().widthPixels * 0.5f);
        acVar.A7().b(a0Var, new bx0.j(e3.d.b(i18, (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 40), i18, 0), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 28)), acVar.getMainScope());
        acVar.A7().setPlaybackStateListener(new gx0.ra(acVar));
        acVar.A7().setTimelineScaleListener(new gx0.ta(acVar));
        acVar.A7().setScrollTimeChangedListener(new gx0.wa(acVar, a0Var));
        acVar.A7().setTimelineItemDecorationTrimListener(new gx0.za(acVar, a0Var, i18));
        acVar.A7().setScrollStateChangeListener(new gx0.cb(acVar));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView A7 = acVar.A7();
        kotlinx.coroutines.y0 mainScope = acVar.getMainScope();
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = A7.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                A7.getThumbnailProviderManager().d(rVar.f257168b);
                if (rVar.f257169c != ug.m.Transition) {
                    kotlinx.coroutines.l.d(mainScope, null, null, new fw0.d(A7, rVar, null), 3, null);
                }
            }
        }
        if (mJTime != null) {
            acVar.l8(mJTime);
        } else {
            acVar.g8(acVar.c8().i7());
        }
    }

    @Override // cw0.l0
    public double B7() {
        if (e8() == null) {
            return -1.0d;
        }
        return r0.s(A7().getTimelineLayoutType()) * c8().V6().i7().toSeconds();
    }

    @Override // cw0.l0
    public void C7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.q n76 = d8().n7(segmentID);
        if (n76 == null) {
            return;
        }
        ex0.r v76 = v7();
        if (kotlin.jvm.internal.o.b(v76 != null ? v76.f257168b : null, segmentID)) {
            return;
        }
        ex0.a0 e86 = e8();
        if (e86 != null) {
            ex0.i0.m(e86);
        }
        ex0.a0 e87 = e8();
        if (e87 != null) {
            ex0.i0.k(e87, n76);
        }
        R7();
    }

    @Override // cw0.l0
    public void D7(cw0.d panel) {
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        androidx.lifecycle.j0 j0Var3;
        androidx.lifecycle.j0 j0Var4;
        androidx.lifecycle.j0 j0Var5;
        androidx.lifecycle.j0 j0Var6;
        androidx.lifecycle.j0 j0Var7;
        kotlin.jvm.internal.o.g(panel, "panel");
        ((gx0.gf) ((jz5.n) this.H).getValue()).f276473f.observe(W6(), new gx0.ha(this, panel));
        c8().f276255v.observe(W6(), new gx0.ia(panel));
        ex0.a0 e86 = e8();
        if (e86 != null) {
            ex0.i0.m(e86);
        }
        ex0.a0 e87 = e8();
        if (e87 != null) {
            e87.f257116z.setValue(null);
        }
        ex0.a0 e88 = e8();
        if (e88 != null && (j0Var7 = e88.f257116z) != null) {
            j0Var7.observe(W6(), new gx0.ja(this));
        }
        ex0.a0 e89 = e8();
        if (e89 != null) {
            e89.H();
        }
        ex0.a0 e810 = e8();
        if (e810 != null && (j0Var6 = e810.f257115y) != null) {
            j0Var6.observe(W6(), new gx0.la(this));
        }
        ex0.a0 e811 = e8();
        if (e811 != null && (j0Var5 = e811.A) != null) {
            j0Var5.observe(W6(), new gx0.ma(this));
        }
        ex0.a0 e812 = e8();
        if (e812 != null && (j0Var4 = e812.f257105o) != null) {
            j0Var4.observe(W6(), new gx0.na(panel, this));
        }
        ex0.a0 e813 = e8();
        if (e813 != null && (j0Var3 = e813.f257114x) != null) {
            j0Var3.observe(W6(), new gx0.oa(this));
        }
        ex0.a0 e814 = e8();
        if (e814 != null && (j0Var2 = e814.f257115y) != null) {
            j0Var2.observe(W6(), new gx0.pa(this));
        }
        ex0.a0 e815 = e8();
        if (e815 != null && (j0Var = e815.f257106p) != null) {
            j0Var.observe(W6(), new gx0.qa(this));
        }
        super.D7(panel);
    }

    @Override // cw0.l0
    public void E7() {
        ex0.a0 e86 = e8();
        if (e86 == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
        } else if (A7().getWidth() <= 0) {
            A7().getViewTreeObserver().addOnGlobalLayoutListener(new gx0.db(this, e86));
        } else {
            f8(this, e86, null, 2, null);
        }
    }

    @Override // cw0.l0
    public boolean F7() {
        com.tencent.maas.moviecomposing.segments.Segment m17;
        com.tencent.maas.model.time.MJTime mJTime;
        ex0.a0 e86 = e8();
        if (e86 == null) {
            return false;
        }
        ex0.a0 a0Var = d8().f276642r;
        java.lang.Object obj = null;
        if (a0Var == null) {
            m17 = null;
        } else {
            ex0.r n17 = a0Var.n();
            m17 = a0Var.f257092b.m(n17 != null ? n17.f257168b : null);
        }
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = m17 instanceof com.tencent.maas.moviecomposing.segments.NarrationSegment ? (com.tencent.maas.moviecomposing.segments.NarrationSegment) m17 : null;
        if (narrationSegment == null || (mJTime = (com.tencent.maas.model.time.MJTime) e86.f257106p.getValue()) == null) {
            return false;
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem[] P1 = narrationSegment.P1();
        kotlin.jvm.internal.o.f(P1, "getCaptionItems(...)");
        java.util.Iterator it = kz5.z.z0(P1).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.tencent.maas.moviecomposing.segments.CaptionItem) next).getTimeRange().containsTime(mJTime.sub(narrationSegment.A()))) {
                obj = next;
                break;
            }
        }
        return ((com.tencent.maas.moviecomposing.segments.CaptionItem) obj) != null;
    }

    @Override // cw0.l0
    public gx0.w G7() {
        return (gx0.w) T6(gx0.f4.class);
    }

    @Override // cw0.l0
    public void H7(int i17, java.lang.String wavFilepath, boolean z17) {
        com.tencent.maas.model.time.MJTime b86;
        ex0.e eVar;
        kotlin.jvm.internal.o.g(wavFilepath, "wavFilepath");
        com.tencent.mars.xlog.Log.i("MovieNarrationPanelUIC", "onAudioRecorded");
        ex0.a0 e86 = e8();
        if (e86 == null || (eVar = e86.I) == null || (b86 = eVar.f257124b) == null) {
            b86 = b8();
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.gb(this, z17, b86, null), 3, null);
        if (i17 < 300) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.hb(this, null), 3, null);
        } else {
            if (z17) {
                return;
            }
            kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.ba(this, wavFilepath, null), 3, null);
        }
    }

    @Override // cw0.l0
    public void I7(com.tencent.maas.base.MJID narrationSegmentID) {
        ex0.q f17;
        kotlin.jvm.internal.o.g(narrationSegmentID, "narrationSegmentID");
        ex0.a0 e86 = e8();
        if (e86 == null || (f17 = ex0.i0.f(e86, narrationSegmentID)) == null) {
            return;
        }
        ((gx0.w) ((jz5.n) this.f222644p).getValue()).U6(fv0.d.f266965q, f17.f257167a, new gx0.ib(this));
    }

    @Override // cw0.l0, vu0.p0
    public void J4(float[] waveArray, float f17) {
        ex0.e eVar;
        kotlin.jvm.internal.o.g(waveArray, "waveArray");
        ex0.a0 e86 = e8();
        if (e86 != null && (eVar = e86.I) != null) {
            eVar.f257125c = waveArray;
        }
        super.J4(waveArray, f17);
    }

    @Override // cw0.l0
    public void J7() {
        ex0.a0 e86 = e8();
        if (e86 == null) {
            return;
        }
        ex0.r n17 = e86.n();
        ex0.q qVar = n17 instanceof ex0.q ? (ex0.q) n17 : null;
        if (qVar == null) {
            return;
        }
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.y2(m7Var, null), 3, null);
        if (e86.G(qVar.f257168b, false, ax0.e.f14975d)) {
            ((gx0.w) ((jz5.n) this.f222644p).getValue()).F7(qVar.f257169c);
        }
        ex0.a0 e87 = e8();
        if (e87 != null) {
            ex0.i0.m(e87);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.da(this, e86, null), 3, null);
    }

    @Override // cw0.l0
    public void K7(ru0.e roleResult, ex0.q narrationVM, com.tencent.mm.vfs.r6 roleFile) {
        kotlin.jvm.internal.o.g(roleResult, "roleResult");
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        kotlin.jvm.internal.o.g(roleFile, "roleFile");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.kb(this, roleResult, narrationVM, roleFile, null), 3, null);
    }

    @Override // cw0.l0
    public void L7() {
        super.L7();
        ex0.a0 e86 = e8();
        if (e86 == null) {
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.nb(this, e86, null), 3, null);
    }

    @Override // cw0.l0
    public void M7() {
        ex0.a0 e86 = e8();
        if (e86 == null) {
            return;
        }
        this.f222649u = kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.ob(this, e86, null), 3, null);
    }

    @Override // cw0.l0
    public void N7(ex0.q narrationVM) {
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.pb(narrationVM, this, null), 3, null);
    }

    @Override // cw0.l0
    public void O7(com.tencent.maas.base.MJID segmentID, ex0.q narrationVM) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.qb(this, narrationVM, segmentID, null), 3, null);
    }

    @Override // cw0.l0
    public void P7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        j8(segmentID, vu0.w.f440167e);
    }

    @Override // cw0.l0
    public void R7() {
        if ((A7().recyclerView.getScrollState() != 0) || c8().f276255v.getValue() == gx0.fd.f276432h) {
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.xb(this, null), 3, null);
    }

    @Override // cw0.l0
    public void T7(float f17, java.lang.Float f18, java.lang.Float f19) {
        ex0.a0 e86;
        ex0.o o17;
        ex0.a0 e87;
        ex0.v vVar;
        java.util.List<ex0.r> list;
        java.util.List y76 = y7();
        if (y76 != null) {
            java.util.Iterator it = y76.iterator();
            while (it.hasNext()) {
                ((ex0.q) it.next()).E(f17);
            }
        }
        this.f222650v = f17;
        if (f18 != null && (e87 = e8()) != null && (vVar = e87.f257097g) != null && (list = vVar.f257177e) != null) {
            for (ex0.r rVar : list) {
                if (rVar.o()) {
                    ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
                    if (cVar != null) {
                        cVar.E(f18.floatValue());
                    }
                }
            }
        }
        if (f19 == null || (e86 = e8()) == null || (o17 = e86.o()) == null) {
            return;
        }
        o17.E(f19.floatValue());
    }

    @Override // cw0.l0
    public void Y7(java.lang.String requestId, vu0.u state) {
        ex0.h hVar;
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(state, "state");
        ex0.a0 e86 = e8();
        if (e86 == null || (hVar = ex0.i0.g(e86, requestId)) == null) {
            ex0.a0 e87 = e8();
            hVar = e87 != null ? e87.I : null;
        }
        if (hVar != null) {
            hVar.b(state);
        }
        com.tencent.mars.xlog.Log.i("MovieNarrationPanelUIC", "updateNarrationRecognitionState: requestId: " + requestId + ", state: " + state.name());
        cw0.d dVar = (cw0.d) this.f69240i;
        if (dVar != null) {
            android.view.View findViewWithTag = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266947s);
            android.view.View findViewWithTag2 = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(cw0.a.f222602d);
            if (state == vu0.u.f440164i) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewWithTag, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewWithTag2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewWithTag, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewWithTag2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewWithTag2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "updateReRecognizeOptState$plugin_mj_template_release", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/audio/services/RecognitionState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        R7();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        com.tencent.maas.moviecomposing.Timeline o76 = d8().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = d8().h7();
            int k76 = d8().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.i1(m7Var, o76, h76, k76, null), 3, null);
        }
    }

    public final com.tencent.maas.model.time.MJTime b8() {
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(A7().getCurrentScrolledX() / (e8() != null ? r2.s(A7().getTimelineLayoutType()) : 1.0f));
        kotlin.jvm.internal.o.f(fromSeconds, "fromSeconds(...)");
        return fromSeconds;
    }

    public final gx0.bf c8() {
        return (gx0.bf) this.D.getValue();
    }

    @Override // cw0.l0, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        super.d7();
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.jb(this, null), 3, null);
    }

    public final gx0.kh d8() {
        return (gx0.kh) this.F.getValue();
    }

    public final ex0.a0 e8() {
        return d8().f276642r;
    }

    public final void g8(com.tencent.maas.model.time.MJTime currentTime) {
        kotlin.jvm.internal.o.g(currentTime, "currentTime");
        if (currentTime.isValid()) {
            k8(currentTime);
            l8(currentTime);
            R7();
        }
    }

    public final void h8(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String str, java.lang.String str2) {
        dw0.a aVar;
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = this.f222647s;
        kotlin.jvm.internal.o.g(mJMaterialInfo, "<this>");
        if (dw0.f.b(mJMaterialInfo)) {
            aVar = dw0.a.f244079f;
        } else {
            java.lang.String str3 = mJMaterialInfo.f48224b;
            kotlin.jvm.internal.o.f(str3, "getMaterialID(...)");
            dw0.a aVar2 = dw0.a.f244078e;
            aVar = r26.i0.y(str3, "publisher_speech_enhance_", false) ? dw0.a.f244080g : dw0.a.f244078e;
        }
        yu0.t g17 = ru0.a.g(narrationSegment, str, str2, aVar);
        if (g17 != null) {
            z7().p7(ug.m.Narration, kz5.b0.c(g17));
        }
    }

    public final void i8() {
        ex0.r n17;
        t7().getClass();
        if (!uu0.c.e().f431207b) {
            X7();
        }
        ex0.a0 e86 = e8();
        if (e86 != null && (n17 = e86.n()) != null) {
            if (n17.f257169c == ug.m.Narration) {
                com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) e86.f257106p.getValue();
                boolean n18 = mJTime != null ? n17.n(mJTime) : false;
                cw0.d dVar = (cw0.d) this.f69240i;
                if (dVar != null) {
                    android.view.View findViewWithTag = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266939h);
                    kotlin.jvm.internal.o.f(findViewWithTag, "findViewWithTag(...)");
                    dVar.B(findViewWithTag, n18);
                }
            }
        }
        cw0.d dVar2 = (cw0.d) this.f69240i;
        if (dVar2 != null) {
            boolean F7 = F7();
            android.view.View findViewWithTag2 = dVar2.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266949u);
            kotlin.jvm.internal.o.f(findViewWithTag2, "findViewWithTag(...)");
            dVar2.B(findViewWithTag2, F7);
            android.view.View findViewWithTag3 = dVar2.getNarrationSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266950v);
            kotlin.jvm.internal.o.f(findViewWithTag3, "findViewWithTag(...)");
            dVar2.B(findViewWithTag3, F7);
        }
    }

    public final void j8(com.tencent.maas.base.MJID mjid, vu0.w wVar) {
        ex0.q f17;
        ex0.a0 e86 = e8();
        if (e86 == null || (f17 = ex0.i0.f(e86, mjid)) == null) {
            return;
        }
        f17.P(wVar);
        R7();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k8(com.tencent.maas.model.time.MJTime r6) {
        /*
            r5 = this;
            ex0.a0 r0 = r5.e8()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 1
            r0.N(r6, r1)
            ex0.a0 r0 = r5.e8()
            if (r0 == 0) goto L14
            ex0.i0.a(r0, r6)
        L14:
            ex0.a0 r0 = r5.e8()
            if (r0 == 0) goto La0
            androidx.lifecycle.j0 r0 = r0.f257114x
            if (r0 == 0) goto La0
            java.lang.Object r0 = r0.getValue()
            ax0.e r0 = (ax0.e) r0
            if (r0 != 0) goto L28
            goto La0
        L28:
            ex0.r r1 = r5.v7()
            if (r1 == 0) goto La0
            com.tencent.maas.base.MJID r1 = r1.f257168b
            if (r1 != 0) goto L34
            goto La0
        L34:
            ax0.e r2 = ax0.e.f14979h
            if (r0 == r2) goto L3c
            ax0.e r2 = ax0.e.f14980i
            if (r0 != r2) goto La0
        L3c:
            ex0.r r0 = r5.v7()
            r2 = 0
            if (r0 == 0) goto L46
            ax0.b r0 = r0.f257171e
            goto L47
        L46:
            r0 = r2
        L47:
            ax0.b r3 = ax0.b.f14965e
            if (r0 == r3) goto L4c
            goto La0
        L4c:
            gx0.kh r0 = r5.d8()
            r0.getClass()
            ex0.a0 r0 = r0.f276642r
            if (r0 != 0) goto L58
            goto L89
        L58:
            ex0.v r0 = r0.f257097g
            r0.getClass()
            java.util.List r0 = r0.f257179g
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L65:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r0.next()
            r4 = r3
            ex0.q r4 = (ex0.q) r4
            com.tencent.maas.moviecomposing.segments.Segment r4 = r4.f257167a
            com.tencent.maas.model.time.MJTimeRange r4 = r4.B()
            boolean r4 = r4.containsTime(r6)
            if (r4 == 0) goto L65
            goto L80
        L7f:
            r3 = r2
        L80:
            ex0.r r3 = (ex0.r) r3
            boolean r6 = r3 instanceof ex0.q
            if (r6 == 0) goto L89
            ex0.q r3 = (ex0.q) r3
            goto L8a
        L89:
            r3 = r2
        L8a:
            if (r3 == 0) goto L8e
            com.tencent.maas.base.MJID r2 = r3.f257168b
        L8e:
            if (r2 == 0) goto La0
            boolean r6 = kotlin.jvm.internal.o.b(r2, r1)
            if (r6 == 0) goto L97
            goto La0
        L97:
            ex0.a0 r6 = r5.e8()
            if (r6 == 0) goto La0
            ex0.i0.j(r6, r2)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.ac.k8(com.tencent.maas.model.time.MJTime):void");
    }

    @Override // cw0.l0
    public void l7(java.lang.String requestId, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        ex0.a0 e86 = e8();
        ex0.q g17 = e86 != null ? ex0.i0.g(e86, requestId) : null;
        if (g17 == null) {
            ex0.a0 e87 = e8();
            ex0.e eVar = e87 != null ? e87.I : null;
            if (eVar != null) {
                eVar.f257127e.add(captionItem);
                return;
            }
            return;
        }
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = g17.f257162q;
        com.tencent.maas.moviecomposing.segments.CaptionItem[] P1 = narrationSegment.P1();
        kotlin.jvm.internal.o.f(P1, "getCaptionItems(...)");
        g17.N(kz5.n0.u0(kz5.z.z0(P1), captionItem));
        g17.I().size();
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.segments.CaptionItem[] captionItemArr = new com.tencent.maas.moviecomposing.segments.CaptionItem[0];
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            captionItemArr = com.tencent.maas.moviecomposing.segments.NarrationSegment.I1(narrationSegment, D);
        }
        kz5.z.z0(captionItemArr).size();
        if (g17.f257165t == vu0.u.f440163h) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.lwt);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            U7(string);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.fb(this, null), 3, null);
    }

    public final void l8(com.tencent.maas.model.time.MJTime mJTime) {
        if (e8() == null) {
            return;
        }
        A7().g(r0.s(A7().getTimelineLayoutType()) * mJTime.toSeconds());
    }

    @Override // cw0.l0
    public void m7(float f17) {
        ex0.o o17;
        ex0.a0 e86 = e8();
        if (e86 != null && (o17 = e86.o()) != null) {
            o17.E(f17);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.x9(this, null), 3, null);
    }

    @Override // cw0.l0
    public void n7(float f17) {
        java.util.List y76 = y7();
        this.f222650v = f17;
        if (y76 != null) {
            java.util.Iterator it = y76.iterator();
            while (it.hasNext()) {
                ((ex0.q) it.next()).E(f17);
            }
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.y9(this, null), 3, null);
    }

    @Override // cw0.l0
    public void o7(float f17) {
        ex0.v vVar;
        java.util.List<ex0.r> list;
        ex0.a0 e86 = e8();
        if (e86 != null && (vVar = e86.f257097g) != null && (list = vVar.f257177e) != null) {
            for (ex0.r rVar : list) {
                if (rVar.o()) {
                    ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
                    if (cVar != null) {
                        cVar.E(f17);
                    }
                }
            }
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.z9(this, null), 3, null);
    }

    @Override // cw0.l0
    public boolean p7() {
        ex0.a0 e86 = e8();
        boolean z17 = false;
        if (e86 == null) {
            return false;
        }
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) e86.f257106p.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        kotlin.jvm.internal.o.d(mJTime);
        if (!mJTime.isValid()) {
            return false;
        }
        ex0.v vVar = e86.f257097g;
        com.tencent.maas.model.time.MJTime c17 = vVar.c();
        com.tencent.maas.model.time.MJTime mJTime2 = e86.f257101k;
        if (mJTime.bigThan(c17.sub(mJTime2))) {
            return false;
        }
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = new com.tencent.maas.model.time.MJTimeRange(mJTime, mJTime2);
        java.util.List list = vVar.f257179g;
        if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ex0.q qVar = (ex0.q) it.next();
                if (qVar.l().getStartTime().smallThan(mJTimeRange.getEndTime()) && qVar.l().getEndTime().bigThan(mJTimeRange.getStartTime())) {
                    z17 = true;
                    break;
                }
            }
        }
        return !z17;
    }

    @Override // cw0.l0
    public java.lang.Object q7(kotlin.coroutines.Continuation continuation) {
        java.lang.Object d76 = gx0.bf.d7(c8(), null, null, false, continuation, 7, null);
        return d76 == pz5.a.f359186d ? d76 : jz5.f0.f302826a;
    }

    @Override // cw0.l0
    public void r7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        d8().r7(snapshotDesc, null);
    }

    @Override // cw0.l0
    public void s7(yz5.l action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.List y76 = y7();
        if (y76 != null) {
            java.util.Iterator it = y76.iterator();
            while (it.hasNext()) {
                action.invoke((ex0.q) it.next());
            }
        }
    }

    @Override // cw0.l0
    public ex0.c u7() {
        ex0.r rVar;
        ex0.v vVar;
        java.util.List list;
        java.lang.Object obj;
        ex0.a0 e86 = e8();
        if (e86 == null || (vVar = e86.f257097g) == null || (list = vVar.f257177e) == null) {
            rVar = null;
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ex0.r rVar2 = (ex0.r) obj;
                boolean z17 = false;
                if (rVar2.o()) {
                    ex0.c cVar = rVar2 instanceof ex0.c ? (ex0.c) rVar2 : null;
                    if ((cVar == null || cVar.D()) ? false : true) {
                        if (rVar2.f257169c != ug.m.ImageClip) {
                            z17 = true;
                        }
                    }
                }
                if (z17) {
                    break;
                }
            }
            rVar = (ex0.r) obj;
        }
        if (rVar instanceof ex0.c) {
            return (ex0.c) rVar;
        }
        return null;
    }

    @Override // cw0.l0
    public ex0.r v7() {
        ex0.a0 e86 = e8();
        if (e86 != null) {
            return e86.n();
        }
        return null;
    }

    @Override // cw0.l0
    public ex0.o w7() {
        ex0.a0 e86 = e8();
        if (e86 != null) {
            return e86.o();
        }
        return null;
    }

    @Override // cw0.l0
    public ex0.q x7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return d8().n7(segmentID);
    }

    @Override // cw0.l0
    public java.util.List y7() {
        ex0.a0 e86 = e8();
        if (e86 != null) {
            return e86.f257097g.f257179g;
        }
        return null;
    }
}
