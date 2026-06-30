package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class c extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a f121596f = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f121597g = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);

    /* renamed from: h, reason: collision with root package name */
    public static final int f121598h;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f121599e;

    static {
        int i17;
        com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        f121598h = i18;
    }

    public c(boolean z17) {
        this.f121599e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.a item = (vp2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        int i19 = 0;
        if (layoutParams != null && (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a aVar = f121596f;
            boolean z18 = this.f121599e;
            int i27 = f121597g;
            if (z18) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i27;
                if (item.f438903f != item.f438904g - 1) {
                    i27 = 0;
                }
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i27;
                layoutParams.width = com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a.a(aVar) - com.tencent.mm.ui.zk.a(holder.f293121e, 24);
            } else {
                androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i27;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i27;
                layoutParams.width = com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a.a(aVar);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hk6);
        mn2.g1 g1Var = mn2.g1.f329975a;
        r45.nt0 nt0Var = item.f438901d;
        if (imageView != null) {
            java.lang.String string = nt0Var.getString(1);
            if (string == null) {
                string = "";
            }
            g1Var.e().c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329965s));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hk7);
        if (imageView2 != null) {
            java.lang.String string2 = nt0Var.getString(2);
            g1Var.e().c(new mn2.q3(string2 != null ? string2 : "", com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView2, g1Var.h(mn2.f1.f329965s));
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.m66);
        if (p17 != null) {
            try {
                i19 = android.graphics.Color.parseColor("#" + nt0Var.getString(3));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("Finder.AdConvert", "color Exception " + e17);
            }
            p17.setBackgroundColor(i19);
            p17.setOnClickListener(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b(item, holder));
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.m66);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(p18, "live_square_banner_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(p18, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(p18, 40, 26236);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
    }
}
