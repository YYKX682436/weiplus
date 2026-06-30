package jn2;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.w f300709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f300710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jn2.w wVar, android.widget.TextView textView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300709e = wVar;
        this.f300710f = textView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.u(this.f300709e, this.f300710f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object p76;
        java.util.List list;
        java.util.List list2;
        jn2.c1 c1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f300708d;
        kz5.p0 p0Var = kz5.p0.f313996d;
        android.widget.TextView textView = this.f300710f;
        boolean z17 = true;
        jn2.w wVar = this.f300709e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                sf2.x xVar = wVar.f300722f;
                java.lang.String obj2 = textView.getText().toString();
                this.f300708d = 1;
                p76 = xVar.p7(obj2, null, this);
                if (p76 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                p76 = obj;
            }
            r45.ux1 ux1Var = (r45.ux1) p76;
            list = ux1Var != null ? ux1Var.f387713d : null;
            if (list == null) {
                list = p0Var;
            }
            list2 = ux1Var != null ? ux1Var.f387716g : null;
            if (list2 == null) {
                list2 = p0Var;
            }
            wVar.D = textView.getText().toString();
            wVar.B = ux1Var != null ? ux1Var.f387714e : null;
            wVar.C = ux1Var != null ? ux1Var.f387715f : 0;
            wVar.E.clear();
            c1Var = wVar.f300737x;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorSingSongAddPanelSearchWidget", "Search music failed: " + e17.getMessage());
            jn2.w.a(wVar, p0Var);
        }
        if (c1Var == null) {
            kotlin.jvm.internal.o.o("searchAdapter");
            throw null;
        }
        if (wVar.C == 0) {
            z17 = false;
        }
        c1Var.y(list, list2, z17, wVar.D);
        androidx.recyclerview.widget.RecyclerView recyclerView = wVar.f300731r;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$setupSearchInput$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$setupSearchInput$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        }
        jn2.w.a(wVar, list);
        return jz5.f0.f302826a;
    }
}
