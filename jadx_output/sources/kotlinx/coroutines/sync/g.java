package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public abstract class g extends kotlinx.coroutines.internal.t implements kotlinx.coroutines.s1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310651h = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.sync.g.class, "isTaken");

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f310652g;
    private volatile /* synthetic */ int isTaken = 0;

    public g(kotlinx.coroutines.sync.k kVar, java.lang.Object obj) {
        this.f310652g = obj;
    }

    public abstract void u();

    public abstract boolean w();
}
