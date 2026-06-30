package j36;

/* loaded from: classes13.dex */
public class d0 extends j36.m0 {
    public d0() {
        this.f297540e = 325;
    }

    public byte[] i(byte[] bArr) {
        int length = bArr != null ? bArr.length + 0 : 0;
        byte[] bArr2 = new byte[length];
        if (length > 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        b(this.f297540e);
        a(bArr2, length);
        g();
        return c();
    }
}
