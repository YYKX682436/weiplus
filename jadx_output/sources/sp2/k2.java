package sp2;

/* loaded from: classes2.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f411065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f411065d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<so2.j5> it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.isEmpty()) {
            for (so2.j5 j5Var : it) {
                if (j5Var instanceof vp2.d) {
                    com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2.f122043n.a((wp2.b) j5Var, true);
                }
            }
            kotlin.jvm.internal.f0 f0Var = this.f411065d;
            int size = f0Var.f310116d - it.size();
            if (size < 0) {
                size = 0;
            }
            f0Var.f310116d = size;
        }
        return jz5.f0.f302826a;
    }
}
