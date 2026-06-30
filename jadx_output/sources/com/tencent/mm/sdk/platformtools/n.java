package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public abstract class n {
    public static java.lang.String a(java.lang.String str) {
        gp.d dVar = new gp.d();
        try {
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(5);
            try {
                dVar.release();
            } catch (java.io.IOException unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BackwardSupportUtil", "getVideoTakeTime timeString " + extractMetadata);
            return extractMetadata;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BackwardSupportUtil", "getVideoLatLong setDataSource failure: " + e17.getMessage());
            return null;
        }
    }
}
