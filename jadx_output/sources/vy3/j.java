package vy3;

/* loaded from: classes.dex */
public final class j extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.j f441473e = new vy3.j();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = env.f340860a;
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.y9.NAME;
    }
}
