package ut2;

/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final st2.h1 f431111a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f431112b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f431113c;

    /* renamed from: d, reason: collision with root package name */
    public final tt2.o1 f431114d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f431115e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f431116f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xv2 f431117g;

    /* renamed from: h, reason: collision with root package name */
    public long f431118h;

    /* renamed from: i, reason: collision with root package name */
    public long f431119i;

    public u3(st2.h1 internal, android.view.View rootView) {
        kotlin.jvm.internal.o.g(internal, "internal");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f431111a = internal;
        this.f431112b = rootView;
        this.f431113c = "FinderShoppingTagHolder";
        tt2.o1 o1Var = new tt2.o1(this);
        this.f431114d = o1Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.qdg);
        recyclerView.setAdapter(o1Var);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(rootView.getContext(), 0, false));
        this.f431115e = recyclerView;
        this.f431116f = kz5.p0.f313996d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    public final void a(r45.xv2 labelInfo, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(labelInfo, "labelInfo");
        android.view.View view = this.f431112b;
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", 1042);
            jSONObject.put("cate_id", labelInfo.getLong(2));
            jSONObject.put("tab_name", labelInfo.getString(0));
            if (kotlin.jvm.internal.o.b(labelInfo.getString(0), view.getContext().getString(com.tencent.mm.R.string.ewi))) {
                jSONObject.put("tab_type", 3);
            }
            r45.xv2 xv2Var = this.f431117g;
            if (xv2Var != null) {
                jSONObject.put("last_cate_id", xv2Var.getLong(2));
                jSONObject.put("last_tab_name", xv2Var.getString(0));
                if (kotlin.jvm.internal.o.b(xv2Var.getString(0), view.getContext().getString(com.tencent.mm.R.string.ewi))) {
                    jSONObject.put("last_tab_type", 3);
                } else {
                    jSONObject.put("last_tab_type", xv2Var.getLong(2) == 0 ? 2 : 1);
                }
            }
            jSONObject.put("last_tab_duration", c01.id.c() - this.f431119i);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Dj((ml2.r0) c17, ml2.f4.L, null, "", null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
            com.tencent.mars.xlog.Log.i(this.f431113c, "reportClick json = " + jSONObject);
            r45.xv2 xv2Var2 = this.f431117g;
            if (!kotlin.jvm.internal.o.b(xv2Var2 != null ? xv2Var2.getString(0) : null, labelInfo.getString(0))) {
                this.f431119i = c01.id.c();
            }
        }
        this.f431117g = labelInfo;
        this.f431114d.notifyDataSetChanged();
        st2.h1 h1Var = this.f431111a;
        h1Var.getClass();
        int integer = labelInfo.getInteger(4);
        gk2.e eVar = h1Var.f412335f;
        if (integer == 2) {
            st2.v1 v1Var = h1Var.S;
            if (v1Var == null) {
                v1Var = new st2.v1(h1Var.f412333d, eVar);
                com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "live " + ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0) + " pairing tab init");
                h1Var.S = v1Var;
            }
            st2.v1 v1Var2 = h1Var.S;
            if (v1Var2 != null) {
                android.view.View view2 = v1Var2.f412483c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.q().setVisibility(8);
            if (z17) {
                v1Var.a(true);
            }
        } else {
            st2.v1 v1Var3 = h1Var.S;
            if (v1Var3 != null) {
                android.view.View view3 = v1Var3.f412483c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.q().setVisibility(0);
            java.util.LinkedList list = labelInfo.getList(1);
            kotlin.jvm.internal.o.f(list, "getProduct_ids(...)");
            boolean isEmpty = list.isEmpty();
            tt2.e1 e1Var = h1Var.P;
            if (isEmpty) {
                e1Var.c0(((mm2.f6) eVar.a(mm2.f6.class)).f329039o);
            } else {
                ?? b17 = ((mm2.f6) eVar.a(mm2.f6.class)).f329039o.b(new st2.h(list));
                if (h1Var.y()) {
                    int d17 = kz5.b1.d(kz5.d0.q(b17, 10));
                    if (d17 < 16) {
                        d17 = 16;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                    java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        so2.j5 j5Var = (so2.j5) next;
                        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
                        linkedHashMap.put(m0Var != null ? java.lang.Long.valueOf(m0Var.f43369w) : null, next);
                    }
                    b17 = new java.util.ArrayList();
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        so2.j5 j5Var2 = (so2.j5) linkedHashMap.get(java.lang.Long.valueOf(((java.lang.Number) it6.next()).longValue()));
                        if (j5Var2 != null) {
                            b17.add(j5Var2);
                        }
                    }
                }
                e1Var.c0(new qm0.a(b17, null));
            }
            if (z17) {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView q17 = h1Var.q();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(q17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "applyProductFilter", "(Ljava/util/List;Z)V", "Undefined", "scrollToPosition", "(I)V");
                q17.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(q17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "applyProductFilter", "(Ljava/util/List;Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f431115e.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        ut2.t3 t3Var = new ut2.t3(view.getContext());
        t3Var.f12049a = i17;
        linearLayoutManager.startSmoothScroll(t3Var);
    }
}
