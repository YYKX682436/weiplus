package rv0;

/* loaded from: classes5.dex */
public final class z6 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {
    public kotlinx.coroutines.r2 A;
    public final rv0.r6 B;
    public final rv0.p6 C;
    public final rv0.y5 D;
    public final rv0.w6 E;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f400358n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f400359o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f400360p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f400361q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f400362r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f400363s;

    /* renamed from: t, reason: collision with root package name */
    public final sv0.f f400364t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f400365u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f400366v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView f400367w;

    /* renamed from: x, reason: collision with root package name */
    public final lv0.c f400368x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f400369y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f400370z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f400358n = jz5.h.b(new rv0.r5(this));
        this.f400359o = jz5.h.b(new rv0.x6(this));
        this.f400360p = jz5.h.b(new rv0.v6(this));
        this.f400361q = jz5.h.b(new rv0.s6(this));
        this.f400362r = jz5.h.b(new rv0.t6(this));
        this.f400363s = jz5.h.b(new rv0.v5(this));
        this.f400364t = new sv0.f(new rv0.u5(this));
        this.f400365u = jz5.h.b(new rv0.z5(this));
        this.f400366v = jz5.h.b(new rv0.y6(this));
        this.f400368x = new lv0.c((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 12), 0, 0, 0, 0, null, 62, null);
        this.f400369y = jz5.h.b(new rv0.t5(this));
        this.f400370z = new java.util.concurrent.ConcurrentHashMap();
        this.B = new rv0.r6(this);
        this.C = new rv0.p6(this);
        this.D = new rv0.y5(this);
        this.E = new rv0.w6(this);
    }

    public static final void k7(rv0.z6 z6Var) {
        ex0.r n17;
        ex0.a0 v76 = z6Var.v7();
        java.lang.Object obj = (v76 == null || (n17 = v76.n()) == null) ? null : n17.f257167a;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = obj instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) obj : null;
        if (clipSegment == null || clipSegment.C() == ug.m.ImageClip) {
            return;
        }
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange;
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        if (D != null) {
            mJTimeRange = com.tencent.maas.moviecomposing.segments.ClipSegment.T0(clipSegment, D);
        }
        kotlin.jvm.internal.o.f(mJTimeRange, "getBoundingTimeRangeInMedia(...)");
        com.tencent.maas.model.time.MJTime scrolledTime = z6Var.u7().getScrolledTime();
        com.tencent.maas.model.time.MJTime startTime = mJTimeRange.getStartTime();
        kotlin.jvm.internal.o.f(startTime, "getStartTime(...)");
        com.tencent.maas.model.time.MJTime a17 = ou0.f.a(scrolledTime, startTime);
        com.tencent.maas.model.time.MJTime sub = mJTimeRange.getEndTime().sub(new com.tencent.maas.model.time.MJTime(1L));
        kotlin.jvm.internal.o.f(sub, "sub(...)");
        clipSegment.u0(ou0.f.b(a17, sub));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l7(rv0.z6 r11, com.tencent.maas.base.MJID r12, rv0.c7 r13, kotlin.coroutines.Continuation r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof rv0.p5
            if (r0 == 0) goto L16
            r0 = r14
            rv0.p5 r0 = (rv0.p5) r0
            int r1 = r0.f400186i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f400186i = r1
            goto L1b
        L16:
            rv0.p5 r0 = new rv0.p5
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.f400184g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f400186i
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r11 = r0.f400183f
            com.tencent.maas.model.time.MJTime r11 = (com.tencent.maas.model.time.MJTime) r11
            java.lang.Object r12 = r0.f400182e
            ex0.r r12 = (ex0.r) r12
            java.lang.Object r13 = r0.f400181d
            rv0.z6 r13 = (rv0.z6) r13
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r11
            r11 = r13
            goto L9d
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            kotlin.ResultKt.throwOnFailure(r14)
            ex0.a0 r14 = r11.v7()
            if (r14 != 0) goto L4d
            goto Ld4
        L4d:
            ex0.r r12 = r14.K(r12)
            if (r12 != 0) goto L55
            goto Ld4
        L55:
            com.tencent.maas.moviecomposing.segments.Segment r14 = r12.f257167a
            boolean r2 = r14 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r2 == 0) goto L5e
            com.tencent.maas.moviecomposing.segments.ClipSegment r14 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r14
            goto L5f
        L5e:
            r14 = 0
        L5f:
            if (r14 != 0) goto L62
            goto Ld4
        L62:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r2 = r11.u7()
            com.tencent.maas.model.time.MJTime r2 = r2.getScrolledTime()
            ug.m r5 = ug.m.ImageClip
            ug.m r6 = r12.f257169c
            if (r6 != r5) goto L8a
            com.tencent.maas.model.time.MJTime r12 = r12.k()
            gx0.bf r4 = r11.t7()
            com.tencent.maas.model.time.MJTime r5 = r12.add(r2)
            java.lang.String r11 = "add(...)"
            kotlin.jvm.internal.o.f(r5, r11)
            r6 = 1
            r7 = 0
            r9 = 4
            r10 = 0
            gx0.bf.q7(r4, r5, r6, r7, r9, r10)
            goto Ld4
        L8a:
            gx0.bf r5 = r11.t7()
            r0.f400181d = r11
            r0.f400182e = r12
            r0.f400183f = r2
            r0.f400186i = r4
            java.lang.Object r13 = r5.Z6(r14, r13, r0)
            if (r13 != r1) goto L9d
            goto Ld5
        L9d:
            gx0.bf r13 = r11.t7()
            r13.b7(r2, r4)
            com.tencent.maas.model.time.MJTime r12 = r12.k()
            gx0.bf r13 = r11.t7()
            androidx.lifecycle.g0 r13 = r13.f276258y
            java.lang.Object r13 = r13.getValue()
            com.tencent.maas.model.time.MJTime r13 = (com.tencent.maas.model.time.MJTime) r13
            if (r13 != 0) goto Lb8
            com.tencent.maas.model.time.MJTime r13 = com.tencent.maas.model.time.MJTime.InvalidTime
        Lb8:
            boolean r14 = r13.isValid()
            if (r14 == 0) goto Lcb
            jz5.g r14 = r11.f400359o
            jz5.n r14 = (jz5.n) r14
            java.lang.Object r14 = r14.getValue()
            gx0.bh r14 = (gx0.bh) r14
            r14.i7(r12, r13)
        Lcb:
            gx0.bf r11 = r11.t7()
            r11.getClass()
            r11.M = r12
        Ld4:
            r1 = r3
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.l7(rv0.z6, com.tencent.maas.base.MJID, rv0.c7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7(rv0.z6 r9, rv0.c7 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof rv0.q5
            if (r0 == 0) goto L16
            r0 = r11
            rv0.q5 r0 = (rv0.q5) r0
            int r1 = r0.f400208i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f400208i = r1
            goto L1b
        L16:
            rv0.q5 r0 = new rv0.q5
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f400206g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f400208i
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.ResultKt.throwOnFailure(r11)
            goto L54
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f400205f
            com.tencent.maas.moviecomposing.segments.ClipSegment r9 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r9
            java.lang.Object r10 = r0.f400204e
            rv0.c7 r10 = (rv0.c7) r10
            java.lang.Object r2 = r0.f400203d
            rv0.z6 r2 = (rv0.z6) r2
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r2
            r2 = r9
            r9 = r8
            goto L8d
        L4b:
            kotlin.ResultKt.throwOnFailure(r11)
            ex0.a0 r11 = r9.v7()
            if (r11 != 0) goto L56
        L54:
            r1 = r3
            goto L9f
        L56:
            ex0.r r11 = r11.n()
            if (r11 != 0) goto L5d
            goto L54
        L5d:
            com.tencent.maas.moviecomposing.segments.Segment r2 = r11.f257167a
            boolean r7 = r2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r7 == 0) goto L66
            com.tencent.maas.moviecomposing.segments.ClipSegment r2 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r2
            goto L67
        L66:
            r2 = r6
        L67:
            if (r2 != 0) goto L6a
            goto L54
        L6a:
            gx0.bf r7 = r9.t7()
            boolean r7 = r7.L
            if (r7 == 0) goto L73
            goto L54
        L73:
            ug.m r7 = ug.m.ImageClip
            ug.m r11 = r11.f257169c
            if (r11 != r7) goto L7a
            goto L54
        L7a:
            gx0.bf r11 = r9.t7()
            r0.f400203d = r9
            r0.f400204e = r10
            r0.f400205f = r2
            r0.f400208i = r5
            java.lang.Object r11 = r11.s7(r0)
            if (r11 != r1) goto L8d
            goto L9f
        L8d:
            gx0.bf r9 = r9.t7()
            r0.f400203d = r6
            r0.f400204e = r6
            r0.f400205f = r6
            r0.f400208i = r4
            java.lang.Object r9 = r9.Z6(r2, r10, r0)
            if (r9 != r1) goto L54
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.m7(rv0.z6, rv0.c7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n7(rv0.z6 r4, com.tencent.maas.model.time.MJTime r5, boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof rv0.s5
            if (r0 == 0) goto L16
            r0 = r7
            rv0.s5 r0 = (rv0.s5) r0
            int r1 = r0.f400245i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f400245i = r1
            goto L1b
        L16:
            rv0.s5 r0 = new rv0.s5
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f400243g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f400245i
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r6 = r0.f400242f
            java.lang.Object r4 = r0.f400241e
            r5 = r4
            com.tencent.maas.model.time.MJTime r5 = (com.tencent.maas.model.time.MJTime) r5
            java.lang.Object r4 = r0.f400240d
            rv0.z6 r4 = (rv0.z6) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L53
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.ResultKt.throwOnFailure(r7)
            gx0.bf r7 = r4.t7()
            r0.f400240d = r4
            r0.f400241e = r5
            r0.f400242f = r6
            r0.f400245i = r3
            java.lang.Object r7 = r7.s7(r0)
            if (r7 != r1) goto L53
            goto L5c
        L53:
            gx0.bf r4 = r4.t7()
            r4.b7(r5, r6)
            jz5.f0 r1 = jz5.f0.f302826a
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.n7(rv0.z6, com.tencent.maas.model.time.MJTime, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        rv0.o5 o5Var = new rv0.o5(getActivity());
        o5Var.I(new rv0.i6(this), new rv0.j6(this));
        return o5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gv0.b, androidx.recyclerview.widget.f2, sv0.f] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        ?? r47;
        java.lang.Object obj;
        com.tencent.maas.model.time.MJTime mJTime;
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        com.tencent.maas.base.MJID mjid;
        sv0.h hVar;
        ex0.r n17;
        rv0.o5 panel = (rv0.o5) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        ex0.a0 v76 = v7();
        com.tencent.maas.base.MJID mjid2 = (v76 == null || (n17 = v76.n()) == null) ? null : n17.f257168b;
        if (v76 == null || mjid2 == null) {
            r47 = kz5.p0.f313996d;
        } else {
            java.util.List list = v76.f257097g.f257177e;
            r47 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                if (rVar.f257169c != ug.m.Transition) {
                    hVar = new sv0.h(rVar.f257168b, (long) rVar.i().toMilliseconds(), rVar.f257169c == ug.m.ImageClip, kotlin.jvm.internal.o.b(rVar.f257168b, mjid2));
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    r47.add(hVar);
                }
            }
        }
        ?? r07 = this.f400364t;
        r07.y(r47);
        java.util.ArrayList arrayList = r07.f275970d;
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it6.next();
                if (((sv0.h) obj).f413226d) {
                    break;
                }
            }
        }
        sv0.h hVar2 = (sv0.h) obj;
        if (hVar2 != null && (mjid = hVar2.f413223a) != null) {
            kotlinx.coroutines.l.d(getLifecycleScope(), kotlinx.coroutines.q1.f310570c, null, new rv0.f6(this, mjid, null), 2, null);
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            kotlinx.coroutines.l.d(getLifecycleScope(), kotlinx.coroutines.q1.f310570c, null, new rv0.g6(this, (sv0.h) it7.next(), null), 2, null);
        }
        ?? p76 = p7();
        p76.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(p76.getContext(), 0, false));
        androidx.recyclerview.widget.n2 itemAnimator = p76.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        p76.setAdapter(r07);
        lv0.c cVar = this.f400368x;
        p76.S0(cVar);
        p76.N(cVar);
        r07.f413222h = new rv0.a6(this);
        rv0.k6 k6Var = new rv0.k6(this);
        ex0.a0 v77 = v7();
        if (v77 != null) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.s_8);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f400367w = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView) findViewById;
            u7().post(new rv0.h6(this, v77, k6Var));
        }
        ex0.a0 v78 = v7();
        if (v78 != null && (j0Var2 = v78.f257115y) != null) {
            j0Var2.observe(W6(), new rv0.b6(this));
        }
        ex0.a0 v79 = v7();
        if (v79 != null && (j0Var = v79.A) != null) {
            j0Var.observe(W6(), new rv0.d6(this));
        }
        ((gx0.gf) ((jz5.n) this.f400362r).getValue()).f276473f.observe(W6(), new rv0.e6(this));
        panel.H();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f400370z;
        concurrentHashMap.clear();
        ex0.a0 v710 = v7();
        if (v710 != null) {
            java.util.Iterator it8 = ((java.util.ArrayList) v710.f257097g.f257177e).iterator();
            while (it8.hasNext()) {
                ex0.r rVar2 = (ex0.r) it8.next();
                ug.m mVar = rVar2.f257169c;
                if (mVar == ug.m.VideoClip || mVar == ug.m.MovieClip) {
                    com.tencent.maas.model.time.MJTimeRange m17 = rVar2.m();
                    if (m17 == null || (mJTime = m17.getStartTime()) == null) {
                        mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
                    }
                    kotlin.jvm.internal.o.d(mJTime);
                    concurrentHashMap.put(rVar2.f257168b, mJTime);
                }
            }
        }
        panel.setResult(java.lang.Boolean.TRUE);
        gx0.bh bhVar = (gx0.bh) ((jz5.n) this.f400359o).getValue();
        rv0.l6 l6Var = new rv0.l6(this);
        bhVar.getClass();
        bhVar.L.addFirst(l6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.getShouldTakeSnapshotWhenClose$plugin_mj_template_release() == true) goto L8;
     */
    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e7() {
        /*
            r10 = this;
            com.tencent.maas.model.time.MJTime r0 = r10.s7()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r10.f69240i
            rv0.o5 r1 = (rv0.o5) r1
            if (r1 == 0) goto L12
            boolean r1 = r1.getShouldTakeSnapshotWhenClose$plugin_mj_template_release()
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L18
            r10.x7()
        L18:
            gx0.bf r1 = r10.t7()
            r1.getClass()
            com.tencent.maas.model.time.MJTime r2 = com.tencent.maas.model.time.MJTime.InvalidTime
            java.lang.String r3 = "InvalidTime"
            kotlin.jvm.internal.o.f(r2, r3)
            r1.M = r2
            r5 = 0
            r6 = 0
            rv0.m6 r7 = new rv0.m6
            r1 = 0
            r7.<init>(r10, r0, r1)
            r8 = 3
            r9 = 0
            r4 = r10
            pf5.e.launchUI$default(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.e7():void");
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor o7() {
        java.lang.Object value = ((jz5.n) this.f400369y).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor) value;
    }

    public final androidx.recyclerview.widget.RecyclerView p7() {
        java.lang.Object value = ((jz5.n) this.f400363s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final com.tencent.maas.base.MJID q7() {
        java.lang.Object obj;
        java.util.Iterator it = this.f400364t.f275970d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sv0.h) obj).f413226d) {
                break;
            }
        }
        sv0.h hVar = (sv0.h) obj;
        if (hVar != null) {
            return hVar.f413223a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.maas.model.time.MJTime r7(java.lang.Double r8) {
        /*
            r7 = this;
            ex0.a0 r0 = r7.v7()
            r1 = 0
            if (r0 == 0) goto L14
            com.tencent.maas.base.MJID r2 = r7.q7()
            ex0.r r0 = r0.K(r2)
            if (r0 == 0) goto L14
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f257167a
            goto L15
        L14:
            r0 = r1
        L15:
            boolean r2 = r0 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r2 == 0) goto L1c
            com.tencent.maas.moviecomposing.segments.ClipSegment r0 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r0
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r2 = 1
            if (r0 == 0) goto L45
            double r3 = r0.v1()
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            double r3 = r0.doubleValue()
            boolean r5 = java.lang.Double.isInfinite(r3)
            if (r5 != 0) goto L3a
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L3e
            r1 = r0
        L3e:
            if (r1 == 0) goto L45
            double r0 = r1.doubleValue()
            goto L47
        L45:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L47:
            if (r8 == 0) goto L4e
            double r3 = r8.doubleValue()
            goto L56
        L4e:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor r8 = r7.o7()
            double r3 = r8.getCurrentCursorOffset()
        L56:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r8 = r7.u7()
            double r5 = r8.getScrolledX()
            double r3 = r3 + r5
            ex0.a0 r8 = r7.v7()
            if (r8 == 0) goto L72
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r5 = r7.u7()
            bx0.i r5 = r5.getTimelineLayoutType()
            float r8 = r8.s(r5)
            goto L74
        L72:
            r8 = 1065353216(0x3f800000, float:1.0)
        L74:
            double r5 = (double) r8
            double r3 = r3 / r5
            com.tencent.maas.model.time.MJTime r8 = com.tencent.maas.model.time.MJTime.fromSeconds(r3)
            r8.toSeconds()
            com.tencent.maas.model.time.MJTime r8 = com.tencent.maas.model.time.MJTime.fromSeconds(r3)
            double r2 = (double) r2
            double r2 = r2 / r0
            com.tencent.maas.model.time.MJTime r8 = r8.multi(r2)
            java.lang.String r0 = "multi(...)"
            kotlin.jvm.internal.o.f(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.r7(java.lang.Double):com.tencent.maas.model.time.MJTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.maas.model.time.MJTime s7() {
        /*
            r7 = this;
            ex0.a0 r0 = r7.v7()
            r1 = 0
            if (r0 == 0) goto L14
            com.tencent.maas.base.MJID r2 = r7.q7()
            ex0.r r0 = r0.K(r2)
            if (r0 == 0) goto L14
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f257167a
            goto L15
        L14:
            r0 = r1
        L15:
            boolean r2 = r0 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r2 == 0) goto L1c
            com.tencent.maas.moviecomposing.segments.ClipSegment r0 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r0
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r2 = 1
            if (r0 == 0) goto L45
            double r3 = r0.v1()
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            double r3 = r0.doubleValue()
            boolean r5 = java.lang.Double.isInfinite(r3)
            if (r5 != 0) goto L3a
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 == 0) goto L3e
            r1 = r0
        L3e:
            if (r1 == 0) goto L45
            double r0 = r1.doubleValue()
            goto L47
        L45:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L47:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineCursor r3 = r7.o7()
            double r3 = r3.getCurrentCursorOffset()
            ex0.a0 r5 = r7.v7()
            if (r5 == 0) goto L62
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView r6 = r7.u7()
            bx0.i r6 = r6.getTimelineLayoutType()
            float r5 = r5.s(r6)
            goto L64
        L62:
            r5 = 1065353216(0x3f800000, float:1.0)
        L64:
            double r5 = (double) r5
            double r3 = r3 / r5
            com.tencent.maas.model.time.MJTime r3 = com.tencent.maas.model.time.MJTime.fromSeconds(r3)
            double r4 = (double) r2
            double r4 = r4 / r0
            com.tencent.maas.model.time.MJTime r0 = r3.multi(r4)
            java.lang.String r1 = "multi(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.s7():com.tencent.maas.model.time.MJTime");
    }

    public final gx0.bf t7() {
        return (gx0.bf) ((jz5.n) this.f400361q).getValue();
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView u7() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView clipStorylineSegmentTimelineView = this.f400367w;
        if (clipStorylineSegmentTimelineView != null) {
            return clipStorylineSegmentTimelineView;
        }
        kotlin.jvm.internal.o.o("timelineView");
        throw null;
    }

    public final ex0.a0 v7() {
        return ((gx0.kh) ((jz5.n) this.f400360p).getValue()).f276642r;
    }

    public final void w7(com.tencent.maas.base.MJID mjid) {
        ex0.a0 v76 = v7();
        if (v76 == null) {
            return;
        }
        ex0.r K = v76.K(mjid);
        ex0.c cVar = K instanceof ex0.c ? (ex0.c) K : null;
        if (cVar == null) {
            return;
        }
        t7().o7(cVar.B(), true);
        v76.l(cVar);
        u7().n(mjid);
        pf5.e.launchUI$default(this, null, null, new rv0.u6(this, mjid, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.getUserActed$plugin_mj_template_release() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x7() {
        /*
            r3 = this;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r3.f69240i
            rv0.o5 r0 = (rv0.o5) r0
            if (r0 == 0) goto Le
            boolean r0 = r0.getUserActed$plugin_mj_template_release()
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L2f
            jz5.g r0 = r3.f400360p
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            gx0.kh r0 = (gx0.kh) r0
            android.app.Activity r1 = r3.getContext()
            r2 = 2131771427(0x7f104023, float:1.9174185E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r2 = 0
            r0.r7(r1, r2)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z6.x7():void");
    }
}
