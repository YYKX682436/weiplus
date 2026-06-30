package kk;

/* loaded from: classes7.dex */
public abstract class k {
    public static java.lang.String a(com.tencent.mm.vfs.r6 r6Var) {
        return b(r6Var, 102400);
    }

    public static java.lang.String b(com.tencent.mm.vfs.r6 r6Var, int i17) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        if (r6Var != null && i17 > 0 && r6Var.m()) {
            try {
                inputStream = com.tencent.mm.vfs.w6.C(r6Var);
                long j17 = i17;
                try {
                    if (j17 > r6Var.C()) {
                        j17 = r6Var.C();
                    }
                    java.lang.String c17 = c(inputStream, (int) j17);
                    inputStream.close();
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                    return c17;
                } catch (java.lang.Exception unused2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused5) {
                inputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return null;
    }

    public static final java.lang.String c(java.io.InputStream inputStream, int i17) {
        int i18;
        if (inputStream != null && i17 > 0) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
                byte[] bArr = new byte[i17];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                for (byte b17 : messageDigest.digest()) {
                    sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
                }
                return sb6.toString();
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static final java.lang.String d(java.io.InputStream inputStream, int i17, int i18, int i19) {
        if (inputStream == null || i17 <= 0 || i18 < 0 || i19 <= 0) {
            return null;
        }
        long j17 = i18;
        try {
            if (inputStream.skip(j17) < j17) {
                return null;
            }
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
            byte[] bArr = new byte[i17];
            int i27 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1 || i27 >= i19) {
                    break;
                }
                int i28 = i27 + read;
                if (i28 <= i19) {
                    messageDigest.update(bArr, 0, read);
                    i27 = i28;
                } else {
                    messageDigest.update(bArr, 0, i19 - i27);
                    i27 = i19;
                }
            }
            for (byte b17 : messageDigest.digest()) {
                sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
            }
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String e(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            return b(r6Var, 102400);
        }
        return null;
    }

    public static java.lang.String f(java.lang.String str, int i17, int i18) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        if (str == null) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.m() || i17 < 0 || i18 <= 0) {
            return null;
        }
        try {
            inputStream = com.tencent.mm.vfs.w6.C(r6Var);
            try {
                java.lang.String d17 = d(inputStream, 102400, i17, i18);
                inputStream.close();
                try {
                    inputStream.close();
                } catch (java.io.IOException unused) {
                }
                return d17;
            } catch (java.lang.Exception unused2) {
                if (inputStream == null) {
                    return null;
                }
                try {
                    inputStream.close();
                    return null;
                } catch (java.io.IOException unused3) {
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused5) {
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static final java.lang.String g(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i17 = 0;
            for (byte b17 : digest) {
                int i18 = i17 + 1;
                cArr2[i17] = cArr[(b17 >>> 4) & 15];
                i17 = i18 + 1;
                cArr2[i18] = cArr[b17 & 15];
            }
            return new java.lang.String(cArr2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final byte[] h(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
