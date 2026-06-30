package kk;

/* loaded from: classes13.dex */
public abstract class y {
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x003c: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:46:0x003c */
    public static byte[] a(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream2;
        java.lang.Exception e17;
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        deflater.reset();
        deflater.setInput(bArr);
        deflater.finish();
        java.io.ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                try {
                    byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(bArr.length);
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (!deflater.finished()) {
                            byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
                        }
                        bArr = byteArrayOutputStream2.toByteArray();
                        try {
                            byteArrayOutputStream2.close();
                        } catch (java.io.IOException e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e18, "", new java.lang.Object[0]);
                        }
                    } catch (java.lang.Exception e19) {
                        e17 = e19;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e17, "", new java.lang.Object[0]);
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (java.io.IOException e27) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e27, "", new java.lang.Object[0]);
                            }
                        }
                        deflater.end();
                        return bArr;
                    } catch (java.lang.OutOfMemoryError unused) {
                        throw new java.lang.OutOfMemoryError("crash upload data length:" + bArr.length);
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.close();
                        } catch (java.io.IOException e28) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e28, "", new java.lang.Object[0]);
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Exception e29) {
                byteArrayOutputStream2 = null;
                e17 = e29;
            } catch (java.lang.OutOfMemoryError unused2) {
            }
            deflater.end();
            return bArr;
        } catch (java.lang.Throwable th7) {
            th = th7;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return c(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e17, "decompress failed", new java.lang.Object[0]);
            return bArr;
        }
    }

    public static byte[] c(byte[] bArr) {
        java.lang.Exception exc;
        fp.v vVar = new fp.v();
        vVar.reset();
        vVar.setInput(bArr);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
        try {
            try {
                byte[] bArr2 = new byte[1024];
                while (!vVar.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, vVar.inflate(bArr2));
                }
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e17, "", new java.lang.Object[0]);
                }
                exc = null;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e18, "exception when loop read byte", new java.lang.Object[0]);
                try {
                    byteArrayOutputStream.close();
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e19, "", new java.lang.Object[0]);
                }
                exc = e18;
            }
            vVar.end();
            if (exc == null) {
                return bArr;
            }
            throw new java.lang.Exception(exc);
        } catch (java.lang.Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Zlib", e27, "", new java.lang.Object[0]);
            }
            throw th6;
        }
    }
}
