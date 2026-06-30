package sr2;

/* loaded from: classes10.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry2.r0 f411603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f411604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, ry2.r0 r0Var, kotlin.jvm.internal.g0 g0Var) {
        super(0);
        this.f411602d = postMainUIC;
        this.f411603e = r0Var;
        this.f411604f = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411602d;
        ry2.o k76 = postMainUIC.k7();
        androidx.appcompat.app.AppCompatActivity activity = postMainUIC.getActivity();
        java.lang.String T6 = postMainUIC.F7().T6();
        ry2.r0 r0Var = this.f411603e;
        java.util.ArrayList c17 = postMainUIC.F7().d7().b().c();
        aw2.a aVar = postMainUIC.f122527s;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("activityWidget");
            throw null;
        }
        r45.xl2 activityEvent = aVar.f14720g.getActivityEvent();
        java.util.LinkedList i76 = postMainUIC.i7();
        long j17 = this.f411604f.f310121d;
        java.lang.String str = (java.lang.String) ((jz5.n) postMainUIC.R).getValue();
        kotlin.jvm.internal.o.f(str, "access$getVstId(...)");
        long b17 = k76.b(activity, T6, r0Var, c17, activityEvent, i76, j17, str);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "ready to post");
        dq.b b18 = cq.k1.b();
        r45.t11 t11Var = this.f411603e.f401480r;
        b18.c(t11Var != null ? t11Var.getString(0) : null);
        b18.b(null);
        if (!postMainUIC.k7().R) {
            pm0.v.X(new sr2.s3(postMainUIC, b17, 0L));
        }
        return jz5.f0.f302826a;
    }
}
