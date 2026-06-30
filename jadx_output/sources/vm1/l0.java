package vm1;

/* loaded from: classes10.dex */
public final class l0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438028a;

    public l0(vm1.x0 x0Var) {
        this.f438028a = x0Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        vm1.x0 x0Var = this.f438028a;
        dp.a.makeText(x0Var.a(), x0Var.a().getString(com.tencent.mm.R.string.jzm, q75.c.c(destPath)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        vm1.x0 x0Var = this.f438028a;
        dp.a.makeText(x0Var.a(), x0Var.a().getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
