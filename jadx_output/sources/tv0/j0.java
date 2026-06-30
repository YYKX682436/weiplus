package tv0;

/* loaded from: classes5.dex */
public final class j0 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {
    public final jz5.g A;
    public float B;
    public final android.graphics.PointF C;
    public final android.graphics.PointF D;
    public com.tencent.maas.base.Rect2 E;
    public kotlinx.coroutines.r2 F;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f422201n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f422202o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.maas.base.MJID f422203p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f422204q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f422205r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f422206s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f422207t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f422208u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f422209v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f422210w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f422211x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.RectF f422212y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f422213z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f422201n = jz5.h.b(new tv0.k(this));
        this.f422202o = jz5.h.b(new tv0.h0(this));
        this.f422204q = jz5.h.b(new tv0.f0(this));
        this.f422205r = jz5.h.b(new tv0.b0(this));
        this.f422206s = jz5.h.b(new tv0.g0(this));
        this.f422207t = jz5.h.b(new tv0.t(this));
        this.f422208u = jz5.h.b(new tv0.g(this));
        this.f422209v = jz5.h.b(new tv0.e0(this));
        this.f422210w = jz5.h.b(new tv0.c0(this));
        this.f422211x = jz5.h.b(new tv0.i0(this));
        this.f422212y = new android.graphics.RectF();
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.f422213z = ZeroTime;
        this.A = jz5.h.b(new tv0.i(this));
        this.B = 1.0f;
        this.C = new android.graphics.PointF(1.0f, 1.0f);
        this.D = new android.graphics.PointF(1.0f, 1.0f);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        tv0.d dVar = new tv0.d(getActivity());
        dVar.I(new tv0.u(this), new tv0.v(this));
        return dVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        ex0.a0 a0Var;
        tv0.d panel = (tv0.d) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.V6(this, "KEY_TARGET_SEGMENT_ID", null, 2, null);
        if (mjid == null) {
            return;
        }
        this.f422203p = mjid;
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.V6(this, "KEY_ENTER_TIME_IN_TIMELINE", null, 2, null);
        if (mJTime == null) {
            return;
        }
        this.f422213z = mJTime;
        com.tencent.maas.moviecomposing.segments.ClipSegment t76 = t7();
        if (t76 == null || (a0Var = ((gx0.kh) ((jz5.n) this.f422204q).getValue()).f276642r) == null) {
            return;
        }
        com.tencent.maas.model.time.MJTime mJTime2 = this.f422213z;
        com.tencent.maas.model.time.MJTime sub = t76.B().getEndTime().sub(new com.tencent.maas.model.time.MJTime(1L));
        kotlin.jvm.internal.o.f(sub, "sub(...)");
        this.f422213z = ou0.f.b(mJTime2, sub);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(panel, panel.getBtnReset$plugin_mj_template_release(), java.lang.Integer.valueOf(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479646bl)));
        this.D.set(q7().getScaleX(), q7().getScaleY());
        this.C.set(s7().getScaleX(), s7().getScaleY());
        l7(q7());
        yw0.n f27 = o7().f2();
        yw0.q qVar = yw0.q.f466585h;
        f27.e(qVar);
        o7().f2().c(yw0.q.f466583f);
        o7().f2().c(qVar);
        o7().f2().f466575e.f466569a.f466571a.requestLayout();
        this.F = kotlinx.coroutines.l.d(getMainScope(), null, null, new tv0.f(this, t76, null), 3, null);
        yw0.n f28 = o7().f2();
        tv0.x xVar = new tv0.x(this, t76);
        f28.getClass();
        f28.f466571a.post(new yw0.m(xVar));
        this.E = t76.q1();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView timelineView$plugin_mj_template_release = panel.getTimelineView$plugin_mj_template_release();
        if (timelineView$plugin_mj_template_release.getWidth() <= 0) {
            timelineView$plugin_mj_template_release.getViewTreeObserver().addOnGlobalLayoutListener(new tv0.s(timelineView$plugin_mj_template_release, this, a0Var, t76));
        } else {
            x7(timelineView$plugin_mj_template_release, a0Var, t76);
        }
        a0Var.f257115y.observe(W6(), new tv0.l(panel.getTimelineView$plugin_mj_template_release()));
        panel.getBtnReset$plugin_mj_template_release().setOnClickListener(new tv0.y(this));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        yw0.b n76 = n7();
        n76.f466531i = yw0.a.f466522e;
        ((yw0.l) n76.f466587a).a();
        com.tencent.mars.xlog.Log.i("CropMaterialReferenceDrawer", "endTrackingSafeArea: ");
        o7().f2().e(yw0.q.f466583f);
        o7().u7().setVisibility(8);
        yw0.p m76 = m7();
        m76.f466580c = yw0.o.f466577e;
        ((yw0.l) m76.f466587a).a();
        android.graphics.PointF pointF = new android.graphics.PointF(o7().A7().getWidth(), o7().A7().getHeight());
        by0.b.b(q7(), (w7().getWidth() * 1.0f) / w7().getHeight(), pointF.x, pointF.y);
        android.widget.FrameLayout q76 = q7();
        android.graphics.PointF pointF2 = this.D;
        q76.setScaleX(pointF2.x);
        q7().setScaleY(pointF2.y);
        q7().requestLayout();
        android.graphics.PointF pointF3 = new android.graphics.PointF(o7().A7().getWidth(), o7().A7().getHeight());
        w7().setScaleX(1.0f);
        w7().setScaleY(1.0f);
        w7().setTranslationX(0.0f);
        w7().setTranslationY(0.0f);
        by0.b.b(s7(), (w7().getWidth() * 1.0f) / w7().getHeight(), pointF3.x, pointF3.y);
        android.widget.FrameLayout s76 = s7();
        android.graphics.PointF pointF4 = this.C;
        s76.setScaleX(pointF4.x);
        s7().setScaleY(pointF4.y);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new tv0.j(this, new tv0.a0(this), null), 3, null);
        this.f422203p = null;
    }

    public final void k7() {
        long v76 = v7();
        float f17 = 2;
        float b17 = (d1.k.b(v76) * (w7().getScaleY() - this.B)) / f17;
        float d17 = (d1.k.d(v76) * (w7().getScaleX() - this.B)) / f17;
        float translationY = w7().getTranslationY();
        float f18 = -b17;
        if (translationY < f18) {
            translationY = f18;
        }
        if (translationY <= b17) {
            b17 = translationY;
        }
        float translationX = w7().getTranslationX();
        float f19 = -d17;
        if (translationX < f19) {
            translationX = f19;
        }
        if (translationX <= d17) {
            d17 = translationX;
        }
        this.f422212y.set((r7().centerX() - ((d1.k.d(v76) * w7().getScaleX()) / f17)) + d17, (r7().centerY() - ((d1.k.b(v76) * w7().getScaleY()) / f17)) + b17, r7().centerX() + ((d1.k.d(v76) * w7().getScaleX()) / f17) + d17, r7().centerY() + ((d1.k.b(v76) * w7().getScaleY()) / f17) + b17);
        w7().animate().setUpdateListener(new tv0.e(this)).translationX(d17).translationY(b17).setDuration(300L).start();
    }

    public final void l7(android.view.View view) {
        android.graphics.PointF pointF;
        tv0.d dVar = (tv0.d) this.f69240i;
        if (dVar != null) {
            int panelHeight = dVar.getPanelHeight();
            pointF = new android.graphics.PointF(o7().A7().getWidth(), (((r2.getHeight() * 1.0f) + (((com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar) getActivity().findViewById(com.tencent.mm.R.id.q8m)) != null ? r4.getHeight() : 0)) - panelHeight) - ((gx0.bh) ((jz5.n) this.f422206s).getValue()).c7());
        } else {
            pointF = new android.graphics.PointF();
        }
        float f17 = pointF.x;
        float f18 = pointF.y;
        by0.b.b(view, f17 / f18, f17, f18);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.requestLayout();
    }

    public final yw0.p m7() {
        return (yw0.p) o7().f2().b(yw0.q.f466585h);
    }

    public final yw0.b n7() {
        return (yw0.b) o7().f2().b(yw0.q.f466583f);
    }

    public final gx0.w8 o7() {
        return (gx0.w8) ((jz5.n) this.f422207t).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (X6()) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new tv0.j(this, null, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.maas.moviecomposing.segments.ClipSegment t76 = t7();
        if (t76 != null) {
            this.F = kotlinx.coroutines.l.d(getMainScope(), null, null, new tv0.f(this, t76, null), 3, null);
        }
    }

    public final gx0.bf p7() {
        return (gx0.bf) ((jz5.n) this.f422205r).getValue();
    }

    public final android.widget.FrameLayout q7() {
        return (android.widget.FrameLayout) ((jz5.n) this.f422210w).getValue();
    }

    public final android.graphics.RectF r7() {
        return n7().f466527e;
    }

    public final android.widget.FrameLayout s7() {
        return (android.widget.FrameLayout) ((jz5.n) this.f422209v).getValue();
    }

    public final com.tencent.maas.moviecomposing.segments.ClipSegment t7() {
        com.tencent.maas.base.MJID mjid = this.f422203p;
        if (mjid != null) {
            com.tencent.maas.moviecomposing.segments.Segment b76 = ((gx0.kh) ((jz5.n) this.f422204q).getValue()).b7(mjid);
            if (b76 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment) {
                return (com.tencent.maas.moviecomposing.segments.ClipSegment) b76;
            }
        }
        return null;
    }

    public final float u7() {
        mv0.b bVar;
        com.tencent.maas.moviecomposing.c cVar;
        java.lang.Float a17;
        ex0.a0 a0Var = ((gx0.kh) ((jz5.n) this.f422204q).getValue()).f276642r;
        if (a0Var == null || (bVar = a0Var.f257103m) == null || (cVar = bVar.f331530a) == null || (a17 = by0.b.a(cVar)) == null) {
            return 0.5625f;
        }
        return a17.floatValue();
    }

    public final long v7() {
        com.tencent.maas.moviecomposing.segments.ClipSegment t76 = t7();
        if (t76 != null) {
            com.tencent.maas.moviecomposing.AspectRatio o17 = t76.o1();
            java.lang.Float valueOf = o17 != null ? java.lang.Float.valueOf((float) o17.f48363b) : null;
            if (valueOf != null) {
                float floatValue = valueOf.floatValue();
                if (floatValue > u7()) {
                    float width = w7().getWidth();
                    return d1.l.a(width, width / floatValue);
                }
                float height = w7().getHeight();
                return d1.l.a(floatValue * height, height);
            }
        }
        return d1.k.f225641b;
    }

    public final android.view.ViewGroup w7() {
        return (android.view.ViewGroup) ((jz5.n) this.f422211x).getValue();
    }

    public final void x7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView, ex0.a0 a0Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        jz5.g gVar = this.f422201n;
        bx0.j jVar = new bx0.j(e3.d.b(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), ((java.lang.Number) ((jz5.n) this.f422202o).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), 0), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479714d7));
        cropMaterialTimelineView.setTargetSegment$plugin_mj_template_release(clipSegment);
        cropMaterialTimelineView.b(a0Var, jVar, getMainScope());
        cropMaterialTimelineView.setScrollTimeChangedListener(new tv0.o(clipSegment, this, a0Var, cropMaterialTimelineView));
        cropMaterialTimelineView.setScrollStateChangeListener(new tv0.r(this));
        com.tencent.maas.base.MJID mjid = clipSegment.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        cropMaterialTimelineView.n(mjid, this.f422213z);
        tv0.d dVar = (tv0.d) this.f69240i;
        if (dVar != null) {
            com.tencent.maas.model.time.MJTime sub = this.f422213z.sub(clipSegment.A());
            kotlin.jvm.internal.o.f(sub, "sub(...)");
            dVar.K(sub);
        }
    }

    public final void y7() {
        w7().animate().scaleX(this.B).scaleY(this.B).setUpdateListener(new tv0.d0(this)).translationX(0.0f).translationY(0.0f).setDuration(300L).start();
        this.f422212y.set(r7());
    }

    public final void z7() {
        long v76 = v7();
        float x17 = w7().getX() + (w7().getWidth() / 2.0f);
        float y17 = w7().getY() + (w7().getHeight() / 2.0f);
        float d17 = d1.k.d(v76) * w7().getScaleX();
        float b17 = d1.k.b(v76) * w7().getScaleY();
        yw0.b n76 = n7();
        float f17 = 2;
        float f18 = d17 / f17;
        float f19 = b17 / f17;
        n76.f466528f.set(x17 - f18, y17 - f19, x17 + f18, y17 + f19);
        ((yw0.l) n76.f466587a).a();
    }
}
