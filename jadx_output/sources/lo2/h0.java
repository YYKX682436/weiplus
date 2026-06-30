package lo2;

/* loaded from: classes8.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320128d = finderMemberSearchUI;
        this.f320129e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lo2.h0(this.f320128d, this.f320129e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lo2.h0 h0Var = (lo2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI = this.f320128d;
        finderMemberSearchUI.A.addAll(this.f320129e);
        android.widget.FrameLayout frameLayout = finderMemberSearchUI.f121411v;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        android.view.View view = finderMemberSearchUI.retryView;
        if (view == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        view.setOnClickListener(null);
        if (finderMemberSearchUI.A.isEmpty()) {
            android.widget.FrameLayout frameLayout2 = finderMemberSearchUI.f121411v;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("loadingLayout");
                throw null;
            }
            frameLayout2.setVisibility(0);
            android.view.View view2 = finderMemberSearchUI.loadingView;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = finderMemberSearchUI.nothingView;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = finderMemberSearchUI.retryView;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = finderMemberSearchUI.nothingView;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("nothingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = finderMemberSearchUI.retryView;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/member/ui/FinderMemberSearchUI", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.FrameLayout frameLayout3 = finderMemberSearchUI.f121411v;
            if (frameLayout3 == null) {
                kotlin.jvm.internal.o.o("loadingLayout");
                throw null;
            }
            frameLayout3.setVisibility(8);
            if (!finderMemberSearchUI.h7()) {
                finderMemberSearchUI.f7().setVisibility(0);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderMemberSearchUI.f121415z;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            if (finderMemberSearchUI.G != 1) {
                finderMemberSearchUI.f7().k();
            }
        }
        return jz5.f0.f302826a;
    }
}
