package r2;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f368761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u1.y1 y1Var) {
        super(2);
        this.f368761d = y1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        u1.w set = (u1.w) obj;
        o4.g it = (o4.g) obj2;
        kotlin.jvm.internal.o.g(set, "$this$set");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj3 = this.f368761d.f423724a;
        kotlin.jvm.internal.o.d(obj3);
        ((r2.h0) obj3).setSavedStateRegistryOwner(it);
        return jz5.f0.f302826a;
    }
}
