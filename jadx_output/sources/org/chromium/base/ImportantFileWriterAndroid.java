package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes16.dex */
public class ImportantFileWriterAndroid {

    /* loaded from: classes16.dex */
    public interface Natives {
        boolean writeFileAtomically(java.lang.String str, byte[] bArr);
    }

    public static boolean writeFileAtomically(java.lang.String str, byte[] bArr) {
        return org.chromium.base.ImportantFileWriterAndroidJni.get().writeFileAtomically(str, bArr);
    }
}
