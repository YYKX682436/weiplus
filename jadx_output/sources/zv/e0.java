package zv;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f475938b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f475939c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f475940d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f475941e = true;

    /* renamed from: a, reason: collision with root package name */
    public static final zv.e0 f475937a = new zv.e0();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f475942f = jz5.h.b(zv.w.f476123d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f475943g = jz5.h.b(zv.d0.f475928d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f475944h = jz5.h.b(zv.t.f476108d);

    /* renamed from: i, reason: collision with root package name */
    public static final zv.v f475945i = new zv.v();

    public final boolean a(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        if (!f475938b || !c()) {
            return false;
        }
        b(from);
        return true;
    }

    public final void b(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        ((ku5.t0) ku5.t0.f312615d).B(new zv.s(from));
    }

    public final boolean c() {
        zv.q qVar = zv.q.f476079a;
        if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsDestroyFlutterImmediately", 0) == 1) {
            return true;
        }
        if (f475940d < 0) {
            return false;
        }
        return java.lang.System.currentTimeMillis() - f475940d > ((long) com.tencent.mm.storage.c2.e()) * 1000;
    }
}
