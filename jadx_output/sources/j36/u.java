package j36;

/* loaded from: classes13.dex */
public class u extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297543f = 0;

    public u() {
        this.f297540e = 292;
    }

    public byte[] i(byte[] bArr, byte[] bArr2, int i17, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i18;
        int i19 = 16;
        int length = bArr != null ? bArr.length > 16 ? 16 : bArr.length : 0;
        int length2 = bArr2 != null ? bArr2.length > 16 ? 16 : bArr2.length : 0;
        int length3 = bArr3 != null ? bArr3.length > 16 ? 16 : bArr3.length : 0;
        if (bArr4 != null) {
            i18 = 32;
            if (bArr4.length <= 32) {
                i18 = bArr4.length;
            }
        } else {
            i18 = 0;
        }
        if (bArr5 == null) {
            i19 = 0;
        } else if (bArr5.length <= 16) {
            i19 = bArr5.length;
        }
        int i27 = length + 2;
        int i28 = i27 + 2;
        int i29 = i28 + length2;
        int i37 = i29 + 2;
        int i38 = i37 + 2;
        int i39 = i38 + length3;
        int i47 = i39 + 2;
        int i48 = i47 + i18;
        int i49 = i48 + 2;
        int i57 = i49 + i19;
        this.f297543f = i57;
        byte[] bArr6 = new byte[i57];
        oicq.wlogin_sdk.tools.util.q(bArr6, 0, length);
        java.lang.System.arraycopy(bArr, 0, bArr6, 2, length);
        oicq.wlogin_sdk.tools.util.q(bArr6, i27, length2);
        java.lang.System.arraycopy(bArr2, 0, bArr6, i28, length2);
        oicq.wlogin_sdk.tools.util.q(bArr6, i29, i17);
        oicq.wlogin_sdk.tools.util.q(bArr6, i37, length3);
        java.lang.System.arraycopy(bArr3, 0, bArr6, i38, length3);
        oicq.wlogin_sdk.tools.util.q(bArr6, i39, i18);
        java.lang.System.arraycopy(bArr4, 0, bArr6, i47, i18);
        oicq.wlogin_sdk.tools.util.q(bArr6, i48, i19);
        java.lang.System.arraycopy(bArr5, 0, bArr6, i49, i19);
        b(this.f297540e);
        a(bArr6, this.f297543f);
        g();
        return c();
    }
}
