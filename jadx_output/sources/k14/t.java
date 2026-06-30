package k14;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final k14.t f303377a = new k14.t();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f303378b = jz5.h.b(k14.s.f303372d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f303379c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f303380d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f303381e;

    public final void a(kotlinx.coroutines.y0 lifecycleScope) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        com.tencent.mars.xlog.Log.i("MicroMsg.HearingAidDownloadResource", "downloadResource!");
        kotlinx.coroutines.r2 r2Var = f303381e;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        f303381e = kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new k14.p(null), 2, null);
    }

    public final boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIsDownloaded! downloaded state is ");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f303379c;
        sb6.append(atomicBoolean);
        sb6.append(",downloading state is ");
        sb6.append(f303380d);
        com.tencent.mars.xlog.Log.i("MicroMsg.HearingAidDownloadResource", sb6.toString());
        return atomicBoolean.get();
    }

    public final boolean c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIsDownloading! downloaded state is ");
        sb6.append(f303379c);
        sb6.append(",downloading state is ");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f303380d;
        sb6.append(atomicBoolean);
        com.tencent.mars.xlog.Log.i("MicroMsg.HearingAidDownloadResource", sb6.toString());
        return atomicBoolean.get();
    }

    public final u14.z d() {
        return (u14.z) ((jz5.n) f303378b).getValue();
    }

    public final void e() {
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        d().getClass();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_902ac54f", "hearing_aid_audio_zip");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f303380d;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = f303379c;
        if (Ui != null) {
            atomicBoolean2.set(true);
        } else if (!atomicBoolean.get()) {
            atomicBoolean2.set(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HearingAidDownloadResource", "updateDownloaded! downloaded state is " + atomicBoolean2 + ",downloading state is " + atomicBoolean);
    }
}
