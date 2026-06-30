package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class t0 implements c01.zc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159647d;

    public t0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159647d = productUI;
    }

    @Override // c01.zc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "lo-scanner-onRecieveMsg");
        e04.n3 n3Var = this.f159647d.f159319q;
        if (n3Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.scanproductinfo.product.id");
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_productid) || !n3Var.field_productid.equals(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lo-scanner-doUpdateActionLogicByNewXml: product id not match, productId=");
                if (str == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append(", target=");
                sb6.append(n3Var.field_productid);
                com.tencent.mars.xlog.Log.i("MicroMsg.ProductUpdateLogic", sb6.toString());
            } else {
                java.util.LinkedList b17 = com.tencent.mm.plugin.scanner.model.b.b(d17, ".sysmsg.scanproductinfo.product");
                java.util.HashMap hashMap = new java.util.HashMap();
                for (int i17 = 0; i17 < b17.size(); i17++) {
                    java.util.LinkedList linkedList = ((com.tencent.mm.plugin.scanner.model.b) b17.get(i17)).f158816f;
                    if (linkedList != null) {
                        for (int i18 = 0; i18 < linkedList.size(); i18++) {
                            com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) linkedList.get(i18);
                            if (aVar != null) {
                                hashMap.put(aVar.f158800t, aVar);
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ProductUpdateLogic", "lo-scanner-doUpdateActionLogicByNewXml: toUpdateSize=" + hashMap.size());
                com.tencent.mm.plugin.scanner.model.n0.b(n3Var.f246032a, hashMap);
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.s0(this));
    }

    @Override // c01.zc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
