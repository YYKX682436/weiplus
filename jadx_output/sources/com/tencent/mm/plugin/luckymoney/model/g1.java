package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class g1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.v2 f145300c;

    public g1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.luckymoney.model.v2 v2Var) {
        this.f145298a = str;
        this.f145299b = str2;
        this.f145300c = v2Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load finish url: %s, %s, %s", str, java.lang.Integer.valueOf(bVar.f359531a), java.lang.Integer.valueOf(bVar.f359532b));
        int i17 = bVar.f359531a;
        java.lang.String str2 = this.f145298a;
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(991, 6);
            g0Var.d(18888, 1, str2, str);
            byte[] bArr = bVar.f359533c;
            if (bArr != null) {
                java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(bArr);
                java.lang.String str3 = this.f145299b;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !b17.equals(str3)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "md5 not match: %s, %s", b17, str3);
                    g0Var.A(991, 8);
                    g0Var.d(16543, str, str3, b17);
                }
            }
        } else if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.A(991, 7);
            g0Var2.d(18888, 2, str2, str);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.A(991, 8);
            g0Var3.d(18888, 2, str2, str);
        } else {
            android.graphics.Bitmap bitmap = bVar.f359534d;
            if (bitmap == null || bitmap.isRecycled()) {
                com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var4.A(991, 9);
                g0Var4.d(18888, 2, str2, str);
            }
        }
        com.tencent.mm.plugin.luckymoney.model.v2 v2Var = this.f145300c;
        if (v2Var != null) {
            v2Var.a(bVar.f359534d, bVar.f359532b, str);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
