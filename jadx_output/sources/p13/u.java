package p13;

/* loaded from: classes12.dex */
public class u {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f351138r = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public int f351140b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f351141c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351142d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351143e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351144f = null;

    /* renamed from: g, reason: collision with root package name */
    public int[] f351145g = null;

    /* renamed from: h, reason: collision with root package name */
    public int[] f351146h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f351147i = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashSet f351148j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public java.util.HashSet f351149k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public java.util.Comparator f351150l = null;

    /* renamed from: m, reason: collision with root package name */
    public o13.x f351151m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f351152n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f351153o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f351154p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f351155q = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final int f351139a = f351138r.incrementAndGet();

    public static p13.u b(java.lang.String str, int[] iArr, int[] iArr2, int i17, java.util.HashSet hashSet, java.util.Comparator comparator, o13.x xVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        p13.u uVar = new p13.u();
        uVar.f351141c = str;
        uVar.f351142d = null;
        uVar.f351145g = iArr;
        uVar.f351146h = iArr2;
        uVar.f351147i = i17;
        uVar.f351148j = hashSet;
        uVar.f351150l = comparator;
        uVar.f351151m = xVar;
        uVar.f351152n = n3Var;
        return uVar;
    }

    public p13.u a() {
        p13.u uVar = new p13.u();
        uVar.f351140b = this.f351140b;
        uVar.f351141c = this.f351141c;
        uVar.f351142d = this.f351142d;
        uVar.f351143e = this.f351143e;
        uVar.f351144f = this.f351144f;
        uVar.f351145g = this.f351145g;
        uVar.f351146h = this.f351146h;
        uVar.f351147i = this.f351147i;
        uVar.f351148j = this.f351148j;
        uVar.f351149k = this.f351149k;
        uVar.f351150l = this.f351150l;
        uVar.f351151m = this.f351151m;
        uVar.f351152n = this.f351152n;
        uVar.f351153o = this.f351153o;
        uVar.f351154p = this.f351154p;
        return uVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f351139a == ((p13.u) obj).f351139a;
    }

    public java.lang.String toString() {
        return java.lang.String.format("{id: %d, query: %s}", java.lang.Integer.valueOf(this.f351139a), this.f351141c);
    }
}
