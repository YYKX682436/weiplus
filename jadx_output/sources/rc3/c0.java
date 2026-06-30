package rc3;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(rc3.w0 w0Var) {
        super(0);
        this.f393960d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393960d;
        w0Var.f394099t = 4;
        com.tencent.mars.xlog.Log.i(w0Var.f394105z, "onMainScriptInjected");
        je3.o oVar = w0Var.f394103x;
        if (oVar != null) {
            oVar.c();
        }
        java.util.Iterator it = w0Var.f394092m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).n();
        }
        return jz5.f0.f302826a;
    }
}
