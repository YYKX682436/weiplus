package yw;

/* loaded from: classes11.dex */
public final class w1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f466488b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f466489c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f466490d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f466491e = true;

    /* renamed from: a, reason: collision with root package name */
    public static final yw.w1 f466487a = new yw.w1();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f466492f = jz5.h.b(yw.p1.f466422d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f466493g = jz5.h.b(yw.v1.f466482d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f466494h = jz5.h.b(yw.m1.f466399d);

    /* renamed from: i, reason: collision with root package name */
    public static final yw.o1 f466495i = new yw.o1();

    public final boolean a(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        if (!f466488b || !c()) {
            return false;
        }
        b(from);
        return true;
    }

    public final void b(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        ((ku5.t0) ku5.t0.f312615d).B(new yw.l1(from));
    }

    public final boolean c() {
        if (f466490d < 0) {
            return false;
        }
        return java.lang.System.currentTimeMillis() - f466490d > ((long) com.tencent.mm.storage.c2.e()) * 1000;
    }
}
