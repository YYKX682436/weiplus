package com.tencent.mm.plugin.voip.model;

/* loaded from: classes7.dex */
public class PhotoSdkJni {
    static {
        fp.d0.o("wxPhotoSdk");
    }

    public static native byte[] DelPrivateExifInPicBuf(byte[] bArr);

    public static native int DelPrivateExifInPicFile(java.lang.String str, java.lang.String str2);
}
