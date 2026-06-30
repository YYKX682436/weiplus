package wl4;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final wl4.w f447104a = new wl4.w();

    public final rl4.c a(bw5.eq0 id6, bw5.cq0 cq0Var) {
        kotlin.jvm.internal.o.g(id6, "id");
        int ordinal = id6.ordinal();
        if (ordinal == 0) {
            return wl4.a.f447083a;
        }
        if (ordinal == 3) {
            return wl4.f.f447088a;
        }
        if (ordinal == 4) {
            return wl4.b.f447084a;
        }
        if (ordinal == 7) {
            return wl4.d.f447086a;
        }
        if (ordinal == 8) {
            return wl4.v.f447103a;
        }
        if (ordinal != 9) {
            return new wl4.c(id6);
        }
        bw5.dq0 dq0Var = bw5.dq0.FloatBallTypeMusic;
        bw5.dq0 dq0Var2 = cq0Var != null ? cq0Var.f26200m[4] ? cq0Var.f26197g : dq0Var : null;
        if (dq0Var2 != null) {
            dq0Var = dq0Var2;
        }
        return new wl4.e(dq0Var);
    }
}
