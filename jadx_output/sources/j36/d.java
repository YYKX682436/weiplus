package j36;

/* loaded from: classes13.dex */
public class d extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297528f = 0;

    public d() {
        this.f297540e = 260;
    }

    public byte[] i(byte[] bArr) {
        int length = bArr.length;
        this.f297528f = length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        b(this.f297540e);
        a(bArr2, this.f297528f);
        g();
        return c();
    }
}
