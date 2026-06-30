package st2;

/* loaded from: classes3.dex */
public final class o1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f412407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f412408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412409c;

    public o1(kotlin.jvm.internal.h0 h0Var, st2.s1 s1Var, java.lang.String str) {
        this.f412407a = h0Var;
        this.f412408b = s1Var;
        this.f412409c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.y23 y23Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = true;
        boolean z18 = fVar != null && fVar.f70615a == 0;
        java.lang.String str = this.f412409c;
        kotlin.jvm.internal.h0 h0Var = this.f412407a;
        st2.s1 s1Var = this.f412408b;
        if (z18 && fVar.f70616b == 0) {
            r45.w82 w82Var = (r45.w82) ke2.o0.f306976v.a(fVar, new r45.w82());
            java.util.LinkedList list = w82Var != null ? w82Var.getList(0) : null;
            h0Var.f310123d = list;
            s1Var.f412454n = (list == null || (y23Var = (r45.y23) kz5.n0.Z(list)) == null) ? null : y23Var.getString(17);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f327451x0;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("query", str);
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, s1Var.f412454n, 7928, null);
        } else {
            java.lang.String str2 = s1Var.f412444d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("search failed, errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errCode = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.e(str2, sb6.toString());
        }
        java.util.List<r45.y23> list2 = (java.util.List) h0Var.f310123d;
        android.view.View view = s1Var.f412449i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (list2 != null && !list2.isEmpty()) {
            z17 = false;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = s1Var.f412451k;
        if (z17) {
            android.view.View view2 = s1Var.f412450j;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(4);
        } else {
            android.view.View view3 = s1Var.f412450j;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recyclerView.setVisibility(0);
            qm0.a aVar = new qm0.a(new java.util.LinkedList(), null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.y23 y23Var2 : list2) {
                kotlin.jvm.internal.o.g(y23Var2, "<this>");
                arrayList4.add(new cm2.m0(y23Var2));
            }
            aVar.f364680a.addAll(arrayList4);
            tt2.f1 f1Var = s1Var.f412452l;
            f1Var.getClass();
            kotlin.jvm.internal.o.g(str, "<set-?>");
            f1Var.B = str;
            f1Var.c0(aVar);
        }
        s1Var.f412455o = str;
        return jz5.f0.f302826a;
    }
}
