package zv0;

/* loaded from: classes5.dex */
public final class f0 extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f476174J;
    public yz5.p K;
    public yz5.l L;
    public yz5.a M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public zv0.r S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.N = jz5.h.b(new zv0.e0(this));
        this.P = jz5.h.b(new zv0.d0(this));
        this.Q = jz5.h.b(new zv0.b0(this));
        this.R = jz5.h.b(new zv0.z(this));
        zv0.r rVar = zv0.r.f476220d;
        this.S = zv0.r.f476220d;
    }

    public static final void K(zv0.f0 f0Var, int i17, zv0.r rVar) {
        yz5.p pVar;
        f0Var.getClass();
        if (rVar.f476223c) {
            zu0.i iVar = zu0.i.f475677g;
            zu0.i iVar2 = rVar.f476222b;
            if (iVar2 != iVar && iVar2 != zu0.i.f475676f) {
                return;
            }
        }
        ex0.j0 transitionSegmentVM = f0Var.getTransitionSegmentVM();
        if (transitionSegmentVM == null || (pVar = f0Var.K) == null) {
            return;
        }
        pVar.invoke(rVar, transitionSegmentVM);
    }

    private final android.view.View getApplyToAllButton() {
        java.lang.Object value = ((jz5.n) this.R).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getLoadingView() {
        java.lang.Object value = ((jz5.n) this.Q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final zv0.q getTransitionAdapter() {
        return (zv0.q) ((jz5.n) this.P).getValue();
    }

    private final androidx.recyclerview.widget.RecyclerView getTransitionRv() {
        java.lang.Object value = ((jz5.n) this.N).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    private final ex0.j0 getTransitionSegmentVM() {
        ex0.r focusedSegmentVM = getFocusedSegmentVM();
        if (focusedSegmentVM instanceof ex0.j0) {
            return (ex0.j0) focusedSegmentVM;
        }
        return null;
    }

    @Override // qv0.f
    public boolean D() {
        return true;
    }

    public final void L(zv0.g0 selectedPack) {
        zv0.q transitionAdapter = getTransitionAdapter();
        transitionAdapter.getClass();
        kotlin.jvm.internal.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = transitionAdapter.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            zv0.r rVar = (zv0.r) obj;
            if (rVar.f476223c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), zv0.r.a(rVar, null, null, false, 3, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            zv0.r rVar2 = (zv0.r) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (rVar2 != null) {
                arrayList.set(intValue, rVar2);
                transitionAdapter.notifyItemChanged(intValue);
            }
        }
        int i19 = selectedPack.f476178b;
        zv0.r rVar3 = (zv0.r) kz5.n0.a0(arrayList, i19);
        if (rVar3 != null) {
            transitionAdapter.x(i19, zv0.r.a(rVar3, null, null, true, 3, null));
        }
        if (rVar3 != null) {
            dy0.o.b(getTransitionRv(), selectedPack.f476178b, false, 2, null);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dlw, bodyContainerLayout);
    }

    public final yz5.l getOnApplyToAllButtonClicked() {
        return this.L;
    }

    public final yz5.a getOnAttached() {
        return this.f476174J;
    }

    public final yz5.a getOnClosed() {
        return this.M;
    }

    public final yz5.p getOnTransitionSelected() {
        return this.K;
    }

    public final zv0.r getSelectedTransitionInfo() {
        return this.S;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String string = j65.q.a(getContext()).getString(com.tencent.mm.R.string.m1p);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        super.p();
        getTransitionRv().setVisibility(8);
        android.view.View applyToAllButton = getApplyToAllButton();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(applyToAllButton, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        applyToAllButton.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(applyToAllButton, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View loadingView = getLoadingView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(loadingView, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadingView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(loadingView, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f476174J;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void s() {
        yz5.a aVar = this.M;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setInitTransitionInfo(zv0.r initTransitionInfo) {
        kotlin.jvm.internal.o.g(initTransitionInfo, "initTransitionInfo");
        this.S = initTransitionInfo;
    }

    public final void setOnApplyToAllButtonClicked(yz5.l lVar) {
        this.L = lVar;
    }

    public final void setOnAttached(yz5.a aVar) {
        this.f476174J = aVar;
    }

    public final void setOnClosed(yz5.a aVar) {
        this.M = aVar;
    }

    public final void setOnTransitionSelected(yz5.p pVar) {
        this.K = pVar;
    }

    public final void setSelectedTransitionInfo(zv0.r rVar) {
        kotlin.jvm.internal.o.g(rVar, "<set-?>");
        this.S = rVar;
    }

    public final void setTransitionUiState(zv0.h0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        zv0.n0 n0Var = state.f476183c;
        boolean z17 = n0Var instanceof zv0.j0;
        zv0.g0 g0Var = state.f476182b;
        if (!z17) {
            if (n0Var instanceof zv0.m0) {
                L(g0Var);
                return;
            }
            if (n0Var instanceof zv0.k0) {
                zv0.k0 k0Var = (zv0.k0) n0Var;
                getTransitionAdapter().z(k0Var.f476195a, k0Var.f476196b);
                return;
            } else {
                if (n0Var instanceof zv0.l0) {
                    L(g0Var);
                    zv0.l0 l0Var = (zv0.l0) n0Var;
                    getTransitionAdapter().z(l0Var.f476201a, l0Var.f476202b);
                    return;
                }
                return;
            }
        }
        getTransitionAdapter().y(state.f476181a);
        L(g0Var);
        getTransitionRv().setVisibility(0);
        android.view.View applyToAllButton = getApplyToAllButton();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(applyToAllButton, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        applyToAllButton.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(applyToAllButton, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View loadingView = getLoadingView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(loadingView, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadingView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(loadingView, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.content.res.Resources a17 = j65.q.a(getContext());
        androidx.recyclerview.widget.RecyclerView transitionRv = getTransitionRv();
        transitionRv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(transitionRv.getContext(), 0, false));
        androidx.recyclerview.widget.n2 itemAnimator = transitionRv.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        transitionRv.N(new lv0.c(a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, 0, lv0.f.f321489f, 24, null));
        transitionRv.setAdapter(getTransitionAdapter());
        getApplyToAllButton().setOnClickListener(new zv0.a0(this));
    }
}
