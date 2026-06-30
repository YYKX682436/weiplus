package com.tencent.tavkit.utils;

/* loaded from: classes10.dex */
public class TAVBitmapUtils {
    public static int readImagePreferRotation(java.lang.String str) {
        try {
            int attributeInt = new android.media.ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 2;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 1;
            }
            return 3;
        } catch (java.io.IOException unused) {
            return 0;
        }
    }
}
