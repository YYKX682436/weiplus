package it5;

/* loaded from: classes13.dex */
public final class b extends com.qq.taf.jce.JceStruct {
    public static final byte[] A;
    public static final java.util.ArrayList B;
    public static final java.util.ArrayList C;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f294607z;

    /* renamed from: d, reason: collision with root package name */
    public int f294608d = 0;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f294609e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f294610f = "";

    /* renamed from: g, reason: collision with root package name */
    public byte[] f294611g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f294612h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f294613i = "";

    /* renamed from: m, reason: collision with root package name */
    public int f294614m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f294615n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f294616o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f294617p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f294618q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f294619r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f294620s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f294621t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f294622u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f294623v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f294624w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f294625x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f294626y = null;

    static {
        f294607z = r1;
        byte[] bArr = {0};
        A = r1;
        byte[] bArr2 = {0};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        B = arrayList;
        arrayList.add(0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        C = arrayList2;
        arrayList2.add(new byte[]{0});
    }

    @Override // com.qq.taf.jce.JceStruct
    public com.qq.taf.jce.JceStruct newInit() {
        return new it5.b();
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f294608d = jceInputStream.read(this.f294608d, 0, true);
        this.f294609e = jceInputStream.read(f294607z, 1, false);
        this.f294610f = jceInputStream.readString(2, false);
        this.f294611g = jceInputStream.read(A, 3, false);
        this.f294612h = jceInputStream.read(this.f294612h, 4, false);
        this.f294613i = jceInputStream.readString(5, false);
        this.f294614m = jceInputStream.read(this.f294614m, 6, false);
        this.f294615n = jceInputStream.readString(7, false);
        this.f294616o = jceInputStream.read(this.f294616o, 8, false);
        this.f294617p = jceInputStream.readString(9, false);
        this.f294618q = jceInputStream.read(this.f294618q, 10, false);
        this.f294619r = jceInputStream.read(this.f294619r, 11, false);
        this.f294620s = jceInputStream.read(this.f294620s, 12, false);
        this.f294621t = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) B, 13, false);
        this.f294622u = jceInputStream.read(this.f294622u, 14, false);
        this.f294623v = jceInputStream.read(this.f294623v, 15, false);
        this.f294624w = jceInputStream.read(this.f294624w, 16, false);
        this.f294625x = jceInputStream.read(this.f294625x, 17, false);
        this.f294626y = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) C, 18, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f294608d, 0);
        byte[] bArr = this.f294609e;
        if (bArr != null) {
            jceOutputStream.write(bArr, 1);
        }
        java.lang.String str = this.f294610f;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        byte[] bArr2 = this.f294611g;
        if (bArr2 != null) {
            jceOutputStream.write(bArr2, 3);
        }
        long j17 = this.f294612h;
        if (j17 != 0) {
            jceOutputStream.write(j17, 4);
        }
        java.lang.String str2 = this.f294613i;
        if (str2 != null) {
            jceOutputStream.write(str2, 5);
        }
        int i17 = this.f294614m;
        if (i17 != 0) {
            jceOutputStream.write(i17, 6);
        }
        java.lang.String str3 = this.f294615n;
        if (str3 != null) {
            jceOutputStream.write(str3, 7);
        }
        int i18 = this.f294616o;
        if (i18 != 0) {
            jceOutputStream.write(i18, 8);
        }
        java.lang.String str4 = this.f294617p;
        if (str4 != null) {
            jceOutputStream.write(str4, 9);
        }
        jceOutputStream.write(this.f294618q, 10);
        int i19 = this.f294619r;
        if (i19 != 0) {
            jceOutputStream.write(i19, 11);
        }
        int i27 = this.f294620s;
        if (i27 != 0) {
            jceOutputStream.write(i27, 12);
        }
        java.util.ArrayList arrayList = this.f294621t;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 13);
        }
        int i28 = this.f294622u;
        if (i28 != 0) {
            jceOutputStream.write(i28, 14);
        }
        jceOutputStream.write(this.f294623v, 15);
        int i29 = this.f294624w;
        if (i29 != 0) {
            jceOutputStream.write(i29, 16);
        }
        jceOutputStream.write(this.f294625x, 17);
        java.util.ArrayList arrayList2 = this.f294626y;
        if (arrayList2 != null) {
            jceOutputStream.write((java.util.Collection) arrayList2, 18);
        }
    }
}
