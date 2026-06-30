package uw0;

/* loaded from: classes5.dex */
public final class x extends ov0.a {
    public final jz5.g A1;
    public final lv0.c B1;
    public uw0.p C1;
    public uw0.q D1;
    public final pw0.b E1;

    /* renamed from: y1, reason: collision with root package name */
    public final float f431622y1;

    /* renamed from: z1, reason: collision with root package name */
    public final int f431623z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f431622y1 = j65.q.a(context).getDimension(com.tencent.mm.R.dimen.f479738dv);
        this.f431623z1 = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480561al1);
        this.A1 = jz5.h.b(new uw0.v(context, this));
        this.B1 = new lv0.c(j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, 0, 0, null, 56, null);
        this.D1 = uw0.q.f431594e;
        this.E1 = new pw0.b(new uw0.u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getInitTranslationY() {
        return ((getHeight() - getContentContainer().getHeight()) - this.f431623z1) + this.f431622y1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getRecommendTitleView() {
        return (android.view.View) ((jz5.n) this.A1).getValue();
    }

    @Override // ov0.t
    public void L() {
        getNextBtn().setVisibility(8);
    }

    @Override // ov0.t
    public void O() {
        super.O();
        if (uw0.q.f431593d == this.D1) {
            U();
        }
    }

    @Override // ov0.t
    public void P() {
        super.P();
        if (uw0.q.f431593d == this.D1) {
            V();
        }
    }

    public final void U() {
        getRecommendTitleView().animate().translationY(getInitTranslationY() - this.f431622y1).alpha(1.0f).setDuration(200L).withStartAction(new uw0.r(this)).start();
    }

    public final void V() {
        getInitTranslationY();
        getRecommendTitleView().animate().translationY(getInitTranslationY()).alpha(0.0f).setDuration(200L).withEndAction(new uw0.s(this)).start();
    }

    public final void W(tw0.b result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (getHeight() <= 0) {
            post(new uw0.w(this, result));
            return;
        }
        if (!result.f422417a) {
            this.D1 = uw0.q.f431594e;
            V();
        } else if (this.D1 == uw0.q.f431594e) {
            this.D1 = uw0.q.f431593d;
            U();
        }
        java.util.LinkedList linkedList = result.f422418b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(new sw0.a((r45.ol5) it.next(), false));
        }
        this.E1.y(arrayList);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y
    public int getEditTextMaxLineOnExpand() {
        return 1;
    }

    @Override // ov0.t, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        super.p();
        android.view.View recommendTitleView = getRecommendTitleView();
        kotlin.jvm.internal.o.f(recommendTitleView, "<get-recommendTitleView>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recommendTitleView, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel", "onAttached", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recommendTitleView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recommendTitleView, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel", "onAttached", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getRecommendTitleView());
        post(new uw0.t(this));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) getRecommendTitleView().findViewById(com.tencent.mm.R.id.rwq);
        recyclerView.setAdapter(this.E1);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.N(this.B1);
        }
    }

    public final void setRecommendTitleSelector(uw0.p selector) {
        kotlin.jvm.internal.o.g(selector, "selector");
        this.C1 = selector;
    }

    public final void setTextFilter$plugin_mj_template_release(android.text.InputFilter filter) {
        kotlin.jvm.internal.o.g(filter, "filter");
        getEditText().setFilters(new android.text.InputFilter[]{filter});
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void t() {
        android.view.ViewParent parent = getRecommendTitleView().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(getRecommendTitleView());
        }
        getRecommendTitleView().clearAnimation();
        this.D1 = uw0.q.f431594e;
        this.C1 = null;
        super.t();
    }
}
