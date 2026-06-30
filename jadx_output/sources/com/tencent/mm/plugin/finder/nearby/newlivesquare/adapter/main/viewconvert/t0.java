package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class t0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f121943e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.s0 f121944f;

    public t0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f121943e = context;
        this.f121944f = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.s0(this);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dvp;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.k item = (vp2.k) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        boolean z18 = true;
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        java.util.ArrayList arrayList = item.f438931d;
        boolean isEmpty = arrayList.isEmpty();
        int i19 = 8;
        android.content.Context context = this.f121943e;
        if (isEmpty) {
            com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) holder.p(com.tencent.mm.R.id.rjk);
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.rjl);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.f6h));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.rjl);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        com.google.android.material.tabs.TabLayout tabLayout2 = (com.google.android.material.tabs.TabLayout) holder.p(com.tencent.mm.R.id.rjk);
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
            tabLayout2.n();
            java.util.Iterator it = arrayList.iterator();
            int i27 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String title = (java.lang.String) next;
                com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0 r0Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r0(this, context, tabLayout2.l(), z18);
                kotlin.jvm.internal.o.g(title, "title");
                android.widget.TextView textView3 = r0Var.f121911d;
                if (textView3 != null) {
                    textView3.setText(title);
                }
                r0Var.f121910c = i27;
                int size = arrayList.size();
                android.content.Context context2 = r0Var.f121908a;
                int b17 = i65.a.b(context2, 12);
                int b18 = i65.a.b(context2, i19);
                int b19 = i65.a.b(context2, 12);
                int b27 = i65.a.b(context2, i19);
                int i29 = r0Var.f121910c;
                if (i29 == 0) {
                    b17 = i65.a.b(context2, 16);
                } else if (i29 == size - 1) {
                    b19 = i65.a.b(context2, 16);
                }
                oa.i iVar = r0Var.f121909b;
                oa.k kVar = iVar.f343785h;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.v0.k(kVar, b17, b18, b19, b27);
                tabLayout2.d(iVar, false);
                i27 = i28;
                i19 = 8;
                z18 = true;
            }
            tabLayout2.K.clear();
            tabLayout2.a(this.f121944f);
            oa.i k17 = tabLayout2.k(0);
            if (k17 == null || k17.a()) {
                return;
            }
            k17.b();
        }
    }
}
