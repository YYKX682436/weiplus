package wn4;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xv.m0 f447569g;

    public v(java.lang.String str, java.lang.String str2, java.lang.String str3, xv.m0 m0Var) {
        this.f447566d = str;
        this.f447567e = str2;
        this.f447568f = str3;
        this.f447569g = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = -1;
        try {
            java.lang.String apkFilePath = this.f447566d;
            java.lang.String cPatchPath = this.f447567e;
            java.lang.String outPatchFilePath = this.f447568f;
            wn4.t tVar = new wn4.t();
            kotlin.jvm.internal.o.g(apkFilePath, "apkFilePath");
            kotlin.jvm.internal.o.g(cPatchPath, "cPatchPath");
            kotlin.jvm.internal.o.g(outPatchFilePath, "outPatchFilePath");
            f0Var.f310116d = t95.f.f416590a.a(apkFilePath, cPatchPath, outPatchFilePath, tVar);
        } catch (java.lang.Exception e17) {
            wn4.x xVar = wn4.x.f447571a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Updater.ManualUpdaterProcessor", e17, "", new java.lang.Object[0]);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new wn4.u(this.f447569g, f0Var));
    }
}
