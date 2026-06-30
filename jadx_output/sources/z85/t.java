package z85;

/* loaded from: classes4.dex */
public class t extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470821e = {l75.n0.getCreateSQLs(z85.s.f470820r, "EmotionDetailInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470822d;

    public t(l75.k0 k0Var) {
        super(k0Var, z85.s.f470820r, "EmotionDetailInfo", null);
        this.f470822d = k0Var;
    }

    @Override // l75.n0
    public java.lang.String getTableName() {
        return "EmotionDetailInfo";
    }

    public z85.s y0(java.lang.String str) {
        z85.s sVar = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmotionDetailInfoStorage", "getEmotionDetailRespnseByPID failed. productID is null.");
            return null;
        }
        android.database.Cursor D = this.f470822d.D("EmotionDetailInfo", new java.lang.String[]{"content", "lan"}, "productID=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D != null && D.moveToFirst()) {
            sVar = new z85.s();
            sVar.field_content = D.getBlob(0);
            sVar.field_lan = D.getString(1);
            sVar.field_productID = str;
        }
        if (D != null) {
            D.close();
        }
        return sVar;
    }

    public void z0(java.lang.String str, r45.se3 se3Var, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || se3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
        }
        try {
            z85.s sVar = new z85.s();
            sVar.field_productID = str;
            sVar.field_content = se3Var.toByteArray();
            sVar.field_lan = str2;
            if (this.f470822d.m("EmotionDetailInfo", "productID", sVar.convertTo()) > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID success. ProductId:%s", str);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID failed. ProductId:%s", str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
