package e02;

/* loaded from: classes13.dex */
public abstract class o {
    public static byte[] a(com.tencent.mm.vfs.r6 r6Var) {
        android.util.Pair pair;
        java.lang.Throwable th6;
        java.io.RandomAccessFile randomAccessFile;
        if (r6Var == null) {
            return null;
        }
        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(r6Var.u(), false);
        if (r6Var.m() && r6Var.A()) {
            try {
                randomAccessFile = com.tencent.mm.vfs.w6.B(r6Var.u(), false);
                try {
                    pair = e02.e.e(randomAccessFile);
                    if (e02.p.c(randomAccessFile, ((java.lang.Long) pair.second).longValue())) {
                        throw new e02.d("ZIP64 APK not supported");
                    }
                    randomAccessFile.close();
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th6;
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                randomAccessFile = null;
            }
        } else {
            pair = null;
        }
        B.seek((((java.lang.Long) pair.second).longValue() + 22) - 2);
        byte[] bArr = new byte[2];
        B.readFully(bArr);
        int i17 = ((bArr[1] << 8) & 65280) + (bArr[0] & 255);
        if (i17 == 0) {
            B.close();
            return null;
        }
        byte[] bArr2 = new byte[i17];
        B.read(bArr2);
        B.close();
        return bArr2;
    }
}
