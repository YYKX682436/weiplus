package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.plugin.finder.ui.fav.a {

    /* renamed from: g, reason: collision with root package name */
    public final q40.h f129167g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f129168h;

    public g(q40.h hVar) {
        this.f129167g = hVar;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public boolean g() {
        return this.f129167g != null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void i(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        q40.h hVar = this.f129167g;
        if (hVar != null) {
            hVar.T(view, i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void m() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestInit stack=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("FinderGlobalFavPresenter", sb6.toString());
        ((com.tencent.mm.plugin.fav.ui.d3) ((o72.f4) i95.n0.c(o72.f4.class))).getClass();
        jz5.l c17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a().c(-1, 10);
        v((java.util.List) c17.f302834e, true, ((java.lang.Boolean) c17.f302833d).booleanValue());
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLoadMore stack=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("FinderGlobalFavPresenter", sb6.toString());
        o72.f4 f4Var = (o72.f4) i95.n0.c(o72.f4.class);
        int h17 = kz5.c0.h(this.f129148d);
        ((com.tencent.mm.plugin.fav.ui.d3) f4Var).getClass();
        jz5.l c17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a().c(h17, 10);
        v((java.util.List) c17.f302834e, false, ((java.lang.Boolean) c17.f302833d).booleanValue());
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void q() {
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.a
    public void s() {
        this.f129148d.clear();
        this.f129168h = false;
    }

    public final void v(java.util.List data, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("FinderGlobalFavPresenter", "updateData, data:" + data.size() + ", refresh:" + z17 + ", hasMore: " + z18);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(data, 10));
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(com.tencent.mm.plugin.finder.assist.n7.f102406a.c((r45.kv2) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList3.add(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it6.next(), 256)));
        }
        arrayList2.addAll(arrayList3);
        java.util.ArrayList arrayList4 = this.f129148d;
        if (z17) {
            arrayList4.clear();
        }
        int size = arrayList4.size();
        arrayList4.addAll(arrayList2);
        if (z17) {
            androidx.recyclerview.widget.f2 adapter = f().d().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else {
            androidx.recyclerview.widget.f2 adapter2 = f().d().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(size, arrayList2.size());
            }
        }
        f().f();
        this.f129168h = z18;
        if (z17) {
            f().e().i(true);
        } else {
            f().e().e(true);
        }
        f().e().E(true ^ z18);
        if (arrayList4.isEmpty()) {
            f().k();
        }
    }
}
