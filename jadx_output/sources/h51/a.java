package h51;

/* loaded from: classes12.dex */
public class a extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f279014d;

    public a(java.io.OutputStream outputStream) {
        super(outputStream);
        this.f279014d = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        this.f279014d++;
        ((java.io.FilterOutputStream) this).out.write(i17);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f279014d += bArr.length;
        ((java.io.FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        this.f279014d += i18;
        ((java.io.FilterOutputStream) this).out.write(bArr, i17, i18);
    }
}
