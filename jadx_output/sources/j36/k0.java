package j36;

/* loaded from: classes13.dex */
public class k0 extends j36.m0 {
    public k0() {
        this.f297540e = 1;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        return this.f297538c < 20 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public byte[] i(long j17, byte[] bArr) {
        byte[] bArr2 = new byte[20];
        oicq.wlogin_sdk.tools.util.q(bArr2, 0, 1);
        oicq.wlogin_sdk.tools.util.r(bArr2, 2, oicq.wlogin_sdk.tools.util.o());
        oicq.wlogin_sdk.tools.util.r(bArr2, 6, (int) j17);
        oicq.wlogin_sdk.tools.util.t(bArr2, 10, java.lang.System.currentTimeMillis() / 1000);
        java.lang.System.arraycopy(bArr, 0, bArr2, 14, bArr.length);
        oicq.wlogin_sdk.tools.util.q(bArr2, bArr.length + 14, 0);
        b(this.f297540e);
        a(bArr2, 20);
        g();
        return c();
    }
}
