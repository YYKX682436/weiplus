package i02;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f286509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f286510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i02.h f286511f;

    public f(i02.h hVar, h02.a aVar, long j17) {
        this.f286511f = hVar;
        this.f286509d = aVar;
        this.f286510e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        h02.a aVar = this.f286509d;
        i02.h hVar = this.f286511f;
        try {
            int i17 = hVar.j().getDownloadTaskState(aVar.field_downloadUrl).mState;
            if (i17 == 1 || i17 == 2) {
                hVar.j().pauseDownloadTask(aVar.field_downloadUrl);
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d ", java.lang.Long.valueOf(this.f286510e));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %s", e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", e17, "", new java.lang.Object[0]);
        }
    }
}
