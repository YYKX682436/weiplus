package j36;

/* loaded from: classes13.dex */
public class a0 extends j36.m0 {
    public a0() {
        this.f297540e = 322;
    }

    public byte[] i(byte[] bArr) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        oicq.wlogin_sdk.tools.util.q(bArr2, 0, 0);
        oicq.wlogin_sdk.tools.util.q(bArr2, 2, bArr.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        b(this.f297540e);
        a(bArr2, length);
        g();
        return c();
    }
}
