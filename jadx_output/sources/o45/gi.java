package o45;

/* loaded from: classes12.dex */
public class gi extends o45.zg implements o45.xg {

    /* renamed from: b, reason: collision with root package name */
    public int f342936b;

    /* renamed from: c, reason: collision with root package name */
    public int f342937c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f342939e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f342940f;

    /* renamed from: g, reason: collision with root package name */
    public int f342941g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f342942h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f342935a = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public int f342938d = 0;

    @Override // o45.zg
    public int getCmdId() {
        return 205;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 0;
    }

    @Override // o45.zg
    public boolean getShortSupport() {
        return false;
    }

    @Override // o45.zg, o45.xg
    public boolean isRawData() {
        return true;
    }

    @Override // o45.zg
    public void setUin(int i17) {
        this.f342938d = i17;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        int i17;
        byte[] bArr;
        byte[] bArr2 = this.f342935a;
        if (bArr2 != null) {
            int length = bArr2.length;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (this.f342938d == 0 || com.tencent.mm.sdk.platformtools.t8.M0(this.f342935a)) {
            return new byte[0];
        }
        int i18 = this.f342938d;
        byte[] bArr3 = this.f342935a;
        int length2 = (((i18 >> 13) & 524287) | (bArr3.length << 19)) ^ 1442968193;
        int length3 = ((i18 << 19) | (524287 & (bArr3.length >> 13))) ^ 1442968193;
        byte[] bArr4 = new byte[bArr3.length + 32];
        byte[] bArr5 = this.f342940f;
        if (bArr5 == null || bArr5.length != 32) {
            i17 = 0;
        } else {
            int i19 = this.f342941g;
            i17 = i19 + 36;
            bArr4 = new byte[bArr3.length + 32 + 32 + 4 + i19];
        }
        int length4 = this.f342935a.length;
        bArr4[0] = (byte) ((length2 >> 24) & 255);
        bArr4[1] = (byte) ((length2 >> 16) & 255);
        bArr4[2] = (byte) ((length2 >> 8) & 255);
        bArr4[3] = (byte) (length2 & 255);
        bArr4[4] = (byte) ((length3 >> 24) & 255);
        bArr4[5] = (byte) ((length3 >> 16) & 255);
        bArr4[6] = (byte) ((length3 >> 8) & 255);
        bArr4[7] = (byte) (length3 & 255);
        byte[] bArr6 = this.f342935a;
        java.lang.System.arraycopy(bArr6, 0, bArr4, 8, bArr6.length);
        int i27 = o45.wf.f343029g;
        bArr4[(bArr4.length - 24) - i17] = (byte) ((i27 >> 24) & 255);
        bArr4[(bArr4.length - 23) - i17] = (byte) ((i27 >> 16) & 255);
        bArr4[(bArr4.length - 22) - i17] = (byte) ((i27 >> 8) & 255);
        bArr4[(bArr4.length - 21) - i17] = (byte) (i27 & 255);
        java.lang.String locale = java.util.Locale.getDefault().toString();
        if (locale.length() > 8) {
            locale = locale.substring(0, 8);
        }
        byte[] bytes = locale.getBytes();
        java.lang.System.arraycopy(bytes, 0, bArr4, (bArr4.length - 20) - i17, bytes.length);
        java.util.Arrays.toString(bytes);
        bArr4[(bArr4.length - 12) - i17] = 0;
        bArr4[(bArr4.length - 11) - i17] = 0;
        bArr4[(bArr4.length - 10) - i17] = 0;
        bArr4[(bArr4.length - 9) - i17] = 2;
        int length5 = (bArr4.length - 8) - i17;
        int i28 = this.f342936b;
        bArr4[length5] = (byte) ((i28 >> 24) & 255);
        bArr4[(bArr4.length - 7) - i17] = (byte) ((i28 >> 16) & 255);
        bArr4[(bArr4.length - 6) - i17] = (byte) ((i28 >> 8) & 255);
        bArr4[(bArr4.length - 5) - i17] = (byte) (i28 & 255);
        int length6 = (bArr4.length - 4) - i17;
        int i29 = this.f342937c;
        bArr4[length6] = (byte) ((i29 >> 24) & 255);
        bArr4[(bArr4.length - 3) - i17] = (byte) ((i29 >> 16) & 255);
        bArr4[(bArr4.length - 2) - i17] = (byte) ((i29 >> 8) & 255);
        bArr4[(bArr4.length - 1) - i17] = (byte) (i29 & 255);
        byte[] bArr7 = this.f342940f;
        if (bArr7 != null && bArr7.length == 32) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSyncCheck", "copy networkid " + this.f342940f.length + " " + this.f342941g);
            byte[] bArr8 = this.f342940f;
            java.lang.System.arraycopy(bArr8, 0, bArr4, this.f342935a.length + 32, bArr8.length);
            int length7 = bArr4.length;
            int i37 = this.f342941g;
            bArr4[(length7 - i37) - 4] = (byte) ((i37 >> 24) & 255);
            bArr4[(bArr4.length - i37) - 3] = (byte) ((i37 >> 16) & 255);
            bArr4[(bArr4.length - i37) - 2] = (byte) ((i37 >> 8) & 255);
            bArr4[(bArr4.length - i37) - 1] = (byte) (i37 & 255);
            if (i37 > 0 && (bArr = this.f342942h) != null && bArr.length == i37) {
                java.lang.System.arraycopy(bArr, 0, bArr4, this.f342935a.length + 32 + this.f342940f.length + 4, bArr.length);
            }
        }
        java.util.Arrays.toString(bArr4);
        this.f342939e = kk.k.h(bArr4);
        return bArr4;
    }
}
