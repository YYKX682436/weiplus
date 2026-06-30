package vy3;

/* loaded from: classes.dex */
public final class i extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.i f441472e = new vy3.i();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.sdk.platformtools.n2.c(env.f340860a);
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openGpsSetting";
    }
}
