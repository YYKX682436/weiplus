package fn2;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ux1 f264345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.ux1 ux1Var, fn2.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264345d = ux1Var;
        this.f264346e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn2.p(this.f264345d, this.f264346e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fn2.p pVar = (fn2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ux1 ux1Var = this.f264345d;
        java.util.List list = ux1Var != null ? ux1Var.f387713d : null;
        java.util.List list2 = kz5.p0.f313996d;
        if (list == null) {
            list = list2;
        }
        java.util.List list3 = ux1Var != null ? ux1Var.f387716g : null;
        if (list3 != null) {
            list2 = list3;
        }
        fn2.s sVar = this.f264346e;
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = sVar.f264380s;
        if (dvVar != null) {
            com.tencent.mm.protobuf.g gVar = ux1Var != null ? ux1Var.f387714e : null;
            int i17 = ux1Var != null ? ux1Var.f387715f : 0;
            dvVar.f118157j = gVar;
            dvVar.f118158k = i17;
        }
        sVar.f264377p.J(list, list2, (ux1Var == null || ux1Var.f387715f == 0) ? false : true, sVar.f264383v);
        com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = sVar.f264380s;
        if (dvVar2 != null && (recyclerView = dvVar2.f118152e) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$4$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.dv dvVar3 = sVar.f264380s;
        if (dvVar3 != null) {
            dvVar3.d();
        }
        fn2.s.a(sVar, list);
        return jz5.f0.f302826a;
    }
}
