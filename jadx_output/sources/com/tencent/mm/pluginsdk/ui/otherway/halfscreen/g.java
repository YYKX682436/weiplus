package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i f190957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i iVar) {
        super(1);
        this.f190957d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.pluginsdk.ui.otherway.halfscreen.k state = (com.tencent.mm.pluginsdk.ui.otherway.halfscreen.k) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof com.tencent.mm.pluginsdk.ui.otherway.halfscreen.j)) {
            com.tencent.mm.pluginsdk.ui.otherway.halfscreen.i iVar = this.f190957d;
            iVar.getClass();
            com.tencent.mm.pluginsdk.ui.otherway.v enhance = ((com.tencent.mm.pluginsdk.ui.otherway.halfscreen.j) dVar).f190961b;
            kotlin.jvm.internal.o.g(enhance, "enhance");
            final com.tencent.mm.pluginsdk.model.g2 g2Var = enhance.f191001b;
            final java.util.ArrayList arrayList = enhance.f191004e;
            com.tencent.mm.pluginsdk.ui.otherway.h0.f190945a.g(arrayList, g2Var.f189308a, g2Var.f189315h);
            arrayList.removeIf(com.tencent.mm.pluginsdk.ui.otherway.halfscreen.d.f190950a);
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kz5.c0.i(2, 3, 4, 5, 6).contains(java.lang.Integer.valueOf(((com.tencent.mm.pluginsdk.ui.otherway.w) it.next()).h()))) {
                    break;
                }
                i17++;
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) next;
                    wVar.f191024q = i18 == i17;
                    wVar.f191025r = i17 >= 0 && i18 == arrayList.size() - 1;
                    i18 = i19;
                } else {
                    com.tencent.mm.pluginsdk.model.f2 f2Var = g2Var.f189318k;
                    final kb0.g gVar = new kb0.g(g2Var, f2Var != null ? f2Var.f189301e : null, arrayList);
                    em.p2 p2Var = (em.p2) ((jz5.n) iVar.f190960e).getValue();
                    if (p2Var.f254704c == null) {
                        p2Var.f254704c = (androidx.recyclerview.widget.RecyclerView) p2Var.f254702a.findViewById(com.tencent.mm.R.id.un7);
                    }
                    androidx.recyclerview.widget.RecyclerView recyclerView = p2Var.f254704c;
                    kotlin.jvm.internal.o.f(recyclerView, "getOpenWayListRv(...)");
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.otherway.halfscreen.OpenWayAppListUIC$initRecyclerView$adapter$1
                        @Override // in5.s
                        public in5.r getItemConvert(int type) {
                            if (type != 6) {
                                return type != 7 ? new com.tencent.mm.pluginsdk.ui.otherway.p0() : new com.tencent.mm.pluginsdk.ui.otherway.q0();
                            }
                            com.tencent.mm.pluginsdk.ui.otherway.halfscreen.f fVar = new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.f(arrayList, gVar);
                            return ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(com.tencent.mm.pluginsdk.model.g2.this.f189315h) ? new com.tencent.mm.pluginsdk.ui.otherway.m0(fVar, gVar) : new com.tencent.mm.pluginsdk.ui.otherway.l0(fVar, gVar);
                        }
                    }, arrayList, false);
                    wxRecyclerAdapter.f293105o = new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.e(arrayList, gVar, enhance, iVar);
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(iVar.getContext(), 1, false));
                    recyclerView.i(new kb0.d(gVar));
                    recyclerView.setAdapter(wxRecyclerAdapter);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
