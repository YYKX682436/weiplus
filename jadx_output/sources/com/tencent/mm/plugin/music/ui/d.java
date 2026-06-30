package com.tencent.mm.plugin.music.ui;

/* loaded from: classes4.dex */
public final class d implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.music.ui.d f150732d = new com.tencent.mm.plugin.music.ui.d();

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap k07;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            try {
                if (bitmap.getWidth() == bitmap.getHeight()) {
                    k07 = bitmap;
                } else {
                    int min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
                    if (min <= 0) {
                        min = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
                    }
                    k07 = com.tencent.mm.sdk.platformtools.x.k0(bitmap, min, min, true);
                }
                if (k07 != null) {
                    return k07;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallMusicView", e17, "getRoundBitmap exception", new java.lang.Object[0]);
            }
        }
        return bitmap;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "FloatBallMusicCoverNew";
    }
}
