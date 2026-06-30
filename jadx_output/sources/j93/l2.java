package j93;

/* loaded from: classes.dex */
public final class l2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f298434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f298435e;

    public l2(j93.p2 p2Var, wi5.n0 n0Var) {
        this.f298434d = p2Var;
        this.f298435e = n0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f463177a : null) == ym3.p.f463181f) {
            j93.p2 p2Var = this.f298434d;
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = p2Var.W6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (((a17 == null || (arrayList = a17.f152065o) == null) ? 0 : arrayList.size()) > 0) {
                if (!p2Var.f298480h) {
                    p2Var.f298480h = true;
                    com.tencent.mm.view.recyclerview.WxRecyclerView k18 = p2Var.W6().k();
                    android.view.ViewGroup.LayoutParams layoutParams = k18.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479727dj));
                    k18.setLayoutParams(marginLayoutParams);
                    em.l2 W6 = p2Var.W6();
                    if (W6.f254568y == null) {
                        W6.f254568y = (android.widget.FrameLayout) W6.f254544a.findViewById(com.tencent.mm.R.id.gbu);
                    }
                    android.widget.FrameLayout frameLayout = W6.f254568y;
                    if (frameLayout != null) {
                        lj5.c cVar = new lj5.c();
                        cVar.a(p2Var.getActivity());
                        mj5.a aVar = new mj5.a();
                        aVar.f327086d = p2Var.getActivity().getString(com.tencent.mm.R.string.f492366mb4);
                        aVar.f327088f = p2Var.getActivity().getString(com.tencent.mm.R.string.mbe);
                        aVar.f327087e = new j93.i2(p2Var);
                        aVar.f327089g = new j93.j2(p2Var);
                        mj5.a aVar2 = cVar.f318992b;
                        cVar.f318992b = aVar;
                        cVar.c(aVar2, aVar);
                        frameLayout.addView(cVar.f318991a, new android.widget.FrameLayout.LayoutParams(-1, -2));
                    }
                }
                j93.p2.V6(p2Var, true);
            } else {
                j93.p2.V6(p2Var, false);
            }
            if (this.f298435e.e()) {
                j93.p2.V6(p2Var, false);
            }
        }
    }
}
