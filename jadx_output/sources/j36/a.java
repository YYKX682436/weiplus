package j36;

/* loaded from: classes13.dex */
public class a extends j36.m0 {
    public a() {
        this.f297540e = 256;
    }

    public byte[] i(long j17, long j18, int i17, int i18) {
        byte[] bArr = new byte[22];
        oicq.wlogin_sdk.tools.util.q(bArr, 0, 1);
        oicq.wlogin_sdk.tools.util.r(bArr, 2, 5);
        oicq.wlogin_sdk.tools.util.r(bArr, 6, (int) j17);
        oicq.wlogin_sdk.tools.util.r(bArr, 10, (int) j18);
        oicq.wlogin_sdk.tools.util.r(bArr, 14, i17);
        oicq.wlogin_sdk.tools.util.r(bArr, 18, i18);
        b(this.f297540e);
        a(bArr, 22);
        g();
        return c();
    }
}
