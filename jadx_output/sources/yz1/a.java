package yz1;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f468490a;

    /* renamed from: b, reason: collision with root package name */
    public byte f468491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f468492c;

    /* renamed from: d, reason: collision with root package name */
    public long f468493d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f468494e;

    public static byte a(java.io.InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    public void b(java.io.BufferedOutputStream bufferedOutputStream) {
        bufferedOutputStream.write((byte) ((this.f468490a ? (byte) 128 : (byte) 0) | (this.f468491b & 15)));
        long j17 = this.f468493d;
        byte[] bArr = j17 <= 125 ? new byte[]{(byte) j17} : j17 <= 65535 ? new byte[]{126, (byte) ((j17 >> 8) & 255), (byte) (j17 & 255)} : new byte[]{Byte.MAX_VALUE, (byte) ((j17 >> 56) & 255), (byte) ((j17 >> 48) & 255), (byte) ((j17 >> 40) & 255), (byte) ((j17 >> 32) & 255), (byte) ((j17 >> 24) & 255), (byte) ((j17 >> 16) & 255), (byte) ((j17 >> 8) & 255), (byte) (j17 & 255)};
        if (this.f468492c) {
            bArr[0] = (byte) (128 | bArr[0]);
        }
        bufferedOutputStream.write(bArr, 0, bArr.length);
        if (this.f468492c) {
            throw new java.lang.UnsupportedOperationException("Writing masked data not implemented");
        }
        bufferedOutputStream.write(this.f468494e, 0, (int) this.f468493d);
    }
}
