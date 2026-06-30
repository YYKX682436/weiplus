package re5;

/* loaded from: classes.dex */
public final class n implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ re5.s f394584a;

    public n(re5.s sVar) {
        this.f394584a = sVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        re5.s sVar = this.f394584a;
        dp.a.makeText(sVar.getContext(), sVar.getContext().getString(com.tencent.mm.R.string.jzm, q75.c.c(destPath)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        re5.s sVar = this.f394584a;
        dp.a.makeText(sVar.getContext(), sVar.getContext().getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
