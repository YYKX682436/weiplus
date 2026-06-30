package vi1;

/* loaded from: classes7.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437506d;

    public y0(vi1.b1 b1Var) {
        this.f437506d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.l2 l2Var = vi1.l2.f437401a;
        vi1.b1 b1Var = this.f437506d;
        vi1.j2 a17 = l2Var.a(b1Var.f437274b);
        if (a17 != null) {
            vi1.j2 a18 = l2Var.a(b1Var.f437274b);
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437368q) : null;
            kotlin.jvm.internal.o.d(valueOf);
            a17.f437368q = valueOf.longValue() + 1;
        }
        java.lang.String string = b1Var.f437273a.getString(com.tencent.mm.R.string.f490151mc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        b1Var.a(string);
    }
}
