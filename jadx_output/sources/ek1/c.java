package ek1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ek1.c f253406a = new ek1.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f253407b = jz5.h.b(ek1.b.f253405d);

    public final void a() {
        if (ek1.a.c() && ek1.a.b()) {
            jz5.g gVar = f253407b;
            long j17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getLong("KEY_LAST_CHECK_TIMESTAMP", 0L);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (java.lang.System.currentTimeMillis() - j17 <= java.util.concurrent.TimeUnit.MINUTES.toMillis(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_appbrand_recommend_plugin_pkg_prefetch_interval, 60L))) {
                return;
            }
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putLong("KEY_LAST_CHECK_TIMESTAMP", java.lang.System.currentTimeMillis());
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).h8("gh_b489f391e008@app", 0);
        }
    }
}
