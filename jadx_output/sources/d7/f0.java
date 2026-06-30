package d7;

/* loaded from: classes13.dex */
public final class f0 implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final d7.d f226803a = new d7.d();

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        java.util.concurrent.atomic.AtomicReference atomicReference = q7.c.f360290a;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16384);
        java.util.concurrent.atomic.AtomicReference atomicReference2 = q7.c.f360290a;
        byte[] bArr = (byte[]) atomicReference2.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                atomicReference2.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f226803a.a(android.graphics.ImageDecoder.createSource((java.nio.ByteBuffer) java.nio.ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i17, i18, lVar);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // t6.n
    public /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, t6.l lVar) {
        return true;
    }
}
