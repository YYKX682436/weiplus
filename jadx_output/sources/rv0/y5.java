package rv0;

/* loaded from: classes5.dex */
public final class y5 implements rv0.q4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400344a;

    public y5(rv0.z6 z6Var) {
        this.f400344a = z6Var;
    }

    public void a() {
        ex0.r n17;
        rv0.z6 z6Var = this.f400344a;
        ex0.a0 v76 = z6Var.v7();
        if (v76 == null || (n17 = v76.n()) == null) {
            return;
        }
        com.tencent.maas.model.time.MJTime add = n17.k().add(z6Var.s7());
        gx0.bf t76 = z6Var.t7();
        kotlin.jvm.internal.o.d(add);
        t76.getClass();
        t76.M = add;
    }
}
