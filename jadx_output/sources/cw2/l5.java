package cw2;

/* loaded from: classes10.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public static final cw2.l5 f223835a = new cw2.l5();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f223836b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f223837c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f223838d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f223839e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f223840f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Integer f223841g;

    /* renamed from: h, reason: collision with root package name */
    public static int f223842h;

    public final void a() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_video_enable_h266_download, false);
        int a17 = wo.r.a();
        int i17 = (a17 >> 12) & 15;
        int i18 = a17 & 255;
        int i19 = android.os.Build.VERSION.SDK_INT;
        long j17 = 1024;
        long g17 = (oj.d.g(com.tencent.mm.sdk.platformtools.x2.f193071a) / j17) / j17;
        int f17 = rs0.n.f399306d.f();
        f223842h = f17;
        boolean z17 = i17 >= 4;
        boolean z18 = i18 >= 70;
        boolean z19 = g17 >= 4096;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z27 = f17 >= ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127908r3).getValue()).r()).intValue();
        boolean z28 = com.tencent.mm.sdk.platformtools.z.f193115k;
        boolean z29 = z17 && z18 && z19 && z27 && z28;
        com.tencent.mars.xlog.Log.i("ThumbPlayer.MMTPPlayerH266Ability", "checkDeviceSupportH266LocalAbility, cpuFlags:%s, nCores:%s, nFreq:%s, gpuScore %s sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s gpucheck:%s isARM64:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(f223842h), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(g17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), true, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28));
        if (!z29) {
            fj6 = false;
        }
        java.lang.String m17 = wo.w0.m();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = m17.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_video_disable_h266_download, "", true);
        kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi) && r26.n0.B(Zi, lowerCase, false)) {
            com.tencent.mars.xlog.Log.i("ThumbPlayer.MMTPPlayerH266Ability", "h266 switch model %s is hit, expt:%s", lowerCase, Zi);
            fj6 = false;
        }
        boolean z37 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127890q3).getValue()).r()).intValue() > 0;
        f223836b = java.lang.Boolean.valueOf(fj6 || z37);
        com.tencent.mars.xlog.Log.i("ThumbPlayer.MMTPPlayerH266Ability", "h266 switch configResult: %s debugH266Switch:%s deviceAbility: %s ", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z37), java.lang.Boolean.valueOf(z29));
    }

    public final void b() {
        int f17 = rs0.n.f399306d.f();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127925s3).getValue()).r()).intValue();
        f223837c = java.lang.Boolean.valueOf(f17 >= intValue);
        com.tencent.mars.xlog.Log.i("ThumbPlayer.MMTPPlayerH266Ability", "1080p gpu scroe %s gpuThreshold: %s ", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(intValue));
    }

    public final void c() {
        int f17 = rs0.n.f399306d.f();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127943t3).getValue()).r()).intValue();
        f223838d = java.lang.Boolean.valueOf(f17 >= intValue);
        com.tencent.mars.xlog.Log.i("ThumbPlayer.MMTPPlayerH266Ability", "720p gpu scroe %s gpuThreshold: %s ", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(intValue));
    }

    public final void d() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127961u3).getValue()).r()).intValue() > 0);
        f223839e = valueOf;
        com.tencent.mars.xlog.Log.i("ThumbPlayer.MMTPPlayerH266Ability", "check level order is suppor: %s ", valueOf);
    }

    public final boolean e() {
        if (f223836b == null) {
            a();
        }
        java.lang.Boolean bool = f223836b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
