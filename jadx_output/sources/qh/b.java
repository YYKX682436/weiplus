package qh;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f363308a;

    /* renamed from: b, reason: collision with root package name */
    public int f363309b;

    /* renamed from: c, reason: collision with root package name */
    public int f363310c;

    /* renamed from: d, reason: collision with root package name */
    public int f363311d;

    /* renamed from: e, reason: collision with root package name */
    public int f363312e;

    /* renamed from: f, reason: collision with root package name */
    public int f363313f;

    /* renamed from: g, reason: collision with root package name */
    public int f363314g;

    /* renamed from: h, reason: collision with root package name */
    public int f363315h;

    /* renamed from: j, reason: collision with root package name */
    public int f363317j;

    /* renamed from: l, reason: collision with root package name */
    public int f363319l;

    /* renamed from: n, reason: collision with root package name */
    public long f363321n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicBoolean f363322o;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f363316i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f363318k = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f363320m = false;

    public static qh.b a() {
        ph.u uVar;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null) {
            return b(1L);
        }
        qh.a aVar = new qh.a(uVar.f354296h);
        aVar.f363320m = true;
        return aVar;
    }

    public static qh.b b(long j17) {
        if (j17 <= 0) {
            j17 = 0;
        }
        qh.b bVar = new qh.b();
        bVar.f363321n = j17;
        rh.w wVar = (rh.w) ph.a.a(rh.w.class);
        if (wVar != null) {
            rh.v k17 = wVar.k(j17);
            if (k17.f395365c) {
                bVar.f363308a = ((java.lang.Long) k17.f395519e.f395552a).intValue();
                bVar.f363309b = ((java.lang.Long) k17.f395520f.f395552a).intValue();
                bVar.f363310c = ((java.lang.Long) k17.f395521g.f395552a).intValue();
                bVar.f363311d = ((java.lang.Long) k17.f395522h.f395552a).intValue();
                wh.i2 l17 = wVar.l(j17);
                wh.h2 b17 = l17.b();
                if (b17 != null) {
                    bVar.f363316i = b17.f445796a;
                    bVar.f363317j = b17.f445797b;
                    wh.h2 c17 = l17.c();
                    if (c17 != null) {
                        bVar.f363318k = c17.f445796a;
                        bVar.f363319l = c17.f445797b;
                    }
                    rh.d2 d2Var = (rh.d2) ph.a.a(rh.d2.class);
                    if (d2Var != null) {
                        rh.a2 m17 = d2Var.m(j17);
                        if (m17.f395365c) {
                            bVar.f363312e = ((java.lang.Long) m17.f395300e.f395552a).intValue();
                            bVar.f363313f = ((java.lang.Long) m17.f395301f.f395552a).intValue();
                            bVar.f363314g = ((java.lang.Long) m17.f395302g.f395552a).intValue();
                            bVar.f363315h = ((java.lang.Long) m17.f395303h.f395552a).intValue();
                            bVar.f363320m = true;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int c() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f363322o;
        if ((atomicBoolean != null && atomicBoolean.get()) || this.f363308a >= 50) {
            return 1;
        }
        if (this.f363310c >= 50) {
            return 3;
        }
        return this.f363311d >= 50 ? 4 : 2;
    }

    public int d() {
        if (this.f363312e >= 50) {
            return 1;
        }
        if (this.f363314g >= 50) {
            return 3;
        }
        return this.f363315h >= 50 ? 4 : 2;
    }

    public long e() {
        return java.lang.Math.max(1L, this.f363321n / 60000);
    }

    public boolean f() {
        return c() == 3;
    }

    public boolean g() {
        return d() == 1;
    }

    public boolean h() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f363322o;
        return atomicBoolean != null ? atomicBoolean.get() : c() == 1;
    }

    public java.lang.String toString() {
        return "AppStats{appFgRatio=" + this.f363308a + ", appBgRatio=" + this.f363309b + ", appFgSrvRatio=" + this.f363310c + ", appFloatRatio=" + this.f363311d + ", devChargingRatio=" + this.f363312e + ", devUnChargingRatio=" + this.f363313f + ", devSceneOffRatio=" + this.f363314g + ", devLowEnergyRatio=" + this.f363315h + ", sceneTop1='" + this.f363316i + "', sceneTop1Ratio=" + this.f363317j + ", sceneTop2='" + this.f363318k + "', sceneTop2Ratio=" + this.f363319l + ", isValid=" + this.f363320m + ", duringMillis=" + this.f363321n + ", foregroundOverride=" + this.f363322o + '}';
    }
}
