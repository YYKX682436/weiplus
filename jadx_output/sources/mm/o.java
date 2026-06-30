package mm;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f328536a = jz5.h.b(mm.n.f328535d);

    public static final boolean a() {
        if (b() || mm.l.a()) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    public static final boolean b() {
        return z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c;
    }

    public static final boolean c() {
        return d(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, 50000);
    }

    public static final boolean d(java.lang.String diceKey, int i17) {
        kotlin.jvm.internal.o.g(diceKey, "diceKey");
        jz5.g gVar = f328536a;
        if (((java.util.Map) ((jz5.n) gVar).getValue()).containsKey(diceKey)) {
            return kotlin.jvm.internal.o.b(java.lang.Boolean.TRUE, ((java.util.Map) ((jz5.n) gVar).getValue()).get(diceKey));
        }
        j62.e g17 = j62.e.g();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = diceKey.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        boolean z17 = false;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(g17.a("clicfg_battery_dice_".concat(lowerCase), java.lang.String.valueOf(i17), false, true), 0);
        if (D1 < 10) {
            D1 = 10;
        }
        double random = java.lang.Math.random();
        if (D1 >= 1 && random < 1 / D1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.battery.dice", "dice hit, go kv stat!");
            z17 = true;
        }
        ((java.util.Map) ((jz5.n) gVar).getValue()).put(diceKey, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static final boolean e() {
        return mm.l.c() && mm.m.f328527h.h();
    }

    public static final boolean f() {
        if (!(a() || e() || mm.m.f328525f.h())) {
            return false;
        }
        if (b() || !e()) {
            return a() || mm.m.f328526g.h();
        }
        return false;
    }

    public static final boolean g() {
        return a() || mm.m.f328529m.h();
    }

    public static boolean h(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if (a()) {
            return true;
        }
        return (mm.l.c() && !z17) || mm.m.f328530n.h();
    }

    public static final boolean i(boolean z17) {
        return a() || (mm.l.c() && !z17) || mm.m.f328531o.h();
    }

    public static /* synthetic */ boolean j(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return i(z17);
    }

    public static final boolean k(int i17) {
        long j17 = i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() % j17;
        return currentTimeMillis + (j17 & (((currentTimeMillis ^ j17) & ((-currentTimeMillis) | currentTimeMillis)) >> 63)) == 0;
    }
}
