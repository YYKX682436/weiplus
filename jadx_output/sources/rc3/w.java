package rc3;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(rc3.w0 w0Var) {
        super(0);
        this.f394085d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394085d;
        w0Var.f394099t = 16;
        com.tencent.mars.xlog.Log.i(w0Var.f394105z, "onDestroy");
        je3.o oVar = w0Var.f394103x;
        if (oVar != null) {
            oVar.a();
        }
        java.util.Iterator it = w0Var.f394092m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).onDestroy(1);
        }
        w0Var.j();
        return jz5.f0.f302826a;
    }
}
