package yu0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final yu0.f f465810a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f465811b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f465812c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f465813d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f465814e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f465815f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f465816g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.c0 f465817h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f465818i;

    public m(yu0.f executor) {
        kotlin.jvm.internal.o.g(executor, "executor");
        this.f465810a = executor;
        this.f465811b = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f465812c = kotlinx.coroutines.sync.l.a(false, 1, null);
        this.f465813d = new java.util.concurrent.ConcurrentHashMap();
        this.f465814e = new java.util.concurrent.ConcurrentHashMap();
        this.f465815f = new java.util.concurrent.ConcurrentHashMap();
        int i17 = kotlinx.coroutines.r0.N0;
        this.f465816g = new yu0.j(kotlinx.coroutines.q0.f310567d, this);
        kotlinx.coroutines.c0 a17 = kotlinx.coroutines.t3.a(null, 1, null);
        this.f465817h = a17;
        this.f465818i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(a17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: all -> 0x0106, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0106, blocks: (B:11:0x0058, B:12:0x0070, B:15:0x0078, B:17:0x0080, B:21:0x008c, B:23:0x0094, B:25:0x009a, B:31:0x00a7, B:32:0x00e3, B:34:0x00e9), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff A[EDGE_INSN: B:46:0x00ff->B:43:0x00ff BREAK  A[LOOP:0: B:12:0x0070->B:36:0x0070], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yu0.m r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yu0.m.a(yu0.m, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        this.f465810a.cancel();
        kotlinx.coroutines.l.d(this.f465818i, null, null, new yu0.i(this, null), 3, null);
    }
}
