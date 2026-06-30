package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class bc0 implements com.tencent.mm.plugin.finder.search.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f133866a;

    public bc0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        this.f133866a = nc0Var;
    }

    public void a(int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f133866a;
            android.view.View O6 = nc0Var.O6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View P6 = nc0Var.P6();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(P6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(P6, "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
