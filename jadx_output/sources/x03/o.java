package x03;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451082d;

    public o(x03.i0 i0Var) {
        this.f451082d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        x03.i0 i0Var = this.f451082d;
        i0Var.f451056m = new com.tencent.mm.sdk.platformtools.b4(new x03.n(i0Var), true);
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = i0Var.f451056m;
        kotlin.jvm.internal.o.d(b4Var2);
        boolean e17 = b4Var2.e();
        if (i0Var.f451052i && e17 && (b4Var = i0Var.f451056m) != null) {
            b4Var.c(500L, 500L);
        }
    }
}
