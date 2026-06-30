package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
class MMJpegOptim {
    static {
        com.tencent.mm.sdk.platformtools.r9.a();
    }

    public static native boolean checkIntegrity(java.lang.String str);

    public static native int compressByQuality(android.graphics.Bitmap bitmap, int i17, boolean z17, java.lang.String str);

    public static native int compressByQualityOptim(android.graphics.Bitmap bitmap, int i17, boolean z17, java.lang.String str);

    public static native int convertToProgressive(java.lang.String str, java.lang.String str2, int i17);

    public static native int decodeToBitmap(java.lang.String str, android.graphics.Bitmap bitmap, int i17);

    public static native int isProgressiveFile(java.lang.String str);

    public static native int queryQuality(java.lang.String str);
}
