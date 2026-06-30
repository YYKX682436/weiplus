package j5;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f297763s = a5.a0.e("WorkSpec");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f297764a;

    /* renamed from: b, reason: collision with root package name */
    public a5.q0 f297765b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f297766c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297767d;

    /* renamed from: e, reason: collision with root package name */
    public a5.m f297768e;

    /* renamed from: f, reason: collision with root package name */
    public a5.m f297769f;

    /* renamed from: g, reason: collision with root package name */
    public long f297770g;

    /* renamed from: h, reason: collision with root package name */
    public long f297771h;

    /* renamed from: i, reason: collision with root package name */
    public long f297772i;

    /* renamed from: j, reason: collision with root package name */
    public a5.f f297773j;

    /* renamed from: k, reason: collision with root package name */
    public int f297774k;

    /* renamed from: l, reason: collision with root package name */
    public a5.a f297775l;

    /* renamed from: m, reason: collision with root package name */
    public long f297776m;

    /* renamed from: n, reason: collision with root package name */
    public long f297777n;

    /* renamed from: o, reason: collision with root package name */
    public long f297778o;

    /* renamed from: p, reason: collision with root package name */
    public long f297779p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f297780q;

    /* renamed from: r, reason: collision with root package name */
    public a5.k0 f297781r;

    public w(java.lang.String str, java.lang.String str2) {
        this.f297765b = a5.q0.ENQUEUED;
        a5.m mVar = a5.m.f1410b;
        this.f297768e = mVar;
        this.f297769f = mVar;
        this.f297773j = a5.f.f1384i;
        this.f297775l = a5.a.EXPONENTIAL;
        this.f297776m = 30000L;
        this.f297779p = -1L;
        this.f297781r = a5.k0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f297764a = str;
        this.f297766c = str2;
    }

    public long a() {
        if (this.f297765b == a5.q0.ENQUEUED && this.f297774k > 0) {
            return this.f297777n + java.lang.Math.min(18000000L, this.f297775l == a5.a.LINEAR ? this.f297776m * this.f297774k : java.lang.Math.scalb((float) this.f297776m, this.f297774k - 1));
        }
        if (!c()) {
            long j17 = this.f297777n;
            if (j17 == 0) {
                j17 = java.lang.System.currentTimeMillis();
            }
            return j17 + this.f297770g;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = this.f297777n;
        if (j18 == 0) {
            j18 = this.f297770g + currentTimeMillis;
        }
        long j19 = this.f297772i;
        long j27 = this.f297771h;
        if (j19 != j27) {
            return j18 + j27 + (j18 == 0 ? j19 * (-1) : 0L);
        }
        return j18 + (j18 != 0 ? j27 : 0L);
    }

    public boolean b() {
        return !a5.f.f1384i.equals(this.f297773j);
    }

    public boolean c() {
        return this.f297771h != 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j5.w.class != obj.getClass()) {
            return false;
        }
        j5.w wVar = (j5.w) obj;
        if (this.f297770g != wVar.f297770g || this.f297771h != wVar.f297771h || this.f297772i != wVar.f297772i || this.f297774k != wVar.f297774k || this.f297776m != wVar.f297776m || this.f297777n != wVar.f297777n || this.f297778o != wVar.f297778o || this.f297779p != wVar.f297779p || this.f297780q != wVar.f297780q || !this.f297764a.equals(wVar.f297764a) || this.f297765b != wVar.f297765b || !this.f297766c.equals(wVar.f297766c)) {
            return false;
        }
        java.lang.String str = this.f297767d;
        if (str == null ? wVar.f297767d == null : str.equals(wVar.f297767d)) {
            return this.f297768e.equals(wVar.f297768e) && this.f297769f.equals(wVar.f297769f) && this.f297773j.equals(wVar.f297773j) && this.f297775l == wVar.f297775l && this.f297781r == wVar.f297781r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f297764a.hashCode() * 31) + this.f297765b.hashCode()) * 31) + this.f297766c.hashCode()) * 31;
        java.lang.String str = this.f297767d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f297768e.hashCode()) * 31) + this.f297769f.hashCode()) * 31;
        long j17 = this.f297770g;
        int i17 = (hashCode2 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f297771h;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f297772i;
        int hashCode3 = (((((((i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31) + this.f297773j.hashCode()) * 31) + this.f297774k) * 31) + this.f297775l.hashCode()) * 31;
        long j27 = this.f297776m;
        int i19 = (hashCode3 + ((int) (j27 ^ (j27 >>> 32)))) * 31;
        long j28 = this.f297777n;
        int i27 = (i19 + ((int) (j28 ^ (j28 >>> 32)))) * 31;
        long j29 = this.f297778o;
        int i28 = (i27 + ((int) (j29 ^ (j29 >>> 32)))) * 31;
        long j37 = this.f297779p;
        return ((((i28 + ((int) (j37 ^ (j37 >>> 32)))) * 31) + (this.f297780q ? 1 : 0)) * 31) + this.f297781r.hashCode();
    }

    public java.lang.String toString() {
        return "{WorkSpec: " + this.f297764a + "}";
    }

    public w(j5.w wVar) {
        this.f297765b = a5.q0.ENQUEUED;
        a5.m mVar = a5.m.f1410b;
        this.f297768e = mVar;
        this.f297769f = mVar;
        this.f297773j = a5.f.f1384i;
        this.f297775l = a5.a.EXPONENTIAL;
        this.f297776m = 30000L;
        this.f297779p = -1L;
        this.f297781r = a5.k0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f297764a = wVar.f297764a;
        this.f297766c = wVar.f297766c;
        this.f297765b = wVar.f297765b;
        this.f297767d = wVar.f297767d;
        this.f297768e = new a5.m(wVar.f297768e);
        this.f297769f = new a5.m(wVar.f297769f);
        this.f297770g = wVar.f297770g;
        this.f297771h = wVar.f297771h;
        this.f297772i = wVar.f297772i;
        this.f297773j = new a5.f(wVar.f297773j);
        this.f297774k = wVar.f297774k;
        this.f297775l = wVar.f297775l;
        this.f297776m = wVar.f297776m;
        this.f297777n = wVar.f297777n;
        this.f297778o = wVar.f297778o;
        this.f297779p = wVar.f297779p;
        this.f297780q = wVar.f297780q;
        this.f297781r = wVar.f297781r;
    }
}
