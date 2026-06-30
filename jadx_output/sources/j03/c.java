package j03;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f297027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j03.d f297028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f297029g;

    public c(java.lang.String str, yz5.l lVar, j03.d dVar, long j17) {
        this.f297026d = str;
        this.f297027e = lVar;
        this.f297028f = dVar;
        this.f297029g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f297026d;
        j03.d dVar = this.f297028f;
        yz5.l lVar = this.f297027e;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
            if (r6Var.m() && r6Var.h()) {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var.r(), r6Var.getName() + ".zip");
                kk.x.a(r6Var, false, r6Var2.o());
                if (r6Var2.m() && r6Var2.h()) {
                    com.tencent.mm.app.i3.c(r6Var2.o(), (int) this.f297029g, gm0.j1.b().h(), null, null, new j03.b(dVar, r6Var2, lVar));
                    return;
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Archived file not exists: " + r6Var2.o())))));
                j03.d.a(dVar);
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterUploadPlugin", "Archived file not exists");
                return;
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Target file not exists: " + str)))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6))));
            j03.d.a(dVar);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterUploadPlugin", th6, "Failure.", new java.lang.Object[0]);
        }
    }
}
