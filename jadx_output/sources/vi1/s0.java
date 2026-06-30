package vi1;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437445d;

    public s0(vi1.b1 b1Var) {
        this.f437445d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.l2 l2Var = vi1.l2.f437401a;
        vi1.b1 b1Var = this.f437445d;
        vi1.j2 a17 = l2Var.a(b1Var.f437274b);
        if (a17 != null) {
            vi1.j2 a18 = l2Var.a(b1Var.f437274b);
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437365n) : null;
            kotlin.jvm.internal.o.d(valueOf);
            a17.f437365n = valueOf.longValue() + 1;
        }
        java.lang.String string = b1Var.f437273a.getString(com.tencent.mm.R.string.f490146m7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        b1Var.a(string);
    }
}
