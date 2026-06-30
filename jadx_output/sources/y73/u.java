package y73;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xv.m0 f459763g;

    public u(y73.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, xv.m0 m0Var) {
        this.f459760d = str;
        this.f459761e = str2;
        this.f459762f = str3;
        this.f459763g = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        try {
            java.lang.String apkFilePath = this.f459760d;
            java.lang.String cPatchPath = this.f459761e;
            java.lang.String outPatchFilePath = this.f459762f;
            y73.s sVar = new y73.s(this);
            kotlin.jvm.internal.o.g(apkFilePath, "apkFilePath");
            kotlin.jvm.internal.o.g(cPatchPath, "cPatchPath");
            kotlin.jvm.internal.o.g(outPatchFilePath, "outPatchFilePath");
            i17 = t95.f.f416590a.a(apkFilePath, cPatchPath, outPatchFilePath, sVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.HotPatchApplyService", e17, "", new java.lang.Object[0]);
            i17 = -1;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new y73.t(this, i17));
    }
}
