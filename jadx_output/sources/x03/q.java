package x03;

/* loaded from: classes15.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451102d;

    public q(x03.i0 i0Var) {
        this.f451102d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.i0 i0Var = this.f451102d;
        i0Var.f451057n = new com.tencent.mm.sdk.platformtools.b4(new x03.p(i0Var), true);
        com.tencent.mm.sdk.platformtools.b4 b4Var = i0Var.f451057n;
        if (b4Var != null) {
            b4Var.c(500L, 500L);
        }
    }
}
