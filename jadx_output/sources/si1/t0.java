package si1;

/* loaded from: classes7.dex */
public class t0 extends si1.s0 {
    public t0(si1.u0 u0Var) {
    }

    @Override // si1.s0, si1.p0
    public void F6(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0)) {
            super.F6(lVar, str);
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = ((com.tencent.mm.plugin.appbrand.jsapi.d0) lVar).t3();
        android.util.SparseIntArray sparseIntArray = si1.d.f408234a;
        if (t37 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        t37.m(new si1.c(t37, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490176n1, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(si1.d.f408234a.get(str.hashCode())))));
    }
}
