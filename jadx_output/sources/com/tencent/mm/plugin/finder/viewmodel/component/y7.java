package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class y7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f136533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136533d = e8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.y7(this.f136533d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.y7 y7Var = (com.tencent.mm.plugin.finder.viewmodel.component.y7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var = this.f136533d;
        e8Var.S6();
        com.tencent.mm.plugin.finder.viewmodel.component.x7 x7Var = new com.tencent.mm.plugin.finder.viewmodel.component.x7(e8Var);
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = e8Var.f134209h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View R6 = e8Var.R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCoursePurchaseListUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e8Var.R6().setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.d8(x7Var));
        return jz5.f0.f302826a;
    }
}
