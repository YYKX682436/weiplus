package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class i2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public r45.qt2 f121724e;

    public i2(sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489342c70;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.v item = (vp2.v) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.e2 e2Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.e2(this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.d(wxRecyclerView);
        in5.o.b(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f2(holder), in5.k.f293079d);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        up2.g gVar = new up2.g(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.LiveTabJumpersItemConvertFactory(), item.f438958e);
        gVar.f293105o = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.g2(item, this);
        wxRecyclerView.setAdapter(gVar);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(holder.f293121e);
        linearLayoutManager.Q(0);
        wxRecyclerView.setLayoutManager(linearLayoutManager);
        holder.f293124h = e2Var;
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
        this.f121724e = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.lqa);
        if (wxRecyclerView != null) {
            ym5.a1.g(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.h2(this));
        }
    }
}
