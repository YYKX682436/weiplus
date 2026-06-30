package th5;

/* loaded from: classes12.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f419483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.o f419484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(th5.g0 g0Var, th5.o oVar) {
        super(0);
        this.f419483d = g0Var;
        this.f419484e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        th5.g0 g0Var = this.f419483d;
        g0Var.getClass();
        th5.o item = this.f419484e;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String id6 = item.getId();
        java.util.Map map = g0Var.f419381g;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) ((java.util.LinkedHashMap) map).get(id6);
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        map.remove(id6);
        item.f419424i = 0.0f;
        item.f419426k = null;
        v65.i.c(g0Var.f418948f, null, new th5.y(item, null), 1, null);
        item.f419421f = mf3.w.f326128d;
        g0Var.X6(item);
        return jz5.f0.f302826a;
    }
}
