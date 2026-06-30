package rc3;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rc3.w0 w0Var) {
        super(0);
        this.f393959d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393959d;
        com.tencent.mars.xlog.Log.i(w0Var.f394105z, "cleanupByConnError");
        je3.i.t8(je3.k.f299298e, w0Var.f394102w, "onConnException", "", null, 1.0E-4f, 8, null);
        w0Var.f394099t = 16;
        java.util.Iterator it = w0Var.f394092m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).b1();
        }
        w0Var.j();
        return jz5.f0.f302826a;
    }
}
