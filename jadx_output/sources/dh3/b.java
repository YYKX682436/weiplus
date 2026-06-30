package dh3;

/* loaded from: classes5.dex */
public final class b implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f232488a;

    public b(com.tencent.mm.storage.f9 f9Var) {
        this.f232488a = f9Var;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b(it.getValue(), dh3.c.f232489a.h(this.f232488a));
    }
}
