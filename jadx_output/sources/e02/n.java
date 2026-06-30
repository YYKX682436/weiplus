package e02;

/* loaded from: classes13.dex */
public abstract class n {
    public static java.util.Map a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        java.nio.ByteBuffer f17 = e02.e.f(byteBuffer, 8, byteBuffer.capacity() - 24);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i17 = 0;
        while (f17.hasRemaining()) {
            i17++;
            if (f17.remaining() < 8) {
                throw new e02.d("Insufficient data to read size of APK Signing Block entry #" + i17);
            }
            long j17 = f17.getLong();
            if (j17 < 4 || j17 > 2147483647L) {
                throw new e02.d("APK Signing Block entry #" + i17 + " size out of range: " + j17);
            }
            int i18 = (int) j17;
            int position = f17.position() + i18;
            if (i18 > f17.remaining()) {
                throw new e02.d("APK Signing Block entry #" + i17 + " size out of range: " + i18 + ", available: " + f17.remaining());
            }
            int i19 = f17.getInt();
            linkedHashMap.put(java.lang.Integer.valueOf(i19), e02.e.c(f17, i18 - 4));
            if (i19 == 1896449818) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Channel.V2SchemeUtil", "find V2 signature block Id : 1896449818");
            }
            f17.position(position);
        }
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap;
        }
        throw new e02.d("not have Id-Value Pair in APK Signing Block entry #" + i17);
    }

    public static java.nio.ByteBuffer b(com.tencent.mm.vfs.r6 r6Var) {
        java.io.RandomAccessFile randomAccessFile = null;
        if (r6Var == null || !r6Var.m() || !r6Var.A()) {
            return null;
        }
        try {
            java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(r6Var.u(), false);
            android.util.Pair e17 = e02.e.e(B);
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17.first;
            long longValue = ((java.lang.Long) e17.second).longValue();
            if (e02.p.c(B, longValue)) {
                throw new e02.d("ZIP64 APK not supported");
            }
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) e02.e.a(B, e02.e.d(byteBuffer, longValue)).first;
            B.close();
            return byteBuffer2;
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                randomAccessFile.close();
            }
            throw th6;
        }
    }
}
