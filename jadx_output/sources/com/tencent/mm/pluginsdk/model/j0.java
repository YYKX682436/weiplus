package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public abstract class j0 {
    public static boolean a(int i17, int i18) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_c2c_video_compress_type, 0);
        java.lang.String lowerCase = wo.w0.m().toLowerCase();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(Ni);
        objArr[1] = lowerCase;
        objArr[2] = Ni == 1 ? "mediaCodec" : "x264";
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CTransferConfig", "transferType:%s model:%s select %s mode", objArr);
        if (Ni == 1) {
            return true;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mediacodec_side_limit, 3000);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CTransferConfig", "rawWidth %d rawHeight:%d limit:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(Ni2));
        return java.lang.Math.max(i18, i17) >= Ni2;
    }
}
