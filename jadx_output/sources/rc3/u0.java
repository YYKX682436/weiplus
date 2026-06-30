package rc3;

/* loaded from: classes7.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(rc3.w0 w0Var) {
        super(0);
        this.f394081d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394081d;
        boolean a17 = bf3.h0.a(w0Var.f394099t, 2);
        java.lang.String str = w0Var.f394105z;
        if (a17) {
            com.tencent.mars.xlog.Log.w(str, "start in wrong status " + w0Var.f394099t + " , discard event");
        } else {
            w0Var.f394101v = true;
            je3.o oVar = w0Var.f394103x;
            if (oVar != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                oVar.f299311g = android.os.SystemClock.elapsedRealtime();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, has service?");
            sb6.append(w0Var.A != null);
            com.tencent.mm.sdk.platformtools.Log.c(str, sb6.toString(), new java.lang.Object[0]);
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.D1();
            }
        }
        return jz5.f0.f302826a;
    }
}
