package f26;

/* loaded from: classes16.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.l f259182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f26.l lVar) {
        super(1);
        this.f259182d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f26.h supertypes = (f26.h) obj;
        kotlin.jvm.internal.o.g(supertypes, "supertypes");
        f26.l lVar = this.f259182d;
        ((o06.b2) lVar.e()).getClass();
        java.util.Collection superTypes = supertypes.f259167a;
        kotlin.jvm.internal.o.g(superTypes, "superTypes");
        boolean isEmpty = superTypes.isEmpty();
        java.util.Collection collection = superTypes;
        if (isEmpty) {
            f26.o0 d17 = lVar.d();
            java.util.Collection c17 = d17 != null ? kz5.b0.c(d17) : null;
            if (c17 == null) {
                c17 = kz5.p0.f313996d;
            }
            collection = c17;
        }
        java.util.List list = collection instanceof java.util.List ? (java.util.List) collection : null;
        if (list == null) {
            list = kz5.n0.S0(collection);
        }
        java.util.List g17 = lVar.g(list);
        kotlin.jvm.internal.o.g(g17, "<set-?>");
        supertypes.f259168b = g17;
        return jz5.f0.f302826a;
    }
}
