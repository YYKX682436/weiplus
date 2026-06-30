package cw4;

/* loaded from: classes8.dex */
public final class i0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f224228d;

    public i0(cw4.m0 m0Var) {
        this.f224228d = m0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        cw4.o oVar;
        cw4.a0 a0Var = (cw4.a0) obj;
        cw4.m0 m0Var = this.f224228d;
        com.tencent.mars.xlog.Log.i(m0Var.f224239e, "get liveTransTextRes");
        if (a0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = a0Var.f224193a;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = m0Var.f224239e;
                if (!hasNext) {
                    break;
                }
                cw4.z zVar = (cw4.z) it.next();
                if (com.tencent.mm.sdk.platformtools.t8.K0(zVar.f224308c) || com.tencent.mm.sdk.platformtools.t8.K0(zVar.f224306a)) {
                    com.tencent.mars.xlog.Log.w(str, "node.transText == nil or hashCode == nil , node.orgText = " + zVar.f224307b);
                } else {
                    arrayList.add(kz5.c1.k(new jz5.l("transText", zVar.f224308c), new jz5.l("hashCode", zVar.f224306a)));
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(zVar.f224308c) && !com.tencent.mm.sdk.platformtools.t8.K0(zVar.f224307b) && (oVar = m0Var.f224245n) != null) {
                    java.lang.String str2 = zVar.f224307b;
                    kotlin.jvm.internal.o.d(str2);
                    java.lang.String str3 = zVar.f224308c;
                    kotlin.jvm.internal.o.d(str3);
                    ((cw4.f1) oVar).f224218a.f181744g.put(str2, str3);
                }
            }
            java.lang.String eVar = new cl0.e(arrayList).toString();
            kotlin.jvm.internal.o.f(eVar, "toString(...)");
            com.tencent.mars.xlog.Log.i(str, "jsonData is ".concat(eVar));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((cw4.z) arrayList2.get(0)).f224309d)) {
                m0Var.f224240f = java.lang.String.valueOf(((cw4.z) arrayList2.get(0)).f224309d);
            }
            m0Var.e(eVar);
        }
    }
}
