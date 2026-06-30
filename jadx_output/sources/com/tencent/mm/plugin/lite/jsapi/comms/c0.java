package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public final class c0 {
    public c0(kotlin.jvm.internal.i iVar) {
    }

    public static final android.graphics.Bitmap a(com.tencent.mm.plugin.lite.jsapi.comms.c0 c0Var, android.graphics.Bitmap bitmap, float f17, float f18) {
        float f19;
        float f27;
        c0Var.getClass();
        if (f17 <= 0.0f && f18 <= 0.0f) {
            return bitmap;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiCompressImage", "scaleTheBitmap srcWidth:%f srcHeight:%f targetCompressWidth:%f targetCompressHeight:%f", java.lang.Float.valueOf(width), java.lang.Float.valueOf(height), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        if (width <= 0.0f || height <= 0.0f) {
            return bitmap;
        }
        if (f17 <= 0.0f || f18 <= 0.0f) {
            f19 = f17 > 0.0f ? f17 / width : f18 / height;
            f27 = f19;
        } else {
            f19 = f17 / width;
            f27 = f18 / height;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiCompressImage", "scaleTheBitmap widthScale:%f heightScale:%f", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27));
        try {
            android.graphics.Bitmap F0 = com.tencent.mm.sdk.platformtools.x.F0(bitmap, f19, f27, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiCompressImage", "scaleTheBitmap scaledBitmap width:%d height:%d", java.lang.Integer.valueOf(F0.getWidth()), java.lang.Integer.valueOf(F0.getHeight()));
            return F0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiCompressImage", "scaleTheBitmap %s", e17);
            return bitmap;
        }
    }
}
