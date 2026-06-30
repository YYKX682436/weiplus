package ks2;

/* loaded from: classes8.dex */
public final class a implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks2.j f311597d;

    public a(ks2.j jVar) {
        this.f311597d = jVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        kotlin.Result result = (kotlin.Result) obj;
        kotlin.jvm.internal.o.d(result);
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(result.getValue());
        ks2.j jVar = this.f311597d;
        if (!m528isSuccessimpl) {
            if (kotlin.Result.m527isFailureimpl(result.getValue())) {
                android.view.View view = jVar.H;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "dealErrorCase", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "dealErrorCase", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = jVar.G;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                android.view.View view2 = jVar.I;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "dealErrorCase", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "dealErrorCase", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = jVar.f311611J;
                if (view3 == null) {
                    return;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "dealErrorCase", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "dealErrorCase", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        java.lang.Object value = result.getValue();
        if (kotlin.Result.m527isFailureimpl(value)) {
            value = null;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) value;
        if (linkedList != null) {
            jVar.getClass();
            ks2.b bVar = jVar.F;
            bVar.f311598d.addAll(linkedList);
            bVar.notifyDataSetChanged();
            android.view.View view4 = jVar.H;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (linkedList.size() > 0) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = jVar.G;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                android.view.View view5 = jVar.I;
                if (view5 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view6 = jVar.f311611J;
                if (view6 == null) {
                    return;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = jVar.G;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            android.view.View view7 = jVar.I;
            if (view7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = jVar.f311611J;
            if (view8 == null) {
                return;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "refreshMoreInfoDrawer", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
