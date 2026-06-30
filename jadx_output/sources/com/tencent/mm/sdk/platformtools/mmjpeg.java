package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
class mmjpeg {
    public static native int convertToProgressive(java.lang.String str, java.lang.String str2);

    public static native boolean decodeToBitmap(java.lang.String str, android.graphics.Bitmap bitmap);

    public static native int isProgressiveFile(java.lang.String str);

    public static native com.tencent.mm.sdk.platformtools.JpegParams queryParams(java.lang.String str);

    public static native int queryQuality(java.lang.String str);
}
