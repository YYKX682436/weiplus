package vr2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f439615a;

    public e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        kotlin.jvm.internal.o.g(finderHomeUIC, "finderHomeUIC");
        this.f439615a = finderHomeUIC;
    }

    public final int a() {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        android.app.Activity context = this.f439615a.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            return nyVar.f135380n;
        }
        return 20;
    }

    public final java.util.List b(int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = this.f439615a;
        boolean z17 = false;
        if (i17 == 17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = finderHomeUIC.U6(1);
            if (U6 != null) {
                cs2.k kVar = (cs2.k) pf5.z.f353948a.b(U6).a(cs2.k.class);
                cs2.j jVar = kVar.f222076d;
                es2.g gVar = jVar instanceof es2.g ? (es2.g) jVar : null;
                if (gVar != null && gVar.f256361y) {
                    z17 = true;
                }
                if ((z17 ? jVar : null) != null) {
                    arrayList.add(kVar);
                }
            }
            return arrayList;
        }
        if (i17 != 18) {
            if (i17 != 20) {
                return kz5.p0.f313996d;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U62 = finderHomeUIC.U6(1);
            if (U62 != null) {
                cs2.k kVar2 = (cs2.k) pf5.z.f353948a.b(U62).a(cs2.k.class);
                cs2.j jVar2 = kVar2.f222076d;
                es2.g gVar2 = jVar2 instanceof es2.g ? (es2.g) jVar2 : null;
                if (gVar2 != null && gVar2.f256361y) {
                    z17 = true;
                }
                if ((z17 ? jVar2 : null) != null) {
                    arrayList2.add(kVar2);
                }
            }
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U63 = finderHomeUIC.U6(4);
        if (U63 != null) {
            cs2.k kVar3 = (cs2.k) pf5.z.f353948a.b(U63).a(cs2.k.class);
            cs2.j jVar3 = kVar3.f222076d;
            es2.g gVar3 = jVar3 instanceof es2.g ? (es2.g) jVar3 : null;
            if (!(gVar3 != null && gVar3.f256361y)) {
                jVar3 = null;
            }
            if (jVar3 != null) {
                arrayList3.add(kVar3);
            }
        }
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U64 = finderHomeUIC.U6(3);
        if (U64 != null) {
            cs2.k kVar4 = (cs2.k) pf5.z.f353948a.b(U64).a(cs2.k.class);
            cs2.j jVar4 = kVar4.f222076d;
            es2.g gVar4 = jVar4 instanceof es2.g ? (es2.g) jVar4 : null;
            if (gVar4 != null && gVar4.f256361y) {
                z17 = true;
            }
            if ((z17 ? jVar4 : null) != null) {
                arrayList3.add(kVar4);
            }
        }
        return arrayList3;
    }
}
