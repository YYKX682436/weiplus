package dq0;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f242339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dq0.a0 a0Var) {
        super(0);
        this.f242339d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.k0 k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onDestroy");
        dq0.a0 a0Var = this.f242339d;
        hq0.i0 t17 = a0Var.t();
        if (t17 != null && (k0Var = t17.f282998m) != null) {
            java.util.Collection values = k0Var.f283028a.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = kz5.n0.S0(values).iterator();
            while (it.hasNext()) {
                a0Var.q((hq0.j0) it.next());
            }
        }
        return jz5.f0.f302826a;
    }
}
