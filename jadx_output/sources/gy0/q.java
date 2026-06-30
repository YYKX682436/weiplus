package gy0;

/* loaded from: classes5.dex */
public final class q extends androidx.recyclerview.widget.p2 implements fy0.k {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final int E;
    public float F;
    public bx0.c G;
    public final android.graphics.PointF H;
    public final android.graphics.PointF I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.PointF f277520J;
    public boolean K;
    public boolean L;
    public com.tencent.maas.base.MJID M;
    public com.tencent.maas.base.MJID N;
    public final android.graphics.RectF P;
    public final android.graphics.RectF Q;
    public final jz5.g R;
    public boolean S;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f277521d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f277522e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0.a0 f277523f;

    /* renamed from: g, reason: collision with root package name */
    public final bx0.h f277524g;

    /* renamed from: h, reason: collision with root package name */
    public gy0.i f277525h;

    /* renamed from: i, reason: collision with root package name */
    public gy0.f f277526i;

    /* renamed from: m, reason: collision with root package name */
    public gy0.j f277527m;

    /* renamed from: n, reason: collision with root package name */
    public gy0.h f277528n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f277529o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f277530p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f277531q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f277532r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f277533s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f277534t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f277535u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.maas.base.MJID f277536v;

    /* renamed from: w, reason: collision with root package name */
    public long f277537w;

    /* renamed from: x, reason: collision with root package name */
    public final int f277538x;

    /* renamed from: y, reason: collision with root package name */
    public final gy0.d f277539y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f277540z;

    public q(android.content.Context context, com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView timelineView, ex0.a0 timelineVM, bx0.h layoutCalc, gy0.e autoScrolledListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(timelineView, "timelineView");
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(layoutCalc, "layoutCalc");
        kotlin.jvm.internal.o.g(autoScrolledListener, "autoScrolledListener");
        this.f277521d = context;
        this.f277522e = timelineView;
        this.f277523f = timelineVM;
        this.f277524g = layoutCalc;
        this.f277529o = jz5.h.b(new gy0.o(this));
        this.f277530p = new java.util.ArrayList();
        this.f277531q = new android.graphics.Rect();
        this.f277532r = new android.graphics.Rect();
        this.f277533s = jz5.h.b(new gy0.n(this));
        this.f277537w = -1L;
        this.f277538x = android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f277539y = new gy0.d(timelineView, 50.0d, new gy0.l(this), layoutCalc);
        this.f277540z = new java.util.ArrayList();
        this.E = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 30);
        this.F = -1.0f;
        this.H = new android.graphics.PointF();
        this.I = new android.graphics.PointF();
        this.f277520J = new android.graphics.PointF();
        this.P = new android.graphics.RectF();
        this.Q = new android.graphics.RectF();
        this.R = jz5.h.b(new gy0.p(this));
    }

    public final boolean d(float f17, com.tencent.maas.base.MJID mjid) {
        ex0.a0 timelineViewModel = this.f277523f;
        ex0.r n17 = timelineViewModel.n();
        ex0.r rVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (rVar == null) {
            return false;
        }
        int ordinal = rVar.f257169c.ordinal();
        bx0.h layoutCalc = this.f277524g;
        switch (ordinal) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 7:
            case 8:
            case 9:
                android.graphics.Rect b17 = layoutCalc.b(mjid, false);
                if (b17.isEmpty()) {
                    return false;
                }
                bx0.f fVar = layoutCalc.f36277d;
                return (((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) < 0 && b17.left <= fVar.f36266r.f247044a) || ((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) > 0 && b17.right >= layoutCalc.e() - fVar.f36266r.f247046c)) ? false : true;
            case 6:
            case 10:
            default:
                return true;
            case 11:
                ex0.q qVar = rVar instanceof ex0.q ? (ex0.q) rVar : null;
                if (qVar == null) {
                    return false;
                }
                kotlin.jvm.internal.o.g(timelineViewModel, "timelineViewModel");
                kotlin.jvm.internal.o.g(layoutCalc, "layoutCalc");
                android.graphics.Rect b18 = layoutCalc.b(qVar.f257168b, false);
                android.graphics.Rect rect = new android.graphics.Rect();
                if (b18.isEmpty()) {
                    return false;
                }
                int i17 = (int) f17;
                rect.set(b18.left + i17, b18.top, b18.right + i17, b18.bottom);
                bx0.f fVar2 = layoutCalc.f36277d;
                boolean z17 = f17 < 0.0f && b18.left <= fVar2.f36266r.f247044a;
                boolean z18 = f17 > 0.0f && b18.right >= layoutCalc.e() - fVar2.f36266r.f247046c;
                if (qVar.J(timelineViewModel)) {
                    if (z17 || z18) {
                        return false;
                    }
                } else if (z17 || z18 || qVar.K(rect, timelineViewModel, layoutCalc)) {
                    return false;
                }
                return true;
            case 12:
                ex0.b bVar = rVar instanceof ex0.b ? (ex0.b) rVar : null;
                if (bVar == null) {
                    return false;
                }
                kotlin.jvm.internal.o.g(timelineViewModel, "timelineViewModel");
                kotlin.jvm.internal.o.g(layoutCalc, "layoutCalc");
                android.graphics.Rect b19 = layoutCalc.b(bVar.f257168b, false);
                android.graphics.Rect rect2 = new android.graphics.Rect();
                if (b19.isEmpty()) {
                    return false;
                }
                int i18 = (int) f17;
                rect2.set(b19.left + i18, b19.top, b19.right + i18, b19.bottom);
                bx0.f fVar3 = layoutCalc.f36277d;
                boolean z19 = f17 < 0.0f && b19.left <= fVar3.f36266r.f247044a;
                boolean z27 = f17 > 0.0f && b19.right >= layoutCalc.e() - fVar3.f36266r.f247046c;
                if (bVar.G(timelineViewModel)) {
                    if (z19 || z27) {
                        return false;
                    }
                } else if (z19 || z27 || bVar.H(rect2, timelineViewModel, layoutCalc)) {
                    return false;
                }
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0113, code lost:
    
        if (r5.H(r9, r2, r7) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d7, code lost:
    
        if (r5.K(r6, r2, r7) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032a, code lost:
    
        if (r5.K(r6, r2, r7) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x024d, code lost:
    
        if (r5.K(r4, r2, r7) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x027c, code lost:
    
        if (r5.K(r4, r2, r7) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
    
        if (r5.H(r4, r2, r7) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c1, code lost:
    
        if (r5.H(r4, r2, r7) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e5, code lost:
    
        if (r5.H(r9, r2, r7) == false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [ex0.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(float r17) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gy0.q.e(float):boolean");
    }

    public final void f(com.tencent.maas.base.MJID mjid, float f17, gy0.g moveType) {
        ex0.f fVar;
        android.graphics.Rect b17;
        bx0.c cVar = this.G;
        if (cVar == null || (fVar = cVar.f36241f) == null || !d(f17, mjid)) {
            return;
        }
        bx0.c cVar2 = this.G;
        bx0.h hVar = this.f277524g;
        if (cVar2 == null || (b17 = cVar2.f36237b) == null) {
            b17 = hVar.b(mjid, false);
        }
        float f18 = hVar.f36277d.f36266r.f247044a;
        float e17 = hVar.e() - hVar.f36277d.f36266r.f247046c;
        int width = b17.width();
        this.f277535u = true;
        float f19 = b17.left + (this.f277520J.x - this.H.x);
        ex0.a0 a0Var = this.f277523f;
        com.tencent.maas.model.time.MJTime startTime = f19 <= f18 ? a0Var.q().getStartTime() : ((float) width) + f19 >= e17 ? a0Var.q().getEndTime().sub(fVar.j()) : com.tencent.maas.model.time.MJTime.fromSeconds((f19 - f18) / a0Var.s(this.f277522e.getTimelineLayoutType()));
        kotlin.jvm.internal.o.d(startTime);
        ex0.r n17 = a0Var.n();
        com.tencent.maas.moviecomposing.segments.Segment segment = n17 != null ? n17.f257167a : null;
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ElementSegment ? (com.tencent.maas.moviecomposing.segments.ElementSegment) segment : null;
        if (elementSegment != null) {
            com.tencent.maas.base.MJID mjid2 = this.N;
            com.tencent.maas.base.MJID mjid3 = elementSegment.f48532a;
            if (kotlin.jvm.internal.o.b(mjid3, mjid2)) {
                kotlin.jvm.internal.o.f(mjid3, "getSegmentID(...)");
                kotlin.jvm.internal.o.g(moveType, "moveType");
                a0Var.f257092b.u(mjid3, null, startTime);
                int ordinal = moveType.ordinal();
                if (ordinal == 0) {
                    java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224510f);
                    kotlin.jvm.internal.o.f(of6, "of(...)");
                    a0Var.J(of6, null);
                } else if (ordinal == 1) {
                    java.util.EnumSet of7 = java.util.EnumSet.of(cx0.d.f224510f);
                    kotlin.jvm.internal.o.f(of7, "of(...)");
                    a0Var.J(of7, cx0.e.f224515g);
                }
            }
        }
        gy0.j jVar = this.f277527m;
        if (jVar != null) {
            jVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r5 > r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r5 < r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(bx0.c r20, com.tencent.maas.moviecomposing.segments.ElementSegment r21, float r22, gy0.k r23) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gy0.q.g(bx0.c, com.tencent.maas.moviecomposing.segments.ElementSegment, float, gy0.k):void");
    }

    public final int h() {
        return ((java.lang.Number) ((jz5.n) this.f277533s).getValue()).intValue();
    }

    public final int i() {
        return ((java.lang.Number) ((jz5.n) this.R).getValue()).intValue();
    }

    public boolean j(android.view.MotionEvent e17) {
        com.tencent.maas.base.MJID mjid;
        hy0.y2 y2Var;
        com.tencent.maas.base.MJID mjid2;
        gy0.i iVar;
        kotlin.jvm.internal.o.g(e17, "e");
        if (!this.A) {
            return false;
        }
        double x17 = e17.getX();
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f277522e;
        int scrolledX = (int) (x17 + baseTimelineView.getScrolledX());
        int y17 = (int) e17.getY();
        boolean z17 = this.K;
        bx0.h hVar = this.f277524g;
        if (!z17 && !this.L) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f36278e;
            if (concurrentHashMap.isEmpty()) {
                y2Var = null;
            } else {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (((android.graphics.RectF) entry.getValue()).contains(scrolledX, y17)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                y2Var = (hy0.y2) kz5.n0.Y(linkedHashMap.keySet());
            }
            if (y2Var != null && (iVar = this.f277525h) != null) {
                rv0.l0 l0Var = (rv0.l0) iVar;
                if (rv0.k0.f400074a[y2Var.ordinal()] == 1) {
                    ((gx0.p9) ((jz5.n) l0Var.f400097a.f400128p).getValue()).r7(zw0.b.f476551e);
                }
                return true;
            }
            java.util.Iterator it = ((java.util.LinkedHashMap) hVar.f36277d.f36263o).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    mjid2 = null;
                    break;
                }
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                mjid2 = ((android.graphics.Rect) entry2.getValue()).contains(scrolledX, y17) ? (com.tencent.maas.base.MJID) entry2.getKey() : null;
                if (mjid2 != null) {
                    break;
                }
            }
            if (mjid2 != null && this.f277534t != null) {
                gy0.h hVar2 = this.f277528n;
                if (hVar2 != null) {
                    hVar2.a(mjid2);
                }
                yz5.l lVar = this.f277534t;
                if (lVar != null) {
                    lVar.invoke(mjid2);
                }
                return true;
            }
        }
        java.util.Iterator it6 = ((java.util.LinkedHashMap) hVar.f36277d.f36262n).entrySet().iterator();
        while (true) {
            if (!it6.hasNext()) {
                mjid = null;
                break;
            }
            java.util.Map.Entry entry3 = (java.util.Map.Entry) it6.next();
            mjid = ((android.graphics.Rect) entry3.getValue()).contains(scrolledX, y17) ? (com.tencent.maas.base.MJID) entry3.getKey() : null;
            if (mjid != null) {
                break;
            }
        }
        ex0.a0 a0Var = this.f277523f;
        ex0.r K = a0Var.K(mjid);
        if ((K != null ? K.f257169c : null) == ug.m.Transition) {
            return true;
        }
        if (this.D && K != null) {
            ug.m mVar = ug.m.ImageClip;
            ug.m mVar2 = K.f257169c;
            if (mVar2 == mVar || mVar2 == ug.m.MovieClip) {
                mjid = null;
            }
        }
        if (mjid != null) {
            mjid.toString();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!kotlin.jvm.internal.o.b(mjid, this.f277536v) || currentTimeMillis - this.f277537w >= this.f277538x) {
                this.f277536v = mjid;
                this.f277537w = currentTimeMillis;
                if (!this.K && !this.L) {
                    ex0.i0.j(a0Var, mjid);
                    gy0.h hVar3 = this.f277528n;
                    if (hVar3 != null) {
                        hVar3.a(mjid);
                    }
                }
            } else {
                this.f277536v = null;
                this.f277537w = -1L;
                gy0.h hVar4 = this.f277528n;
                if (hVar4 != null) {
                    hVar4.b(mjid);
                }
            }
        } else if (!this.K && !this.L) {
            ex0.i0.l(a0Var);
        }
        baseTimelineView.post(new gy0.m(this));
        return true;
    }

    public void k(android.view.MotionEvent e17) {
        gy0.j jVar;
        kotlin.jvm.internal.o.g(e17, "e");
        this.f277539y.f277507f = false;
        ex0.a0 a0Var = this.f277523f;
        int ordinal = a0Var.r().ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
            a0Var.n();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            boolean z17 = this.K;
            if (z17 || this.L) {
                gy0.j jVar2 = this.f277527m;
                if (jVar2 != null) {
                    jVar2.b(z17, this.f277535u);
                }
                ex0.i0.i(a0Var);
                gy0.j jVar3 = this.f277527m;
                if (jVar3 != null) {
                    jVar3.f();
                }
            }
            if (this.N != null && (jVar = this.f277527m) != null) {
                jVar.a(this.f277535u);
            }
            this.f277522e.post(new gy0.m(this));
        }
        this.f277535u = false;
        this.G = null;
        this.K = false;
        this.L = false;
        this.N = null;
        this.M = null;
    }

    public final void l(java.util.List timelineDrawerList) {
        kotlin.jvm.internal.o.g(timelineDrawerList, "timelineDrawerList");
        java.util.ArrayList arrayList = this.f277530p;
        arrayList.clear();
        arrayList.addAll(timelineDrawerList);
    }

    public final void m(ex0.r rVar) {
        boolean o17 = rVar.o();
        com.tencent.maas.base.MJID mjid = rVar.f257168b;
        if (o17) {
            this.M = mjid;
            return;
        }
        ex0.a0 a0Var = this.f277523f;
        ex0.r n17 = a0Var.n();
        if (kotlin.jvm.internal.o.b(mjid, n17 != null ? n17.f257168b : null)) {
            ex0.r n18 = a0Var.n();
            if ((n18 != null ? n18.f257171e : null) == ax0.b.f14965e) {
                this.M = mjid;
            }
        }
    }

    public boolean n() {
        return this.K || this.L || this.N != null;
    }

    public final void o(gy0.b direction, gy0.c touchType) {
        java.util.Objects.toString(direction);
        java.util.Objects.toString(touchType);
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f277522e;
        baseTimelineView.getScrolledX();
        baseTimelineView.getTimelineViewContentWidth();
        h();
        baseTimelineView.getTimelineViewContentWidth();
        gy0.d dVar = this.f277539y;
        dVar.getClass();
        kotlin.jvm.internal.o.g(direction, "direction");
        kotlin.jvm.internal.o.g(touchType, "touchType");
        dVar.f277508g = direction;
        dVar.f277507f = true;
        fy0.i.b(dVar);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDrawOver(c17, parent, state);
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f277522e;
        this.f277532r.set((int) baseTimelineView.getScrolledX(), 0, ((int) baseTimelineView.getScrolledX()) + h(), baseTimelineView.getHeight());
        ex0.a0 a0Var = this.f277523f;
        ex0.o o17 = a0Var.o();
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView2 = this.f277522e;
        hy0.z2 z2Var = new hy0.z2(baseTimelineView2, this.f277523f, this.f277524g, this.f277532r, bx0.b.b(baseTimelineView2.getInsets().f247044a, baseTimelineView.getInsets().f247045b, (baseTimelineView.getTimelineViewContentWidth() - baseTimelineView.getInsets().f247044a) - baseTimelineView.getInsets().f247046c, baseTimelineView.getStorylineHeight()), o17);
        bx0.h hVar = this.f277524g;
        float f17 = -((float) hVar.f36279f);
        int save = c17.save();
        c17.translate(f17, 0.0f);
        try {
            java.util.Iterator it = this.f277530p.iterator();
            while (it.hasNext()) {
                ((iy0.c) it.next()).a(c17, z2Var);
            }
            c17.restoreToCount(save);
            ex0.r n17 = a0Var.n();
            if (n17 == null || !a0Var.A()) {
                return;
            }
            android.graphics.Rect d17 = hVar.d(n17.f257168b, n17.f257170d);
            int width = d17.width();
            float f18 = d17.left;
            float f19 = d17.right;
            float f27 = d17.top;
            float f28 = d17.bottom;
            android.graphics.RectF rectF = this.P;
            float i17 = f18 - i();
            float i18 = f27 - i();
            int i19 = i();
            int i27 = width / 2;
            if (i19 > i27) {
                i19 = i27;
            }
            rectF.set(i17, i18, f18 + i19, i() + f28);
            android.graphics.RectF rectF2 = this.Q;
            int i28 = i();
            if (i28 <= i27) {
                i27 = i28;
            }
            rectF2.set(f19 - i27, f27 - i(), f19 + i(), f28 + i());
        } catch (java.lang.Throwable th6) {
            c17.restoreToCount(save);
            throw th6;
        }
    }
}
