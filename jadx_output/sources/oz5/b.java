package oz5;

/* loaded from: classes14.dex */
public abstract class b implements oz5.j {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f350322d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.j f350323e;

    public b(oz5.j baseKey, yz5.l safeCast) {
        kotlin.jvm.internal.o.g(baseKey, "baseKey");
        kotlin.jvm.internal.o.g(safeCast, "safeCast");
        this.f350322d = safeCast;
        this.f350323e = baseKey instanceof oz5.b ? ((oz5.b) baseKey).f350323e : baseKey;
    }
}
