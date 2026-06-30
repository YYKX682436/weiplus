package j36;

/* loaded from: classes13.dex */
public class c0 extends j36.m0 {
    public c0() {
        this.f297540e = com.tencent.mm.plugin.appbrand.jsapi.q3.CTRL_INDEX;
    }

    public byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i17;
        int i18;
        if (bArr != null) {
            i17 = bArr.length + 0;
            i18 = 1;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (bArr2 != null) {
            i17 += bArr2.length;
            i18++;
        }
        if (bArr3 != null) {
            i17 += bArr3.length;
            i18++;
        }
        if (bArr4 != null) {
            i17 += bArr4.length;
            i18++;
        }
        int i19 = 2;
        int i27 = i17 + 2;
        byte[] bArr6 = new byte[i27];
        oicq.wlogin_sdk.tools.util.q(bArr6, 0, i18);
        if (bArr != null) {
            java.lang.System.arraycopy(bArr, 0, bArr6, 2, bArr.length);
            i19 = 2 + bArr.length;
        }
        if (bArr2 != null) {
            java.lang.System.arraycopy(bArr2, 0, bArr6, i19, bArr2.length);
            i19 += bArr2.length;
        }
        if (bArr3 != null) {
            java.lang.System.arraycopy(bArr3, 0, bArr6, i19, bArr3.length);
            i19 += bArr3.length;
        }
        if (bArr4 != null) {
            java.lang.System.arraycopy(bArr4, 0, bArr6, i19, bArr4.length);
        }
        byte[] b17 = k36.e.b(bArr6, 0, i27, bArr5);
        int length = b17.length;
        b(this.f297540e);
        a(b17, b17.length);
        g();
        return c();
    }
}
