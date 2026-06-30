package x03;

/* loaded from: classes15.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451069d;

    public l0(x03.u0 u0Var) {
        this.f451069d = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        x03.u0 u0Var = this.f451069d;
        u0Var.f451145m = new com.tencent.mm.sdk.platformtools.b4(new x03.k0(u0Var), true);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = u0Var.f451145m;
        kotlin.jvm.internal.o.d(b4Var2);
        boolean e17 = b4Var2.e();
        if (u0Var.f451142j && e17 && (b4Var = u0Var.f451145m) != null) {
            b4Var.c(500L, 500L);
        }
    }
}
