package je2;

/* loaded from: classes3.dex */
public final class o implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.oq1 f299251a;

    public o(r45.oq1 oq1Var) {
        this.f299251a = oq1Var;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        r45.ad5 it = (r45.ad5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b(it.getString(5), this.f299251a.f382441d);
    }
}
