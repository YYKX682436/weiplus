package pv0;

/* loaded from: classes5.dex */
public final class m extends qv0.f {
    public androidx.recyclerview.widget.RecyclerView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f358537J;
    public final jz5.g K;
    public pv0.i L;
    public boolean M;
    public boolean N;
    public java.lang.String P;
    public pv0.j Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.K = jz5.h.b(new pv0.l(this));
        this.M = true;
        this.P = "";
        this.Q = pv0.j.f358532d;
    }

    public static final void K(pv0.m mVar, int i17, dw0.c cVar) {
        java.lang.Object obj;
        java.util.Iterator it = mVar.getTimbreAdapter().f275970d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dw0.c) obj).f244089d) {
                    break;
                }
            }
        }
        dw0.c cVar2 = (dw0.c) obj;
        if (cVar.f244089d) {
            if (cVar.f244088c != zu0.i.f475677g) {
                return;
            }
        }
        pv0.i iVar = mVar.L;
        if (iVar != null) {
            ((pv0.w) iVar).a(cVar2, cVar, mVar.Q);
        }
    }

    private final cw0.b1 getTimbreAdapter() {
        return (cw0.b1) ((jz5.n) this.K).getValue();
    }

    @Override // qv0.f
    public boolean D() {
        return this.N;
    }

    public final void L(dw0.e selectedPack) {
        cw0.b1 timbreAdapter = getTimbreAdapter();
        timbreAdapter.getClass();
        kotlin.jvm.internal.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = timbreAdapter.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dw0.c cVar = (dw0.c) obj;
            if (cVar.f244089d) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), dw0.c.a(cVar, null, null, null, false, 7, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            dw0.c cVar2 = (dw0.c) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (cVar2 != null) {
                arrayList.set(intValue, cVar2);
                timbreAdapter.notifyItemChanged(intValue);
            }
        }
        int i19 = selectedPack.f244094b;
        dw0.c cVar3 = (dw0.c) kz5.n0.a0(arrayList, i19);
        if (cVar3 != null) {
            timbreAdapter.x(i19, dw0.c.a(cVar3, null, null, null, true, 7, null));
        }
        if (cVar3 != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("timbreRv");
                throw null;
            }
            dy0.o.b(recyclerView, selectedPack.f244094b, false, 2, null);
        }
    }

    public final void M(dw0.d state) {
        pv0.i iVar;
        kotlin.jvm.internal.o.g(state, "state");
        state.toString();
        dw0.l lVar = state.f244092c;
        boolean z17 = lVar instanceof dw0.h;
        java.lang.Object obj = null;
        java.util.List list = state.f244090a;
        dw0.e eVar = state.f244091b;
        if (z17) {
            getTimbreAdapter().y(list);
            L(eVar);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("timbreRv");
                throw null;
            }
            recyclerView.setVisibility(0);
            android.view.View view = this.f358537J;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (lVar instanceof dw0.k) {
            L(eVar);
            return;
        }
        if (lVar instanceof dw0.i) {
            dw0.i iVar2 = (dw0.i) lVar;
            getTimbreAdapter().z(iVar2.f244097a, iVar2.f244098b);
            return;
        }
        if (lVar instanceof dw0.j) {
            L(eVar);
            dw0.j jVar = (dw0.j) lVar;
            getTimbreAdapter().z(jVar.f244099a, jVar.f244100b);
            dw0.c cVar = (dw0.c) kz5.n0.a0(list, eVar.f244094b);
            if (cVar == null || !isShown() || (iVar = this.L) == null) {
                return;
            }
            pv0.w wVar = (pv0.w) iVar;
            com.tencent.maas.moviecomposing.segments.Segment segment = cVar.f244087b;
            if (segment == null) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                segment = null;
            }
            if (segment == null) {
                return;
            }
            java.lang.Object obj2 = wVar.f358556a.f358564r.get(segment.C());
            if (obj2 == null) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else {
                obj = obj2;
            }
            pv0.g gVar = (pv0.g) obj;
            if (gVar == null) {
                return;
            }
            pv0.n nVar = (pv0.n) gVar.f358520a;
            nVar.getClass();
            if (nVar.f358539b.f358565s.f358541b) {
                return;
            }
            nVar.f358538a.d(cVar);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.djq, bodyContainerLayout);
    }

    public final pv0.h getTimbrePanelArgs$plugin_mj_template_release() {
        return (pv0.h) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(this, "KEY_TIMBRE_ARGS", null, 2, null);
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        return this.P;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        pv0.h timbrePanelArgs$plugin_mj_template_release = getTimbrePanelArgs$plugin_mj_template_release();
        if (timbrePanelArgs$plugin_mj_template_release == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            timbrePanelArgs$plugin_mj_template_release = null;
        }
        if (timbrePanelArgs$plugin_mj_template_release == null) {
            return;
        }
        this.M = timbrePanelArgs$plugin_mj_template_release.f358530f;
        this.N = timbrePanelArgs$plugin_mj_template_release.f358531g;
        this.P = timbrePanelArgs$plugin_mj_template_release.f358527c;
        this.Q = timbrePanelArgs$plugin_mj_template_release.f358528d;
        timbrePanelArgs$plugin_mj_template_release.toString();
        G();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("timbreRv");
            throw null;
        }
        recyclerView.setVisibility(8);
        android.view.View view = this.f358537J;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setTimbreCallback(pv0.i callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.L = callback;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.e4u);
        androidx.recyclerview.widget.n2 itemAnimator = ((androidx.recyclerview.widget.RecyclerView) findViewById).getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.I = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.hmo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f358537J = findViewById2;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("timbreRv");
            throw null;
        }
        recyclerView.setAdapter(getTimbreAdapter());
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.I;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("timbreRv");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.I;
        if (recyclerView3 != null) {
            recyclerView3.N(new uv0.a(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479671c8)));
        } else {
            kotlin.jvm.internal.o.o("timbreRv");
            throw null;
        }
    }
}
