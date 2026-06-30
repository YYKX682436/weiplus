package ls1;

/* loaded from: classes8.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f320986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f320987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, ls1.e0 e0Var) {
        super(0);
        this.f320986d = i17;
        this.f320987e = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ls1.j0.f320996b;
        int i17 = this.f320986d;
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        ls1.e0 e0Var = this.f320987e;
        if (kotlin.jvm.internal.o.b(obj, e0Var)) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
            e0Var.getClass();
            pm0.v.X(new com.tencent.mm.plugin.webview.core.w(e0Var));
            com.tencent.mars.xlog.Log.e("MicroMsg.Preload.TmplWebViewManager", "remove preload when tmpl fail:" + i17 + ", " + e0Var.U());
        }
        return jz5.f0.f302826a;
    }
}
