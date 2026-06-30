package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class o1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.jy f156924r;

    /* renamed from: s, reason: collision with root package name */
    public final double f156925s;

    public o1(java.lang.String str, java.lang.String str2, double d17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f156925s = 0.0d;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.iy();
        lVar.f70665b = new r45.jy();
        lVar.f70667d = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE;
        lVar.f70666c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_placeorder";
        int i17 = 0;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.iy iyVar = (r45.iy) a17.f70710a.f70684a;
        iyVar.f377400d = str;
        iyVar.f377401e = str2;
        this.f156925s = d17;
        iyVar.f377402f = java.lang.Math.round(d17 * 100.0d);
        iyVar.f377403g = str3;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && !com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            int i18 = 0;
            loop0: while (true) {
                if (i18 >= str4.length()) {
                    break;
                }
                for (int i19 = 0; i19 < str5.length(); i19++) {
                    if (str4.charAt(i18) == str5.charAt(i19)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferPlaceOrder", "find equal char: %s, %s, %s", java.lang.Character.valueOf(str4.charAt(i18)), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        i17 = 1;
                        break loop0;
                    }
                }
                i18++;
            }
        }
        iyVar.f377405i = i17;
        iyVar.f377404h = str4;
        if (com.tencent.mm.storage.z3.m4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            iyVar.f377406m = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        }
        iyVar.f377407n = com.tencent.mm.wallet_core.ui.r1.x(str);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.jy jyVar = (r45.jy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156924r = jyVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(jyVar.f378205d);
        r45.jy jyVar2 = this.f156924r;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferPlaceOrder", "ret_code: %s, ret_msg: %s prepay_id:%s", valueOf, jyVar2.f378206e, jyVar2.f378211m);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.jy jyVar = (r45.jy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = jyVar.f378205d;
        this.f214030h = jyVar.f378206e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE;
    }
}
