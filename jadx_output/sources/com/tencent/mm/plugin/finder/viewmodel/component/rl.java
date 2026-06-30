package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rl implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f135807d;

    public rl(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar) {
        this.f135807d = zlVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        fc2.q f76;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = (com.tencent.mm.plugin.finder.playlist.z1) holder.f293125i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick: position:");
        sb6.append(i17);
        sb6.append(", item:");
        sb6.append(z1Var.getItemId());
        sb6.append(", scene:");
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = this.f135807d;
        sb6.append(zlVar.f136697o);
        com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", sb6.toString());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(z1Var.getFeedObject());
        jz5.f0 f0Var = null;
        so2.u1 u1Var = p17 instanceof so2.u1 ? (so2.u1) p17 : null;
        if (u1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "focusFeed " + hc2.b0.d(u1Var, i17));
            if (!zlVar.S6(zlVar.R6()) || zlVar.f136699q == null) {
                return;
            }
            com.tencent.mm.plugin.finder.playlist.z1 z1Var2 = zlVar.f136698p;
            if (z1Var2 != null) {
                z1Var2.f122508d = false;
            }
            z1Var.f122508d = true;
            zlVar.f136698p = z1Var;
            com.tencent.mm.plugin.finder.feed.tl tlVar = zlVar.f136690e;
            if (tlVar == null) {
                kotlin.jvm.internal.o.o("longVideoShareContract");
                throw null;
            }
            tlVar.f109081s.f107836a = null;
            ((com.tencent.mm.plugin.finder.convert.yn) ((jz5.n) tlVar.f109076n).getValue()).h(tlVar.f(), u1Var, 0, 0, false, null);
            com.tencent.mm.ui.MMActivity context = tlVar.f109069d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (f76 = nyVar.f7()) != null) {
                fc2.s sVar = new fc2.s(2);
                sVar.f260981e = u1Var;
                f76.f260976d = u1Var;
                sVar.f260984h = f76.f260974b;
                sVar.f260982f = u1Var.getItemId();
                sVar.f260983g = u1Var.w();
                f76.f260974b = u1Var.getItemId();
                f76.a(sVar);
            }
            ((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) tlVar.f109075m).getValue()).O0(u1Var.getFeedObject().getId(), u1Var.w(), u1Var.getFeedObject().getObjectNonceId(), tlVar.f109072g, u1Var.getFeedObject().getFeedObject().getSecondaryShowFlag() != 1, u1Var.getFeedObject().getUserName(), (i19 & 64) != 0 ? -1 : 0, (i19 & 128) != 0 ? com.tencent.mm.plugin.finder.feed.model.z.f108496d : com.tencent.mm.plugin.finder.feed.model.z.f108497e);
            zlVar.T6(i17);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = zlVar.f136700r;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "focusFeed invalid type " + hc2.b0.d(z1Var, i17));
        }
    }
}
