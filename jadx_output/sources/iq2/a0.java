package iq2;

/* loaded from: classes2.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f293709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(iq2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f293710e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iq2.a0(this.f293710e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iq2.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f293709d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f293709d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        iq2.d0 d0Var = this.f293710e;
        if (d0Var.f293741y) {
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = d0Var.f293726j;
            if (finderChildRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            boolean z18 = finderChildRecyclerView.g1();
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView b17 = ((gq2.j) d0Var.f293719c.f301101g).f274564g.b();
            boolean z19 = b17 != null && b17.h1();
            com.tencent.mars.xlog.Log.i(d0Var.f293721e, "onUserVisibleFocused isScrollTop: " + z18 + " isParentScrollBottom: " + z19);
            if (z18 || z19) {
                z17 = z18;
            } else {
                com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView2 = d0Var.f293726j;
                if (finderChildRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(finderChildRecyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragmentViewCallback$onUserVisibleFocused$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
                finderChildRecyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(finderChildRecyclerView2, "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragmentViewCallback$onUserVisibleFocused$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            }
            ((gq2.j) d0Var.f293719c.f301101g).f274564g.j(z17);
        }
        return jz5.f0.f302826a;
    }
}
