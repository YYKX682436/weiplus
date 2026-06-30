package sc3;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sc3.k1 k1Var, int i17) {
        super(0);
        this.f406532d = k1Var;
        this.f406533e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc3.k1 k1Var = this.f406532d;
        java.lang.String str = k1Var.Q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy with ");
        int i17 = this.f406533e;
        sb6.append(i17);
        sb6.append(" localStatus:");
        sb6.append(k1Var.G);
        sb6.append(", need destroy ");
        sb6.append(k1Var.f406474J);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!k1Var.f406474J) {
            k1Var.f406474J = true;
            k1Var.v1();
            java.lang.String instanceName = k1Var.f406476e;
            yz5.l lVar = k1Var.f406479h;
            if (lVar != null) {
                lVar.invoke(instanceName);
            }
            k1Var.uc();
            if (k1Var.f406485q != null) {
                if (k1Var.K0()) {
                    ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Bi((qk.u6) ((jz5.n) k1Var.H).getValue());
                }
                k1Var.M0().O(new sc3.s(k1Var, i17));
                k1Var.M0().destroy();
            } else {
                com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
                kotlin.jvm.internal.o.g(instanceName, "instanceName");
                java.util.Set set = com.tencent.mm.plugin.magicbrush.a5.f147840e;
                synchronized (set) {
                    set.remove(instanceName);
                    com.tencent.mm.plugin.magicbrush.a5.f147839d = a5Var.a(set);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
