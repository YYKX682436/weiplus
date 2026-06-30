package kotlinx.coroutines;

/* loaded from: classes14.dex */
public class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310171b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.e0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f310172a;

    public e0(java.lang.Throwable th6, boolean z17) {
        this.f310172a = th6;
        this._handled = z17 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '[' + this.f310172a + ']';
    }

    public /* synthetic */ e0(java.lang.Throwable th6, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(th6, (i17 & 2) != 0 ? false : z17);
    }
}
