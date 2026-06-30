package qo1;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f365545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.v0 f365546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kotlin.jvm.internal.f0 f0Var, qo1.v0 v0Var) {
        super(0);
        this.f365545d = f0Var;
        this.f365546e = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f365545d.f310116d;
        if (i17 != 0) {
            return java.lang.Integer.valueOf(i17);
        }
        qo1.v0 v0Var = this.f365546e;
        java.lang.Object obj = v0Var.f365492r;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        java.util.HashMap hashMap = (java.util.HashMap) obj;
        if (!hashMap.isEmpty()) {
            v0Var.f365492r = hashMap;
            v0Var.f365491q = new qo1.q0(v0Var);
            return 0;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackupTask", "convs.size=" + hashMap.size());
        nf.e.f(qo1.p0.f365540d);
        return 1;
    }
}
