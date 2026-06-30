package gx0;

/* loaded from: classes5.dex */
public final class m4 extends hw0.z {

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f276697w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f276698x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f276699y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276697w = jz5.h.b(new gx0.l4(this));
        this.f276698x = jz5.h.b(new gx0.i4(this));
        this.f276699y = jz5.h.b(new gx0.j4(this));
    }

    @Override // hw0.z
    public du0.o A7() {
        return (du0.o) T6(gx0.x4.class);
    }

    @Override // hw0.z
    public gx0.hf B7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // hw0.z
    public java.lang.Object D7(java.lang.String text, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        ex0.k H7 = H7(mjid);
        if (H7 != null) {
            kotlin.jvm.internal.o.g(text, "text");
            com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment = H7.f257144p;
            fancyTextSegment.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline D = fancyTextSegment.D();
            if (D != null) {
                bool = com.tencent.maas.moviecomposing.segments.FancyTextSegment.x0(fancyTextSegment, text, D);
            }
            bool.booleanValue();
            gx0.bf I7 = I7();
            com.tencent.maas.model.time.MJTimeRange B = H7.f257167a.B();
            kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(I7, B);
        }
        java.lang.Object d76 = gx0.bf.d7(I7(), null, null, false, continuation, 7, null);
        return d76 == pz5.a.f359186d ? d76 : jz5.f0.f302826a;
    }

    @Override // hw0.z
    public void E7() {
        com.tencent.maas.base.MJID mjid = this.f285498u;
        ex0.a0 a0Var = J7().f276642r;
        ex0.v vVar = a0Var != null ? a0Var.f257097g : null;
        if (mjid != null) {
            if ((vVar == null || vVar.b(mjid)) ? false : true) {
                return;
            }
            ex0.k H7 = H7(mjid);
            java.lang.Object obj = H7 != null ? H7.f257167a : null;
            com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment = obj instanceof com.tencent.maas.moviecomposing.segments.FancyTextSegment ? (com.tencent.maas.moviecomposing.segments.FancyTextSegment) obj : null;
            if (fancyTextSegment != null) {
                java.lang.String N0 = fancyTextSegment.N0();
                kotlin.jvm.internal.o.f(N0, "getTitle(...)");
                if (N0.length() == 0) {
                    com.tencent.maas.moviecomposing.Timeline D = fancyTextSegment.D();
                    if ((D != null ? com.tencent.maas.moviecomposing.segments.FancyTextSegment.K0(fancyTextSegment, D) : "").length() == 0) {
                        return;
                    }
                }
            }
            com.tencent.maas.model.time.MJTime mJTime = (ou0.g) I7().A.getValue();
            if (mJTime == null) {
                mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            }
            gx0.kh J7 = J7();
            java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.mbv);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            J7.r7(string, mJTime);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1.b(r0) == true) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // hw0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F7() {
        /*
            r6 = this;
            com.tencent.maas.base.MJID r0 = r6.f285498u
            gx0.kh r1 = r6.J7()
            ex0.a0 r1 = r1.f276642r
            r2 = 0
            if (r1 == 0) goto Le
            ex0.v r1 = r1.f257097g
            goto Lf
        Le:
            r1 = r2
        Lf:
            android.app.Activity r3 = r6.getContext()
            android.content.res.Resources r3 = j65.q.a(r3)
            r4 = 2131771420(0x7f10401c, float:1.917417E38)
            java.lang.String r3 = r3.getString(r4)
            if (r0 == 0) goto L61
            if (r1 == 0) goto L2a
            boolean r1 = r1.b(r0)
            r5 = 1
            if (r1 != r5) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L61
            ex0.k r0 = r6.H7(r0)
            if (r0 == 0) goto L36
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f257167a
            goto L37
        L36:
            r0 = r2
        L37:
            boolean r1 = r0 instanceof com.tencent.maas.moviecomposing.segments.FancyTextSegment
            if (r1 == 0) goto L3e
            com.tencent.maas.moviecomposing.segments.FancyTextSegment r0 = (com.tencent.maas.moviecomposing.segments.FancyTextSegment) r0
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.N0()
            java.lang.String r1 = "getTitle(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r1 = r6.f285499v
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 != 0) goto L6d
            android.app.Activity r0 = r6.getContext()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r2 = r0.getString(r4)
            goto L6d
        L5f:
            r2 = r3
            goto L6d
        L61:
            android.app.Activity r0 = r6.getContext()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r2 = r0.getString(r4)
        L6d:
            if (r2 == 0) goto L87
            gx0.bf r0 = r6.I7()
            androidx.lifecycle.g0 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            ou0.g r0 = (ou0.g) r0
            if (r0 == 0) goto L7e
            goto L80
        L7e:
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.ZeroTime
        L80:
            gx0.kh r1 = r6.J7()
            r1.r7(r2, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.m4.F7():void");
    }

    public final ex0.k H7(com.tencent.maas.base.MJID mjid) {
        return J7().i7(mjid);
    }

    public final gx0.bf I7() {
        return (gx0.bf) ((jz5.n) this.f276698x).getValue();
    }

    public final gx0.kh J7() {
        return (gx0.kh) ((jz5.n) this.f276697w).getValue();
    }

    @Override // hw0.z
    public void s7() {
        bu0.a u76 = u7();
        ex0.k kVar = u76 instanceof ex0.k ? (ex0.k) u76 : null;
        if (kVar == null) {
            return;
        }
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f285493p).getValue();
        com.tencent.maas.base.MJID mjid = kVar.f257167a.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        gx0.hf.V6(hfVar, mjid, null, 2, null);
    }

    @Override // hw0.z
    public void t7() {
        ex0.a0 a0Var;
        com.tencent.maas.base.MJID mjid = this.f285498u;
        if (mjid != null) {
            ex0.k H7 = H7(mjid);
            com.tencent.maas.moviecomposing.segments.Segment segment = H7 != null ? H7.f257167a : null;
            com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment = segment instanceof com.tencent.maas.moviecomposing.segments.FancyTextSegment ? (com.tencent.maas.moviecomposing.segments.FancyTextSegment) segment : null;
            if (fancyTextSegment != null) {
                java.lang.String N0 = fancyTextSegment.N0();
                kotlin.jvm.internal.o.f(N0, "getTitle(...)");
                if (N0.length() == 0) {
                    com.tencent.maas.moviecomposing.Timeline D = fancyTextSegment.D();
                    if (((D != null ? com.tencent.maas.moviecomposing.segments.FancyTextSegment.K0(fancyTextSegment, D) : "").length() == 0) && (a0Var = J7().f276642r) != null) {
                        com.tencent.maas.base.MJID mjid2 = this.f285498u;
                        if (mjid2 != null && a0Var.G(mjid2, true, ax0.e.f14975d)) {
                            this.f285498u = null;
                        }
                        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.k4(this, null), 3, null);
                    }
                }
                if (kotlin.jvm.internal.o.b(this.f285499v, fancyTextSegment.N0())) {
                    return;
                }
                java.lang.String N02 = fancyTextSegment.N0();
                kotlin.jvm.internal.o.f(N02, "getTitle(...)");
                if (N02.length() > 0) {
                    gx0.w.V6((gx0.w) ((jz5.n) this.f285496s).getValue(), null, fancyTextSegment, new gx0.g4(this), 1, null);
                }
            }
        }
    }

    @Override // hw0.z
    public bu0.a u7() {
        com.tencent.maas.base.MJID mjid = this.f285498u;
        if (mjid == null) {
            return null;
        }
        return H7(mjid);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r2.b(r0) == true) goto L22;
     */
    @Override // hw0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w7() {
        /*
            r5 = this;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r5.f69240i
            hw0.p r0 = (hw0.p) r0
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = "key_mj_id"
            r3 = 2
            java.lang.Object r0 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(r0, r2, r1, r3, r1)
            com.tencent.maas.base.MJID r0 = (com.tencent.maas.base.MJID) r0
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 != 0) goto L15
            return
        L15:
            ex0.k r0 = r5.H7(r0)
            if (r0 == 0) goto L72
            com.tencent.maas.base.MJID r0 = r0.f257168b
            if (r0 != 0) goto L20
            goto L72
        L20:
            r5.f285498u = r0
            gx0.kh r2 = r5.J7()
            ex0.a0 r2 = r2.f276642r
            if (r2 == 0) goto L2d
            ex0.v r2 = r2.f257097g
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L38
            boolean r2 = r2.b(r0)
            r3 = 1
            if (r2 != r3) goto L38
            goto L39
        L38:
            r3 = 0
        L39:
            java.lang.String r2 = ""
            if (r3 == 0) goto L6f
            ex0.k r3 = r5.H7(r0)
            if (r3 == 0) goto L46
            com.tencent.maas.moviecomposing.segments.Segment r3 = r3.f257167a
            goto L47
        L46:
            r3 = r1
        L47:
            boolean r4 = r3 instanceof com.tencent.maas.moviecomposing.segments.FancyTextSegment
            if (r4 == 0) goto L4e
            r1 = r3
            com.tencent.maas.moviecomposing.segments.FancyTextSegment r1 = (com.tencent.maas.moviecomposing.segments.FancyTextSegment) r1
        L4e:
            if (r1 == 0) goto L58
            java.lang.String r1 = r1.N0()
            if (r1 != 0) goto L57
            goto L58
        L57:
            r2 = r1
        L58:
            r5.f285499v = r2
            r5.q7(r2)
            r5.G7()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r5.f69240i
            hw0.p r1 = (hw0.p) r1
            if (r1 == 0) goto L72
            hw0.v r2 = new hw0.v
            r2.<init>(r5, r0)
            r1.setInputMethodChangeCallback(r2)
            goto L72
        L6f:
            r5.q7(r2)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.m4.w7():void");
    }

    @Override // hw0.z
    public void x7(hw0.p panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.x7(panel);
        ((gx0.gf) ((jz5.n) this.f276699y).getValue()).f276473f.observe(W6(), new gx0.h4(this));
    }

    @Override // hw0.z
    public ow0.a0 y7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // hw0.z
    public gx0.w z7() {
        return (gx0.w) T6(gx0.f4.class);
    }
}
