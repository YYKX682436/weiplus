package wj;

/* loaded from: classes8.dex */
public final class v implements java.util.function.BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f446535b;

    public v(yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        this.f446534a = lVar;
        this.f446535b = c0Var;
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Set set = (java.util.Set) obj2;
        kotlin.jvm.internal.o.g((wj.t0) obj, "<anonymous parameter 0>");
        yz5.l lVar = this.f446534a;
        if (set == null) {
            return kz5.p1.e(lVar);
        }
        set.add(lVar);
        this.f446535b.f310112d = false;
        return set;
    }
}
