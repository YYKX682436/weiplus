package zd1;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final zd1.u f471578a = new zd1.u();

    public final java.nio.ByteBuffer a(android.graphics.Bitmap bitmap, boolean z17) {
        kotlin.jvm.internal.o.g(bitmap, "<this>");
        int byteCount = bitmap.getByteCount() / 4;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        allocate.position(0);
        bitmap.copyPixelsToBuffer(allocate);
        allocate.position(0);
        int i17 = byteCount * 3;
        byte[] bArr = new byte[i17];
        kz5.x0 it = e06.p.m(0, byteCount).iterator();
        while (((e06.j) it).f246214f) {
            int b17 = it.b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = allocate.get(i19 + 0);
            bArr[i18 + 1] = allocate.get(i19 + 1);
            bArr[i18 + 2] = allocate.get(i19 + 2);
        }
        if (!z17) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
            wrap.order(java.nio.ByteOrder.nativeOrder());
            wrap.position(0);
            return wrap;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        allocateDirect.position(0);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }
}
