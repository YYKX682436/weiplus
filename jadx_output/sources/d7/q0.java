package d7;

/* loaded from: classes13.dex */
public class q0 implements t6.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f226833a = java.nio.ByteBuffer.allocate(8);

    @Override // t6.j
    public void a(byte[] bArr, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        java.lang.Long l17 = (java.lang.Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f226833a) {
            this.f226833a.position(0);
            messageDigest.update(this.f226833a.putLong(l17.longValue()).array());
        }
    }
}
