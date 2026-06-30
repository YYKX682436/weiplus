package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class py extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public boolean f135636g = true;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ty f135637h;

    public py(com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar) {
        this.f135637h = tyVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof fc2.t) && ((i17 = ((fc2.t) event).f260985d) == 6 || i17 == 5);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed I0;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed I02;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            fc2.t tVar = (fc2.t) ev6;
            com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar = this.f135637h;
            int i17 = tVar.f260985d;
            if (i17 != 5) {
                if (i17 == 6 && (I02 = I0(tVar)) != null) {
                    tyVar.f136068e = I02;
                    return;
                }
                return;
            }
            if (!this.f135636g || (I0 = I0(tVar)) == null) {
                return;
            }
            tyVar.f136068e = I0;
            this.f135636g = false;
        }
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed I0(fc2.t tVar) {
        android.view.View findViewById;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar = this.f135637h;
        if (tyVar.getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = tyVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().getView();
            findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.m6e) : null;
        } else {
            findViewById = tyVar.findViewById(com.tencent.mm.R.id.m6e);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = findViewById instanceof com.tencent.mm.view.RefreshLoadMoreLayout ? (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById : null;
        androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout != null ? refreshLoadMoreLayout.getRecyclerView() : null;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null) {
            return null;
        }
        java.util.Iterator it = wxRecyclerAdapter.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((in5.c) obj).getItemId() == tVar.f260992k) {
                break;
            }
        }
        if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        }
        return null;
    }
}
