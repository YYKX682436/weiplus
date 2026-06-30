package ow0;

/* loaded from: classes5.dex */
public final class g extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel {
    public final jz5.g A;
    public final jz5.g B;
    public boolean C;
    public ow0.b D;
    public int E;
    public final java.util.ArrayList F;
    public yz5.a G;
    public final ow0.e H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = jz5.h.b(new ow0.d(this));
        this.B = jz5.h.b(new ow0.f(this));
        this.F = new java.util.ArrayList();
        this.H = new ow0.e(this);
    }

    private final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout getTabLayout() {
        java.lang.Object value = ((jz5.n) this.A).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.viewpager.widget.ViewPager getViewPager() {
        java.lang.Object value = ((jz5.n) this.B).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.viewpager.widget.ViewPager) value;
    }

    private final void setCaptionClickCallback(rw0.a aVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f413432g;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView ? view : null);
        if (captionView != null) {
            captionView.setCaptionCallback(aVar);
        }
    }

    private final void setContentDescClickCallback(rw0.b bVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f413430e;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView ? view : null);
        if (setContentDescView != null) {
            setContentDescView.setDescClickCallback(bVar);
        }
    }

    private final void setFancyTextClickCallback(rw0.c cVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f413431f;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView fancyTextView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView ? view : null);
        if (fancyTextView != null) {
            fancyTextView.setFancyTextClickCallback(cVar);
        }
    }

    private final void setTitleClickCallback(rw0.e eVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f413429d;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView setTitleView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView ? view : null);
        if (setTitleView != null) {
            setTitleView.setTitleClickCallback(eVar);
        }
    }

    public final void C(sw0.f textPage) {
        kotlin.jvm.internal.o.g(textPage, "textPage");
        if (getCurrentPage() == textPage) {
            return;
        }
        java.util.Iterator it = this.F.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((sw0.n) it.next()).f413444b == textPage) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            getTabLayout().setCurrentTab(valueOf.intValue());
        }
    }

    public final void D(java.util.List tabs, ow0.b tabChangeListener, rw0.d textCallback) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        kotlin.jvm.internal.o.g(tabChangeListener, "tabChangeListener");
        kotlin.jvm.internal.o.g(textCallback, "textCallback");
        this.D = tabChangeListener;
        java.util.ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.addAll(tabs);
        getViewPager().setAdapter(new pw0.k(tabs));
        getTabLayout().setViewPager(getViewPager());
        getTabLayout().setOnTabSelectListener(this.H);
        setTitleClickCallback(textCallback);
        setContentDescClickCallback(textCallback);
        setCaptionClickCallback(textCallback);
        setFancyTextClickCallback(textCallback);
    }

    public final void E(com.tencent.maas.base.MJID segmentID, dx0.p thumbnailInfo) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(thumbnailInfo, "thumbnailInfo");
        sw0.f fVar = sw0.f.f413430e;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView ? view : null);
        if (setContentDescView == null) {
            return;
        }
        setContentDescView.post(new vw0.s(setContentDescView, thumbnailInfo, segmentID));
    }

    public final int F(sw0.f page, boolean z17) {
        kotlin.jvm.internal.o.g(page, "page");
        java.util.Iterator it = this.F.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((sw0.n) it.next()).f413444b == page) {
                break;
            }
            i17++;
        }
        getTabLayout().e(i17, z17);
        return i17;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        ou0.z zVar;
        if (getCurrentPage() != sw0.f.f413432g) {
            return new ou0.v(false, 1, null);
        }
        yz5.a aVar = this.G;
        return (aVar == null || (zVar = (ou0.z) aVar.invoke()) == null) ? new ou0.v(false, 1, null) : zVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dga, bodyContainerLayout);
    }

    public final sw0.f getCurrentPage() {
        sw0.f fVar;
        sw0.n nVar = (sw0.n) kz5.n0.a0(this.F, getTabLayout().getCurrentTab());
        return (nVar == null || (fVar = nVar.f413444b) == null) ? sw0.f.f413429d : fVar;
    }

    public final sw0.f getInitPage() {
        sw0.f fVar;
        ow0.a aVar = (ow0.a) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(this, "KEY_PANEL_ARGS", null, 2, null);
        return (aVar == null || (fVar = aVar.f349278a) == null) ? getCurrentPage() : fVar;
    }

    public final com.tencent.maas.base.MJID getSelectedContentDescSegmentID$plugin_mj_template_release() {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f413430e;
        java.util.Iterator it = this.F.iterator();
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
        if (!(view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView)) {
            view = null;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView) view;
        if (setContentDescView != null) {
            return setContentDescView.getSelectedSegmentID$plugin_mj_template_release();
        }
        return null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        ow0.a aVar = (ow0.a) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(this, "KEY_PANEL_ARGS", null, 2, null);
        this.C = aVar != null ? aVar.f349279b : false;
    }

    public final void setCaptionPageTimelineToolbarTypeGetter(yz5.a getter) {
        kotlin.jvm.internal.o.g(getter, "getter");
        this.G = getter;
    }

    public final void setTitle(java.lang.String title) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(title, "title");
        sw0.f fVar = sw0.f.f413429d;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView setTitleView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView ? view : null);
        if (setTitleView != null) {
            setTitleView.setTitle(title);
        }
    }

    public final void setupFancyTextUIStateObserver$plugin_mj_template_release(androidx.lifecycle.g0 uiStateLiveData) {
        kotlin.jvm.internal.o.g(uiStateLiveData, "uiStateLiveData");
        uiStateLiveData.observe(this, new ow0.c(this));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void t() {
        this.C = false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void x() {
        java.lang.Object obj;
        sw0.f initPage = getInitPage();
        sw0.f fVar = sw0.f.f413432g;
        if (initPage == fVar && this.C) {
            java.util.Iterator it = this.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((sw0.n) obj).f413444b == fVar) {
                        break;
                    }
                }
            }
            sw0.n nVar = (sw0.n) obj;
            android.view.View view = nVar != null ? nVar.f413445c : null;
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView ? view : null);
            if (captionView != null) {
                captionView.f69321e.performClick();
            }
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void z() {
        sw0.f currentPage = getCurrentPage();
        sw0.n nVar = (sw0.n) kz5.n0.a0(this.F, this.E);
        if (currentPage == (nVar != null ? nVar.f413444b : null)) {
            return;
        }
        getTabLayout().e(this.E, false);
    }
}
