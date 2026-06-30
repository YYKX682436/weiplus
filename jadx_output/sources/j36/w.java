package j36;

/* loaded from: classes13.dex */
public class w extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297546f = 0;

    public w() {
        this.f297540e = 296;
    }

    public byte[] i(int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2) {
        int i28;
        int i29;
        if (bArr != null) {
            i28 = 32;
            if (bArr.length <= 32) {
                i28 = bArr.length;
            }
        } else {
            i28 = 0;
        }
        if (bArr2 != null) {
            i29 = 16;
            if (bArr2.length <= 16) {
                i29 = bArr2.length;
            }
        } else {
            i29 = 0;
        }
        int i37 = i28 + 11;
        int i38 = i37 + 2;
        int i39 = i38 + i29;
        int i47 = i39 + 2;
        this.f297546f = i47;
        byte[] bArr3 = new byte[i47];
        oicq.wlogin_sdk.tools.util.q(bArr3, 0, 0);
        bArr3[2] = (byte) (i17 >> 0);
        bArr3[3] = (byte) (i18 >> 0);
        bArr3[4] = (byte) (i19 >> 0);
        oicq.wlogin_sdk.tools.util.r(bArr3, 5, i27);
        oicq.wlogin_sdk.tools.util.q(bArr3, 9, i28);
        java.lang.System.arraycopy(bArr, 0, bArr3, 11, i28);
        oicq.wlogin_sdk.tools.util.q(bArr3, i37, i29);
        java.lang.System.arraycopy(bArr2, 0, bArr3, i38, i29);
        oicq.wlogin_sdk.tools.util.q(bArr3, i39, 0);
        b(this.f297540e);
        a(bArr3, this.f297546f);
        g();
        return c();
    }
}
