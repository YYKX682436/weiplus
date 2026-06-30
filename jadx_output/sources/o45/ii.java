package o45;

/* loaded from: classes12.dex */
public class ii extends o45.ah implements o45.yg {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f342962b;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f342966f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f342967g;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f342963c = null;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f342964d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f342965e = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f342961a = 7;

    public java.lang.String a() {
        byte[] bArr = this.f342964d;
        if (bArr == null) {
            return "";
        }
        if (this.f342963c == null) {
            byte[] aesDecrypt = com.tencent.mm.protocal.MMProtocalJni.aesDecrypt(this.f342962b, bArr);
            if (com.tencent.mm.sdk.platformtools.t8.M0(aesDecrypt)) {
                return "";
            }
            this.f342963c = new java.lang.String(aesDecrypt, o45.ji.f342972a);
        }
        return this.f342963c;
    }

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        if (bArr == null || bArr.length < 12) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dksynccheck err resp buf:");
            sb6.append(bArr == null ? -1 : bArr.length);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSyncCheck", sb6.toString());
            return -1;
        }
        this.f342961a = (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
        int i17 = (bArr[7] & 255) | ((bArr[6] & 255) << 8) | ((bArr[5] & 255) << 16) | ((bArr[4] & 255) << 24);
        int i18 = (bArr[11] & 255) | ((bArr[10] & 255) << 8) | ((bArr[9] & 255) << 16) | ((bArr[8] & 255) << 24);
        if (i17 == -3002) {
            if (i18 != bArr.length - 12 && i18 != (bArr.length - 12) - 16) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSyncCheck", " the key len is invalid keyLen:%d, bufLen:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bArr.length));
                return -1;
            }
            if (i18 == (bArr.length - 12) - 16) {
                byte[] bArr2 = new byte[16];
                this.f342964d = bArr2;
                java.lang.System.arraycopy(bArr, bArr.length - 16, bArr2, 0, 16);
            }
            byte[] bArr3 = new byte[i18];
            this.f342962b = bArr3;
            java.lang.System.arraycopy(bArr, 12, bArr3, 0, i18);
            return i17;
        }
        this.f342963c = "";
        int i19 = i18 + 12;
        if (bArr.length > i19) {
            this.f342965e = (bArr[i18 + 15] & 255) | ((bArr[i18 + 14] & 255) << 8) | ((bArr[i18 + 13] & 255) << 16) | ((bArr[i19] & 255) << 24);
            byte[] bArr4 = new byte[32];
            this.f342966f = bArr4;
            java.lang.System.arraycopy(bArr, i18 + 16, bArr4, 0, 32);
            int i27 = (bArr[i18 + 51] & 255) | ((bArr[i18 + 50] & 255) << 8) | ((bArr[i18 + 49] & 255) << 16) | ((bArr[i18 + 48] & 255) << 24);
            this.f342967g = new byte[0];
            if (i27 > 0) {
                byte[] bArr5 = new byte[i27];
                this.f342967g = bArr5;
                java.lang.System.arraycopy(bArr, i18 + 52, bArr5, 0, i27);
            }
        }
        return i17;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000205;
    }

    @Override // o45.ah, o45.yg
    public boolean isRawData() {
        return true;
    }
}
