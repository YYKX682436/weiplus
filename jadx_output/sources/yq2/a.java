package yq2;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2 {

    /* renamed from: o, reason: collision with root package name */
    public final dr2.a f464502o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, float f17, sp2.k kVar, dr2.a convertOutsideOperator, yz5.p jumProfileCallback) {
        super(true, i17, f17, kVar, jumProfileCallback);
        kotlin.jvm.internal.o.g(convertOutsideOperator, "convertOutsideOperator");
        kotlin.jvm.internal.o.g(jumProfileCallback, "jumProfileCallback");
        this.f464502o = convertOutsideOperator;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2, in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489340c65;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2
    public boolean p(wp2.b item, in5.s0 holder, java.util.List list) {
        java.lang.Object a07;
        r45.dn1 dn1Var;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean p17 = super.p(item, holder, list);
        if (list != null && (a07 = kz5.n0.a0(list, 0)) != null && (a07 instanceof dk2.zg) && (dn1Var = ((dk2.zg) a07).f234439b) != null) {
            item.f448383o.set(14, dn1Var);
            java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.f484605ew1);
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = tag instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g ? (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g) tag : null;
            p17 = true;
            if (gVar != null) {
                x(gVar, item, holder, true);
            }
        }
        return p17;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2
    public void s(wp2.b item, in5.s0 holder, boolean z17) {
        java.util.List data;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.s(item, holder, z17);
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.f484605ew1);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = tag instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g ? (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g) tag : null;
        if (gVar != null) {
            androidx.recyclerview.widget.f2 adapter = gVar.f122079j.getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
                return;
            }
            java.util.Iterator it = data.iterator();
            while (it.hasNext()) {
                ((vp2.k0) it.next()).f438934f = z17;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2, in5.r
    /* renamed from: t */
    public void h(in5.s0 holder, wp2.b item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g(holder, this.f464502o);
        if (gVar.f122071b == null) {
            gVar.f122071b = item;
            r45.nw1 liveInfo = item.getFeedObject().getLiveInfo();
            gVar.f122072c = liveInfo != null ? liveInfo.getLong(0) : 0L;
            gVar.f122073d = item.getFeedObject().getFeedObject().getId();
            java.lang.String username = item.getFeedObject().getFeedObject().getUsername();
            if (username == null) {
                username = "";
            }
            gVar.f122074e = username;
        }
        holder.itemView.setTag(com.tencent.mm.R.id.f484605ew1, gVar);
        super.h(holder, item, i17, i18, z17, list);
        if (list == null || list.isEmpty()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.k68);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
            int i19 = this.f122045f;
            if (layoutParams != null) {
                layoutParams.width = i19;
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.k68);
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = (int) (this.f122046g * i19);
            }
            x(gVar, item, holder, false);
        }
    }

    public final void x(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g shoppingWidget, wp2.b item, in5.s0 holder, boolean z17) {
        jz5.f0 f0Var;
        boolean z18;
        kotlin.jvm.internal.o.g(shoppingWidget, "shoppingWidget");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.dn1 dn1Var = (r45.dn1) item.f448383o.getCustom(14);
        if (dn1Var != null) {
            java.util.LinkedList<r45.y23> list = dn1Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getProduct(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.y23 y23Var : list) {
                long j17 = y23Var.getLong(0);
                r45.nw1 liveInfo = item.getFeedObject().getFeedObject().getLiveInfo();
                if (liveInfo != null) {
                    z18 = true;
                    if (liveInfo.getInteger(2) == 1) {
                        arrayList.add(new vp2.k0(j17, y23Var, z18));
                    }
                }
                z18 = false;
                arrayList.add(new vp2.k0(j17, y23Var, z18));
            }
            shoppingWidget.a(arrayList, z17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            shoppingWidget.a(new java.util.ArrayList(), z17);
        }
    }
}
