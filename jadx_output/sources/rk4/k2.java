package rk4;

/* loaded from: classes.dex */
public final class k2 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396777a;

    public k2(rk4.l3 l3Var) {
        this.f396777a = l3Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        rk4.l3 l3Var = this.f396777a;
        dp.a.makeText(l3Var.a(), l3Var.a().getString(com.tencent.mm.R.string.jzm, q75.c.c(destPath)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        rk4.l3 l3Var = this.f396777a;
        dp.a.makeText(l3Var.a(), l3Var.a().getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
