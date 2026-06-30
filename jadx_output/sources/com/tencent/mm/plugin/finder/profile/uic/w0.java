package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f124307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC) {
        super(0);
        this.f124307d = finderProfileAllLayoutUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f124307d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment D7 = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) a17).D7(com.tencent.mm.plugin.finder.profile.FinderProfileAllFragment.class);
        if (D7 != null) {
            com.tencent.mm.plugin.finder.profile.uic.dk dkVar = (com.tencent.mm.plugin.finder.profile.uic.dk) zVar.b(D7).a(com.tencent.mm.plugin.finder.profile.uic.dk.class);
            androidx.fragment.app.Fragment fragment = dkVar.getFragment();
            kotlin.jvm.internal.o.d(fragment);
            androidx.lifecycle.c1 a18 = zVar.b(fragment).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = (com.tencent.mm.plugin.finder.profile.uic.f4) a18;
            androidx.recyclerview.widget.RecyclerView recyclerView = dkVar.P6().getRecyclerView();
            if (recyclerView != null && !dkVar.f123640q) {
                recyclerView.i(new com.tencent.mm.plugin.finder.profile.uic.ij(f4Var, dkVar));
                androidx.appcompat.app.AppCompatActivity activity = dkVar.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.google.android.material.appbar.AppBarLayout X6 = ((com.tencent.mm.plugin.finder.profile.uic.o0) zVar.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).X6();
                kotlin.jvm.internal.o.f(X6, "<get-appBarLayout>(...)");
                X6.a(new com.tencent.mm.plugin.finder.profile.uic.jj(f4Var, recyclerView));
            }
            dkVar.getFeedLoader().getDataList().clear();
            dkVar.P6().post(new com.tencent.mm.plugin.finder.profile.uic.kj(dkVar, f4Var));
            dkVar.f123640q = true;
        }
        return jz5.f0.f302826a;
    }
}
