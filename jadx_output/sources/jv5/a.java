package jv5;

/* loaded from: classes16.dex */
public final class a {
    public static final byte[] A = {68, 88, 68, 73, 70, 70};

    /* renamed from: a, reason: collision with root package name */
    public final bv5.b f302265a;

    /* renamed from: b, reason: collision with root package name */
    public short f302266b;

    /* renamed from: c, reason: collision with root package name */
    public int f302267c;

    /* renamed from: d, reason: collision with root package name */
    public int f302268d;

    /* renamed from: e, reason: collision with root package name */
    public int f302269e;

    /* renamed from: f, reason: collision with root package name */
    public int f302270f;

    /* renamed from: g, reason: collision with root package name */
    public int f302271g;

    /* renamed from: h, reason: collision with root package name */
    public int f302272h;

    /* renamed from: i, reason: collision with root package name */
    public int f302273i;

    /* renamed from: j, reason: collision with root package name */
    public int f302274j;

    /* renamed from: k, reason: collision with root package name */
    public int f302275k;

    /* renamed from: l, reason: collision with root package name */
    public int f302276l;

    /* renamed from: m, reason: collision with root package name */
    public int f302277m;

    /* renamed from: n, reason: collision with root package name */
    public int f302278n;

    /* renamed from: o, reason: collision with root package name */
    public int f302279o;

    /* renamed from: p, reason: collision with root package name */
    public int f302280p;

    /* renamed from: q, reason: collision with root package name */
    public int f302281q;

    /* renamed from: r, reason: collision with root package name */
    public int f302282r;

    /* renamed from: s, reason: collision with root package name */
    public int f302283s;

    /* renamed from: t, reason: collision with root package name */
    public int f302284t;

    /* renamed from: u, reason: collision with root package name */
    public int f302285u;

    /* renamed from: v, reason: collision with root package name */
    public int f302286v;

    /* renamed from: w, reason: collision with root package name */
    public int f302287w;

    /* renamed from: x, reason: collision with root package name */
    public int f302288x;

    /* renamed from: y, reason: collision with root package name */
    public int f302289y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f302290z;

    public a(java.io.InputStream inputStream) {
        bv5.b bVar = new bv5.b(java.nio.ByteBuffer.wrap(cv5.d.a(inputStream, 32768)));
        this.f302265a = bVar;
        byte[] bArr = new byte[6];
        bVar.f24762a.get(bArr);
        if (cv5.c.d(bArr, A) != 0) {
            throw new java.lang.IllegalStateException("bad dex patch file magic: " + java.util.Arrays.toString(bArr));
        }
        short s17 = bVar.f24762a.getShort();
        this.f302266b = s17;
        if (s17 != 2 && s17 != 3) {
            throw new java.lang.IllegalStateException("bad dex patch file version: " + ((int) this.f302266b));
        }
        if (s17 > 2) {
            this.f302267c = bVar.m();
            this.f302268d = bVar.m();
        }
        this.f302269e = bVar.m();
        this.f302270f = bVar.m();
        this.f302271g = bVar.m();
        this.f302272h = bVar.m();
        this.f302273i = bVar.m();
        this.f302274j = bVar.m();
        this.f302275k = bVar.m();
        if (this.f302266b > 2) {
            this.f302276l = bVar.m();
            this.f302277m = bVar.m();
        }
        this.f302278n = bVar.m();
        this.f302279o = bVar.m();
        this.f302280p = bVar.m();
        this.f302281q = bVar.m();
        this.f302282r = bVar.m();
        this.f302283s = bVar.m();
        this.f302284t = bVar.m();
        this.f302285u = bVar.m();
        this.f302286v = bVar.m();
        this.f302287w = bVar.m();
        this.f302288x = bVar.m();
        this.f302289y = bVar.m();
        byte[] bArr2 = new byte[20];
        bVar.f24762a.get(bArr2);
        this.f302290z = bArr2;
        bVar.f24762a.position(this.f302270f);
    }
}
