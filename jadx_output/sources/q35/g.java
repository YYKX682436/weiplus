package q35;

/* loaded from: classes5.dex */
public abstract class g {
    public static void a(android.graphics.Bitmap bitmap, int i17, android.graphics.Bitmap.CompressFormat compressFormat, java.lang.String str, boolean z17) {
        if (str == null || str.length() <= 0) {
            throw new java.io.IOException("saveBitmapToImage pathName null or nil");
        }
        try {
            try {
                com.tencent.mm.sdk.platformtools.x.o0(str, new q35.f(bitmap, compressFormat, i17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoUtil", e17, "", new java.lang.Object[0]);
                if (!z17) {
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
            throw th6;
        }
    }
}
