package hr3;

/* loaded from: classes10.dex */
public final class tc implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f284026d;

    public tc(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        this.f284026d = recommendDeleteContactUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.ArrayList arrayList;
        fr3.m mVar = (fr3.m) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "uiStates:" + mVar + ' ');
        boolean z17 = mVar instanceof fr3.k;
        com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f284026d;
        if (z17) {
            java.util.List<fr3.a> list = ((fr3.k) mVar).f265799a;
            int i17 = com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI.A;
            recommendDeleteContactUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "notifyList() called with: dataList = " + list.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (true ^ r26.n0.N(((fr3.a) obj2).f265780a)) {
                    arrayList2.add(obj2);
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            xb5.b bVar = recommendDeleteContactUI.f153799s;
            boolean z18 = false;
            if (isEmpty) {
                android.view.View view = recommendDeleteContactUI.f153801u;
                if (view != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (fr3.a aVar : list) {
                    xb5.a aVar2 = new xb5.a();
                    java.lang.String str = aVar.f265780a;
                    kotlin.jvm.internal.o.g(str, "<set-?>");
                    aVar2.f453006d = str;
                    aVar2.f453007e = aVar.f265781b;
                    kotlin.jvm.internal.o.g(aVar.f265782c, "<set-?>");
                    arrayList5.add(aVar2);
                }
                arrayList4.addAll(arrayList5);
                bVar.f453011d = arrayList4;
                android.view.View view2 = recommendDeleteContactUI.f153801u;
                if (view2 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "notifyList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                q31.n nVar = recommendDeleteContactUI.f153800t;
                if (nVar != null) {
                    ((io.g0) nVar).b(bVar);
                }
            }
            boolean X6 = recommendDeleteContactUI.X6();
            boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(recommendDeleteContactUI.f153806z.f265794f);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "notifyList() called with: isItemListNotEmpty = " + X6 + " haveNextPage:" + z19);
            if (X6 && z19) {
                z18 = true;
            }
            recommendDeleteContactUI.a7(z18);
            com.tencent.mm.pluginsdk.ui.LoadingTipsView loadingTipsView = recommendDeleteContactUI.f153796p;
            if (loadingTipsView != null) {
                loadingTipsView.setVisibility(8);
            }
            recommendDeleteContactUI.Z6();
            java.util.List list2 = bVar.f453011d;
            if (list2 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList7.add(((xb5.a) it.next()).f453006d);
                }
                arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    if (!r26.n0.N((java.lang.String) next)) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = new java.util.ArrayList();
            }
            java.util.HashSet hashSet = recommendDeleteContactUI.f153797q;
            hashSet.addAll(arrayList);
            java.util.ArrayList arrayList8 = recommendDeleteContactUI.f153798r;
            arrayList8.clear();
            arrayList8.addAll(arrayList);
            java.util.Objects.toString(hashSet);
            java.util.Objects.toString(arrayList8);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Gj(50112, "page_in", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", recommendDeleteContactUI.W6()), new jz5.l("infrequentcontactsortpage_sessionid", recommendDeleteContactUI.f153805y), new jz5.l("infrequentcontactsortpage_recommend_user_cnt", java.lang.Integer.valueOf(arrayList8.size()))), 32337);
        } else if (mVar instanceof fr3.j) {
            java.util.List list3 = ((fr3.j) mVar).f265798a;
            int i18 = com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI.A;
            recommendDeleteContactUI.T6(list3);
        } else if (mVar instanceof fr3.l) {
            int i19 = com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI.A;
            recommendDeleteContactUI.showLoading();
        }
        return jz5.f0.f302826a;
    }
}
