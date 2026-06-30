package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public abstract class l implements q65.c {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f192296f = lp0.b.D();

    /* renamed from: a, reason: collision with root package name */
    public final int f192297a;

    /* renamed from: b, reason: collision with root package name */
    public int f192298b;

    /* renamed from: c, reason: collision with root package name */
    public int f192299c = com.tencent.mm.sandbox.monitor.o.e(d());

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f192300d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f192301e;

    public l(int i17, java.lang.String str, int i18, boolean z17) {
        this.f192301e = false;
        this.f192298b = i17;
        this.f192300d = str;
        this.f192297a = i18;
        this.f192301e = z17;
        java.io.File file = new java.io.File(f192296f);
        if (!file.exists()) {
            file.mkdirs();
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sandbox.monitor.l.c(java.lang.String, boolean):java.lang.String");
    }

    public java.lang.String b() {
        return f192296f + this.f192300d + ".apk";
    }

    public java.lang.String d() {
        return f192296f + this.f192300d + ".temp";
    }
}
