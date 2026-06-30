package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class f extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public tp2.f f121656e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qt2 f121657f;

    public f(sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6m;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.b item = (vp2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.Object obj = holder.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d)) {
            ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d) obj).f121622a.b(null);
        }
        holder.f293124h = null;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d dVar = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.m8q);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        java.util.ArrayList arrayList = item.f438906e;
        up2.a aVar = new up2.a(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.AdItemConvertFactory(mMActivity, false, false, 0, arrayList.size() > 1), arrayList);
        aVar.f293105o = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.e(item, this);
        if (recyclerView != null) {
            recyclerView.setAdapter(aVar);
        }
        dVar.f121622a.b(recyclerView);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(1, 0));
        }
        holder.f293124h = dVar;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f121656e = new tp2.f(V6, (com.tencent.mm.ui.MMActivity) context, null, 0, null, 16, null);
        this.f121657f = V6;
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("AdListConvert", "#onViewRecycled holder=" + holder);
        java.lang.Object obj = holder.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d)) {
            ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d) obj).f121622a.b(null);
        }
        holder.f293124h = null;
    }
}
