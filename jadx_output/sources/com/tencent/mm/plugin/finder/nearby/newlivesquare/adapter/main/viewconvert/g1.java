package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class g1 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.o f121683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ up2.f f121684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f121685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 f121686d;

    public g1(vp2.o oVar, up2.f fVar, boolean z17, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var) {
        this.f121683a = oVar;
        this.f121684b = fVar;
        this.f121685c = z17;
        this.f121686d = p1Var;
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        so2.j5 j5Var;
        kotlin.jvm.internal.o.g(cards, "cards");
        vp2.o oVar = this.f121683a;
        if (i17 != oVar.f438947d.f374125d) {
            return;
        }
        java.util.ArrayList feeds = oVar.f438948e;
        kotlin.jvm.internal.o.g(feeds, "feeds");
        up2.f adapter = this.f121684b;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        so2.j5 j5Var2 = (so2.j5) kz5.n0.k0(feeds);
        if (j5Var2 != null && (j5Var2 instanceof vp2.c0)) {
            kz5.h0.E(feeds);
            adapter.notifyItemRemoved(feeds.size());
        }
        oVar.f438947d.f374129h.addAll(cards);
        java.util.Iterator it = cards.iterator();
        while (it.hasNext()) {
            r45.ea2 ea2Var = (r45.ea2) it.next();
            int integer = ea2Var.getInteger(1);
            boolean z17 = this.f121685c;
            if (integer == 10) {
                r45.oa2 oa2Var = (r45.oa2) ea2Var.getCustom(4);
                if (oa2Var != null) {
                    java.util.ArrayList arrayList = oVar.f438948e;
                    vp2.l lVar = new vp2.l(oa2Var, oVar.f438947d, ea2Var);
                    lVar.f438939h = z17;
                    arrayList.add(lVar);
                }
            } else {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
                if (finderObject != null && (finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.Z(cu2.u.f222441a.j(kz5.b0.c(finderObject), hc2.d0.d(0), this.f121686d.f121876n))) != null) {
                    java.util.ArrayList arrayList2 = oVar.f438948e;
                    if (ea2Var.getInteger(1) == 14) {
                        j5Var = new vp2.m(finderItem);
                    } else {
                        vp2.n nVar = new vp2.n(finderItem, oVar.f438947d);
                        nVar.f438946f = z17;
                        j5Var = nVar;
                    }
                    arrayList2.add(j5Var);
                    com.tencent.mars.xlog.Log.i("Finder.HeadLivingListConvert", "#caller.append nickname=" + finderItem.getNickName() + ", style=" + ea2Var.getInteger(1));
                }
            }
            adapter.notifyItemInserted(oVar.f438948e.size() - 1);
        }
        java.util.ArrayList feeds2 = oVar.f438948e;
        int i18 = oVar.f438947d.f374130i;
        kotlin.jvm.internal.o.g(feeds2, "feeds");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        if (i18 > 0 && !(!kz5.j0.I(feeds2, vp2.c0.class).isEmpty())) {
            feeds2.add(new vp2.c0());
            adapter.notifyItemInserted(feeds2.size() - 1);
        }
    }
}
