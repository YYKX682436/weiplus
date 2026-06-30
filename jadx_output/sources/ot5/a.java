package ot5;

/* loaded from: classes12.dex */
public abstract class a {
    public static byte[] a(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream);
        try {
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    deflaterOutputStream.close();
                } catch (java.io.IOException unused) {
                }
                return byteArray;
            } catch (java.lang.Exception e17) {
                ot5.g.d("CompressUtil", "deflater(), exception: " + e17);
                try {
                    byteArrayOutputStream.close();
                    deflaterOutputStream.close();
                    return null;
                } catch (java.io.IOException unused2) {
                    return null;
                }
            }
        } catch (java.lang.Throwable th6) {
            try {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
            } catch (java.io.IOException unused3) {
            }
            throw th6;
        }
    }
}
