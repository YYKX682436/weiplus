package gx0;

/* loaded from: classes5.dex */
public final class dd extends lw0.l {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f276337s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f276338t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f276339u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f276340v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f276341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276337s = jz5.h.b(new gx0.cd(this));
        this.f276338t = jz5.h.b(new gx0.zc(this));
        this.f276339u = jz5.h.b(new gx0.ad(this));
        this.f276340v = jz5.h.b(new gx0.bd(this));
        this.f276341w = jz5.h.b(new gx0.uc(this));
    }

    @Override // lw0.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = y7().f276642r;
        if (a0Var != null) {
            ex0.i0.l(a0Var);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f276340v).getValue();
        lw0.c cVar = (lw0.c) this.f69240i;
        if (cVar == null || (dVar = cVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(kcVar, dVar, null, 2, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void f7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        lw0.c panel = (lw0.c) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.yc(this, null), 3, null);
    }

    @Override // lw0.l
    public boolean l7(kw0.e state) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        if (z76 == null) {
            return false;
        }
        gx0.kh y76 = y7();
        com.tencent.maas.base.MJID mjid = z76.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        ex0.k0 p76 = y76.p7(mjid);
        if (p76 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            p76 = null;
        }
        if (p76 == null) {
            return false;
        }
        kw0.a b17 = fv0.e.b(state);
        if (zu0.i.f475676f != (b17 != null ? b17.f312789b : null)) {
            return false;
        }
        java.lang.String str2 = b17.f312788a.f48224b;
        kotlin.jvm.internal.o.f(str2, "getMaterialID(...)");
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment = p76.f257145p;
        whenWhereSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = whenWhereSegment.D();
        boolean booleanValue = (D != null ? com.tencent.maas.moviecomposing.segments.WhenWhereSegment.E0(whenWhereSegment, str2, D) : bool).booleanValue();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onWhenWhereReplaced: updateResult " + booleanValue);
        if (!booleanValue) {
            return false;
        }
        whenWhereSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = whenWhereSegment.D();
        boolean booleanValue2 = (D2 != null ? com.tencent.maas.moviecomposing.segments.WhenWhereSegment.v0(whenWhereSegment, D2) : bool).booleanValue();
        jz5.g gVar = this.f276340v;
        if (booleanValue2 && whenWhereSegment.I0() == 0) {
            ex0.c g76 = y7().g7(((gx0.kc) ((jz5.n) gVar).getValue()).e7());
            if (g76 == null) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                g76 = null;
            }
            if (g76 == null) {
                return false;
            }
            p76.B(g76.A());
        }
        whenWhereSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D3 = whenWhereSegment.D();
        if (D3 != null) {
            bool = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.z0(whenWhereSegment, D3);
        }
        boolean booleanValue3 = bool.booleanValue();
        com.tencent.maas.moviecomposing.segments.Segment segment = p76.f257167a;
        if (!booleanValue3) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onWhenWhereReplaced: isDisplayingLocation false ");
            w7(segment);
            return true;
        }
        com.tencent.maas.moviecomposing.segments.GeographicInfo H0 = whenWhereSegment.H0();
        java.lang.String name = H0 != null ? H0.getName() : null;
        com.tencent.maas.moviecomposing.segments.GeographicInfo H02 = name == null || name.length() == 0 ? null : whenWhereSegment.H0();
        if (H02 != null) {
            p76.A(H02);
            w7(segment);
        } else {
            ex0.c g77 = y7().g7(((gx0.kc) ((jz5.n) gVar).getValue()).e7());
            if (g77 == null) {
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                g77 = null;
            }
            if (g77 == null) {
                return false;
            }
            du0.i0 P6 = P6();
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = g77.f257119p;
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D4 = clipSegment.D();
            P6.O6(D4 != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.U0(clipSegment, D4) : null, new gx0.tc(p76, this));
        }
        return true;
    }

    @Override // lw0.l
    public lw0.d o7() {
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        if (z76 != null) {
            return zt0.b.a(z76);
        }
        return null;
    }

    @Override // lw0.l
    public void p7(lw0.c panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.p7(panel);
        ((gx0.gf) ((jz5.n) this.f276339u).getValue()).f276473f.observe(W6(), new gx0.vc(this));
    }

    @Override // lw0.l
    public void q7(java.util.Calendar calendarDate) {
        kotlin.jvm.internal.o.g(calendarDate, "calendarDate");
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        if (z76 == null) {
            return;
        }
        gx0.kh y76 = y7();
        com.tencent.maas.base.MJID mjid = z76.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        ex0.k0 p76 = y76.p7(mjid);
        if (p76 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            p76 = null;
        }
        if (p76 == null) {
            return;
        }
        p76.B(calendarDate.getTimeInMillis());
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.wc(this, null), 3, null);
        gx0.bf x76 = x7();
        com.tencent.maas.model.time.MJTimeRange B = z76.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(x76, B);
    }

    @Override // lw0.l
    public void r7(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo) {
        kotlin.jvm.internal.o.g(geographicInfo, "geographicInfo");
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        if (z76 == null) {
            return;
        }
        lw0.c cVar = (lw0.c) this.f69240i;
        if (cVar != null) {
            com.tencent.maas.moviecomposing.segments.GeographicInfo H0 = z76.H0();
            cVar.setWhereText(H0 != null ? H0.getName() : null);
        }
        gx0.kh y76 = y7();
        com.tencent.maas.base.MJID mjid = z76.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        ex0.k0 p76 = y76.p7(mjid);
        if (p76 != null) {
            p76.A(geographicInfo);
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.xc(this, null), 3, null);
        gx0.bf x76 = x7();
        com.tencent.maas.model.time.MJTimeRange B = z76.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(x76, B);
    }

    @Override // lw0.l
    public void s7() {
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        if (z76 != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline D = z76.D();
            if ((D != null ? com.tencent.maas.moviecomposing.segments.WhenWhereSegment.v0(z76, D) : bool).booleanValue()) {
                com.tencent.maas.moviecomposing.e eVar = new com.tencent.maas.moviecomposing.e(false, false, false, false, false, false);
                com.tencent.maas.moviecomposing.Timeline D2 = z76.D();
                if (D2 != null) {
                    eVar = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.F0(z76, D2);
                }
                k7(eVar, z76.I0());
                return;
            }
            com.tencent.maas.moviecomposing.Timeline D3 = z76.D();
            if (D3 != null) {
                bool = com.tencent.maas.moviecomposing.segments.WhenWhereSegment.z0(z76, D3);
            }
            if (bool.booleanValue()) {
                m7(z76.H0());
            }
        }
    }

    @Override // lw0.l
    public void t7() {
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        com.tencent.maas.base.MJID mjid = z76 != null ? z76.f48532a : null;
        ex0.a0 a0Var = y7().f276642r;
        ex0.v vVar = a0Var != null ? a0Var.f257097g : null;
        if (mjid != null) {
            boolean z17 = false;
            if (vVar != null && !vVar.b(mjid)) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            com.tencent.maas.model.time.MJTime mJTime = (ou0.g) x7().A.getValue();
            if (mJTime == null) {
                mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            }
            gx0.kh y76 = y7();
            java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.llz);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            y76.r7(string, mJTime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // lw0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u7() {
        /*
            r6 = this;
            com.tencent.maas.moviecomposing.segments.WhenWhereSegment r0 = r6.z7()
            r1 = 0
            if (r0 == 0) goto La
            com.tencent.maas.base.MJID r0 = r0.f48532a
            goto Lb
        La:
            r0 = r1
        Lb:
            gx0.kh r2 = r6.y7()
            ex0.a0 r2 = r2.f276642r
            if (r2 == 0) goto L16
            ex0.v r2 = r2.f257097g
            goto L17
        L16:
            r2 = r1
        L17:
            r3 = 2131771422(0x7f10401e, float:1.9174175E38)
            if (r0 == 0) goto L5b
            r4 = 0
            if (r2 == 0) goto L27
            boolean r2 = r2.b(r0)
            r5 = 1
            if (r2 != r5) goto L27
            r4 = r5
        L27:
            if (r4 == 0) goto L5b
            gx0.kh r2 = r6.y7()
            ex0.k0 r0 = r2.p7(r0)
            if (r0 == 0) goto L36
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f257167a
            goto L37
        L36:
            r0 = r1
        L37:
            boolean r2 = r0 instanceof com.tencent.maas.moviecomposing.segments.WhenWhereSegment
            if (r2 == 0) goto L3e
            com.tencent.maas.moviecomposing.segments.WhenWhereSegment r0 = (com.tencent.maas.moviecomposing.segments.WhenWhereSegment) r0
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 == 0) goto L67
            lw0.d r0 = zt0.b.a(r0)
            lw0.d r2 = r6.f321543p
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)
            if (r0 != 0) goto L67
            android.app.Activity r0 = r6.getContext()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r0 = r0.getString(r3)
            r1 = r0
            goto L67
        L5b:
            android.app.Activity r0 = r6.getContext()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r1 = r0.getString(r3)
        L67:
            if (r1 == 0) goto L81
            gx0.bf r0 = r6.x7()
            androidx.lifecycle.g0 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            ou0.g r0 = (ou0.g) r0
            if (r0 == 0) goto L78
            goto L7a
        L78:
            com.tencent.maas.model.time.MJTime r0 = com.tencent.maas.model.time.MJTime.ZeroTime
        L7a:
            gx0.kh r2 = r6.y7()
            r2.r7(r1, r0)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.dd.u7():void");
    }

    @Override // lw0.l
    public void v7(lw0.c panel, kw0.e state) {
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.maas.moviecomposing.segments.WhenWhereSegment z76 = z7();
        if (z76 != null) {
            gx0.bf x76 = x7();
            com.tencent.maas.model.time.MJTimeRange B = z76.B();
            kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(x76, B);
        }
        super.v7(panel, state);
    }

    public final void w7(com.tencent.maas.moviecomposing.segments.Segment segment) {
        gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f276340v).getValue();
        com.tencent.maas.base.MJID mjid = segment.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        gx0.hf.V6(kcVar, mjid, null, 2, null);
    }

    public final gx0.bf x7() {
        return (gx0.bf) ((jz5.n) this.f276338t).getValue();
    }

    public final gx0.kh y7() {
        return (gx0.kh) ((jz5.n) this.f276337s).getValue();
    }

    public final com.tencent.maas.moviecomposing.segments.WhenWhereSegment z7() {
        com.tencent.maas.base.MJID destID$plugin_mj_template_release;
        lw0.c cVar = (lw0.c) this.f69240i;
        if (cVar == null || (destID$plugin_mj_template_release = cVar.getDestID$plugin_mj_template_release()) == null) {
            return null;
        }
        com.tencent.maas.moviecomposing.Timeline o76 = y7().o7();
        com.tencent.maas.moviecomposing.segments.Segment m17 = o76 != null ? o76.m(destID$plugin_mj_template_release) : null;
        if (m17 instanceof com.tencent.maas.moviecomposing.segments.WhenWhereSegment) {
            return (com.tencent.maas.moviecomposing.segments.WhenWhereSegment) m17;
        }
        return null;
    }
}
