package w6;

/* loaded from: classes13.dex */
public class e0 implements w6.p {

    /* renamed from: a, reason: collision with root package name */
    public final y6.a f443093a;

    /* renamed from: b, reason: collision with root package name */
    public volatile y6.c f443094b;

    public e0(y6.a aVar) {
        this.f443093a = aVar;
    }

    public y6.c a() {
        if (this.f443094b == null) {
            synchronized (this) {
                if (this.f443094b == null) {
                    y6.i iVar = (y6.i) this.f443093a;
                    y6.k kVar = (y6.k) iVar.f459593b;
                    java.io.File cacheDir = kVar.f459599a.getCacheDir();
                    y6.j jVar = null;
                    if (cacheDir == null) {
                        cacheDir = null;
                    } else {
                        java.lang.String str = kVar.f459600b;
                        if (str != null) {
                            cacheDir = new java.io.File(cacheDir, str);
                        }
                    }
                    if (cacheDir != null && (cacheDir.mkdirs() || (cacheDir.exists() && cacheDir.isDirectory()))) {
                        jVar = new y6.j(cacheDir, iVar.f459592a);
                    }
                    this.f443094b = jVar;
                }
                if (this.f443094b == null) {
                    this.f443094b = new y6.d();
                }
            }
        }
        return this.f443094b;
    }
}
