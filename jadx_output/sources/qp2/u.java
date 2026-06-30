package qp2;

/* loaded from: classes2.dex */
public final class u implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365803d;

    public u(qp2.y yVar) {
        this.f365803d = yVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        oa.i iVar;
        java.lang.Object obj2;
        java.lang.String s07;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
        if (jbVar == null || (gVar = jbVar.field_ctrInfo.f388488f) == null) {
            return;
        }
        r45.xs2 xs2Var = new r45.xs2();
        byte[] bArr = gVar.f192156a;
        java.lang.String str = "";
        if (bArr != null) {
            try {
                xs2Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        int integer = xs2Var.getInteger(12);
        qp2.y yVar = this.f365803d;
        com.google.android.material.tabs.TabLayout R6 = yVar.R6();
        kotlin.jvm.internal.o.f(R6, "access$getTabLayout(...)");
        java.lang.Integer any = java.lang.Integer.valueOf(integer);
        kotlin.jvm.internal.o.g(any, "any");
        int tabCount = R6.getTabCount();
        int i17 = 0;
        while (true) {
            if (i17 >= tabCount) {
                iVar = null;
                break;
            }
            iVar = R6.k(i17);
            if ((iVar != null ? iVar.f343778a : null) instanceof qp2.i) {
                java.lang.Object obj3 = iVar.f343778a;
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.tab.NearbyLiveSquareTabLayoutUIC.NearbyTab");
                if (((qp2.i) obj3).f365786c == any.intValue()) {
                    break;
                }
            }
            i17++;
        }
        if (iVar == null || (obj2 = iVar.f343778a) == null) {
            return;
        }
        qp2.i iVar2 = (qp2.i) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("registerRedDot tabId:");
        sb6.append(integer);
        sb6.append(" isShow=");
        boolean z17 = z9Var.f105327a;
        sb6.append(java.lang.Boolean.valueOf(z17));
        sb6.append(" show_type=");
        r45.f03 f03Var = z9Var.f105328b;
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373887d) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", sb6.toString());
        boolean z18 = z17;
        android.widget.ImageView imageView = iVar2.f365788e;
        if (!z18) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment P6 = yVar.P6();
        if (P6 != null && (s07 = P6.s0()) != null) {
            str = s07;
        }
        com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
        androidx.fragment.app.Fragment fragment = yVar.getFragment();
        kotlin.jvm.internal.o.d(fragment);
        gaVar.n(1, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 0, str);
    }
}
