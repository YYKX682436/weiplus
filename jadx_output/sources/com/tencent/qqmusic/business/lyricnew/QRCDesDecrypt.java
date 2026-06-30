package com.tencent.qqmusic.business.lyricnew;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082 J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u0014"}, d2 = {"Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt;", "", "()V", "charToByte", "", "c", "", "decrypt", "", "content", "desDecrypt", "", "byteArray", "", "len", "hexStringToBytes", "hexString", "unZipByte", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Companion", "lib_singresource_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QRCDesDecrypt {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt.Companion INSTANCE = new com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt.Companion(null);
    private static final java.lang.String TAG = "QRCDesDecrypt";
    private static final jz5.g instance$delegate;
    private static boolean isLoadSuccess;
    private byte _hellAccFlag_;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt$Companion;", "", "Ljz5/f0;", "excludeLoadSo", "Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt;", "instance$delegate", "Ljz5/g;", "getInstance", "()Lcom/tencent/qqmusic/business/lyricnew/QRCDesDecrypt;", "instance", "", "TAG", "Ljava/lang/String;", "", "isLoadSuccess", "Z", "<init>", "()V", "lib_singresource_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final void excludeLoadSo() {
            com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt.isLoadSuccess = true;
        }

        public final com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt getInstance() {
            return (com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt) com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt.instance$delegate.getValue();
        }
    }

    static {
        try {
            if (!isLoadSuccess) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("desdecrypt");
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/qqmusic/business/lyricnew/QRCDesDecrypt", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/qqmusic/business/lyricnew/QRCDesDecrypt", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                isLoadSuccess = true;
            }
        } catch (java.lang.Throwable unused) {
        }
        instance$delegate = jz5.h.a(jz5.i.f302829d, com.tencent.qqmusic.business.lyricnew.QRCDesDecrypt$Companion$instance$2.INSTANCE);
    }

    public /* synthetic */ QRCDesDecrypt(kotlin.jvm.internal.i iVar) {
        this();
    }

    private final byte charToByte(char c17) {
        int i17;
        if ('0' <= c17 && c17 < ':') {
            i17 = c17 - '0';
        } else {
            char c18 = 'A';
            if (!('A' <= c17 && c17 < 'G')) {
                c18 = 'a';
                if (!('a' <= c17 && c17 < 'g')) {
                    return (byte) 0;
                }
            }
            i17 = (c17 - c18) + 10;
        }
        return (byte) i17;
    }

    private final native int desDecrypt(byte[] byteArray, int len);

    private final byte[] hexStringToBytes(java.lang.String hexString) {
        if (hexString == null || r26.n0.N(hexString)) {
            return null;
        }
        try {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            java.lang.String upperCase = hexString.toUpperCase(locale);
            kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
            int length = upperCase.length() / 2;
            char[] charArray = upperCase.toCharArray();
            kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
            byte[] bArr = new byte[length];
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = i17 * 2;
                bArr[i17] = (byte) (charToByte(charArray[i18 + 1]) | (charToByte(charArray[i18]) << 4));
            }
            return bArr;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v5 */
    private final byte[] unZipByte(byte[] data) {
        java.util.zip.Inflater inflater;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        try {
            if (data == 0) {
                return null;
            }
            try {
                inflater = new java.util.zip.Inflater();
            } catch (java.lang.Exception e17) {
                e = e17;
                byteArrayOutputStream = null;
                inflater = null;
            } catch (java.lang.Throwable th6) {
                inflater = null;
                th = th6;
                data = 0;
            }
            try {
                inflater.setInput(data);
                byteArrayOutputStream = new java.io.ByteArrayOutputStream(1);
                try {
                    byte[] bArr = new byte[1024];
                    while (!inflater.finished()) {
                        byteArrayOutputStream.write(bArr, 0, inflater.inflate(bArr));
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Exception e18) {
                        e18.toString();
                    }
                    try {
                        inflater.end();
                    } catch (java.lang.Exception e19) {
                        e19.toString();
                    }
                    return byteArray;
                } catch (java.lang.Exception e27) {
                    e = e27;
                    e.toString();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (java.lang.Exception e28) {
                            e28.toString();
                        }
                    }
                    if (inflater != null) {
                        try {
                            inflater.end();
                        } catch (java.lang.Exception e29) {
                            e29.toString();
                        }
                    }
                    return null;
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                byteArrayOutputStream = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                data = 0;
                if (data != 0) {
                    try {
                        data.close();
                    } catch (java.lang.Exception e38) {
                        e38.toString();
                    }
                }
                if (inflater == null) {
                    throw th;
                }
                try {
                    inflater.end();
                    throw th;
                } catch (java.lang.Exception e39) {
                    e39.toString();
                    throw th;
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    public final java.lang.String decrypt(java.lang.String content) {
        if (content == null || content.length() == 0) {
            return null;
        }
        try {
            byte[] hexStringToBytes = hexStringToBytes(content);
            if (hexStringToBytes == null || !isLoadSuccess) {
                return null;
            }
            desDecrypt(hexStringToBytes, hexStringToBytes.length);
            byte[] unZipByte = unZipByte(hexStringToBytes);
            if (unZipByte == null) {
                return null;
            }
            return new java.lang.String(unZipByte, r26.c.f368865a);
        } catch (java.lang.Error e17) {
            e17.toString();
            return null;
        } catch (java.lang.Exception e18) {
            e18.toString();
            return null;
        }
    }

    private QRCDesDecrypt() {
    }
}
