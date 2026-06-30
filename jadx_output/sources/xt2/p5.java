package xt2;

/* loaded from: classes3.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r5 f456955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(xt2.r5 r5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456955e = r5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.p5(this.f456955e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.p5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456954d;
        xt2.r5 r5Var = this.f456955e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.recyclerview.widget.RecyclerView recyclerView = r5Var.f456995n;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("productList");
                throw null;
            }
            recyclerView.setVisibility(8);
            android.view.View view = r5Var.f457000s;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$reqShopListAndRefreshUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$reqShopListAndRefreshUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f456954d = 1;
            if (xt2.r5.y(r5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r5Var.z();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = r5Var.f456995n;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("productList");
            throw null;
        }
        recyclerView2.setVisibility(0);
        android.view.View view2 = r5Var.f457000s;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$reqShopListAndRefreshUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$reqShopListAndRefreshUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
