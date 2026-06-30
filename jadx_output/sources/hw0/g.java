package hw0;

/* loaded from: classes5.dex */
public final class g extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel {
    public final jz5.g A;
    public final jz5.g B;
    public hw0.a C;
    public final java.util.ArrayList D;
    public final hw0.d E;
    public jw0.a F;
    public final yz5.l G;
    public final yz5.l H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = jz5.h.b(new hw0.c(this));
        this.B = jz5.h.b(new hw0.e(this));
        this.D = new java.util.ArrayList();
        this.E = new hw0.d(this);
        this.G = new hw0.b(this);
        this.H = new hw0.f(this);
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

    public final void C(java.util.List tabs, hw0.a tabChangeListener, jw0.a stickerCallback) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(tabs, "tabs");
        kotlin.jvm.internal.o.g(tabChangeListener, "tabChangeListener");
        kotlin.jvm.internal.o.g(stickerCallback, "stickerCallback");
        this.C = tabChangeListener;
        this.F = stickerCallback;
        java.util.ArrayList arrayList = this.D;
        arrayList.clear();
        arrayList.addAll(tabs);
        getViewPager().setAdapter(new iw0.a(tabs));
        getTabLayout().setViewPager(getViewPager());
        getTabLayout().setOnTabSelectListener(this.E);
        kw0.c cVar = kw0.c.f312795d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kw0.d) obj).f312799b == cVar) {
                    break;
                }
            }
        }
        kw0.d dVar = (kw0.d) obj;
        android.view.View view = dVar != null ? dVar.f312800c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView emotionView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView ? view : null);
        if (emotionView != null) {
            emotionView.setEmotionTabData(this.G);
        }
    }

    public final void D(kw0.c initPage, boolean z17) {
        kotlin.jvm.internal.o.g(initPage, "initPage");
        java.util.Iterator it = this.D.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((kw0.d) it.next()).f312799b == initPage) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        getTabLayout().e(i17, z17);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489268dg4, bodyContainerLayout);
    }

    public final kw0.c getCurrentPage$plugin_mj_template_release() {
        kw0.c cVar;
        kw0.d dVar = (kw0.d) kz5.n0.a0(this.D, getTabLayout().getCurrentTab());
        return (dVar == null || (cVar = dVar.f312799b) == null) ? kw0.c.f312796e : cVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    public final void setWhenWhereUiState(kw0.e state) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(state, "state");
        java.util.List list = state.f312801a;
        if (list.isEmpty()) {
            return;
        }
        kw0.c cVar = kw0.c.f312796e;
        java.util.Iterator it = this.D.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kw0.d) obj).f312799b == cVar) {
                    break;
                }
            }
        }
        kw0.d dVar = (kw0.d) obj;
        android.view.View view = dVar != null ? dVar.f312800c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenWhereView whenWhereView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenWhereView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenWhereView ? view : null);
        if (whenWhereView == null) {
            return;
        }
        kw0.k kVar = state.f312803c;
        if (kVar instanceof kw0.i) {
            whenWhereView.a(list, this.H);
            return;
        }
        if (kVar instanceof kw0.g) {
            kw0.g gVar = (kw0.g) kVar;
            kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f312805a);
            if (aVar != null) {
                whenWhereView.b(gVar.f312805a, aVar);
            }
        }
    }
}
