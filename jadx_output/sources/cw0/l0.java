package cw0;

/* loaded from: classes5.dex */
public abstract class l0 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k implements vu0.p0 {
    public final jz5.g A;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f222642n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f222643o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f222644p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f222645q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f222646r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.maas.material.MJMaterialInfo f222647s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f222648t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f222649u;

    /* renamed from: v, reason: collision with root package name */
    public float f222650v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f222651w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f222652x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f222653y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f222654z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f222642n = jz5.h.b(new cw0.j(this));
        this.f222643o = jz5.h.b(new cw0.i0(this));
        this.f222644p = jz5.h.b(new cw0.k(this));
        this.f222645q = new java.util.concurrent.ConcurrentHashMap();
        this.f222646r = jz5.h.b(new cw0.j0(this));
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = dw0.c.f244083e;
        this.f222647s = dw0.c.f244084f;
        this.f222648t = true;
        this.f222650v = 0.5f;
        this.f222651w = new java.util.LinkedHashMap();
        this.f222652x = jz5.h.b(new cw0.i(this));
        this.f222653y = jz5.h.b(new cw0.k0(this));
        this.f222654z = jz5.h.b(new cw0.g(this));
        this.A = jz5.h.b(new cw0.h0(this));
    }

    public static void Q7(cw0.l0 l0Var, ov0.e openPage, com.tencent.maas.base.MJID narrationSegmentId, zw0.b bVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEditCaptionItemPanel");
        }
        if ((i17 & 1) != 0) {
            openPage = ov0.e.f349125e;
        }
        if ((i17 & 4) != 0) {
            bVar = zw0.b.f476551e;
        }
        zw0.b entrance = bVar;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(openPage, "openPage");
        kotlin.jvm.internal.o.g(narrationSegmentId, "narrationSegmentId");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        jz5.g gVar = l0Var.f222642n;
        if (((gx0.w9) ((jz5.n) gVar).getValue()).X6()) {
            return;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.i7(l0Var, (gx0.w9) ((jz5.n) gVar).getValue(), kz5.c1.i(new jz5.l("key_open_page", openPage), new jz5.l("KEY_NARRATION_SEGMENT_ID", narrationSegmentId)), entrance, null, new cw0.z(l0Var, narrationSegmentId), 8, null);
    }

    public static final void k7(cw0.l0 l0Var, java.lang.String str, java.util.List list, boolean z17, boolean z18) {
        java.util.concurrent.CountDownLatch countDownLatch;
        if (z17) {
            l0Var.getClass();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.le4 le4Var = (r45.le4) it.next();
                kotlin.jvm.internal.o.g(le4Var, "<this>");
                l0Var.l7(str, new com.tencent.maas.moviecomposing.segments.CaptionItem(le4Var.f379379f, new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.fromMilliseconds(le4Var.f379377d), com.tencent.maas.model.time.MJTime.fromMilliseconds(le4Var.f379378e))));
            }
            if (z18 && (countDownLatch = (java.util.concurrent.CountDownLatch) l0Var.f222645q.get(str)) != null) {
                countDownLatch.countDown();
            }
        }
        l0Var.R7();
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView A7() {
        java.lang.Object value = ((jz5.n) this.f222646r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView) value;
    }

    public double B7() {
        return 0.0d;
    }

    public void C7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
    }

    public void D7(cw0.d panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        panel.setOnEditOperationClickListener(new cw0.p(this));
    }

    public void E7() {
    }

    public boolean F7() {
        return false;
    }

    public abstract gx0.w G7();

    public void H7(int i17, java.lang.String wavFilepath, boolean z17) {
        kotlin.jvm.internal.o.g(wavFilepath, "wavFilepath");
    }

    public void I7(com.tencent.maas.base.MJID narrationSegmentID) {
        kotlin.jvm.internal.o.g(narrationSegmentID, "narrationSegmentID");
    }

    @Override // vu0.p0
    public void J4(float[] waveArray, float f17) {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout narrationLayout$plugin_mj_template_release;
        kotlin.jvm.internal.o.g(waveArray, "waveArray");
        cw0.d dVar = (cw0.d) this.f69240i;
        if (dVar == null || (narrationLayout$plugin_mj_template_release = dVar.getNarrationLayout$plugin_mj_template_release()) == null) {
            return;
        }
        kx0.g gVar = narrationLayout$plugin_mj_template_release.A;
        kx0.f fVar = gVar.f313255d;
        kx0.f fVar2 = kx0.f.PRESS;
        if (fVar == fVar2) {
            kx0.i iVar = gVar.f313254c;
            iVar.getClass();
            iVar.f313276q = java.lang.Math.max(java.lang.Math.min(f17, 1.0f), 0.0f);
            gVar.invalidateSelf();
        }
        kx0.g gVar2 = narrationLayout$plugin_mj_template_release.B;
        if (gVar2.f313255d == fVar2) {
            kx0.i iVar2 = gVar2.f313254c;
            iVar2.getClass();
            iVar2.f313276q = java.lang.Math.max(java.lang.Math.min(f17, 1.0f), 0.0f);
            gVar2.invalidateSelf();
        }
    }

    public void J7() {
    }

    public void K7(ru0.e roleResult, ex0.q narrationVM, com.tencent.mm.vfs.r6 roleFile) {
        kotlin.jvm.internal.o.g(roleResult, "roleResult");
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        kotlin.jvm.internal.o.g(roleFile, "roleFile");
    }

    public void L7() {
        androidx.appcompat.widget.LinearLayoutCompat narrationSegmentEditOptContainer$plugin_mj_template_release;
        android.view.View findViewWithTag;
        ex0.r v76 = v7();
        if (v76 == null) {
            wt0.a.a("No focused segment!!!!", getMainScope());
            return;
        }
        if (v76.f257169c != ug.m.Narration) {
            wt0.a.a("Must be a narration segment", getMainScope());
            return;
        }
        cw0.d dVar = (cw0.d) this.f69240i;
        boolean z17 = false;
        if (dVar != null && (narrationSegmentEditOptContainer$plugin_mj_template_release = dVar.getNarrationSegmentEditOptContainer$plugin_mj_template_release()) != null && (findViewWithTag = narrationSegmentEditOptContainer$plugin_mj_template_release.findViewWithTag(fv0.a.f266939h)) != null && rv0.b7.f399942d.a(findViewWithTag)) {
            z17 = true;
        }
        if (z17) {
            android.app.Activity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = j65.q.a(getContext()).getText(com.tencent.mm.R.string.lmz);
            e4Var.c();
        }
    }

    public void M7() {
    }

    public void N7(ex0.q narrationVM) {
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
    }

    public void O7(com.tencent.maas.base.MJID segmentID, ex0.q narrationVM) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
    }

    public void P7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
    }

    public void R7() {
    }

    public final void S7(ex0.q narrationVM) {
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment = narrationVM.f257162q;
        narrationSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = narrationSegment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.NarrationSegment.A1(narrationSegment, "", "", D);
        }
        java.lang.String Q1 = narrationSegment.Q1();
        kotlin.jvm.internal.o.f(Q1, "getOriginNarrationFilePath(...)");
        narrationSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D2 = narrationSegment.D();
        if (D2 != null) {
            bool = com.tencent.maas.moviecomposing.segments.NarrationSegment.O1(narrationSegment, Q1, D2);
        }
        bool.booleanValue();
        narrationVM.P(vu0.w.f440168f);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new cw0.b0(narrationVM, this, null), 3, null);
    }

    public void T7(float f17, java.lang.Float f18, java.lang.Float f19) {
    }

    public final void U7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
        ym5.a1.f(new cw0.c0(this, snapshotDesc));
    }

    public final void V7() {
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.f492500h6);
        e4Var.c();
    }

    public final void W7(ex0.q narrationVM, java.util.Map map) {
        kotlin.jvm.internal.o.g(narrationVM, "narrationVM");
        if (map == null) {
            map = null;
        } else if (map.isEmpty()) {
            map = (java.util.Map) ((java.util.LinkedHashMap) this.f222651w).get(narrationVM.f257168b);
        }
        if (map != null) {
            java.util.List<com.tencent.maas.moviecomposing.segments.CaptionItem> I = narrationVM.I();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.maas.moviecomposing.segments.CaptionItem captionItem : I) {
                java.lang.Double d17 = (java.lang.Double) map.get(captionItem.getText());
                if (d17 == null) {
                    arrayList.add(captionItem);
                } else {
                    arrayList.add(new com.tencent.maas.moviecomposing.segments.CaptionItem(captionItem.getText(), new com.tencent.maas.model.time.MJTimeRange(captionItem.getTimeRange().getStartTime(), com.tencent.maas.model.time.MJTime.fromSeconds(d17.doubleValue()))));
                }
            }
            narrationVM.N(arrayList);
        }
    }

    public final void X7() {
        boolean p76 = p7();
        cw0.d dVar = (cw0.d) this.f69240i;
        if (dVar != null) {
            if (p76) {
                com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout narrationLayout$plugin_mj_template_release = dVar.getNarrationLayout$plugin_mj_template_release();
                if (narrationLayout$plugin_mj_template_release.G == kx0.d.f313244e) {
                    return;
                }
                narrationLayout$plugin_mj_template_release.F = true;
                narrationLayout$plugin_mj_template_release.f69475x.setVisibility(8);
                narrationLayout$plugin_mj_template_release.C();
                narrationLayout$plugin_mj_template_release.f69476y.setVisibility(0);
                narrationLayout$plugin_mj_template_release.f69477z.setVisibility(0);
                narrationLayout$plugin_mj_template_release.G();
                narrationLayout$plugin_mj_template_release.F();
                narrationLayout$plugin_mj_template_release.A.d();
                return;
            }
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout narrationLayout$plugin_mj_template_release2 = dVar.getNarrationLayout$plugin_mj_template_release();
            if (narrationLayout$plugin_mj_template_release2.G == kx0.d.f313244e) {
                return;
            }
            narrationLayout$plugin_mj_template_release2.F = false;
            narrationLayout$plugin_mj_template_release2.f69475x.setVisibility(8);
            narrationLayout$plugin_mj_template_release2.C();
            narrationLayout$plugin_mj_template_release2.f69476y.setVisibility(0);
            narrationLayout$plugin_mj_template_release2.f69477z.setVisibility(0);
            narrationLayout$plugin_mj_template_release2.G();
            narrationLayout$plugin_mj_template_release2.F();
            kx0.g gVar = narrationLayout$plugin_mj_template_release2.A;
            kx0.f fVar = gVar.f313255d;
            kx0.f fVar2 = kx0.f.DISABLE;
            if (fVar == fVar2) {
                return;
            }
            gVar.f313255d = fVar2;
            gVar.f313256e.cancel();
            gVar.invalidateSelf();
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new cw0.d(getActivity());
    }

    public void Y7(java.lang.String requestId, vu0.u state) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(state, "state");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        cw0.d dVar;
        cw0.d panel = (cw0.d) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        panel.getNarrationLayout$plugin_mj_template_release().setRecordListener(new cw0.q(this));
        E7();
        double B7 = B7();
        if (B7 >= 0.0d && (dVar = (cw0.d) this.f69240i) != null) {
            dVar.C(B7);
        }
        D7(panel);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new cw0.n(this, null), 3, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void d7() {
        zw0.b entrance;
        cw0.d dVar = (cw0.d) this.f69240i;
        if (dVar == null || (entrance = dVar.getEntrance()) == null) {
            return;
        }
        du0.v0 R6 = R6();
        R6.getClass();
        java.lang.String entryType = entrance.f476559d;
        kotlin.jvm.internal.o.g(entryType, "entryType");
        yy0.m7 m7Var = (yy0.m7) R6.O6();
        m7Var.getClass();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.q1(m7Var, entryType, null), 3, null);
    }

    public void l7(java.lang.String requestId, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem) {
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
    }

    public void m7(float f17) {
    }

    public void n7(float f17) {
    }

    public void o7(float f17) {
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        t7().f366737h.a();
        uu0.c e17 = uu0.c.e();
        uu0.j jVar = e17.f431210e;
        if (jVar == uu0.j.START || jVar == uu0.j.RESUME || jVar == uu0.j.ERROR) {
            e17.h(java.lang.Boolean.FALSE);
        }
        e17.f431223r = null;
        e17.f431224s = null;
    }

    public boolean p7() {
        return false;
    }

    public java.lang.Object q7(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public void r7(java.lang.String snapshotDesc) {
        kotlin.jvm.internal.o.g(snapshotDesc, "snapshotDesc");
    }

    public void s7(yz5.l action) {
        kotlin.jvm.internal.o.g(action, "action");
    }

    public final qu0.i t7() {
        return (qu0.i) ((jz5.n) this.f222654z).getValue();
    }

    public ex0.c u7() {
        return null;
    }

    public ex0.r v7() {
        return null;
    }

    public ex0.o w7() {
        return null;
    }

    public ex0.q x7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }

    public java.util.List y7() {
        return null;
    }

    public final gx0.sc z7() {
        return (gx0.sc) ((jz5.n) this.f222643o).getValue();
    }
}
