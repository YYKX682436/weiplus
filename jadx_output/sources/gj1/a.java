package gj1;

/* loaded from: classes9.dex */
public class a implements com.tencent.mm.storage.k8 {
    @Override // com.tencent.mm.storage.k8
    public void p(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l8 l8Var) {
        if (l4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(l4Var.h1())) {
            return;
        }
        java.lang.String h17 = l4Var.h1();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h17, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandConversionExtension", "contact is null or contactId is 0 for %s", h17);
            return;
        }
        if (com.tencent.mm.storage.z3.z3(h17) && !com.tencent.mm.storage.z3.z4(h17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandConversionExtension", "this conversation is a app brand contact!");
            l4Var.T1("appbrandcustomerservicemsg");
            ((ab5.a) ((com.tencent.mm.plugin.appbrand.service.b5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b5.class))).wi(l4Var);
        } else if (com.tencent.mm.storage.z3.C3(h17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
            l4Var.T1(null);
        }
    }
}
