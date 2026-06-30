package it5;

/* loaded from: classes13.dex */
public final class c extends com.qq.taf.jce.JceStruct {

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f294627s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f294628t;

    /* renamed from: d, reason: collision with root package name */
    public int f294629d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f294630e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f294631f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f294632g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f294633h = 0;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f294634i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f294635m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f294636n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f294637o = 0;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f294638p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f294639q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f294640r = 0;

    static {
        f294627s = r1;
        byte[] bArr = {0};
        f294628t = r0;
        byte[] bArr2 = {0};
    }

    @Override // com.qq.taf.jce.JceStruct
    public com.qq.taf.jce.JceStruct newInit() {
        return new it5.c();
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f294629d = jceInputStream.read(this.f294629d, 0, false);
        this.f294630e = jceInputStream.read(this.f294630e, 1, false);
        this.f294631f = jceInputStream.read(this.f294631f, 2, false);
        this.f294632g = jceInputStream.read(this.f294632g, 3, false);
        this.f294633h = jceInputStream.read(this.f294633h, 4, false);
        this.f294634i = jceInputStream.read(f294627s, 5, false);
        this.f294635m = jceInputStream.read(this.f294635m, 6, false);
        this.f294636n = jceInputStream.read(this.f294636n, 7, false);
        this.f294637o = jceInputStream.read(this.f294637o, 8, false);
        this.f294638p = jceInputStream.read(f294628t, 9, false);
        this.f294639q = jceInputStream.read(this.f294639q, 10, false);
        this.f294640r = jceInputStream.read(this.f294640r, 11, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        int i17 = this.f294629d;
        if (i17 != 0) {
            jceOutputStream.write(i17, 0);
        }
        jceOutputStream.write(this.f294630e, 1);
        jceOutputStream.write(this.f294631f, 2);
        int i18 = this.f294632g;
        if (i18 != 0) {
            jceOutputStream.write(i18, 3);
        }
        int i19 = this.f294633h;
        if (i19 != 0) {
            jceOutputStream.write(i19, 4);
        }
        byte[] bArr = this.f294634i;
        if (bArr != null) {
            jceOutputStream.write(bArr, 5);
        }
        int i27 = this.f294635m;
        if (i27 != 0) {
            jceOutputStream.write(i27, 6);
        }
        int i28 = this.f294636n;
        if (i28 != 0) {
            jceOutputStream.write(i28, 7);
        }
        long j17 = this.f294637o;
        if (j17 != 0) {
            jceOutputStream.write(j17, 8);
        }
        byte[] bArr2 = this.f294638p;
        if (bArr2 != null) {
            jceOutputStream.write(bArr2, 9);
        }
        int i29 = this.f294639q;
        if (i29 != 0) {
            jceOutputStream.write(i29, 10);
        }
        int i37 = this.f294640r;
        if (i37 != 0) {
            jceOutputStream.write(i37, 11);
        }
    }
}
