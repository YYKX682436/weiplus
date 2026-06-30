package vp3;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.plugin.performance.diagnostic.f {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f438959l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f438960m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f438961n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f438962o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f438963p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f438964q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f438965r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f438966s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f438967t;

    public a(com.tencent.mm.plugin.performance.diagnostic.d dVar) {
        super(dVar);
        this.f438959l = dVar.b() + ".$hook";
        this.f438960m = dVar.b() + ".$ignore";
        this.f438961n = dVar.b() + ".$stack";
        this.f438962o = dVar.b() + ".$min";
        this.f438963p = dVar.b() + ".$max";
        this.f438964q = dVar.b() + ".$sampling";
        this.f438965r = dVar.b() + ".$extreme";
        this.f438966s = dVar.b() + ".$mmap";
        this.f438967t = dVar.b() + ".$stacklog";
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.f
    public void a(java.util.Map map) {
        boolean z17;
        super.a(map);
        java.lang.String str = this.f438959l;
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryHookConfigStg", "ERROR(MemoryHook): hook regex is blank");
            return;
        }
        java.lang.String str3 = this.f438960m;
        java.lang.String str4 = (java.lang.String) map.get(str3);
        java.lang.String str5 = this.f438961n;
        boolean equals = "1".equals(map.get(str5));
        java.lang.String str6 = this.f438962o;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str6), 0);
        java.lang.String str7 = this.f438963p;
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str7), 0);
        java.lang.String str8 = this.f438964q;
        double F = com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) map.get(str8), 1.0d);
        java.lang.String str9 = this.f438965r;
        boolean equals2 = "1".equals(map.get(str9));
        java.lang.String str10 = this.f438966s;
        boolean equals3 = "1".equals(map.get(str10));
        java.lang.String str11 = this.f438967t;
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str11), 31457280);
        if (equals2) {
            z17 = equals3;
        } else if (str4 == null) {
            z17 = equals3;
            str4 = ".*libutils\\.so$;.*libcutils\\.so$;.*libskia\\.so$;.*libbinder.*\\.so$;.*libhwbinder\\.so$;.*libicuuc\\.so$;.*libicui18n\\.so$;.*libart.*\\.so$;.*libandroidfw\\.so$;.*libandroid_runtime\\.so$;.*libjavacore\\.so$;.*libopenjdk.*\\.so$;.*libmemfence\\.so$";
        } else {
            if (android.text.TextUtils.isEmpty(str4)) {
                z17 = equals3;
            } else {
                z17 = equals3;
                if (!str4.endsWith(";")) {
                    str4 = str4.concat(";");
                }
            }
            str4 = str4 + ".*libutils\\.so$;.*libcutils\\.so$;.*libskia\\.so$;.*libbinder.*\\.so$;.*libhwbinder\\.so$;.*libicuuc\\.so$;.*libicui18n\\.so$;.*libart.*\\.so$;.*libandroidfw\\.so$;.*libandroid_runtime\\.so$;.*libjavacore\\.so$;.*libopenjdk.*\\.so$;.*libmemfence\\.so$";
        }
        if (P3 > 524288000) {
            P3 = 524288000;
        }
        if (P3 < 0) {
            P3 = 0;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f152921a;
        o4Var.D(str, str2);
        o4Var.D(str3, str4);
        o4Var.G(str5, equals);
        o4Var.A(str6, P);
        o4Var.A(str7, P2);
        o4Var.y(str8, F);
        o4Var.G(str9, equals2);
        o4Var.G(str10, z17);
        o4Var.A(str11, P3);
    }

    public double f() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f152921a;
        boolean U = o4Var.U();
        java.lang.String str = this.f438964q;
        if (!U) {
            return o4Var.f192898d.decodeDouble(str, 1.0d);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f192901g;
        readLock.lock();
        o4Var.c(o4Var.f192899e);
        double decodeDouble = o4Var.f192898d.decodeDouble(str, 1.0d);
        readLock.unlock();
        return decodeDouble;
    }
}
