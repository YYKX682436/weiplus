package rt1;

/* loaded from: classes7.dex */
public final class y0 implements rt1.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI f399498a;

    public y0(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI) {
        this.f399498a = carLicensePlateListUI;
    }

    @Override // rt1.b1
    public kotlinx.coroutines.y0 a() {
        return this.f399498a.f94608d;
    }

    @Override // rt1.b1
    public void b(com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI = this.f399498a;
        android.view.View view = carLicensePlateListUI.f94621m;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!((mMCarLicensePlateInfo == null || (arrayList = mMCarLicensePlateInfo.f94604d) == null || !(arrayList.isEmpty() ^ true)) ? false : true)) {
            android.view.View view2 = carLicensePlateListUI.f94620i;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("emptyView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = carLicensePlateListUI.f94618g;
            if (mRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            mRecyclerView.setVisibility(8);
            rt1.r0 r0Var = carLicensePlateListUI.f94619h;
            if (r0Var == null) {
                kotlin.jvm.internal.o.o("recyclerAdapter");
                throw null;
            }
            java.util.ArrayList arrayList4 = r0Var.f399479d;
            if (true ^ arrayList4.isEmpty()) {
                r0Var.notifyItemRangeRemoved(0, arrayList4.size());
                arrayList4.clear();
                return;
            }
            return;
        }
        android.view.View view3 = carLicensePlateListUI.f94620i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView2 = carLicensePlateListUI.f94618g;
        if (mRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        mRecyclerView2.setVisibility(0);
        rt1.r0 r0Var2 = carLicensePlateListUI.f94619h;
        if (r0Var2 == null) {
            kotlin.jvm.internal.o.o("recyclerAdapter");
            throw null;
        }
        java.util.ArrayList newList = mMCarLicensePlateInfo.f94604d;
        kotlin.jvm.internal.o.g(newList, "newList");
        java.util.ArrayList arrayList6 = r0Var2.f399479d;
        if (!arrayList6.isEmpty()) {
            androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new rt1.s0(new java.util.ArrayList(arrayList6), new java.util.ArrayList(newList)), true);
            arrayList6.clear();
            arrayList6.addAll(newList);
            a17.b(r0Var2);
        } else if (!newList.isEmpty()) {
            arrayList6.addAll(newList);
            r0Var2.notifyItemRangeInserted(0, newList.size());
        }
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = carLicensePlateListUI.f94616e;
        if (carLicensePlateListViewContract$ViewModel != null && carLicensePlateListViewContract$ViewModel.f94624e) {
            z17 = true;
        }
        if (z17) {
            carLicensePlateListUI.finish();
        }
    }

    @Override // rt1.b1
    public void c(qt1.f exception) {
        kotlin.jvm.internal.o.g(exception, "exception");
        if (exception.f366523g instanceof qt1.e) {
            st1.g.b(exception);
        }
    }

    @Override // rt1.b1
    public android.app.Activity d() {
        return this.f399498a;
    }

    @Override // rt1.b1
    public void e(rt1.a1 request) {
        kotlin.jvm.internal.o.g(request, "request");
        if (rt1.a1.f399384d == request) {
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI = this.f399498a;
            android.view.View view = carLicensePlateListUI.f94621m;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = carLicensePlateListUI.f94620i;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("emptyView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = carLicensePlateListUI.f94618g;
            if (mRecyclerView != null) {
                mRecyclerView.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }
    }
}
