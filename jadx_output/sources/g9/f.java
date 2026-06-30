package g9;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f269568a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f269569b;

    /* renamed from: c, reason: collision with root package name */
    public final g9.p f269570c;

    /* renamed from: d, reason: collision with root package name */
    public final h9.a[] f269571d;

    /* renamed from: e, reason: collision with root package name */
    public final h9.n f269572e;

    /* renamed from: f, reason: collision with root package name */
    public final d9.k0 f269573f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f269574g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f269575h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f269576i;

    /* renamed from: j, reason: collision with root package name */
    public java.io.IOException f269577j;

    /* renamed from: k, reason: collision with root package name */
    public h9.a f269578k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f269579l;

    /* renamed from: m, reason: collision with root package name */
    public android.net.Uri f269580m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f269581n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f269582o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f269583p;

    /* renamed from: q, reason: collision with root package name */
    public q9.m f269584q;

    public f(h9.n nVar, h9.a[] aVarArr, g9.g gVar, g9.p pVar, java.util.List list) {
        this.f269572e = nVar;
        this.f269571d = aVarArr;
        this.f269570c = pVar;
        this.f269574g = list;
        com.google.android.exoplayer2.Format[] formatArr = new com.google.android.exoplayer2.Format[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i17 = 0; i17 < aVarArr.length; i17++) {
            formatArr[i17] = aVarArr[i17].f279591b;
            iArr[i17] = i17;
        }
        g9.b bVar = (g9.b) gVar;
        this.f269568a = bVar.f269561a.createDataSource();
        this.f269569b = bVar.f269561a.createDataSource();
        d9.k0 k0Var = new d9.k0(formatArr);
        this.f269573f = k0Var;
        this.f269584q = new g9.e(k0Var, iArr);
    }

    public final void a(android.net.Uri uri, java.lang.String str, byte[] bArr) {
        byte[] byteArray = new java.math.BigInteger(t9.d0.j(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        java.lang.System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f269580m = uri;
        this.f269581n = bArr;
        this.f269582o = str;
        this.f269583p = bArr2;
    }
}
