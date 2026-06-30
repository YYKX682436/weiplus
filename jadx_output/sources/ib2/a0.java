package ib2;

/* loaded from: classes2.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f290097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ib2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290097d = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ib2.a0(this.f290097d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ib2.a0 a0Var = (ib2.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ib2.l0 l0Var = this.f290097d.f290121c;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l0Var.e();
        if (this.f290097d.f290120b.isEmpty()) {
            ib2.l0 l0Var2 = this.f290097d.f290121c;
            if (l0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            l0Var2.a().setVisibility(0);
            android.view.View view = l0Var2.f290138f;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = l0Var2.f290139g;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c17 = l0Var2.c();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ib2.l0 l0Var3 = this.f290097d.f290121c;
            if (l0Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View view3 = l0Var3.f290139g;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View c18 = l0Var3.c();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/plugin/finder/collection/FinderCollectionViewCallback", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l0Var3.a().setVisibility(8);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f290097d.f290122d;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            if (!this.f290097d.f290126h) {
                ib2.l0 l0Var4 = this.f290097d.f290121c;
                if (l0Var4 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                l0Var4.d().k();
            }
        }
        return jz5.f0.f302826a;
    }
}
