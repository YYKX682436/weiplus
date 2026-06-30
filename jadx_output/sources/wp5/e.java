package wp5;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f448464b;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.weapp_core.CellularNetworkHandler f448467e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.weapp_core.InitLoader f448468f;

    /* renamed from: a, reason: collision with root package name */
    public static final wp5.e f448463a = new wp5.e();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f448465c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final xp5.a f448466d = new xp5.a();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0012, B:12:0x0018, B:15:0x0028, B:20:0x0036, B:23:0x0055, B:24:0x0060), top: B:7:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {, blocks: (B:8:0x0012, B:12:0x0018, B:15:0x0028, B:20:0x0036, B:23:0x0055, B:24:0x0060), top: B:7:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.content.Context r3, wp5.a r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "libraryLoader"
            kotlin.jvm.internal.o.g(r4, r0)
            boolean r0 = wp5.e.f448464b
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.Object r0 = wp5.e.f448465c
            monitor-enter(r0)
            boolean r1 = wp5.e.f448464b     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L18
            monitor-exit(r0)
            return
        L18:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.o.f(r3, r1)     // Catch: java.lang.Throwable -> L61
            android.content.Context r1 = defpackage.j.f296172a     // Catch: java.lang.Throwable -> L61
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L33
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch: java.lang.Throwable -> L61
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Throwable -> L61
            if (r1 != r3) goto L31
            goto L33
        L31:
            r1 = 0
            goto L34
        L33:
            r1 = r2
        L34:
            if (r1 == 0) goto L55
            android.content.ContextWrapper r1 = new android.content.ContextWrapper     // Catch: java.lang.Throwable -> L61
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L61
            defpackage.j.f296172a = r1     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "weapp_core"
            r4.a(r3)     // Catch: java.lang.Throwable -> L61
            wp5.b r3 = new wp5.b     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            wp5.e.f448468f = r3     // Catch: java.lang.Throwable -> L61
            r3.init()     // Catch: java.lang.Throwable -> L61
            wp5.e r3 = wp5.e.f448463a     // Catch: java.lang.Throwable -> L61
            r3.b()     // Catch: java.lang.Throwable -> L61
            wp5.e.f448464b = r2     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            return
        L55:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "Check failed."
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L61
            throw r3     // Catch: java.lang.Throwable -> L61
        L61:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wp5.e.a(android.content.Context, wp5.a):void");
    }

    public final void b() {
        f448467e = new wp5.c();
        xp5.a aVar = f448466d;
        wp5.d dVar = new wp5.d();
        aVar.getClass();
        synchronized (aVar.f455963d) {
            if (!aVar.f455961b.contains(dVar)) {
                aVar.f455961b.add(dVar);
            }
        }
    }
}
