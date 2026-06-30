package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.t f209349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar) {
        super(0);
        this.f209349d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.n0 n0Var;
        java.util.ArrayList arrayList;
        ri5.j a17;
        final com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar = this.f209349d;
        tVar.f209368g = new em.k2(android.view.LayoutInflater.from(tVar.getActivity()).inflate(com.tencent.mm.R.layout.c5l, (android.view.ViewGroup) null));
        j75.f Q6 = tVar.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.addAll(n0Var.f446320p);
            int intExtra = tVar.getIntent().getIntExtra("Select_Conv_Type", com.tencent.mm.ui.contact.i5.g(1, 2));
            java.util.Iterator it = (com.tencent.mm.ui.contact.i5.d(intExtra, 4) ? com.tencent.mm.ui.contact.k3.c() : com.tencent.mm.ui.contact.i5.d(intExtra, 16) ? com.tencent.mm.ui.contact.k3.b() : com.tencent.mm.ui.contact.k3.d()).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = tVar.f209365d;
                if (!hasNext) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                if (!hashSet.contains(str)) {
                    com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
                    if (L == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RecentForwardListViewUIC", "initDataList: contact == null");
                        L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
                    }
                    com.tencent.mm.storage.z3 z3Var = L;
                    java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(z3Var);
                    kotlin.jvm.internal.o.d(str);
                    kotlin.jvm.internal.o.d(wi6);
                    arrayList.add(new com.tencent.mm.ui.contact.v8(new com.tencent.mm.ui.contact.w8(str, wi6, false, false, false, 28, null)));
                    vi5.f fVar = new vi5.f(0L, 0L, null, null, 0, 0, false, 124, null);
                    ri5.h hVar = ri5.j.I;
                    int i17 = ri5.j.f396107x0;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    a17 = vi5.f.f437620h.a(tVar.getActivity(), hVar.a(d17, i17, 0), z3Var, i17, fVar, (r14 & 32) != 0 ? i17 : 0);
                    tVar.f209369h.add(a17);
                }
            }
            com.tencent.mm.ui.contact.v8 v8Var = new com.tencent.mm.ui.contact.v8(new com.tencent.mm.ui.contact.w8("", "", false, false, false, 28, null));
            v8Var.f207221e = 1;
            arrayList.add(v8Var);
            if (com.tencent.mm.ui.contact.t8.a(arrayList)) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.ui.mvvm.uic.conversation.recent.RecentConversationForwardListUIC$initView$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardListViewUIC", "getItemConvert, type:" + type);
                        return new com.tencent.mm.ui.contact.s8(new com.tencent.mm.ui.mvvm.uic.conversation.recent.l(com.tencent.mm.ui.mvvm.uic.conversation.recent.t.this));
                    }
                }, arrayList, false);
                tVar.f209367f = wxRecyclerAdapter;
                wxRecyclerAdapter.f293105o = new com.tencent.mm.ui.mvvm.uic.conversation.recent.m(tVar);
                wxRecyclerAdapter.f293104n = new com.tencent.mm.ui.mvvm.uic.conversation.recent.n(tVar);
                em.k2 k2Var = tVar.f209368g;
                if (k2Var != null) {
                    if (k2Var.f254504d == null) {
                        k2Var.f254504d = (androidx.recyclerview.widget.RecyclerView) k2Var.f254501a.findViewById(com.tencent.mm.R.id.llt);
                    }
                    androidx.recyclerview.widget.RecyclerView recyclerView = k2Var.f254504d;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(tVar.getContext(), 0, false));
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setAdapter(tVar.f209367f);
                    }
                }
                em.k2 k2Var2 = tVar.f209368g;
                if (k2Var2 != null) {
                    if (k2Var2.f254502b == null) {
                        k2Var2.f254502b = (android.widget.TextView) k2Var2.f254501a.findViewById(com.tencent.mm.R.id.gze);
                    }
                    android.widget.TextView textView = k2Var2.f254502b;
                    if (textView != null) {
                        com.tencent.mm.ui.bk.s0(textView.getPaint());
                    }
                }
            }
        }
        em.k2 k2Var3 = tVar.f209368g;
        if (k2Var3 != null) {
            return k2Var3.f254501a;
        }
        return null;
    }
}
