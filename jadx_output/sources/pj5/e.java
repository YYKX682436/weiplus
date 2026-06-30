package pj5;

/* loaded from: classes8.dex */
public final class e implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f355371a;

    public e(long j17) {
        this.f355371a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        r45.lo5 it = (r45.lo5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return ((long) it.f379677f) * 1000 < this.f355371a;
    }
}
