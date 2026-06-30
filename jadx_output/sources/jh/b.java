package jh;

/* loaded from: classes13.dex */
public class b implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jh.n f299668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jh.c f299669b;

    public b(jh.c cVar, jh.n nVar) {
        this.f299669b = cVar;
        this.f299668a = nVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            jh.c cVar = this.f299669b;
            if (!jh.m.b(cVar.f299672e, absolutePath, 0) && (absolutePath.endsWith(".so") || absolutePath.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX) || absolutePath.endsWith(".oat") || absolutePath.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX))) {
                oj.j.c("Matrix.WarmUpDelegate", "Warming up so %s", absolutePath);
                if (!this.f299668a.a(absolutePath, 0)) {
                    cVar.f299672e.getClass();
                    jh.p pVar = jh.m.f299724h;
                    if (pVar != null) {
                        ((com.tencent.mm.plugin.performance.diagnostic.c) pVar).a(jh.o.WarmUpFailed, absolutePath, 0);
                    }
                }
            }
        }
        return false;
    }
}
