package rv0;

/* loaded from: classes5.dex */
public final class x implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400319e;

    public x(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f400318d = n1Var;
        this.f400319e = a0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        cx0.c cVar = (cx0.c) obj;
        rv0.n1 n1Var = this.f400318d;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r76 = n1Var.r7();
        kotlin.jvm.internal.o.d(cVar);
        r76.n(cVar);
        n1Var.w7();
        java.util.List list = cVar.f224500a;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.maas.base.MJID mjid = ((cx0.b) it.next()).f224496a;
                ex0.a0 a0Var = this.f400319e;
                ex0.r K = a0Var.K(mjid);
                if (K != null && a0Var.f257097g.e(K)) {
                    kotlinx.coroutines.l.d(n1Var.getLifecycleScope(), null, null, new rv0.w(a0Var, K, null), 3, null);
                }
            }
        }
    }
}
