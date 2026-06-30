package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.d1 f136509d;

    public y0(com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var) {
        this.f136509d = d1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i17;
        boolean z17;
        androidx.recyclerview.widget.k3 p07;
        com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var = this.f136509d;
        android.view.ViewGroup O6 = d1Var.O6();
        boolean z18 = false;
        if (O6 != null) {
            int[] iArr = d1Var.f134065o;
            O6.getLocationInWindow(iArr);
            int measuredHeight = iArr[1] + O6.getMeasuredHeight();
            android.view.ViewGroup.LayoutParams layoutParams = O6.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i17 = measuredHeight - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        } else {
            i17 = 0;
        }
        d1Var.f134066p = i17;
        int i18 = d1Var.f134066p;
        if (i18 != d1Var.f134067q) {
            com.tencent.mm.plugin.finder.viewmodel.component.a aVar = d1Var.f134064n;
            if (aVar != null) {
                com.tencent.mm.plugin.finder.convert.lh lhVar = (com.tencent.mm.plugin.finder.convert.lh) aVar;
                androidx.recyclerview.widget.RecyclerView recyclerView = lhVar.f103929b;
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = recyclerView instanceof com.tencent.mm.view.recyclerview.WxRecyclerView ? (com.tencent.mm.view.recyclerview.WxRecyclerView) recyclerView : null;
                if (wxRecyclerView != null && (p07 = wxRecyclerView.p0(0)) != null && (p07 instanceof in5.s0)) {
                    in5.s0 s0Var = (in5.s0) p07;
                    java.lang.Object obj = s0Var.f293125i;
                    if (obj instanceof so2.i1) {
                        com.tencent.mm.plugin.finder.convert.th thVar = lhVar.f103928a;
                        if (kotlin.jvm.internal.o.b(obj, thVar.f104617i)) {
                            thVar.o(s0Var, i18);
                        }
                    }
                }
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("Finder.DoubleClickTipUIC", "OnPreDrawListener lastY=" + d1Var.f134067q + ",currY=" + d1Var.f134066p);
            }
            d1Var.f134067q = d1Var.f134066p;
        }
        return true;
    }
}
