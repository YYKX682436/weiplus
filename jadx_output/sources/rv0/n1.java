package rv0;

/* loaded from: classes5.dex */
public final class n1 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {
    public final java.util.List A;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f400126n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f400127o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f400128p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f400129q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f400130r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f400131s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f400132t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f400133u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f400134v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f400135w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f400136x;

    /* renamed from: y, reason: collision with root package name */
    public zv0.f0 f400137y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f400138z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f400126n = jz5.h.b(new rv0.o(this));
        this.f400127o = jz5.h.b(new rv0.z0(this));
        this.f400128p = jz5.h.b(new rv0.a1(this));
        this.f400129q = jz5.h.b(new rv0.l(this));
        this.f400130r = jz5.h.b(new rv0.m(this));
        this.f400131s = jz5.h.b(new rv0.n(this));
        this.f400132t = jz5.h.b(new rv0.k1(this));
        this.f400133u = jz5.h.b(new rv0.i1(this));
        this.f400134v = jz5.h.b(new rv0.e1(this));
        this.f400135w = jz5.h.b(new rv0.f1(this));
        this.f400136x = jz5.h.b(new rv0.l1(this));
        this.f400138z = jz5.h.b(new rv0.j1(this));
        this.A = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k7(rv0.n1 r9, rv0.c7 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof rv0.k
            if (r0 == 0) goto L16
            r0 = r11
            rv0.k r0 = (rv0.k) r0
            int r1 = r0.f400073h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f400073h = r1
            goto L1b
        L16:
            rv0.k r0 = new rv0.k
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f400071f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f400073h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L54
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            kotlin.ResultKt.throwOnFailure(r11)
            goto L83
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.f400070e
            rv0.c7 r9 = (rv0.c7) r9
            java.lang.Object r10 = r0.f400069d
            rv0.n1 r10 = (rv0.n1) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L7d
        L47:
            java.lang.Object r9 = r0.f400070e
            r10 = r9
            rv0.c7 r10 = (rv0.c7) r10
            java.lang.Object r9 = r0.f400069d
            rv0.n1 r9 = (rv0.n1) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L68
        L54:
            kotlin.ResultKt.throwOnFailure(r11)
            gx0.bf r11 = r9.p7()
            r0.f400069d = r9
            r0.f400070e = r10
            r0.f400073h = r6
            java.lang.Object r11 = r11.e7(r0)
            if (r11 != r1) goto L68
            goto La9
        L68:
            gx0.bf r11 = r9.p7()
            r0.f400069d = r9
            r0.f400070e = r10
            r0.f400073h = r5
            r2 = 0
            java.lang.Object r11 = gx0.bf.t7(r11, r2, r0, r6, r7)
            if (r11 != r1) goto L7a
            goto La9
        L7a:
            r8 = r10
            r10 = r9
            r9 = r8
        L7d:
            ex0.a0 r11 = r10.s7()
            if (r11 != 0) goto L85
        L83:
            r1 = r3
            goto La9
        L85:
            ex0.r r11 = r11.n()
            if (r11 != 0) goto L8c
            goto L83
        L8c:
            com.tencent.maas.moviecomposing.segments.Segment r11 = r11.f257167a
            boolean r2 = r11 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r2 == 0) goto L95
            com.tencent.maas.moviecomposing.segments.ClipSegment r11 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r11
            goto L96
        L95:
            r11 = r7
        L96:
            if (r11 != 0) goto L99
            goto L83
        L99:
            gx0.bf r10 = r10.p7()
            r0.f400069d = r7
            r0.f400070e = r7
            r0.f400073h = r4
            java.lang.Object r9 = r10.Z6(r11, r9, r0)
            if (r9 != r1) goto L83
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.n1.k7(rv0.n1, rv0.c7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l7(rv0.n1 r4, java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof rv0.g1
            if (r0 == 0) goto L16
            r0 = r6
            rv0.g1 r0 = (rv0.g1) r0
            int r1 = r0.f400012f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f400012f = r1
            goto L1b
        L16:
            rv0.g1 r0 = new rv0.g1
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f400010d
            pz5.a r6 = pz5.a.f359186d
            int r1 = r0.f400012f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            rv0.h1 r1 = new rv0.h1
            r3 = 0
            r1.<init>(r5, r3)
            r0.f400012f = r2
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r1, r0)
            if (r4 != r6) goto L46
            goto L4c
        L46:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            r6 = r4
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.n1.l7(rv0.n1, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void t7(rv0.n1 n1Var, ex0.a0 a0Var, com.tencent.maas.model.time.MJTime mJTime, int i17, java.lang.Object obj) {
        ex0.v vVar;
        java.util.List list;
        if ((i17 & 2) != 0) {
            mJTime = null;
        }
        int i18 = (int) (n1Var.getContext().getResources().getDisplayMetrics().widthPixels * 0.5f);
        float f17 = 48;
        n1Var.r7().b(a0Var, new bx0.j(e3.d.b(i18, (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17), i18, 0), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17)), n1Var.getMainScope());
        n1Var.r7().setPlaybackStateListener(new rv0.e0(n1Var));
        n1Var.r7().setTimelineScaleListener(new rv0.g0(n1Var));
        n1Var.r7().setScrollTimeChangedListener(new rv0.j0(n1Var, a0Var));
        n1Var.r7().setTimelineDecorationButtonClickListener(new rv0.l0(n1Var));
        n1Var.r7().setLongPressSegmentListener(new rv0.n0(n1Var));
        n1Var.r7().setTimelineItemDecorationTrimListener(new rv0.s0(n1Var, a0Var));
        n1Var.r7().setScrollStateChangeListener(new rv0.v0(n1Var));
        n1Var.r7().setTapSelectSegmentListener(new rv0.w0(n1Var, a0Var));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r76 = n1Var.r7();
        kotlinx.coroutines.y0 mainScope = n1Var.getMainScope();
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        ex0.a0 timelineVM = r76.getTimelineVM();
        if (timelineVM != null && (vVar = timelineVM.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                r76.getThumbnailProviderManager().d(rVar.f257168b);
                if (rVar.f257169c != ug.m.Transition) {
                    kotlinx.coroutines.l.d(mainScope, null, null, new yv0.l(r76, rVar, null), 3, null);
                }
            }
        }
        n1Var.r7().setTransitionTappedCallback(new rv0.x0(a0Var, n1Var));
        n1Var.r7().setTransitionShadowedChecker$plugin_mj_template_release(new rv0.d0(a0Var, n1Var));
        if (mJTime != null) {
            n1Var.z7(mJTime);
        } else {
            n1Var.v7(((gx0.bh) ((jz5.n) n1Var.f400132t).getValue()).b7());
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        rv0.j jVar = new rv0.j(getActivity());
        jVar.setShouldShowAssetAddingEntry(o7().v7().f69344f.f68645e);
        return jVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        rv0.j panel = (rv0.j) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        ex0.a0 s76 = s7();
        if (s76 == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
        } else if (r7().getWidth() <= 0) {
            r7().getViewTreeObserver().addOnGlobalLayoutListener(new rv0.y0(this, s76));
        } else {
            t7(this, s76, null, 2, null);
        }
        panel.setOnEditOperationClickListener(new rv0.r(this));
        ((gx0.gf) ((jz5.n) this.f400135w).getValue()).f276473f.observe(W6(), new rv0.s(this));
        ex0.a0 s77 = s7();
        if (s77 != null) {
            ex0.i0.m(s77);
            androidx.lifecycle.j0 j0Var = s77.f257116z;
            j0Var.setValue(null);
            j0Var.observe(W6(), new rv0.v(this, panel, s77));
            s77.H();
            androidx.lifecycle.j0 j0Var2 = s77.f257115y;
            j0Var2.observe(W6(), new rv0.x(this, s77));
            s77.A.observe(W6(), new rv0.y(this));
            ((zv0.y) ((jz5.n) this.f400136x).getValue()).f476248c.observe(W6(), new rv0.z(this));
            s77.f257106p.observe(W6(), new rv0.a0(panel));
            s77.f257105o.observe(W6(), new rv0.b0(this, panel, s77));
            j0Var2.observe(W6(), new rv0.c0(panel));
            s77.f257114x.observe(W6(), new rv0.q(s77, this));
        }
        ex0.a0 s78 = s7();
        if (s78 == null) {
            return;
        }
        panel.setTimelineViewModel(s78);
        panel.J(s78.y());
        panel.F();
        if (s7() == null) {
            return;
        }
        double s17 = r6.s(r7().getTimelineLayoutType()) * p7().V6().i7().toSeconds();
        rv0.j jVar = (rv0.j) this.f69240i;
        if (jVar != null) {
            jVar.B((int) s17);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        com.tencent.maas.moviecomposing.Timeline o76 = q7().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = q7().h7();
            int k76 = q7().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.g1(m7Var, o76, h76, k76, null), 3, null);
        }
        o7().f2().e(yw0.q.f466585h);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        zw0.b entrance;
        rv0.j jVar = (rv0.j) this.f69240i;
        if (jVar != null && (entrance = jVar.getEntrance()) != null) {
            du0.v0 R6 = R6();
            R6.getClass();
            java.lang.String entryType = entrance.f476559d;
            kotlin.jvm.internal.o.g(entryType, "entryType");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.o1(m7Var, entryType, null), 3, null);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new rv0.c1(this, null), 3, null);
    }

    public final aw0.f m7() {
        return (aw0.f) ((jz5.n) this.f400126n).getValue();
    }

    public final ex0.r n7() {
        ex0.a0 s76 = s7();
        if (s76 != null) {
            return s76.n();
        }
        return null;
    }

    public final gx0.w8 o7() {
        return (gx0.w8) ((jz5.n) this.f400127o).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (2222 == i17 && i18 == -1) {
            java.util.ArrayList parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("key_select_mix_media_list") : null;
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                return;
            }
            kotlinx.coroutines.l.d(getMainScope(), null, null, new rv0.p(this, parcelableArrayListExtra, null), 3, null);
        }
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        aw0.f m76 = m7();
        kotlinx.coroutines.z0.d(m76.f14480b, m76 + " onCleared.", null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        ex0.a0 s76;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (!X6() || (s76 = s7()) == null) {
            return;
        }
        t7(this, s76, null, 2, null);
    }

    public final gx0.bf p7() {
        return (gx0.bf) ((jz5.n) this.f400134v).getValue();
    }

    public final gx0.kh q7() {
        return (gx0.kh) ((jz5.n) this.f400133u).getValue();
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r7() {
        java.lang.Object value = ((jz5.n) this.f400138z).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView) value;
    }

    public final ex0.a0 s7() {
        return q7().f276642r;
    }

    public final boolean u7(com.tencent.maas.moviecomposing.segments.Segment segment) {
        if ((segment != null ? segment.C() : null) != ug.m.ImageClip) {
            if ((segment != null ? segment.C() : null) != ug.m.MovieClip) {
                return false;
            }
        }
        return true;
    }

    public final void v7(com.tencent.maas.model.time.MJTime currentTime) {
        kotlin.jvm.internal.o.g(currentTime, "currentTime");
        y7(currentTime);
        z7(currentTime);
        x7();
    }

    public final void w7() {
        p7().n7();
        ex0.a0 s76 = s7();
        ex0.r n17 = s76 != null ? s76.n() : null;
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f257134j.ordinal();
        com.tencent.maas.model.time.MJTime i76 = ordinal != 1 ? ordinal != 2 ? p7().i7() : fVar.l().getEndTime() : fVar.k();
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) p7().f276258y.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        if (i76.isValid() && mJTime.isValid()) {
            ((gx0.bh) ((jz5.n) this.f400132t).getValue()).i7(i76, mJTime);
        }
    }

    public final void x7() {
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.i(r7(), false, 1, null);
    }

    public final void y7(com.tencent.maas.model.time.MJTime mJTime) {
        ex0.a0 s76;
        ex0.a0 s77 = s7();
        if (s77 == null) {
            return;
        }
        s77.N(mJTime, true);
        ex0.r n17 = s77.n();
        if ((n17 != null ? n17.f257169c : null) != ug.m.Transition && (s76 = s7()) != null) {
            ex0.i0.a(s76, mJTime);
        }
        mJTime.toSeconds();
    }

    public final void z7(com.tencent.maas.model.time.MJTime currentTime) {
        ex0.a0 s76;
        kotlin.jvm.internal.o.g(currentTime, "currentTime");
        if (currentTime.isNumeric() && (s76 = s7()) != null) {
            r7().g(s76.s(r7().getTimelineLayoutType()) * currentTime.toSeconds());
        }
    }
}
