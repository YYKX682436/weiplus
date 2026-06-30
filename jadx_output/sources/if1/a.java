package if1;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.lang.String[] a(java.lang.String[] strArr) {
        byte[] bArr;
        java.lang.String[] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            java.lang.String str = strArr[i17];
            if (str == null || !str.startsWith("data:image/")) {
                strArr2[i17] = strArr[i17];
            } else {
                java.lang.String str2 = strArr[i17];
                java.lang.String str3 = "";
                if (!android.text.TextUtils.isEmpty(str2)) {
                    java.lang.String trim = str2.substring(str2.indexOf("base64,") + 7).trim();
                    java.io.OutputStream outputStream = null;
                    try {
                        bArr = android.util.Base64.decode(trim, 0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("", e17, "writeToFile", new java.lang.Object[0]);
                        bArr = null;
                    }
                    if (bArr != null && bArr.length != 0) {
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "preview_" + java.lang.System.currentTimeMillis() + "_" + trim.hashCode());
                        try {
                            outputStream = com.tencent.mm.vfs.w6.H(r6Var);
                            outputStream.write(bArr);
                            try {
                                outputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                            str3 = r6Var.o();
                        } catch (java.lang.Exception unused2) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException unused4) {
                                }
                            }
                            throw th6;
                        }
                    }
                }
                strArr2[i17] = str3;
            }
        }
        return strArr2;
    }

    public static java.lang.String[] b(java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            java.lang.String str2 = strArr[i17];
            if (str2 != null && (str = strArr2[i17]) != null && !str2.equals(str)) {
                arrayList.add(strArr[i17]);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}
