package if3;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f291168a = gm0.j1.b().h();

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.concurrent.Future f291169b;

    public static final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b() ? com.tencent.mm.vfs.q7.c("MassSendImg") : com.tencent.mm.vfs.q7.c("image"));
        sb6.append('/');
        return sb6.toString();
    }

    public static final boolean b() {
        return com.tencent.mm.sdk.platformtools.o4.L().getBoolean("masssend_image_migration_enabled_" + f291168a, false);
    }

    public static final void c(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("masssend_image_migration_done_" + f291168a, false) || !b()) {
            return;
        }
        java.util.concurrent.Future future = f291169b;
        if (future == null) {
            future = ((ku5.t0) ku5.t0.f312615d).a(if3.e0.f291166d);
            f291169b = future;
        }
        if (z17) {
            future.get();
        }
    }
}
