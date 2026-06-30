package n0;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.h f333508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f333509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n0.h hVar, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f333508d = hVar;
        this.f333509e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.h hVar = this.f333508d;
        java.lang.Object obj2 = hVar.f333521e;
        kotlin.jvm.internal.h0 h0Var = this.f333509e;
        synchronized (obj2) {
            java.util.List list = hVar.f333523g;
            java.lang.Object obj3 = h0Var.f310123d;
            if (obj3 == null) {
                kotlin.jvm.internal.o.o("awaiter");
                throw null;
            }
            list.remove((n0.f) obj3);
        }
        return jz5.f0.f302826a;
    }
}
