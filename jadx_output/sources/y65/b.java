package y65;

/* loaded from: classes10.dex */
public final class b implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459664a;

    public b(java.lang.String str) {
        this.f459664a = str;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        return kotlin.jvm.internal.o.b(((w65.m) obj).id(), this.f459664a);
    }
}
