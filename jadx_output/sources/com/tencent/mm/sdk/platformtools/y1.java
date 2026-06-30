package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public abstract class y1 {
    public static java.lang.String a(java.lang.String str) {
        byte[] N;
        java.lang.String str2;
        if (str == null || str.equals("") || (N = com.tencent.mm.vfs.w6.N(str, 0, 2)) == 0 || N.length < 2) {
            return "";
        }
        int i17 = N[0];
        if (i17 < 0) {
            i17 += 256;
        }
        int i18 = N[1];
        if (i18 < 0) {
            i18 += 256;
        }
        if (i17 == 66 && i18 == 77) {
            str2 = ".bmp";
        } else {
            if (i17 != 255 || i18 != 216) {
                if (i17 == 137 && i18 == 80) {
                    str2 = ".png";
                } else if (i17 == 71 && i18 == 73) {
                    str2 = ".gif";
                }
            }
            str2 = com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        }
        return str2;
    }

    public static boolean b(android.content.Context context, int i17) {
        try {
            java.io.InputStream openRawResource = context.getResources().openRawResource(i17);
            java.lang.String str = "";
            for (int i18 = 0; i18 < 6; i18++) {
                try {
                    str = str + ((char) openRawResource.read());
                } catch (java.io.IOException unused) {
                    return false;
                }
            }
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (java.io.IOException unused2) {
                }
            }
            return str.startsWith("GIF");
        } catch (java.lang.Exception unused3) {
            return false;
        }
    }

    public static boolean c(java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            inputStream = com.tencent.mm.vfs.w6.E(str);
            byte[] bArr = new byte[6];
            java.lang.String str2 = "";
            inputStream.read(bArr);
            for (int i17 = 0; i17 < 6; i17++) {
                str2 = str2 + ((char) bArr[i17]);
            }
            if (!str2.startsWith("GIF")) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused) {
                }
                return false;
            }
            try {
                inputStream.close();
                return true;
            } catch (java.io.IOException unused2) {
                return true;
            }
        } catch (java.lang.Exception unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused5) {
                }
            }
            throw th6;
        }
    }

    public static boolean d(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.lang.String str = "";
        for (int i17 = 0; i17 < 6; i17++) {
            try {
                str = str + ((char) byteArrayInputStream.read());
            } catch (java.io.IOException unused) {
                return false;
            }
        }
        try {
            byteArrayInputStream.close();
        } catch (java.io.IOException unused2) {
        }
        return str.startsWith("GIF");
    }

    public static boolean e(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b17 = bArr[1];
            if (b17 == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return true;
            }
            byte b18 = bArr[0];
            if (b18 == 71 && b17 == 73 && bArr[2] == 70) {
                return true;
            }
            if (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) {
                return true;
            }
            if (b18 == 119 && b17 == 120 && bArr[2] == 103 && bArr[3] == 102) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(java.lang.String str) {
        boolean z17 = false;
        if (str == null || str.length() < 3 || !com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgUtil", "isImgFile, invalid argument");
            return false;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.io.InputStream inputStream = null;
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(str);
            try {
                com.tencent.mm.graphics.e.g(E, null, options);
                if (options.outWidth > 0) {
                    if (options.outHeight > 0) {
                        z17 = true;
                    }
                }
                com.tencent.mm.sdk.platformtools.t8.v1(E);
                return z17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream = E;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImgUtil", th, "unexpected exception.", new java.lang.Object[0]);
                    return false;
                } finally {
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static boolean g(java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            inputStream = com.tencent.mm.vfs.w6.E(str);
            byte[] bArr = new byte[8];
            java.lang.String str2 = "";
            inputStream.read(bArr);
            for (int i17 = 0; i17 < 8; i17++) {
                str2 = str2 + ((char) bArr[i17]);
            }
            if (!str2.startsWith("wxgf")) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused) {
                }
                return false;
            }
            try {
                inputStream.close();
                return true;
            } catch (java.io.IOException unused2) {
                return true;
            }
        } catch (java.lang.Exception unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused5) {
                }
            }
            throw th6;
        }
    }

    public static boolean h(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.lang.String str = "";
        for (int i17 = 0; i17 < 8; i17++) {
            try {
                str = str + ((char) byteArrayInputStream.read());
            } catch (java.io.IOException unused) {
                return false;
            }
        }
        try {
            byteArrayInputStream.close();
        } catch (java.io.IOException unused2) {
        }
        return str.startsWith("wxgf");
    }
}
