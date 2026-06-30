package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final long f310614a = kotlinx.coroutines.internal.m0.a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, com.tencent.wcdb.core.Database.DictDefaultMatchValue);

    /* renamed from: b, reason: collision with root package name */
    public static final int f310615b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f310616c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f310617d;

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.scheduling.i f310618e;

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.scheduling.k f310619f;

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.scheduling.k f310620g;

    static {
        int i17 = kotlinx.coroutines.internal.n0.f310511a;
        f310615b = kotlinx.coroutines.internal.m0.b("kotlinx.coroutines.scheduler.core.pool.size", i17 < 2 ? 2 : i17, 1, 0, 8, null);
        f310616c = kotlinx.coroutines.internal.m0.b("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f310617d = java.util.concurrent.TimeUnit.SECONDS.toNanos(kotlinx.coroutines.internal.m0.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, com.tencent.wcdb.core.Database.DictDefaultMatchValue));
        f310618e = kotlinx.coroutines.scheduling.g.f310610a;
        f310619f = new kotlinx.coroutines.scheduling.l(0);
        f310620g = new kotlinx.coroutines.scheduling.l(1);
    }
}
