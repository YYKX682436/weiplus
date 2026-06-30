package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class u4 implements dn.k {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.t4 f145656e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145657f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145655d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f145658g = true;

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar != null && this.f145655d.equals(str) && !com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_fileId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer success, sceneResult.field_retCode:" + hVar.field_retCode);
            if (i17 == 0 && hVar.field_retCode == 0) {
                if (this.f145658g) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, upload callback success");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, download callback success");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:transfer done, mediaid=%s, completeInfo=%s", str, hVar.toString());
                com.tencent.mm.plugin.luckymoney.model.t4 t4Var = this.f145656e;
                if (t4Var != null) {
                    ((com.tencent.mm.plugin.luckymoney.model.u0) t4Var).a(str, hVar, this.f145657f, true);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail");
                com.tencent.mm.plugin.luckymoney.model.t4 t4Var2 = this.f145656e;
                if (t4Var2 != null) {
                    ((com.tencent.mm.plugin.luckymoney.model.u0) t4Var2).a(str, hVar, this.f145657f, false);
                }
            }
        } else if (hVar != null && this.f145655d.equals(str) && hVar.field_retCode != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail, sceneResult.field_retCode:" + hVar.field_retCode);
            com.tencent.mm.plugin.luckymoney.model.t4 t4Var3 = this.f145656e;
            if (t4Var3 != null) {
                ((com.tencent.mm.plugin.luckymoney.model.u0) t4Var3).a(str, hVar, this.f145657f, false);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
