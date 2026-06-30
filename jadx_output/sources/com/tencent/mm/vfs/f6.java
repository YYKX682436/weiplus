package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class f6 implements com.tencent.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f212925a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f212926b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f212927c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f212928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f212929e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f212930f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f212931g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f212932h;

    /* renamed from: i, reason: collision with root package name */
    public int f212933i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f212934j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f212935k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f212936l;

    /* renamed from: m, reason: collision with root package name */
    public int f212937m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f212938n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.vfs.u f212939o;

    public f6(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f212925a = name;
        this.f212926b = name;
        this.f212935k = new java.util.HashMap();
        this.f212936l = kz5.p0.f313996d;
        this.f212938n = new java.util.HashSet();
    }

    public static /* synthetic */ void f(com.tencent.mm.vfs.f6 f6Var, long j17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = com.tencent.mm.vfs.d6.f212900d;
        }
        f6Var.e(j17, lVar);
    }

    public static void g(com.tencent.mm.vfs.f6 f6Var, long j17, long j18, yz5.l setup, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            setup = com.tencent.mm.vfs.e6.f212910d;
        }
        f6Var.getClass();
        kotlin.jvm.internal.o.g(setup, "setup");
        com.tencent.mm.vfs.i3 i3Var = new com.tencent.mm.vfs.i3(j17, true);
        i3Var.f212995d = j18;
        setup.invoke(i3Var);
        f6Var.i(i3Var.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.vfs.c6 b() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.f6.b():com.tencent.mm.vfs.c6");
    }

    public final void c(long j17) {
        i(new com.tencent.mm.vfs.m1(j17));
    }

    public final void d(int... flagList) {
        kotlin.jvm.internal.o.g(flagList, "flagList");
        int i17 = 0;
        for (int i18 : flagList) {
            i17 |= i18;
        }
        this.f212927c = a(i17, 8);
        this.f212928d = a(i17, 1);
        this.f212932h = a(i17, 4);
        this.f212933i = i17;
    }

    public final void e(long j17, yz5.l setup) {
        kotlin.jvm.internal.o.g(setup, "setup");
        com.tencent.mm.vfs.i3 i3Var = new com.tencent.mm.vfs.i3(j17, false);
        setup.invoke(i3Var);
        i(i3Var.b());
    }

    public final void h() {
        i(new com.tencent.mm.vfs.m4());
    }

    public final void i(com.tencent.mm.vfs.u uVar) {
        if (this.f212939o == null) {
            this.f212939o = uVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Clean policy can be set only once for \"" + this.f212925a + '\"');
    }

    public final void j(java.lang.String v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f212936l = kz5.b0.c(v17);
    }
}
