package j36;

/* loaded from: classes13.dex */
public class o extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297541f = 0;

    public o() {
        this.f297540e = 278;
    }

    public byte[] i(int i17, int i18, long[] jArr) {
        long[] jArr2 = jArr == null ? new long[0] : (long[]) jArr.clone();
        int i19 = 10;
        int length = (jArr2.length * 4) + 10;
        this.f297541f = length;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) 0;
        oicq.wlogin_sdk.tools.util.r(bArr, 1, i17);
        oicq.wlogin_sdk.tools.util.r(bArr, 5, i18);
        bArr[9] = (byte) (jArr2.length >> 0);
        for (long j17 : jArr2) {
            oicq.wlogin_sdk.tools.util.r(bArr, i19, (int) j17);
            i19 += 4;
        }
        b(this.f297540e);
        a(bArr, this.f297541f);
        g();
        return c();
    }
}
