package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class y4 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f122051e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.a f122052f;

    public y4(int i17, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.a service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f122051e = i17;
        this.f122052f = service;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488981az5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        android.view.ViewGroup.LayoutParams layoutParams;
        vp2.k0 item = (vp2.k0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        int i19 = this.f122051e;
        if (i19 > 0 && (layoutParams = holder.itemView.getLayoutParams()) != null) {
            layoutParams.width = i19;
            layoutParams.height = i19;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f486441l74);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d f17 = g1Var.f();
        r45.y23 y23Var = item.f438933e;
        java.util.LinkedList list2 = y23Var.getList(2);
        kotlin.jvm.internal.o.f(list2, "getImg_urls(...)");
        mn2.q3 q3Var = new mn2.q3((java.lang.String) kz5.n0.Z(list2), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        kotlin.jvm.internal.o.d(imageView);
        f17.c(q3Var, imageView, g1Var.h(mn2.f1.f329967u));
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) holder.itemView.findViewById(com.tencent.mm.R.id.lcc);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.lcd);
        java.lang.String str = "productId: " + item.f438932d + " is_promoting: " + y23Var.getInteger(10) + " isLiving: " + item.f438934f;
        wp2.b bVar = ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g) this.f122052f).f122071b;
        if (bVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId: ");
            r45.nw1 liveInfo = bVar.getFeedObject().getLiveInfo();
            sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
            sb6.append(" nickName: ");
            sb6.append(bVar.getFeedObject().getNickName());
            sb6.append(", ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("ShopProductItemConvert", sb6.toString());
            r3 = jz5.f0.f302826a;
        }
        if (r3 == null) {
            com.tencent.mars.xlog.Log.i("ShopProductItemConvert", str);
        }
        if (y23Var.getInteger(10) != 1 || !item.f438934f) {
            viewGroup.setVisibility(8);
            if (finderLiveOnliveWidget == null || (mMPAGView = finderLiveOnliveWidget.f131204i) == null) {
                return;
            }
            mMPAGView.n();
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        viewGroup.setTranslationY(0.0f);
        if (finderLiveOnliveWidget != null) {
            finderLiveOnliveWidget.c();
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) holder.itemView.findViewById(com.tencent.mm.R.id.lcc);
        if (finderLiveOnliveWidget == null || (mMPAGView = finderLiveOnliveWidget.f131204i) == null) {
            return;
        }
        mMPAGView.n();
    }
}
