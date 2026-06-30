package f1;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.h f258476a = new f1.h();

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f258477b;

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f258478c;

    /* renamed from: d, reason: collision with root package name */
    public static final f1.y f258479d;

    /* renamed from: e, reason: collision with root package name */
    public static final f1.y f258480e;

    /* renamed from: f, reason: collision with root package name */
    public static final f1.y f258481f;

    /* renamed from: g, reason: collision with root package name */
    public static final f1.y f258482g;

    /* renamed from: h, reason: collision with root package name */
    public static final f1.y f258483h;

    /* renamed from: i, reason: collision with root package name */
    public static final f1.y f258484i;

    /* renamed from: j, reason: collision with root package name */
    public static final f1.y f258485j;

    /* renamed from: k, reason: collision with root package name */
    public static final f1.y f258486k;

    /* renamed from: l, reason: collision with root package name */
    public static final f1.y f258487l;

    /* renamed from: m, reason: collision with root package name */
    public static final f1.y f258488m;

    /* renamed from: n, reason: collision with root package name */
    public static final f1.y f258489n;

    /* renamed from: o, reason: collision with root package name */
    public static final f1.y f258490o;

    /* renamed from: p, reason: collision with root package name */
    public static final f1.y f258491p;

    /* renamed from: q, reason: collision with root package name */
    public static final f1.y f258492q;

    /* renamed from: r, reason: collision with root package name */
    public static final f1.d f258493r;

    /* renamed from: s, reason: collision with root package name */
    public static final f1.d f258494s;

    /* renamed from: t, reason: collision with root package name */
    public static final f1.y f258495t;

    /* renamed from: u, reason: collision with root package name */
    public static final f1.d f258496u;

    /* renamed from: v, reason: collision with root package name */
    public static final f1.d[] f258497v;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f258477b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f258478c = fArr2;
        f1.z zVar = new f1.z(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f1.z zVar2 = new f1.z(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f1.a0 a0Var = f1.l.f258507d;
        f1.y yVar = new f1.y("sRGB IEC61966-2.1", fArr, a0Var, zVar, 0);
        f258479d = yVar;
        f1.y yVar2 = new f1.y("sRGB IEC61966-2.1 (Linear)", fArr, a0Var, 1.0d, 0.0f, 1.0f, 1);
        f258480e = yVar2;
        f1.y yVar3 = new f1.y("scRGB-nl IEC 61966-2-2:2003", fArr, a0Var, null, f1.f.f258474d, f1.g.f258475d, -0.799f, 2.399f, zVar, 2);
        f258481f = yVar3;
        f1.y yVar4 = new f1.y("scRGB IEC 61966-2-2:2003", fArr, a0Var, 1.0d, -0.5f, 7.499f, 3);
        f258482g = yVar4;
        f1.y yVar5 = new f1.y("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, a0Var, new f1.z(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f258483h = yVar5;
        f1.y yVar6 = new f1.y("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, a0Var, new f1.z(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f258484i = yVar6;
        f1.y yVar7 = new f1.y("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new f1.a0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f258485j = yVar7;
        f1.y yVar8 = new f1.y("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, a0Var, zVar, 7);
        f258486k = yVar8;
        f1.y yVar9 = new f1.y("NTSC (1953)", fArr2, f1.l.f258504a, new f1.z(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f258487l = yVar9;
        f1.y yVar10 = new f1.y("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, a0Var, new f1.z(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f258488m = yVar10;
        f1.y yVar11 = new f1.y("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, a0Var, 2.2d, 0.0f, 1.0f, 10);
        f258489n = yVar11;
        f1.y yVar12 = new f1.y("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, f1.l.f258505b, new f1.z(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f258490o = yVar12;
        f1.a0 a0Var2 = f1.l.f258506c;
        f1.y yVar13 = new f1.y("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, a0Var2, 1.0d, -65504.0f, 65504.0f, 12);
        f258491p = yVar13;
        f1.y yVar14 = new f1.y("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, a0Var2, 1.0d, -65504.0f, 65504.0f, 13);
        f258492q = yVar14;
        f1.b0 b0Var = new f1.b0("Generic XYZ", 14);
        f258493r = b0Var;
        f1.m mVar = new f1.m("Generic L*a*b*", 15);
        f258494s = mVar;
        f1.y yVar15 = new f1.y("None", fArr, a0Var, zVar2, 16);
        f258495t = yVar15;
        f1.n nVar = new f1.n("Oklab", 17);
        f258496u = nVar;
        f258497v = new f1.d[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10, yVar11, yVar12, yVar13, yVar14, b0Var, mVar, yVar15, nVar};
    }
}
