package org.chromium.url;

@org.chromium.base.annotations.JNINamespace("url::android")
/* loaded from: classes16.dex */
public class IDNStringUtil {
    private static java.lang.String idnToASCII(java.lang.String str) {
        try {
            return java.net.IDN.toASCII(str, 2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
