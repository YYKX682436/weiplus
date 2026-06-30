package iv1;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f295105d;

    public c(iv1.f fVar) {
        this.f295105d = fVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        iv1.f fVar = this.f295105d;
        if (((java.util.HashSet) fVar.f295113g).size() == 0) {
            return false;
        }
        fv1.c cVar = fVar.f295111e;
        if (cVar != null) {
            try {
                cVar.Vf();
            } catch (android.os.RemoteException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "check process active false");
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(710L, 3L, 1L, false);
                fVar.getClass();
                if (java.lang.System.currentTimeMillis() - fVar.f295110d > u04.d.f423477c) {
                    fVar.f295110d = java.lang.System.currentTimeMillis();
                    java.util.Iterator it = ((java.util.HashSet) fVar.f295113g).iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo) it.next()).f95508q = true;
                    }
                    fVar.d();
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "dead twice in 1 min, something wrong must be happened");
                g0Var.idkeyStat(710L, 4L, 1L, false);
                java.util.Iterator it6 = ((java.util.HashSet) fVar.f295113g).iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.plugin.downloader.model.w) fVar.f295114h).a(((com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo) it6.next()).f95499e, 4, 204, null);
                }
                ((kv1.a) fVar.f295113g).clear();
                mv1.c a17 = mv1.b.a();
                if (a17 != null) {
                    a17.execSQL("CdnDownloadInfo", java.lang.String.format("delete from %s", "CdnDownloadInfo"));
                }
                return false;
            }
        }
        return true;
    }
}
