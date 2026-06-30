package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.p2 f122336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.finder.playlist.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122336d = p2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.k2(this.f122336d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.playlist.k2 k2Var = (com.tencent.mm.plugin.finder.playlist.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122336d;
        com.tencent.mm.plugin.finder.playlist.s2 s2Var = p2Var.f122397c;
        if (s2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        s2Var.e();
        com.tencent.mm.plugin.finder.playlist.s2 s2Var2 = p2Var.f122397c;
        if (s2Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.playlist.j2 j2Var = new com.tencent.mm.plugin.finder.playlist.j2(p2Var);
        s2Var2.a().setVisibility(0);
        android.view.View view = s2Var2.f122450f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = s2Var2.f122451g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View c17 = s2Var2.c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s2Var2.c().setOnClickListener(new com.tencent.mm.plugin.finder.playlist.r2(j2Var));
        return jz5.f0.f302826a;
    }
}
