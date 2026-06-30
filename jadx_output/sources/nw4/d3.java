package nw4;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final nw4.d3 f340821a = new nw4.d3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f340822b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final nw4.c3 f340823c = nw4.c3.f340812b;

    public final boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        nw4.j g17 = env.f340863d.g();
        if (g17 != null && g17.b(env, msg) && g17.a(env, msg)) {
            return true;
        }
        for (nw4.j jVar : f340822b) {
            if (jVar.b(env, msg) && jVar.a(env, msg)) {
                return true;
            }
        }
        nw4.c3 c3Var = f340823c;
        return c3Var.b(env, msg) && c3Var.a(env, msg);
    }
}
