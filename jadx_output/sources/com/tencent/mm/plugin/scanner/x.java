package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class x implements gm5.a {
    public x(com.tencent.mm.plugin.scanner.y yVar) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        km5.b c17 = km5.u.c();
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        kd0.f2 f2Var = (kd0.f2) bVar.a(1);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yf();
        lVar.f70665b = new r45.zf();
        java.lang.String str = f2Var.f306634a;
        int i17 = com.tencent.mm.plugin.scanner.z0.d(intValue, str) ? 3 : com.tencent.mm.plugin.scanner.z0.o(intValue, str) ? 4 : com.tencent.mm.plugin.scanner.z0.h(intValue, str) ? 2 : com.tencent.mm.plugin.scanner.z0.l(intValue, str) ? 1 : com.tencent.mm.plugin.scanner.z0.n(intValue, str) ? 7 : com.tencent.mm.plugin.scanner.z0.m(intValue, str) ? 5 : com.tencent.mm.plugin.scanner.z0.k(intValue, str) ? 6 : com.tencent.mm.plugin.scanner.z0.g(intValue, str) ? 9 : -1;
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_pay_batchgeturlinfo, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FetchQRCodeInfoService", "no abtest, fetchQRCodeInfo url:batchgeturlinfo");
            lVar.f70666c = "/cgi-bin/micromsg-bin/batchgeturlinfo";
            lVar.f70667d = 3964;
        } else if (i17 == 5 || i17 == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo url:pay-batchgeturlinfo");
            lVar.f70666c = "/cgi-bin/mmpay-bin/pay-batchgeturlinfo";
            lVar.f70667d = 14949;
            lVar.f70678o = 2;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo url:batchgeturlinfo");
            lVar.f70666c = "/cgi-bin/micromsg-bin/batchgeturlinfo";
            lVar.f70667d = 3964;
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.yf yfVar = (r45.yf) a17.f70710a.f70684a;
        r45.zp3 zp3Var = new r45.zp3();
        zp3Var.f392267d = f2Var.f306634a;
        zp3Var.f392268e = i17;
        zp3Var.f392269f = f2Var.f306635b;
        zp3Var.f392270g = f2Var.f306636c;
        zp3Var.f392271h = f2Var.f306637d;
        zp3Var.f392272i = f2Var.f306638e;
        yfVar.f391030f = 1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(zp3Var);
        yfVar.f391028d = linkedList.size();
        yfVar.f391029e = linkedList;
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(a17, new com.tencent.mm.plugin.scanner.w(this, c17));
        return null;
    }
}
