package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class o3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f130346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f130347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130348d;

    public o3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, boolean z17, long j17, fp0.r rVar) {
        this.f130345a = q3Var;
        this.f130346b = z17;
        this.f130347c = j17;
        this.f130348d = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var;
        java.lang.String str;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.lang.String str2;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        int i17;
        androidx.recyclerview.widget.RecyclerView recyclerView3;
        androidx.recyclerview.widget.f2 adapter2;
        androidx.recyclerview.widget.RecyclerView recyclerView4;
        androidx.recyclerview.widget.f2 adapter3;
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.util.List list = (java.util.List) lVar.f302834e;
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130345a;
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = q3Var.f130373m;
        if (a5Var2 != null) {
            a5Var2.p().setVisibility(8);
            a5Var2.r().setOnClickListener(null);
        }
        boolean z17 = this.f130346b;
        if (!z17) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var3 = q3Var.f130373m;
            if (a5Var3 != null) {
                a5Var3.s().P(list != null ? list.size() : 0);
            }
        } else if (!q3Var.f130377q && (a5Var = q3Var.f130373m) != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(a5Var.s(), null, 1, null);
        }
        if (z17 && !q3Var.f130376p) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var4 = q3Var.f130373m;
            if (a5Var4 != null) {
                a5Var4.g(false);
            }
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var5 = q3Var.f130373m;
            if (a5Var5 != null) {
                a5Var5.h().l(true);
            }
        }
        com.tencent.mm.plugin.finder.uniComments.p4 p4Var = q3Var.f130369f;
        java.lang.String str3 = "MicroMsg.MusicUni.DrawerPresenter";
        if (list == null || list.size() <= 0) {
            str = "MicroMsg.MusicUni.DrawerPresenter";
            com.tencent.mars.xlog.Log.i(str, "refresh header title...");
            q3Var.z();
            if (z17) {
                p4Var.f130360a.clear();
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var6 = q3Var.f130373m;
                if (a5Var6 != null && (recyclerView = a5Var6.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                if (booleanValue) {
                    com.tencent.mm.plugin.finder.uniComments.a5 a5Var7 = q3Var.f130373m;
                    if (a5Var7 != null) {
                        a5Var7.p().setVisibility(0);
                        android.view.View view = a5Var7.f130195n;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (a5Var7.h().getCloseComment()) {
                            a5Var7.q().setVisibility(8);
                        } else {
                            a5Var7.q().setVisibility(0);
                        }
                        android.view.View r17 = a5Var7.r();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    com.tencent.mm.plugin.finder.uniComments.a5 a5Var8 = q3Var.f130373m;
                    if (a5Var8 != null) {
                        com.tencent.mm.plugin.finder.uniComments.n3 n3Var = new com.tencent.mm.plugin.finder.uniComments.n3(q3Var);
                        a5Var8.p().setVisibility(0);
                        android.view.View view2 = a5Var8.f130195n;
                        if (view2 == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a5Var8.q().setVisibility(8);
                        android.view.View r18 = a5Var8.r();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(r18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        r18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(r18, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a5Var8.r().setOnClickListener(new com.tencent.mm.plugin.finder.uniComments.z4(n3Var));
                    }
                }
            }
        } else {
            if (q3Var.f130380t == 0) {
                p4Var.f130360a.clear();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    p4Var.a((jv2.i) it.next(), true);
                }
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var9 = q3Var.f130373m;
                if (a5Var9 != null && (recyclerView4 = a5Var9.s().getRecyclerView()) != null && (adapter3 = recyclerView4.getAdapter()) != null) {
                    adapter3.notifyDataSetChanged();
                }
            } else {
                int f17 = p4Var.f();
                p4Var.b(list, true, false);
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var10 = q3Var.f130373m;
                if (a5Var10 != null && (recyclerView3 = a5Var10.s().getRecyclerView()) != null && (adapter2 = recyclerView3.getAdapter()) != null) {
                    adapter2.notifyItemRangeInserted(0, p4Var.f() - f17);
                }
                if (z17) {
                    java.util.ArrayList arrayList5 = p4Var.f130360a;
                    java.util.Iterator it6 = arrayList5.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            str2 = str3;
                            i18 = -1;
                            break;
                        }
                        str2 = str3;
                        if (((jv2.i) it6.next()).getItemId() == q3Var.f130380t) {
                            break;
                        }
                        i18++;
                        str3 = str2;
                    }
                    if (i18 >= 0) {
                        jv2.i iVar = (jv2.i) arrayList5.get(i18);
                        com.tencent.mm.plugin.finder.uniComments.a5 a5Var11 = q3Var.f130373m;
                        if (a5Var11 != null) {
                            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l17 = a5Var11.l();
                            java.lang.String b17 = hc2.t.b(q3Var.f130367d, q3Var.f130372i);
                            i95.m c17 = i95.n0.c(c61.yb.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            l17.g(b17, c61.yb.md((c61.yb) c17, iVar.f302223d.L0(), iVar.f302223d.D0(), false, 4, null), iVar.f302223d);
                        }
                        if (iVar.f302223d.J0() != 0) {
                            long J0 = iVar.f302223d.J0();
                            if (J0 != 0) {
                                java.util.Iterator it7 = arrayList5.iterator();
                                int i19 = 0;
                                while (it7.hasNext()) {
                                    if (((jv2.i) it7.next()).f302223d.t0() == J0) {
                                        i17 = i19;
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            i17 = -1;
                            if (i17 >= 0) {
                                i18 = i17;
                            }
                        }
                        com.tencent.mm.plugin.finder.uniComments.a5 a5Var12 = q3Var.f130373m;
                        java.lang.Object layoutManager = (a5Var12 == null || (recyclerView2 = a5Var12.s().getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                        if (linearLayoutManager != null) {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList6.add(0);
                            arrayList6.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList6);
                            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                            yj0.a.d(linearLayoutManager2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            linearLayoutManager.P(((java.lang.Integer) arrayList6.get(0)).intValue(), ((java.lang.Integer) arrayList6.get(1)).intValue());
                            yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                    }
                    str = str2;
                }
            }
            str2 = "MicroMsg.MusicUni.DrawerPresenter";
            str = str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f130347c);
        sb6.append("ms, succ:");
        sb6.append(list != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        this.f130348d.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
