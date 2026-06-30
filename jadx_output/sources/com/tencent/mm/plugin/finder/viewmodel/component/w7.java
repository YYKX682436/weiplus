package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class w7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f136309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136309d = e8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.w7(this.f136309d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.w7 w7Var = (com.tencent.mm.plugin.finder.viewmodel.component.w7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var = this.f136309d;
        e8Var.S6();
        if (e8Var.f134212n.isEmpty()) {
            e8Var.Q6().setVisibility(0);
            android.view.View view = e8Var.f134208g;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = e8Var.f134209h;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View R6 = e8Var.R6();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = e8Var.f134209h;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View R62 = e8Var.R6();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(R62, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R62.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(R62, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e8Var.Q6().setVisibility(8);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = e8Var.f134211m;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            if (!e8Var.f134215q) {
                e8Var.getRlLayout().k();
            }
        }
        return jz5.f0.f302826a;
    }
}
