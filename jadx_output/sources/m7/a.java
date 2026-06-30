package m7;

/* loaded from: classes13.dex */
public abstract class a implements java.lang.Cloneable {
    public android.content.res.Resources.Theme A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public int f324409d;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f324413h;

    /* renamed from: i, reason: collision with root package name */
    public int f324414i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f324415m;

    /* renamed from: n, reason: collision with root package name */
    public int f324416n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f324421s;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f324423u;

    /* renamed from: v, reason: collision with root package name */
    public int f324424v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f324428z;

    /* renamed from: e, reason: collision with root package name */
    public float f324410e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public w6.z f324411f = w6.z.f443253c;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.g f324412g = com.bumptech.glide.g.NORMAL;

    /* renamed from: o, reason: collision with root package name */
    public boolean f324417o = true;

    /* renamed from: p, reason: collision with root package name */
    public int f324418p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f324419q = -1;

    /* renamed from: r, reason: collision with root package name */
    public t6.h f324420r = p7.a.f352454b;

    /* renamed from: t, reason: collision with root package name */
    public boolean f324422t = true;

    /* renamed from: w, reason: collision with root package name */
    public t6.l f324425w = new t6.l();

    /* renamed from: x, reason: collision with root package name */
    public java.util.Map f324426x = new q7.d();

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Class f324427y = java.lang.Object.class;
    public boolean E = true;

    public static boolean e(int i17, int i18) {
        return (i17 & i18) != 0;
    }

    public m7.a a(m7.a aVar) {
        if (this.B) {
            return clone().a(aVar);
        }
        if (e(aVar.f324409d, 2)) {
            this.f324410e = aVar.f324410e;
        }
        if (e(aVar.f324409d, 262144)) {
            this.C = aVar.C;
        }
        if (e(aVar.f324409d, 1048576)) {
            this.F = aVar.F;
        }
        if (e(aVar.f324409d, 4)) {
            this.f324411f = aVar.f324411f;
        }
        if (e(aVar.f324409d, 8)) {
            this.f324412g = aVar.f324412g;
        }
        if (e(aVar.f324409d, 16)) {
            this.f324413h = aVar.f324413h;
            this.f324414i = 0;
            this.f324409d &= -33;
        }
        if (e(aVar.f324409d, 32)) {
            this.f324414i = aVar.f324414i;
            this.f324413h = null;
            this.f324409d &= -17;
        }
        if (e(aVar.f324409d, 64)) {
            this.f324415m = aVar.f324415m;
            this.f324416n = 0;
            this.f324409d &= -129;
        }
        if (e(aVar.f324409d, 128)) {
            this.f324416n = aVar.f324416n;
            this.f324415m = null;
            this.f324409d &= -65;
        }
        if (e(aVar.f324409d, 256)) {
            this.f324417o = aVar.f324417o;
        }
        if (e(aVar.f324409d, 512)) {
            this.f324419q = aVar.f324419q;
            this.f324418p = aVar.f324418p;
        }
        if (e(aVar.f324409d, 1024)) {
            this.f324420r = aVar.f324420r;
        }
        if (e(aVar.f324409d, 4096)) {
            this.f324427y = aVar.f324427y;
        }
        if (e(aVar.f324409d, 8192)) {
            this.f324423u = aVar.f324423u;
            this.f324424v = 0;
            this.f324409d &= -16385;
        }
        if (e(aVar.f324409d, 16384)) {
            this.f324424v = aVar.f324424v;
            this.f324423u = null;
            this.f324409d &= -8193;
        }
        if (e(aVar.f324409d, 32768)) {
            this.A = aVar.A;
        }
        if (e(aVar.f324409d, 65536)) {
            this.f324422t = aVar.f324422t;
        }
        if (e(aVar.f324409d, 131072)) {
            this.f324421s = aVar.f324421s;
        }
        if (e(aVar.f324409d, 2048)) {
            ((x.b) this.f324426x).putAll(aVar.f324426x);
            this.E = aVar.E;
        }
        if (e(aVar.f324409d, 524288)) {
            this.D = aVar.D;
        }
        if (!this.f324422t) {
            ((q7.d) this.f324426x).clear();
            int i17 = this.f324409d & (-2049);
            this.f324421s = false;
            this.f324409d = i17 & (-131073);
            this.E = true;
        }
        this.f324409d |= aVar.f324409d;
        this.f324425w.f415973b.i(aVar.f324425w.f415973b);
        i();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m7.a clone() {
        try {
            m7.a aVar = (m7.a) super.clone();
            t6.l lVar = new t6.l();
            aVar.f324425w = lVar;
            lVar.f415973b.i(this.f324425w.f415973b);
            q7.d dVar = new q7.d();
            aVar.f324426x = dVar;
            dVar.putAll(this.f324426x);
            aVar.f324428z = false;
            aVar.B = false;
            return aVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public m7.a c(java.lang.Class cls) {
        if (this.B) {
            return clone().c(cls);
        }
        q7.n.b(cls);
        this.f324427y = cls;
        this.f324409d |= 4096;
        i();
        return this;
    }

    public m7.a d(w6.z zVar) {
        if (this.B) {
            return clone().d(zVar);
        }
        q7.n.b(zVar);
        this.f324411f = zVar;
        this.f324409d |= 4;
        i();
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof m7.a)) {
            return false;
        }
        m7.a aVar = (m7.a) obj;
        if (java.lang.Float.compare(aVar.f324410e, this.f324410e) == 0 && this.f324414i == aVar.f324414i && q7.p.a(this.f324413h, aVar.f324413h) && this.f324416n == aVar.f324416n && q7.p.a(this.f324415m, aVar.f324415m) && this.f324424v == aVar.f324424v && q7.p.a(this.f324423u, aVar.f324423u) && this.f324417o == aVar.f324417o && this.f324418p == aVar.f324418p && this.f324419q == aVar.f324419q && this.f324421s == aVar.f324421s && this.f324422t == aVar.f324422t && this.C == aVar.C && this.D == aVar.D && this.f324411f.equals(aVar.f324411f) && this.f324412g == aVar.f324412g && this.f324425w.equals(aVar.f324425w)) {
            return ((x.n) this.f324426x).equals(aVar.f324426x) && this.f324427y.equals(aVar.f324427y) && q7.p.a(this.f324420r, aVar.f324420r) && q7.p.a(this.A, aVar.A);
        }
        return false;
    }

    public final m7.a f(d7.v vVar, t6.p pVar) {
        if (this.B) {
            return clone().f(vVar, pVar);
        }
        t6.k kVar = d7.v.f226843f;
        q7.n.b(vVar);
        j(kVar, vVar);
        return n(pVar, false);
    }

    public m7.a g(int i17, int i18) {
        if (this.B) {
            return clone().g(i17, i18);
        }
        this.f324419q = i17;
        this.f324418p = i18;
        this.f324409d |= 512;
        i();
        return this;
    }

    public m7.a h(com.bumptech.glide.g gVar) {
        if (this.B) {
            return clone().h(gVar);
        }
        q7.n.b(gVar);
        this.f324412g = gVar;
        this.f324409d |= 8;
        i();
        return this;
    }

    public int hashCode() {
        float f17 = this.f324410e;
        char[] cArr = q7.p.f360310a;
        return q7.p.e(this.A, q7.p.e(this.f324420r, q7.p.e(this.f324427y, q7.p.e(this.f324426x, q7.p.e(this.f324425w, q7.p.e(this.f324412g, q7.p.e(this.f324411f, (((((((((((((q7.p.e(this.f324423u, (q7.p.e(this.f324415m, (q7.p.e(this.f324413h, ((java.lang.Float.floatToIntBits(f17) + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX) * 31) + this.f324414i) * 31) + this.f324416n) * 31) + this.f324424v) * 31) + (this.f324417o ? 1 : 0)) * 31) + this.f324418p) * 31) + this.f324419q) * 31) + (this.f324421s ? 1 : 0)) * 31) + (this.f324422t ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0))))))));
    }

    public final m7.a i() {
        if (this.f324428z) {
            throw new java.lang.IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public m7.a j(t6.k kVar, java.lang.Object obj) {
        if (this.B) {
            return clone().j(kVar, obj);
        }
        q7.n.b(kVar);
        q7.n.b(obj);
        this.f324425w.f415973b.put(kVar, obj);
        i();
        return this;
    }

    public m7.a k(t6.h hVar) {
        if (this.B) {
            return clone().k(hVar);
        }
        q7.n.b(hVar);
        this.f324420r = hVar;
        this.f324409d |= 1024;
        i();
        return this;
    }

    public m7.a l(boolean z17) {
        if (this.B) {
            return clone().l(true);
        }
        this.f324417o = !z17;
        this.f324409d |= 256;
        i();
        return this;
    }

    public m7.a m(java.lang.Class cls, t6.p pVar, boolean z17) {
        if (this.B) {
            return clone().m(cls, pVar, z17);
        }
        q7.n.b(cls);
        q7.n.b(pVar);
        ((q7.d) this.f324426x).put(cls, pVar);
        int i17 = this.f324409d | 2048;
        this.f324422t = true;
        int i18 = i17 | 65536;
        this.f324409d = i18;
        this.E = false;
        if (z17) {
            this.f324409d = i18 | 131072;
            this.f324421s = true;
        }
        i();
        return this;
    }

    public m7.a n(t6.p pVar, boolean z17) {
        if (this.B) {
            return clone().n(pVar, z17);
        }
        d7.b0 b0Var = new d7.b0(pVar, z17);
        m(android.graphics.Bitmap.class, pVar, z17);
        m(android.graphics.drawable.Drawable.class, b0Var, z17);
        m(android.graphics.drawable.BitmapDrawable.class, b0Var, z17);
        m(h7.f.class, new h7.i(pVar), z17);
        i();
        return this;
    }

    public m7.a o(boolean z17) {
        if (this.B) {
            return clone().o(z17);
        }
        this.F = z17;
        this.f324409d |= 1048576;
        i();
        return this;
    }
}
