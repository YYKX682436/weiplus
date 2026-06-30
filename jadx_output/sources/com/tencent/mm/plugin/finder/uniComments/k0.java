package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f130280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f130281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130282d;

    public k0(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, boolean z17, long j17, fp0.r rVar) {
        this.f130279a = o0Var;
        this.f130280b = z17;
        this.f130281c = j17;
        this.f130282d = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText g17;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        int i17;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        androidx.recyclerview.widget.f2 adapter2;
        androidx.recyclerview.widget.RecyclerView recyclerView4;
        androidx.recyclerview.widget.f2 adapter3;
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.util.List list = (java.util.List) lVar.f302834e;
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130279a;
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var2 = o0Var.f130330o;
        if (a2Var2 != null) {
            a2Var2.h().setVisibility(8);
            android.view.ViewGroup viewGroup = a2Var2.f130170g;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            a2Var2.j().setOnClickListener(null);
        }
        boolean z17 = this.f130280b;
        if (!z17) {
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var3 = o0Var.f130330o;
            if (a2Var3 != null) {
                a2Var3.k().P(list != null ? list.size() : 0);
            }
        } else if (!o0Var.f130335t && (a2Var = o0Var.f130330o) != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(a2Var.k(), null, 1, null);
        }
        if (z17 && !o0Var.f130334s) {
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var4 = o0Var.f130330o;
            if (a2Var4 != null) {
                a2Var4.d(false);
            }
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var5 = o0Var.f130330o;
            if (a2Var5 != null) {
                a2Var5.e().f213551h.setCanCloseDrawerWhenStop(true);
            }
        }
        android.content.Context context = o0Var.f130322d;
        com.tencent.mm.plugin.finder.uniComments.o1 o1Var = o0Var.f130326h;
        if (list == null || list.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "refresh header title...");
            if (z17) {
                o1Var.f130342a.clear();
                com.tencent.mm.plugin.finder.uniComments.a2 a2Var6 = o0Var.f130330o;
                if (a2Var6 != null && (recyclerView = a2Var6.k().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                if (booleanValue) {
                    com.tencent.mm.plugin.finder.uniComments.a2 a2Var7 = o0Var.f130330o;
                    if (a2Var7 != null) {
                        a2Var7.h().setVisibility(0);
                        android.view.View view = a2Var7.f130178r;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (a2Var7.e().getCloseComment()) {
                            android.view.View i18 = a2Var7.i();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(i18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(i18, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.ViewGroup viewGroup2 = a2Var7.f130170g;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(0);
                            }
                        } else {
                            android.view.View i19 = a2Var7.i();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(i19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(i19, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View j17 = a2Var7.j();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(j17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        j17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(j17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer = o0Var.C;
                    if (textStatusCommentDrawer != null && textStatusCommentDrawer.getShowFooter()) {
                        iv2.a aVar = o0Var.f130328m;
                        if (aVar == null) {
                            kotlin.jvm.internal.o.o("feedObj");
                            throw null;
                        }
                        if (!kotlin.jvm.internal.o.b(aVar.f295119b, en1.a.a())) {
                            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                            if (mMActivity != null) {
                                mMActivity.showVKB();
                            }
                        }
                    }
                } else {
                    com.tencent.mm.plugin.finder.uniComments.a2 a2Var8 = o0Var.f130330o;
                    if (a2Var8 != null) {
                        com.tencent.mm.plugin.finder.uniComments.j0 j0Var = new com.tencent.mm.plugin.finder.uniComments.j0(o0Var);
                        a2Var8.h().setVisibility(0);
                        android.view.View view2 = a2Var8.f130178r;
                        if (view2 == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View i27 = a2Var8.i();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(i27, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i27.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(i27, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View j18 = a2Var8.j();
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(j18, arrayList7.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        j18.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(j18, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a2Var8.j().setOnClickListener(new com.tencent.mm.plugin.finder.uniComments.z1(j0Var));
                    }
                }
            }
        } else if (o0Var.f130338w == 0) {
            o1Var.f130342a.clear();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                o1Var.a((jv2.d) it.next(), false);
            }
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var9 = o0Var.f130330o;
            if (a2Var9 != null && (recyclerView4 = a2Var9.k().getRecyclerView()) != null && (adapter3 = recyclerView4.getAdapter()) != null) {
                adapter3.notifyDataSetChanged();
            }
        } else {
            int e17 = o1Var.e();
            o1Var.b(list, true, false);
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var10 = o0Var.f130330o;
            if (a2Var10 != null && (recyclerView3 = a2Var10.k().getRecyclerView()) != null && (adapter2 = recyclerView3.getAdapter()) != null) {
                adapter2.notifyItemRangeInserted(0, o1Var.e() - e17);
            }
            if (z17) {
                java.util.ArrayList arrayList8 = o1Var.f130342a;
                java.util.Iterator it6 = arrayList8.iterator();
                int i28 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i28 = -1;
                        break;
                    }
                    if (((jv2.d) it6.next()).getItemId() == o0Var.f130338w) {
                        break;
                    }
                    i28++;
                }
                if (i28 >= 0) {
                    jv2.d dVar = (jv2.d) arrayList8.get(i28);
                    com.tencent.mm.plugin.finder.uniComments.a2 a2Var11 = o0Var.f130330o;
                    if (a2Var11 != null) {
                        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f17 = a2Var11.f();
                        java.lang.String b17 = hc2.t.b(context, o0Var.f130329n);
                        i95.m c17 = i95.n0.c(c61.yb.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        f17.g(b17, c61.yb.md((c61.yb) c17, dVar.f302207d.D0(), dVar.f302207d.y0(), false, 4, null), dVar.f302207d);
                    }
                    if (dVar.f302207d.A0() != 0) {
                        long A0 = dVar.f302207d.A0();
                        if (A0 != 0) {
                            java.util.Iterator it7 = arrayList8.iterator();
                            int i29 = 0;
                            while (it7.hasNext()) {
                                if (((jv2.d) it7.next()).f302207d.t0() == A0) {
                                    i17 = i29;
                                    break;
                                }
                                i29++;
                            }
                        }
                        i17 = -1;
                        if (i17 >= 0) {
                            i28 = i17;
                        }
                    }
                    com.tencent.mm.plugin.finder.uniComments.a2 a2Var12 = o0Var.f130330o;
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a2Var12 == null || (recyclerView2 = a2Var12.k().getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList9.add(0);
                        arrayList9.add(java.lang.Integer.valueOf(i28));
                        java.util.Collections.reverse(arrayList9);
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                        yj0.a.d(linearLayoutManager2, arrayList9.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        linearLayoutManager.P(((java.lang.Integer) arrayList9.get(0)).intValue(), ((java.lang.Integer) arrayList9.get(1)).intValue());
                        yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    }
                }
            }
        }
        iv2.a aVar2 = o0Var.f130328m;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(aVar2.f295119b, en1.a.a()) && (g17 = o0Var.g()) != null) {
            g17.clearFocus();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f130281c);
        sb6.append("ms, succ:");
        sb6.append(list != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        this.f130282d.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
