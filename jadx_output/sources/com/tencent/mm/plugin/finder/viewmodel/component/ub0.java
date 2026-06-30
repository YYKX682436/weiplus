package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class ub0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f136121d;

    public ub0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        this.f136121d = nc0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List data;
        java.util.List list;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        java.util.List data2;
        java.util.List data3;
        java.util.List data4;
        boolean z17;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2;
        java.util.List data5;
        java.util.List data6;
        boolean z18;
        java.util.List data7;
        ed0.s0 s0Var = (ed0.s0) obj;
        com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f136121d;
        nc0Var.Q6().e(true);
        int i17 = s0Var.f251227b;
        int i18 = 0;
        if (i17 == 1) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = nc0Var.f135317o;
            if (wxRecyclerAdapter3 != null && (data = wxRecyclerAdapter3.getData()) != null) {
                data.clear();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = nc0Var.f135317o;
            if (wxRecyclerAdapter4 != null) {
                wxRecyclerAdapter4.notifyDataSetChanged();
            }
            nc0Var.Q6().E(false);
            android.view.View O6 = nc0Var.O6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View P6 = nc0Var.P6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(P6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(P6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showInitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 == 2) {
            android.view.View O62 = nc0Var.O6();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(O62, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O62.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(O62, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View P62 = nc0Var.P6();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(P62, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P62.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(P62, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 != 4) {
            nc0Var.f135320r = false;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter5 = nc0Var.f135317o;
            int size = (wxRecyclerAdapter5 == null || (data7 = wxRecyclerAdapter5.getData()) == null) ? 0 : data7.size();
            java.util.List<ox3.f> list2 = s0Var.f251226a;
            if (list2 != null) {
                for (ox3.f fVar : list2) {
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter6 = nc0Var.f135317o;
                    if (wxRecyclerAdapter6 != null && (data6 = wxRecyclerAdapter6.getData()) != null) {
                        if (!data6.isEmpty()) {
                            java.util.Iterator it = data6.iterator();
                            while (it.hasNext()) {
                                if (((ox3.f) it.next()).getItemId() == fVar.getItemId()) {
                                    z18 = false;
                                    break;
                                }
                            }
                        }
                        z18 = true;
                        if (z18) {
                            z17 = true;
                            if (z17 && (wxRecyclerAdapter2 = nc0Var.f135317o) != null && (data5 = wxRecyclerAdapter2.getData()) != null) {
                                data5.add(fVar);
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        data5.add(fVar);
                    }
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter7 = nc0Var.f135317o;
            if ((wxRecyclerAdapter7 == null || (data4 = wxRecyclerAdapter7.getData()) == null || !data4.isEmpty()) ? false : true) {
                android.view.View O63 = nc0Var.O6();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(O63, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O63.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(O63, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View P63 = nc0Var.P6();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(P63, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                P63.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(P63, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showNoResultVIew", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View O64 = nc0Var.O6();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(O64, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O64.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(O64, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View P64 = nc0Var.P6();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(P64, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                P64.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(P64, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC", "showSearchResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (((com.tencent.mm.plugin.ringtone.uic.v) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Ai(nc0Var.getActivity())).Q6() && size == 0) {
                    nc0Var.f135321s = 0;
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter8 = nc0Var.f135317o;
                    ox3.f fVar2 = (wxRecyclerAdapter8 == null || (data3 = wxRecyclerAdapter8.getData()) == null) ? null : (ox3.f) kz5.n0.Z(data3);
                    if (fVar2 != null) {
                        ((ox3.g) fVar2).f349750e = true;
                    }
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter9 = nc0Var.f135317o;
                if (wxRecyclerAdapter9 != null && (data2 = wxRecyclerAdapter9.getData()) != null) {
                    i18 = data2.size();
                }
                if (i18 > size && (wxRecyclerAdapter = nc0Var.f135317o) != null) {
                    wxRecyclerAdapter.notifyItemRangeInserted(size, i18 - size);
                }
            }
        } else {
            nc0Var.Q6().f();
        }
        ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(nc0Var.getActivity());
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter10 = nc0Var.f135317o;
        if (wxRecyclerAdapter10 == null || (list = wxRecyclerAdapter10.getData()) == null) {
            list = kz5.p0.f313996d;
        }
        ox3.f fVar3 = (ox3.f) kz5.n0.Z(list);
        if (fVar3 != null) {
            fVar3.getItemId();
        }
        return jz5.f0.f302826a;
    }
}
