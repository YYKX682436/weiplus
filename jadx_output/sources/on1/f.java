package on1;

/* loaded from: classes12.dex */
public abstract class f {
    public static void a(byte[] bArr, int i17, short s17, com.tencent.mm.pointers.PByteArray pByteArray, int i18) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.io.IOException e17) {
                e = e17;
            }
            try {
                byteArrayOutputStream.write("GSMW".getBytes());
                byteArrayOutputStream.write(kk.u.d(i17));
                byteArrayOutputStream.write(new byte[]{0, 1});
                byteArrayOutputStream.write(new byte[]{(byte) ((s17 >> 8) & 255), (byte) (s17 & 255)});
                if (s17 != 1 && s17 != 2) {
                    bArr = kk.p.b(bArr, kn1.f.f309602h);
                }
                byteArrayOutputStream.write(kk.u.d(bArr.length + 20));
                byteArrayOutputStream.write(kk.u.d(0));
                byteArrayOutputStream.write(bArr);
                pByteArray.value = byteArrayOutputStream.toByteArray();
                if (i18 != 1) {
                    byteArrayOutputStream.reset();
                    byteArrayOutputStream.close();
                }
                java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                crc32.update(pByteArray.value);
                java.lang.System.arraycopy(kk.u.d((int) crc32.getValue()), 0, pByteArray.value, 16, 4);
                byteArrayOutputStream.reset();
                byteArrayOutputStream.close();
            } catch (java.io.IOException e18) {
                e = e18;
                byteArrayOutputStream2 = byteArrayOutputStream;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPacker", e, "BackupPacker pack err.", new java.lang.Object[0]);
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.reset();
                    byteArrayOutputStream2.close();
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.reset();
                        byteArrayOutputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException unused2) {
        }
    }
}
