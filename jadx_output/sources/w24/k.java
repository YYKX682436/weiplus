package w24;

/* loaded from: classes8.dex */
public final class k extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f442623d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f442624e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f442625f;

    /* renamed from: g, reason: collision with root package name */
    public xm3.t0 f442626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f442623d = jz5.h.b(new w24.j(this));
        this.f442624e = new java.util.ArrayList();
    }

    public final w24.l T6(java.lang.String key) {
        java.lang.Iterable iterable;
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f442625f;
        if (mvvmList == null || (iterable = mvvmList.f152065o) == null) {
            iterable = this.f442624e;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w24.l p17 = ((w24.d) it.next()).p(key);
            if (p17 != null) {
                return p17;
            }
        }
        return null;
    }

    public final void U6(java.lang.String key, boolean z17) {
        java.lang.Iterable<w24.d> iterable;
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f442625f;
        if (mvvmList == null || (iterable = mvvmList.f152065o) == null) {
            iterable = this.f442624e;
        }
        for (w24.d dVar : iterable) {
            w24.l p17 = dVar.p(key);
            if (p17 != null) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, dVar + ' ' + key + " hideItem");
                p17.f442630d = z17;
                V6(dVar);
            }
        }
    }

    public final void V6(w24.d group) {
        java.lang.Iterable iterable;
        xm3.t0 t0Var;
        kotlin.jvm.internal.o.g(group, "group");
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f442625f;
        if (mvvmList == null || (iterable = mvvmList.f152065o) == null) {
            iterable = this.f442624e;
        }
        int i17 = 0;
        for (java.lang.Object obj : iterable) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (kotlin.jvm.internal.o.b(((w24.d) obj).f442613d, group.f442613d) && (t0Var = this.f442626g) != null) {
                t0Var.notifyItemChanged(i17);
            }
            i17 = i18;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList(new w24.g(this.f442624e), new xm3.n0(), getActivity(), null, this.f442624e, 8, null);
        this.f442625f = mvvmList;
        java.util.ArrayList arrayList = mvvmList.f152065o;
        kotlin.jvm.internal.o.d(arrayList);
        this.f442624e = kz5.n0.V0(arrayList);
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = this.f442625f;
        kotlin.jvm.internal.o.d(mvvmList2);
        this.f442626g = new xm3.t0(mvvmList2, new com.tencent.mm.plugin.mvvmlist.SingleItemConvertFactory(w24.e.class), false);
        jz5.g gVar = this.f442623d;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setAdapter(this.f442626g);
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext()));
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).getRecycledViewPool().e(0, 0);
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setItemAnimator(null);
        java.util.Iterator it = ((java.util.ArrayList) this.f442624e).iterator();
        while (it.hasNext()) {
            ((w24.d) it.next()).o(new w24.i(this));
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList3 = this.f442625f;
        if (mvvmList3 != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList3, null, 1, null);
        }
    }
}
