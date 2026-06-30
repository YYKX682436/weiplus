package rc3;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rc3.w0 w0Var) {
        super(0);
        this.f393944d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393944d;
        java.lang.String str = w0Var.f394105z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do check server exist: ");
        sb6.append(w0Var.A != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (w0Var.A == null) {
            je3.o oVar = w0Var.f394103x;
            if (oVar != null && oVar.f299307c == 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                oVar.f299307c = android.os.SystemClock.elapsedRealtime();
            }
            if (w0Var.B == null) {
                w0Var.f394089g.invoke(w0Var.f394087e);
            }
        }
        return jz5.f0.f302826a;
    }
}
