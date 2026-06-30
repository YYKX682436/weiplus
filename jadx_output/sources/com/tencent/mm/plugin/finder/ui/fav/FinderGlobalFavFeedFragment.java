package com.tencent.mm.plugin.finder.ui.fav;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lq40/g;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderGlobalFavFeedFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements q40.g {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f129131t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.fav.a f129132u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.fav.x f129133v;

    /* renamed from: w, reason: collision with root package name */
    public q40.h f129134w;

    public FinderGlobalFavFeedFragment(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f129131t = "Finder.GlobalFavFeedFragment_".concat(source);
    }

    public void A0() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.fd) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class)).f134393d = false;
            com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129133v;
            if (xVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.app.Activity context = xVar.f129217a;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.fd) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class)).f134394e.clear();
            androidx.recyclerview.widget.f2 adapter = xVar.d().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    public com.tencent.mm.plugin.finder.ui.fav.a B0() {
        q40.h hVar = this.f129134w;
        return hVar != null ? new com.tencent.mm.plugin.finder.ui.fav.g(hVar) : new com.tencent.mm.plugin.finder.ui.fav.p();
    }

    public com.tencent.mm.plugin.finder.ui.fav.x C0(android.view.View view, com.tencent.mm.plugin.finder.ui.fav.a presenter) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
        return new com.tencent.mm.plugin.finder.ui.fav.x(requireActivity, this, presenter, view);
    }

    public void F0(java.util.List positionList) {
        kotlin.jvm.internal.o.g(positionList, "positionList");
        com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129133v;
        if (xVar != null) {
            xVar.i(positionList);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488823ak1;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.viewmodel.component.ut.class});
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.ui.fav.a aVar = this.f129132u;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        aVar.onDetach();
        this.f129134w = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f129134w != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).R6(true);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f129134w != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).R6(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(this.f129131t, "onViewCreated action=" + this.f129134w);
        super.onViewCreated(view, bundle);
        com.tencent.mm.plugin.finder.ui.fav.a B0 = B0();
        this.f129132u = B0;
        if (B0 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.fav.x C0 = C0(view, B0);
        this.f129133v = C0;
        com.tencent.mm.plugin.finder.ui.fav.a aVar = this.f129132u;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        if (C0 != null) {
            aVar.h(C0);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return this.f129134w != null ? 188 : 164;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void w0() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, activity, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Wj(activity, intent, 7, kz5.p0.f313996d);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    public void y0(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129133v;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (i17 == 1 && i18 == -1) {
            int intExtra = intent != null ? intent.getIntExtra("DATA_SIZE", 0) : 0;
            com.tencent.mm.plugin.finder.ui.fav.a aVar = xVar.f129219c;
            com.tencent.mm.plugin.finder.ui.fav.g gVar = aVar instanceof com.tencent.mm.plugin.finder.ui.fav.g ? (com.tencent.mm.plugin.finder.ui.fav.g) aVar : null;
            if (gVar == null) {
                return;
            }
            java.util.ArrayList arrayList = gVar.f129148d;
            if (intExtra > arrayList.size()) {
                com.tencent.mars.xlog.Log.i("FinderGlobalFavViewCallback", "onActivityResult detailSize: " + intExtra + ", listSize:" + arrayList.size());
                int size = intExtra - arrayList.size();
                o72.f4 f4Var = (o72.f4) i95.n0.c(o72.f4.class);
                int h17 = kz5.c0.h(arrayList);
                ((com.tencent.mm.plugin.fav.ui.d3) f4Var).getClass();
                jz5.l c17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a().c(h17, size);
                gVar.v((java.util.List) c17.f302834e, false, ((java.lang.Boolean) c17.f302833d).booleanValue());
            }
        }
    }

    public void z0(int i17) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.fd) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class)).f134393d = true;
            com.tencent.mm.plugin.finder.ui.fav.x xVar = this.f129133v;
            if (xVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            so2.j5 j5Var = (so2.j5) kz5.n0.a0(xVar.f129219c.c(), i17);
            if (j5Var != null) {
                android.app.Activity context = xVar.f129217a;
                kotlin.jvm.internal.o.g(context, "context");
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.fd fdVar = (com.tencent.mm.plugin.finder.viewmodel.component.fd) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fd.class);
                fdVar.f134394e.put(java.lang.Long.valueOf(j5Var.getItemId()), java.lang.Boolean.TRUE);
                androidx.recyclerview.widget.f2 adapter = xVar.d().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }
}
