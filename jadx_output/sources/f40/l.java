package f40;

/* loaded from: classes12.dex */
public final class l implements java.util.function.BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f40.k f259437a;

    public l(f40.k kVar) {
        this.f259437a = kVar;
    }

    @Override // java.util.function.BiFunction
    public java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        f40.k kVar = (f40.k) obj2;
        kotlin.jvm.internal.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        f40.k kVar2 = this.f259437a;
        if (kVar2.f259436c > 0 || kVar == null) {
            return kVar2;
        }
        kVar.f259434a = kVar2.f259434a;
        return kVar;
    }
}
