package ow0;

/* loaded from: classes5.dex */
public abstract class a0 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k implements rw0.d {
    public final androidx.lifecycle.j0 A;
    public dx0.g B;
    public final jz5.g C;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f349280n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f349281o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f349282p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f349283q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f349284r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f349285s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f349286t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f349287u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f349288v;

    /* renamed from: w, reason: collision with root package name */
    public final xw0.r f349289w;

    /* renamed from: x, reason: collision with root package name */
    public final nw0.h f349290x;

    /* renamed from: y, reason: collision with root package name */
    public vw0.g f349291y;

    /* renamed from: z, reason: collision with root package name */
    public final ow0.t f349292z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f349281o = jz5.h.b(new ow0.n(this));
        this.f349282p = jz5.h.b(new ow0.j(this));
        this.f349283q = jz5.h.b(new ow0.m(this));
        this.f349284r = jz5.h.b(new ow0.i(this));
        this.f349285s = jz5.h.b(new ow0.s(this));
        this.f349286t = jz5.h.b(new ow0.l(this));
        this.f349287u = jz5.h.b(new ow0.k(this));
        this.f349288v = jz5.h.b(new ow0.r(this));
        this.f349289w = new xw0.r(Q6());
        this.f349290x = new nw0.h(Q6());
        this.f349291y = vw0.g.f440775d;
        this.f349292z = new ow0.t(this);
        this.A = new androidx.lifecycle.j0();
        this.C = jz5.h.b(new ow0.z(this));
    }

    public static void K7(ow0.a0 a0Var, ov0.e openPage, zw0.b bVar, com.tencent.maas.base.MJID mjid, int i17, java.lang.Object obj) {
        uw0.e1 e1Var;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditCaptionPanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f349125e;
        }
        if ((i17 & 2) != 0) {
            bVar = zw0.b.f476551e;
        }
        zw0.b entrance = bVar;
        if ((i17 & 4) != 0) {
            mjid = null;
        }
        a0Var.getClass();
        kotlin.jvm.internal.o.g(openPage, "openPage");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        ex0.b m76 = a0Var.m7(mjid);
        if (m76 == null) {
            return;
        }
        if ((entrance == zw0.b.f476557n && m76.f257171e != ax0.b.f14965e) || (e1Var = (uw0.e1) ((jz5.n) a0Var.f349286t).getValue()) == null || e1Var.X6()) {
            return;
        }
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("key_open_page", openPage);
        lVarArr[1] = new jz5.l("key_caption_segment_id", m76.f257168b);
        lVarArr[2] = new jz5.l("key_caption_language", m76.D());
        lVarArr[3] = new jz5.l("key_enable_dual_language_edit", java.lang.Boolean.valueOf(m76.E() != null));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(a0Var, e1Var, kz5.c1.i(lVarArr), entrance, null, null, 24, null);
    }

    public static void L7(ow0.a0 a0Var, ov0.e openPage, zw0.b bVar, int i17, java.lang.Object obj) {
        ow0.g gVar;
        com.tencent.maas.base.MJID selectedContentDescSegmentID$plugin_mj_template_release;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditContentDescPanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f349125e;
        }
        if ((i17 & 2) != 0) {
            bVar = zw0.b.f476551e;
        }
        zw0.b entrance = bVar;
        a0Var.getClass();
        kotlin.jvm.internal.o.g(openPage, "openPage");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        jz5.g gVar2 = a0Var.f349284r;
        if (((uw0.o) ((jz5.n) gVar2).getValue()).X6() || (gVar = (ow0.g) a0Var.f69240i) == null || (selectedContentDescSegmentID$plugin_mj_template_release = gVar.getSelectedContentDescSegmentID$plugin_mj_template_release()) == null) {
            return;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(a0Var, (uw0.o) ((jz5.n) gVar2).getValue(), kz5.c1.i(new jz5.l("key_open_page", openPage), new jz5.l("key_belonging_segment_id", selectedContentDescSegmentID$plugin_mj_template_release)), entrance, null, null, 24, null);
    }

    public static void M7(ow0.a0 a0Var, ov0.e openPage, zw0.b bVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditTitlePanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f349125e;
        }
        if ((i17 & 2) != 0) {
            bVar = zw0.b.f476551e;
        }
        zw0.b entrance = bVar;
        a0Var.getClass();
        kotlin.jvm.internal.o.g(openPage, "openPage");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        jz5.g gVar = a0Var.f349282p;
        if (((uw0.t0) ((jz5.n) gVar).getValue()).X6()) {
            return;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(a0Var, (uw0.t0) ((jz5.n) gVar).getValue(), kz5.c1.i(new jz5.l("key_open_page", openPage)), entrance, null, null, 24, null);
    }

    public abstract gx0.gg A7();

    public void B(com.tencent.maas.base.MJID clipSegmentID) {
        kotlin.jvm.internal.o.g(clipSegmentID, "clipSegmentID");
        L7(this, null, null, 3, null);
    }

    public void B7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.n3(m7Var, null), 3, null);
    }

    public void C0(android.view.View view, com.tencent.maas.base.MJID clipSegmentID) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(clipSegmentID, "clipSegmentID");
    }

    public void C7() {
    }

    public void D5(com.tencent.maas.base.MJID clipSegmentID) {
        kotlin.jvm.internal.o.g(clipSegmentID, "clipSegmentID");
    }

    public void D7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.k3(m7Var, null), 3, null);
    }

    public void E7(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
    }

    public void F7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.l3(m7Var, null), 3, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: G7 */
    public void a7(ow0.g panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        this.f349280n = com.tencent.mm.ui.widget.dialog.u3.c(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), true, 0, null);
        s7(panel);
        r7();
        panel.setCaptionPageTimelineToolbarTypeGetter(new ow0.o(this));
        sw0.f initPage = panel.getInitPage();
        kotlin.jvm.internal.o.g(initPage, "initPage");
        panel.E = panel.F(initPage, false);
    }

    public void H7(java.util.List list) {
    }

    public void I7() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.m3(m7Var, null), 3, null);
    }

    public void J7() {
    }

    public void N(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    public final void N7(com.tencent.maas.base.MJID mjID, zw0.b entrance, mv0.c editPurpose) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        kotlin.jvm.internal.o.g(editPurpose, "editPurpose");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(this, (hw0.z) ((jz5.n) this.f349283q).getValue(), kz5.c1.i(new jz5.l("key_open_page", ov0.e.f349125e), new jz5.l("key_mj_id", mjID), new jz5.l("key_edit_purpose", editPurpose)), entrance, null, null, 24, null);
    }

    public final void O7(com.tencent.maas.base.MJID segmentID, boolean z17) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        du0.o oVar = (du0.o) ((jz5.n) this.f349281o).getValue();
        oVar.getClass();
        if (oVar.e7(segmentID) && !oVar.f7(segmentID)) {
            oVar.n7(segmentID, false, z17);
        }
    }

    public final void P7(vw0.g newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        this.f349291y = newState;
        ym5.a1.f(new ow0.u(this, newState));
    }

    public void S() {
        M7(this, null, null, 3, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new ow0.g(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void Z6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        ow0.g panel = (ow0.g) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        panel.D(l7(), this.f349292z, this);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        this.f349289w.t();
        this.f349290x.e();
    }

    public void d0() {
        yy0.m7 m7Var = (yy0.m7) R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.s4(m7Var, null), 3, null);
        ((vu0.o0) ((jz5.n) this.C).getValue()).c();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        ((du0.o) ((jz5.n) this.f349281o).getValue()).l7();
        ow0.g gVar = (ow0.g) this.f69240i;
        if (gVar != null) {
            du0.v0 R6 = R6();
            java.lang.String entryType = gVar.getEntrance().f476559d;
            R6.getClass();
            kotlin.jvm.internal.o.g(entryType, "entryType");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.s1(m7Var, entryType, null), 3, null);
            int ordinal = gVar.getCurrentPage().ordinal();
            if (ordinal == 0) {
                yy0.m7 m7Var2 = (yy0.m7) R6().O6();
                kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.m3(m7Var2, null), 3, null);
                return;
            }
            if (ordinal == 1) {
                yy0.m7 m7Var3 = (yy0.m7) R6().O6();
                kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.k3(m7Var3, null), 3, null);
            } else if (ordinal == 2) {
                yy0.m7 m7Var4 = (yy0.m7) R6().O6();
                kotlinx.coroutines.l.d(m7Var4.Di(), null, null, new yy0.l3(m7Var4, null), 3, null);
            } else {
                if (ordinal != 3) {
                    return;
                }
                yy0.m7 m7Var5 = (yy0.m7) R6().O6();
                kotlinx.coroutines.l.d(m7Var5.Di(), null, null, new yy0.n3(m7Var5, null), 3, null);
            }
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        gx0.hf p76 = p7();
        ow0.g gVar = (ow0.g) this.f69240i;
        if (gVar == null || (dVar = gVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(p76, dVar, null, 2, null);
    }

    public void g3(boolean z17) {
        if (z17) {
            yy0.m7 m7Var = (yy0.m7) R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.v4(m7Var, null), 3, null);
        } else {
            yy0.m7 m7Var2 = (yy0.m7) R6().O6();
            kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.w4(m7Var2, null), 3, null);
        }
        ((gx0.gg) ((jz5.n) this.f349285s).getValue()).cancel();
    }

    public void k7(kw0.a stickerData) {
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
    }

    public java.util.List l7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.lmt), sw0.f.f413429d, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView(getActivity(), null, 0, 6, null)));
        arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.mbz), sw0.f.f413431f, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView(getActivity(), null, 0, 6, null)));
        return arrayList;
    }

    public ex0.b m7(com.tencent.maas.base.MJID mjid) {
        return null;
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n7() {
        java.lang.Object obj;
        ow0.g gVar = (ow0.g) this.f69240i;
        if (gVar == null) {
            return null;
        }
        sw0.f fVar = sw0.f.f413432g;
        java.util.Iterator it = gVar.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.n) obj).f413444b == fVar) {
                break;
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        if (!(view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView)) {
            view = null;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView) view;
        if (captionView != null) {
            return captionView.getTimelineView();
        }
        return null;
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView o7() {
        java.lang.Object obj;
        ow0.g gVar = (ow0.g) this.f69240i;
        if (gVar == null) {
            return null;
        }
        sw0.f fVar = sw0.f.f413432g;
        java.util.Iterator it = gVar.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.n) obj).f413444b == fVar) {
                break;
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView ? view : null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        ow0.g gVar;
        sw0.f currentPage;
        ow0.g gVar2;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (!X6() || (gVar = (ow0.g) this.f69240i) == null || (currentPage = gVar.getCurrentPage()) == null || (gVar2 = (ow0.g) this.f69240i) == null) {
            return;
        }
        gVar2.F(currentPage, false);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        this.f349289w.s();
        this.f349290x.d();
        vu0.o0 o0Var = (vu0.o0) ((jz5.n) this.C).getValue();
        o0Var.c();
        kotlinx.coroutines.z0.e(o0Var.f440137j, null, 1, null);
        ru0.m.a().m();
    }

    public final gx0.hf p7() {
        return (gx0.hf) ((jz5.n) this.f349288v).getValue();
    }

    public com.tencent.maas.moviecomposing.segments.Segment q7() {
        return null;
    }

    public void r7() {
        nw0.h hVar = this.f349290x;
        kotlinx.coroutines.l.d(hVar.f340768b, null, null, new nw0.b(hVar, null, null), 3, null);
    }

    public void s1(fv0.a operation) {
        sw0.f currentPage;
        com.tencent.maas.moviecomposing.segments.Segment q76;
        kotlin.jvm.internal.o.g(operation, "operation");
        int ordinal = operation.ordinal();
        if (ordinal == 1) {
            C7();
            return;
        }
        switch (ordinal) {
            case 14:
                ow0.g gVar = (ow0.g) this.f69240i;
                currentPage = gVar != null ? gVar.getCurrentPage() : null;
                if ((currentPage != null ? ow0.h.f349313a[currentPage.ordinal()] : -1) == 4) {
                    K7(this, null, zw0.b.f476557n, null, 5, null);
                    return;
                }
                return;
            case 15:
                ow0.g gVar2 = (ow0.g) this.f69240i;
                sw0.f currentPage2 = gVar2 != null ? gVar2.getCurrentPage() : null;
                int i17 = currentPage2 != null ? ow0.h.f349313a[currentPage2.ordinal()] : -1;
                if (i17 == 1) {
                    if (q7() == null) {
                        return;
                    }
                    M7(this, ov0.e.f349126f, null, 2, null);
                    return;
                } else if (i17 == 2) {
                    L7(this, ov0.e.f349126f, null, 2, null);
                    return;
                } else {
                    if (i17 != 4) {
                        return;
                    }
                    K7(this, ov0.e.f349126f, zw0.b.f476557n, null, 4, null);
                    return;
                }
            case 16:
                ow0.g gVar3 = (ow0.g) this.f69240i;
                currentPage = gVar3 != null ? gVar3.getCurrentPage() : null;
                if ((currentPage != null ? ow0.h.f349313a[currentPage.ordinal()] : -1) != 1 || (q76 = q7()) == null) {
                    return;
                }
                jz5.g gVar4 = this.f349287u;
                if (((jv0.g) ((jz5.n) gVar4).getValue()).X6()) {
                    return;
                }
                com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(this, (jv0.g) ((jz5.n) gVar4).getValue(), kz5.c1.i(new jz5.l("key_dest_segment_id", q76.f48532a)), null, null, new ow0.q(this, q76), 12, null);
                return;
            default:
                return;
        }
    }

    public void s5(kw0.a fancyTextData) {
        kotlin.jvm.internal.o.g(fancyTextData, "fancyTextData");
        nw0.h hVar = this.f349290x;
        hVar.getClass();
        kotlinx.coroutines.l.d(hVar.f340768b, null, null, new nw0.e(fancyTextData, hVar, kw0.b.f312791e, null), 3, null);
    }

    public void s7(ow0.g panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        this.f349290x.f340772f.observe(W6(), new ow0.p(this));
        panel.setupFancyTextUIStateObserver$plugin_mj_template_release(this.A);
    }

    public abstract uw0.o t7();

    public abstract uw0.t0 u7();

    public uw0.e1 v7() {
        return null;
    }

    public abstract jv0.g w7();

    public abstract hw0.z x7();

    public abstract du0.o y7();

    public abstract gx0.hf z7();
}
