package j36;

/* loaded from: classes13.dex */
public class j0 extends j36.m0 {
    public j0() {
        this.f297540e = 24;
    }

    public byte[] i(long j17, int i17, long j18, int i18) {
        byte[] bArr = new byte[22];
        oicq.wlogin_sdk.tools.util.q(bArr, 0, 1);
        oicq.wlogin_sdk.tools.util.r(bArr, 2, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX);
        oicq.wlogin_sdk.tools.util.r(bArr, 6, (int) j17);
        oicq.wlogin_sdk.tools.util.r(bArr, 10, i17);
        oicq.wlogin_sdk.tools.util.r(bArr, 14, (int) j18);
        oicq.wlogin_sdk.tools.util.q(bArr, 18, i18);
        oicq.wlogin_sdk.tools.util.q(bArr, 20, 0);
        b(this.f297540e);
        a(bArr, 22);
        g();
        return c();
    }
}
