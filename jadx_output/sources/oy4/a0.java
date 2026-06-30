package oy4;

/* loaded from: classes13.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public py4.b f350053a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350054b;

    public final oy4.z a(android.graphics.Bitmap bitmap) {
        try {
            java.lang.System.currentTimeMillis();
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            int length = array.length / 4;
            int i17 = length * 3;
            byte[] bArr = new byte[i17];
            java.util.Iterator it = e06.p.m(0, length).iterator();
            while (it.hasNext()) {
                int b17 = ((kz5.x0) it).b();
                int i18 = b17 * 3;
                int i19 = b17 * 4;
                bArr[i18] = array[i19];
                bArr[i18 + 1] = array[i19 + 1];
                bArr[i18 + 2] = array[i19 + 2];
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
            allocateDirect.put(bArr);
            java.lang.System.currentTimeMillis();
            return new oy4.z(allocateDirect, bitmap.getWidth(), bitmap.getHeight(), null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeOcrInstance", th6, "getImageBufferDataByBitmap exception", new java.lang.Object[0]);
            return null;
        }
    }
}
