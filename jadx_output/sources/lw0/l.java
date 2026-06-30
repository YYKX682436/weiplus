package lw0;

/* loaded from: classes5.dex */
public abstract class l extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k implements mw0.h {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f321541n;

    /* renamed from: o, reason: collision with root package name */
    public mv0.d f321542o;

    /* renamed from: p, reason: collision with root package name */
    public lw0.d f321543p;

    /* renamed from: q, reason: collision with root package name */
    public final lw0.j f321544q;

    /* renamed from: r, reason: collision with root package name */
    public final lw0.k f321545r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f321541n = jz5.h.b(new lw0.i(this));
        this.f321542o = mv0.d.f331535d;
        this.f321544q = new lw0.j(this);
        this.f321545r = new lw0.k();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new lw0.c(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void Z6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        lw0.c panel = (lw0.c) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new mv0.e(getString(com.tencent.mm.R.string.lln), mv0.d.f331535d, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView(getActivity(), null, 0, 6, null)));
        arrayList.add(new mv0.e(getString(com.tencent.mm.R.string.llo), mv0.d.f331536e, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.ReplaceStyleView(getActivity(), null, 0, 6, null)));
        lw0.j tabChangeListener = this.f321544q;
        kotlin.jvm.internal.o.g(tabChangeListener, "tabChangeListener");
        lw0.k whenWhereCallback = this.f321545r;
        kotlin.jvm.internal.o.g(whenWhereCallback, "whenWhereCallback");
        gv0.d dVar = new gv0.d(arrayList);
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout toolbarTabLayout = panel.getToolbarTabLayout();
        if (toolbarTabLayout != null) {
            panel.L = tabChangeListener;
            java.util.ArrayList arrayList2 = panel.f321530J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            androidx.viewpager.widget.ViewPager viewPager = panel.I;
            if (viewPager == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            viewPager.setAdapter(dVar);
            androidx.viewpager.widget.ViewPager viewPager2 = panel.I;
            if (viewPager2 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            toolbarTabLayout.setViewPager(viewPager2);
            toolbarTabLayout.setOnTabSelectListener(panel.K);
        }
        panel.setSelectedCallback(this);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        lw0.c panel = (lw0.c) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        com.tencent.maas.base.MJID destID$plugin_mj_template_release = panel.getDestID$plugin_mj_template_release();
        if (destID$plugin_mj_template_release == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            destID$plugin_mj_template_release = null;
        }
        if (destID$plugin_mj_template_release == null) {
            return;
        }
        mv0.d dVar = this.f321542o;
        mv0.d dVar2 = mv0.d.f331535d;
        if (dVar == dVar2) {
            s7();
        }
        this.f321543p = o7();
        nw0.h n76 = n7();
        lw0.d dVar3 = this.f321543p;
        kotlinx.coroutines.l.d(n76.f340768b, null, null, new nw0.d(n76, dVar3 != null ? dVar3.f321531a : null, null), 3, null);
        p7(panel);
        java.util.Iterator it = panel.f321530J.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((mv0.e) it.next()).f331539b == dVar2) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout toolbarTabLayout = panel.getToolbarTabLayout();
        if (toolbarTabLayout != null) {
            toolbarTabLayout.e(i17, false);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        mv0.c cVar;
        lw0.c cVar2 = (lw0.c) this.f69240i;
        if (cVar2 == null || (cVar = cVar2.getEditPurpose$plugin_mj_template_release()) == null) {
            cVar = mv0.c.f331533e;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            t7();
        } else if (ordinal == 1) {
            u7();
        }
        n7().e();
    }

    @Override // mw0.h
    public void e3(kw0.a stickerData) {
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
        nw0.h n76 = n7();
        n76.getClass();
        kotlinx.coroutines.l.d(n76.f340768b, null, null, new nw0.e(stickerData, n76, kw0.b.f312792f, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(com.tencent.maas.moviecomposing.e r18, long r19) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw0.l.k7(com.tencent.maas.moviecomposing.e, long):void");
    }

    public boolean l7(kw0.e state) {
        kotlin.jvm.internal.o.g(state, "state");
        return false;
    }

    public final void m7(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo) {
        lw0.c cVar = (lw0.c) this.f69240i;
        if (cVar != null) {
            lw0.g gVar = new lw0.g(this);
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenPickerView K = cVar.K();
            if (K != null) {
                K.removeAllViews();
                com.tencent.mm.ui.id.b(K.getContext()).inflate(com.tencent.mm.R.layout.dgh, K);
                android.widget.TextView textView = (android.widget.TextView) K.findViewById(com.tencent.mm.R.id.qb8);
                if (textView != null) {
                    textView.setText(geographicInfo != null ? geographicInfo.getName() : null);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) K.findViewById(com.tencent.mm.R.id.q7q);
                if (imageView != null) {
                    imageView.setOnClickListener(new mw0.k(gVar));
                }
            }
        }
    }

    public final nw0.h n7() {
        return (nw0.h) ((jz5.n) this.f321541n).getValue();
    }

    public abstract lw0.d o7();

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        n7().d();
    }

    public void p7(lw0.c panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        n7().f340771e.observe(W6(), new lw0.h(this, panel));
    }

    public abstract void q7(java.util.Calendar calendar);

    public abstract void r7(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo);

    public abstract void s7();

    public abstract void t7();

    public abstract void u7();

    public void v7(lw0.c panel, kw0.e state) {
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(state, "state");
        panel.setWhenWhereUiState(state);
    }
}
