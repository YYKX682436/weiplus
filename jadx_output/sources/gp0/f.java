package gp0;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final gp0.f f274170a = new gp0.f();

    /* renamed from: b, reason: collision with root package name */
    public static volatile fp0.o f274171b;

    public final fp0.o a() {
        if (f274171b == null) {
            synchronized (kotlin.jvm.internal.i0.a(fp0.o.class)) {
                f274171b = new fp0.o(new gp0.g(new gp0.b(Integer.MAX_VALUE, Integer.MAX_VALUE), new gp0.h(3, 5), new gp0.h(3, 5), new gp0.h(3, 5), 3, "imageLoader"));
            }
        }
        fp0.o oVar = f274171b;
        kotlin.jvm.internal.o.d(oVar);
        return oVar;
    }
}
