package fm0;

/* loaded from: classes13.dex */
public abstract class a {
    public static byte[] a(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(bArr.length);
            try {
                deflater.setLevel(9);
                deflater.setInput(bArr);
                deflater.finish();
                byte[] bArr2 = new byte[1024];
                while (!deflater.finished()) {
                    byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
                }
                deflater.end();
                try {
                    byteArrayOutputStream2.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Kara.ZipUtil", e17, "", new java.lang.Object[0]);
                }
                return byteArrayOutputStream2.toByteArray();
            } catch (java.lang.Throwable th6) {
                th = th6;
                byteArrayOutputStream = byteArrayOutputStream2;
                deflater.end();
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("Kara.ZipUtil", e18, "", new java.lang.Object[0]);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
