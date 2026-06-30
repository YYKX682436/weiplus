package ht5;

/* loaded from: classes13.dex */
public final class c extends com.qq.taf.jce.JceStruct {
    public static final ht5.b H = new ht5.b();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f284974d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f284975e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f284976f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f284977g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f284978h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f284979i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f284980m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f284981n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f284982o = 0;

    /* renamed from: p, reason: collision with root package name */
    public ht5.b f284983p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f284984q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f284985r = "";

    /* renamed from: s, reason: collision with root package name */
    public int f284986s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f284987t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f284988u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f284989v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f284990w = "";

    /* renamed from: x, reason: collision with root package name */
    public short f284991x = 0;

    /* renamed from: y, reason: collision with root package name */
    public double f284992y = 0.0d;

    /* renamed from: z, reason: collision with root package name */
    public double f284993z = 0.0d;
    public java.lang.String A = "";
    public int B = 0;
    public java.lang.String C = "";
    public java.lang.String D = "";
    public java.lang.String E = "";
    public java.lang.String F = "";
    public java.lang.String G = "";

    @Override // com.qq.taf.jce.JceStruct
    public com.qq.taf.jce.JceStruct newInit() {
        return new ht5.c();
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.f284974d = jceInputStream.readString(0, true);
        this.f284975e = jceInputStream.readString(1, false);
        this.f284976f = jceInputStream.readString(2, false);
        this.f284977g = jceInputStream.readString(3, false);
        this.f284978h = jceInputStream.readString(4, false);
        this.f284979i = jceInputStream.readString(5, false);
        this.f284980m = jceInputStream.readString(6, false);
        this.f284981n = jceInputStream.read(this.f284981n, 7, false);
        this.f284982o = jceInputStream.read(this.f284982o, 8, false);
        this.f284983p = (ht5.b) jceInputStream.read((com.qq.taf.jce.JceStruct) H, 9, false);
        this.f284984q = jceInputStream.readString(10, false);
        this.f284985r = jceInputStream.readString(11, false);
        this.f284986s = jceInputStream.read(this.f284986s, 12, false);
        this.f284987t = jceInputStream.read(this.f284987t, 13, false);
        this.f284988u = jceInputStream.read(this.f284988u, 14, false);
        this.f284989v = jceInputStream.read(this.f284989v, 15, false);
        this.f284990w = jceInputStream.readString(16, false);
        this.f284991x = jceInputStream.read(this.f284991x, 17, false);
        this.f284992y = jceInputStream.read(this.f284992y, 18, false);
        this.f284993z = jceInputStream.read(this.f284993z, 19, false);
        this.A = jceInputStream.readString(20, false);
        this.B = jceInputStream.read(this.B, 21, false);
        this.C = jceInputStream.readString(22, false);
        this.D = jceInputStream.readString(23, false);
        this.E = jceInputStream.readString(24, false);
        this.F = jceInputStream.readString(25, false);
        this.G = jceInputStream.readString(26, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.f284974d, 0);
        java.lang.String str = this.f284975e;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        java.lang.String str2 = this.f284976f;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        java.lang.String str3 = this.f284977g;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        java.lang.String str4 = this.f284978h;
        if (str4 != null) {
            jceOutputStream.write(str4, 4);
        }
        java.lang.String str5 = this.f284979i;
        if (str5 != null) {
            jceOutputStream.write(str5, 5);
        }
        java.lang.String str6 = this.f284980m;
        if (str6 != null) {
            jceOutputStream.write(str6, 6);
        }
        int i17 = this.f284981n;
        if (i17 != 0) {
            jceOutputStream.write(i17, 7);
        }
        int i18 = this.f284982o;
        if (i18 != 0) {
            jceOutputStream.write(i18, 8);
        }
        ht5.b bVar = this.f284983p;
        if (bVar != null) {
            jceOutputStream.write((com.qq.taf.jce.JceStruct) bVar, 9);
        }
        java.lang.String str7 = this.f284984q;
        if (str7 != null) {
            jceOutputStream.write(str7, 10);
        }
        java.lang.String str8 = this.f284985r;
        if (str8 != null) {
            jceOutputStream.write(str8, 11);
        }
        int i19 = this.f284986s;
        if (i19 != 0) {
            jceOutputStream.write(i19, 12);
        }
        int i27 = this.f284987t;
        if (i27 != 0) {
            jceOutputStream.write(i27, 13);
        }
        int i28 = this.f284988u;
        if (i28 != 0) {
            jceOutputStream.write(i28, 14);
        }
        int i29 = this.f284989v;
        if (i29 != 0) {
            jceOutputStream.write(i29, 15);
        }
        java.lang.String str9 = this.f284990w;
        if (str9 != null) {
            jceOutputStream.write(str9, 16);
        }
        short s17 = this.f284991x;
        if (s17 != 0) {
            jceOutputStream.write(s17, 17);
        }
        double d17 = this.f284992y;
        if (d17 != 0.0d) {
            jceOutputStream.write(d17, 18);
        }
        double d18 = this.f284993z;
        if (d18 != 0.0d) {
            jceOutputStream.write(d18, 19);
        }
        java.lang.String str10 = this.A;
        if (str10 != null) {
            jceOutputStream.write(str10, 20);
        }
        int i37 = this.B;
        if (i37 != 0) {
            jceOutputStream.write(i37, 21);
        }
        java.lang.String str11 = this.C;
        if (str11 != null) {
            jceOutputStream.write(str11, 22);
        }
        java.lang.String str12 = this.D;
        if (str12 != null) {
            jceOutputStream.write(str12, 23);
        }
        java.lang.String str13 = this.E;
        if (str13 != null) {
            jceOutputStream.write(str13, 24);
        }
        java.lang.String str14 = this.F;
        if (str14 != null) {
            jceOutputStream.write(str14, 25);
        }
        java.lang.String str15 = this.G;
        if (str15 != null) {
            jceOutputStream.write(str15, 26);
        }
    }
}
