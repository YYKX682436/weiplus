package rn0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final rn0.a f397609a = new rn0.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f397610b;

    public final synchronized boolean a() {
        if (f397610b == null) {
            java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("android_live_rci", "");
            java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_android_live_rci", "");
            f397610b = java.lang.Boolean.FALSE;
            if (kotlin.jvm.internal.o.b(aj6, "1") || kotlin.jvm.internal.o.b(aj7, "1")) {
                f397610b = java.lang.Boolean.TRUE;
            }
            com.tencent.mars.xlog.Log.i("RciExpt", "liveUseRci=" + f397610b);
        }
        return kotlin.jvm.internal.o.b(f397610b, java.lang.Boolean.TRUE);
    }
}
