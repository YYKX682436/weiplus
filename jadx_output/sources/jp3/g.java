package jp3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final jp3.g f301000a = new jp3.g();

    public static /* synthetic */ void c(jp3.g gVar, android.app.Activity activity, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i18, java.lang.Object obj) {
        gVar.b(activity, i17, str, (i18 & 8) != 0 ? null : str2, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? null : str4, (i18 & 64) != 0 ? null : str5, (i18 & 128) != 0 ? null : str6, (i18 & 256) != 0 ? null : str7, (i18 & 512) != 0 ? null : str8);
    }

    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, path is empty!");
            return;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, file is not exits, path: " + str + '!');
    }

    public final void b(android.app.Activity activity, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        ((ku5.t0) ku5.t0.f312615d).B(new jp3.e(i17, str, activity, str2, str3, str4, str5, str6, str7, str8));
    }

    public final jz5.l d(byte[] bArr) {
        if (!(bArr == null)) {
            if (!(bArr.length == 0)) {
                byte[] randomBytes = com.tenpay.ndk.WxSmCryptoUtil.getInstance().randomBytes(16);
                byte[] randomBytes2 = com.tenpay.ndk.WxSmCryptoUtil.getInstance().randomBytes(12);
                if (!(randomBytes == null)) {
                    if (!(randomBytes2 == null)) {
                        byte[][] sm4GcmEncrypt = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm4GcmEncrypt(bArr, randomBytes, randomBytes2, new byte[0]);
                        int lastError = com.tenpay.ndk.WxSmCryptoUtil.getInstance().getLastError();
                        if ((sm4GcmEncrypt == null) || sm4GcmEncrypt.length < 2 || lastError != 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] sm4GcmEncrypt failed, errorCode: " + lastError);
                            return null;
                        }
                        byte[] bArr2 = sm4GcmEncrypt[0];
                        byte[] bArr3 = sm4GcmEncrypt[1];
                        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] sm4GcmEncrypt suc, cipher.len: " + bArr2.length + ", tag.len: " + bArr3.length);
                        byte[] bArr4 = new byte[randomBytes2.length + bArr2.length + bArr3.length];
                        java.lang.System.arraycopy(randomBytes2, 0, bArr4, 0, randomBytes2.length);
                        java.lang.System.arraycopy(bArr2, 0, bArr4, randomBytes2.length, bArr2.length);
                        java.lang.System.arraycopy(bArr3, 0, bArr4, randomBytes2.length + bArr2.length, bArr3.length);
                        return new jz5.l(bArr4, randomBytes);
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] generate random key or iv fail");
                return null;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] data is null or empty");
        return null;
    }

    public final r45.s45 e(kp3.h hVar, java.lang.String str) {
        byte[] N;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[getCdnPalmFile] error, registerResult is null");
            return null;
        }
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PalmPrintHelper", "[getCdnPalmFile] warning, videoPath is isNullOrBlank");
            N = null;
        } else {
            N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        }
        r45.s45 s45Var = new r45.s45();
        jp3.g gVar = f301000a;
        com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult = hVar.f310993b;
        s45Var.set(0, gVar.h(imageDataResult != null ? imageDataResult.data : null));
        s45Var.set(1, gVar.h(N));
        com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult2 = hVar.f310994c;
        s45Var.set(2, gVar.h(imageDataResult2 != null ? imageDataResult2.data : null));
        s45Var.set(3, hVar.f310992a);
        return s45Var;
    }

    public final java.lang.String f(byte[] bArr, java.lang.String str) {
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                if (!(str == null || str.length() == 0)) {
                    byte[] sm2Encrypt = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm2Encrypt(bArr, com.tencent.mm.sdk.platformtools.t8.h(str));
                    int lastError = com.tenpay.ndk.WxSmCryptoUtil.getInstance().getLastError();
                    if (sm2Encrypt == null || lastError != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "getEncryptKey failed, sm2Encrypt errorCode: " + lastError);
                        return "";
                    }
                    java.lang.String encodeToString = android.util.Base64.encodeToString(sm2Encrypt, 2);
                    if (encodeToString != null && encodeToString.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        return encodeToString;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "getEncryptKey failed：base64 failed");
                    return "";
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "getEncryptKey failed, data or publicKey is null or empty!");
        return "";
    }

    public final java.lang.String g(byte[] bArr, java.lang.String str) {
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    try {
                        if (com.tencent.mm.vfs.w6.j(str)) {
                            com.tencent.mm.vfs.w6.h(str);
                        }
                        com.tencent.mm.plugin.facedetect.model.s0.l(bArr, str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintHelper", "[saveDataToFile] path: " + str + ", fileSize: " + com.tencent.mm.vfs.w6.k(str));
                        return str;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[saveDataToFile] error, msg：" + e17.getMessage());
                        return "";
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintHelper", "[saveDataToFile] error, data or path is empty!");
        return "";
    }

    public final com.tencent.mm.protobuf.g h(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mm.protobuf.g DEFAULT_INSTANCE = com.tencent.mm.protobuf.g.f192155b;
            kotlin.jvm.internal.o.f(DEFAULT_INSTANCE, "DEFAULT_INSTANCE");
            return DEFAULT_INSTANCE;
        }
        if (!(bArr.length == 0)) {
            return com.tencent.mm.protobuf.g.b(bArr);
        }
        com.tencent.mm.protobuf.g DEFAULT_INSTANCE2 = com.tencent.mm.protobuf.g.f192155b;
        kotlin.jvm.internal.o.f(DEFAULT_INSTANCE2, "DEFAULT_INSTANCE");
        return DEFAULT_INSTANCE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0220 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.app.Activity r18, int r19, java.lang.String r20, kp3.h r21, kp3.g r22) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp3.g.i(android.app.Activity, int, java.lang.String, kp3.h, kp3.g):void");
    }
}
