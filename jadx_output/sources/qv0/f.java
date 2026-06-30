package qv0;

/* loaded from: classes5.dex */
public abstract class f extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.r {
    public yz5.l A;
    public yz5.l B;
    public boolean C;
    public boolean D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.E = jz5.h.b(new qv0.a(this));
        this.F = jz5.h.b(new qv0.b(this));
        this.G = jz5.h.b(new qv0.e(this));
    }

    private final android.view.View getCloseBtn() {
        java.lang.Object value = ((jz5.n) this.E).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getDoneBtn() {
        java.lang.Object value = ((jz5.n) this.F).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.widget.TextView getTitleView() {
        java.lang.Object value = ((jz5.n) this.G).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void B() {
        getDoneBtn().setEnabled(false);
        getDoneBtn().clearAnimation();
        getDoneBtn().animate().alpha(0.2f).setDuration(500L).start();
    }

    public final void C() {
        getDoneBtn().clearAnimation();
        getDoneBtn().animate().alpha(1.0f).setDuration(500L).start();
        getDoneBtn().setEnabled(true);
    }

    public boolean D() {
        return !(this instanceof iv0.c);
    }

    public boolean E(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        yz5.l lVar = this.B;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.invoke(view)).booleanValue();
        }
        return true;
    }

    public boolean F(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        yz5.l lVar = this.A;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.invoke(view)).booleanValue();
        }
        return true;
    }

    public final void G() {
        getTitleView().invalidate();
        getTitleView().setText(getToolbarTitle());
        if (this instanceof lw0.c) {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout mJSlidingTabLayout = this.H;
            if (mJSlidingTabLayout != null) {
                mJSlidingTabLayout.setVisibility(0);
            }
            getTitleView().setVisibility(8);
        } else {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout mJSlidingTabLayout2 = this.H;
            if (mJSlidingTabLayout2 != null) {
                mJSlidingTabLayout2.setVisibility(8);
            }
            getTitleView().setVisibility(0);
        }
        android.view.View closeBtn = getCloseBtn();
        int i17 = D() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(closeBtn, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        closeBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(closeBtn, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View doneBtn = getDoneBtn();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(doneBtn, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        doneBtn.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(doneBtn, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/toolbar/BaseNormalToolbarPanel", "redrawToolbarUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void H() {
        this.C = false;
        this.D = false;
    }

    public final void I(yz5.l done, yz5.l close) {
        kotlin.jvm.internal.o.g(done, "done");
        kotlin.jvm.internal.o.g(close, "close");
        this.A = done;
        this.B = close;
    }

    public final void J() {
        if (this.C) {
            return;
        }
        this.C = true;
        this.D = true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public android.graphics.drawable.Drawable getPanelBackground() {
        android.content.res.Resources a17 = j65.q.a(getContext());
        java.lang.ThreadLocal threadLocal = d3.q.f226108a;
        android.graphics.drawable.Drawable a18 = d3.l.a(a17, com.tencent.mm.R.drawable.cmc, null);
        return a18 == null ? new android.graphics.drawable.ColorDrawable(j65.q.a(getContext()).getColor(com.tencent.mm.R.color.ad7, null)) : a18;
    }

    public final boolean getShouldTakeSnapshotWhenClose$plugin_mj_template_release() {
        return this.D;
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout getToolbarTabLayout() {
        return this.H;
    }

    public abstract java.lang.String getToolbarTitle();

    public final boolean getUserActed$plugin_mj_template_release() {
        return this.C;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public final boolean o() {
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public final void r(android.content.Context context, android.widget.FrameLayout headerContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerContainerLayout, "headerContainerLayout");
        super.r(context, headerContainerLayout);
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dge, headerContainerLayout);
        this.H = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout) findViewById(com.tencent.mm.R.id.q9b);
        getCloseBtn().setOnClickListener(new qv0.c(this));
        getDoneBtn().setOnClickListener(new qv0.d(this));
        G();
    }

    public final void setToolbarTabLayout(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout mJSlidingTabLayout) {
        this.H = mJSlidingTabLayout;
    }
}
