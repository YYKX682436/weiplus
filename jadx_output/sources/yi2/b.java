package yi2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f462491a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f462492b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f462493c;

    public b(android.view.View root, gk2.e liveData, androidx.recyclerview.widget.p2 p2Var) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f462491a = liveData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f462492b = arrayList;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.r6_);
        this.f462493c = recyclerView;
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.live.mic.pk.widget.FinderLiveAnchorAcceptWidget$1(root.getContext()));
        recyclerView.setAdapter(new yi2.a(new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveAnchorPkConvertFactory(liveData, null, 2, null), arrayList));
        if (p2Var != null) {
            recyclerView.N(p2Var);
        }
    }

    public final void a() {
        java.util.ArrayList arrayList;
        java.util.List list;
        java.util.List list2;
        java.lang.Object obj;
        java.lang.Object obj2;
        dk2.u4 u4Var = ((mm2.o4) this.f462491a.a(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.f234160g == 2) {
            dk2.u4 u4Var2 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).Z;
            if (u4Var2 != null && u4Var2.f()) {
                this.f462492b.clear();
                dk2.u4 u4Var3 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).Z;
                if (u4Var3 != null && (list2 = u4Var3.f234163j) != null) {
                    this.f462492b.add(new vi2.c(fj2.k.f263175d));
                    r45.r22 r22Var = (r45.r22) kz5.n0.a0(list2, 0);
                    if (r22Var != null) {
                        java.util.LinkedList<r45.wk6> list3 = r22Var.getList(0);
                        kotlin.jvm.internal.o.f(list3, "getMembers(...)");
                        for (r45.wk6 wk6Var : list3) {
                            km2.q a76 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).a7();
                            if (kotlin.jvm.internal.o.b(a76 != null ? a76.f309170a : null, wk6Var.getString(1))) {
                                java.util.ArrayList arrayList2 = this.f462492b;
                                km2.q a77 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).a7();
                                arrayList2.add(new vi2.e(a77 != null ? a77.f309187r : null));
                            } else {
                                java.util.List list4 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).f329324s;
                                if (list4 != null) {
                                    synchronized (list4) {
                                        java.util.Iterator it = list4.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, wk6Var.getString(1))) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                    }
                                    km2.q qVar = (km2.q) obj2;
                                    if (qVar != null) {
                                        this.f462492b.add(new vi2.e(qVar.f309187r));
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f462492b.add(new vi2.c(fj2.k.f263176e));
                    r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(list2, 1);
                    if (r22Var2 != null) {
                        java.util.LinkedList<r45.wk6> list5 = r22Var2.getList(0);
                        kotlin.jvm.internal.o.f(list5, "getMembers(...)");
                        for (r45.wk6 wk6Var2 : list5) {
                            km2.q a78 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).a7();
                            if (kotlin.jvm.internal.o.b(a78 != null ? a78.f309170a : null, wk6Var2.getString(1))) {
                                java.util.ArrayList arrayList3 = this.f462492b;
                                km2.q a79 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).a7();
                                arrayList3.add(new vi2.e(a79 != null ? a79.f309187r : null));
                            } else {
                                java.util.List list6 = ((mm2.o4) this.f462491a.a(mm2.o4.class)).f329324s;
                                if (list6 != null) {
                                    synchronized (list6) {
                                        java.util.Iterator it6 = list6.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj = it6.next();
                                                if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, wk6Var2.getString(1))) {
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                    }
                                    km2.q qVar2 = (km2.q) obj;
                                    if (qVar2 != null) {
                                        this.f462492b.add(new vi2.e(qVar2.f309187r));
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                androidx.recyclerview.widget.f2 adapter = this.f462493c.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        this.f462492b.clear();
        gk2.e eVar = this.f462491a;
        if (eVar == null || (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329324s) == null) {
            arrayList = null;
        } else {
            synchronized (list) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList.add(new vi2.e(((km2.q) it7.next()).f309187r));
                }
            }
        }
        java.util.ArrayList arrayList4 = arrayList instanceof java.util.ArrayList ? arrayList : null;
        if (arrayList4 != null) {
            this.f462492b.addAll(arrayList4);
        }
        androidx.recyclerview.widget.f2 adapter2 = this.f462493c.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }
}
