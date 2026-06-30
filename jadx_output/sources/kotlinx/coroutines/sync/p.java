package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f310670a = kotlinx.coroutines.internal.m0.b("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310671b = new kotlinx.coroutines.internal.l0("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310672c = new kotlinx.coroutines.internal.l0("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310673d = new kotlinx.coroutines.internal.l0("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310674e = new kotlinx.coroutines.internal.l0("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    public static final int f310675f = kotlinx.coroutines.internal.m0.b("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static kotlinx.coroutines.sync.m a(int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        return new kotlinx.coroutines.sync.o(i17, i18);
    }
}
