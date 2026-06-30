package j36;

/* loaded from: classes13.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f297536a = 128;

    /* renamed from: b, reason: collision with root package name */
    public int f297537b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f297538c = 0;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f297539d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    public int f297540e = 0;

    public void a(byte[] bArr, int i17) {
        if (i17 > this.f297536a - 4) {
            int i18 = i17 + 4 + 64;
            this.f297536a = i18;
            byte[] bArr2 = new byte[i18];
            java.lang.System.arraycopy(this.f297539d, 0, bArr2, 0, this.f297537b);
            this.f297539d = bArr2;
        }
        this.f297538c = i17;
        java.lang.System.arraycopy(bArr, 0, this.f297539d, this.f297537b, i17);
        this.f297537b += i17;
    }

    public void b(int i17) {
        oicq.wlogin_sdk.tools.util.q(this.f297539d, this.f297537b, i17);
        int i18 = this.f297537b + 2;
        this.f297537b = i18;
        oicq.wlogin_sdk.tools.util.q(this.f297539d, i18, 0);
        this.f297537b += 2;
    }

    public byte[] c() {
        int i17 = this.f297537b;
        byte[] bArr = new byte[i17];
        java.lang.System.arraycopy(this.f297539d, 0, bArr, 0, i17);
        return bArr;
    }

    public byte[] d() {
        int i17 = this.f297538c;
        byte[] bArr = new byte[i17];
        java.lang.System.arraycopy(this.f297539d, 4, bArr, 0, i17);
        return bArr;
    }

    public int e(byte[] bArr, int i17, int i18) {
        int i19;
        int f17 = f(bArr, i17, i18, this.f297540e);
        if (f17 < 0 || 4 >= (i19 = i18 - (f17 - i17))) {
            return -1;
        }
        int f18 = oicq.wlogin_sdk.tools.util.f(bArr, f17 + 2);
        this.f297538c = f18;
        int i27 = f18 + 4;
        if (i27 > i19) {
            return -1;
        }
        if (i27 > this.f297536a) {
            int i28 = i27 + 128;
            this.f297536a = i28;
            this.f297539d = new byte[i28];
        }
        this.f297537b = i27;
        java.lang.System.arraycopy(bArr, f17, this.f297539d, 0, i27);
        this.f297540e = oicq.wlogin_sdk.tools.util.f(bArr, f17);
        this.f297538c = i27 - 4;
        if (h().booleanValue()) {
            return f17 + 4 + this.f297538c;
        }
        return -1005;
    }

    public int f(byte[] bArr, int i17, int i18, int i19) {
        int length = bArr.length;
        while (i17 < length) {
            int i27 = i17 + 2;
            if (i27 > length) {
                break;
            }
            if (oicq.wlogin_sdk.tools.util.f(bArr, i17) == i19) {
                return i17;
            }
            if (i27 + 2 > length) {
                break;
            }
            i17 = oicq.wlogin_sdk.tools.util.f(bArr, i27) + 2 + i27;
        }
        return -1;
    }

    public void g() {
        oicq.wlogin_sdk.tools.util.q(this.f297539d, 2, this.f297537b - 4);
    }

    public java.lang.Boolean h() {
        return java.lang.Boolean.TRUE;
    }
}
