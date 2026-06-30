package y73;

/* loaded from: classes11.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xv.m0 f459729g;

    public j0(y73.d0 d0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, xv.m0 m0Var) {
        this.f459726d = str;
        this.f459727e = str2;
        this.f459728f = str3;
        this.f459729g = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        try {
            java.lang.String apkFilePath = this.f459726d;
            java.lang.String cPatchPath = this.f459727e;
            java.lang.String outPatchFilePath = this.f459728f;
            y73.h0 h0Var = new y73.h0(this);
            kotlin.jvm.internal.o.g(apkFilePath, "apkFilePath");
            kotlin.jvm.internal.o.g(cPatchPath, "cPatchPath");
            kotlin.jvm.internal.o.g(outPatchFilePath, "outPatchFilePath");
            i17 = t95.f.f416590a.a(apkFilePath, cPatchPath, outPatchFilePath, h0Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.SyncResponseProcessor", e17, "", new java.lang.Object[0]);
            i17 = -1;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new y73.i0(this, i17));
    }
}
