package wp;

/* loaded from: classes16.dex */
public abstract class a {
    public static final java.util.concurrent.atomic.AtomicInteger C = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448330a;

    /* renamed from: b, reason: collision with root package name */
    public final xp.d f448331b;

    /* renamed from: d, reason: collision with root package name */
    public long f448333d;

    /* renamed from: e, reason: collision with root package name */
    public zp.h f448334e;

    /* renamed from: f, reason: collision with root package name */
    public long f448335f;

    /* renamed from: k, reason: collision with root package name */
    public float f448340k;

    /* renamed from: l, reason: collision with root package name */
    public int f448341l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f448342m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f448343n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Canvas f448344o;

    /* renamed from: p, reason: collision with root package name */
    public int f448345p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f448347r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f448348s;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Object f448354y;

    /* renamed from: c, reason: collision with root package name */
    public final int f448332c = C.incrementAndGet();

    /* renamed from: g, reason: collision with root package name */
    public long f448336g = 2000;

    /* renamed from: i, reason: collision with root package name */
    public float f448338i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f448339j = -1.0f;

    /* renamed from: q, reason: collision with root package name */
    public int f448346q = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f448349t = false;

    /* renamed from: u, reason: collision with root package name */
    public float f448350u = -1.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f448351v = -1.0f;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f448352w = true;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f448353x = true;

    /* renamed from: z, reason: collision with root package name */
    public int f448355z = 0;
    public boolean A = false;
    public long B = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.PriorityQueue f448337h = new java.util.PriorityQueue();

    public a(xp.d dVar) {
        this.f448330a = "";
        this.f448331b = dVar;
        this.f448330a = dVar.f455841i + "_BaseDanmaku";
        try {
            dVar.d(j());
        } catch (java.lang.Exception unused) {
            if (vp.c.f438737b) {
                throw new java.lang.RuntimeException("IDanmakuUIConfig should been provided by IDanmakuUIConfigCreator in DanmakuContext");
            }
        }
        v();
    }

    public void a() {
    }

    public void b() {
        xp.f fVar;
        wp.f fVar2 = (wp.f) this;
        float f17 = fVar2.D + fVar2.f448338i;
        if (this.f448349t || f17 > h()) {
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                toString();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f448330a, "onFirstExposure, danmaku = " + this);
        xp.d dVar = this.f448331b;
        if (dVar != null && (fVar = dVar.f455836d) != null) {
            fVar.a(this);
        }
        this.f448349t = true;
    }

    public abstract void c();

    public abstract float[] d(long j17);

    public float e() {
        return ((wp.f) this).D + xp.d.f().f455848e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        java.lang.Object obj2 = this.f448354y;
        java.lang.Object obj3 = ((wp.a) obj).f448354y;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public float f() {
        return i() + xp.d.f().f455847d;
    }

    public abstract float[] g(long j17);

    public int h() {
        return xp.d.f().f455853j;
    }

    public int hashCode() {
        java.lang.Object obj = this.f448354y;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public abstract float i();

    public abstract int j();

    public boolean k(float f17, float f18, float f19, long j17) {
        float[] fArr;
        wp.f fVar = (wp.f) this;
        if (fVar.n()) {
            float y17 = fVar.y(j17);
            if (fVar.F == null) {
                fVar.F = new float[4];
            }
            float[] fArr2 = fVar.F;
            fArr2[0] = y17;
            float f27 = fVar.E;
            fArr2[1] = f27;
            fArr2[2] = y17 + fVar.f448338i;
            fArr2[3] = f27 + fVar.f448339j;
            fArr = fArr2;
        } else {
            fArr = null;
        }
        if (fArr == null) {
            return false;
        }
        return fArr[0] <= f17 && f17 <= fArr[2] + f19 && fArr[1] <= f18 && f18 <= fArr[3];
    }

    public boolean l(long j17) {
        long j18 = this.f448333d;
        return j18 > 0 && j17 - j18 < 0;
    }

    public boolean m(long j17) {
        long j18 = this.f448333d;
        return j18 > 0 && j17 - j18 >= this.f448334e.f474913a;
    }

    public boolean n() {
        return this.f448338i >= 0.0f && this.f448339j >= 0.0f && !this.f448352w;
    }

    public boolean o() {
        return this.f448341l == 1;
    }

    public boolean p(long j17) {
        return !this.f448348s && j17 - this.f448335f >= this.f448334e.f474913a;
    }

    public boolean q(long j17) {
        return !this.f448348s && j17 - this.f448335f >= this.f448336g;
    }

    public zp.d r(zp.m mVar) {
        return new zp.d(-1);
    }

    public abstract void s(float f17, float f18, long j17, long j18);

    public final void t(long j17, long j18) {
        if (this.f448347r) {
            this.f448333d += j17;
        }
        wp.f fVar = (wp.f) this;
        fVar.D = fVar.y(j18);
        java.util.PriorityQueue priorityQueue = this.f448337h;
        if (priorityQueue.isEmpty()) {
            return;
        }
        java.util.Iterator it = priorityQueue.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BaseDanmaku");
        sb6.append(this.f448332c);
        sb6.append("[left:");
        wp.f fVar = (wp.f) this;
        sb6.append(fVar.D);
        sb6.append(",top:");
        sb6.append(i());
        sb6.append(",right:");
        sb6.append(fVar.D + fVar.f448338i);
        sb6.append(",bottom:");
        sb6.append(fVar.E + fVar.f448339j);
        sb6.append(", time:");
        sb6.append(this.f448335f);
        sb6.append(", mFirstDrawTime:");
        sb6.append(this.f448333d);
        sb6.append(", mData=");
        sb6.append(java.lang.String.valueOf(this.f448354y));
        sb6.append("mType=");
        sb6.append(j());
        sb6.append("]");
        return sb6.toString();
    }

    public void u(long j17) {
        wp.f fVar = (wp.f) this;
        this.f448333d = j17 - ((int) ((h() - fVar.D) / (-(-fVar.G))));
    }

    public void v() {
        xp.i f17 = xp.d.f();
        this.f448340k = f17.f455850g;
        this.f448342m = f17.f455852i;
        this.f448337h.clear();
        this.f448338i = -1.0f;
        this.f448339j = -1.0f;
        this.f448341l = 0;
        this.f448343n = null;
        this.f448345p = 0;
        this.f448347r = false;
        this.f448349t = false;
        this.f448352w = true;
        this.f448353x = true;
        this.f448350u = -1.0f;
        this.f448351v = -1.0f;
        this.f448355z = 0;
        c();
    }

    public void w(zp.h hVar) {
        this.f448334e = hVar;
    }

    public void x(boolean z17) {
        if (z17) {
            this.f448341l = 1;
        } else {
            this.f448341l = 0;
        }
    }
}
