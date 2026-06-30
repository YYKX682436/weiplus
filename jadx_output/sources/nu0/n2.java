package nu0;

/* loaded from: classes5.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340044d = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.n2(this.f340044d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nu0.b4 b4Var = this.f340044d;
        b4Var.h7().setHasFixedSize(true);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(b4Var.getContext());
        linearLayoutManager.Q(0);
        linearLayoutManager.setItemPrefetchEnabled(true);
        b4Var.h7().setLayoutManager(linearLayoutManager);
        b4Var.h7().setItemAnimator(new androidx.recyclerview.widget.z());
        b4Var.h7().N(new nu0.d2());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b4Var.f339887w.iterator();
        while (it.hasNext()) {
            arrayList.add(new ku0.a((zu0.a) it.next(), false, 2, null));
        }
        if (arrayList.size() < b4Var.n7()) {
            arrayList.add(new ku0.a(new zu0.a(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(qg.a.Unknown, "", qg.c.Unknown), 0, 0), false, 2, null));
        }
        ju0.b bVar = b4Var.K;
        bVar.E(arrayList);
        android.view.View findViewById = b4Var.findViewById(com.tencent.mm.R.id.t2z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        b4Var.F = findViewById;
        android.view.View findViewById2 = b4Var.findViewById(com.tencent.mm.R.id.ct9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        b4Var.G = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = b4Var.findViewById(com.tencent.mm.R.id.f484046t33);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        b4Var.H = (android.widget.TextView) findViewById3;
        new androidx.recyclerview.widget.g1(new ju0.a(bVar, new nu0.g2(b4Var))).d(b4Var.h7());
        bVar.f250922e = new nu0.f2(b4Var);
        b4Var.h7().setAdapter(bVar);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = new androidx.recyclerview.widget.LinearLayoutManager(b4Var.getContext(), 0, false);
        b4Var.k7().setLayoutManager(linearLayoutManager2);
        b4Var.f339877J = new ju0.d(kz5.p0.f313996d);
        androidx.recyclerview.widget.RecyclerView k76 = b4Var.k7();
        ju0.d dVar = b4Var.f339877J;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("contentImageAdapter");
            throw null;
        }
        k76.setAdapter(dVar);
        androidx.recyclerview.widget.y1 y1Var = new androidx.recyclerview.widget.y1();
        y1Var.b(b4Var.k7());
        b4Var.k7().i(new nu0.b2(y1Var, linearLayoutManager2, b4Var));
        androidx.recyclerview.widget.f2 adapter = b4Var.k7().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView p76 = b4Var.p7();
        androidx.recyclerview.widget.RecyclerView k77 = b4Var.k7();
        p76.getClass();
        java.util.ArrayList arrayList2 = p76.f69687e;
        if (!arrayList2.contains(k77)) {
            arrayList2.add(k77);
        }
        nu0.q0 U6 = b4Var.U6();
        nu0.c2 c2Var = new nu0.c2(b4Var);
        U6.getClass();
        U6.f340078u = c2Var;
        return b4Var.V6().Z6();
    }
}
