package wb;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f444343a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f444344b = null;

    public static boolean a(java.lang.String str, java.lang.String str2) {
        return new java.io.File(java.lang.String.valueOf(str2) + "/" + str).exists();
    }

    public static boolean b(java.lang.String str, java.lang.String[] strArr) {
        for (java.lang.String str2 : strArr) {
            if (str.compareTo(str2) == 0) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(java.lang.String.valueOf(str2) + "/" + str);
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            try {
                java.nio.MappedByteBuffer map = fileInputStream.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, file.length());
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(map);
                java.lang.String bigInteger = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
                try {
                    fileInputStream.close();
                    return bigInteger;
                } catch (java.io.IOException unused) {
                    return bigInteger;
                }
            } catch (java.io.IOException unused2) {
                return null;
            }
        } catch (java.lang.Exception unused3) {
            fileInputStream.close();
            return null;
        } catch (java.lang.Throwable th6) {
            try {
                fileInputStream.close();
            } catch (java.io.IOException unused4) {
            }
            throw th6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.nio.channels.FileChannel fileChannel;
        java.io.FileOutputStream fileOutputStream;
        java.nio.channels.FileChannel fileChannel2;
        java.nio.channels.FileChannel fileChannel3;
        java.io.FileInputStream fileInputStream;
        java.io.File file = new java.io.File(java.lang.String.valueOf(str2) + "/" + str);
        java.io.File file2 = new java.io.File(java.lang.String.valueOf(str3) + "/" + str);
        java.io.FileInputStream fileInputStream2 = null;
        r9 = null;
        java.nio.channels.FileChannel fileChannel4 = null;
        java.io.FileInputStream fileInputStream3 = null;
        try {
            fileInputStream = new java.io.FileInputStream(file);
            try {
                fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    fileChannel2 = fileInputStream.getChannel();
                } catch (java.io.IOException unused) {
                    fileChannel2 = null;
                    fileInputStream3 = fileInputStream;
                    fileChannel3 = fileChannel2;
                    try {
                        fileInputStream3.close();
                        fileChannel2.close();
                        fileOutputStream.close();
                        fileChannel3.close();
                    } catch (java.io.IOException unused2) {
                        return;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileChannel2 = null;
                    fileInputStream2 = fileInputStream;
                    fileChannel = fileChannel2;
                    try {
                        fileInputStream2.close();
                        fileChannel2.close();
                        fileOutputStream.close();
                        fileChannel.close();
                    } catch (java.io.IOException unused3) {
                    }
                    throw th;
                }
            } catch (java.io.IOException unused4) {
                fileOutputStream = null;
                fileChannel2 = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileOutputStream = null;
                fileChannel2 = 0;
            }
        } catch (java.io.IOException unused5) {
            fileChannel3 = null;
            fileOutputStream = null;
            fileChannel2 = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            fileChannel = null;
            fileOutputStream = null;
            fileChannel2 = null;
        }
        try {
            fileChannel4 = fileOutputStream.getChannel();
            fileChannel2.transferTo(0L, fileChannel2.size(), fileChannel4);
            try {
                fileInputStream.close();
                fileChannel2.close();
                fileOutputStream.close();
                fileChannel4.close();
            } catch (java.io.IOException unused6) {
            }
        } catch (java.io.IOException unused7) {
            fileChannel3 = fileChannel4;
            fileInputStream3 = fileInputStream;
            fileInputStream3.close();
            fileChannel2.close();
            fileOutputStream.close();
            fileChannel3.close();
        } catch (java.lang.Throwable th9) {
            th = th9;
            fileChannel = fileChannel4;
            fileInputStream2 = fileInputStream;
            fileInputStream2.close();
            fileChannel2.close();
            fileOutputStream.close();
            fileChannel.close();
            throw th;
        }
    }
}
