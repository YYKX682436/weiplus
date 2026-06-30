package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f150141a;

    /* renamed from: b, reason: collision with root package name */
    public static int f150142b;

    /* renamed from: c, reason: collision with root package name */
    public static int f150143c;

    /* renamed from: d, reason: collision with root package name */
    public static int f150144d;

    /* renamed from: e, reason: collision with root package name */
    public static int f150145e;

    /* renamed from: f, reason: collision with root package name */
    public static int f150146f;

    /* renamed from: g, reason: collision with root package name */
    public static int f150147g;

    /* renamed from: h, reason: collision with root package name */
    public static int f150148h;

    /* renamed from: i, reason: collision with root package name */
    public static int f150149i;

    public static void a(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        zj3.g gVar = zj3.g.f473302a;
        g0Var.d(26010, valueOf, java.lang.Long.valueOf(zj3.g.f473303b), 0L, java.lang.Integer.valueOf(sj3.a1.f408392J));
    }

    public static final void b(int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, i17, i18, false);
    }

    public static final void c(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(220);
        iDKey.SetKey(3);
        iDKey.SetValue(1L);
        arrayList.add(iDKey);
        if (z17) {
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(220);
            iDKey2.SetKey(4);
            iDKey2.SetValue(1L);
            arrayList.add(iDKey2);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
    }

    public static final void d(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(220);
        iDKey.SetKey(5);
        iDKey.SetValue(1L);
        arrayList.add(iDKey);
        if (z17) {
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(220);
            iDKey2.SetKey(6);
            iDKey2.SetValue(1L);
            arrayList.add(iDKey2);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
    }

    public static final void e(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12723, java.lang.Integer.valueOf(i17), str);
    }

    public static final void f(int i17, boolean z17, int i18, java.lang.String str, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12727, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i19));
    }

    public static final void g(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19424, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(i18), str);
    }

    public static void h(boolean z17, boolean z18) {
        int i17 = !z17 ? 2 : 1;
        int i18 = z18 ? 1 : 2;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        zj3.g gVar = zj3.g.f473302a;
        g0Var.d(19424, valueOf, 0L, java.lang.Integer.valueOf(i18), zj3.g.f473308g, java.lang.Long.valueOf(zj3.g.f473303b));
    }
}
