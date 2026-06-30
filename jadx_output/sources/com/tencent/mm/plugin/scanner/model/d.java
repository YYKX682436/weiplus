package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public abstract class d {
    public static final void a(int i17, com.tencent.mm.plugin.scanner.model.c cVar) {
        java.lang.String str;
        int wi6 = ((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi();
        int i18 = ((zs5.a0) ((jz5.n) vz3.t.f441711b).getValue()) == zs5.a0.f475317e ? 2 : 1;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = 0;
        objArr[2] = java.lang.Integer.valueOf(cVar != null ? cVar.f158824a : 0);
        objArr[3] = java.lang.Integer.valueOf(cVar != null ? cVar.f158825b : 0);
        objArr[4] = java.lang.Integer.valueOf(cVar != null ? cVar.f158826c : 0);
        objArr[5] = java.lang.Integer.valueOf(cVar != null ? cVar.f158827d : 0);
        objArr[6] = java.lang.Integer.valueOf(cVar != null ? cVar.f158828e : 0);
        objArr[7] = java.lang.Integer.valueOf(cVar != null ? cVar.f158829f : 0);
        objArr[8] = java.lang.Integer.valueOf(cVar != null ? cVar.f158830g : 0);
        objArr[9] = java.lang.Integer.valueOf(cVar != null ? cVar.f158831h : 0);
        if (cVar == null || (str = cVar.f158832i) == null) {
            str = "";
        }
        objArr[10] = str;
        objArr[11] = java.lang.Integer.valueOf(wi6);
        objArr[12] = java.lang.Integer.valueOf(cVar != null ? cVar.f158833j : 0);
        objArr[13] = 0;
        objArr[14] = 0;
        objArr[15] = java.lang.Integer.valueOf(i18);
        g0Var.d(24657, objArr);
    }
}
