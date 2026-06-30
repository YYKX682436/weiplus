package com.tencent.mm.sdk.platformtools;

/* loaded from: classes4.dex */
public final class MMNativeWebP {
    public static native android.graphics.Bitmap nativeDecodeByteArray(byte[] bArr, android.graphics.BitmapFactory.Options options);

    public static native byte[] nativeEncodeBitmap(android.graphics.Bitmap bitmap, int i17);

    public static native boolean nativeIsWebPImage(byte[] bArr);
}
