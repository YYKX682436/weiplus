package nr2;

/* loaded from: classes2.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(nr2.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339169d = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.c1(this.f339169d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr2.c1 c1Var = (nr2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nr2.i1 i1Var = this.f339169d;
        nr2.l1 l1Var = i1Var.f339212c;
        if (l1Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l1Var.e();
        nr2.l1 l1Var2 = i1Var.f339212c;
        if (l1Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        nr2.b1 b1Var = new nr2.b1(i1Var);
        l1Var2.a().setVisibility(0);
        android.view.View view = l1Var2.f339265f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = l1Var2.f339266g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View c17 = l1Var2.c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l1Var2.c().setOnClickListener(new nr2.k1(b1Var));
        return jz5.f0.f302826a;
    }
}
